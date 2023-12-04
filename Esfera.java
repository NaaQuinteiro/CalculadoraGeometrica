public class Esfera {

    double raio;
    final double PI = Math.PI;

    //Construtor
    public Esfera(double raio) {
        this.raio = raio;
    }

    double calcularVolumeEsfera(){
        return (1.33) * this.PI * Math.pow(this.raio, 3);
    }

    double calcularAreaEsfera(){
        return 4 * this.PI * Math.pow(this.raio, 2);
    }

    //Metodo para retornar em String
    String retornaResumoDaEsfera(int valor){

        String resumo = String.format("Resumo Esfera\nRaio: %.2f\nÁrea Superfícial: %.2f\nVolume: %.2f",
                this.raio, this.calcularAreaEsfera(), this.calcularVolumeEsfera());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
