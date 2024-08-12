package engtelecom.poo.pt2;

import engtelecom.poo.pt2.exceptions.ArquivoNaoEcontradoException;
import engtelecom.poo.pt2.exceptions.MemoriaInsuficienteException;

public interface Persistencia<E> {
    public void salvarObjeto(E o) throws MemoriaInsuficienteException;
    public void carregarObjeto(E o) throws ArquivoNaoEcontradoException;
    public void apagarObjeto(E o) throws ArquivoNaoEcontradoException;
}
