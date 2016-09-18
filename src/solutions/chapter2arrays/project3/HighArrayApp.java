package solutions.chapter2arrays.project3;

import solutions.chapter2arrays.project3.HighArray;

public class HighArrayApp {

	public static void main(String[] args) {
		int maxSize = 100;
		HighArray arr;
		arr = new HighArray(maxSize);
		
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();
		
		int searchKey = 35;
		if(arr.find(searchKey)){
			System.out.println("Found " + searchKey);
		}else{
			System.out.println("Can't find " + searchKey);
		}
		
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		
		arr.display();	
		
		if(arr.getMax() != 0){
			System.out.println("Value of highest key: " + arr.getMax());
			arr.removeMax(arr.getMax());
			arr.display();
		}else{
			System.out.println("Array ('arr') is empty(-1)");
		}
		
		//copy to second array
		int count = 0;
		long[] arr2 = new long[100];
		while(arr.getMax() != -1){
			long val = arr.getMax();
			arr2[count] = val;
			arr.removeMax(arr.getMax());
			count++;
		}
		System.out.println(count);
		
		for(int j=0; j<count; j++){
			System.out.print(arr2[j] + " ");
		}
	}

}
