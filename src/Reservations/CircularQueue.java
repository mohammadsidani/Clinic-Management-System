package Reservations;

public class CircularQueue<E> implements CQueue<E> {
	CircularLinkedList<E> list = new CircularLinkedList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public E first() {
		return list.first();
	}

	public void enqueue(E element) {
		list.addLast(element);
	}

	public E dequeue() {
		return list.removeFirst();
	}

	public void rotate() {
		list.rotate();
	}
}