package projectcalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		Operacoes calc = new Operacoes();

		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Digite a expressao: ");
			String s = br.readLine();
			if(s.equals(".")) {
				break;
			}
			System.out.println("Resultado: "+calc.calcula(s));
		}
		System.out.println("Finalizado");
	}
}
