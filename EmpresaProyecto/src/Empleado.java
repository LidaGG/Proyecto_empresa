public class Empleado {
    private String nombre;
    private String correo;
    private String empresa;
    private String rol;

    public Empleado(String nombre, String correo, String empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    // Métodos para obtener y modificar el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y modificar el correo del empleado
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Métodos para obtener y modificar la empresa a la que el empleado pertenece
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // Métodos para obtener y modificar el rol del empleado (administrador, operativo, etc.)
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Otros métodos y propiedades del empleado
}
