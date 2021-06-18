package mainclient.methodRemoved;
public class MethodRemovedExt extends main.methodRemoved.MethodRemoved {
    public int methodRemovedClientExt() {
        return methodRemoved();
    }

    public int methodRemovedClientSuper() {
        return super.methodRemoved();
    }
}