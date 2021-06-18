package mainclient.methodNewDefault;
public class MethodNewDefaultMultiIntOwnDef implements main.methodNewDefault.IMethodNewDefault , main.methodNewDefault.IMethodNewDefaultOther {
    public int defaultMethod() {
        return 11;
    }

    public int callOwnDefaultMethod() {
        return defaultMethod();
    }
}