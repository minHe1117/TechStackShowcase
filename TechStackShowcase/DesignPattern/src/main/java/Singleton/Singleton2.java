package Singleton;
//LazyLoad, 第一次被调用的时候才会创建instance,
/*Steps:
1. static volatile variable (optional)
2. make constructor be private
3. static synchronized getInstance method
4. make sure thread safe*/
public class Singleton2 {
    //static volatile variable,make thread safe
    private static volatile Singleton2 instance;

    //private constructor
    private Singleton2(){};
    //static: make sure this method can be called if there is not an instance
    public static Singleton2 getInstance(){
        //check the if the instance is null
        //synchronized make sure thread safe
        if(instance == null){
            //t1(first --.unlock) t2( wait)
            synchronized(Singleton.class){
               //t1 is first here and then t2
                //多个线程同时到达这里，只有第一个能创建instance,
                if(instance == null){
                    //t1 is here..t2--tn will never be here
                    return new Singleton2();
                }
            }
        }
        return instance;
    }
}
/**
 * Advantages of Lazy Loading:
 *
 * Lazy Loading can reduce initial loading time since related data is only loaded when needed, avoiding the overhead of loading a large amount of data all at once.
 * For scenarios where related data is not always accessed, Lazy Loading can save resources by loading data only when necessary, avoiding unnecessary database queries.
 * Lazy Loading is suitable for objects with complex relationships, as it avoids loading a large number of deeply related objects all at once.
 * Disadvantages of Lazy Loading:
 *
 * Lazy Loading may lead to the N+1 query problem, where loading a main object triggers additional database queries each time related objects are accessed, potentially causing performance issues.
 * Lazy Loading may increase the response time to fetch lazily loaded data since the database query is executed only when the related data is accessed for the first time.
 * Lazy Loading can increase memory pressure when dealing with a large number of related objects, as each access to a related object requires loading data from the database.
 * In conclusion, Eager Loading is suitable for scenarios where related data needs to be frequently accessed and the data volume is relatively small, improving performance.
 * On the other hand, Lazy Loading is suitable for scenarios with complex relationships and where related data is not always accessed, saving resources. When using these loading strategies,
 * developers should choose based on the actual requirements and performance considerations of the application.
 * */