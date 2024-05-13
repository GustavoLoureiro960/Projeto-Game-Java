//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package GameJavaProject;

import java.util.Scanner;

public class Game {
    static Scanner teclado = new Scanner(System.in);

    static int pontos = 0;

    static Calcular calc;


    public static void main(String[] args) {Game.jogar();}

    public static void jogar() {
        System.out.println("Informe o nível de dificuldade desejado [1 - fácil, 2 - médio," +
                " 3 - difícil, 4 - mais difícil, 5 - super difícil]");

        int dificuldade = Game.teclado.nextInt();

        Game.calc = new Calcular(dificuldade);

        System.out.println("Informe o resultado correto para seguinte operação: ");

        //Somar
        if (calc.getOperacoes() == 0) {
            System.out.println(calc.getValor1() + " + " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calc.somar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }
        //Subtrair
        else if (calc.getOperacoes() == 1) {
            System.out.println(calc.getValor1() + " - " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calc.subtrair(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        }
        //Multiplicar
        else if (calc.getOperacoes() == 2) {
            System.out.println(calc.getValor1() + " * " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if (calc.multiplicar(resposta)) {
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s).");
            }
        } else {
            System.out.println("A operação " + calc.getOperacoes() + " não é reconhecida.");
        }
        System.out.println("Deseja continuar? [1 - sim ou 0 - não]");
        int continuar = Game.teclado.nextInt();

        if (continuar == 1) {
            Game.jogar();
        } else {
            System.out.println("Você fez " + pontos + " pontos");
            System.out.println("Obrigado por jogar, até a próxima!");
            System.exit(0);
        }
    }
}