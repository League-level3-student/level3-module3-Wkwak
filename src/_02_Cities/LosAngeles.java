package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		System.out.println(population*growthRate*growthRate*0.5);
		return population*growthRate * growthRate*0.5;
	}
	
}
