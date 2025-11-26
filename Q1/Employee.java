public class Employee extends Person{
    private String employeeId;
    private String position;
    //in salary paye afrad hast ke bayad dar ijad kardan objct moshakhas she
    //be azay oon 160 saat paye daryaft mishe
    private double salary;
    private int housrsWorked;

    public Employee(String name,String phoneNumber
            ,String employeeId, String position
            ,double salary, int housrsWorked) {
        super(name, phoneNumber);
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
        this.housrsWorked = housrsWorked;
    }
    //method haye getter va setter monaseb ro tarif mikonim
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getHousrsWorked(){
        return housrsWorked;
    }
    public void setHousrsWorked(int houresworked){
        this.housrsWorked = housrsWorked;
    }

    //methid haye khaste shode
    public void addHoursWorked(int plushour){
        housrsWorked += plushour;
    }

    public double calculateSalary(){
        double hoghogh;
        hoghogh = salary;
        if(housrsWorked>160.0){
            double ezafekare = housrsWorked-160.0;
            hoghogh += (ezafekare/160.0)*(salary*1.5);
        }
        return hoghogh;
    }


    @Override
    public String getInfo(){
        String Info;
        Info = "ID: "+employeeId+", Name: "+this.getName()
                +", Phone: "+this.getPhoneNumber()
                +", Position: "+position
                +", HoursWorked: "+String.valueOf(housrsWorked);
        return Info;
    }
}
