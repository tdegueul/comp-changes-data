package mainclient.superclassAdded;
public class SuperclassAddedExt extends main.superclassAdded.SuperclassAdded {
    public void intConsInter() {
        int ii = main.interfaceAdded.IInterfaceAdded.CTE;
    }

    public void listConsInter() {
        java.util.List<java.lang.String> li = main.interfaceAdded.IInterfaceAdded.LIST;
    }

    public void staticM() {
        // int ia = InterfaceRemoved.staticMeth(); Cannot happen
        int ii = main.interfaceAdded.IInterfaceAdded.staticMeth();
        // int in = staticMethos(); Cannot happen
    }
}