
public class NextSort {

	
		 public static void bubble_srt1(int array[]) {
		        int n = array.length;
		        int k;
		        for (int m = n; m >= 0; m--) {
		            for (int i = 0; i < n - 1; i++) {
		                k = i + 1;
		                if (array[i] > array[k]) {
		                    swapNumbers1(i, k, array);
		                }
		            }
		            printNumbers1(array);
		        }
		    }
		  
		    private static void swapNumbers1(int i, int j, int[] array) {
		  
		        int temp;
		        temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		    }
		  
		    private static void printNumbers1(int[] input) {
		          
		        for (int i1 = 0; i1 < input.length; i1++) {
		            System.out.print(input[i1] + ", ");
		        }
		        System.out.println("\n");
		    }
		  
		    public static void main(String[] args) {
		        int[] input1 = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		        bubble_srt1(input1);
		  
		    }}
