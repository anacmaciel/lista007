
import java.util.HashSet;
import java.util.Set;

public class MainPais {

    public static void listarPaises(Pais p) {
        for(int i = 0; i < listaDePaisesComFronteira.size(); i++) {



        }

    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 10000, 5000.0);

        Pais estadosUnidos = new Pais("USA", "Estados Unidos da América", 8000, 4000.0);

        Pais mexico = new Pais("MX", "México",  7000, 3000.0);

        Pais canada = new Pais("CA", "Canadá", 6000, 2000.0);

        Set<Pais> listaDePaisesComFronteira = new HashSet<Pais>();


        estadosUnidos.adicionarPaiscomFronteira(mexico);

        estadosUnidos.adicionarPaiscomFronteira(canada);

        mexico.adicionarPaiscomFronteira(estadosUnidos);
        mexico.adicionarPaiscomFronteira(canada);

        canada.adicionarPaiscomFronteira(estadosUnidos);
        canada.adicionarPaiscomFronteira(mexico);
        }


    }
}


