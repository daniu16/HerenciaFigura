package controlador;

import javax.swing.JOptionPane;

import modelo.Rectangulo;
import modelo.Circulo;

public class Controlador {
    
    public static void main(String[] args) {
        // Entrada datos rectangulo
        double A = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base del rectangulo: "));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura del rectangulo: "));

        //creacion de rectangulo
        Rectangulo mRectangulo = new Rectangulo(A, B);
        mRectangulo.getAreaRectangulo();
        JOptionPane.showMessageDialog(null, "El area del rectangulo es:"+ mRectangulo);

        // Entradad datos circulo
        double R = Double.parseDouble(JOptionPane.showInputDialog("Digite el Radio del circulo: "));

        // creacion circulo
        Circulo mCirculo = new Circulo(R);
        mCirculo.getAreaCirculo();
        JOptionPane.showMessageDialog(null , "El area del circulo es: "+ mCirculo);
    }
}
