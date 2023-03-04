/*************************************************************
 * InfoImagen.java
 * Dean & Dean
 *
 * Este programa proporciona el ancho y largo de una imagen.
 *************************************************************/

import javax.swing.*;
import java.util.Scanner;

public class InfoImagen
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        ImageIcon icono;
        System.out.print("Introduzca el nombre de la imagen: ");
        icono = new ImageIcon("../Img/"+stdIn.nextLine());
        System.out.println("anchura de la imagen = " + icono.getIconWidth());
        System.out.println("altura de la imagen = " + icono.getIconHeight());
    }
} // fin de InfoImagen