package mainclient.fieldRemovedInSuperclass;
public class SFieldRemovedInSuperclassExt extends main.fieldRemovedInSuperclass.SFieldRemovedInSuperclass {
    public int accessSuperKey() {
        return super.removedField;
    }

    public int accessNoSuperKey() {
        return removedField;
    }
}