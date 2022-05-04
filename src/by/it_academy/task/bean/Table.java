package by.it_academy.task.bean;

import by.it_academy.task.view.FurnitureView;

public class Table extends Furniture {

	private String form;

	private String baseMaterial;
	private String tabletopMaterial;

	private String Color;
	private int leg;
	private int drawer;

	private boolean folding;

	public Table() {
		this(0, 0, 0, "", "", "", "", "", 0, 0, false);
	}

	public Table(int height, int width, int length, String manufacturer, String form, String baseMaterial,
			String tabletopMaterial, String color, int leg, int drawer, boolean folding) {
		super(height, width, length, manufacturer);
		this.form = form;
		this.baseMaterial = baseMaterial;
		this.tabletopMaterial = tabletopMaterial;
		Color = color;
		this.leg = leg;
		this.drawer = drawer;
		this.folding = folding;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getBaseMaterial() {
		return baseMaterial;
	}

	public void setBaseMaterial(String baseMaterial) {
		this.baseMaterial = baseMaterial;
	}

	public String getTabletopMaterial() {
		return tabletopMaterial;
	}

	public void setTabletopMaterial(String tabletopMaterial) {
		this.tabletopMaterial = tabletopMaterial;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public int getDrawer() {
		return drawer;
	}

	public void setDrawer(int drawer) {
		this.drawer = drawer;
	}

	public boolean isFolding() {
		return folding;
	}

	public void setFolding(boolean folding) {
		this.folding = folding;
	}

	@Override
	public void assemble() {
		FurnitureView.printFurniture("Собрать стол");

	}

	@Override
	public void disassemble() {
		FurnitureView.printFurniture("Разобрать стол");
	}

	public void openDrawer(int i) {
		if (this.drawer == 0) {
			FurnitureView.printFurniture("Ящиков нет");
		} else if (i > this.drawer) {
			FurnitureView.printFurniture("Такого ящика нет");
		} else {
			FurnitureView.printFurniture("Открыть ящик " + i);
		}
	}
	
	public void closeDrawer(int i) {
		if (this.drawer == 0) {
			FurnitureView.printFurniture("Ящиков нет");
		} else if (i > this.drawer) {
			FurnitureView.printFurniture("Такого ящика нет");
		} else {
			FurnitureView.printFurniture("Закрыть ящик " + i);
		}
	}
	
	public void unfold() {
		if(this.folding) {
			FurnitureView.printFurniture("Разложить стол");
		} else {
			FurnitureView.printFurniture("Cтол не раскладывается");
		}
	}
	
	public void fold() {
		if(this.folding) {
			FurnitureView.printFurniture("Сложить стол");
		} else {
			FurnitureView.printFurniture("Cтол не раскладывается");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Color == null) ? 0 : Color.hashCode());
		result = prime * result + ((baseMaterial == null) ? 0 : baseMaterial.hashCode());
		result = prime * result + drawer;
		result = prime * result + (folding ? 1231 : 1237);
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + leg;
		result = prime * result + ((tabletopMaterial == null) ? 0 : tabletopMaterial.hashCode());
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
		Table other = (Table) obj;
		if (Color == null) {
			if (other.Color != null)
				return false;
		} else if (!Color.equals(other.Color))
			return false;
		if (baseMaterial == null) {
			if (other.baseMaterial != null)
				return false;
		} else if (!baseMaterial.equals(other.baseMaterial))
			return false;
		if (drawer != other.drawer)
			return false;
		if (folding != other.folding)
			return false;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (leg != other.leg)
			return false;
		if (tabletopMaterial == null) {
			if (other.tabletopMaterial != null)
				return false;
		} else if (!tabletopMaterial.equals(other.tabletopMaterial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Table [form=" + form + ", baseMaterial=" + baseMaterial + ", tabletopMaterial=" + tabletopMaterial
				+ ", Color=" + Color + ", leg=" + leg + ", drawer=" + drawer + ", folding=" + folding + "]";
	}
	
	
	
	
	
	

}
