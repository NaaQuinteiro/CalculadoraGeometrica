import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome_usuario;
        int menuTipo;
        int menuFormas;
        int valor;

        // parametros figuras planas


        // parametros figuras espaciais
        double ladoCubo, comprimentoPa, alturaPa, larguraPa, raioEsfe, arestaBasePir, apotemaPir, alturaPir,
                raioCili, alturaCone, raioCone, areaBase, alturaCil, raioCil;


        System.out.println("BEM VINDO A CALCULADORA GEOMÉTRICA!" +
                " \nInsira o seu nome:");
        nome_usuario = ler.nextLine();

        System.out.print("Digite um número inteiro, para  decidir a forma de apresentação: ");
        valor = Integer.parseInt(ler.nextLine());

        while (true) {
            try {
                System.out.println(nome_usuario + ", escolha qual tipo de figura deseja:\n1 - Figuras Planas\n2 - Figuras Especiais\n0 - Sair");
                menuTipo = Integer.parseInt(ler.nextLine());

                switch (menuTipo) {
                    // figuras planas
                    case 1:
                        while (true) {
                            try {
                                System.out.println(nome_usuario + ", você escolheu Figuras Planas, insira qual delas você deseja ver:" +
                                        "\n1 - Quadrado" +
                                        "\n2 - Retângulo" +
                                        "\n3 - Triângulo Equilátero" +
                                        "\n4 - Círculo" +
                                        "\n5 - Hexágono Regular");
                                menuFormas = Integer.parseInt(ler.nextLine());

                                if (menuFormas <=0 || menuFormas> 5){
                                    System.out.println("Opção Inválida, tente novamente.");
                                    continue;
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println("Opção Inválida, tente novamente.");

                            }
                        }

                        switch (menuFormas) {
                            //Quadrado
                            case 1:
                                while (true) {
                                    try {
                                        double ladoQuadrado;
                                        System.out.println("Insira o lado do quadrado:");
                                        ladoQuadrado = Double.parseDouble(ler.nextLine());

                                        if (ladoQuadrado > 0) {
                                            Quadrado quadrado = new Quadrado(ladoQuadrado);
                                            quadrado.calcularAreaQuadrado();
                                            quadrado.calcularPerimetroQuadrado();

                                            System.out.println(quadrado.retornaResumoDoQuadrado(valor));

                                        } else {
                                            System.out.println("Insira um número maior que 0");
                                            continue;
                                        }
                                        break;

                                    } catch (Exception e) {
                                        System.out.println("Opção inválida, tente novamente!");
                                    }
                                }
                                continue;

                            //Retangulo
                            case 2:
                                while (true) {
                                    try {
                                        double baseRet, alturaRet;
                                        System.out.print("Insira a base do retângulo:");
                                        baseRet = Double.parseDouble(ler.nextLine());

                                        System.out.print("Insira a altura: ");
                                        alturaRet = Double.parseDouble(ler.nextLine());

                                        if (baseRet > 0 && alturaRet > 0) {
                                            Retangulo retangulo = new Retangulo(baseRet, alturaRet);
                                            System.out.println(retangulo.retornaResumoDoRetangulo(valor));

                                        } else {
                                            System.out.println("Insira um número maior que 0");
                                            continue;
                                        }
                                        break;

                                    } catch (Exception e) {
                                        System.out.println("Opção inválida, tente novamente!");
                                    }
                                }
                                continue;

                            //Triângulo
                            case 3:

                                while (true) {
                                    try {
                                        double ladoTri;
                                        System.out.println("Insira o lado do triângulo:");
                                        ladoTri = Double.parseDouble(ler.nextLine());

                                        if (ladoTri > 0) {
                                            TrianguloEquilatero triangulo = new TrianguloEquilatero(ladoTri);
                                            System.out.println(triangulo.retornaResumoDoTriangulo(valor));

                                        } else {
                                            System.out.println("Insira um número maior que 0");
                                            continue;
                                        }
                                        break;

                                    } catch (Exception e) {
                                        System.out.println("Opção inválida, tente novamente!");
                                    }
                                }
                                continue;

                            //Circulo
                            case 4:
                                while (true){
                                    try {
                                        double raioCir;
                                        System.out.println("Insira o valor do raio do círculo:");
                                        raioCir = Double.parseDouble(ler.nextLine());

                                        if (raioCir > 0) {
                                            Circulo circulo = new Circulo(raioCir);
                                            System.out.println(circulo.retornaResumoDoCirculo(valor));

                                        } else {
                                            System.out.println("Insira um número maior que 0");
                                            continue;
                                        }
                                        break;


                                    }catch (Exception e){
                                        System.out.println("Opção inválida, tente novamente!");
                                    }
                                }
                                continue;

                            //Hexágono
                            case 5:

                                while (true){
                                    try {
                                        double raioHex;
                                        System.out.println("Insira o lado do hexágono:");
                                        raioHex = Double.parseDouble(ler.nextLine());

                                        if (raioHex > 0) {
                                            HexagonoRegular hexagono = new HexagonoRegular(raioHex);
                                            System.out.println(hexagono.retornaResumoDoHexagono(valor));
                                        } else {
                                            System.out.println("Insira um número maior que 0");
                                            continue;
                                        }
                                        break;
                                    }catch (Exception e){
                                        System.out.println("Opção inválida, tente novamente!");
                                    }
                                } continue;

                            default:
                                System.out.println("Opção inválida, tente novamente.");
                                continue;
                        }



                    // Formas espaciais
                    case 2:
                        while (true){
                            try{
                                System.out.println(nome_usuario + ", você escolheu Figuras Espaciais, insira qual delas você deseja ver:" +
                                        "\n1 - Cubo" +
                                        "\n2 - Paralelepípedo" +
                                        "\n3 - Esfera" +
                                        "\n4 - Pirâmide de base quadrada" +
                                        "\n5 - Cilíndro" +
                                        "\n6 - Cone");
                                menuFormas = Integer.parseInt(ler.nextLine());

                                if (menuFormas <=0 || menuFormas> 5){
                                    System.out.println("Opção Inválida, tente novamente.");
                                    continue;
                                }
                                break;
                            }catch (Exception e){
                                System.out.println("Opção Inválida, tente novamente.");
                            }
                        }

                        switch (menuFormas) {

                            //Cubo
                            case 1:
                                System.out.println("Insira o lado do Cubo:");
                                ladoCubo = Double.parseDouble(ler.nextLine());

                                if (ladoCubo > 0) {
                                    Cubo cubo = new Cubo(ladoCubo);
                                    System.out.println(cubo.retornaResumoDoCubo(valor));
                                } else {
                                    System.out.println("Insira um número maior que 0");
                                }
                                break;

                            //Paralelepípedo
                            case 2:
                                System.out.println("Insira a altura do paralelepípedo: ");
                                alturaPa = Double.parseDouble(ler.nextLine());

                                System.out.println("Insira o comprimento do paralelepípedo: ");
                                comprimentoPa = Double.parseDouble(ler.nextLine());

                                System.out.println("Insira a largura do paralelepípedo: ");
                                larguraPa = Double.parseDouble(ler.nextLine());

                                if (alturaPa > 0 && larguraPa > 0 && comprimentoPa > 0) {
                                    Paralelepipedo paralelepipedo = new Paralelepipedo(comprimentoPa, alturaPa, larguraPa);
                                    System.out.println(paralelepipedo.retornaResumoDoParalelepipedo(valor));
                                } else {
                                    System.out.println("Insira um número maior que 0");
                                }
                                break;

                            //Esfera
                            case 3:
                                System.out.println("Insira o raio da esfera:");
                                raioEsfe = Double.parseDouble(ler.nextLine());

                                if (raioEsfe > 0) {
                                    Esfera esfera = new Esfera(raioEsfe);
                                    System.out.println(esfera.retornaResumoDaEsfera(valor));
                                } else {
                                    System.out.println("Insira um número maior que 0");
                                }
                                break;

                            //Piramide
                            case 4:

                                System.out.println("Insira a aresta da base da Pirâmide: ");
                                arestaBasePir = Double.parseDouble(ler.nextLine());

                                System.out.println("Insira a apótema da Pirâmide: ");
                                apotemaPir = Double.parseDouble(ler.nextLine());

                                System.out.println("Insira a Altura da Pirâmide: ");
                                alturaPir = Double.parseDouble(ler.nextLine());

                                System.out.println("Insira a área da base da Pirâmide: ");
                                areaBase = Double.parseDouble(ler.nextLine());

                                if (arestaBasePir > 0 && apotemaPir > 0 && areaBase > 0) {
                                    PiramideBaseQuadrada piramide = new PiramideBaseQuadrada(arestaBasePir, apotemaPir,
                                            alturaPir, areaBase);
                                    System.out.println(piramide.retornaResumoDaPiramide(valor));
                                } else {
                                    System.out.println("Insira um número maior que 0");
                                }
                                break;

                            //Cilindro
                            case 5:
                                System.out.println("Insira a altura do Cilíndro: ");
                                alturaCil = Double.parseDouble(ler.nextLine());

                                System.out.println("Insira o raio do Cilíndro: ");
                                raioCili = Double.parseDouble(ler.nextLine());

                                if (alturaCil > 0 && raioCili > 0) {
                                    Cilindro cilindro = new Cilindro(alturaCil, raioCili);
                                    System.out.println(cilindro.retornaResumoDoCilindro(valor));
                                } else {
                                    System.out.println("Insira um número maior que 0");
                                }
                                break;

                            //Cone
                            case 6:
                                System.out.println("Insira a altura do Cilíndro: ");
                                alturaCone = Double.parseDouble(ler.nextLine());

                                System.out.println("Insira a altura do Cilíndro: ");
                                raioCone = Double.parseDouble(ler.nextLine());

                                if (alturaCone > 0 && raioCone > 0) {
                                    Cone cone = new Cone(alturaCone, raioCone);
                                    System.out.println(cone.retornaResumoDoCone(valor));
                                } else {
                                    System.out.println("Insira um número maior que 0");
                                }
                                break;

                            default:
                                System.out.println("Opção inválida, tente novamente.");
                        }
                    case 0:
                        System.out.println("Tchau");
                        return;

                    default:
                        System.out.println("Opção invál.");
                }
            } catch (Exception e) {
                System.out.println("Opção inválida, tente novamente!");
            }
        }


    }
}
