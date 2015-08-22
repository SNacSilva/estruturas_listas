package estruturas_listas;

import java.awt.List;

public class Leitura {

	private No header, tail, elemento_Atual;
	private int size;

	public Leitura() {

		// inicializando os elementos como nulo, para ter a certeza de que não
		// há nada neles.
		this.header = null;
		this.tail = null;
		this.elemento_Atual = null;
		this.size = 0;
	}

	// verificando se a lista está vazia
	// se sim aponta o head para o novo
	public void add(Object elemento) {

		if (isEmpty()) {

			this.add_Begin(elemento);

		} else {

			No newer = new No(elemento);
			this.elemento_Atual = newer;
			this.elemento_Atual.setProximo_no(tail);
			this.tail.setProximo_no(header);
		}

		size++;
	}

	public void add_Begin(Object element) {

		No newer = new No(element);

		if (isEmpty()) {

			// caso da lista vazia
			this.header = newer;
			this.tail = newer;
			this.tail.setProximo_no(this.header);
			// header e tail recebem newer, e tail seta header como seu próximo
			// nó

		} else {
			// caso esteja cheia
			this.elemento_Atual = this.header.getProximo_no();
			this.header = newer;
			this.tail.setProximo_no(this.header);

		}

		this.size++;
	}

	public void add(int posicao, Object elemento) {

		if (isEmpty()) {

			this.add_Begin(elemento);

		} else {

			No newer = new No(elemento);
			this.elemento_Atual = newer;
			this.elemento_Atual.setProximo_no(tail);
			this.tail.setProximo_no(header);
		}

		this.size++;
	}

	public String toString() {
		// Verificando se a Lista está vazia
		if (this.size == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No atual = header;
		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.size - 1; i++) {
			builder.append(atual.getElemento_Armazenado());
			builder.append(", ");
			atual = atual.getProximo_no();
		}
		// último elemento
		builder.append(atual.getElemento_Armazenado());
		builder.append("]");
		return builder.toString();
	}

	public Object pega(int posicao) {

		return null;
	}

	public void remove(int posicao) {
	}

	public int size() {
		return 0;

	}

	public boolean isEmpty() {
		if (this.header == null) {
			return true;
		} else {
			return false;
		}
	}

	public void remove_Begin() {
	}

	public void remove_End() {
	}

}
