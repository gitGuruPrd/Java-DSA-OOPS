package Array;

public class Sort0n1 {
	public static void pairSum(int[]arr) {
		for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==0) {
			break;
		}else {
			if(arr[j]==0) {
				int swap=arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
			}
		}
	}
		}
		/*
		 *  int i = 0, j = 0;
        while(i < arr.length){
            if(arr[i] == 0){
                // swap(arr, i, j);
                int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }            
        }
		 */
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr1= {1,3,5,6};
int x= 9;


	}

}
