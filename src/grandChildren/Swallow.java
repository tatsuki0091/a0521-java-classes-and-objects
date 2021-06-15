package grandChildren;

import children.Birds;

public class Swallow extends Birds{
	
	public Swallow() {

	}
	
	public Swallow(int height, int weight, String animalType, char bloodType, boolean animalsWith, String features, boolean canFly) {
		super(height, weight, animalType, bloodType, animalsWith, features, canFly);
	}
	
	
	public String showInfo() {
		return "Swallow [getAnimalsWith()=" + getAnimalsWith() + ", getFeatures()=" + getFeatures() + ", getCanFly()=" + getCanFly() 
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()  + ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType()
				+ "]";
	}

}
