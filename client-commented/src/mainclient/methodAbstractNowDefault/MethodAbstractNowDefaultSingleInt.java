package mainclient.methodAbstractNowDefault;
public class MethodAbstractNowDefaultSingleInt implements main.methodAbstractNowDefault.IMethodAbstractNowDefault {
    @java.lang.Override
    public int methodAbstractNowDef() {
        return 0;
    }

    public int callMethod() {
        return methodAbstractNowDef();
    }
}