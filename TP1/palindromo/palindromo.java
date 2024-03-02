class palindromo{
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		boolean i = true, resp;
		MyIO my = new MyIO();
		String palavra = "a";
		int tamanho;
		while(i){	
			resp = true;
			palavra = my.readLine();
			tamanho = palavra.length();
			if(tamanho > 2){
				if(palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M'){
					i = false;
				}else{
					for(int in = 0, vol = (tamanho - 1);in < (tamanho/2);in ++,vol --){
						if(palavra.charAt(in) != palavra.charAt(vol)){
							resp = false;
							in = tamanho;
						}
					}
					if(resp == true){
						my.println("SIM");
					}else{
						my.println("NAO");
					}
				}
			}else if(palavra.charAt(0) == palavra.charAt(1)){
				my.println("SIM");
			}else{
				my.println("NAO");
			}
		}	
	}
}
