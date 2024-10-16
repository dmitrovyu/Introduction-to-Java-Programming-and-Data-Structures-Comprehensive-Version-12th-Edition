
package Exercise_11_02;

/**
 *
 * @author DejanD
 */
public class Faculty extends Employee {
    private String officeHours;
    private String rank;
    
    public Faculty(String name,String address, String phone, String email, 
            String office, double salary, MyDate dateHired,String officeHours, String rank){
        super(name,address,phone, email, office,salary,dateHired);
        this.officeHours=officeHours;
        this.rank = rank;    
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return super.toString() + " rank: " + this.getRank();
    }
}
