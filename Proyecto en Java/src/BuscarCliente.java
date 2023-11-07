import java.util.ArrayList;

public class BuscarCliente {
    //MÉTODOS PARA BUSCAR CLIENTES
    //Método para buscar a un cliente por nombre
    public static Cliente buscarClientePorNombre(ArrayList<Cliente> listaClientes, String nombreBuscado) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombreBuscado)){
                //Imprimimos los datos del cliente con este nombre
                System.out.println("\nEL CLIENTE FUE REGISTRADO ");
                System.out.println("DNI: " + cliente.getDni());
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Apellido: " + cliente.getApellido());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println(("Email: " + cliente.getEmail()));
                System.out.println("Total de gastos realizado en la tienda: " + cliente.getTotalCompra());
                System.out.println("Descuento: " + cliente.getDescuento());
                clienteEncontrado = cliente; 
            }
        }
            if (clienteEncontrado == null) {
                System.out.println("No se ha encontrado ningún cliente con ese nombre");
            }
            return clienteEncontrado; 
    }
    //Método para buscar a un cliente por el apellido
    public static Cliente buscarClientePorApellido(ArrayList<Cliente> listaClientes, String apellidoBuscado) {
        Cliente clienteEncontrado1 = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getApellido().equalsIgnoreCase(apellidoBuscado)){
                //Imprimimos los datos del cliente con este nombre
                System.out.println("\nEL CLIENTE FUE REGISTRADO ");
                System.out.println("DNI: " + cliente.getDni());
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Apellido: " + cliente.getApellido());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println(("Email: " + cliente.getEmail()));
                System.out.println("Total de gastos realizado en la tienda: " + cliente.getTotalCompra());
                System.out.println("Descuento: " + cliente.getDescuento());
                clienteEncontrado1 = cliente; 
            }
        }
            if (clienteEncontrado1 == null) {
                System.out.println("No se ha encontrado ningún cliente con ese apellido");
            }
            return clienteEncontrado1; 
    }
        //Método para buscar a un cliente por su dni
    public static Cliente buscarClientePorDni(ArrayList<Cliente> listaClientes, int dni) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dni) {
                return cliente;
            }
        }
        return null;
    }
}
