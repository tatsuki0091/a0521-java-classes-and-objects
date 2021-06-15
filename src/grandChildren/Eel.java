package grandChildren;

import children.Fish;

public class Eel extends Fish{
	private boolean releaseElectricChange;

	public Eel(){
		this.releaseElectricChange = true;
	}

	public Eel(int height, int weight, String animalType, char bloodType, boolean liveInWater, boolean hasGrill, boolean releaseElectricChange) {
		super(height, weight, animalType, bloodType, liveInWater, hasGrill);
		this.releaseElectricChange = releaseElectricChange;
	}

	public boolean getReleaseElectricChange() {
		return releaseElectricChange;
	}

	public String showInfo() {
		return "Eel [getReleaseElectricChange()=" + getReleaseElectricChange() + ", getLiveInWater()=" + getLiveInWater() + ", getHasGrill()=" + getHasGrill()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()  + ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType()
				+ "]";
	}

}
