package mainclient.classLessAccessible;
public class ClassLessAccessiblePub2PackPrivImp implements main.classLessAccessible.IClassLessAccessiblePub2PackPriv {
    public int accessPublicField() {
        return /* [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS] */
        main.classLessAccessible.IClassLessAccessiblePub2PackPriv.publicField;
    }

    public int accessPublicFieldStatic() {
        return /* [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS] */
        main.classLessAccessible.IClassLessAccessiblePub2PackPriv.publicField;
    }

    public int invokePublicMethod() {
        return /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
        main.classLessAccessible.IClassLessAccessiblePub2PackPriv.publicMethod();
    }
}