package cn.lilyhuli.secondApproach;

/**
 * @author tangd-a
 * @date 2019/12/5 16:55
 */
public class VendingManager {
	public static void main(String[] args) {
		AbstractVending candy =  new CandyVending();
		AbstractVending drink =  new DrinkVending();
		candy.process();
		System.out.println("*********************");
		drink.process();
	}

	/**
	 * Here, I provide common code implementation into the abstract class.
	 * And CandyVending and DrinkVending extends AbstractVending.
	 * This implementation gets rid of duplicate code but adds a new problem.
	 * As CandyVending and DrinkVending extend the Abstract class,
	 * we can't have provision to extends another class or does not support Multiple inheritances.
	 *
	 * Say I want to add a VendingServicing class,
	 * which will clean and check the vending machine.
	 * In this scenario,
	 * I can’t extend VendingServicing as I have already extended AbstractVending.
	 * One thing I can do is create a composition, but again, we have to pass VendingMachine into it,
	 * which will strongly couple VendingServicing and VendingMachine.
	 * Disadvantage of Abstract Class
	 * We can’t support multiple inheritances due to the diamond problem.
	 * It would be great if we could use the advantages of both interface and Abstract.
	 *
	 * But wait, there is.
	 *
	 * Abstract Interface or Skeletal Implementation
	 *
	 * please see @
	 */
}
