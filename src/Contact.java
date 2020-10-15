public class Contact {
    private String phoneNumber;
    private String group;
    private String fullName;
    private String gender;
    private String address;
    private String dateofbirth;
    private String email;

    public Contact(){

    }

    public Contact(String phoneNumber, String group, String fullName, String gender, String address, String dateofbirth, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.dateofbirth = dateofbirth;
        this.email = email;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
        System.out.println(phoneNumber+", "+group+", "+fullName+", "+gender+", "+address+", "+dateofbirth+", "+email);
    }
}
