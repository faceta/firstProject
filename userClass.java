public /**
 * User
 */
public class User {

    public User () {
        private String surname;
        private String name;
        private String patronymice;
        private int phone;       
    }

    public setSurname(surname){
        this.surname = surname;
    }
    
    public setName(name){
        this.name = name;
    }
    
    public setPatronymice(patronymice){
        this.patronymice = patronymice;
    }
    
    public setPhone(surname){
        this.phone = phone;
    }

    public String getSurname(){
       return surname;
    }
    
    public String getName({
        return name;
    }
    
    public String getPatronymice(){
        return patronymice;
    }
    
    public String getPhone(){
        return phone;
    }
}

public class UserBuilder {
    private String surname;
    private String name;
    private String patronymice;
    private int phone;  

    public getSurname(String surname){
        this.surname = surname;
        return surname;
    }
    
    public getName(String name){
        this.name = name;
        return name;
    }
    
    public getPatronymice(String patronymice){
        this.patronymice = patronymice;
        return patronymice;
    }
    
    public getPhone(String surname){
        this.phone = phone;
        return phone;
    }

    public User build() {
        return new User(surname, name, patronymice, phone);
    }

}