public abstract class Person {
    //field ha bayad private bashad
    private String name;
    private String phoneNumber;

    //meghdar dehi avalie va ijad objct
    public Person(String name,String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //tabe haye getter monaseb tarif mikonim
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //tabe haye monaseb baraye taghir maghadir
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //tabe getinfo ke bayad dar class haye farzand meghdar dehi shavad
    public abstract String getInfo();
}
