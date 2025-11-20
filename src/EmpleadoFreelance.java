public class EmpleadoFreelance extends Empleado implements Beneficiable {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String nombre,String id,double salarioBase, int horasTrabajadas,double tarifaHora){
        super(nombre,id,salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSalario(){
        return (horasTrabajadas * tarifaHora ) + calcularBonificacion();
    }

    public double calcularBonificacion(){
        if (horasTrabajadas > 160){
            return getSalarioBase() * .05;
        }
        else
            return 0;
    }

    public double aplicarDescuentoSeguro(){
        return calcularSalario() * 0.03;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
}
