package state.VendingMachineState;


public interface State {
    void insertMoney(VendingMachine vendingMachine, int amount);
    void selectDrink(VendingMachine vendingMachine, String drink);
}

