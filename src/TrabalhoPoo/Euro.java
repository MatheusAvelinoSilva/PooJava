package TrabalhoPoo;

public class Euro extends Moeda{ // euro é uma classe filha de moeda

	public Euro(double valorMoeda) { // criando p construtor
		
		super(valorMoeda);
		
	}

	@Override
	void info() { // método que retorna a cédula euro
		
		System.out.println("Valor Moeda Em Euro: "+ valorMoeda);
		
	}

	@Override
	public double converter() { // método que converte euro para real
		
		return valorMoeda * 5.56;
		
	}

	@Override
	public String toString() {
		
		return "Euro: " + valorMoeda;
		
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