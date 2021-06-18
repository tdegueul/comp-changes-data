package mainclient.classLessAccessible;
// [CLASS_LESS_ACCESSIBLE:EXTENDS]
public class ClassLessAccessiblePub2PackPrivExt extends main.classLessAccessible.ClassLessAccessiblePub2PackPriv {
    public void instantiatePub2PackPriv() {
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.ClassLessAccessiblePub2PackPriv c1 = // [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION]
        new main.classLessAccessible.ClassLessAccessiblePub2PackPriv();
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.ClassLessAccessiblePub2PackPriv c2 = new mainclient.classLessAccessible.ClassLessAccessiblePub2PackPrivExt();
    }

    public int accessPublicField() {
        return // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        // [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS]
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        super.publicField;
    }

    public int invokePublicMethod() {
        return // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        // [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION]
        super.publicMethod();
    }
}