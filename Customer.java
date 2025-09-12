public class Customer {
    private String customerName;
    private String address;
    private String email;

    public Customer(String customerName,String address){
        this.customerName=customerName;
        this.address=address;
 
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getName(){
        return customerName;
    }

    public String getemail(){
        return  email;
    }

    public String getAddress(){
        return address;
    }

}
