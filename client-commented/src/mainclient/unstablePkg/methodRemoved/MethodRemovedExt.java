package mainclient.unstablePkg.methodRemoved;
public class MethodRemovedExt extends main.unstablePkg.methodRemoved.MethodRemoved {
    public int methodRemovedClientExt() {
        return methodRemoved();
    }

    public int methodRemovedClientSuper() {
        return super.methodRemoved();
    }
}