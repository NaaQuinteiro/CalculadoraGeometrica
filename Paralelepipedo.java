public class Paralelepipedo {

    double comprimento;

    double altura;
    double largura;

    //Construtor
    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    //Método para clacular o volume
    double calcularVolumeParalelepipedo(){
        return this.comprimento * this.altura * this.largura;
    }

    //Método para calcular área superficial
    double calcularAreaParalelepipedo(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
    }

    //Metodo para retornar em String
    String retornaResumoDoParalelepipedo(int valor){

        String resumo = String.format("Resumo Paralelepípedo\nComprimento: %.2f\nAltura: %.2f\nLargura: %.2f" +
                        "\nÁrea Superfícial: %.2f\nVolume: %.2f",
                this.comprimento, this.altura, this.largura, this.calcularAreaParalelepipedo(),
                this.calcularVolumeParalelepipedo());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }

}
