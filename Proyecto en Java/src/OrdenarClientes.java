import java.util.Collections;
import java.util.Comparator;
import java.util.List; 

public class OrdenarClientes implements Comparator<Cliente> {
    //implementamos interfaz Comparator para personalizar nuestro ordenamiento
    @Override 
    //utilizamos el método compare para ir comparando entre dos objetos del tipo Cliente  
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNombre().compareTo(cliente2.getNombre());
    } 
    //Método para ordenar a los clientes alfabéticamente
    public void mostrarClientesOrdenadosAlfabeticamente(List<Cliente> listaClientes){
        //utilizamos el método Collections.sort para ordenar la lista de clientes según lo definido en el método compare (alfabéticamente)
        Collections.sort(listaClientes, this);
        System.out.println("LISTA DE CLIENTES EN ORDEN ALFABÉTICO");
        // Mostramos la lista ordenada
        System.out.println("Lista de todos los clientes ordenados alfabéticamente:");
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
    }

    //Método para ordenar la lista de clientes según quien realizó más gastos en la tienda
    public void mostrarClientesOrdenadosGasto(List<Cliente> listaClientes) {
        System.out.println("LISTA DE CLIENTES ORDENADOS POR TOTAL DE GASTOS RELIZADOS EN LA TIENDA");
        //Ordenamos la lista de clientes según el total de compras (de mayor a menor)
        listaClientes.sort(Comparator.comparingDouble(Cliente::getTotalCompra).reversed());
        // Mostrar la lista ordenada
        for (Cliente cliente : listaClientes) {
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Total de gastos realizado en la tienda: " + cliente.getTotalCompra());
        System.out.println("Descuento: " + cliente.getDescuento());
        System.out.println("\n");
        }
    }
}