package mainclient.fieldLessAccessible;
public class FieldLessAccessibleFASubtype extends main.fieldLessAccessible.FieldLessAccessible {
    public int fieldLessAccessibleClientPub2ProNoSuperKey() {
        return public2protected;
    }

    public int fieldLessAccessibleClientPub2PackPrivNoSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        public2packageprivate;
    }

    public int fieldLessAccessibleClientPub2PrivNoSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        public2private;
    }

    public int fieldLessAccessibleClientPro2PackPrivNoSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        protected2packageprivate;
    }

    public int fieldLessAccessibleClientPro2PrivNoSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        protected2private;
    }

    public int fieldLessAccessibleClientPub2ProSuperKey() {
        return super.public2protected;
    }

    public int fieldLessAccessibleClientPub2PackPrivSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        super.public2packageprivate;
    }

    public int fieldLessAccessibleClientPub2PrivSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        super.public2private;
    }

    public int fieldLessAccessibleClientPro2PackPrivSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        super.protected2packageprivate;
    }

    public int fieldLessAccessibleClientPro2PrivSuperKey() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        super.protected2private;
    }

    public int fieldLessAccessibleSuperPublic2Private() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        superPublic2Private;
    }

    public int fieldLessAccessibleSuperPublic2Protected() {
        return superPublic2Protected;
    }

    public int fieldLessAccessibleSuperPublic2PackagePrivate() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        superPublic2PackagePrivate;
    }

    public int fieldLessAccessibleSuperProtected2Private() {
        return /* [FIELD_LESS_ACCESSIBLE:FIELD_ACCESS] */
        superProtected2Private;
    }
}