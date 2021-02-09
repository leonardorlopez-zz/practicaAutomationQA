
public class Practica {

	public static void main(String[] args) {
		java.util.Scanner teclado = new java.util.Scanner(System.in);
		int n1, n2;
		String operacion;
		System.out.println("Ingrese número 1:");
		n1 = teclado.nextInt();
		System.out.println("Ingrese número 2:");
		n2 = teclado.nextInt();
		System.out.println("Ingrese operación: + - * / ");
		operacion = teclado.next();
		switch (operacion) {
		case "+":
			System.out.println("Resultado +:" + (n1 + n2));
			break;
		case "-":
			System.out.println("Resultado -:" + (n1 - n2));
			break;
		case "*":
			System.out.println("Resultado *:" + (n1 * n2));
			break;
		case "/":
			System.out.println("Resultado /:" + (n1 / n2));
			break;
		}

	}

}
