import java.util.*;
public class StockOwner {
	protected HashSet<Share> shareList;
	
	public StockOwner(){
		shareList = new HashSet<Share>();
	}
	public double buy(Share sha){
		double realN = sha.getCorp().wasBought(sha);
		Iterator<Share> it = shareList.iterator();
		boolean flag = false;
		while(it.hasNext()){
			Share tsha = it.next();
			if(tsha.getCorp()==sha.getCorp()){
				tsha.setQuanity(tsha.getQuanity()+realN);
				flag = true;
				break;
			}
		}
		if(flag == false)
			shareList.add(new Share(sha.getCorp(),realN));
		return realN;
	}
	
	public double sell(Share sha){
		Iterator<Share> it = shareList.iterator();
		boolean flag = false;
		double realN=0.0;
		while(it.hasNext()){
			Share tsha = it.next();
			if(tsha.getCorp()==sha.getCorp()){
				if(tsha.getQuanity()<=sha.getQuanity()){
					realN = sha.setQuanity(tsha.getQuanity());
					tsha.setQuanity(0);
					flag = true;
					break;
				}
				else{
					realN = tsha.setQuanity(tsha.getQuanity()-sha.getQuanity());
					flag = true;
					break;
				}
			}
		}
		if(flag == false){
			System.out.println("No Shares for the Corp\n");
			realN = 0;
		}
		return realN;
	}
	public void printOwn(){
		Iterator<Share> it = shareList.iterator();
		while(it.hasNext()){
			Share sha = it.next();
			if(sha.getQuanity()!=0){
				System.out.println(sha.getCorp().getName()+" "+sha.getQuanity());
			}
		}
	}
}
