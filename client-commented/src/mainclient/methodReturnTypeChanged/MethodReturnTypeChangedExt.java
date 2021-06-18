package mainclient.methodReturnTypeChanged;
public class MethodReturnTypeChangedExt extends main.methodReturnTypeChanged.MethodReturnTypeChanged {
    public long numericClientSuperKey() {
        return super.methodReturnTypeChangedNumeric();
    }

    public java.util.ArrayList listClientSuperKey() {
        return super.methodReturnTypeChangedList();
    }

    public long numericClientNoSuperKey() {
        return methodReturnTypeChangedNumeric();
    }

    public java.util.ArrayList listClientNoSuperKey() {
        return methodReturnTypeChangedList();
    }
}