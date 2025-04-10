package array;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//          0 1 2 3
		int arr[]= {4,6,7,2};//
		
		int max=arr[0];//max=4
		
		for(int i=0; i<arr.length; i++) {//i=0,1,2,3,4     <4
			if(arr[i]<max) {//2>4
				max=arr[i];//max=7
			}
		}

		System.out.println(max);
	}

}
