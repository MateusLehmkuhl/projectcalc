package projectcalc;

public class Operacoes {
	private double num1=0;
	private double num2=0;
	private int opos;
	private String n1;
	private String n2;
	private String op;

	public Operacoes() {

	}

	public Operacoes(double num1, double num2, String op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	public double calcula(String expressao) {
		if(this.montaExpressao(expressao)) {
			if(op.equals("+")) {
				return soma();
			}
			if(op.equals("-")) {
				return sub();
			}
			if(op.equals("*")) {
				return mult();
			}
			if(op.equals("/")) {
				return div();
			}
			if(op.equals("%")) {
				return mod();
			}
		}
		return 666;
	}

	private boolean montaExpressao(String expressao) {
		opos = this.obterOperador(expressao);
		if(opos==-1) {
			return false;
		}
		n1 = expressao.substring(0, opos);
		n2 = expressao.substring(opos+1);
		op = expressao.substring(opos,opos+1);
		num1 = Integer.parseInt(n1);
		num2 = Integer.parseInt(n2);
		return true;
	}

	private int obterOperador(String expressao) {
		for (int i = 0; i < expressao.length(); i++) {
			if (isOperador(expressao.charAt(i))) {
				return i;
			}
		}
		System.out.println("Nenhum operador encontrado");
		return -1;
	}

	private boolean isOperador(char caracter) {
		boolean isOperador = false;
		if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*' || caracter == '%') {
			isOperador = true;
		}
		return isOperador;
	}

	private double soma() {
		return num1+num2;
	}

	private double sub() {
		return num1-num2;
	}

	private double mult() {
		return num1*num2;
	}

	private double div() {
		return num1/num2;
	}

	private double mod() {
		return num1%num2;
	}

	public double getNum1() {
		return num1;
	}		
}
