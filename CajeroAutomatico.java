import java.util.Scanner; // 📥 Importa la clase Scanner para leer datos del usuario

public class CajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 1000.0; // 💸 Saldo inicial (tipo inferido por Java)
        Scanner scanner = new Scanner(System.in); // 🧾 Scanner para leer entrada por consola
        int opcion; // 🔢 Variable para guardar la opción del menú

        // 🔁 Inicia el bucle del menú, se repetirá hasta que el usuario elija salir (opción 4)
        do {
            // 📋 Mostrar el menú de opciones
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt(); // 🎯 Leer la opción ingresada por el usuario

            // 🧠 Estructura switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    // ✅ Opción 1: Consultar saldo
                    System.out.println("💼 Tu saldo actual es: $" + saldo);
                    break; // 🔚 Sale del switch

                case 2:
                    // 💰 Opción 2: Depositar dinero
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble(); // 💵 Leer el monto a depositar

                    if (deposito <= 0) {
                        // ⚠️ Validación: el monto debe ser mayor a cero
                        System.out.println("⚠️ El monto debe ser mayor a cero.");
                        continue; // 🔁 Saltar al inicio del bucle sin continuar con el resto del código
                    }

                    saldo += deposito; // ➕ Sumar el depósito al saldo
                    System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 3:
                    // 💸 Opción 3: Retirar dinero
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble(); // 💵 Leer el monto a retirar

                    if (retiro <= 0) {
                        // ⚠️ Validación: el monto debe ser mayor a cero
                        System.out.println("⚠️ El monto debe ser mayor a cero.");
                        continue; // 🔁 Volver al menú sin hacer más
                    }

                    if (retiro > saldo) {
                        // ❌ Validación: no hay suficiente saldo
                        System.out.println("❌ Saldo insuficiente. No se puede realizar el retiro.");
                    } else {
                        saldo -= retiro; // ➖ Restar el retiro del saldo
                        System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;

                case 4:
                    // 👋 Opción 4: Salir
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break; // 🔚 Sale del switch

                default:
                    // ❗ Opción inválida (no está entre 1 y 4)
                    System.out.println("❗ Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 4); // 🔁 Condición para seguir mostrando el menú (mientras no elija salir)

        scanner.close(); // 🔒 Cierra el scanner para liberar recursos
    }
}

