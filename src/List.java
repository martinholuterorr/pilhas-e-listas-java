//Interface que define o comportamento de uma fila

public interface List<E> {
	//Informa a quantidade de elementos armazenados na fila
	public int numElements();
	
	//Informa se a fila está vazia
	public boolean isEmpty();
	
	//Informa se a fila está cheia
	public boolean isFull();
	
	//Insere um elemento na posição X da lista
	public void insert(E element, int pos);
	
	//Remove um elemento armazenado na posição X da lista
	public E remove(int pos);
	
	//Retorna um elemento armazenado na posição X da lista
	public E get(int pos);
	
	//Pesquisa se o elemento procurado está na lista
	public int search(E element);
}
