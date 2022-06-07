public class Main {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.Acelerar(70);

    }

}
interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}
class Carro implements Vehiculo{

        public void Acelerar(int cuantaVelocidad) {

    }

        public void Frenar(int cuantaVelocidad) {

    }
}`
