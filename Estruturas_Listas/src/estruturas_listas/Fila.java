package estruturas_listas;

/**
 * @author Samantha Silva
 *
 */
public class Fila {

	No elemento;
	No inicio;
	No proximo;
	int tamanho;
	No ultimo;

	public Fila() {
		// TODO Auto-generated constructor stub
		elemento = null;
		inicio = null;
		proximo = null;
		tamanho = 0;
		ultimo = null;
	}

	public void insere(No elemento) {
		No auxiliar = new No(elemento);
		if (tamanho == 0) {
			inicio = elemento;
		} else {
			auxiliar = inicio;
			inicio = elemento;
		}
		tamanho++;
	}

}
