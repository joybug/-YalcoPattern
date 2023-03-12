package state.VendingMachineState;


//자판기가 "대기", "선택", "배출", "품절" 등의 상태를 가질 수 있다고 가정

public class Main {

	public static void main(String[] args) {
		
        VendingMachine vendingMachine = new VendingMachine(10);//드링크 10개
        vendingMachine.selectDrink("Coke");
        vendingMachine.insertMoney(10);
        vendingMachine.selectDrink("Pepsi");
        vendingMachine.selectDrink("Coke");
        vendingMachine.insertMoney(5);
        vendingMachine.selectDrink("Coke");

	}

}
