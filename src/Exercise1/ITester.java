package Exercise1;

/**
 * Class: ITester Interface
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This interface is designed to provide a generic testing facility.
 * It defines a single method 'test' that any class implementing this
 * interface must provide an implementation for, allowing for custom
 * object tests.
 **/



public interface ITester <T> {
    boolean test(T obj);
}
