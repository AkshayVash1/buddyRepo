import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> list;

    public AddressBook(){
        List<BuddyInfo> list = new ArrayList<>();
    }

    public static void main (String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "613", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddy){
        list.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        list.remove(buddy);
    }
}
