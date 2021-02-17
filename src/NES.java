public class NES {
    public int numeroDeControles;
    public String nombreDeLaConsola;

    public void EmpezarAJugar(){
        System.out.println("Iniciando... " + nombreDeLaConsola);
        if(ValidandoNumeroDeControles() ){
            System.out.println("Juego iniciado.");
        }else{
            System.out.println("Crashed - Boot loader problem...");
        }
    }

    public boolean ValidandoNumeroDeControles(){
        return numeroDeControles >= 1 && numeroDeControles <=2;
    }
}
