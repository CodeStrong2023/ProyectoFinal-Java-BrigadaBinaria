import java.util.ArrayList;

public class AccionesClientes {
    /*
     * Método para agreagr clientes 
     * Método para mostrar su información 
     * Método para ordenarlos según: quién realizó más gastos en la tienda y alfabéticamente (nombre)
     * Método para buscar a alguien en específico según: DNI, nombre y apellido 
     */

    //MÉTODOS PARA BUSCAR CLIENTES
    //Método para asignarle el nombre personaN a los objetos que creen los usuarios por teclado 
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
