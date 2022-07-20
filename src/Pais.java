import java.util.ArrayList;
import java.util.List;

public class Pais       {
     private String codigoIso;
     private  String nome;
     private int populacao;
     private double dimensao;
List <Pais> listaDePaisesComFronteira = new ArrayList<>();

     Scanner input = new Scanner();


     public Pais(String codigoIso, String nome, int populacao, double dimensao) {
          this.codigoIso = codigoIso;
          this.nome = nome;
          this.populacao = populacao;
          this.dimensao= dimensao;
     }




     public void adicionarPaiscomFronteira(Pais p) {
          System.out.println("digite um país e tecle enter");
          String nome = input.next();
          System.out.println("Digite o código ISO do país");
          String codigoIso = input.next();

          System.out.println("Digite a população do país");
          int populacao = input.nextInt();
          System.out.println("Digite a dimensão do país");
          double dimensao = input.nextDouble();
          System.out.println("Dados inseridos com sucesso!");

          Pais novoPais = new Pais(nome, codigoIso, populacao, dimensao);
          listaDePaisesComFronteira.add(novoPais);

     }

     public void fazFronteira(Pais p) {
          if (listaDePaisesComFronteira.contains(p.getNome())) {
               System.out.println(p.getNome() + " faz fronteira com " + this.getNome());

          } else {
               System.out.println(p.getNome() + " não faz fronteira com " + this.getNome());
          }
     }

     public void exibirLista() {
          for (int i = 0; i < listaDePaisesComFronteira.size(); i ++) {
               System.out.println("Nome do país: " + listaDePaisesComFronteira.get(i).getNome() + " código ISO: " + listaDePaisesComFronteira.get(i).getCodigoIso() + " população: " + listaDePaisesComFronteira.get(i).getPopulacao() + " dimensão: " + listaDePaisesComFronteira.get(i).getDimensao());
          }
     }

     public  double calcularDencidade() {
          return  populacao / dimensao;
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

}

