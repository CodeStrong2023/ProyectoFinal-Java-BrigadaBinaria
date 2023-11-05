import java.util.Collections;
import java.util.Comparator;
import java.util.List; 

public class OrdenarClientes implements Comparator<Cliente> {
    @Override
    //Se ordenan los clientes (objetos) según el valor de nombre alfabéticamente 
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNombre().compareTo(cliente2.getNombre());
    } 
    //Método para ordenar a los clientes alfabéticamente
    public void ordenarClientesAlfabeto(List<Cliente> listaClientes){
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
        }
    }
}
