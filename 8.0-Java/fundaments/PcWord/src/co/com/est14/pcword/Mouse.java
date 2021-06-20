package co.com.est14.pcword;

public class Mouse extends InputDevice{

    private final int idMouse;
    private static int mouseCounter;

    public Mouse(String inputType, String mark) {
        super(inputType, mark);
        this.idMouse = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("idMouse=").append(idMouse);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
