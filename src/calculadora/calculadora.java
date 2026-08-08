import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("===  CALCULADORA ===");
        System.out.println("1. SOMA");
        System.out.println("2. SUBTAÇÃO");
        System.out.println("3. MULTIPLICAÇÃO");
        System.out.println("4. DIVISÃO");
        System.out.println("0. SAIR");
        int op = -1;
        while (op != 0) {
            Scanner in = new Scanner(System.in);
            System.out.print("Escolha uma operação: ");
            op = in.nextInt();
            if (op == 0) {
                System.out.println("Saindo .......");
            }else {
                System.out.print("Digite o primeiro numero: ");
                int num1 = in.nextInt();
                System.out.print("Digite o segundo numero: ");
                int num2 = in.nextInt();
                int soma = 0;
                int sub = 0;
                int multi = 0;
                double div = 0;
                if (op == 1) {
                    soma = num1 + num2;
                    System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
                } else if (op == 2) {
                    sub = num1 - num2;
                    System.out.println("Subtração:  " + num1 + " - " + num2 + " = " + sub);
                } else if (op == 3) {
                    multi = num1 * num2;
                    System.out.println("Multiplicação: " + num1 + " x " + num2 + " = " + multi);
                } else if (op == 4) {
                    div = (double) num1 / num2;
                    System.out.println("Divisão: " + num1 + " / " + num2 + " = " + div);
                } else {
                    System.out.println("Opção invalida!");
                }
            }
        }
    }
}
