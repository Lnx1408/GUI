package Clases;

import java.util.List;

public class Mantenimiento {
    private String NombreCliente;
    private String CedulaCliente;
    private String NombreMecanico;
    private String TipoVehiculo;
    private String Diagnosticos;
    private String TrabajosRealizados;
    private Object FechaMantenimiento;
    private String TipoMantenimiento;
    private String RepuestosUsados;
    private double ValorRepuesto;
    private String ServiciosAdicionales;
    
    public Mantenimiento(){}

    public Mantenimiento(String NombreCliente, String CedulaCliente, String NombreMecanico, String TipoVehiculo, String Diagnosticos, String TrabajosRealizados, Object FechaMantenimiento, String TipoMantenimiento, String RepuestosUsados, double ValorRepuesto, String ServiciosAdicionales) {
        this.NombreCliente = NombreCliente;
        this.CedulaCliente = CedulaCliente;
        this.NombreMecanico = NombreMecanico;
        this.TipoVehiculo = TipoVehiculo;
        this.Diagnosticos = Diagnosticos;
        this.TrabajosRealizados = TrabajosRealizados;
        this.FechaMantenimiento = FechaMantenimiento;
        this.TipoMantenimiento = TipoMantenimiento;
        this.RepuestosUsados = RepuestosUsados;
        this.ValorRepuesto = ValorRepuesto;
        this.ServiciosAdicionales = ServiciosAdicionales;
    }
    
    

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public String getNombreMecanico() {
        return NombreMecanico;
    }

    public void setNombreMecanico(String NombreMecanico) {
        this.NombreMecanico = NombreMecanico;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getDiagnosticos() {
        return Diagnosticos;
    }

    public void setDiagnosticos(String Diagnosticos) {
        this.Diagnosticos = Diagnosticos;
    }

    public String getTrabajosRealizados() {
        return TrabajosRealizados;
    }

    public void setTrabajosRealizados(String TrabajosRealizados) {
        this.TrabajosRealizados = TrabajosRealizados;
    }

    public Object getFechaMantenimiento() {
        return FechaMantenimiento;
    }

    public void setFechaMantenimiento(String FechaMantenimiento) {
        this.FechaMantenimiento = FechaMantenimiento;
    }

    public String getTipoMantenimiento() {
        return TipoMantenimiento;
    }

    public void setTipoMantenimiento(String TipoMantenimiento) {
        this.TipoMantenimiento = TipoMantenimiento;
    }

    public String getRepuestosUsados() {
        return RepuestosUsados;
    }

    public void setRepuestosUsados(String RepuestosUsados) {
        this.RepuestosUsados = RepuestosUsados;
    }

    public double getValorRepuesto() {
        return ValorRepuesto;
    }

    public void setValorRepuesto(double ValorRepuesto) {
        this.ValorRepuesto = ValorRepuesto;
    }

    public String getServiciosAdicionales() {
        return ServiciosAdicionales;
    }

    public void setServiciosAdicionales(String ServiciosAdicionales) {
        this.ServiciosAdicionales = ServiciosAdicionales;
    }
    
    public double Calcular(String TipoAuto,String TipoMant,List<String> ElementosSeleccionados){
        String Auto;
        float Precio = 0;
        switch (TipoAuto){
            case "Auto":
                Precio =10f;
                Auto= "auto ";
                break;
            case "Camioneta":
                Precio = 11.75f;
                Auto = "camioneta ";
                break;
            case "Furgon":
                Precio = 13.75f;
                Auto = "furgon ";
                break;
            default: Auto = "";
            
        }
         if(TipoMant.equals("Correctivo")){
                Precio +=ValorRepuesto; 
            }
        
            if(ElementosSeleccionados.contains("Lavado")){
                Precio+=1.20f;
            }
            if(ElementosSeleccionados.contains("Alineacion")){
                Precio+=2.25f;
            }
           if(ElementosSeleccionados.contains("Pintar")){
               Precio+=1.30f;
           }
           if(ElementosSeleccionados.contains("Inflar llanta")){
               Precio+=1.70f;
           }
          
        return Precio;
    }
}
