/**
 * Algoritmo de ordenacao por insercao
 * @author Max do Val Machado
 * @version 3 01/2020
 */

class Insercao extends Geracao {

	/**
	 * Construtor.
	 */
   public Insercao(){
      super();
   }


	/**
	 * Construtor.
	 * @param int tamanho do array de numeros inteiros.
	 */
   public Insercao(int tamanho){
      super(tamanho);
   }


	/**
	 * Algoritmo de ordenacao por insercao.
	 */
   @Override
   public void sort() {
		for (int i = 1; i < n; i++) {
			int tmp = array[i];
         int j = i - 1;
         
         while ((j >= 0) && (array[j] > tmp)) {
            contCom +=2;
            array[j + 1] = array[j];
            contMov  ++;
            j--;
         }
         contCom ++;
         array[j + 1] = tmp;
         contMov  ++;
      }
	}
   
   public void contsT(){
      System.out.println("Quantidades de Movimentações teoricas : 0");
		System.out.println("Quantidades de Comparações teoricas : 0" );   
   }
}
