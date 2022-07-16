public class MainPais {
cd docu      public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 10000, 5000.0);
        Pais estadosUnidos = new Pais("USA", "Estados Unidos da América", 8000, 4000.0);

        Pais mexico = new Pais("MX", "México",  7000, 3000.0);

        Pais canada = new Pais("CA", "Canadá", 6000, 2000.0);

        estadosUnidos.adicionarPaiscomFronteira(mexico);

        estadosUnidos.adicionarPaiscomFronteira(canada);

        mexico.adicionarPaiscomFronteira(estadosUnidos);
        mexico.adicionarPaiscomFronteira(canada);

        canada.adicionarPaiscomFronteira(estadosUnidos);
        canada.adicionarPaiscomFronteira(mexico);

        public static void listarPaises(Pais p) {
            for(Pais individual::p.getListaDePaisesComFronteira()) {

                System.out.println(individual.getNome());
            }
        }


    }
}


