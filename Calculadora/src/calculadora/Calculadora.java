package calculadora;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return Double.NaN;
        }
        return a / b;
    }

    public double seno(double grados) {
        return Math.sin(Math.toRadians(grados));
    }

    public double coseno(double grados) {
        return Math.cos(Math.toRadians(grados));
    }

    public double tangente(double grados) {
        double rad = Math.toRadians(grados);
        if (Math.cos(rad) == 0) {
            System.out.println("Error: Tangente indefinida");
            return Double.NaN;
        }
        return Math.tan(rad);
    }

    public double raizN(double numero, double indice) {
        if (numero < 0 && indice % 2 == 0) {
            System.out.println("Error: Resultado imaginario");
            return Double.NaN;
        }
        return Math.pow(numero, 1.0 / indice);
    }

    public double potenciaN(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double calcularIVA(double valor, double porcentaje) {
        return valor * (porcentaje / 100.0);
    }
}

