package cn.lilyhuli.lesson18;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;

/**
 * 类的设计是通过存在的Set接口来实现的该接口
 * 包含HashSet类的功能特性。
 * 除了功能强大，这个设计是非常灵活的。
 * InstrumentedSet类实现了Set接口，并有一个构造方法，其参数也是Set类型的。
 * 本质上，这个类把Set转换为另一个类型Set，
 * 同时添加了计数的功能。
 * 与基于继承的方法不同，该方法仅适用于单个具体类，
 * 并且父类中每个需要支持构造方法，
 * 提供单独的构造方法，
 * 所以可以使用包装类来包装任何Set实现，
 * 并且可以与任何预先存在的构造方法结合
 *
 * @author tangd-a
 * @date 2019/12/10 9:07
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {

	private int addCount = 0;


	public InstrumentedSet(Set<E> set) {
		super(set);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(@NotNull Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}
