//import java.util.Scanner;

public class nuevo {
    int partition(int arr[], int low, int high) {
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

	void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	static 

    public static void main(String[ ] arg) {
        //int arr[] = { 20, 5, 11, 91, 14, 3 };
		

		//Scanner lectura = new Scanner (System.in);

		System.out.println("Ingrese número:");
		//int valor = lectura.nextInt();

		//System.out.println("Ingrese número:" + valor);


/*
		arr.add(valor);

		int n = arr.length;

		System.out.println("Before sorting array:");
		printArray(arr);

		nuevo qs = new nuevo();
		qs.sort(arr, 0, n - 1);

		System.out.println("After sorting array:");
		printArray(arr);
		*/
    }
}