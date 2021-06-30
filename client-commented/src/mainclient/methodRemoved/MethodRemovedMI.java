package mainclient.methodRemoved;
public class MethodRemovedMI {
    public int methodRemovedClient() {
        main.methodRemoved.MethodRemoved m = new main.methodRemoved.MethodRemoved();
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        m.methodRemoved();
    }

    public int methodRemovedStatic() {
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        main.methodRemoved.MethodRemoved.methodRemovedStatic();
    }
}