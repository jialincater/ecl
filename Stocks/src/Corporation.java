
public class Corporation extends StockOwner {
	private String name;
	private Share owns;
	
	public Corporation(String na){
		name = na;
		owns = new Share(this,0);
	}
	public String getName(){
		return name;
	}
	public double wasBought(Share sha){
		if(sha.getQuanity()>owns.getQuanity()){
			sha.setQuanity(owns.getQuanity());
		}
		owns.setQuanity(owns.getQuanity()-sha.getQuanity());
		return sha.getQuanity();
	}
	public double create(double amount){
		owns.setQuanity(amount+owns.getQuanity());
		return amount;
	}
	public double getOwn(){
		return owns.getQuanity();
	}
}
