package Clases.GestionEmpresa;

/**
 *
 * @author Lino
 */
public class Funcionario extends Empleado{
    private double DescuentoDeAsociacion;
    
    
    public Funcionario(){}
    public Funcionario(String Nombre, String Cedula, double SueldoBase, double HorasExtras, double MinutosAtraso,double DescuentoDeAsociacion){
        super(Nombre, Cedula, SueldoBase, HorasExtras, MinutosAtraso);
        this.DescuentoDeAsociacion=DescuentoDeAsociacion;
    } 
    
    
    public double Calcular(double SueldoBase,double HorasExtras,double MinutosAtraso,double DescuentoDeAsociacion){
        double SueldoTotal = 0;
        SueldoTotal += SueldoBase;
        SueldoTotal += (HorasExtras*15);
        SueldoTotal -= (MinutosAtraso*0.15);
        SueldoTotal -= DescuentoDeAsociacion;
        
        return SueldoTotal;
    }
}
