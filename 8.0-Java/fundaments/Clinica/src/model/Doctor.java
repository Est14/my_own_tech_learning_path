package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    String speciality;

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    // This is a collection
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void AvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    // This return our collections with appointments
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Speciality = " + speciality +
                '\n' +
                '}';
    }

    // Getter and Setter
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // This is a Nets Class
    public static class AvailableAppointment{
        private int id = 0;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.id = id++;
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
