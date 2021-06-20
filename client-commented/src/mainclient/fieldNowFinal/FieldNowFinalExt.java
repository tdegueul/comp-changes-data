package mainclient.fieldNowFinal;
public class FieldNowFinalExt extends main.fieldNowFinal.FieldNowFinal {
    public int fieldNowFinalAssignmentSuperKey() {
        /* [FIELD_NOW_FINAL:FIELD_ACCESS] */
        super.fieldFinal = 3;
        return super.fieldFinal;
    }

    public int fieldNowFinalNoAssignmentSuperKey() {
        return super.fieldFinal;
    }

    public int fieldNowFinalAssignmentNoSuperKey() {
        /* [FIELD_NOW_FINAL:FIELD_ACCESS] */
        fieldFinal = 3;
        return fieldFinal;
    }

    public int fieldNowFinalNoAssignmentNoSuperKey() {
        return fieldFinal;
    }
}