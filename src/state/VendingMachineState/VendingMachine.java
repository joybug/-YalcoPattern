package state.VendingMachineState;

public class VendingMachine {
	    private State currentState;
	    private int drinksCount;

	    public VendingMachine(int count) {
	        currentState = new NoMoneyState();
	        drinksCount = count;
	    }

	    public void setState(State state) {
	        currentState = state;
	    }

	    public void addDrinks(int count) {
	        drinksCount += count;
	    }

	    public void insertMoney(int amount) {
	        currentState.insertMoney(this, amount);
	    }

	    public void selectDrink(String drink) {
	        currentState.selectDrink(this, drink);
	    }

	    public void dispenseDrink(String drink) {
	        System.out.println(drink +"가 배출됩니다. 맛있게 드세요.");
	        drinksCount--;
	    }

	    public int getDrinksCount() {
	        return drinksCount;
	    }
}
