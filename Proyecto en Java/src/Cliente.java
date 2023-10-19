//la clase cliente será la clase base de nuestro Proyecto
public class Cliente {
    // Atributos 
    int dni; //el dni sería como un id, ya que es un identificador único que no se repite
    String nombre; 
    String apellido; 
    String telefono; 
    String email; 
    double totalCompra; 
    double descuento; 
    // Métodos 
    // Método constructor vacío 
    public Cliente() {
    }
    // Método constructor con sus parámetros
    public Cliente(int dni, String nombre, String apellido, String telefono, String email, double totalCompra, double descuento) {
        this.dni = dni; 
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.telefono = telefono; 
        this.email = email;
        this.totalCompra = totalCompra; 
        this.descuento = descuento;
    }
    //Getters y Setters de cada atributo 
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getTotalCompra() {
        return totalCompra;
    }
    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    //Método para mostrar la información de cada cliente 
            //Información del objeto y el nombre de la instancia
            public void mostrarInformacion() {
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