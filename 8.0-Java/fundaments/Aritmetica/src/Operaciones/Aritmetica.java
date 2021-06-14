
package Operaciones;

public class Aritmetica {
    // Atributos de clase 
    int a;
    int b;
    
    
    // Este metodo no devulve nada ya que utiliza void
    public void sum(){
        
        System.out.println("Resultado: " + (a + b));
    }
    
    
    // Este metodo devuleve un resultado ya que utiliza int 
    public int sumar(){
        
        return a + b;
    }
    
    
    // Este metodo recibe parametros
    public int mulConRetorno(int arg1, int arg2){
        var a = arg1;
        var b = arg2;
        return sumar
    }
    
    
    public void sus(){
        
        System.out.println("Resultado: " + (a - b));
    }
    
    
    public void mul(){
        
        System.out.println("Resultado: " + (a * b));
    }
    
    
    public void div(){
        
        System.out.println("Resultado: " + (a / b));
    }
    
}
