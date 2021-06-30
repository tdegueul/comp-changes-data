package mainclient.fieldLessAccessible;
public class FieldLessAccessibleFA {
    private main.fieldLessAccessible.FieldLessAccessible f;

    public FieldLessAccessibleFA() {
        f = new main.fieldLessAccessible.FieldLessAccessible();
    }

    public int fieldLessAccessibleClientPub2Pro() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        f.public2protected;
    }

    public int fieldLessAccessibleClientPub2PackPriv() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        f.public2packageprivate;
    }

    public int fieldLessAccessibleClientPub2Priv() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        f.public2private;
    }

    public int fieldLessAccessibleSuperPublic2Private() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        f.superPublic2Private;
    }

    public int fieldLessAccessibleSuperPublic2Protected() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        f.superPublic2Protected;
    }

    public int fieldLessAccessibleSuperPublic2PackagePrivate() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        f.superPublic2PackagePrivate;
    }
}