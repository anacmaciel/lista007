import java.util.Scanner;

public class MainPais {

    public static void menu() {
        System.out.println("1. Para adicionar um país a lista de países vizinhos");
        System.out.println("2. Para ver se o país está na lista de países vizinhos");
        System.out.println("3. Para exibir a lista de países");
        System.out.println("4. Para sair");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a opção desejada");
        menu();
        boolean sair;
        Pais pais = new Pais();
        while (sair = true) {
            int opcaoUsuario = scan.nextInt();
            switch (opcaoUsuario) {
                case 1:
                    pais.adicionarPaiscomFronteira();
                    break;
                case 2:
                    pais.fazFronteira();
                case 3:
                    pais.exibirLista();
                case 4:
                    sair = false;
                    System.out.println("Fim do programa");
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}

