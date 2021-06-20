package co.com.est14.pcword;

public class Computer {

    private int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCounter;

    private Computer() {
        this.idComputer = ++ Computer.computerCounter;
    }

    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return this.idComputer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static int getComputerCounter() {
        return Computer.computerCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("idComputer=").append(idComputer);
        sb.append(", name='").append(name).append('\'');
        sb.append(", monitor=").append(monitor);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", mouse=").append(mouse);
        sb.append('}');
        return sb.toString();
    }
}
