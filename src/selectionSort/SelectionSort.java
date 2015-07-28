/**
 * 
 */
package selectionSort;

import java.util.Random;



/**
 * @author Aswin
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	static int arr[] = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for(int i=0;i<10;i++){
			arr[i] = rand.nextInt(100);
		}
		SelectionSort srt = new SelectionSort();
		System.out.println("Before calling sort");
		srt.print(arr);
		srt.sort(arr);
		System.out.println("\nAfter calling sort");
		srt.print(arr);
		
	}
	
	void sort(int arr[]){
		int min;
		int len = arr.length;
		for(int i=0; i<len; i++){
			min = i;
			
			for(int j=i+1;j<len;j++){
				
				if(arr[j]<arr[min]){	
					swap(arr,i,j);
					min =i;
				}
					
			}
		}
		
		//return arr;
		
	}
	
	void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	void swap(int arr[],int x, int y){
		int temp;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}

}
