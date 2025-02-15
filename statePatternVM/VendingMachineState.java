package statePatternVM;

public interface VendingMachineState {
    public void selectItem(VendingMachine vm);
    public void insertCoin(Double coin,VendingMachine vm);
    public void dispenseItem(VendingMachine vm);
    public void setOutOfOrder(VendingMachine vm);


}
