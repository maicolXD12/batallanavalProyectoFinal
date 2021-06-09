package com.umanizales.apibatallanaval.controller;

import com.umanizales.apibatallanaval.model.ListaDE;
import com.umanizales.apibatallanaval.model.dto.DistribucionBarcoDTO;
import com.umanizales.apibatallanaval.model.entities.Barco;
import com.umanizales.apibatallanaval.service.ListaDEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "listabarcos")
public class ListaDEController {
    private ListaDEService listaDEService;
    private ListaDE listaDE;


    @Autowired
    public ListaDEController(ListaDEService listaDEService) {
        this.listaDEService = listaDEService;
    }

    @GetMapping
    public @ResponseBody
    ResponseEntity<Object> visualizarLista() {
        return listaDEService.visualizarListaDE();
    }

    @PostMapping
    public @ResponseBody
    ResponseEntity<Object> adicionarDistribucionBarco(@RequestBody Barco barco) {
        DistribucionBarcoDTO distribucion = new DistribucionBarcoDTO(barco);
        return listaDEService.adicionarDistribucionBarco(distribucion);
    }

    @GetMapping(path = "/{id}")
    public Barco encontrarDatoxid(@PathVariable("id") String id) {

        return (Barco) listaDE.encontrarDatoxid(id);
    }

    @GetMapping(path = "{barcoPorCAsillas}")
    public @ResponseBody
    ResponseEntity<Object> barcoPorcodeCasillas(@PathVariable("codeCasillas") short codeCasillas) {
        return listaDEService.barcoPorCasillas(codeCasillas);
    }


}
