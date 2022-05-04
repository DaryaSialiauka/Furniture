package by.it_academy.task.bean;

import by.it_academy.task.view.FurnitureView;

public class Wardrobe extends Furniture {

	private String typeWardrobe;
	private String typeDoor;
	private int door;
	private boolean mirror;

	private String baseMaterial;
	private String doorMaterial;

	public Wardrobe() {
		this(0, 0, 0, "", "", "", 0, false, "", "");
	}

	public Wardrobe(int height, int width, int length, String manufacturer, String typeWardrobe, String typeDoor,
			int door, boolean mirror, String baseMaterial, String doorMaterial) {
		super(height, width, length, manufacturer);
		this.typeWardrobe = typeWardrobe;
		this.typeDoor = typeDoor;
		this.door = door;
		this.mirror = mirror;
		this.baseMaterial = baseMaterial;
		this.doorMaterial = doorMaterial;
	}

	public String getTypeWardrobe() {
		return typeWardrobe;
	}

	public void setTypeWardrobe(String typeWardrobe) {
		this.typeWardrobe = typeWardrobe;
	}

	public String getTypeDoor() {
		return typeDoor;
	}

	public void setTypeDoor(String typeDoor) {
		this.typeDoor = typeDoor;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isMirror() {
		return mirror;
	}

	public void setMirror(boolean mirror) {
		this.mirror = mirror;
	}

	public String getBaseMaterial() {
		return baseMaterial;
	}

	public void setBaseMaterial(String baseMaterial) {
		this.baseMaterial = baseMaterial;
	}

	public String getDoorMaterial() {
		return doorMaterial;
	}

	public void setDoorMaterial(String doorMaterial) {
		this.doorMaterial = doorMaterial;
	}

	public void openDoor(int i) {
		if (this.door == 0) {
			FurnitureView.printFurniture("Дверей нет");
		} else if (i > this.door) {
			FurnitureView.printFurniture("Такой двери нет");
		} else {
			FurnitureView.printFurniture("Открыть дверь " + i);
		}
	}

	public void closeDoor(int i) {
		if (this.door == 0) {
			FurnitureView.printFurniture("Дверей нет");
		} else if (i > this.door) {
			FurnitureView.printFurniture("Такой двери нет");
		} else {
			FurnitureView.printFurniture("Закрыть дверь " + i);
		}
	}

	@Override
	public void assemble() {
		FurnitureView.printFurniture("Собрать шкаф");

	}

	@Override
	public void disassemble() {
		FurnitureView.printFurniture("Разобрать шкаф");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((baseMaterial == null) ? 0 : baseMaterial.hashCode());
		result = prime * result + door;
		result = prime * result + ((doorMaterial == null) ? 0 : doorMaterial.hashCode());
		result = prime * result + (mirror ? 1231 : 1237);
		result = prime * result + ((typeDoor == null) ? 0 : typeDoor.hashCode());
		result = prime * result + ((typeWardrobe == null) ? 0 : typeWardrobe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wardrobe other = (Wardrobe) obj;
		if (baseMaterial == null) {
			if (other.baseMaterial != null)
				return false;
		} else if (!baseMaterial.equals(other.baseMaterial))
			return false;
		if (door != other.door)
			return false;
		if (doorMaterial == null) {
			if (other.doorMaterial != null)
				return false;
		} else if (!doorMaterial.equals(other.doorMaterial))
			return false;
		if (mirror != other.mirror)
			return false;
		if (typeDoor == null) {
			if (other.typeDoor != null)
				return false;
		} else if (!typeDoor.equals(other.typeDoor))
			return false;
		if (typeWardrobe == null) {
			if (other.typeWardrobe != null)
				return false;
		} else if (!typeWardrobe.equals(other.typeWardrobe))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wardrobe [typeWardrobe=" + typeWardrobe + ", typeDoor=" + typeDoor + ", door=" + door + ", mirror="
				+ mirror + ", baseMaterial=" + baseMaterial + ", doorMaterial=" + doorMaterial + "]";
	}
	
	
	

}
