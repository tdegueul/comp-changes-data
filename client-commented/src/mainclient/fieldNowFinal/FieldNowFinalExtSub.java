package mainclient.fieldNowFinal;
public class FieldNowFinalExtSub extends main.fieldNowFinal.FieldNowFinalSub {
    public int fieldNowFinalAssignmentSuperKey() {
        super.fieldFinal = 3;
        return super.fieldFinal;
    }

    public int fieldNowFinalNoAssignmentSuperKey() {
        return super.fieldFinal;
    }

    public int fieldNowFinalAssignmentNoSuperKey() {
        fieldFinal = 3;
        return fieldFinal;
    }

    public int fieldNowFinalNoAssignmentNoSuperKey() {
        return fieldFinal;
    }
}