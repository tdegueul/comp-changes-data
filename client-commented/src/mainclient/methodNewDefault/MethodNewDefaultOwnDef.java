package mainclient.methodNewDefault;
public class MethodNewDefaultOwnDef implements main.methodNewDefault.IMethodNewDefault {
    public int defaultMethod() {
        return 11;
    }

    public int callOwnDefaultMethod() {
        return defaultMethod();
    }
}