package cn.lilyhuli.firstApproach;

/**
 * @author tangd-a
 * @date 2019/12/5 16:55
 */
public class VendingManager {
	public static void main(String[] args) {
		Ivending candy = new CandyVending();
		Ivending drink = new DrinkVending();
		candy.process();
		drink.process();
	}

}
