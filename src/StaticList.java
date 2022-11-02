//Fila Sequencial Estática

public class StaticList<E> implements List<E> {
	protected E[] elements;
	int numElements;
	protected int vezesQueApareceu = 0;

	public StaticList(int maxSize) {
		elements = (E[]) new Object[maxSize];
		numElements = 0;
	}

	public int numElements() {
		return numElements;
	}

	public boolean isEmpty() {
		return numElements == 0;
	}

	public boolean isFull() {
		return numElements == elements.length;
	}

	public void insert(E element, int pos) throws OverflowException, IndexOutOfBoundsException {
		// verifica se tem espaço na lista
		if (isFull())
			throw new OverflowException();

		// verifica se a posição é válida
		if (pos < 0 || pos > numElements)
			throw new IndexOutOfBoundsException();

		// abre espaço para o novo elemento deslocando os elementos necessários para a
		// direita
		for (int i = numElements - 1; i >= pos; i--) {
			elements[i + 1] = elements[i];
		}

		// armazena o novo elemento e ajusta o número total de elementos na lista
		elements[pos] = element;
		numElements++;
	}

	public E remove(int pos) throws UnderflowException, IndexOutOfBoundsException {
		if (isEmpty())
			throw new UnderflowException();

		// verifica se a posição é válida
		if (pos < 0 || pos > numElements)
			throw new IndexOutOfBoundsException();

		// guarda uma referência temporária do elemento removido
		E element = elements[pos];

		// desloca para a esquerda os elementos necessários, sobreescrevendo a posição
		// do elemento que será removido
		for (int i = pos; i < numElements - 1; i++)
			elements[i] = elements[i + 1];

		// onde era a última posição será definida como null e para que a remoção
		// diminua no tamanho de elementos da lista ajustamos o numElements
		elements[numElements - 1] = null;
		numElements--;

		return element;
	}

	public E get(int pos) {
		if (pos < 0 || pos > numElements)
			throw new IndexOutOfBoundsException();

		return elements[pos];
	}

	public int search(E element) {
		for (int i = 0; i < numElements; i++)
			if (element.equals(elements[i]))
				return i;

		// foi até o final da lista e não encontrou o elemento
		return -1;
	}

	// retorna uma representação String da lista
	public String toString() {
		String s = "";
		for (int i = 0; i < numElements; i++)
			s += elements[i] + " ";
		return s;
	}

	public int contaElementos(E element) {
		
		contaElementosRecursivo(element, numElements - 1);
		return vezesQueApareceu;
	}

	private int contaElementosRecursivo(E element, int pos) {
		if (pos < 0)
			return vezesQueApareceu;

		if (element == elements[pos]) {
			vezesQueApareceu++;
			pos--;
			return contaElementosRecursivo(element, pos);
		} else {
			pos--;
			return contaElementosRecursivo(element, pos);
		}
	}
}
