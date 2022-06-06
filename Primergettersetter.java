public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setTipo("Carro");
        System.out.println(vehiculo1.getTipo());
    }
}
class Vehiculo{
   private String tipo;

    public String getTipo() {
           return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
