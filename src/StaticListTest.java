
public class StaticListTest {

	public static void main(String[] args) {
		StaticList<Integer> lista = new StaticList<Integer>(10);
		
		int pesquisa = 2;
		
		for(int i = 0; i < 6; i++) {
			lista.insert(i * 2, i);
		}
		
		lista.insert(2, 6);
		lista.insert(2, 7);
		lista.remove(6);
		
		System.out.println("O elemento " + pesquisa + " apareceu " + lista.contaElementos(pesquisa) + " vezes.");
		System.out.println(lista.toString());
	}

}
