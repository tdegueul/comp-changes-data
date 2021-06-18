package mainclient.fieldTypeChanged;
public class FieldTypeChangedExt extends main.fieldTypeChanged.FieldTypeChanged {
    public void fieldTypeChangedClientSuperKeyAccess() {
        int i = super.fieldNumeric;
        java.util.List l = super.fieldList;
    }

    public void fieldTypeChangedClientNoSuperKeyAccess() {
        int i = fieldNumeric;
        java.util.List l = fieldList;
    }
}