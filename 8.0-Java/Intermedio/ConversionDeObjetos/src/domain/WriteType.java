package domain;

public enum WriteType {

    CLASSIC("Hand writer"),
    MODER("Digital writer");

    private final String description;

    private WriteType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
