package biz.neustar.udns.records;

public class Label {
	private static final int MAX_LABEL_SIZE = 63;
	
	private String label;
	
	public Label(String label) {
		setLabel(label);
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		if(label.length() <= MAX_LABEL_SIZE) {
			this.label = label;
		} else {
			this.label = label.substring(0, MAX_LABEL_SIZE);
		}
	}
}
