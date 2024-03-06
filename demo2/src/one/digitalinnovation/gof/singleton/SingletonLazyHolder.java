package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @see <a hr
 *
 * @author Cristphe
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
