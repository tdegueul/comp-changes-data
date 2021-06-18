package mainclient.methodNewDefault;
public class MethodNewDefaultMultiInt implements main.methodNewDefault.IMethodNewDefault , main.methodNewDefault.IMethodNewDefaultOther {
    public int callDefaultMethodOther() {
        return defaultMethod();
    }

    public int callDefaultMethodOtherSuper() {
        return main.methodNewDefault.IMethodNewDefaultOther.super.defaultMethod();
    }
}