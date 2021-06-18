package mainclient.methodRemovedInSuperclass;
public class MethodRemovedInSuperclassExt extends main.methodRemovedInSuperclass.MethodRemovedInSuperclass {
    @java.lang.Override
    public int methodRemovedSAbs() {
        return 0;
    }

    @java.lang.Override
    public int methodRemovedSSAbs() {
        return 0;
    }

    public int callSuperSMethod() {
        return methodRemovedS();
    }

    public int callSuperSSMethod() {
        return methodRemovedSS();
    }
}