package bubblesort.Insertsort.Mergesort;

public class BubbleSort {
	/**
	 * BubbleSort ordenação de vetor 1
	 * 
	 * 
	 * 
	 * @param vet
	 */
	public void bubble_sort_v2(int[] vet) {
		
		//mostra o vetor original...
		System.out.println("Vetor original: "+retorno(vet));

		int aux = 0;
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}

		//mostra o vetor ordenado...
		System.out.println("Vetor ordenado: "+retorno(vet));
			
	}
	
	
	/**
	 * Retorna um vetor...
	 * 
	 * 
	 * @param vetor
	 * @return
	 */
	public String retorno(int[] vetor){
		String str = "[";
		for (int i = 0; i < vetor.length; i++) {
			if (i == vetor.length - 1) {
				str = str + vetor[i] + "]";
			} else {
				str = str + vetor[i] + " ";
			}
		}
		return str;
	}

}
