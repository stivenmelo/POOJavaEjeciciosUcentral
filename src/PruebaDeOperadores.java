public class PruebaDeOperadores {
    public static void main(String[] args) {
        int x;
        int y = 2;
        double z = 3.08;
        x = 5;
        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        y++;
        z--;
        z *= x;
        System.out.println("x + y + z = " + (x + y + z));
    } // fin del main
} // fin de la clase PruebaDeOperadores