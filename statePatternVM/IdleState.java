package statePatternVM;

public class IdleState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Item selected");
        vm.setState(new ItemSelctedState());
    }

    @Override
    public void insertCoin(Double coin, VendingMachine vm) {
        System.out.println("Can't insert coin before selecting an item.");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("No Item selected to dispense.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Vending machine is now Out Of Order.");
        vm.setState(new OutOfOrderState());

    }
}
