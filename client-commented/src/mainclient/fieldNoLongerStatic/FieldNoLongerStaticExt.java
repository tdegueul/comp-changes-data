package mainclient.fieldNoLongerStatic;
public class FieldNoLongerStaticExt extends main.fieldNoLongerStatic.FieldNoLongerStatic {
    public int fieldNoLongerStaticClientNoSuperKey() {
        return main.fieldNoLongerStatic.FieldNoLongerStatic.fieldStatic;
    }

    public int fieldNoLongerStaticClientSuperKey() {
        return super.fieldStatic;
    }

    public int fieldNoLongerStaticClientStatic() {
        return /* [FIELD_NO_LONGER_STATIC:FIELD_ACCESS] */
        main.fieldNoLongerStatic.FieldNoLongerStatic.fieldStatic;
    }

    public int fieldNoLongerStaticClientSuperNoSuperKey() {
        return main.fieldNoLongerStatic.FieldNoLongerStaticSuper.superFieldStatic;
    }

    public int fieldNoLongerStaticClientSuperSuperKey() {
        return super.superFieldStatic;
    }

    public int fieldNoLongerStaticClientSuperStatic() {
        return /* [FIELD_NO_LONGER_STATIC:FIELD_ACCESS] */
        main.fieldNoLongerStatic.FieldNoLongerStaticSuper.superFieldStatic;
    }
}