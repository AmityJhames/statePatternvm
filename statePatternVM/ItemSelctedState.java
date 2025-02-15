package statePatternVM;

public class ItemSelctedState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Item already selcted.");
    }

    @Override
    public void insertCoin(Double coin, VendingMachine vm) {
        vm.addbalance(coin);
        System.out.println("Coin inserted: $" + coin);
        vm.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("Insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Vending Machine is now out of Order.");
        vm.setState(new OutOfOrderState());
    }
}
