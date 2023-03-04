public class comparacionDeCadenas {
    public static void main(String[] args)
    {
        String animal1 = "Caballo";
        String animal2 = "Mosca";
        String criaturaNueva;
        criaturaNueva = animal1 + animal2;
        System.out.println(criaturaNueva.equals("CaballoMosca"));
        System.out.println(criaturaNueva.equals("caballomosca"));
    }
}
