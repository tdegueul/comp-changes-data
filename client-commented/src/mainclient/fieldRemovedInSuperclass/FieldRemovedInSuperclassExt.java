package mainclient.fieldRemovedInSuperclass;
public class FieldRemovedInSuperclassExt extends main.fieldRemovedInSuperclass.FieldRemovedInSuperclass {
    public int accessSuperKey() {
        return super.removedField;
    }

    public int accessNoSuperKey() {
        return removedField;
    }
}