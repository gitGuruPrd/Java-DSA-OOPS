package Array;

public class FindDuplicate {
	public static void findUnique(int arr1[], int arr2[]) {
		int n1= arr1.length;
		int n2= arr2.length;
		int i=0;
		
		int duplicate =-1;
		
		while(i<n1) {
			for(int j=0;j<n2;j++) {
				 if(arr1[i]==arr2[j]) {
					duplicate=arr1[i];
					System.out.print(duplicate+" ");
					arr2[j]=Integer.MIN_VALUE;
					break;
					
				} 
					
			}
			i++;
		}
//		return duplicate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]arr1= {1,2,2,2,1,3,4};
	int[]arr2= {1,2,7,1,3,4};
	findUnique(arr1,arr2);
	int i=Integer.MAX_VALUE;
	System.out.println(i);
	
	}

}
