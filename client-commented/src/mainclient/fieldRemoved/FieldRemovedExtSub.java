package mainclient.fieldRemoved;
public class FieldRemovedExtSub extends main.fieldRemoved.FieldRemovedSub {
    public int fieldRemovedClientExt() {
        return fieldRemoved;
    }

    public int fieldRemovedClientSuper() {
        return super.fieldRemoved;
    }
}