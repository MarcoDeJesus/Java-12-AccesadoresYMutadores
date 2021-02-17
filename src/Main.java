public class Main {

    public static void main(String args []){
        NES nintendo = new NES();
        nintendo.nombreDeLaConsola = "Nintendo Entertainment System";
        nintendo.numeroDeControles = 23;
        nintendo.EmpezarAJugar();
        System.out.println("Estas jugando " + nintendo.nombreDeLaConsola
                + " con " + nintendo.numeroDeControles + " controles.");
        System.out.println();

        SNES superNintendo = new SNES();
        superNintendo.setNombreDeLaConsola("Super Nintendo Entertainment System");
        superNintendo.setNumeroDeControles(23);
        superNintendo.EmpezarAJugar();
        System.out.println("Estas jugando " + superNintendo.getNombreDeLaConsola()
                + " con " + superNintendo.getNumeroDeControles() + " controles.");
    }
}
