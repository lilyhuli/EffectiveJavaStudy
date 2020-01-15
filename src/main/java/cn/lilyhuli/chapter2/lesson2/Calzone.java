package cn.lilyhuli.chapter2.lesson2;

/**
 * @author tangd-a
 * @date 2019/12/9 11:23
 */
public class Calzone extends Pizza {
	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {

		private  boolean sauceInside = false; //default

		public Builder sauceInside(){
			sauceInside = true;
			return this;
		}

		@Override
		Calzone build() {
			return new Calzone(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}


	private Calzone(Builder builder) {
		super(builder);
		sauceInside = builder.sauceInside;
	}
}
