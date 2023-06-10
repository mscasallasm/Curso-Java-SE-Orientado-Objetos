public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private Double weight;
    private Double height;
    String blood;

    Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
