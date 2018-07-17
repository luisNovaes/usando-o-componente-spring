package br.com.aplicacao.services;

public class CalcularResponse {

	private String salarioBruto;
	private String salarioComDesconto;
	private float aliquotaCobrada;

	public CalcularResponse() {

	}

	public CalcularResponse(String salarioBruto, String salarioComDesconto, float aliquotaCobrada) {
		super();
		this.salarioBruto = salarioBruto;
		this.salarioComDesconto = salarioComDesconto;
		this.aliquotaCobrada = aliquotaCobrada;
	}

	public String getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(String salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public String getSalarioComDesconto() {
		return salarioComDesconto;
	}

	public void setSalarioComDesconto(String salarioComDesconto) {
		this.salarioComDesconto = salarioComDesconto;
	}

	public float getAliquotaCobrada() {
		return aliquotaCobrada;
	}

	public void setAliquotaCobrada(float aliquotaCobrada) {
		this.aliquotaCobrada = aliquotaCobrada;
	}

}
