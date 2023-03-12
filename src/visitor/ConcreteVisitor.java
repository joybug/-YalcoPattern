package visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(ConcreteElement element) {
        // ConcreteElement의 동작을 수행합니다.
        element.doSomething();
		
	}



}
