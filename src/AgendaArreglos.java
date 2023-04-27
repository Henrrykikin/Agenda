import java.util.InputMismatchException;
import java.util.Scanner;

public class AgendaArreglos {
    public static void main(String[] args) {
        //Programa que almacena los registros de una agenda y los muestra al buscarlos
        int opcion;
        int opcion2;
        boolean salir = false;
        int i= 0;
        String[] nombre = new String[10];
        String[] apellido = new String[10];
        String[] telefono = new String[10];
        String[] correo = new String[10];

        Scanner scanner =  new Scanner(System.in);

        while (!salir) {
            System.out.println("Bienvenido\nAgenda de contactos");
            try{
                System.out.println("Escribe el número de la opción deseada:\n\t1. Registrar\n\t2. Buscar\n\t3. Eliminar\n\t4. Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa el nombre: ");
                        nombre[i] = scanner.next();
                        System.out.println("Ingresa el apellido: ");
                        apellido[i] = scanner.next();
                        System.out.println("Ingresa el teléfono: ");
                        telefono[i] = scanner.next();
                        System.out.println("Ingresa el correo: ");
                        correo[i] = scanner.next();
                        i++;
                        break;
                    case 2:
                        System.out.println("Mostrar contactos");
                        for(int j = 0; j < i; j++){
                            System.out.println(nombre[j]+" "+apellido[j]+" "+telefono[j]+" "+correo[j]);
                        }
                        System.out.println("\n");

                        break;
                    case 3:
                        System.out.println("Eliminación de contactos");
                        break;
                    case 4:
                        salir = true;
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número");
                scanner.nextInt();
            }
        }
    }
}