package school.sptech;

public class Retangulo extends Figura {
    private Double base;
    private Double altura;

    public Retangulo () {}

    public Double getBase() {return base;}
    public void setBase(Double base) {this.base = base;}
    public Double getAltura() {return altura;}
    public void setAltura(Double altura) {this.altura = altura;}

    @Override
    public Double calcularArea() {
        return getAltura() * getBase();
    }

    @Override
    public String toString() {
        return "A área do retângulo é: " + calcularArea();
    }



}
