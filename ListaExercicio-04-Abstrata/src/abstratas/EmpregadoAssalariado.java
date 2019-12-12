package abstratas;

public class EmpregadoAssalariado extends EmpregadoAbstrato{

		protected double salario;

	public EmpregadoAssalariado(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}

	
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

        @Override
	public double getPagamento() {
		return salario;
	}

	@Override
	public String toString() {
            
            return super.toString()+"Salario:"+this.salario;
	}
	



}
