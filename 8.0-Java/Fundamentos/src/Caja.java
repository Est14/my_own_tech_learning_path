public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja(){

    }
    // Sobre carga de constructor
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen(){

        int resultado = this.ancho * this.alto * this.profundo;

        return resultado;
    }
}
