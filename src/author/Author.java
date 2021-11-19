package author;

//Նշանակում է հեղինակ
public class Author {
    //ստրինգի օգնությամբ ուզում ենք անունը
    private String name;
    //ուզում ենք ազգանունը
    private String surname;
    //ուզում ենք տարիքը
    private int arg;
    //ուզում ենք էլեկտրոննի հասցեն
    private String email;
    // ուզում եքն սեռը
    private String gender;

    //ջեներեյշնի միջոցով տալիս ենք կանստրուկտր
    public Author(String name, String surname, int arg, String email, String gender) {
        this.name = name;
        this.surname = surname;
        this.arg = arg;
        this.email = email;
        this.gender = gender;
    }

    //տալիս ենք սեթ և գեթ մեթոդները
    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getArg() {
        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //եվ ուզում ենք toString մեթոդը
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", arg=" + arg +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}