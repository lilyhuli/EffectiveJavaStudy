package cn.lilyhuli.skeletalImplementation;

/**
 * @author tangd-a
 * @date 2019/12/5 17:11
 */
public abstract class AbstractVending implements Ivending{
	public void start()
	{
		System.out.println("Start Vending machine");
	}
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
