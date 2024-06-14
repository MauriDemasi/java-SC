package Exceptions;

public class CalculateExceptions extends Exception {
    
    String descripcion;

    public CalculateExceptions(String descripcion) {
        setDescripcion(descripcion);
    }

    @Override
    public String getMessage() {
        return getDescripcion();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

}
