package sorting;

public class SelectionSort extends SortInteger {
	
	/* Protected methods */
	
	@Override
	protected void sort(){
		for (int i=0; i<getDataLength(); i++)
			for (int j=i+1; j<getDataLength(); j++)
				if (compare(i,j)>0)
					swap(i,j);
		
	}
	
	/* Public constructors */
		
	public SelectionSort(int[] v){
		super(v);
	}

}
