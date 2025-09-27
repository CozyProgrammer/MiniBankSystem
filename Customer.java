public class Customer {
    private String customerName;
    private String address;
    private String email;

    public Customer(String customerName,String address,String email){
        this.customerName=customerName;
        this.address=address;
        this.email=email;
 
    }

    public String getName(){
        return customerName;
    }

    public String getECmail(){
        return  email;
    }

    public String getAddress(){
        return address;
    }

}
