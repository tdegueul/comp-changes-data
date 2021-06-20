package mainclient.methodNowAbstract;
public class MethodNowAbstractMI {
    public void instantiateNowAbstractAnonymous() {
        main.methodNowAbstract.MethodNowAbstract c = new main.methodNowAbstract.MethodNowAbstract() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

    public void instantiateNowAbstractAnonymousAlreadyImplemented() {
        main.methodNowAbstract.MethodNowAbstract c = new main.methodNowAbstract.MethodNowAbstract() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }

            @java.lang.Override
            public int methodNowAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

    public void instantiateNowAbstractSubAnonymous() {
        main.methodNowAbstract.MethodNowAbstract c = new main.methodNowAbstract.MethodNowAbstractSub() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

    public void instantiateNowAbstractSubAnonymousAlreadyImplemented() {
        main.methodNowAbstract.MethodNowAbstract c = new main.methodNowAbstract.MethodNowAbstractSub() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }

            @java.lang.Override
            public int methodNowAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

    public void instantiateNowAbstractIntfAnonymous() {
        main.methodNowAbstract.IMethodNowAbstract c = new main.methodNowAbstract.IMethodNowAbstract() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

    public void instantiateNowAbstractINtfAnonymousAlreadyImplemented() {
        main.methodNowAbstract.IMethodNowAbstract c = new main.methodNowAbstract.IMethodNowAbstract() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }

            @java.lang.Override
            public int methodNowAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

    public void instantiateNowAbstractIntfSubAnonymous() {
        main.methodNowAbstract.IMethodNowAbstractSub c = new main.methodNowAbstract.IMethodNowAbstractSub() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

    public void instantiateNowAbstractIntfSubAnonymousAlreadyImplemented() {
        main.methodNowAbstract.IMethodNowAbstractSub c = new main.methodNowAbstract.IMethodNowAbstractSub() {
            @java.lang.Override
            public int methodStayAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }

            @java.lang.Override
            public int methodNowAbstract() {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }
}