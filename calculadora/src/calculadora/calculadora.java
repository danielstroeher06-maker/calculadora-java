package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int op = -1;
        String[] historico = new String[5];
        int cont = 0;
        while (op != 0) {
            System.out.println();
            System.out.println("===  CALCULADORA ===");
            System.out.println("1. SOMA");
            System.out.println("2. SUBTAÇÃO");
            System.out.println("3. MULTIPLICAÇÃO");
            System.out.println("4. DIVISÃO");
            System.out.println("5. POTÊNCIA");
            System.out.println("6. RAIZ QUADRADA");
            System.out.println("7. PORCENTAGEM");
            System.out.println("8. FUNÇÕES CIENTIFICAS");
            System.out.println("9. VER HISTÓRICO");
            System.out.println("0. SAIR");
            System.out.println();
            System.out.print("Escolha uma operação: ");
            try{
                op = in.nextInt();
            }catch (Exception e){
            System.out.println("digite apenas números inteiros!");
            in.nextLine();
            continue;
            }

            if (op < 0 || op > 9) {
                System.out.println("Opção invalida!");
                System.out.println();
                continue;
            }
            if (op == 0) {
                System.out.println("Saindo .......");
                System.out.println();
            } else if (op == 9) {
                System.out.println("");
                System.out.println("  === HISTÓRICO === ");
                System.out.println();
                if (cont == 0) {
                    System.out.println("Historico vazio!");
                    System.out.println();
                } else {
                    for (int i = 0; i < cont; i++) {
                        System.out.println((i + 1) + ". " + historico[i]);
                    }
                }
            } else {
                System.out.print("Digite o primeiro numero: ");
                String operacao = "";
                double num1 = in.nextDouble();
                if (op == 6) {
                    if (num1 < 0) {
                        System.out.println("Erro: não existe raiz quadrada de numero negativo.");
                    } else {
                        double resultado2 = (Math.sqrt(num1));
                        operacao = "√" + num1 + "=" + resultado2;
                    }
                } else {
                    System.out.print("Digite o segundo numero: ");
                    double num2 = in.nextDouble();

                    double resultado = 0;

                    if (op == 1) {
                        resultado = num1 + num2;
                        operacao = num1 + " + " + num2 + " = " + resultado;
                        System.out.println();
                    } else if (op == 2) {
                        resultado = num1 - num2;
                        operacao = num1 + " - " + num2 + " = " + resultado;
                        System.out.println();
                    } else if (op == 3) {
                        resultado = num1 * num2;
                        operacao = num1 + " x " + num2 + " = " + resultado;
                        System.out.println();
                    } else if (op == 4) {
                        if (num2 == 0) {
                            System.out.println("Erro: não é possível dividir por zero ");
                            operacao = "divisão por 0 tentada!";
                        } else {
                            resultado = num1 / num2;
                            operacao = num1 + " / " + num2 + " = " + resultado;
                            System.out.println();
                        }
                    } else if (op == 5) {
                        resultado = (Math.pow(num1, num2));
                        operacao = num1 + " ^ " + num2 + " = " + resultado;
                        System.out.println();
                    } else if (op == 7) {
                        int subop=0;
                        System.out.println("=== PORCENTAGEM === ");
                        System.out.println("1. Calcular x% de um numero ");
                        System.out.println("2. Quanto é % X representa de Y ");
                        System.out.println(" ");
                        System.out.println("Escolha: ");
                        subop = in.nextInt();
                        if (subop == 1) {
                            resultado = (num1/100)*num2;
                            operacao = num1 + " % de " + num2 + " = " + resultado;
                            System.out.println();
                        }else if (subop == 2) {
                            resultado = (num1/num2)*100;
                            operacao = num1 + " é quanto % de " + num2 + " = " + resultado;
                            System.out.println();
                        }
                    }else if (op == 8) {
                        int subop=0;

                    }

                    else {
                        System.out.println("Opção invalida!");
                    }
                }
                if (!operacao.isEmpty()) {
                    System.out.println(operacao);

                    if (cont<historico.length) {
                        historico[cont] = operacao;
                        cont++;
                    }else {
                        for (int i = 0; i < historico.length - 1; i++) {
                            historico[i] = historico[i + 1];
                        }
                        historico[historico.length-1] = operacao;
                    }

                }
            }
        }
        in.close();
    }
}
