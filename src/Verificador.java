public class Verificador {

	public boolean checkParenteses(Stack<Character> s1) {
		int parentesesEsquerda = 0;
		int parentesesDireita = 0;
		boolean ordemParenteses = true;
		Character ponteiro = ' ';
		
		StaticStack<Character> pilhaVerificaParenteses = new StaticStack<Character>(s1.numElements());
		
		//Esvazia a pilha de s1 e verifica os parênteses
		while(!s1.isEmpty()) {
			ponteiro = s1.pop();
			
			if (ponteiro.charValue() == '(')
				parentesesEsquerda++;
			
			if (ponteiro.charValue() == ')')
				parentesesDireita++;
			
			//Checa se os parênteses estão na ordem correta 
			if (parentesesDireita == 1 && parentesesEsquerda == 0)
				ordemParenteses = false;
			
			pilhaVerificaParenteses.push(ponteiro);
			
		}
		
		//Coloca todos os elementos de volta para s1
		while(!pilhaVerificaParenteses.isEmpty()) {
			ponteiro = pilhaVerificaParenteses.pop();
			s1.push(ponteiro);			
		}

		//Se a quantidade de parênteses ( e ) estiverem mesma quantidade e se a equação não começar com ) retornará true
		return parentesesEsquerda == parentesesDireita && ordemParenteses;
	}
}
