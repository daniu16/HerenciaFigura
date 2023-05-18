package modelo;

public class Circulo extends Operaciones {

    public Circulo(double R)
    {
        super(R);
    }

    public void Circulo()
    {
        double radio = R*R;
        resultados = Math.PI * radio;
    }

    public double getAreaCirculo()
    {
        return this.resultados;
    }
    
}
