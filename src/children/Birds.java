package children;
import parent.Animal;
public class Birds extends Animal{
	private boolean animalsWith;
	private String features;
	private boolean canFly;

	public Birds() {
		this.animalsWith = true;
		this.features = "testtesttesttest";
		this.canFly = true;
	}

	public Birds(int height, int weight, String animalType, char bloodType, boolean animalsWith, String features, boolean canFly) {
		super(height, weight, animalType, bloodType);
		this.animalsWith = animalsWith;
		this.features = features;
		this.canFly = canFly;
	}
	
	public boolean getAnimalsWith() {
		return animalsWith;
	}
	
	public String getFeatures() {
		return features;
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	

}
