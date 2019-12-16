package cn.lilyhuli.skeletalImplementation;

/**
 * @author tangd-a
 * @date 2019/12/5 17:20
 */
public class VendingManager {
	public static void main(String[] args) {
		Ivending candy = new CandyVending();
		Ivending drink = new DrinkVending();

		candy.process();

		System.out.println("*********************");
		drink.process();
		if(drink instanceof VendingService)
		{
			VendingService vs = (VendingService)drink;
			vs.service();
		}
	}
}
