package agenda;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ContactManeger maneger = new ContactManeger();

        Contacts contatct1 = new Contacts();

        contatct1.setName("joao");
        contatct1.setEmail("joao@email.com");
        contatct1.setNumber("123456789");

        Contacts conntact2 = new Contacts();

        conntact2.setName("bob");
        conntact2.setEmail("bob@email.com");
        conntact2.setNumber("0123");

        maneger.addContact(contatct1);
        maneger.addContact(conntact2);

        List <Contacts> found = maneger.searchByName("bob");
        for(Contacts c : found){
            System.out.println(c);
        }
    }
}
