package Jardineria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Inserción");
            System.out.println("2. Actualización");
            System.out.println("3. Borrado");
            System.out.println("4. Consultas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    menuInsercion();
                    break;
                case 2:
                    menuActualizacion();
                    break;
                case 3:
                    menuBorrado();
                    break;
                case 4:
                    menuConsultas();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

    }

    public static void menuInsercion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú de Inserción -----");
            System.out.println("1. Inserción de Oficina");
            System.out.println("2. Inserción de Empleado");
            System.out.println("3. Inserción de Gama de Producto");
            System.out.println("4. Inserción de Cliente");
            System.out.println("5. Inserción de Pedido");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    insertarOficina();
                    break;
                case 2:
                    insertarEmpleado();
                    break;
                case 3:
                    insertarGamaProducto();
                    break;
                case 4:
                    insertarCliente();
                    break;
                case 5:
                    insertarPedido();
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 6);

    }

    public static void menuActualizacion() {
        // Implementación similar al menú de inserción
    }

    public static void menuBorrado() {
        // Implementación similar al menú de inserción
    }

    public static void menuConsultas() {
        // Implementación similar al menú de inserción
    }

    // Métodos de inserción para cada tabla
    
    
    
    
    public static void insertarOficina() {
    	// creamos las variables para poder introducir mas tarde los campos
    	String codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2;
    	
    	// pedimos todos los datos por teclado
    	System.out.println("Insertar codigo oficina");
    	codigo_oficina = new Scanner(System.in).nextLine();
    	System.out.println("Insertar ciudad");
    	ciudad = new Scanner(System.in).nextLine();
    	System.out.println("Insertar pais");
    	pais= new Scanner(System.in).nextLine();
    	System.out.println("Insertar region");
    	region = new Scanner(System.in).nextLine();
    	System.out.println("Insertar codigo postal");
    	codigo_postal = new Scanner(System.in).nextLine();
    	System.out.println("Insertar telefono");
    	telefono = new Scanner(System.in).nextLine();
    	System.out.println("Insertar linea direccion 1");
    	linea_direccion1 = new Scanner(System.in).nextLine();
    	System.out.println("Insertar linea direccion 2");
    	linea_direccion2= new Scanner(System.in).nextLine();
    	
        System.out.println("Método de inserción de Oficina");
        // Lógica para insertar una oficina en la base de datos
        try {
            Connection connection = BDManager.getConnection();
            // Preparar la sentencia SQL
            String query = "INSERT INTO oficina (codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Establecer los valores de los parámetros
            statement.setString(1, codigo_oficina);
            statement.setString(2, ciudad);
            statement.setString(3, pais);
            statement.setString(4, region);
            statement.setString(5, codigo_postal);
            statement.setString(6, telefono);
            statement.setString(7, linea_direccion1);
            statement.setString(8, linea_direccion2);

            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Oficina insertada correctamente.");
            } else {
                System.out.println("No se pudo insertar la oficina.");
            }

            // Cerrar la conexión
            BDManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public static void insertarEmpleado() {
        System.out.println("Método de inserción de Empleado");
        // Lógica para insertar un empleado en la base de datos
    }

    public static void insertarGamaProducto() {
        System.out.println("Método de inserción de Gama de Producto");
        // Lógica para insertar una gama de producto en la base de datos
    }

    public static void insertarCliente() {
        System.out.println("Método de inserción de Cliente");
        // Lógica para insertar un cliente en la base de datos
    }

    public static void insertarPedido() {
        System.out.println("Método de inserción de Pedido");
        // Lógica para insertar un pedido en la base de datos
    }


    
    
    
    // Métodos similares para las operaciones de actualización, borrado y consultas...
}

