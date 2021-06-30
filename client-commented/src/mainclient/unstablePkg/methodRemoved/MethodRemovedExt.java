package mainclient.unstablePkg.methodRemoved;
public class MethodRemovedExt extends main.unstablePkg.methodRemoved.MethodRemoved {
    public int methodRemovedClientExt() {
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        methodRemoved();
    }

    public int methodRemovedClientSuper() {
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        super.methodRemoved();
    }
}