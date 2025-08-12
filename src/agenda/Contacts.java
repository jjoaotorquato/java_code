package agenda;

public class Contacts {
    String name;
    String email;
    String number;

    public void  setName(String name){
        this.name = name;
    }

    public void  setEmail(String email){
        this.email = email;
    }

    public void  setNumber(String number){
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getNumber(){
        return number;
    }

    @Override
    public String toString(){
        return "name: "+name+" email: "+email+" number: "+number;
    }

}
