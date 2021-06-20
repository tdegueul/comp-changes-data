package mainclient.methodNowAbstract;
/* [METHOD_NOW_ABSTRACT:EXTENDS] */
public class MethodNowAbstractExt extends main.methodNowAbstract.MethodNowAbstract {
    @java.lang.Override
    public int methodStayAbstract() {
        return 0;
    }

    public int methodNowAbstractClientSuperKey() {
        return /* [METHOD_NOW_ABSTRACT:METHOD_INVOCATION] */
        super.methodNowAbstract();
    }

    public int methodNowAbstractClientNoSuperKey() {
        return /* [METHOD_NOW_ABSTRACT:METHOD_INVOCATION] */
        methodNowAbstract();
    }
}