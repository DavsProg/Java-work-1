public class Main {
    public static void main(String[] args) {
        Tesla tesla1 = new Tesla();
        tesla1.setVelocidadMax (70);
        tesla1.setMatricula ("TTE16E");

        System.out.println(tesla1.getVelocidadMax());
        System.out.println(tesla1.getMatricula());
    }
}

class Vehiculo {
     int velocidadMax;
    String matricula;


    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
class Coche extends Vehiculo{

}
class Tesla extends Coche {


    public int velocidadMax;
}
