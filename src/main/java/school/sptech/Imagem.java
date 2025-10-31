package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {}

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaDasFiguras = 0.0;
        for (int i = 0; i < figuras.size(); i++) {
            somaDasFiguras += figuras.get(i).calcularArea();
        }
        return somaDasFiguras;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasAreaMaiorQue20 = new ArrayList<>();
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i).calcularArea() > 20) {
                figurasAreaMaiorQue20.add(figuras.get(i));
            }
        }
        System.out.println("Lista de figuras com área maior que 20: ");
        return figurasAreaMaiorQue20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> listaQuadrados = new ArrayList<>();

        for (Figura f : figuras) {
            if (f instanceof Quadrado) {
                listaQuadrados.add(f);
            }
        }
        return listaQuadrados;
    }
}
