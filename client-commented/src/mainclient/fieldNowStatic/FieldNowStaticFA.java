package mainclient.fieldNowStatic;
public class FieldNowStaticFA {
    public java.lang.String fieldNowStaticClientSimpleAccess() {
        main.fieldNowStatic.FieldNowStatic f = new main.fieldNowStatic.FieldNowStatic();
        return f.MODIFIED_FIELD;
    }

    public java.lang.String fieldNowStaticClientSimpleAccessSub() {
        main.fieldNowStatic.FieldNowStaticSub f = new main.fieldNowStatic.FieldNowStaticSub();
        return f.MODIFIED_FIELD;
    }
}