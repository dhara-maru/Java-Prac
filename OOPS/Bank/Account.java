package Bank;

public class Account {

    public String name; //if public is removed then it will be only accessible inside the package "Bank" 
    protected String email; //other package's subclasses only can use this. and anyone in current package. 
    private String password; //only in this class

    public void displayname(String name) {
        System.out.println(name);
    }

    //getter & setter : to access private modifiers
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pwd) {
        this.password = pwd;
    }
}
