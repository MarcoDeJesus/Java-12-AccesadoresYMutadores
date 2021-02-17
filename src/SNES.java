public class SNES {

    private int numeroDeControles;
    private String nombreDeLaConsola;

    public int getNumeroDeControles() {
        return numeroDeControles;
    }

    public void setNumeroDeControles(int numeroDeControles) {
        if(numeroDeControles <= 0 || numeroDeControles > 2)
            throw new IllegalArgumentException("El Número de controles no es el adecuado para Jugar Super Nintendo.");
        this.numeroDeControles = numeroDeControles;
    }

    public String getNombreDeLaConsola(){
        return nombreDeLaConsola;
    }

    public void setNombreDeLaConsola(String nombreDeLaConsola){
        this.nombreDeLaConsola= nombreDeLaConsola;
    }

    public void EmpezarAJugar(){
        System.out.println("Iniciando... " + nombreDeLaConsola);
        if(ValidandoNumeroDeControles() ){
            System.out.println("Juego iniciado.");
        }else{
            System.out.println("Crashed - Boot loader problem... No se pudo iniciar el juego.");
        }
    }

    public boolean ValidandoNumeroDeControles(){
        return numeroDeControles >= 1 && numeroDeControles <=2;
    }
}
