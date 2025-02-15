package statePatternVM;

public class VendingMachine {
    private Double balance;
    private int inventory;
    private VendingMachineState vmstate;
    public VendingMachine (int inventory){
        this.inventory = inventory;
        this.balance = 0.0;
        vmstate = new IdleState();
    }
    public void selectItem(){
        vmstate.selectItem(this);
    }
    public void insertCoin(Double coin){
        vmstate.insertCoin(coin,this);
    }
    public void dispenseItem(){
        vmstate.dispenseItem(this);
    }
    public void setOutOfOrder(){
        vmstate.setOutOfOrder(this);
    }
    public void addbalance(Double coin){
        this.balance += coin;
    }
    public void decreaseInventory(){
        this.inventory--;
    }
    public int getInventory(){
        return inventory;
    }
    public void setState(VendingMachineState vmState){
        this.vmstate = vmState;
    }


}
