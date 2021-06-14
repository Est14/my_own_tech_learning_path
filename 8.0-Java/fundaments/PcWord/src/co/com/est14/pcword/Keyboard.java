package co.com.est14.pcword;

public class Keyboard extends InputDevice {

    private final int keyBoardId;
    private static int keyBoardCounter;

    public Keyboard(String inputType, String mark){
        super(inputType, mark);
        this.keyBoardId = ++Keyboard.keyBoardCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("keyBoardId=").append(keyBoardId);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
