package Controlador.Package;
import java.util.Scanner;

public class Main {
    public static void limpiar_pantalla() {
        for (int i = 0; i < 200; i++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
    	//Poniendo en practica todo lo aprendido anteriormente y usaremos los nuevos parametros aplicados en la calse con diferentes metodos nativos para mostrarlos.
        Scanner sc = new Scanner(System.in);
        Fiesta[] fiestas=new Fiesta [1];
        int one = 0;
        int opcion = 0;
      
        System.out.println("-----------------------------------");
        System.out.println("-¡Bienvenido a tu gestor de fiestas!-");
        System.out.println("-Pulsa una tecla para continuar-");
        sc.nextLine();
        do {
        	//Decidi crear una aplicacion para que se vea mas ordenado.
        	//Cada opcion ayudara a crear y a consultar los datos creados dentro de la clase.
            limpiar_pantalla();
            System.out.println("-----------------------------------");
            System.out.println("-¿Que deseas hacer?-");
            System.out.println("-----------------------------------");
            System.out.println("-1.Insertar fiesta-");
            System.out.println("-2.Consultar el precio de la fiesta-");
            System.out.println("-3.Consultar informacion de la fiesta-");
            System.out.println("-4.Salir del gestor-");
            System.out.println("-----------------------------------");
            System.out.println("Usuario dame una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:{//Opcion uno es la insercion de datos en el objeto.
                    limpiar_pantalla();
                    //Llamamos de manera local los atributos de la clase, pueden ser del mismo nombre sin ningun problema.
                        int opcionb=0;
                        String tipo;
                        String fechaHora;
                        String direccion;
                        int bebidas;
                        int bocadillos;
                        //Se asigna por defecto el valor de invitados como 0, segun como lo indica uno de los puntos del ejercicio.
                        int invitados=0;
                        System.out.println("-Pulsa una tecla para continuar-");
                        sc.nextLine();//Limpiamos el buffer antes de empezar el cuestionario.
                        System.out.println("¿Que clase de fiesta sera?");
                        //Escaneamos los valores asignados.
                        tipo =sc.nextLine();
                        System.out.println("¿Que dia es y que hora?");
                        fechaHora=sc.nextLine();
                        System.out.println("¿En donde sera? Dame una direccion.");
                        direccion=sc.nextLine();
                        System.out.println("¿Cuantas bebidas maximo crees que puedes dar?.");
                        //Un asi al usar el metodo scanner se debe especificar exactamente el mismo variable que se indico en la clase. 
                        bebidas=sc.nextInt();
                        System.out.println("¿Cuantos bocadillos maximo piensas dar?");
                        bocadillos=sc.nextInt();
                        //Una vez con los valores los almacenamos en la calse por medio del constructor, con el atributo invitados con valor de 0.
                        fiestas [one]=new Fiesta(tipo, fechaHora, direccion, bebidas, bocadillos,invitados);
                    do {
                    	//Para asignar valor a invitados usamos los metodos creados en la clase.
                        System.out.println("Ahora ¿Cuantos invitados deseas invitar?");
                        System.out.println("-1.Agregar invitado-");
                        System.out.println("-2.Cancelar invitado-");
                        System.out.println("-3.Suficientes invitados-");
                        opcionb=sc.nextInt();
                        if(opcionb==1){
                        	//Cada vez que se seleccione esta opcion agregara una unidad a la variable.
                            fiestas[one].invitar();
                        }else if (opcionb==2){
                        	//Este le restara.
                            fiestas[one].cancelarInvitacion();
                        }

                    }while (opcionb!=3);//Esta ultima opcion nos sacara del condicionador y dejaremos de asignar valor a la variable.
                        System.out.println("¡Fiesta creada correctamente¡");
                        System.out.println("Pulse intro para continuar");
                        sc.nextLine();
                        sc.nextLine();
                    break;
                }
                case 2:{
                	//En esta opcion y la siguiente siempre consultaremos si hay o no datos guardados en la clase.
                    if(fiestas[one]==null){
                       System.out.println("No hay fiesta insertada.");
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();
                    }
                    else {
                    	// Si hay datos en la clase, se mostrara el metodo.
                    fiestas[one].precioFiesta();
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();

                    }
                    break;
                }
                case 3:{
                    if(fiestas[one]==null){
                        System.out.println("No hay fiesta insertada.");
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();
                    }
                    else {
                    	//Si hay datos en la clase, se mostrara el metodo.
                    fiestas[one].consulta();
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();
                    }
                    break;
                }
                case 4:{
                	//Esta ultima nos sacara de la aplicacion.
                    break;
                }
                default:{
                    System.out.println("La opcion escogida no es valida.");
                    System.out.println("Los numero deben entre el 1,2,3 y 4.");
                    System.out.println("Pulsa una INTRO para continuar ...");
                    sc.nextLine();
                    sc.nextLine();

                }
            }
        } while (opcion != 4);
        System.out.println("El gestor llega hasta aqui hasta otra!!");
    }
}