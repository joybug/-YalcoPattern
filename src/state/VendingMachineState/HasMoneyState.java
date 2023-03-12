package state.VendingMachineState;

public class HasMoneyState implements State {

    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {
        System.out.println("동전이 이미 투입되었습니다.");
    }

    @Override
    public void selectDrink(VendingMachine vendingMachine, String drink) {
        if (vendingMachine.getDrinksCount() > 0) {
            System.out.println(drink + " 선택됨");
            vendingMachine.dispenseDrink(drink);
            vendingMachine.setState(new NoMoneyState());
        } else {
            System.out.println("품절되었습니다.");
        }
    }

}
