//Interface que define o comportamento de uma fila

public interface Stack<E> {
	//Informa se a pilha está vazia.
	public boolean isEmpty();

	//Informa se a pilha está cheia.
	public boolean isFull();

	//Informa a quantidade de elementos armazenados na pilha.
	public int numElements();

	//Adiciona um novo elemento pilha.
	public void push(E element) throws OverflowException;

	//Retira um elemento da pilha.
	public E pop() throws UnderflowException;

	//Informa qual o elemento no topo da pilha.
	public E top() throws UnderflowException;
}
