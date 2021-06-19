package test;

import domain.Worker;
import domain.WriteType;
import domain.Writer;

public class TestObjectCovert {
    public static void main(String[] args) {

        Worker worker1;

        worker1 = new Writer("Miguel", 5500, WriteType.CLASSIC);
        System.out.println(worker1.getDetails());

        //Down casting
        ((Writer)worker1).getWriteType();
        Writer writer = (Writer) worker1;

        //Up casting
        Worker worker2 = writer;

    }
}
