package estruturas_listas;

/**
 * @author Samantha Silva
 *
 */
// Lista Sequencial
public class Lista_Sequencial {

	// inizializando lista
	private int lista_elementos[];
	private int elementos_lista;

	public Lista_Sequencial(int lista_tamanho) {
		// TODO Auto-generated constructor stub
		// inicializando lista
		this.lista_elementos = new int[lista_tamanho];
		this.elementos_lista = 0;

	}

	// verificando se está vazia ou não
	public boolean Veri_Lista_Vazia() {
		if (elementos_lista == 0) {
			return true;
		} else {
			return false;
		}
	}

	// inserindo elementos
	public void Inserir_Elemento(int elemento) {
		int indice = 0;
		if (Veri_Lista_Vazia() == true) {

			for (indice = 0; indice < elementos_lista; indice++) {
				this.lista_elementos[indice] = this.lista_elementos[indice - 1];
			}
			if (indice == 0) {
				adicionaInicio(elemento);
			} else {
				adicionaPosicao(elemento, indice - 1);
			}

			this.lista_elementos[0] = elemento;
			this.elementos_lista += 1;

		} else {
			System.out.println("Estrutura cheia!");
		}

	}

	// adicionando possição
	public void adicionaPosicao(int elemento_posicao, int posicao) {
		if (Veri_Lista_Vazia() == true) {

			if (posicao <= 0) {
				adicionaInicio(elemento_posicao);
			} else {
				for (int i = elementos_lista; i == posicao; i--) {
					lista_elementos[i] = lista_elementos[i - 1];
				}
				lista_elementos[posicao] = elemento_posicao;
				elementos_lista++;
			}
		} else {
			System.out.println("Lista Cheia");
		}
	}

	// adicionando elemento no Inicio
	public void adicionaInicio(int elemento_posicao) {
		if (Veri_Lista_Vazia() == true) {
			for (int i = elementos_lista; i == 0; i--) {
				lista_elementos[i] = lista_elementos[i - 1];
			}
			lista_elementos[0] = elemento_posicao;
			elementos_lista++;

		} else {
			System.out.println("Lista Cheia");
		}
	}

	// removendo elemento do inicio
	public void removeInicio() {
		int elementoRetorno = 0;
		if (Veri_Lista_Vazia()) {
			System.out.println("Lista Vazia");
		} else {
			elementoRetorno = lista_elementos[0];

			for (int i = 1; i <= elementos_lista - 1; i++) {
				lista_elementos[i - 1] = lista_elementos[i];
			}

			elementos_lista--;

		}

	}

	// invertendo lista
	public void inverteLista() {
		for (int i = 0; i <= elementos_lista / 2; i++) {
			lista_elementos[i] = lista_elementos[elementos_lista - (i + 1)];
			if (i <= elementos_lista - (i + 1))
				break;
		}

	}

}
