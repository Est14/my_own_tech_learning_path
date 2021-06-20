package paquete1;

public class Class1 {

    public String publicName = "Nautilus";
    protected String protectedName = "Ubuntu";

    public Class1(){
        System.out.println("I'm a public construct");
    }
    protected Class1(String something){
        System.out.println(something);
    }
}
