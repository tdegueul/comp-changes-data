package mainclient.classLessAccessible;
public class ClassLessAccessiblePro2PackPrivExt extends main.classLessAccessible.ClassLessAccessiblePro2PackPriv {
    public void instantiatePro2PackPriv() {
        main.classLessAccessible.ClassLessAccessiblePro2PackPriv.ClassLessAccessiblePro2PackPrivInner c = new mainclient.classLessAccessible.ClassLessAccessiblePro2PackPrivExt.ClassLessAccessiblePro2PackPrivExtInner();
    }

    public class ClassLessAccessiblePro2PackPrivExtInner extends main.classLessAccessible.ClassLessAccessiblePro2PackPriv.ClassLessAccessiblePro2PackPrivInner {
        public int accessPublicField() {
            return /* [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS] */
            super.publicField;
        }

        public int invokePublicMethod() {
            return /* [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION] */
            super.publicMethod();
        }
    }
}