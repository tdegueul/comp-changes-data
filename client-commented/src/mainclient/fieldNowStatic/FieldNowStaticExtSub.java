package mainclient.fieldNowStatic;
public class FieldNowStaticExtSub extends main.fieldNowStatic.FieldNowStaticSub {
    public java.lang.String fieldNowStaticClientSuperKeyAccess() {
        return super.MODIFIED_FIELD;
    }

    public java.lang.String fieldNowStaticClientNoSuperKeyAccess() {
        return MODIFIED_FIELD;
    }
}