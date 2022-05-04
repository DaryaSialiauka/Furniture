package by.it_academy.task.bean;

import by.it_academy.task.view.FurnitureView;

public class Chair extends Furniture {

	private String baseMaterial;
	private String seatMaterial;

	private int leg;
	private boolean heightAdjustment;
	private int maxLoad;

	public Chair() {
		this(0, 0, 0, "", "", "", 0, false, 0);
	}

	public Chair(int height, int width, int length, String manufacturer, String baseMaterial, String seatMaterial,
			int leg, boolean heightAdjustment, int maxLoad) {
		super(height, width, length, manufacturer);
		this.baseMaterial = baseMaterial;
		this.seatMaterial = seatMaterial;
		this.leg = leg;
		this.heightAdjustment = heightAdjustment;
		this.maxLoad = maxLoad;
	}

	public String getBaseMaterial() {
		return baseMaterial;
	}

	public void setBaseMaterial(String baseMaterial) {
		this.baseMaterial = baseMaterial;
	}

	public String getSeatMaterial() {
		return seatMaterial;
	}

	public void setSeatMaterial(String seatMaterial) {
		this.seatMaterial = seatMaterial;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public boolean isHeightAdjustment() {
		return heightAdjustment;
	}

	public void setHeightAdjustment(boolean heightAdjustment) {
		this.heightAdjustment = heightAdjustment;
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	@Override
	public void assemble() {
		FurnitureView.printFurniture("Собрать стул");

	}

	@Override
	public void disassemble() {
		FurnitureView.printFurniture("Разобрать стул");
	}
	
	public void downChair() {
		if(this.heightAdjustment) {
			FurnitureView.printFurniture("Опустить стул");
		} else {
			FurnitureView.printFurniture("Высота не регулируется");
		}
	}
	
	public void upChair() {
		if(this.heightAdjustment) {
			FurnitureView.printFurniture("Поднять стул");
		} else {
			FurnitureView.printFurniture("Высота не регулируется");
		}
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((baseMaterial == null) ? 0 : baseMaterial.hashCode());
		result = prime * result + (heightAdjustment ? 1231 : 1237);
		result = prime * result + leg;
		result = prime * result + maxLoad;
		result = prime * result + ((seatMaterial == null) ? 0 : seatMaterial.hashCode());
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
		Chair other = (Chair) obj;
		if (baseMaterial == null) {
			if (other.baseMaterial != null)
				return false;
		} else if (!baseMaterial.equals(other.baseMaterial))
			return false;
		if (heightAdjustment != other.heightAdjustment)
			return false;
		if (leg != other.leg)
			return false;
		if (maxLoad != other.maxLoad)
			return false;
		if (seatMaterial == null) {
			if (other.seatMaterial != null)
				return false;
		} else if (!seatMaterial.equals(other.seatMaterial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chair [baseMaterial=" + baseMaterial + ", seatMaterial=" + seatMaterial + ", leg=" + leg
				+ ", heightAdjustment=" + heightAdjustment + ", maxLoad=" + maxLoad + "]";
	}

}
