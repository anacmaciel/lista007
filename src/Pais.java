import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String codigoIso;
    private String nomePais;
    private double populacao;
    private double dimensao;
    List<Pais> fronteiraDePaises = new ArrayList();

    public Pais(String codigoIso, String nomePais, double populacao, double dimensao, List<Pais> fronteiraDePaises) {
        this.codigoIso = codigoIso;
        this.nomePais = nomePais;
        this.populacao = populacao;
        this.dimensao = dimensao;
        ;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<Pais> getFronteiraDePaises() {
        return fronteiraDePaises;
    }

    public void setFronteiraDePaises(List<Pais> fronteiraDePaises) {
        this.fronteiraDePaises = fronteiraDePaises;
    }

    public void adicionarFronteiraDePaises(Pais pais) {
        fronteiraDePaises.add(pais);
    }

    public boolean fronteiraDePaises(String fronteira) {
        for (int i = 0; I < fronteiraDePaises.size(); i++) {
            if (fronteiraDePaises.get(i).getNomePais().equals(fronteira)) {
                return true;
            }
        }
        return false;
    }


}