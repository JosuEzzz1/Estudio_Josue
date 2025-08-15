public class Metodo_Burbuja {
        public static void main(String[] args) {
            int[] numeros = {5, 1, 4, 2, 8};

            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }

            for (int num : numeros) {
                System.out.print(num + " ");
            }
        }
    }

