package Controlador.Package;

import java.util.Scanner;

import Controlador.Package.Com.itt.Fiesta;
//Este segundo main es tambien la copia de su primera version solo que con la importacion de la clase ya que no hace parte del mismo paquete pero si del mismo modelo.

public class Main {
    public static void limpiar_pantalla() {
        for (int i = 0; i < 200; i++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fiesta[] fiestas=new Fiesta [10];
        int i=0;
        int opcion = 0;
        //Esta nueva variable es la estatica y al ser publica tendremos acceso a ella directamente, no hay problema ya que anteriormente mencionaba que no hacia parte del objeto.
        int contadorFiestas;

        System.out.println("-----------------------------------");
        System.out.println("-¡Bienvenido a tu gestor de fiestas!-");
        System.out.println("-Pulsa una tecla para continuar-");
        sc.nextLine();
        do {
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
                case 1:{
                    if (i<10) {
                        limpiar_pantalla();
                        int opcionb = 0;
                        String tipo;
                        String fechaHora;
                        String direccion;
                        int bebidas;
                        int bocadillos;
                        int invitados = 0;
                        System.out.println("-Pulsa una tecla para continuar-");
                        sc.nextLine();
                        System.out.println("¿Que dia es y que hora?");
                        fechaHora = sc.nextLine();
                        System.out.println("¿Que clase de fiesta sera?");
                        tipo = sc.nextLine();
                        System.out.println("¿En donde sera? Dame una direccion.");
                        direccion = sc.nextLine();
                        System.out.println("¿Cuantas bebidas maximo crees que puedes dar?.");
                        bebidas = sc.nextInt();
                        System.out.println("¿Cuantos bocadillos maximo piensas dar?");
                        bocadillos = sc.nextInt();
                        //Como vemos no incluimos el atributo estatico dentro del constructor.
                        fiestas[i] = new Fiesta(tipo, fechaHora, direccion, bebidas, bocadillos, invitados);
                        do {
                            System.out.println("Ahora ¿Cuantos invitados deseas invitar?");
                            System.out.println("-1.Agregar invitados-");
                            System.out.println("-2.Cancelar invitado-");
                            System.out.println("-3.Suficientes invitados-");
                            opcionb = sc.nextInt();
                            if (opcionb == 1) {
                                System.out.println("Dame la cantidad de usuarios que deseas invitar");
                                //Ponemos a prueba la modificacion nueva del metodo asignandole el valor manualmente.
                                invitados=sc.nextInt();
                                fiestas[i].invitar(invitados);
                            } else if (opcionb == 2) {
                                fiestas[i].cancelarInvitacion();
                            }

                        } while (opcionb != 3);
                        //Tambien ponemos a prueba el metodo que cree para incrementar el valor del atributo estatico y retornando una linea de caracteres para indicar cuantas unidades hay.
                        System.out.println("¡Fiesta creada correctamente¡");
                        Fiesta.contadorFiesta();
                        System.out.println("Pulse intro para continuar");
                        sc.nextLine();
                        sc.nextLine();
                    }else {
                        System.out.println("No se pueden crear mas fiestas.");
                        System.out.println("Pulse INTRO antes de continuar...");
                        sc.nextLine();
                        sc.nextLine();
                    }
                    break;
                }
                case 2:{
                    if(fiestas[i]==null){
                       System.out.println("No hay fiestas insertada.");
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();
                    }
                    else {
                    fiestas[i].precioFiesta();
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();

                    }
                    break;
                }
                case 3:{
                    if(fiestas[i]==null){
                        System.out.println("No hay fiestas insertada.");
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();
                    }
                    else {
                    fiestas[i].consulta();
                        System.out.println("Pulsa una INTRO para continuar ...");
                        sc.nextLine();
                        sc.nextLine();
                    }
                    break;
                }
                case 4:{
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