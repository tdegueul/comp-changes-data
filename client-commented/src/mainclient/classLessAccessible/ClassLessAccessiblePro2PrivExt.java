package mainclient.classLessAccessible;
public class ClassLessAccessiblePro2PrivExt extends main.classLessAccessible.ClassLessAccessiblePro2Priv {
    public void instantiatePro2Priv() {
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.ClassLessAccessiblePro2Priv.ClassLessAccessiblePro2PrivInner c = new mainclient.classLessAccessible.ClassLessAccessiblePro2PrivExt.ClassLessAccessiblePro2PrivExtInner();
    }

    // [CLASS_LESS_ACCESSIBLE:EXTENDS]
    public class ClassLessAccessiblePro2PrivExtInner extends main.classLessAccessible.ClassLessAccessiblePro2Priv.ClassLessAccessiblePro2PrivInner {
        public int accessPublicField() {
            return // [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS]
            // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
            // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
            super.publicField;
        }

        public int invokePublicMethod() {
            return // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
            // [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION]
            super.publicMethod();
        }
    }
}