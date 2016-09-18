package solutions.chapter2arrays.project2;

class HighArray {
	private long[] a;
	private int nElems;
	
	public HighArray(int max){
		a = new long[max];
		nElems = 0;
	}
	public boolean find(long searchKey){
		int j;
		for(j=0;j<nElems;j++){
			if(a[j] == searchKey){
				break;
			}
		}
		if(j == nElems){
			return false;
		}else{
			return true;
		}		
	}
	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	public boolean delete(long value){
		int j;
		for(j=0; j<nElems; j++){
			if(value == a[j]){
				break;
			}
		}
		if(j==nElems){
			return false;
		}else{
			for(int k=j;k<nElems;k++){
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

	
	//project2.2 asks to call removemax from getmax if array has >0 nElems
	public long getMax(){
		long val = a[nElems-1];
		if(nElems == 0){
			return -1;
		}else{
			removeMax(val);
			return a[nElems-1];
		}
	}
	public void removeMax(long value){
		delete(value);
	}
}
