public class CustomerInfo {

    private String name;
    private int age;
    public int ageMethod(){
        return age;
    }
    private String address;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public int getAge(){
        return age;
    }



    public void setAddress(String newAddress){
        address = newAddress;
    }
    public String getAddress(){
        return address;
    }

}
