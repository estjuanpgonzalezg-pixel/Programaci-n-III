package calculadora;

import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int op;
        
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Operaciones básicas");
            System.out.println("2. Trigonometría");
            System.out.println("3. Radicación");
            System.out.println("4. Potenciación");
            System.out.println("5. Calcular IVA");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            op = scan.nextInt();

            switch(op) {
                case 1:
                    System.out.print("Ingrese primer número: ");
                    double a = scan.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    double b = scan.nextDouble();
                    System.out.println("Suma: " + calc.sumar(a, b));
                    System.out.println("Resta: " + calc.restar(a, b));
                    System.out.println("Multiplicación: " + calc.multiplicar(a, b));
                    System.out.println("División: " + calc.dividir(a, b));
                    break;
                    
                case 2:
                    System.out.print("Ingrese un ángulo en grados: ");
                    double grados = scan.nextDouble();
                    System.out.println("Seno: " + calc.seno(grados));
                    System.out.println("Coseno: " + calc.coseno(grados));
                    System.out.println("Tangente: " + calc.tangente(grados));
                    break;
                    
                case 3:
                    System.out.print("Ingrese número: ");
                    double num = scan.nextDouble();
                    System.out.print("Ingrese índice de raíz: ");
                    double indice = scan.nextDouble();
                    System.out.println("Resultado: " + calc.raizN(num, indice));
                    break;
                    
                case 4:
                    System.out.print("Ingrese base: ");
                    double base = scan.nextDouble();
                    System.out.print("Ingrese exponente: ");
                    double exp = scan.nextDouble();
                    System.out.println("Resultado: " + calc.potenciaN(base, exp));
                    break;
                    
                case 5:
                    System.out.print("Ingrese valor: ");
                    double valor = scan.nextDouble();
                    System.out.print("Ingrese porcentaje IVA: ");
                    double porcentaje = scan.nextDouble();
                    System.out.println("IVA: " + calc.calcularIVA(valor, porcentaje));
                    break;
                    
                case 6:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción inválida.");
            }
        } while(op != 6);
        
        scan.close();
    }
}