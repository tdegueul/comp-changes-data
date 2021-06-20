package mainclient.classLessAccessible;
public class ClassLessAccessiblePub2PackPrivExt extends main.classLessAccessible.ClassLessAccessiblePub2PackPriv {
    public void instantiatePub2PackPriv() {
        main.classLessAccessible.ClassLessAccessiblePub2PackPriv c1 = /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
        new main.classLessAccessible.ClassLessAccessiblePub2PackPriv();
        main.classLessAccessible.ClassLessAccessiblePub2PackPriv c2 = new mainclient.classLessAccessible.ClassLessAccessiblePub2PackPrivExt();
    }

    public int accessPublicField() {
        return /* [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS] */
        super.publicField;
    }

    public int invokePublicMethod() {
        return /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
        super.publicMethod();
    }
}