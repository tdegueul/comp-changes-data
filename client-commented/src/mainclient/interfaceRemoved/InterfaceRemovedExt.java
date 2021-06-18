package mainclient.interfaceRemoved;
public class InterfaceRemovedExt extends main.interfaceRemoved.InterfaceRemoved {
    public void cast() {
        main.interfaceRemoved.InterfaceRemoved a = new main.interfaceRemoved.InterfaceRemoved();
        main.interfaceRemoved.IInterfaceRemoved i = ((main.interfaceRemoved.IInterfaceRemoved) (a));
    }

    public void intCons() {
        int ia = main.interfaceRemoved.InterfaceRemoved.CTE;
    }

    public void intConsInter() {
        int ii = main.interfaceRemoved.IInterfaceRemoved.CTE;
    }

    public void intConsDirect() {
        int in = main.interfaceRemoved.IInterfaceRemoved.CTE;
    }

    public void listCons() {
        java.util.List<java.lang.String> la = main.interfaceRemoved.InterfaceRemoved.LIST;
    }

    public void listConsInter() {
        java.util.List<java.lang.String> li = main.interfaceRemoved.IInterfaceRemoved.LIST;
    }

    public void listConsDirect() {
        java.util.List<java.lang.String> ln = main.interfaceRemoved.IInterfaceRemoved.LIST;
    }

    public void staticM() {
        // int ia = InterfaceRemoved.staticMeth(); Cannot happen
        int ii = main.interfaceRemoved.IInterfaceRemoved.staticMeth();
        // int in = staticMethos(); Cannot happen
    }

    public void defaultM() {
        // int ia = InterfaceRemoved.defaultMeth(); Cannot happen
        // int ii = IInterfaceRemoved.super.defaultMeth(); Cannot happen
        int in = defaultMeth();
    }
}