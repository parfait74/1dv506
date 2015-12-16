package fs222mh_lab3;

public class Arrays {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5}; //Array to be used in examples
		
		int total = sum(data);
		System.out.print(total + "\n");
		
		String str = Arrays.toString(data);
		System.out.print("data = " + str + "\n");
		
		int[] rArray = reverse(data);
		System.out.print(toString(rArray) + "\n");
		
		int n = 4;
		System.out.print(hasN(data,n));


	}



	private static int sum(int[] arr) {
		int sum = 0;
		int i = 0;
		while (i < arr.length) {
			sum = sum + arr[i];
			i += 1;
		}
		return sum;
	
	}
	
	private static String toString(int[] arr) {
		String str = "";
		int i = 0;
		while (i < arr.length) {
			str = str+arr[i] + " ";
			i += 1;
		}
		
		return str;
	}
	
	private static int[] reverse(int[] arr) {
		int[] rArr = new int[arr.length];
		int i = 0;
		while (i < arr.length) {
			rArr[i] = arr[(arr.length-1)-i];
			i += 1;
		}
		return rArr;
	}
	
	private static boolean hasN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i += 1) {
			if (arr[i] == n) {
				return true;
			} 
		}
		return false;
	}
	
	private static void replaceAll(int[] arr, int old, int nw) {
		
	}
	
	
	
}