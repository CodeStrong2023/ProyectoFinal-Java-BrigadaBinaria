import java.util.Comparator; 

public class OrdenarClientes implements Comparator<Cliente> {
    @Override
    //Se ordenan los clientes (objetos) según el valor de nombre alfabéticamente 
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNombre().compareTo(cliente2.getNombre());
    } 
}
