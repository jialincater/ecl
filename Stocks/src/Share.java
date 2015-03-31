
public class Share {
	Corporation corp;
	double quanity;
	
	public Share(Corporation cor,double quan){
		corp=cor;
		quanity = quan;
	}
	
	public Corporation getCorp(){
		return corp;
	}
	
	public double getQuanity(){
		return quanity;
	}
	public double setQuanity(double n){
		quanity = n;
		return quanity;
	}
}
