package biz.neustar.udns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a DNS domain name
 * @author Shawn Forney
 *
 */
public class Name {
	
	private List<Label> labels;
	
	
	/**
	 * Creates a Name from a string
	 * @param str
	 * @return
	 */
	public static Name create(String str) {
		String [] labelStrings = str.split(".");
		Name name = new Name();
		for(String label : labelStrings) {
			if(label.length() > 0) {
				name.addLabel(new Label(label));
			}
		}
		return name;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = new ArrayList<Label>(labels.size());
		Collections.copy(this.labels, labels);
	}
	
	public void addLabel(Label label) {
		labels.add(label);
	}
}
