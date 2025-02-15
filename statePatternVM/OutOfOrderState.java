package statePatternVM;

public class OutOfOrderState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Vending Machine is out Of Order.");
    }

    @Override
    public void insertCoin(Double coin, VendingMachine vm) {
        System.out.println("Vending Machine is Out Of Order.");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("Vending Machine is Out Of Order.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Vending Machine is already Out Of Order.");
    }
}
