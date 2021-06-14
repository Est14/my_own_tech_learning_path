package Clases;

public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona1;
        // Aparte de crear el objecto nos permite reservar memoria
        persona1 = new Persona();
        
        persona1.name = "Esteban";
        persona1.lastName = "Martinez";
        
        Persona persona2 = new Persona();
        persona2.name = "Ivan";
        persona2.lastName = "Martinez";
        
        persona2.desplegrarInfo();
        persona1.desplegrarInfo();
    }
    
}
