package testeGitHub.executavel;

public class testegithub {
	
	 
		public static void main(String[] args) {
			
			int nota1 = 100;
			int nota2 = 70;
			int nota3 = 60;
			int nota4 = 60;
			
			int mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
			
			if(mediaFinal >= 60) {
				System.out.println("Vc esta aprovado");
			}else {
				System.out.println("Vc esta reprovado");
			}
			
		}
		
		
	
}
