package extensionObject;

public class Original implements Extension {
    @Override
    public void doSomething() {
        // Original의 동작을 수행합니다.
    	System.out.println("'Original'의 동작을 수행합니다.");
    }
}

