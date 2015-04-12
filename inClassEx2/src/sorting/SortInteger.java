package sorting;

import java.util.Arrays;
import java.util.Random;

public abstract class SortInteger {
	
	/* Fields */
	
	private final int[] values;
	private final SortMetrics metrics = new SortMetrics();
	
	/* Protected methods */
	
	protected final int compare(int i, int j){
		metrics.compareCnt++;
		int i1=values[i], i2=values[j];
		if (i1==i2) return 0;
		else return (i1<i2 ? -1 : 1);
	}
	
	protected final void swap(int i, int j){
		metrics.swapCnt++;
		int tmp=values[i];
		values[i]=values[j];
		values[j]=tmp;
	}
	
	protected final int getDataLength(){
		return values.length;
	}
	
	protected abstract void sort();
	
	/* Public constructors and methods */
	
	public SortInteger(int[] v){
		values = v;
	}
	
	public void doSort(){
		metrics.init();
		sort();
	}
	
	@Override
	public String toString() {
		return "SortInteger [values=" + Arrays.toString(values) + ", metrics=" + metrics + "]";
	}
	
	/* The main */

	public static void main(String[] args){
		
		if (args.length==0){
			System.out.println("Usage: SortInteger <num>");
			System.exit(1);
		}
		
		int[] values = new int[Integer.parseInt(args[0])];
		Random random = new Random();
		for (int j=0; j<values.length; j++)
			values[j]=random.nextInt(values.length*100+1);
		System.out.println("values="+Arrays.toString(values));
		
		System.out.println("\n *** Selection sort: \n");
		
		int[] ss_values = values.clone();
		SortInteger ss = new SelectionSort(ss_values);
		System.out.println("values="+Arrays.toString(ss_values));
		ss.doSort();
		System.out.println(ss);

		System.out.println("\n *** Bubble sort: \n");

		int[] bs_values = values.clone();
		SortInteger bs = new BubbleSort(bs_values);
		System.out.println("values="+Arrays.toString(bs_values));
		bs.doSort();
		System.out.println(bs);
	}

}
