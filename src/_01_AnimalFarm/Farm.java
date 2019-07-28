package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		
		Animal chicken = new Chicken();
		Animal sheep = new Sheep();
		Animal cow = new Cow();
		Animal pig = new Pig();
		Animal sheep2 = new Sheep();
		Animal chicken2 = new Chicken();
		
		farm.add(chicken);
		farm.add(chicken2);
		farm.add(sheep);
		farm.add(sheep2);
		farm.add(cow);
		farm.add(pig);
		
		for(int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).task();
			System.out.println();
		}
	}
}
