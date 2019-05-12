public enum Type {

    BOEING747(8),
    BOEING777(6),
    BOEING787(4),
    BOEING737(2);

    private final int capacity;

    Type(int capacity){
        this.capacity = capacity;
    }

}
