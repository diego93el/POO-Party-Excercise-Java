package Controlador.Package;

public class Fiesta {
	
	//El ejercicio propone crear una clase con los siguientes atributos y su tipo de variable, son privados, unicamente hay acceso a ellos directamente desde la clase.
    private String tipo;
    private String fechaHora;
    private String direccion;
    private int bebidas;
    private int bocadillos;
    private int invitados;
   //Se hace el constructor con todas las variables.
    public Fiesta(String tipo, String fechaHora, String direccion, int bebidas, int bocadillos, int invitados) {
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.direccion = direccion;
        this.bebidas = bebidas;
        this.bocadillos = bocadillos;
        this.invitados = invitados;
    }
    //Se crea otro constructor sin ninguna variable totalemente vacio.
    public Fiesta() {
    }

   // Se hace el accesso a los atributos por medio de getter and setter, para que el archivo main llegue a ellos por medio de este metodo y no directamente.
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
   //El metodo invitar unicamente modifica la variable invitados y retorna una linea de caracteres indicando su valor actual.
    public void invitar(){
        invitados++;
        System.out.println("En total hay "+invitados+" invitados.");
    }
    //Al igual que el metodo anterior modifica la misma variable pero restandole valor igualmente la linea de caracteres.
    public void cancelarInvitacion(){
        invitados--;
        System.out.println("En total hay "+invitados+" invitados.");
    }
    //Este metodo se usa double ya que sumaremos varios enteros, y nos retornara por medio de una linea de caracteres el valor resultante.
    public void precioFiesta(){
        double precioTotal=(5*invitados)+(2*bebidas)+(3*bocadillos);
        System.out.println("El precio de la fiesta fue en total de: "+precioTotal+" €");
    }
    // El metodo consulta retorna todas las variables y su valor asignado.
	public void consulta() {
		 System.out.println("La fiesta sera de: "+tipo);
	        System.out.println("La fiesta sera: "+fechaHora);
	        System.out.println("La fiesta estará ubicada en : "+direccion);
	        System.out.println("La fiesta contara con : "+bebidas+" bebidas");
	        System.out.println("La fiesta contara con : "+bocadillos+" bocadillos");
	        System.out.println("La fiesta contara con : "+invitados+" invitados");		
	}
}
