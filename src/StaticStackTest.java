
public class StaticStackTest {

	public static void main(String[] args) {
		StaticStack<Integer> pilha = new StaticStack<Integer>(10);

		for (int i = 0; i < 6; i++) {
			pilha.push(i);
		}

		System.out.println(pilha.numElements());

		String desafio = "((A+B)-(C+D))";
		Character conversor = ' ';

		StaticStack<Character> pilhaChar = new StaticStack<Character>(desafio.length() + 1);

		for (int i = desafio.length() - 1; i > -1; i--) {
			conversor = desafio.charAt(i);
			pilhaChar.push(conversor);
		}

		Verificador teste = new Verificador();
		System.out.println(teste.checkParenteses(pilhaChar));
		System.out.println(pilhaChar.toString());

	}
}
