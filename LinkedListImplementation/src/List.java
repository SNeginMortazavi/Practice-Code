/**
 * This is the List interface to instantiate the LinkedList data structure.
 * @author Negin Mortazavi
 *
 * @param <T>
 */
public interface List<T> {
	public void insert(T data);
	public void remove(T data);
	public void traverseList();
	public int size();
}
