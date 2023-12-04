public class Circulo {

    double raio;
    final double PI = Math.PI;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //Método para clacular a área
    double calcularAreaCirculo(){
        return this.PI * Math.pow(this.raio, 2);
    }

    //Método para calcular o perímetro
    double calcularPerimetroCirculo(){

        return 2 * this.PI * this.raio;
    }

    //Metodo para retornar em String
    String retornaResumoDoCirculo(int valor){

        String resumo = String.format("Resumo Círculo\nRaio: %.2f\nÁrea: %.2f\nPerímetro: %.2f",
                this.raio, this.calcularAreaCirculo(), this.calcularPerimetroCirculo());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
            return resumo.toLowerCase();

    }
}
