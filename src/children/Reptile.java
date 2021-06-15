package children;

import parent.Animal;

public class Reptile extends Animal {
	private boolean drySkin;
	private boolean backbone;
	private boolean softShelledEggs;

	public Reptile() {
		this.drySkin = true;
		this.backbone = true;
		this.softShelledEggs = true;
	}

	public Reptile(int height, int weight, String animalType, char bloodType, boolean drySkin, boolean backbone, boolean softShelledEggs) {
		super(height, weight, animalType, bloodType);
		this.drySkin = drySkin;
		this.backbone = backbone;
		this.softShelledEggs = softShelledEggs;
	}
	
	public boolean getDrySkin() {
		return drySkin;
	}
	
	public boolean getBackbone() {
		return backbone;
	}
	
	public boolean getSoftShelledEggs() {
		return softShelledEggs;
	}

}
