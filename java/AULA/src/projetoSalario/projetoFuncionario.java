package projetoSalario;

public class projetoFuncionario {

		protected String matricula;
		protected int horasTrabalhadas;
		protected double valorHora;
		protected String nome;
		protected double adicional;

		public projetoFuncionario(String matricula, int horasTrabalhadas, double valorHora, String nome) {
			super();
			this.matricula = matricula;
			this.horasTrabalhadas = horasTrabalhadas;
			this.valorHora = valorHora;
			this.nome = nome;
		}

		public projetoFuncionario(String matricula2, String nome2) {
			// TODO Auto-generated constructor stub
		}

		public double salario() {

			return (horasTrabalhadas * valorHora);

		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public int getHorasTrabalhadas() {
			return horasTrabalhadas;
		}

		public void setHorasTrabalhadas(int horasTrabalhadas) {
			this.horasTrabalhadas = horasTrabalhadas;
		}

		public double getValorHora() {
			return valorHora;
		}

		public void setValorHora(double valorHora) {
			this.valorHora = valorHora;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
}
