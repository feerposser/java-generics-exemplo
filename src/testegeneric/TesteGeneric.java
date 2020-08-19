package testegeneric;

public class TesteGeneric {

	public static void main(String[] args) {
		
		Testando<String> t = new Testando<String>();
		t.addElemento("Fernando");
		t.addElemento("Beimar");
		t.addElemento("Mar");
		
		/*Testando<Integer> t = new Testando<Integer>();
		t.addElemento(1);
		t.addElemento(2);
		t.addElemento(3);*/
		
		t.mostrarLista();
		
		String primeiro = t.primeiro();
		//int primeiro = t.primeiro();

		System.out.println("Primeiro elemento: " + primeiro);

	}

}
