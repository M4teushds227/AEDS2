class palindromo {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		boolean resp;
		MyIO my = new MyIO();
		String palavra = my.readLine();
		int tamanho;
		while (!(palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M')) {
			tamanho = palavra.length();
			resp = palin(palavra, tamanho);
			if (tamanho > 2) {
				if (resp) {
					my.println("SIM");
				} else {
					my.println("NAO");
				}
			} else if (palavra.charAt(0) == palavra.charAt(1)) {
				my.println("SIM");
			} else {
				my.println("NAO");
			}
			palavra = my.readLine();
		}
	}

	public static boolean palin(String frase, int tamanho) {
		boolean resp = true;
		for (int x = 0; x < tamanho / 2; x++) {
			if (frase.charAt(x) != frase.charAt(tamanho - 1 - x)) {
				resp = false;
				x = tamanho;
			}
		}
		return resp;
	}
}
