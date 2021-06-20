package generics;

public class GenericClass<T> {
    private T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public void getType() {
        System.out.println("Type T is: " + this.object.getClass().getSimpleName());
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
