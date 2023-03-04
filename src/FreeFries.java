/******************************************************************
 * PapasGratis.java
 * Dean & Dean
 *
 * Este programa lee los puntos obtenidos por el equipo anfitrión y
 * por el oponente y determina si los aficionados obtienen papas
 * fritas gratis.
 *******************************************************************/
import java.util.Scanner;
public class FreeFries
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int ptsCasa; // puntos obtenidos por el equipo anfitrión
        int ptsOponente; // puntos obtenidos por el oponente
        System.out.print("Puntos obtenidos por el equipo anfitrión: ");
        ptsCasa = stdIn.nextInt();
        System.out.print("Puntos obtenidos por el equipo oponente: ");
        ptsOponente = stdIn.nextInt();
        if (ptsCasa > ptsOponente && ptsCasa >= 100)
        {
            System.out.println("Aficionado, cambia tu boleto usado por una orden" +
                    " de papas fritas en Yummy Burgers.");
        }
    } // fin del main
} // fin de la clase PapasGratis