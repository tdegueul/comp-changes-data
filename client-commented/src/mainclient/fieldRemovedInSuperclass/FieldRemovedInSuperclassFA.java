package mainclient.fieldRemovedInSuperclass;
public class FieldRemovedInSuperclassFA {
    public int accessSuper() {
        main.fieldRemovedInSuperclass.SFieldRemovedInSuperclass s = new main.fieldRemovedInSuperclass.SFieldRemovedInSuperclass();
        return s.removedField;
    }

    public int accessSub() {
        main.fieldRemovedInSuperclass.FieldRemovedInSuperclass s = new main.fieldRemovedInSuperclass.FieldRemovedInSuperclass();
        return s.removedField;
    }
}