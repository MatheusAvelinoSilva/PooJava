package TrabalhoPoo;

import java.util.Objects;

public abstract class Moeda { // moeda é classe mãe de dolar,euro e real

	double valorMoeda;

	abstract void info(); // método abstrato para retornar as cedulas
	abstract double converter(); // método abstrato para converte todas as cedulas para real

	Moeda(double valorMoeda) { // criando o construtor

		super();
		this.valorMoeda = valorMoeda;

	}
	
	@Override
	public int hashCode() {

		return Objects.hash(valorMoeda);

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (obj == null)

			return false;

		if (getClass() != obj.getClass())

			return false;

		Moeda other = (Moeda) obj;

		return Double.doubleToLongBits(valorMoeda) == Double.doubleToLongBits(other.valorMoeda);

	}
}