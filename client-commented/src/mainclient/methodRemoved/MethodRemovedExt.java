package mainclient.methodRemoved;
public class MethodRemovedExt extends main.methodRemoved.MethodRemoved {
    public int methodRemovedClientExt() {
        return methodRemoved();
    }

    public int methodRemovedClientSuper() {
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        super.methodRemoved();
    }

    /* [METHOD_REMOVED:METHOD_OVERRIDE] */
    @java.lang.Override
    public int methodRemoved() {
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        super.methodRemoved();
    }

    @java.lang.Override
    public int methodStay() {
        return super.methodStay();
    }
}