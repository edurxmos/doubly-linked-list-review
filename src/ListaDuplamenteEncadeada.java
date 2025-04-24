public class ListaDuplamenteEncadeada {

    private Celula inicio;
    private Celula fim;

    public void inserirInicio(Professor dado) {
        Celula celula = new Celula();
        celula.setDado(dado);
        if (inicio == null) {
            inicio = celula;
            fim = celula;
        } else {
            celula.setProximo(inicio);
            inicio.setAnterior(celula);
            inicio = celula;
        }
    }

    public void inserirFim(Professor dado) {
        Celula celula = new Celula();
        celula.setDado(dado);

        if (inicio == null) {
            inicio = celula;
            fim = celula;
        } else {
            celula.setAnterior(fim);
            fim.setProximo(celula);
            fim = celula;
        }
    }

    public void removerInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            Celula atual = inicio.getProximo();
            atual.setAnterior(null);
            inicio.setProximo(null);
            inicio = atual;
        }
    }

    public void removerFim() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            Celula atual = fim.getAnterior();
            atual.setProximo(null);
            fim.setAnterior(null);
            fim = atual;
        }
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        Celula atual = inicio;
        while (atual != null) {
            System.out.println(atual.getDado().getNome());
            atual = atual.getProximo();
        }
    }

}
