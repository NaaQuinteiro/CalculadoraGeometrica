public class Cone {
    double altura;
    double raio;
    final double PI = Math.PI;

    public Cone(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

    //Método para clacular o volume
    double calcularVolumeCone(){
        return (0.33) * this.PI * Math.pow(this.raio, 2) * this.altura;
    }

    //Método para calcular área superficial
    double calcularAreaCone(){
        return this.PI * this.raio * Math.sqrt((Math.pow(this.altura,2) + Math.pow(this.raio, 2)));
    }

    //Metodo para retornar em String
    String retornaResumoDoCone(int valor){

        String resumo = String.format("Resumo Cone\nRaio: %.2f\nÁrea Superfícial: %.2f\nVolume: %.2f",
                this.raio, this.calcularAreaCone(), this.calcularVolumeCone());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
