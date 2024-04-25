import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        model.Doctor myDoctor = new model.Doctor("Maik", "Master");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        System.out.println(myDoctor);

        //        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }



        model.Patient patient = new model.Patient("Stiven", "stiven@hotmail.com");
//        System.out.println(patient);



    }
}
