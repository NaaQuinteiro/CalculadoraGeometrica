public class Cubo {
    double lado;

    //Contrutor
    public Cubo(double lado) {
        this.lado = lado;
    }

    //Método para clacular o volume
    double calcularVolumeCubo(){
        return Math.pow(this.lado,3);
    }

    //Método para calcular área superficial
    double calcalcularAreaCubo(){
        return Math.pow(this.lado, 3) * 6;
    }

    //Metodo para retornar em String
    String retornaResumoDoCone(int valor){

        String resumo = String.format("Resumo Cubo\nLado: %.2f\nÁrea Superfícial: %.2f\nVolume: %.2f",
                this.lado, this.calcalcularAreaCubo(), this.calcularVolumeCubo());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
