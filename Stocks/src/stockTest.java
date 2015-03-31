
public class stockTest {

	public static void main(String[] args) {
		StockOwner Jialin = new StockOwner();
		Corporation apple = new Corporation("apple");
		apple.create(1000);
		Jialin.buy(new Share(apple,100));
		Corporation Intel = new Corporation("Intel");
		Intel.create(200);
		apple.buy(new Share(Intel,100));
		Jialin.buy(new Share(Intel,200));
		System.out.println(apple.getOwn());
		System.out.println(Intel.getOwn());
		Jialin.printOwn();
	}
}
