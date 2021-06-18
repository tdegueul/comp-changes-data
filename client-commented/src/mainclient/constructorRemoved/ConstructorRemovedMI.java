package mainclient.constructorRemoved;
public class ConstructorRemovedMI {
    public void constructorRemovedClientClass() {
        main.constructorRemoved.ConstructorRemovedClass c = new main.constructorRemoved.ConstructorRemovedClass();
    }

    public void constructorRemovedClientNoParams() {
        main.constructorRemoved.ConstructorRemovedNoParams c = new main.constructorRemoved.ConstructorRemovedNoParams();
    }

    public void constructorRemovedClientParams() {
        main.constructorRemoved.ConstructorRemovedParams c = new main.constructorRemoved.ConstructorRemovedParams(0);
    }

    public void constructorRemovedClientClassAnonymous() {
        main.constructorRemoved.ConstructorRemovedClass c = new main.constructorRemoved.ConstructorRemovedClass() {};
    }

    public void constructorRemovedClientNoParamsAnonymous() {
        main.constructorRemoved.ConstructorRemovedNoParams c = new main.constructorRemoved.ConstructorRemovedNoParams() {};
    }

    public void constructorRemovedClientParamsAnonymous() {
        main.constructorRemoved.ConstructorRemovedParams c = new main.constructorRemoved.ConstructorRemovedParams(0) {};
    }
}