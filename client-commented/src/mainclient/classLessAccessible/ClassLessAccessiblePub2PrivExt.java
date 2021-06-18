package mainclient.classLessAccessible;
public class ClassLessAccessiblePub2PrivExt extends main.classLessAccessible.ClassLessAccessiblePub2Priv {
    public void instantiatePub2Priv() {
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.ClassLessAccessiblePub2Priv.ClassLessAccessiblePub2PrivInner c1 = // [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION]
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        new main.classLessAccessible.ClassLessAccessiblePub2Priv.ClassLessAccessiblePub2PrivInner();
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.ClassLessAccessiblePub2Priv.ClassLessAccessiblePub2PrivInner c2 = new mainclient.classLessAccessible.ClassLessAccessiblePub2PrivExt.ClassLessAccessiblePub2PrivExtInner();
    }

    // [CLASS_LESS_ACCESSIBLE:EXTENDS]
    public class ClassLessAccessiblePub2PrivExtInner extends main.classLessAccessible.ClassLessAccessiblePub2Priv.ClassLessAccessiblePub2PrivInner {
        public int accessPublicField() {
            return // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
            // [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS]
            // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
            super.publicField;
        }

        public int invokePublicMethod() {
            return // [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION]
            // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
            super.publicMethod();
        }
    }
}