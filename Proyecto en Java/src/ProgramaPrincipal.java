import java.util.Scanner;
import java.util.ArrayList;

public class ProgramaPrincipal {
private static int contadorObjetos = 6;
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
    //Creamos clientes para mostrar su información
        //Objetos(personas) que representan a los clientes
        Cliente persona1 = new Cliente(46547662, "Angelina", "Pizzolatto", "2604749366", "angelinapizzolatto@gmail.com", 25000, 2500); 
        persona1.mostrarInformacionCliente();
        Cliente persona2 = new Cliente(42948039, "Martino", "Sorroche", "2604747856", "martinos@gmail.com", 42000, 4200); 
        persona2.mostrarInformacionCliente();
        Cliente persona3 = new Cliente(46546347, "Santiago", "Castro", "2604389433", "santicastro@gmail.com", 13000, 0);
        persona3.mostrarInformacionCliente();
        Cliente persona4 = new Cliente(46547662, "Julieta", "Martínez", "2604286544", "julimartinez13@gmail.com", 3000, 0);
        persona4.mostrarInformacionCliente();
        Cliente persona5 = new Cliente(46547662, "Fernanda", "López", "2604542755", "lopezfer45@gmail.com", 10000, 1000);
        persona5.mostrarInformacionCliente();
        Cliente persona6 = new Cliente(46547662, "Camila", "Gómez", "2604916352", "camigomez@gmail.com", 9900, 0);
        persona6.mostrarInformacionCliente();

        
        Scanner scanner = new Scanner(System.in);
        int i, descuento; 
        System.out.println("¿Cuántos clientes desea registrar?");
        int cantidadClientes = Integer.parseInt(scanner.nextLine()); 
        for (i=1; i <=cantidadClientes;i++) {
        //Le pedimos los datos al usuario 
        System.out.print("NOMBRE: ");
        String nombre = scanner.nextLine();

        System.out.print("APELLIDO: ");
        String apellido = scanner.nextLine();

        System.out.print("DNI: ");
        int dni = Integer.parseInt(scanner.nextLine());

        System.out.print("TELÉFONO: ");
        int telefono = Integer.parseInt(scanner.nextLine());

        System.out.print("EMAIL: ");
        String email = scanner.nextLine();

        System.out.print("TOTAL DE COMPRA: ");
        int totalCompra = Integer.parseInt(scanner.nextLine());
        if (totalCompra>=10000) {
            // Si la compra supera los $10.000 se le realiza un descuento del 10%
            descuento = (int) (totalCompra*0.1); 
        } else {
            //Si no hay descuento
            descuento = 0;  
        }
        System.out.println("Se registró correctamente el cliente N°" + (contadorObjetos+1)+"\n");
        
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
        int caso = Integer.parseInt(scanner.nextLine()); 
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
            } else {
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
            // Crear una instancia de la clase OrdenarClientes
            OrdenarClientes alfabetoClientes = new OrdenarClientes();
            // Mostrar la lista de clientes ordenada
            alfabetoClientes.ordenarClientesAlfabeto(listaClientes);
                    break;
            }
        // Crear una instancia de un objeto (por ejemplo, ProductoRopa)
        ClienteNuevo nuevoObjeto = new ClienteNuevo(nombre, apellido, dni, telefono, email, totalCompra, descuento);
        asignarNombreObjeto(nuevoObjeto); 
        contadorObjetos++; 

        // Mostrar la información del objeto y el nombre de la instancia
        nuevoObjeto.mostrarInformacionClienteNuevo();
    }
}
    //Método para asignarle el nombre personaN a los objetos que creen los usuarios por teclado 
    private static void asignarNombreObjeto(ClienteNuevo objeto) {
        objeto.setNombreInstancia("persona" + (contadorObjetos+1)); 
    }
}
