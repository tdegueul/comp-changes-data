package mainclient.classLessAccessible;
// [CLASS_LESS_ACCESSIBLE:IMPLEMENTS]
public class ClassLessAccessiblePub2PackPrivImp implements main.classLessAccessible.IClassLessAccessiblePub2PackPriv {
    public int accessPublicField() {
        return // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        // [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS]
        main.classLessAccessible.IClassLessAccessiblePub2PackPriv.publicField;
    }

    public int accessPublicFieldStatic() {
        return main.classLessAccessible.IClassLessAccessiblePub2PackPriv.publicField;
    }

    public int invokePublicMethod() {
        return // [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION]
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.IClassLessAccessiblePub2PackPriv.publicMethod();
    }
}