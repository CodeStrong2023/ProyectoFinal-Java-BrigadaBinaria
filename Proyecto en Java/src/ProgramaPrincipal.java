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
    public static Cliente buscarPorNombre(ArrayList<Cliente> clientes, String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }   
    //Método para buscar a un cliente por el apellido 
    public static Cliente buscarPorApellido(ArrayList<Cliente> clientes, String apellido) {
        for (Cliente cliente : clientes) {
            if (cliente.getApellido().equalsIgnoreCase(apellido)) {
                return cliente;
            }
        }
        return null;
        }
    public static Cliente buscarClientePorDni(ArrayList<Cliente> listaClientes, int dni) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dni) {
                return cliente;
            }
        }
        return null;
    }
}