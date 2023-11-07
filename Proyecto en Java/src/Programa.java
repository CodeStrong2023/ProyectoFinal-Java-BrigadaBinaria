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
            listaClientes.add(new Cliente(46546347, "Franco", "Romero", "2604389433", "santicastro@gmail.com", 10000));
            listaClientes.add(new Cliente(43765994, "Fernanda", "Torres", "2604542755", "lopezfer45@gmail.com", 5000));
            listaClientes.add(new Cliente(34564704, "Camila", "Flores", "2604916352", "camigomez@gmail.com", 9900));
            listaClientes.add(new Cliente(19446237, "Julieta", "Lombardi", "2604286544", "julimartinez13@gmail.com", 3000));
        System.out.println("REGISTRO DE CLIENTES - TIENDA DE ROPA");
        System.out.println("¿Cuántos clientes adicionales desea ingresar?");
        int cantidadNuevosClientes = scanner.nextInt();
        scanner.nextLine(); // Consumimos la nueva línea

        // Agregar nuevos clientes
        for (int i = 1; i <= cantidadNuevosClientes; i++) {
            Cliente cliente = Cliente.ingresarCliente(scanner, i + cantidadInicialClientes);
            listaClientes.add(cliente);
        }
        
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
        int caso = 0; 
        switch (caso) {
            case 1:
            System.out.println("BUSCAR CLIENTE POR NOMBRE");
                // Llamar al método buscarPorNombre
                System.out.println("Ingrese el nombre del cliente a buscar");
                String nombreBuscado = scanner.nextLine(); 
                Cliente clientePorNombre = BuscarCliente.buscarPorNombre(listaClientes,nombreBuscado);
                if (clientePorNombre != null) {
                    System.out.println("Cliente encontrado por nombre: " + clientePorNombre);
            }   else {
                    System.out.println("Cliente no encontrado por nombre.");
            }
                break;

            case 2: 
            System.out.println("BUSCAR CLIENTE POR APELLIDO");
                // Llamar al método buscarClientePorNombre
                System.out.println("Ingrese el nombre del cliente a buscar");
                String apellidoBuscado = scanner.nextLine(); 
                Cliente clientePorApellido = BuscarCliente.buscarPorApellido(listaClientes,apellidoBuscado); 
                if (clientePorApellido != null) {
                    System.out.println("Cliente encontrado por nombre: " + clientePorApellido);
            }   else {
                    System.out.println("Cliente no encontrado por nombre.");
            }
                break; 

            case 3:  
                System.out.println("Buscar cliente por DNI");
                System.out.println("Ingrese el DNI a buscar");
                int dniBuscado = Integer.parseInt(scanner.nextLine());
                Cliente clientePorDni = BuscarCliente.buscarClientePorDni(listaClientes, dniBuscado);
                if (clientePorDni != null) {
                System.out.println("Cliente encontrado por DNI: " + clientePorDni);
            }   else {
                System.out.println("Cliente no encontrado por DNI.");
                break;
            }
            case 4:
                System.out.println("LISTA DE CLIENTES EN ORDEN DE REGISTRO");
                // Mostrar todos los clientes
                System.out.println("Lista de todos los clientes:");
                System.out.println("\n");
                for (Cliente cliente : listaClientes) {
                    System.out.println("DNI: " + cliente.getDni());
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Apellido: " + cliente.getApellido());
                    System.out.println("Teléfono: " + cliente.getTelefono());
                    System.out.println("Email: " + cliente.getEmail());
                    System.out.println("Total de gasto realizado en la tienda: " + cliente.getTotalCompra());
                    System.out.println("Descuento: " + cliente.getDescuento());
            }
                break;  

            case 5:
                // Creamos una instancia de la clase OrdenarClientes
                OrdenarClientes alfabetoClientes = new OrdenarClientes();
                // Mostrar la lista de clientes ordenada alabéticamente
                alfabetoClientes.ordenarClientesAlfabeto(listaClientes);
                break;

            case 6:
                // Creamos una instancia de la clase OrdenarClientes
                OrdenarClientes gastoClientes = new OrdenarClientes();
                // Mostramos la lista de clientes ordenada según quien realizó más gastos
                gastoClientes.mostrarClientesOrdenadosGasto(listaClientes); //llamamos al método
                break; 
            }
    }
}
