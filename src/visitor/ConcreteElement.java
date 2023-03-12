package visitor;

public class ConcreteElement implements Element {
	
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public void doSomething() {
        System.out.println("Element의 동작을 수행합니다.");
    }

}
