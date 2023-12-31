import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        //Clientes ingresados desde el backend; 
        int cantidadInicialClientes = 6; 
        // Clientes ya cargados por nosotros (son 6 clientes del tipo object)
            listaClientes.add(new Cliente(42948039, "Zhou", "Yáng", "2604749366", "yangzhou94@gmail.com", 25000));
            listaClientes.add(new Cliente(42948039, "Martino", "Sorroche", "2604747856", "martinos@gmail.com", 50000));
            listaClientes.add(new Cliente(46546347, "Franco", "Romero", "2604389433", "romerofranquito@gmail.com", 10000));
            listaClientes.add(new Cliente(43765994, "Fernanda", "Torres", "2604542755", "torresfer45@gmail.com", 5000));
            listaClientes.add(new Cliente(34564704, "Camila", "Flores", "2604916352", "camigomez@gmail.com", 9900));
            listaClientes.add(new Cliente(19446237, "Julieta", "Lombardi", "2604286544", "julilombardi133@gmail.com", 3000));
        System.out.println("REGISTRO DE CLIENTES - TIENDA DE ROPA");
        System.out.println("¿Cuántos clientes adicionales desea ingresar?");
        int cantidadNuevosClientes = scanner.nextInt();
        scanner.nextLine(); // Consumimos la nueva línea

        // Agregamos nuevos clientes
        for (int i = 1; i <= cantidadNuevosClientes; i++) {
            Cliente cliente = Cliente.ingresarCliente(scanner, i + cantidadInicialClientes);
            listaClientes.add(cliente);
        }
        int caso = 0; 
        do {
            //Luego de cargar los clientes debemos realizar un switch para ver que quiere hacer el usuario 
            //Le pedimos al usuario un número según lo que desee hacer 
            System.out.println("Ingrese un número según lo que desea");
            System.out.println("1: Buscar cliente por su nombre");
            System.out.println("2: Buscar cliente por su apellido");
            System.out.println("3: Buscar cliente por su dni");
            System.out.println("4: Ver lista de todos los clientes en orden de registro");
            System.out.println("5: Ver lista de clientes en orden alfabético");
            System.out.println("6: Ver lista de clientes según quien realizó más gastos en la tienda");
            System.out.println("7: Salir del programa");
            //Le pedimos al usuario un número según lo que desee hacer
            System.out.println("Ingrese el número de la opción que escoja");
            caso = scanner.nextInt();
            switch (caso) {
                case 1:
                System.out.println("BUSCAR CLIENTE POR NOMBRE");
                    System.out.println("Ingrese el nombre del cliente a buscar");
                    String nombreBuscado = scanner.next(); //el usuario ingresa el nombre a buscar
                    //Llamamos al método buscarClientePorNombre de la clase  BuscarCliente
                    Cliente clienteEncontrado = BuscarCliente.buscarClientePorNombre(listaClientes,nombreBuscado);
                    if (clienteEncontrado != null) {
                    }
                    break;
                case 2: 
                System.out.println("BUSCAR CLIENTE POR APELLIDO");
                    System.out.println("Ingrese el apellido del cliente a buscar");
                    String apellidoBuscado = scanner.next(); //el usuario ingresa el apellido a buscar
                    //Llamamos al método buscarClientePorApellido de la clase BuscarCliente
                    Cliente clienteEncontrado1 = BuscarCliente.buscarClientePorApellido(listaClientes,apellidoBuscado);
                    if (clienteEncontrado1 != null) {
                    }
                    break; 
                case 3:  
                    System.out.println("Buscar cliente por DNI");
                    System.out.println("Ingrese el DNI a buscar");
                    int dniBuscado = scanner.nextInt();
                    //Llamamos al método buscarClientePorDni de la clase BuscarCliente
                    Cliente clienteEncontrado2 = BuscarCliente.buscarClientePorDni(listaClientes, dniBuscado);
                    if (clienteEncontrado2 != null) {
                    }
                    break;  
                case 4:
                    System.out.println("LISTA DE CLIENTES EN ORDEN DE REGISTRO");
                    // Mostrar todos los clientes
                    System.out.println("Lista de todos los clientes:");
                    for (Cliente cliente : listaClientes) {
                        System.out.println("DNI: " + cliente.getDni());
                        System.out.println("Nombre: " + cliente.getNombre());
                        System.out.println("Apellido: " + cliente.getApellido());
                        System.out.println("Teléfono: " + cliente.getTelefono());
                        System.out.println("Email: " + cliente.getEmail());
                        System.out.println("Total de gasto realizado en la tienda: " + cliente.getTotalCompra());
                        System.out.println("Descuento: " + cliente.getDescuento());
                        System.out.println("\n");
                }
                    break;  
                case 5:
                    // Creamos una instancia de la clase OrdenarClientes
                    OrdenarClientes alfabetoClientes = new OrdenarClientes();
                    // Mostramos la lista de clientes ordenada alabéticamente
                    alfabetoClientes.mostrarClientesOrdenadosAlfabeticamente(listaClientes);
                    break;
                case 6:
                    // Creamos una instancia de la clase OrdenarClientes
                    OrdenarClientes gastoClientes = new OrdenarClientes();
                    // Mostramos la lista de clientes ordenada según quien realizó más gastos
                    gastoClientes.mostrarClientesOrdenadosGasto(listaClientes); //llamamos al método
                    break; 
                    case 7: 
                    System.out.println("Usted salió del programa");
                    break;
                default:
                    System.out.println("El número ingresado no corresponde a una opción"); 
                    break;
            }
        } while(caso != 7);
        scanner.close();
    }
}