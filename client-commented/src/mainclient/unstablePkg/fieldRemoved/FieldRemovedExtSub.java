package mainclient.unstablePkg.fieldRemoved;
public class FieldRemovedExtSub extends main.unstablePkg.fieldRemoved.FieldRemovedSub {
    public int fieldRemovedClientExt() {
        return fieldRemoved;
    }

    public int fieldRemovedClientSuper() {
        return super.fieldRemoved;
    }
}