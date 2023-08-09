package TrabalhoPoo;

public class Real extends Moeda {  // real é uma classe filha de moeda

	public Real(double valorMoeda) {// criando p construtor

		super(valorMoeda);

	}

	@Override
	void info() { // método que retorna a cédula real

		System.out.println("Valor Moeda Em Real: " + valorMoeda);

	}

	@Override
	public double converter() { // método que converte real para real

		return valorMoeda;

	}

	@Override
	public String toString() {

		return "Real: " + valorMoeda;

	}

	@Override
	public int hashCode() {

		return super.hashCode();

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (!super.equals(obj))

			return false;

		if (getClass() != obj.getClass())

			return false;

		return true;

	}
}