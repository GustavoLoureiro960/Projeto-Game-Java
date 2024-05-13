package GameJavaProject;

import java.util.Random;

public class Calcular {
    private final int dificuldade;
    private int valor1;
    private int valor2;
    private final int operacoes;
    private int resultado;

    public  Calcular(int dificuldade){
        Random rand = new Random();

        this.operacoes = rand.nextInt(3); // 0 - somar, 1 - subtrair, 2 - multiplicar
        this.dificuldade = dificuldade;

        if(dificuldade == 1) {
            this.valor1 = rand.nextInt(11); // de 0 a 10
            this.valor2 = rand.nextInt(11); // de 0 a 10
        } else if (dificuldade == 2) {
            this.valor1 = rand.nextInt(26); // de 0 a 25
            this.valor2 = rand.nextInt(26); // de 0 a 25
        } else if (dificuldade == 3) {
            this.valor1 = rand.nextInt(51); // de 0 a 50
            this.valor2 = rand.nextInt(51); // de 0 a 50
        } else if (dificuldade == 4) {
            this.valor1 = rand.nextInt(101); // de 0 a 100
            this.valor2 = rand.nextInt(101); // de 0 a 100
        } else if (dificuldade >= 5) {
            this.valor1 = rand.nextInt(151); // de 0 a 151
            this.valor2 = rand.nextInt(151); // de 0 a 151
        }
    }

    public int getDificuldade(){
        return dificuldade;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2(){
        return valor2;
    }

    public int getOperacoes(){
        return operacoes;
    }

    public int getResultado(){
        return resultado;
    }

    public String toString(){
        String op;
        if(this.getOperacoes() == 0){
            op = "Somar";
        } else if (this.getOperacoes() == 1) {
            op = "Subtrair";
        } else if (this.getOperacoes() == 2) {
            op = "Multiplicar";
        } else {
            op = "Operação desconhecida";
        }
        return "Valor 1: " + this.getValor1() + "Valor 2: " + this.getValor2()
                + "Dificuldade: " + this.getDificuldade() + "Operação: " + op;
    }

    public boolean somar(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            certo = true;
        }else{
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " + " + " = " + this.getResultado());
        return certo;
    }

    public boolean subtrair(int resposta){
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;
        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            certo = true;
        }else{
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " - " + " = " + this.getResultado());
        return certo;
    }
    public boolean multiplicar(int resposta){
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;
        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            certo = true;
        }else{
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " * " + " = " + this.getResultado());
        return certo;
    }
}
