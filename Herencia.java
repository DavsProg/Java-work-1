public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setVelocidadMax (70);
        coche1.setSonido("BRRR");
        coche1.setMatricula ("TTE16E");

        System.out.println(coche1.getVelocidadMax());
        System.out.println(coche1.getMatricula());
        System.out.println(coche1.getSonido());
    }
}


abstract class  Vehiculo{
            private int velocidadMax;
            private String matricula;
            private String sonido;

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

    abstract public String getSonido();
    abstract public void setSonido(String sonido);
}


class Coche extends Vehiculo{

    private String sonido;

    public String getSonido(){
        return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
