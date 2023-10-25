import java.util.Scanner;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        try {
            Log meuLogger = new Log("Log.txt");
            meuLogger.logger.setLevel(Level.FINE);

            meuLogger.logger.warning("Iniciando a calculadora");

            try (Scanner leitura = new Scanner(System.in)) {
                Calculadora c = new Calculadora();
                float a = 0, b = 0, resultado = 0;
                String operador;
                System.out.println("Calculadora");
                do {
                    System.out.println("Insira o operador +, -, *, /");
                    operador = leitura.nextLine();
                } while (!(operador.contains("+") || operador.contains("-") || operador.contains("*")
                        || operador.contains("/")));

                System.out.println("Insira o 1o valor");
                a = leitura.nextFloat();
                System.out.println("Insira o 2o valor");
                b = leitura.nextFloat();

                resultado = c.calcular(a, b, operador.charAt(0));
                System.out.println("O resultado de " + a + " " + operador + " " + b + " é:" + resultado);
            }
            meuLogger.logger.warning("Terminando a calculadora");
        } catch (Exception exceptionA) {
        }
    }
}