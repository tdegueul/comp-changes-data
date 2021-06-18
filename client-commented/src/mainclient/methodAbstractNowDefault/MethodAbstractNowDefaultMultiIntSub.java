package mainclient.methodAbstractNowDefault;
public class MethodAbstractNowDefaultMultiIntSub implements main.methodAbstractNowDefault.IMethodAbstractNowDefaultSub , main.methodAbstractNowDefault.IMethodAbstractNowDefaultOther {
    @java.lang.Override
    public int methodAbstractNowDef() {
        return 0;
    }

    public int callMethod() {
        return methodAbstractNowDef();
    }
}