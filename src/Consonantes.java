
public class Consonantes {
	public static void main(String[] args){
	String palabra ="waaaw";
	int contador = 0;
	
	
		for(int x=0;x<palabra.length();x++) {
			  if (!(palabra.charAt(x)=='a') || (palabra.charAt(x)=='e') || (palabra.charAt(x)=='i') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='u')){
			    contador++;
			  }
			
		}System.out.println("el texto ---> " + palabra + " <--- contiene " + contador + " consonantes");
	}
}
