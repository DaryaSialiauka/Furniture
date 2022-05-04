package by.it_academy.task.bean;

import by.it_academy.task.view.FurnitureView;

public abstract class Furniture {
	
	private int height;
	private int width;
	private int length;
	
	private String manufacturer;

	public Furniture() {
		this(0, 0, 0, "");
	}

	public Furniture(int height, int width, int length, String manufacturer) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.manufacturer = manufacturer;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	public abstract void assemble();
	
	public abstract void disassemble();
	
	public void move() {
		FurnitureView.printFurniture("Переместить");
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + length;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furniture other = (Furniture) obj;
		if (height != other.height)
			return false;
		if (length != other.length)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Furniture [height=" + height + ", width=" + width + ", length=" + length + ", manufacturer="
				+ manufacturer + "]";
	}
	
	
	
	
	
	
	
	
}
