public class Retangulo {
    double base;
    double altura;

    //construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Método para calcular a area
    public double calcularAreaRet(){
        return this.base*this.altura;
    }

    //Método para calcular o perímetro
    public double calcularPerimetroRet(){
        return (2 * this.base) + (2 * this.altura);
    }

    String retornaResumoDoRetangulo(int valor){

        String resumo = String.format("Resumo Retângulo:\nBase: %.2f\nAltura: %.2f\nÁrea: %.2f\nPerímetro: %.2f",
                this.base, this.altura, this.calcularAreaRet(), this.calcularPerimetroRet());

        // condição para apresentar em maiusculo ou minusculo
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
