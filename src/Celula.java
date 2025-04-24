public class Celula {

    private Celula anterior;
    private Celula proximo;
    private Professor dado;

    public Celula() {
    }

    public Celula(Celula anterior, Celula proximo, Professor dado) {
        this.anterior = anterior;
        this.proximo = proximo;
        this.dado = dado;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Professor getDado() {
        return dado;
    }

    public void setDado(Professor dado) {
        this.dado = dado;
    }
}
