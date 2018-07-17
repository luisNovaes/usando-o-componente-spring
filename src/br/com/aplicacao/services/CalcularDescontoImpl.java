package br.com.aplicacao.services;

import java.text.DecimalFormat;

public class CalcularDescontoImpl implements ICalcularDesconto {

	private float retornaAliquota(Float salario) {

		if (salario < 1903.98F)
			return 0F;
		else if (salario >= 1903.99F && salario <= 2826.65F)
			return 7.5F;
		else if (salario >= 2826.66F && salario <= 3751.05F)
			return 15.0F;
		else if (salario >= 3751.06F && salario <= 4664.68F)
			return 22.5F;
		else
			return 27.5F; // Acima de R$ 4.664,68

	}

	@Override
	public CalcularResponse calcular(CalcularRequest request) {
		
		float aliquota = this.retornaAliquota(request.getSalario());

		float desconto = ((request.getSalario() * aliquota) / 100);

		float salarioComDesconto = (request.getSalario() - desconto);

		DecimalFormat df = new DecimalFormat("#,000.00");

		return new CalcularResponse(df.format(request.getSalario()),
				df.format(salarioComDesconto), aliquota);

	}

}
