package simplelist;



public interface List<E> {

	public void append(E element);

	public boolean contains(E o);

	public boolean isEmpty();
}