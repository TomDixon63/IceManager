package util;

public enum ProductsEnum {

	W2B("2-Kg-Beutel-Würfeleis"), W5B("5-Kg-Beutel-Würfeleis"), W15B("15-Kg-Beutel-Würfeleis"), WL("Würfeleis"),
	C2B("2-Kg-Beutel-Crushed-Eis"), C5B("5-Kg-Beutel-Crushed-Eis"), C15B("15-Kg-Beutel-Crushed-Eis"), CL("Crushed-Eis");

	public final String label;

	private ProductsEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public static ProductsEnum valueOfLabel(String label) {
		for (ProductsEnum e : values()) {
			if (e.label.equals(label)) {
				return e;
			}
		}
		return null;
	}

}
