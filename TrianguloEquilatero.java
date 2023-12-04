public class TrianguloEquilatero {
    double lado;

    //construtor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    //Método para calcular a área
    public double calcularAreaTriangulo() {
        return this.lado * (Math.sqrt(3) / 2);
    }

    //Método para calcular o perímetro
    public double calcularPerimetroTriangulo(){
        return this.lado * 3;
    }

    String retornaResumoDoTriangulo(int valor){

        String resumo = String.format("Resumo Triângulo Equilátero:\nLado: %.2f\nÁrea: %.2f\nPerímetro: %.2f",
                this.lado, this.calcularAreaTriangulo(), this.calcularPerimetroTriangulo());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
