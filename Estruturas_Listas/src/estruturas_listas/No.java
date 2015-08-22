package estruturas_listas;

/**
 *  @author Samantha Silva
 *
 */

public class No {

	private Object elemento_Armazenado;
	private No proximo_no;
	private No no_anterior;

	
	public No(Object elemento) {
		// TODO Auto-generated constructor stub
		this.elemento_Armazenado = elemento;
		this.proximo_no = null;
		this.no_anterior = null;
	}

	public Object getElemento_Armazenado() {
		return elemento_Armazenado;
	}

	public void setElemento_Armazenado(Object elemento_Armazenado) {
		this.elemento_Armazenado = elemento_Armazenado;
	}

	public No getProximo_no() {
		return proximo_no;
	}

	public void setProximo_no(No proximo_no) {
		this.proximo_no = proximo_no;
	}

	public No getNo_anterior() {
		return no_anterior;
	}

	public void setNo_anterior(No no_anterior) {
		this.no_anterior = no_anterior;

	}
}
