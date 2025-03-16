import java.util.Scanner;

public class financeiro {
    private String curso;
    private double divida;

    public financeiro(String curso, double divida) {
        this.curso = curso;
        this.divida = divida;
    }

    public void pagarParcela(double valor) {
        if (divida > 0) {
            divida -= valor;
            if (divida < 0) divida = 0;
            System.out.println("Pagamento realizado! Dívida restante: R$ " + divida);
        } else {
            System.out.println("Você não tem dívida pendente.");
        }
    }

    public void exibirDados() {
        System.out.println("Curso: " + curso);
        System.out.println("Dívida Atual: R$ " + divida);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite a dívida: ");
        double divida = scanner.nextDouble();

        financeiro financeiro = new financeiro(curso, divida);

        financeiro.exibirDados();

        System.out.print("Deseja pagar R$ 200? (s/n): ");
        String opcao = scanner.next();

        if (opcao.equalsIgnoreCase("s")) {
            financeiro.pagarParcela(200);
        }

        financeiro.exibirDados();
        scanner.close();
    }
}
