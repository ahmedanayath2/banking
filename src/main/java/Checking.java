public class Checking extends CreditCard{


    public static void main (String[]args){
            CustomerInfo ci = new CustomerInfo();
            ci.setName("Mohammed");
            ci.setAge(20);
            ci.setAddress("7314 37th ave jackson heights, ny 11372");

            System.out.println("Name: " + ci.getName());
            System.out.println("Address: " + ci.getAddress());
            System.out.println("Age: " + ci.getAge());





       // if(ageMethod() < 24){
        //    System.out.println("You are a student!");
       // }else{
      //      System.out.println("You must keep minimum $100");
      //  }

            CreditCard cc = new CreditCard();
            cc.purchase();
            cc.swipe();




        }
}
