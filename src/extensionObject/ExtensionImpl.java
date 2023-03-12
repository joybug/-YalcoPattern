package extensionObject;

public class ExtensionImpl implements Extension {
    private Original original;
    
    public ExtensionImpl(Original original) {
        this.original = original;
    }
    
    @Override
    public void doSomething() {
        original.doSomething();
        // Extension의 동작을 수행합니다.
        System.out.println("'Extension'의 동작을 수행합니다.");
    }
    
    public void doSomethingElse() {
        // Extension의 다른 동작을 수행합니다.
    	 System.out.println("'Extension'의 <<다른>> 동작을 수행합니다.");
    }
}

