package solutions.chapter2arrays.project5;

class OrdArray {
	private long[] a;
	private int nElems;
	
	public OrdArray(int max){
		a = new long[max];
		nElems = 0;
	}
	
	public int size(){
		return nElems;
	}
	
	public int find(long searchKey){
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		
		while(true){
			curIn = (lowerBound + upperBound) / 2;
			
			if(a[curIn]==searchKey){
				return curIn;				
			}else if(lowerBound > upperBound){
				return nElems;
			}else{
				if(a[curIn] < searchKey){
					lowerBound = curIn + 1;
				}else{
					upperBound = curIn - 1;
				}
			}
		}
	}
	public void merge(OrdArray arr1, OrdArray arr2){
		int i = 0;
		int one = arr1.nElems -1;
		int two = arr2.nElems -1;
		
		while(true){
			if(one >= 0 && two >= 0){
				if(arr1.a[i] < arr2.a[i]){
					a[i] = arr1.a[i];
					i++;
					one--;
					two--;
					nElems++;
				//handles > and ==
				}else{
					a[i] = arr2.a[i];
					i++;
					one--;
					two--;
					nElems++;
				}
			//if an array is 'empty'
			//break if both are 'empty'
			}else if(one < 0 || two < 0){
				if(one < 0){
					while(two >= 0){
						a[i] = arr2.a[i];
						i++;
						two--;
						nElems++;
					}
					break;
				}else if(two < 0){
					while(one >= 0){
						a[i] = arr1.a[i];
						i++;
						one--;
						nElems++;
					}
					break;
				}
			}
		}
	}
	
	public void insert(long value){
		int lowerBound = 0;
		int upperBound = nElems -1;
		int j = 0;
		
		while(true){
			if(lowerBound > upperBound){
				break;
			}
			if(value > a[j]){
				lowerBound = j+1;
				j++;
			}else{
				upperBound = j-1;
			}
		}
		for(int k=nElems; k>j;k--){
			a[k] = a[k-1];
		}
		a[j] = value;
		nElems++;
	}
	
	public boolean delete(long value){
		int j = find(value);
		if(j==nElems){
			return false;
		}else{
			for(int k=j; k<nElems; k++){
				a[k] = a[k+1];
			}
			nElems--;
			return true;
		}
	}
	
	public void display(){
		for(int j=0; j<nElems; j++){
			System.out.print(a[j] + " ");
		}
		System.out.println(" ");
	}
}
