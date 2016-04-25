package bubblesort.Insertsort.Mergesort;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lista[];
		
		lista = new int[6];
		
		lista[0] = 5;
		lista[1] = 2;
		lista[2] = 4;
		lista[3] = 6;
		lista[4] = 1;
		lista[5] = 3;
		
		BubbleSort bubble = new BubbleSort();
		
		//bubble.bubble_sort_v1(lista);
		bubble.bubble_sort_v2(lista);
		

	}


}
