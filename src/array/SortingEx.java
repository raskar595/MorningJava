package array;

public class SortingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ///         0 1 2  3 4 5 6 7
		int arr[]= {4,6,73,8,4,1,6,0};//   Successfully
		int temp=0;//temp=0
		
		for(int i=0; i<arr.length; i++) {//i=0     <8
			for(int j=i+1; j<arr.length; j++) {//j=1,2,3,4,5,6,7     <8
				if(arr[i]>arr[j]) {//1>0
					temp=arr[i];//temp=1
					arr[i]=arr[j];//arr[0]=arr[7]  arr[0] := 0
					arr[j]=temp;//arr[7]=1
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
