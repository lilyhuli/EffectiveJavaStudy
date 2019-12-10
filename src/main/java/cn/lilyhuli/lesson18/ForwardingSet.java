package cn.lilyhuli.lesson18;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @author tangd-a
 * @date 2019/12/9 19:56
 */
public class ForwardingSet<E> implements Set<E> {
	private final Set<E> set;

	public ForwardingSet(Set<E> set) {
		this.set = set;
	}


	@Override
	public int size() {
		return set.size();
	}

	@Override
	public boolean isEmpty() {
		return set.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return set.contains(o);
	}

	@NotNull
	@Override
	public Iterator<E> iterator() {
		return set.iterator();
	}

	@NotNull
	@Override
	public Object[] toArray() {
		return set.toArray();
	}

	@NotNull
	@Override
	public <T> T[] toArray(@NotNull T[] a) {
		return set.toArray(a);
	}

	@Override
	public boolean add(E e) {
		return set.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return set.remove(o);
	}

	@Override
	public boolean containsAll(@NotNull Collection<?> c) {
		return set.containsAll(c);
	}

	@Override
	public boolean addAll(@NotNull Collection<? extends E> c) {
		return set.addAll(c);
	}

	@Override
	public boolean retainAll(@NotNull Collection<?> c) {
		return set.retainAll(c);
	}

	@Override
	public boolean removeAll(@NotNull Collection<?> c) {
		return set.retainAll(c);
	}

	@Override
	public void clear() {
		set.clear();
	}

	@Override
	public int hashCode() {
		return set.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return set.equals(obj);
	}

	@Override
	public String toString() {
		return set.toString();
	}
}


