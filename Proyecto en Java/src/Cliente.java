import java.util.Scanner;

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
    public Cliente(int dni, String nombre, String apellido, String telefono, String email, double totalCompra) {
        this.dni = dni; 
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.telefono = telefono; 
        this.email = email;
        this.totalCompra = totalCompra;
        //Se le aplica un descuento del 10% si la compra supera los $15.000
        if (totalCompra >= 15000) {
            this.descuento = totalCompra * 0.10;
        } else {
            this.descuento = 0; 
        }
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

    // Método para obtener un nuevo objeto del tipo Cliente (cargados por teclado)
    public static Cliente ingresarCliente(Scanner scanner, int numeroCliente) {
        System.out.println("Ingrese el DNI del cliente " + numeroCliente + ":");
        int dni = scanner.nextInt();

        System.out.println("Ingrese el nombre del cliente " + numeroCliente + ":"); 
        String nombre = scanner.next(); 

        System.out.println("Ingrese el apellido del cliente " + numeroCliente + ":");
        String apellido = scanner.next();

        System.out.println("Ingrese el número telefónico del cliente " + numeroCliente + ":");
        String telefono = scanner.next();

        System.out.println("Ingrese el mail del cliente " + numeroCliente + ":");
        String email = scanner.next();

        System.out.println("Ingrese el total de compra del cliente " + numeroCliente + ":");
        double totalCompra = scanner.nextDouble();

        scanner.nextLine(); 
        return new Cliente(dni,nombre, apellido, telefono, email, totalCompra); 
    }
}