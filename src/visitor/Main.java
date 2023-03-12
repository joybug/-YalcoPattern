package visitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConcreteElement element = new ConcreteElement();
        Visitor visitor = new ConcreteVisitor();
        element.accept(visitor);
	}

}
