public class Quadrado {
    double lado;

    //Contrutor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //Método para clacular a área
    double calcularAreaQuadrado(){

        return Math.pow(this.lado,2);
    }

    //Método para calcular o perímetro
    double calcularPerimetroQuadrado(){

        return (4*this.lado);
    }

    String retornaResumoDoQuadrado(int valor){

        String resumo = String.format("Resumo Quadrado:\nLado: %.2f\nÁrea: %.2f\nPerímetro: %.2f",
                this.lado, this.calcularAreaQuadrado(), this.calcularPerimetroQuadrado());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }


}
