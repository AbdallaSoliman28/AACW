package task2;
import java.util.Arrays;

public class ArrayEquals {
	public static void main(String args[]) {
		  int[] a = new int[] {1, 5, 7, 9};
		  int[] b = new int[] {9, 5, 1, 7};
		  int[] c = new int[] {1, 6, 7, 5};
		      
		  Arrays.sort(a);
		  Arrays.sort(b);
		  Arrays.sort(c);

		  boolean result = Arrays.equals(a,c);
		  System.out.println("Array are equal " + result);
	} 
}
