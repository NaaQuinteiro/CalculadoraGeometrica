public class HexagonoRegular {
    double lado;

    //Contrutor


    public HexagonoRegular(double lado) {
        this.lado = lado;
    }

    //Método para calcular a área
    double calcalcularAreaHexagono(){
        return 6 * this.lado * (Math.sqrt(3)/2);
    }

    //Método para calcular o perimetro
    double calcularPerimetroHexagono(){
        return this.lado * 6;
    }

    //Metodo para retornar em String
    String retornaResumoDoHexagono(int valor){

        String resumo = String.format("Resumo Hexagono Regular\nLado: %.2f\nÁrea Superfícial: %.2f\nPerímetro: %.2f",
                this.lado, this.calcalcularAreaHexagono(), this.calcularPerimetroHexagono());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
