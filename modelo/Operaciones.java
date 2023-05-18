package modelo;

public class Operaciones
{
    //atributos
    protected double A;
    protected double B;
    protected double R;
    protected double resultados;
    
    //controlador 
    public Operaciones(double A, double B)
    {
        this.A = A;
        this.B = B;
    }
    public Operaciones( double R)
    {
        this.R = R;
    }

    //metodos
    public double mostrarResultados()
    {
        return this.resultados;
    }
}
