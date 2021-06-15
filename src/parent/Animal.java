package parent;

public class Animal {
	private int height;
	private int weight;
	private String animalType;
	private char bloodType;
	
	public Animal() {
		this.height = 100;
		this.weight = 20;
		this.animalType = "Reptile";
		this.bloodType = 'A';
	}
	
	public Animal(int height, int weight, String animalType, char bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	
	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public char getBloodType() {
		return bloodType;
	}

}
