package mainclient.fieldTypeChanged;
public class FieldTypeChangedExtSub extends main.fieldTypeChanged.FieldTypeChangedSub {
    public void fieldTypeChangedClientSuperKeyAccess() {
        int i = super.fieldNumeric;
        java.util.List l = super.fieldList;
    }

    public void fieldTypeChangedClientNoSuperKeyAccess() {
        int i = fieldNumeric;
        java.util.List l = fieldList;
    }
}