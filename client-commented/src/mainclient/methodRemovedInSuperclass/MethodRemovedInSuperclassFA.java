package mainclient.methodRemovedInSuperclass;
public class MethodRemovedInSuperclassFA {
    public int accessSuperS() {
        main.methodRemovedInSuperclass.SMethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        s.methodRemovedSS();
    }

    public int accessSuperSAbs() {
        main.methodRemovedInSuperclass.SMethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        s.methodRemovedSSAbs();
    }

    public int accessSuper() {
        main.methodRemovedInSuperclass.MethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        s.methodRemovedS();
    }

    public int accessSuperAbs() {
        main.methodRemovedInSuperclass.MethodRemovedInSuperclass s = new mainclient.methodRemovedInSuperclass.MethodRemovedInSuperclassExt();
        return /* [METHOD_REMOVED:METHOD_INVOCATION] */
        s.methodRemovedSAbs();
    }
}