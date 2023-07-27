package Singleton;

//系统运行时提前创建instance，不管用还是不用，占用较多的内存,确定需要某些数据可以提前加载提高效率
//eagerLoad
public class Singleton {
    // private static variable
    private static Singleton instance = new Singleton();
    //private constructor
    //make sure instance can't  be new, otherwise there will be multiple instance
    private Singleton(){}
    //public getMethod to get the instance
    //static make sure if there is not an instance , this method can be called.
    public static Singleton getInstance(){
        return instance;
    }
}
/**
 *Advantages of Eager Loading:
 *
 * Eager Loading can retrieve all related data in a single query, avoiding the overhead of multiple database queries, thereby improving performance.
 * In Eager Loading, when the data is accessed, it is already present in memory, resulting in faster response times for subsequent accesses.
 * Eager Loading is suitable for scenarios where related data needs to be frequently accessed, reducing the number of database queries and improving system responsiveness.
 * Disadvantages of Eager Loading:
 *
 * Eager Loading may lead to unnecessary data loading, especially when related data is not always used.
 * Eager Loading may result in returning excessive data, increasing network transfer and memory usage, which can be wasteful for large datasets.
*
*
* */