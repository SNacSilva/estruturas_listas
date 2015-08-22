package estruturas_listas;

/**
 * @author Samantha Silva
 *
 */
public class Lista_Encadeada_Simples {

	// declarando as variáveis inicio, final, elemento e o tamanho,
	// respectivamente
	private No header, tail, elemento_Atual, proximo;
	private int size;

	public Lista_Encadeada_Simples() {
		// TODO Auto-generated constructor stub
		// iniciando a lista como nulo
		header = null;
		tail = null;
		size = 0;
	}

	// verificando se a lista está vazia
	private boolean isEmpty() {
		if (this.header == null) {
			return true;
		} else {
			return false;
		}
	}

	public void add(Object elemento) {

		No newer = new No(elemento);
		// verificando se a lista está vazia
		// se sim faz o add_Begin, para adcionar no inicio
		if (isEmpty()) {

			add_Begin(elemento);

		} else {

			newer.setProximo_no(tail);
			tail = newer;
			newer.setProximo_no(null);
			size++;
		}

	}

	public void add_Begin(Object elemento) {

		No newer = new No(elemento);
		// verificando se a lista está vazia
		// se sim aponta o head e o tail para o novo

		if (isEmpty()) {

			newer.setProximo_no(this.header);
			this.header = newer;

		} else {
			// se não, novo aponta para head
			newer.setProximo_no(header);
			newer.getProximo_no();
			header = newer;

			// head aponta para o proximo que aponta para o próximo

		}
		size++;
	}

	public void add(int posicao, Object elemento) {

		if (isEmpty() || posicao <= 1) { // No começo.

			this.add_Begin(elemento);

		} else {

			No newer = new No(elemento);
			this.elemento_Atual = header;
			int indice = 1;

			while (indice < posicao && elemento_Atual != null) {

				elemento_Atual = elemento_Atual.getProximo_no();
				indice += 1;

			}

			if (elemento_Atual == null) {

				add(elemento);

			} else {

				newer.setProximo_no(elemento_Atual.getProximo_no());
				elemento_Atual.setProximo_no(newer);

			}

			this.size++;
		}

	}

	public Object removed_Head() {

		No newer_Removed = null;

		if (isEmpty()) {

			return "Lista vazia!";

		} else {

			newer_Removed = header;
			header = newer_Removed.getProximo_no(); // head é igual ao próximo
			// fazendo assim com que o garbage collector apague

			size--;

		}

		return newer_Removed;

	}

	public Object removed() {

		No newer_Removed = null;

		if (isEmpty()) {

			return "Lista vazia!";

		} else {

			newer_Removed = elemento_Atual = header;

			while (newer_Removed.getProximo_no() != null) { // rodar um looping
															// por toda a lista.

				elemento_Atual = newer_Removed;
				newer_Removed = newer_Removed.getProximo_no();
			}

			elemento_Atual.setProximo_no(null);
		}

		size--;

		return newer_Removed.getElemento_Armazenado();

	}

	public Object removed(int posicao) {

		No newer_Removed = null;

		if (isEmpty() || posicao <= 1) {

			removed_Head();

		} else {

			newer_Removed = elemento_Atual = header;
			int indice = 1;

			while (indice < 1 && newer_Removed != null) { // rodar um looping
															// por toda a lista.

				elemento_Atual = newer_Removed;
				newer_Removed = newer_Removed.getProximo_no();
				indice += 1;
				// cortando a referência com o
				// último nó
				// fazendo assim com que o garbarege collector apague

			}

			if (newer_Removed == null) {

				removed();

			} else {

				elemento_Atual.setProximo_no(newer_Removed.getProximo_no());
			}

		}

		size--;

		return newer_Removed.getElemento_Armazenado();

	}

	public int size() {
		return this.size;
	}

	public Object search(Object elemento) {
		No newer = header;

		while (newer != null) {
			if (newer.getElemento_Armazenado().equals(elemento)) {
				return elemento;
			}
			newer = newer.getProximo_no();
		}
		return false;
	}

	@Override
	public String toString() {
		return "Lista_Encadeada_Simples: [header=" + header.getElemento_Armazenado() + ", próximo=" + proximo +
				", elemento_Atual=" + elemento_Atual + ", tail=" + tail.getElemento_Armazenado()
				+ ", size=" + size + "]";
	}
	
	

}