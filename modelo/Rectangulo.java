package modelo;

public class Rectangulo extends Operaciones{

    public Rectangulo(double A, double B)
    {
        super(A, B);
    }
    
    public void Rectangulo()
    {
        resultados = A*B;
    }

    public double getAreaRectangulo()
    {
        return resultados;
    }
}
