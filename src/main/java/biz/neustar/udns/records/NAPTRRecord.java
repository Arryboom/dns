package biz.neustar.udns.records;

import java.util.EnumSet;

import biz.neustar.udns.enums.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
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

    public NAPTRRecord(int order, int priority, EnumSet<Flags> flags, String services, String regexp,
            Name replacement) {
        this.order = order;
        this.priority = priority;
        this.flags = flags;
        this.services = services;
        this.regexp = regexp;
        this.replacement = replacement;
        type = Type.NAPTR;
    }

    public boolean addFlag(Flags flag) {
        return flags.add(flag);
    }

    public boolean containsFlag(Flags flag) {
        return flags.contains(flag);
    }

    public enum Flags {
        A("A"), S("S"), U("U"), P("P");

        String value;

        Flags(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}