
package Operaciones;

/**
 *
 * @author Martín
 */
public abstract class Numeros {
    int numA;
    int numB;

    public Numeros(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }
   public abstract void operando(int numA,int numB);
}
