public abstract class Empleado {
protected String nombre;
protected String id;
protected double salarioBase;

public Empleado(String nombre,String id,double salarioBase){
    this.nombre = nombre;
    this.id = id;
    this.salarioBase = salarioBase;
}

public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String mostrarInformacion(){
        return String.format("Empleado llamado %s con id %s que gana %f",getNombre(),getId(),calcularSalario());
    }
}
