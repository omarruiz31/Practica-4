public class EmpleadoTiempoCompleto extends Empleado implements Beneficiable{
    private int antiguedad;
    private String departamento;

    public EmpleadoTiempoCompleto(String nombre,String id,double salarioBase,int antiguedad,String departamento){
        super(nombre,id,antiguedad);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public double calcularSalario() {
        return getSalarioBase() + calcularBonificacion() ;
    }

    public double calcularBonificacion(){
        return getSalarioBase() * 0.10 * antiguedad;
    }

    public double aplicarDescuentoSeguro(){
        return calcularSalario() * 0.05;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
