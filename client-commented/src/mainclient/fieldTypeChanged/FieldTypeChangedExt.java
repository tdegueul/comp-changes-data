package mainclient.fieldTypeChanged;
public class FieldTypeChangedExt extends main.fieldTypeChanged.FieldTypeChanged {
    public void accessAndAssign() {
        int a1 = unchangedPrimitive;
        int a2 = this.unchangedPrimitive;
        int a3 = super.unchangedPrimitive;
        main.fieldTypeChanged.A b1 = unchangedReference;
        main.fieldTypeChanged.A b2 = this.unchangedReference;
        main.fieldTypeChanged.A b3 = super.unchangedReference;
        int c1 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        changedPrimitive;
        int c2 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        this.changedPrimitive;
        int c3 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        super.changedPrimitive;
        main.fieldTypeChanged.A d1 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        changedReference;
        main.fieldTypeChanged.A d2 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        this.changedReference;
        main.fieldTypeChanged.A d3 = /* [FIELD_TYPE_CHANGED:FIELD_ACCESS] */
        super.changedReference;
    }
}