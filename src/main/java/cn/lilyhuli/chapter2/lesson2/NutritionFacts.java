package cn.lilyhuli.chapter2.lesson2;

/**
 * Telescoping constructor pattern - does not scale well
 *
 * @author tangd-a
 * @date 2019/12/9 10:04
 */
public class NutritionFacts {

//	private final int servingSize;
//	private final int servings;
//	private final int calories;
//	private final int fat;
//	private final int sodium;
//	private final int carbohydrate;
//
//
//	public NutritionFacts(int servingSize, int servings) {
//		this(servingSize, servings, 0);
//	}
//
//	public NutritionFacts(int servingSize, int servings, int calories) {
//		this(servingSize, servings, calories, 0);
//	}
//
//	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
//		this(servingSize, servings, calories, fat, 0);
//	}
//
//	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
//		this(servingSize, servings, calories, fat, sodium,0);
//	}
//	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
//		this.servingSize = servingSize;
//		this.servings = servings;
//		this.calories = calories;
//		this.fat = fat;
//		this.sodium = sodium;
//		this.carbohydrate = carbohydrate;
//	}

//	private int servingSize = -1;
//	private int servings = -1;
//	private int calories = 0;
//	private int fat = 0;
//	private int sodium = 0;
//	private int carbohydrate = 0;
//
//	//javabean模式  模式中 调用一个无参构造来创建对象。
//	// 然后调用setter方法来设置每个必须的参数和可选参数
//	public NutritionFacts() {
//	}
//
//	//Setters
//	public void setServingSize(int val) {
//		servingSize = val;
//	}
//
//	public void setServings(int val) {
//		servings = val;
//	}
//
//	public void setCalories(int val) {
//		calories = val;
//	}
//	public void setFat(int val) {
//		fat = val;
//	}
//	public void setSodium(int val) {
//		sodium = val;
//	}
//	public void setCarbohydrate(int val) {
//		carbohydrate = val;
//	}

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}

	public static class Builder {
		//Required parameters
		private final int servingSize;
		private final int servings;
		;
		//Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;

		//必选的
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}
	//链式调用
	public static void main(String[] args) {
		NutritionFacts cocaCola = new Builder(240, 8)
				.calories(100).sodium(35).carbohydrate(27).build();

	}

}

