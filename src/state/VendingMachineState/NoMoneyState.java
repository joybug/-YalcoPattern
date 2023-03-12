package state.VendingMachineState;

public class NoMoneyState implements State {

	 @Override
	    public void insertMoney(VendingMachine vendingMachine, int amount) {
	        System.out.println(amount + "원 투입되었습니다.");
	        vendingMachine.setState(new HasMoneyState());
	    }

	    @Override
	    public void selectDrink(VendingMachine vendingMachine, String drink) {
	        System.out.println("동전을 먼저 투입하세요");
	    }

}
