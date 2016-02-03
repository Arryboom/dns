package biz.neustar.udns;

import java.util.EnumSet;

import biz.neustar.udns.enums.Type;

public class NAPTRRecord extends ResourceRecord {
	private int order;
	private int priority;
	
	private EnumSet<Flags> flags;
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

	public EnumSet<Flags> getFlags() {
		return flags;
	}

	public void setFlags(EnumSet<Flags> flags) {
		this.flags = flags;
	}
	
	public boolean addFlag(Flags flag) {
		return flags.add(flag);
	}
	
	public boolean containsFlag(Flags flag) {
		return flags.contains(flag);
	}
	
	public enum Flags {
		A("A"),
		S("S"),
		U("U"),
		P("P");
		
		String value;
		
		Flags(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}