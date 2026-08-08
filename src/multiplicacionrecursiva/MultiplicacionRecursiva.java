package multiplicacionrecursiva;

public class MultiplicacionRecursiva {

    public static void main(String[] args) {

        int[] arr1 = {5, 8, 9, 2};
        int[] arr2 = {5, 9, 2, 2};
        int[] resultado = new int[arr1.length];

        multiplicacionValores(arr1, arr2, resultado, 0);

        System.out.println("Multiplicacion de los elementos:");

        for (int i = 0; i < resultado.length; i++) {
            System.out.print("[" + resultado[i] + "] ");
        }

        System.out.println();
    }

    public static void multiplicacionValores(
            int[] arr1,
            int[] arr2,
            int[] resultado,
            int posicion) {

        if (posicion == arr1.length) {
            return;
        }

        resultado[posicion] = arr1[posicion] * arr2[posicion];

        multiplicacionValores(arr1, arr2, resultado, posicion + 1);
    }
}