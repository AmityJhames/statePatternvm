package statePatternVM;

public class DispensingState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Can't select an item,while dispensing.");
    }

    @Override
    public void insertCoin(Double coin, VendingMachine vm) {
        System.out.println("Can't insert coins while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        if(vm.getInventory()>0) {
            vm.decreaseInventory();
            System.out.println("Item dispensed.");
        }else{
            System.out.println("Out of Stock!");
        }
        vm.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Vending Machine is now Out of Order.");
        vm.setState(new OutOfOrderState());
    }
}
