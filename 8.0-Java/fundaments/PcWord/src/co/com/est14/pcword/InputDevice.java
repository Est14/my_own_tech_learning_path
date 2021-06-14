package co.com.est14.pcword;

public class InputDevice {

    protected String inputType;
    protected String mark;

    public InputDevice(String inputType, String mark) {
        this.inputType = inputType;
        this.mark = mark;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InputDevice{");
        sb.append("inputType='").append(inputType).append('\'');
        sb.append(", mark='").append(mark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
