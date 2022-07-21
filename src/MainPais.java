
public class MainPais {

    public static void main(String[] args) {
        Pais paisA = new Pais("bra", "brasil", 10000, 5000);
        Pais paisB = new Pais("mx", "méxico", 9000, 4000);
        Pais paisC = new Pais("USA", "Estados unidos", 8000, 3000);
                    paisB.adicionarPaiscomFronteira(PaisA);
                    paisB.fazFronteira(paisA);
                    paisB.exibirLista();
    }
}

