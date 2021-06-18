package mainclient.fieldStaticAndOverridesStatic;
public class FieldStaticAndOverridesStaticMultiExt extends main.fieldStaticAndOverridesStatic.FieldStaticAndOverridesStaticMulti {
    public int accessFieldFromSubtypeSuper() {
        return super.fieldStatic;
    }

    public int accessFieldFromSubtypeNoSuper() {
        return main.fieldStaticAndOverridesStatic.FieldStaticAndOverridesStaticMultiSS.fieldStatic;
    }
}