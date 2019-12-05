package cn.lilyhuli.firstApproach;

/**
 * @author tangd-a
 * @date 2019/12/5 16:55
 */
public class DrinkVending implements Ivending {
	public void start() {
		System.out.println("Start Vending machine");

	}

	public void chooseProduct() {
		System.out.println("Produce diiferent soft drinks");
		System.out.println("Choose a type of soft drinks");
		System.out.println("pay for drinks");
		System.out.println("collect drinks");
	}

	public void stop() {
		System.out.println("stop Vending machine");
	}

	public void process() {
		start();
		chooseProduct();
		stop();
	}
}
