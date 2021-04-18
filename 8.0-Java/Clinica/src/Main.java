import static IUM.UIMenu.*;
public class Main {

    public static void main(String[] args) {

        Patient patient_1 = new Patient("Carlos", "c14@gmail.com");
        System.out.println("Esta es la clase:");
        System.out.println(patient_1);
        System.out.println("--------");
        patient_1.setPhoneNumber("12345869");
        System.out.println(patient_1.getName());
        System.out.println(patient_1.getPhoneNumber());

        patient_1.setBirthday("30/06/1990");
        System.out.println(patient_1);
    }

}
