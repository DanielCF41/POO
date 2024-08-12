package engtelecom.poo.pt2.exceptions;

import engtelecom.poo.pt2.Persistencia;

import java.util.ArrayList;
import java.util.Collection;

public class PersistenciaMemoria<E> implements Persistencia {
    private Collection<E> colecao;

    public PersistenciaMemoria() {
        this.colecao = new ArrayList<>(5);
    }

    @Override
    public void salvarObjeto(Object o) {

    }

    @Override
    public void carregarObjeto(Object o) {

    }

    @Override
    public void apagarObjeto(Object o) {

    }
}
