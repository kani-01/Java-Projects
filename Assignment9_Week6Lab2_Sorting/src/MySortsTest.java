import java.util.Random;
public class MySortsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[25];
		int[] selection_sorted_array = new int[25];
		int[] bubble_sorted_array = new int[25];
		int[] selection1_sorted_array = new int[25];
		int[] bubble1_sorted_array = new int[25];
		Random sortRandom = new Random();
		
		for(int i=0;i<array.length;i++)
		array[i]=sortRandom.nextInt(100);
		
		System.out.println("Original Array:");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+"\t");
		System.out.println();
		
		selection_sorted_array = MySorts.selectionsort(array);
		System.out.println("Sorted Array using Selection sort:");
		for(int i=0;i<selection_sorted_array.length;i++)
			System.out.print(selection_sorted_array[i]+"\t");
		System.out.println();
		
		bubble_sorted_array = MySorts.bubblesort(array);
		System.out.println("Sorted Array using Bubble sort:");
		for(int i=0;i<bubble_sorted_array.length;i++)
			System.out.print(bubble_sorted_array[i]+"\t");
		System.out.println();
	
		selection1_sorted_array = MySorts.selectionsort1(array);
		System.out.println("Sorted Array using Selection1 sort:");
		for(int i=0;i<selection1_sorted_array.length;i++)
			System.out.print(selection1_sorted_array[i]+"\t");
		
		bubble1_sorted_array = MySorts.BubbleSort1(array);
		System.out.println("Sorted Array using Bubble1 sort:");
		for(int i=0;i<bubble1_sorted_array.length;i++)
			System.out.print(bubble1_sorted_array[i]+"\t");
	}
}
