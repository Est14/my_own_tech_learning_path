package strings;

public enum CarType {
    SEDAN ("Sedan", 4),
    PICKUP ("Pickup", 4),
    COUPE ("Coupe", 2),
    VAN ("Van", 3);

    private final String name;
    private final int doorsNumbers;

    CarType(String name, int doorsNumbers) {
        this.name = name;
        this.doorsNumbers = doorsNumbers;
    }

    public String getName() {
        return name;
    }

    public int getDoorsNumbers() {
        return doorsNumbers;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", doorsNumbers=" + doorsNumbers;
    }
}
