package one.dio.gof;

/**
 * TESTES RELACIONADOS AO SINGLETON
 * LAZY
 * EAGER
 * LAZY HOLDER
 */
public class Teste {
    public static void main(String[] args){
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("Instacia do lazy "+lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println("Instacia do lazy "+lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println("Instacia do eager " + eager);
        eager = SingletonEager.getInstance();
        System.out.println("Instancia do Eager "+ eager);

        SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Instancia do Eager "+ LazyHolder);
        LazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Instancia do Eager "+ LazyHolder);

    }
}
