package estruturas_listas;

/**
 * @author Samantha Silva
 *
 */
public class Lista_Encadeada_Dupla {
	// declarando as variáveis par ainicializarem como nulo
	private No head, tail;
	private int size = 0; // referência ao tamanho da lista

	public Lista_Encadeada_Dupla() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;

	}

	// verificando se a lista está vazia
	private boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void add_Head(Object elemento) {
		No novo = new No(elemento);
		// verificando se a lista está vazia
		// se sim aponta o head e o tail para o novo
		if (isEmpty()) {
			head = novo;
			tail = novo;
		} else {
			// se não, novo aponta para head
			head.setNo_anterior(null);
			// head tem uma referência voltando para o novo
			novo.setProximo_no(head);
			// novo tem uma referência de próximo para o head
			head = novo;
			// head = novo (elemento mais atual
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
			novo.setNo_anterior(tail);
			// head tem uma referência voltando para o novo
			tail.setProximo_no(novo);
			// novo tem uma referência de próximo para o head
			tail = novo;
			// head = novo (elemento mais atual
		}
		size++;
	}

	public Object removed_Tail() {
		if (isEmpty()) {

			return null;

		} else {

			No auxiliar = tail;

			if (tail.getProximo_no() != null) {

				tail = tail.getProximo_no(); // tail é igual ao próximo
				tail.getProximo_no().setNo_anterior(null);
				// cortado a relação do último com a cabeça da lista.
				tail.setProximo_no(null); // anterior é igual a nulo
				// fazendo assim com que o garbage collector apague
			} else {
				tail = null;
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

			if (head.getProximo_no() != null) {

				head = head.getProximo_no(); // head é igual ao próximo
				head.getNo_anterior().setProximo_no(null);
				// cortado a relação do último com a cabeça da lista.
				head.setNo_anterior(null); // anterior é igual a nulo
				// fazendo assim com que o garbarege collector apague
			} else {
				head = null;
				
			}
			size--;

			return auxiliar.getElemento_Armazenado();
		}

	}
	
	public int Size(){
		return size;
	}

	public Object search(Object elemento){
		No novo = head;

		while (novo != null) {
			if (novo.getElemento_Armazenado().equals(elemento)) {
				return elemento;
			}
			novo = novo.getProximo_no();
		}
		return false;
	}
}
