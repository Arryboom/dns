package biz.neustar.udns;

import biz.neustar.udns.enums.Type;

public class NAPTRRecord extends ResourceRecord {
	private int order;
	private int priority;
	
	private String flags;
	private String services;
	private String regexp;
	
	private Name replacement;
	
	public NAPTRRecord() {
		type = Type.NAPTR;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getRegexp() {
		return regexp;
	}

	public void setRegexp(String regexp) {
		this.regexp = regexp;
	}

	public Name getReplacement() {
		return replacement;
	}

	public void setReplacement(Name replacement) {
		this.replacement = replacement;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}
}