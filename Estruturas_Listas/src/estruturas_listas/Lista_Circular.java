package estruturas_listas;

/**
 * @author Samantha Silva
 *
 */
public class Lista_Circular {

	// declarando as variáveis
	private No head, tail, elemento_Atual;
	private int size; // referência ao tamanho da lista

	public Lista_Circular() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		elemento_Atual = null;
		size = 0;
	}

	// verificando se a lista está vazia

	public void add_Head(Object elemento) {

		No novo = new No(elemento);

		// verificando se a lista está vazia
		// se sim aponta o head e o tail para o novo
		if (isEmpty()) {

			head = novo;
			elemento_Atual = novo;
			novo.setProximo_no(tail);
			tail.setProximo_no(head);

		} else {

			// se não, novo aponta para head
			novo.setProximo_no(head);
			elemento_Atual = novo;
			// head aponta para o proximo que aponta para o próximo
			// que aponta para o tail(cauda, final)
		}
		size++;
	}

	public void add_Tail(Object elemento) {
		No novo = new No(elemento);
		// verificando se a lista está vazia
		// se sim aponta o head e o tail para o novo
		if (isEmpty()) {
			add_Head(elemento);
		} else {
			// se não, novo aponta para head
			tail.setProximo_no(novo);
			tail = novo; // tail igual ao último elemento
			tail.setProximo_no(head); // último elemento tem atribuído o próximo
										// ao primeiro.
			size++;
		}

	}

	public Object removed_Tail() {
		No auxiliar = head;
		if (isEmpty()) {

			return null;

		} else {
			while (auxiliar != null) { // rodar um looping por toda a lista.
				if (auxiliar.getProximo_no() == head) {
					No auxiliar2 = tail;
					tail = auxiliar;
					tail.setProximo_no(head);

					return auxiliar2.getElemento_Armazenado();
				}
				auxiliar = auxiliar.getProximo_no();
			}

			size--;

			return auxiliar.getElemento_Armazenado();

		}
	}

	public Object removed_Head() {
		if (isEmpty()) {

			return null;

		} else {

			No auxiliar = head;
			head = auxiliar.getProximo_no(); // head é igual ao próximo
			size--;

			return auxiliar.getElemento_Armazenado();
		}

	}

	public Object Search(Object elemento) {
		No novo = head;

		while (novo.getProximo_no() != head) {
			if (novo.getElemento_Armazenado().equals(elemento)) {
				return elemento;
			}
			novo = novo.getProximo_no();
		}
		return false;
	}

	private boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public int Size() {
		return size;
	}
}
