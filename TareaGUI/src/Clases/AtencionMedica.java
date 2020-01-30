
package Clases;


public class AtencionMedica {
    
    private String NombreCliente;
    private String CedulaCliente;
    private String NombreDoctor;
    private String TipoAnimal;
    private String NombreAnimal;
    private int EdadAnimal;
    private String Diagnostico;
    private String PrescripcionMedica;
    private boolean RecibioVacuna;
    private String NombreVacuna;
    
    public AtencionMedica(){}

    public AtencionMedica(String NombreCliente, String CedulaCliente, String NombreDoctor, String TipoAnimal, String NombreAnimal, int EdadAnimal, String Diagnostico, String PrescripcionMedica, boolean RecibioVacuna, String NombreVacuna) {
        this.NombreCliente = NombreCliente;
        this.CedulaCliente = CedulaCliente;
        this.NombreDoctor = NombreDoctor;
        this.TipoAnimal = TipoAnimal;
        this.NombreAnimal = NombreAnimal;
        this.EdadAnimal = EdadAnimal;
        this.Diagnostico = Diagnostico;
        this.PrescripcionMedica = PrescripcionMedica;
        this.RecibioVacuna = RecibioVacuna;
        this.NombreVacuna = NombreVacuna;
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

    public String getNombreDoctor() {
        return NombreDoctor;
    }

    public void setNombreDoctor(String NombreDoctor) {
        this.NombreDoctor = NombreDoctor;
    }

    public String getTipoAnimal() {
        return TipoAnimal;
    }

    public void setTipoAnimal(String TipoAnimal) {
        this.TipoAnimal = TipoAnimal;
    }

    public String getNombreAnimal() {
        return NombreAnimal;
    }

    public void setNombreAnimal(String NombreAnimal) {
        this.NombreAnimal = NombreAnimal;
    }

    public int getEdadAnimal() {
        return EdadAnimal;
    }

    public void setEdadAnimal(int EdadAnimal) {
        this.EdadAnimal = EdadAnimal;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getPrescripcionMedica() {
        return PrescripcionMedica;
    }

    public void setPrescripcionMedica(String PrescripcionMedica) {
        this.PrescripcionMedica = PrescripcionMedica;
    }

    public boolean isRecibioVacuna() {
        return RecibioVacuna;
    }

    public void setRecibioVacuna(boolean RecibioVacuna) {
        this.RecibioVacuna = RecibioVacuna;
    }

    public String getNombreVacuna() {
        return NombreVacuna;
    }

    public void setNombreVacuna(String NombreVacuna) {
        this.NombreVacuna = NombreVacuna;
    }
    
    
   
    public String calcular(String TipoAnimal, boolean RecibioVacuna){
        String Animal;
        float Precio = 0;
        switch (TipoAnimal){
            case "Perro":
                Precio =12.50f;
                Animal= "perro ";
                break;
            case "Gato":
                Precio = 11.75f;
                Animal = "gato ";
                break;
            case "Conejo":
                Precio = 13.00f;
                Animal = "conejo ";
                break;
            default: Animal = "";
            
        }
         if(RecibioVacuna){
                Precio +=5.00f; 
            }
        return "El precio por la atencion del "+Animal + "es de: "+Precio;
    }
    
}
