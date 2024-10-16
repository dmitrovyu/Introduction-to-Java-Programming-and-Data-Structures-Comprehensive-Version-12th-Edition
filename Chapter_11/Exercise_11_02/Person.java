
package Exercise_11_02;

/**
 *
 * @author DejanD
 */
public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
    
    public Person(){
        
    }
    public Person(String name,String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " : Name: " + this.getName();
    }
    
            
}
