public class BuddyInfo {

    private String name;
    private String phoneNumber;
    private String address;

    public BuddyInfo(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printBuddyInfo() {
        System.out.print("Buddy: " + this.getName() + ", " + this.getPhoneNumber() + ", " + this.getAddress() + "\n");
    }
    
    public static void main(String[] args) {

        BuddyInfo A = new BuddyInfo("Akshay", "123-456-7891", "123 Way");

        System.out.println("Hello " + A.getName());
        
        System.out.println("Git");
    }
}
