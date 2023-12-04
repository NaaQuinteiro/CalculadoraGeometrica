public class PiramideBaseQuadrada {

    double arestaBase;
    double apotema;
    double altura;
    double areaBase;

    //Construtor
    public PiramideBaseQuadrada(double arestaBase, double apotema, double altura, double areaBase) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
        this.areaBase = areaBase;
    }

    //Método para clacular o volume
    double calcularVolumePiramide(){
        return (this.areaBase * this.altura)/3;
    }

    //Método para calcular área superficial
    double calcularAreaPiramide(){

        return (2 * this.arestaBase * this.apotema) + Math.pow(this.arestaBase, 2);
    }


    //Metodo para retornar em String
    String retornaResumoDaPiramide(int valor){

        String resumo = String.format("Resumo Piramide de Base Quadrada:\nAresta da base: %.2f\nApótema: %.2f\nAltura: %.2f" +
                        "\nÁrea da base: %.2f\nÁrea Superfícial: %.2f\nVolume: %.2f",
                this.arestaBase, this.apotema, this.altura, this.areaBase, this.calcularAreaPiramide(),
                this.calcularVolumePiramide());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
