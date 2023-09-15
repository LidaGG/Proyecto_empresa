import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.empleados = new ArrayList<>();
    }

    // Métodos para obtener y modificar el nombre de la empresa
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y modificar la dirección de la empresa
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos para obtener y modificar el teléfono de la empresa
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Métodos para obtener y modificar el NIT de la empresa
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    // Métodos para agregar, eliminar y listar empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void listarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre());
        }
    }

    // Otros métodos y propiedades de la empresa
}
