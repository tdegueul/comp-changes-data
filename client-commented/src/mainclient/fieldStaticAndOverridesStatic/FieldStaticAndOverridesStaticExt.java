package mainclient.fieldStaticAndOverridesStatic;
public class FieldStaticAndOverridesStaticExt extends main.fieldStaticAndOverridesStatic.FieldStaticAndOverridesStatic {
    public int accessFieldFromSubtypeSuper() {
        return super.fieldStatic;
    }

    public int accessFieldFromSubtypeNoSuper() {
        return main.fieldStaticAndOverridesStatic.FieldStaticAndOverridesStaticS.fieldStatic;
    }
}