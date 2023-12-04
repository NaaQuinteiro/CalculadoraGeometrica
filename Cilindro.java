public class Cilindro {

    double altura;
    double raio;
    final double PI = Math.PI;

    public Cilindro(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

    //Método para clacular o volume
    double calcularVolumeCilindro(){
        return this.PI * Math.pow(this.raio, 2);
    }

    //Método para calcular área superficial
    double calcularAreaCilindro(){
        return (2 * this.PI * this.raio * this.altura) + (2 * this.PI * Math.pow(this.raio, 2));
    }

    //Metodo para retornar em String
    String retornaResumoDoCilindro(int valor){

        String resumo = String.format("Resumo Cinlíndro\nRaio: %.2f\nÁrea Superficial: %.2f\nVolume: %.2f",
                this.raio, this.calcularAreaCilindro(), this.calcularVolumeCilindro());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
