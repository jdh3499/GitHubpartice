package d_array;

public class Ex03_정렬 {

	public static void main(String[] args) {
		int[]su= {20,2,49,8,12,5};
		//정렬(버블정렬)
		for(int i=su.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(su[j]>su[j+1]){
					int temp=su[j];
					su[j] =su[j+1];
					su[j+1] = temp;  
				}
			}
		}
		
		for(int i=0; i<su.length;i++) {
			System.out.print(su[i]+" ");
		}

	}

}
