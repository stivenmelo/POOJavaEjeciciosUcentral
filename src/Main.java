public class Main {
    public static void main(String[] args) {

        int numeroGanador = 0;
        for (int i = 0; i <= 10;i++ ){
            numeroGanador = (int) (Math.random() * Integer.MAX_VALUE);

            System.out.println(numeroGanador);
        }


    }
}