import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Maik", "Master");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

//        System.out.println(myDoctor);

        User user = new Doctor("Pepe", "pepe@corre.com");
        user.showDataUser();

        User userPa = new Patient("Pepe", "pepes@correo.com");
        userPa.showDataUser();

        User user1 = new User("Pepe", "pepe@correo.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamente: Geriatría");
            }
        };

        user1.showDataUser();

        //        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }



//        model.Patient patient = new model.Patient("Stiven", "stiven@hotmail.com");
//        System.out.println(patient);



    }
}
