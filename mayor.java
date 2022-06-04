public class Main {
    public static void main(String[] args) {
        int x = 7;
        int y = 0;
        int z = -4;

        mayor(x);
        mayor(y);
        mayor(z);

    }

    public static void mayor(int a) {
        if (a == 0) {
            System.out.println("El numero es 0");
        } else if (a < 0) {
            System.out.println("El numero es Negativo");
        } else {
            System.out.println("El numero es Positivo");
        }
    }
}
