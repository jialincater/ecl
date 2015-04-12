package sorting;

public class SortMetrics {

	int compareCnt;
	int swapCnt;
	
	void init(){
		compareCnt=0;
		swapCnt=0;
	}

	@Override
	public String toString() {
		return "SortMetrics [compareCnt=" + compareCnt + ", swapCnt=" + swapCnt + "]";
	}
	
}
