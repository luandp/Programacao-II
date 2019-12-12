package abstratas;

public class EmpregadoComissionado extends EmpregadoAssalariado {

	protected double valorVendas;
	protected double comissao;

	public EmpregadoComissionado(String nome, String cpf, double salario,
			double valorVendas, double comissao) {
		super(nome, cpf, salario);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double valorComissao() {
		return valorVendas * comissao / 100;
	}

	@Override
	public double getPagamento() {
		return super.salario + valorComissao();
	}

	@Override
	public String toString() {
		return super.toString() + "\nComissao % " + comissao + "\nVendas R$ "
				+ valorVendas;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
