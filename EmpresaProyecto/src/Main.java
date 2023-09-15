import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de Empresa, Empleado y ManejoDinero
        Empresa empresa = new Empresa("Mi Empresa", "123 Calle Principal", "123-456-7890", "NIT123456");
        Empleado empleado = new Empleado("Juan Pérez", "juan@example.com", "Mi Empresa", "Operativo");
        ManejoDinero manejoDinero = new ManejoDinero(1000.0, "Venta de producto", "Usuario1");

        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Leer/Modificar Empresa");
            System.out.println("2. Leer/Modificar Empleado");
            System.out.println("3. Leer/Modificar Manejo de Dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Menú para Empresa
                    System.out.println("Empresa:");
                    System.out.println("Nombre: " + empresa.getNombre());
                    System.out.println("Dirección: " + empresa.getDireccion());
                    System.out.println("Teléfono: " + empresa.getTelefono());
                    System.out.println("NIT: " + empresa.getNit());
                    System.out.print("¿Desea modificar la empresa? (S/N): ");
                    String modificarEmpresa = scanner.nextLine().trim();
                    if (modificarEmpresa.equalsIgnoreCase("S")) {
                        System.out.print("Nuevo nombre: ");
                        empresa.setNombre(scanner.nextLine());
                        System.out.print("Nueva dirección: ");
                        empresa.setDireccion(scanner.nextLine());
                        System.out.print("Nuevo teléfono: ");
                        empresa.setTelefono(scanner.nextLine());
                        System.out.print("Nuevo NIT: ");
                        empresa.setNit(scanner.nextLine());
                    }
                    break;
                case 2:
                    // Menú para Empleado
                    System.out.println("Empleado:");
                    System.out.println("Nombre: " + empleado.getNombre());
                    System.out.println("Correo: " + empleado.getCorreo());
                    System.out.println("Empresa: " + empleado.getEmpresa());
                    System.out.println("Rol: " + empleado.getRol());
                    System.out.print("¿Desea modificar el empleado? (S/N): ");
                    String modificarEmpleado = scanner.nextLine().trim();
                    if (modificarEmpleado.equalsIgnoreCase("S")) {
                        System.out.print("Nuevo nombre: ");
                        empleado.setNombre(scanner.nextLine());
                        System.out.print("Nuevo correo: ");
                        empleado.setCorreo(scanner.nextLine());
                        System.out.print("Nueva empresa: ");
                        empleado.setEmpresa(scanner.nextLine());
                        System.out.print("Nuevo rol: ");
                        empleado.setRol(scanner.nextLine());
                    }
                    break;
                case 3:
                    // Menú para ManejoDinero
                    System.out.println("Manejo de Dinero:");
                    System.out.println("Monto: " + manejoDinero.getMonto());
                    System.out.println("Concepto: " + manejoDinero.getConcepto());
                    System.out.println("Encargado: " + manejoDinero.getEncargado());
                    System.out.print("¿Desea modificar el manejo de dinero? (S/N): ");
                    String modificarManejoDinero = scanner.nextLine().trim();
                    if (modificarManejoDinero.equalsIgnoreCase("S")) {
                        System.out.print("Nuevo monto: ");
                        double nuevoMonto = scanner.nextDouble();
                        manejoDinero.setMonto(nuevoMonto);
                        scanner.nextLine(); // Consumir el salto de línea
                        System.out.print("Nuevo concepto: ");
                        manejoDinero.setConcepto(scanner.nextLine());
                        System.out.print("Nuevo encargado: ");
                        manejoDinero.setEncargado(scanner.nextLine());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
