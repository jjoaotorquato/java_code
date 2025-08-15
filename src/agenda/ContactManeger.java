package agenda;

import java.util.ArrayList;
import java.util.List;

public class ContactManeger extends Contacts{
    private List <Contacts> contactsLsit;

    public ContactManeger(){
        contactsLsit = new ArrayList<>();
    }

    public void addContact(Contacts contact){
        contactsLsit.add(contact);
    }

    public List<Contacts> searchByName(String name){
        List<Contacts> results = new ArrayList<>();
        for(Contacts contacts : contactsLsit){
            if(contacts.getName().equalsIgnoreCase(name)){
                results.add(contacts);
            }
        }
        return results;
    }
}
