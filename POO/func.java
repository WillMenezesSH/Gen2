package Patinete;

public class func {
	
	private String nomeFunc;
	private String empresaFunc;
	private String salarioFunc;
	private String setorFunc;

	public func (String nome, String empresa, String salario, String setor) {
		nomeFunc = nome;
		empresaFunc = empresa;
		salarioFunc = salario;
		setorFunc = setor;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getEmpresaFunc() {
		return empresaFunc;
	}

	public void setEmpresaFunc(String empresaFunc) {
		this.empresaFunc = empresaFunc;
	}

	public String getSalarioFunc() {
		return salarioFunc;
	}

	public void setSalarioFunc(String salarioFunc) {
		this.salarioFunc = salarioFunc;
	}

	public String getSetorFunc() {
		return setorFunc;
	}

	public void setSetorFunc(String setorFunc) {
		this.setorFunc = setorFunc;
	}

	@Override
	public String toString() {
		return " Nome: " + nomeFunc + "\n Empresa: " + empresaFunc + "\n Salario: " + salarioFunc
				+ " \n Setor: " + setorFunc;
	}
		

}
