package main;

public class TesteCalculadora {

    /**
     * @author Edson
     * 
     * 
     * @param args parametro padão para rodar uma classe main
     * Essa classe serve para o teste da classe calculadora, e printa na tela o resultado dos teste
     * 
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3,"+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0,"/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
