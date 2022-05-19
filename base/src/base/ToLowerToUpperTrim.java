package base;

public class ToLowerToUpperTrim {

	public static void main(String[] args) {
		
		String original = " abcde FGHIJ ABC abc DEFG   ";
		
		String teste01 = original.toLowerCase();  // converter para letras min�sculas
		String teste02 = original.toUpperCase();  // converter para letras mai�sculas
		String teste03 = original.trim();  // eliminar os espa�os em branco nos cantos da string
		String teste04 = original.substring(2);  // criar uma nova string do caracter 2 em diante
		String teste05 = original.substring(2, 9);  // criar uma nova string do caracter 2 at� o 9 (sem incluir o 9)
		String teste06 = original.replace('a', 'x');  // modificar string a por string x
		String teste07 = original.replace("abc", "xyz");  // modificar string abc por string xyz
		int teste08 = original.indexOf("bc");  // verificar a primeira ocorr�ncia de uma sequ�ncia de caracteres
		int teste09 = original.lastIndexOf("bc");  // verificar a �ltima ocorr�ncia de uma sequ�ncia de caracteres
		int teste10 = original.length(); // contar o n�mero de caracteres

		
		System.out.println("original: -" + original + "-");
		System.out.println("-----------------------------------------------------");
		System.out.println("toLowerCase: -" + teste01 + "-");
		System.out.println("toUpperCase -" + teste02 + "-");
		System.out.println("trim: -" + teste03 + "-");
		System.out.println("substring(2): - " + teste04 + "-");
		System.out.println("substring(2, 9): -" + teste05 + "-");
		System.out.println("replace('a', 'x'): -" + teste06 + "-");
		System.out.println("replace('abc', 'xy'): -" + teste07 + "-");
		System.out.println("indexOf 'bc': " + teste08);
		System.out.println("indexOf 'bc': " + teste09);
		System.out.println("length: " + teste10);
		
	}

}
