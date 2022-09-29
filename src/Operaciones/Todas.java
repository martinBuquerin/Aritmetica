/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Martín
 */
public class Todas extends Numeros{
    private Numeros numA;
    private Numeros numB;
    
    public Todas(int numA, int numB) {
        super(numA, numB);
    }
    
   
    public void operandoS(int numA,int numB){
        int resultado = numA + numB;
        System.out.println("La suma de "+numA +" + "+ numB + " = "+resultado);
    }
    
    public void operandoR(int numA,int numB){
        int resultado = numA - numB;
        System.out.println("La resta de "+numA +" - "+ numB + " = "+resultado);
    }
    
    public void operandoD(int numA,int numB){
        if(numB<=0){
            System.out.println("El dividendo debe ser mayor a 0");
        }else{
            int resultado = numA / numB;
            System.out.println("La división de "+numA +" / "+ numB + " = "+resultado);
        }
        
    }
    
    public void operandoM(int numA,int numB){
        int resultado = numA * numB;
        System.out.println("La multiplicación de "+numA +" * "+ numB + " = "+resultado);
    }
       
    @Override
    public void operando(int numA,int numB){
       
    }
    
}
