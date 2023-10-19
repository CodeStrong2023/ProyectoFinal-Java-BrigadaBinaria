public class ProgramaPrincipal {
    public static void main(String[] args) {
    //Creamos clientes para mostrar su información 
        //Objetos(personas) que representan a los clientes
        Cliente persona1 = new Cliente(46547662, "Angelina", "Pizzolatto", "2604749366", "angelinapizzolatto@gmail.com", 25000, 2500); 
        persona1.mostrarInformacion();
        Cliente persona2 = new Cliente(42948039, "Martino", "Sorroche", "2604747856", "martinos@gmail.com", 42000, 4200); 
        persona2.mostrarInformacion();
        Cliente persona3 = new Cliente(46546347, "Santiago", "Castro", "2604389433", "santicastro@gmail.com", 13000, 0);
        persona3.mostrarInformacion();
        Cliente persona4 = new Cliente(46547662, "Julieta", "Martínez", "2604286544", "julimartinez13@gmail.com", 3000, 0);
        persona4.mostrarInformacion();
        Cliente persona5 = new Cliente(46547662, "Fernanda", "López", "2604542755", "lopezfer45@gmail.com", 10000, 1000);
        persona5.mostrarInformacion();
        Cliente persona6 = new Cliente(46547662, "Camila", "Gómez", "2604916352", "camigomez@gmail.com", 9900, 0);
        persona6.mostrarInformacion();
    }
}
