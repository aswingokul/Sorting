/**
 * 
 */
package mergeSort;

import java.util.Random;

/**
 * @author Aswin
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	static int arr[] = new int[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort mer = new MergeSort();
		Random rand = new Random();
		for(int i=0;i<5;i++){
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Before Sorting");
		mer.print(arr);
		System.out.println("\nAfter Sorting");
		mer.mergesort(arr);
		mer.print(arr);

	}
	
	void mergesort(int[] arr){
		mergesort(arr,0,arr.length-1);
	}
	
	void mergesort(int[] arr,int l,int r){
		//int m = (l+r)/2;
		
		if(l<r){
			int m = (l+r)/2;			
			mergesort(arr,l,m); //1st half					
			mergesort(arr,m+1,r);			
			merge(arr,l,m,r);
		}
		
	}
	
	void merge(int arr[],int l,int m, int r){
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int [n1];
		int R[] = new int[n2];
		int i=0,j=0;
		
		for(i=0;i<n1;i++){
			L[i] = arr[l+i];
		}
		for(i=0;i<n2;i++){
			R[i] = arr[m+1+i];
		}
		i=0;j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k] = L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2){
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
