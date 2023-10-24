public class ClienteNuevo {
    String nombre;
    String apellido;
    int dni;
    int telefono;
    String email;
    int totalCompra;
    int descuento; 
    String nombreInstancia;

    public ClienteNuevo(String nombre, String apellido, int dni, int telefono, String email, int totalCompra, int descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.totalCompra = totalCompra;
        this.descuento = descuento; 
    }

    public void setNombreInstancia(String nombreInstancia) {
        this.nombreInstancia = nombreInstancia; 
    }
    //Método para mostrar la información de cada cliente 
            //Información del objeto y el nombre de la instancia
            public void mostrarInformacionClienteNuevo() {
                System.out.println("LISTA DE CLIENTES" + "\n");
                //System.out.println("Nombre de la instancia: " + nombreInstancia);
                System.out.println("NOMBRE: "+ this.nombre);
                System.out.println("APELLIDO: " + this.apellido);
                System.out.println("DNI: " + this.dni);
                System.out.println("TELÉFONO: " + this.telefono);
                System.out.println("EMAIL: " + this.email);
                System.out.println ("TOTAL DE COMPRA: " + this.totalCompra);
                System.out.println("DESCUENTO: " + this.descuento);
    }
}