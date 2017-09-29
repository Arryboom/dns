package biz.neustar.udns.enums;

public enum DigestType {
    SHA1(1), SHA256(2), GOST(3), SHA384(4);
    public int type;

    private DigestType(int type) {
        this.type = type;
    }

    public int valueOf() {
        return type;
    }
}
