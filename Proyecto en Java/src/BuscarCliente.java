import java.util.ArrayList;

public class BuscarCliente {
    //MÉTODOS PARA BUSCAR CLIENTES
    //Método para buscar a un cliente por nombre
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
