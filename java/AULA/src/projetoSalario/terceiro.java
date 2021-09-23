package projetoSalario;

 
	public class terceiro extends projetoFuncionario {

	

		public terceiro(String matricula, int horasTrabalhadas, double valorHora, String nome) {
			super(matricula, horasTrabalhadas, valorHora, nome);
			// TODO Auto-generated constructor stub
		}
		public terceiro(String matricula , String nome) {
			super(matricula,nome);
		}
			// TODO Auto-generated constructor stub
		@Override
		public double salario() {

			return ((horasTrabalhadas * valorHora) + adicional);

		}

}
