package domain;

import java.util.Date;

public class Client extends Person {

    private int idClient;
    private Date date;
    private boolean vip;
    private static int counter;

    public Client(String name, char gender, int age, String address, Date date, boolean vip) {
        super(name, gender, age, address);
        this.date = date;
        this.idClient = ++Client.counter;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public Date getDate() {
        return date;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", date=").append(date);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
