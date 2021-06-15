package children;
import parent.Animal;

public class Fish extends Animal{
	private boolean liveInWater;
	private boolean hasGrill;

	public Fish() {
		this.liveInWater = true;
		this.hasGrill = true;
	}

	public Fish(int height, int weight, String animalType, char bloodType, boolean liveInWater, boolean hasGrill) {
		super(height, weight, animalType, bloodType);
		this.liveInWater = liveInWater;
		this.hasGrill = hasGrill;
	}
	
	public boolean getLiveInWater() {
		return liveInWater;
	}
	
	public boolean getHasGrill() {
		return hasGrill;
	}
	
}
