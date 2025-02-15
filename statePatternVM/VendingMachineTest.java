package statePatternVM;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine bubblegum = new VendingMachine(5);

        bubblegum.selectItem();//Item selected
        bubblegum.insertCoin(3.00);//Coin Inserted,Item dispensed
        bubblegum.dispenseItem(); //Item dispensed

        System.out.println();
        bubblegum.setOutOfOrder();//Machine will be Out Of Order
        bubblegum.selectItem(); //can't select
        bubblegum.insertCoin(2.00); // Can't Insert Coin
    }
}
