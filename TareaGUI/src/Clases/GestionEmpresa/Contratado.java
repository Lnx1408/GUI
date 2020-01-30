package Clases.GestionEmpresa;

/**
 *
 * @author Lino
 */
public class Contratado extends Empleado{
    private boolean siAccesoComedor;
    
    public void setsiAccesoComedor(boolean siAccesoComedor){
        this.siAccesoComedor = siAccesoComedor;
    }
    public boolean getsiAccessoComedor(){
        return this.siAccesoComedor;
    }
    
    
    public Contratado(){}
    public Contratado(String Nombre, String Cedula, double SueldoBase, double HorasExtras, double MinutosAtraso,boolean siAccesoComedor){
        super(Nombre, Cedula, SueldoBase, HorasExtras, MinutosAtraso);
        this.siAccesoComedor = siAccesoComedor;
    }
    
    public double Calcular(double SueldoBase,double HorasExtras,double MinutosAtraso,boolean siAccesoComedor){
        double SueldoTotal=0;
        
        SueldoTotal +=SueldoBase;
        SueldoTotal +=(HorasExtras*10.50);
        SueldoTotal -=(MinutosAtraso*0.15);
        
        if(siAccesoComedor){
            SueldoTotal -= 20;
        }
        return SueldoTotal;
    }
}
