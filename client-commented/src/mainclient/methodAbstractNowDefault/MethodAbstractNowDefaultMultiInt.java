package mainclient.methodAbstractNowDefault;
public class MethodAbstractNowDefaultMultiInt implements main.methodAbstractNowDefault.IMethodAbstractNowDefault , main.methodAbstractNowDefault.IMethodAbstractNowDefaultOther {
    @java.lang.Override
    public int methodAbstractNowDef() {
        return 0;
    }

    public int callMethod() {
        return methodAbstractNowDef();
    }
}