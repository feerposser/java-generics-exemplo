package testegeneric;

import java.util.ArrayList;

public class Testando<T> {
	
	ArrayList<T> lista = new ArrayList<T>();
	
	void addElemento(T elemento) {
		this.lista.add(elemento);
	}
	
	T primeiro() {
		if (!this.lista.isEmpty()) {
			return this.lista.get(0);
		} 
		return null;
	}
	
	void mostrarLista() {
		for(T i : this.lista) {
			System.out.println(i);
		}
	}

}
