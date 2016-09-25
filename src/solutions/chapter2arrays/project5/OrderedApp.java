package solutions.chapter2arrays.project5;

public class OrderedApp {

	public static void main(String[] args) {
		int maxsize = 100;
		OrdArray arr;
		arr = new OrdArray(maxsize);
		OrdArray arr2;
		arr2 = new OrdArray(maxsize);
		OrdArray arr3;
		arr3 = new OrdArray(maxsize);
		
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
		
		
		arr2.insert(71);
		arr2.insert(97);
		arr2.insert(44);
		arr2.insert(55);
		arr2.insert(23);
		arr2.insert(81);
		arr2.insert(10);
		arr2.insert(00);
		arr2.insert(65);
		arr2.insert(33);
		// merged array display: 0 10 23 33 44 55 65 71 81 97
		
		/*
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		arr2.insert(99);
		*/
		// merged array display: 11 22 33 44 66 77 88 99 99 99
		
		int searchKey = 55;
		
		if(arr.find(searchKey) != arr.size()){
			System.out.println("Found " + searchKey);
			System.out.println();
		}else{
			System.out.println("Can't find " + searchKey);
			System.out.println();
		}
		
		System.out.println("arr display before delete: ");
		arr.display();
		
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		System.out.println();
		System.out.println("arr display after delete: ");
		arr.display();
		
		System.out.println();
		System.out.println("arr2 display: ");
		arr2.display();
		
		
		arr3.merge(arr, arr2);
		System.out.println();
		System.out.println("merged array: ");
		arr3.display();
	}
}
