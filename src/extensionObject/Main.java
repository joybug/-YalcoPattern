package extensionObject;

public class Main {

    public static void main(String[] args) {
        Original original = new Original();
        Extension extension = new ExtensionImpl(original);
        extension.doSomething();
        ((ExtensionImpl)extension).doSomethingElse();
    }

}
