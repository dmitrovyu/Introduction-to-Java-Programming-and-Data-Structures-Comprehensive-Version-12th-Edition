
package Exercise_11_02;

/**
 *
 * @author DejanD
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;
    
   
    public Employee(String name,String address, String phone, String email, 
            String office, double salary, MyDate dateHired){
        super(name,address,phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    @Override
    public String toString(){
        return super.toString() + " office: " + this.getOffice();
    }
            
    
}
