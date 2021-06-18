package mainclient.methodRemovedInSuperclass;
public class MethodRemovedInSuperclassFA {
    public int accessSuperS() {
        main.methodRemovedInSuperclass.SMethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return s.methodRemovedSS();
    }

    public int accessSuperSAbs() {
        main.methodRemovedInSuperclass.SMethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return s.methodRemovedSSAbs();
    }

    public int accessSuper() {
        main.methodRemovedInSuperclass.MethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return s.methodRemovedS();
    }

    public int accessSuperAbs() {
        main.methodRemovedInSuperclass.MethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return s.methodRemovedSAbs();
    }
}