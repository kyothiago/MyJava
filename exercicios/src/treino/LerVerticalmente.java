package treino;

public class LerVerticalmente {
	public static void main(String[] args) {
		String[] arr = new String[] {
				"Picles", 
				"Pepino", 
				"Banana", 
				"Mais",
				"Alguma"
				};
		String resultado = "";
		String maiorPalavra = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > maiorPalavra.length())
				maiorPalavra = arr[i];
		}try {
			
        for(int i = 0; i < maiorPalavra.length(); i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
          	resultado = resultado + arr[j].charAt(i);
            }
        }
	}
		catch(Exception IndexOutOfBounds) {
		}
            finally{
            	System.out.println(resultado);	
            }
	}
}
