package PracticoEntregable01Ejercicio1;

import java.util.Scanner;

public class InteraccionUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecución (limite 5) " + (i + 1));

            System.out.print("Ingrese primer valor: ");
            int valor1 = scanner.nextInt();

            System.out.print("Ingrese segundo valor: ");
            int valor2 = scanner.nextInt();

            System.out.print("Seleccione una Operación (+, -, *, /): ");
            String operacion = scanner.next();

            int resultado = 0;

            switch (operacion) {
                case "+":
                    resultado = calculadora.suma(valor1, valor2);
                    break;
                case "-":
                    resultado = calculadora.resta(valor1, valor2);
                    break;
                case "*":
                    resultado = calculadora.multiplicacion(valor1, valor2);
                    break;
                case "/":
                    try {
                        resultado = (int) calculadora.division(valor1, valor2);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;  // Reinicia el bucle si hay un error en la división
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
                    continue;  // Reinicia el bucle si la operación no es válida
            }

            System.out.println("Resultado: " + resultado);

            if (resultado < 0) {
                System.out.println("Tené cuidado, el resultado es negativo!");
            } else if (resultado >= 0 && resultado < 10000) {
                System.out.println("Resultado dentro de los límites");
            } else {
                System.out.println("Error, resultado muy grande");
            }
        }

        scanner.close();
    }

}
