import java.util.Scanner;

public class Contador {
    
	public static void main(String[] args) {
        
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = entrada.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = entrada.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
        entrada.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm < parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            for (int contador = 0; contador <= parametroUm - parametroDois; contador++){
                System.out.println(contador);
            }
        } 
	}
}