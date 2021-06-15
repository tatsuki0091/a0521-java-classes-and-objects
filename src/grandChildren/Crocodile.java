package grandChildren;

import children.Reptile;

public class Crocodile extends Reptile {
	private boolean hardShellEggs;
	
	public Crocodile(){
		this.hardShellEggs = true;
	}

	
	public Crocodile(int height, int weight, String animalType, char bloodType, boolean drySkin, boolean backbone, boolean softShelledEggs, boolean hardShellEggs) {
		super(height, weight, animalType, bloodType, drySkin, backbone, softShelledEggs);
		this.hardShellEggs = hardShellEggs;
	}
	
	public boolean getHardShellEggs() {
		return hardShellEggs;
	}
	
	public String showInfo() {
		return "Crocodile [getHardShellEggs()=" + getHardShellEggs() + ", getDrySkin()=" + getDrySkin() + ", getBackbone()=" + getBackbone() + ", getSoftShelledEggs()=" + getSoftShelledEggs()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()  + ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType()
				+ "]";
	}
	


}
