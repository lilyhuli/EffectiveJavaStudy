package cn.lilyhuli.secondApproach;

/**
 * @author tangd-a
 * @date 2019/12/5 17:00
 */
public abstract  class AbstractVending {
	public void start()
	{
		System.out.println("Start Vending machine");
	}
	public abstract void chooseProduct();
	public void stop()
	{
		System.out.println("Stop Vending machine");
	}
	public void process()
	{
		start();
		chooseProduct();
		stop();
	}

}
