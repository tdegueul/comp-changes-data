package mainclient.methodRemovedInSuperclass;
public class MethodRemovedInSuperclassExt extends main.methodRemovedInSuperclass.MethodRemovedInSuperclass {
    /* [METHOD_REMOVED:METHOD_OVERRIDE] */
    @java.lang.Override
    public int methodRemovedSAbs() {
        return 0;
    }

    /* [METHOD_REMOVED:METHOD_OVERRIDE] */
    @java.lang.Override
    public int methodRemovedSSAbs() {
        return 0;
    }

    public int callSuperSMethod() {
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        methodRemovedS();
    }

    public int callSuperSSMethod() {
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        methodRemovedSS();
    }
}