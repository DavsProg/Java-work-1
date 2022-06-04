public class Main {
    public static void main(String[] args){
        int a=10;
        int b=5;
        int c=2;
       System.out.println("Aqui se muestra la suma:");
       suma(a,b,c);

        System.out.println("numeros de puertas del carro");

        carro jazz = new carro();
        jazz.PonerPuerta();
        jazz.PonerPuerta();
        jazz.PonerPuerta();
        System.out.println(jazz.puertas);
    }
    public static int suma(int a, int b,int c){
        int resultado;
        resultado= a + b + c;
        System.out.println(resultado);
        return resultado;
    }

    static class carro{
        public int puertas = 0;

        public void PonerPuerta(){
            this.puertas++;
        }
    }

}
