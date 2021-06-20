package mainclient.constructorRemoved;
public class ConstructorRemovedMI {
    public void constructorRemovedClientNoParams() {
        main.constructorRemoved.ConstructorRemovedNoParams c = new main.constructorRemoved.ConstructorRemovedNoParams();
    }

    public void constructorRemovedClientParams() {
        main.constructorRemoved.ConstructorRemovedParams c = new main.constructorRemoved.ConstructorRemovedParams(0);
    }

    public void constructorRemovedClientNoParamsAnonymous() {
        main.constructorRemoved.ConstructorRemovedNoParams c = new main.constructorRemoved.ConstructorRemovedNoParams() {};
    }

    public void constructorRemovedClientParamsAnonymous() {
        main.constructorRemoved.ConstructorRemovedParams c = new main.constructorRemoved.ConstructorRemovedParams(0) {};
    }
}