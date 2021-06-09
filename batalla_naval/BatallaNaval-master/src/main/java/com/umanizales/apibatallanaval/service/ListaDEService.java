package com.umanizales.apibatallanaval.service;

import com.umanizales.apibatallanaval.model.ListaDE;
import com.umanizales.apibatallanaval.model.NodoDE;
import com.umanizales.apibatallanaval.model.dto.DistribucionBarcoDTO;
import com.umanizales.apibatallanaval.model.dto.RespuestaDTO;
import com.umanizales.apibatallanaval.repository.BarcoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListaDEService {
    private ListaDE listaBarcos;
    private ListaDE listaDE;

    private BarcoRepository barcoRepository;

    @Autowired
    public ListaDEService(BarcoRepository barcoRepository) {
        this.barcoRepository = barcoRepository;
    }

    public ListaDEService() {
        listaBarcos = new ListaDE();
    }

    public ResponseEntity<Object> adicionarDistribucionBarco(DistribucionBarcoDTO distribucion) {
        listaBarcos.adicionarNodo(distribucion);
        return new ResponseEntity<>(new RespuestaDTO("Exitoso", "Barco adicionado"
                , null), HttpStatus.OK);
    }

    public ResponseEntity<Object> visualizarListaDE()
    {
        return new ResponseEntity<>(new RespuestaDTO("Exitoso", listarDatos()
                ,null), HttpStatus.OK);
    }

    private List<DistribucionBarcoDTO> listarDatos()
    {
        List<DistribucionBarcoDTO> listado = new ArrayList<>();
        //Ciclo para recorrer mi lista de de principio a fin
        NodoDE temp = listaBarcos.getCabeza();
        while(temp!=null)
        {
            listado.add((DistribucionBarcoDTO) temp.getDato());
            temp= temp.getSiguiente();
        }
        return listado;
    }

    //    public Barco encontrarBarcoxid(String id)
//    {
//        return (Barco) this.listaDE.encontrarDatoxid(id);
//    }
    public ResponseEntity<Object> barcoPorCasillas(short codeCasillas) {
        return new ResponseEntity<>(new RespuestaDTO("Exitoso",
                barcoRepository.encontrarBarcoPorNumeroCasillas(codeCasillas), null), HttpStatus.OK);
    }

}
