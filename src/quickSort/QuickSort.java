/**
 * 
 */
package quickSort;

import java.util.Random;

/**
 * @author Aswin
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	static int[] arr = new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort qs = new QuickSort();
		Random rand = new Random();
		for(int i=0;i<5;i++){
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Before Sorting");
		qs.print(arr);
		System.out.println("\nAfter Sorting");
		qs.quicksort(arr,0,arr.length-1);
		qs.print(arr);

	}
	
	void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	void quicksort(int arr[],int left, int right){
		
		int p = partition(arr,left,right);
		if(left < p-1){
			quicksort(arr,left,p-1);			
		}
		if(p<right){
			quicksort(arr,p,right);
		}
		
		
	}
	
	int partition(int arr[], int left, int right){
		//int len = arr.length;
		//int left =0, right = len-1;
		int pivot = (left+right)/2;
		while(left <= right){
			while(arr[left]<arr[pivot]){
				left++;
			}
			while(arr[right]>arr[pivot]){
				right--;
			}
			if(left<=right){
				swap(arr,left,right);
				left++;
				right--;
			}
		}
		
		return left;
	}
	
	void swap(int arr[],int x, int y){
		int temp;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}

}
