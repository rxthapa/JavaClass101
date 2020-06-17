import java.util.Arrays;

public class Array1 {
	

		public static void main(String[] args){
			

			int[] myAry = {5,5,40,15,20,25,30,35};
			
			
			
			
			
			System.out.println(Arrays.binarySearch(myAry, 35));
			
			
			Arrays.sort(myAry);
			
			System.out.println(Arrays.toString(myAry));
			System.out.println(Arrays.binarySearch(myAry, 40));
			
			int[] newArray = new int[4];
			
			String[] myAnotherArray = {"names", "test"};
			
			
			
			
			System.out.println(Arrays.toString(myAry));
			System.out.println(Arrays.toString(myAnotherArray));
			Arrays.sort(myAry);
			System.out.println(Arrays.toString(myAry));
			
			//System.out.println(Arrays.so);
			
			int max = myAry[0];
			int min = myAry[0];
			
			
			for( int i= 0; i<myAry.length; i++  ) {
				
				if(myAry[i]>max) {
					
					max = myAry[i];
				}
				if(min>myAry[i]) {
					min = myAry[i];
				}
			
		}
			System.out.println("Max number is  "+ max);
			System.out.println("Min number is  "+ min);
	}
}
