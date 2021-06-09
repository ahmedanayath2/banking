public class CreditCard extends DebitCard{


    @Override
    public void swipe() {
        System.out.println("You can purchase with credit!");
    }
}
