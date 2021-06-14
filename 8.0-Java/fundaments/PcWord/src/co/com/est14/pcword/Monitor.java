package co.com.est14.pcword;

public class Monitor {

    private final int monitorId;
    private String monitorMark;
    private double size;
    private static int monitorCounter;

    private Monitor(){
        this.monitorId = ++ Monitor.monitorCounter;
    }

    public Monitor(String mark, double size){
        this();
        this.monitorMark = mark;
        this.size = size;
    }

    public int getMonitorId() {
        return this.monitorId;
    }

    public String getMonitorMark() {
        return this.monitorMark;
    }

    public void setMonitorMark(String monitorMark) {
        this.monitorMark = monitorMark;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static int getMonitorCounter() {
        return Monitor.monitorCounter;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("monitorId=").append(monitorId);
        sb.append(", monitorMark='").append(monitorMark).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
