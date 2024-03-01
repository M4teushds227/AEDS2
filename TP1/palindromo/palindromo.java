
class palindromo{
	public static void main(String[] args){
		boolean i = true, resp;
		MyIO my = new MyIO();
		String palavra = "a";
		int tamanho;
		while(i){	
			palavra = my.readLine();
			if(palavra.length() == 3){
				if(palavra.charAt(0) != 'F' && palavra.charAt(1) != 'I' && palavra.charAt(2) != 'M'){
					resp = true;
					tamanho = palavra.length();
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
				else{
					i = false;
				}
			}else if(palavra.charAt(0) == palavra.charAt(1)){
				my.println("SIM");
			}else{
				my.println("NAO");
			}
		}	
		
	}
}
