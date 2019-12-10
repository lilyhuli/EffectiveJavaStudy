package cn.lilyhuli.lesson1;

import java.util.Collections;

/**
 * @author tangd-a
 * @date 2019/12/9 10:04
 */
public class BooleanDemo {
	/**
	 * 使用静态工厂方法替代构造方法
	 * 静态工厂方法的优点，
	 * 1与构造方法不同，他们是有名字的
	 * 2不需要每次调用都创建一个对象
	 * 3可以返回类型的任何子类型对象
	 * @param b
	 * @return
	 */
	public static Boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}

}
