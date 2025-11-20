public class App {
    public static void main(String[] args) {

        Empleado omar = new EmpleadoFreelance("Omar", "1", 30000, 30, 200);
        System.out.println(omar.mostrarInformacion());
        Empleado pamela = new EmpleadoTiempoCompleto("Pamela","2",20000,20,"aazafata");
        System.out.println(pamela.mostrarInformacion());
        }
}
