package encapsulamento;

public class estrutura_Caneta {
	
	private String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;

	
	public estrutura_Caneta( String m, String c, double p) {
		
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.setTampada(true);
		
	}

	public String getModelo() {
		
		return this.modelo;
		
	}
	
	public void setModelo(String m) {
		
		this.modelo = m;
		
	}
	
	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		this.cor = c;
	}

	public double getPonta() {
		
		return this.ponta;
		
	}
	
	public void setPonta(double p) {
		
		this.ponta = p;
		
	}
	
	public void tampar() {
		
		this.tampada = true;
		
	}
	
	public void destampar() {
		
		this.tampada = false;
				
		
	}

	
	public void status() {
		
		System.out.println(">>>>>>>>>>>>>>>>>>> Sobre a Caneta <<<<<<<<<<<<<<<<<<<<<< ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("ponta: " + this.getPonta());
		System.out.println("cor: " + this.getCor());
		System.out.println("tampada: " + this.isTampada());
	}
	
}
