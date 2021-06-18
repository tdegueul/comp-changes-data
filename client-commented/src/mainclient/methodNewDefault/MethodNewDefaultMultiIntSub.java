package mainclient.methodNewDefault;
public class MethodNewDefaultMultiIntSub implements main.methodNewDefault.IMethodNewDefaultSub , main.methodNewDefault.IMethodNewDefaultOther {
    public int callDefaultMethodOther() {
        return defaultMethod();
    }

    public int callDefaultMethodOtherSuper() {
        return main.methodNewDefault.IMethodNewDefaultOther.super.defaultMethod();
    }
}