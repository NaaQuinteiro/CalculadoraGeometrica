import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome_usuario;
        int menuTipo;
        int menuFormas;

        nome_usuario = JOptionPane.showInputDialog(null,"BEM VINDO A CALCULADORA GEOMÉTRICA!\n" +
                " \nInsira o seu nome:");

        System.out.println(nome_usuario + ", escolha qual tipo de figura deseja:\n1 - Figuras Planas\n2 - Figuras Especiais");
        menuTipo = ler.nextInt();

        switch (menuTipo){
            case 1:
                System.out.println(nome_usuario + ", você escolheu Figuras Planas, insira qual delas você deseja ver:" +
                        "\n1 - Quadrado" +
                        "\n2 - Retângulo" +
                        "\n3 - Triângulo Equilátero" +
                        "\n4 - Círculo" +
                        "\n5 - Hexágono Regular");
                menuFormas = ler.nextInt();

                switch (menuFormas){
                    case 1:
                        double lado;
                        System.out.print("Insira o lado do quadrado: ");
                        lado = ler.nextDouble();
                        if (lado > 0){
                            Quadrado quadrado = new Quadrado(lado);
                            quadrado.calcularAreaQuadrado();
                            quadrado.calcularPerimetroQuadrado();

                            int valor;
                            System.out.print("Digite um número inteiro, para  decidir a forma de apresentação: ");
                            valor = ler.nextInt();

                            System.out.println(quadrado.retornaResumoDoQuadrado(valor));

                        }
                        else{
                            System.out.println("Insira um numero maior que 0.");
                        }



                }

        }
    }

}
