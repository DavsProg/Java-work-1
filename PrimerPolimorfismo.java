public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(10);
        cliente1.setNombre("Ask Ketchup");
        cliente1.setTelefono("3206666666");
        cliente1.setCredito("debe 1 millon XD");

        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(30);
        trabajador1.setNombre("Daniel");
        trabajador1.setTelefono("3206");
        trabajador1.setSalario("gana  3 millonsottes XD");

        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());

    }

}

class Persona{
    int edad;
    String nombre;
    String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}
class Cliente extends Persona{
    String credito;

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getCredito() {
        return credito;
    }
}
class Trabajador extends Persona{
    String salario;

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }
}
