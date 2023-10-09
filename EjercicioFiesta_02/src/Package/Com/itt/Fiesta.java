package Controlador.Package.Com.itt;

public class Fiesta{
	//Hacemos una copia igual de la version 1 de ejerciciofiesta_01 solo que esta sera la version 2, y su clase fue puesta en el paquete que vemos al principio del archivo.
    private String tipo;
    private String fechaHora;
    private String direccion;
    private int bebidas;
    private int bocadillos;
    private int invitados;
    //Tendra un atributo estatico nuevo que servira como contador cada vez que se cree un nuevo objeto fiesta.
    private static int contadorFiestas;
    //No lo incluiremos en el constructor ya que en si no hace parte del objeto.
    public Fiesta(String tipo, String fechaHora, String direccion, int bebidas, int bocadillos, int invitados) {
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.direccion = direccion;
        this.bebidas = bebidas;
        this.bocadillos = bocadillos;
        this.invitados = invitados;
    }

    public Fiesta() {
    }

    public void consulta(){
        System.out.println("La ultima fiesta sera de: "+tipo);
        System.out.println("La ultima fiesta sera: "+fechaHora);
        System.out.println("La ultima fiesta estará ubicada en : "+direccion);
        System.out.println("La ultima fiesta contara con : "+bebidas+" bebidas");
        System.out.println("La ultima fiesta contara con : "+bocadillos+" bocadillos");
        System.out.println("La ultima fiesta contara con : "+invitados+" invitados");
    }





    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public int getBebidas() {
        return bebidas;
    }

    public void setBebidas(int bebidas) {
        this.bebidas = bebidas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBocadillos() {
        return bocadillos;
    }

    public void setBocadillos(int bocadillos) {
        this.bocadillos = bocadillos;
    }
    public void invitar(int n){
       //Sobrecargamos el metodo, para que se pueda modificar de manera manual el incremento de la variable invitados.
        invitados=+n;
        System.out.println("En total hay "+invitados+" invitados.");
    }
    public void cancelarInvitacion(){
        invitados--;
        System.out.println("En total hay "+invitados+" invitados.");
    }
    public void precioFiesta(){
        double precioTotal=(5*invitados)+(2*bebidas)+(3*bocadillos);
        System.out.println("El precio de la ultima fiesta fue en total de: "+precioTotal+" €");
    }
    //Cree un metodo al igualmente estatico para que sirva solo para contar el atributo anteriormente mencionado.
    public static void contadorFiesta(){
        contadorFiestas++;
        System.out.println("Llevas en total "+contadorFiestas+" fiestas creadas" );
        

    }
}

