import java.util.Scanner;
import java.util.*;

public class segundo {

    List<Integer> ejemploLista = new ArrayList<Integer>();

    static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

    void Agregar(){
        Scanner lectura = new Scanner (System.in);

		System.out.println("Ingrese valor:");
		Integer valor = lectura.nextInt();

        ejemploLista.add(valor);
    }

    int partition(Integer arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	void sort(Integer arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

    static void printArray(Integer arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

    public static void main(String[ ] arg) {

        segundo obj = new segundo();
        Scanner sc = new Scanner (System.in);
        boolean salida = false;

        while(salida == false){
            obj.Agregar();

            System.out.println("Desea agregar otro valor? s / n");
		    String otroValor = sc.next();

            if(otroValor.equals("n")){
                salida = true;
            }
        }

        Integer[] array = new Integer[obj.ejemploLista.size()];

        for(int i = 0; i < obj.ejemploLista.size(); i++) {
            array[i] = obj.ejemploLista.get(i);
        }
            
        obj.sort(array, 0, array.length - 1);

        printArray(array);

    }
}