public class Pais       {
     private String codigoIso;
     private  String nome;
     private int populacao;
     private double dimensao;

     public Pais(String codigoIso, String nome, int populacao, double dimensao) {
          this.codigoIso = codigoIso;
          this.nome = nome;
          this.populacao = populacao;
          this.dimensao= dimensao;
     }

     public String getCodigoIso() {
                    return codigoIso;
     }

     public void setCodigoIso(String codigoIso) {
          this.codigoIso = codigoIso;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public int getPopulacao() {
          return populacao;
     }

     public void setPopulacao(int populacao) {
          this.populacao = populacao;
     }

     public double getDimensao() {
          return dimensao;
     }

     public void setDimensao(double dimensao) {
          this.dimensao = dimensao;
     }

     public void adicionarPaiscomFronteira(Pais p) {
          listaDePaisesComFronteira.add(p);
     }

     public void fazFronteira(Pais p) {
          if (listaDePaisesComFronteira.contains(p.getNome())) {
               System.out.println(p.getNome() + " faz fronteira com " + this.getNome());

          } else {
               System.out.println(p.getNome() + " não faz fronteira com " + this.getNome());
          }
     }

          public  double calcularDencidade() {
               return  populacao / dimensao;
          }

}

