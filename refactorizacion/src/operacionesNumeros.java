import java.util.List;

public class operacionesNumeros {
    public void realizarOperaciones(List<Integer> numeros) {
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int numero : numeros) {
            suma += numero;
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        double media = (double) suma / numeros.size();

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Promedio: " + media);
    }
}

