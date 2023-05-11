package task1;

public class ArrayDuplicates {
	public static int removeDuplicates(String arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
       
        int j = 0;
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
       
        arr[j++] = arr[n-1];
       
        return j;
    }
	public static void main(String args[]) {
		String []array = {"a","a","b","b","c","c","d","d"};
		int length = array.length;
		length = removeDuplicates(array, length);
		for(int i=0;i<length;i++) 
			System.out.println(array[i]);			
	}
}
