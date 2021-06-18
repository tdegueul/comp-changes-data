package mainclient.classLessAccessible;
public class ClassLessAccessiblePub2ProExt extends main.classLessAccessible.ClassLessAccessiblePub2Pro {
    public void instantiatePub2Pro() {
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.ClassLessAccessiblePub2Pro.ClassLessAccessiblePub2ProInner c1 = // [CLASS_LESS_ACCESSIBLE:METHOD_INVOCATION]
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        new main.classLessAccessible.ClassLessAccessiblePub2Pro.ClassLessAccessiblePub2ProInner();
        // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
        main.classLessAccessible.ClassLessAccessiblePub2Pro.ClassLessAccessiblePub2ProInner c2 = new mainclient.classLessAccessible.ClassLessAccessiblePub2ProExt.ClassLessAccessiblePub2ProExtInner();
    }

    // [CLASS_LESS_ACCESSIBLE:EXTENDS]
    public class ClassLessAccessiblePub2ProExtInner extends main.classLessAccessible.ClassLessAccessiblePub2Pro.ClassLessAccessiblePub2ProInner {
        public int accessPublicField() {
            return // [CLASS_LESS_ACCESSIBLE:FIELD_ACCESS]
            // [CLASS_LESS_ACCESSIBLE:TYPE_DEPENDENCY]
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