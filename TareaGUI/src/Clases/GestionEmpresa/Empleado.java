package Clases.GestionEmpresa;

/**
 *
 * @author Lino
 */
public abstract class Empleado {
    private String Nombre;
    private String Cedula;
    private double SueldoBase;
    private double HorasExtras;
    private double MinutosAtraso;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public double getHorasExtras() {
        return HorasExtras;
    }

    public void setHorasExtras(double HorasExtras) {
        this.HorasExtras = HorasExtras;
    }

    public double getMinutosAtraso() {
        return MinutosAtraso;
    }

    public void setMinutosAtraso(double MinutosAtraso) {
        this.MinutosAtraso = MinutosAtraso;
    }
    
    
    public Empleado(){}
    public Empleado(String Nombre, String Cedula, double SueldoBase, double HorasExtras, double MinutosAtraso) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.SueldoBase = SueldoBase;
        this.HorasExtras = HorasExtras;
        this.MinutosAtraso = MinutosAtraso;
    }
    
    
}
