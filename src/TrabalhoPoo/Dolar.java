package TrabalhoPoo;

public class Dolar extends Moeda{ // dolar é uma classe filha de moeda

	public Dolar(double valorMoeda) { // criando p construtor
		
		super(valorMoeda);
		
	}

	@Override
	void info() { // método que retorna a cédula dolar
		
		System.out.println("Valor Moeda Em Dolar: "+ valorMoeda);
		
	}

	@Override
	public double converter() { // método que converte dolar para real
		
		return valorMoeda * 5.06;
		
	}

	@Override
	public String toString() {
		
		return "Dolar: " + valorMoeda;
		
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