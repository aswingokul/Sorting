/**
 * 
 */
package heapSort;

import java.util.Random;

/**
 * @author Aswin
 *
 */
public class HeapSort {

	/**
	 * @param args
	 */
	static int[] input;
	HeapSort(int size){
		input = new int[size];
		Random rand = new Random();
		for(int i = 0;i<size;i++){
			input[i] = rand.nextInt(100);
		}
	}
	
	void maxHeapify(int[] arr, int index){
		int max = index;
		int left = index*2+1;
		int right = index*2+2;
		int size = arr.length;
		if(left < size-1 && arr[left] > arr[max]){
			max = left;
		}
		if(right < size-1 && arr[right] > arr[max]){
			max = right;
		}
		if(max!=index){
			swap(arr,max,index);
			maxHeapify(arr, max);
		}
	}
	
	void buildHeap(int arr[],int size){
		for(int i=(size-2)/2;i>=0;i--){
			maxHeapify(arr, i);
		}
	}
	
	void heapsort(int arr[], int size){
		buildHeap(arr, size);
		while(size>1){
			swap(arr,0,size-1);
			size--;
			maxHeapify(arr, 0);
		}
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
	
	public static void main(String args[]){
		HeapSort hs = new HeapSort(10);
		System.out.println("Before Sorting");
		hs.print(HeapSort.input);
		hs.heapsort(HeapSort.input, 10);
		System.out.println("\nAfter Sorting");
		hs.print(HeapSort.input);
	}
}
