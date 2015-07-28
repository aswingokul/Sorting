/**
 * 
 */
package insertionSort;

import java.util.Random;

/**
 * @author Aswin
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	
	int arr[] = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort ins = new InsertionSort();
		Random rand = new Random();
		for(int i=0;i<10;i++){
			ins.arr[i] = rand.nextInt(100);
		}
		System.out.println("Before Sorting");
		ins.print(ins.arr);
		int res[] = new int[10];
		res = ins.insertSort(ins.arr);
		System.out.println("\nAfter Sorting");
		ins.print(res);

	}
	public int[] insertSort(int num[]){
		int j;
		for(int i=1;i<num.length;i++){
			int key = num[i];
			j =i-1;
			
			while(j>=0 && num[j]>key){
				num[j+1] = num[j];
				j--;
			}
			num[j+1]=key;
		}
		return num;
	}
	public void print(int arr[]){
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
