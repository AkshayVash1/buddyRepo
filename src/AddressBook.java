import java.util.ArrayList;


public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            myBuddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main (String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "613", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(1);
        BuddyInfo buddy2 = new BuddyInfo("Jim", "271", "Carleton");
        addressBook.addBuddy(buddy2);
    }
}
