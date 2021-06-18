package mainclient.methodRemovedInSuperclass;
public class SMethodRemovedInSuperclassExt extends main.methodRemovedInSuperclass.SMethodRemovedInSuperclass {
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