
package Exercise_11_02;

/**
 *
 * @author DejanD
 */
public class Staff extends Employee {
    private String title;
    public Staff(String name,String address, String phone, String email, 
            String office, double salary, MyDate dateHired,String title){
        super(name,address,phone, email, office,salary,dateHired);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    @Override 
    public String toString() {
        return super.toString() +  " title: " +this.getTitle();
    }
}
