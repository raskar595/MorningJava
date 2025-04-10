package array;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//          0 1 2  3 4 5 6
		int arr[]= {4,6,73,8,4,8,6,8};//
				
		for(int i=0; i<arr.length; i++) {//i=0,1   <7
			for(int j=1+i; j<arr.length; j++) {//j=2,3,4,5,6   <7
				if(arr[i]==arr[j]) {//6==6
					System.out.println(arr[i]);//4 6
					
				}
			}
		}
	}

}
