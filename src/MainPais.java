import java.util.Scanner;

public class MainPais {

    public static void menu() {
        System.out.println("1. Para adicionar um país a lista de países vizinhos");
        System.out.println("2. Para confirmar se o país é vizinho do país digitado.");
        System.out.println("3. Para exibir a lista de países");
        System.out.println("4. Para sair");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a opção desejada");
        boolean executar = true;
        Pais paisA = new Pais("bra", "brasil", 10000, 5000);
        Pais paisB = new Pais("mx", "méxico", 9000, 4000);
        Pais paisC = new Pais("USA", "Estados unidos", 8000, 3000);
        while (executar) {
            menu();
            int opcaoUsuario = scan.nextInt();
            switch (opcaoUsuario) {
                case 1:
                    paisB.adicionarPaiscomFronteira();
                    break;
                case 2:
                    paisB.fazFronteira(paisA);
                case 3:
                    paisB.exibirLista();
                case 4:
                    executar = false;
                    System.out.println("Fim do programa");
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}

