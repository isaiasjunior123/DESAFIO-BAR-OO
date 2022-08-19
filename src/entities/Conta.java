package entities;

public class Conta {

	public char sexo;
	public int cerveja;
	public int refrigerante;
	public int espeto;

	public double ingresso() {
		if (sexo == 'M' || sexo == 'm') {
			return 10.0;
		} else {
			return 8.0;
		}
	}

	public double consumo() {
		return (cerveja * 5) + (refrigerante * 3) + (espeto * 7);
	}

	public double couvert() {
		if (consumo() > 30) {
			return 0;
		} else {
			return 4.0;
		}
	}
	
	public double total() {return ingresso()+ consumo()+ couvert();}

}
