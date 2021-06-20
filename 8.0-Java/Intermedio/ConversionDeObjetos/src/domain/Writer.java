package domain;

public class Writer extends Worker {

    final WriteType writeType;

    public Writer(String name, double salary, WriteType writeType) {
        super(name, salary);
        this.writeType = writeType;
    }


    public WriteType getWriteType() {
        return this.writeType;
    }
    @Override
    public String getDetails(){

        return super.getDetails() + "\n" +
                "Department: " + this.writeType.getDescription();
    }
}
