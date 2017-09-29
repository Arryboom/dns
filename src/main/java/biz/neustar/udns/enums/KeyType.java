package biz.neustar.udns.enums;

public enum KeyType {
    ZSK(256), KSK(257);
  
    private int type;
    KeyType(int type) {
        this.type = type;
    }

    public int valueOf() {
        return type;
    }
}
