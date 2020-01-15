package cn.lilyhuli.chapter2.lesson2;

/**
 * @author tangd-a
 * @date 2019/12/9 11:02
 */
public class NyPizza extends Pizza {
	public enum Size {SMALL,MEDIUM, LARGE}

	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {

		private final Size size;

		public Builder(Size size) {
			this.size = size;
		}


		@Override
		NyPizza build() {
			return new NyPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}



}
