package Lecture.CollectionAndGenerics;
/*
1. Provide a way to use primitive data types (int, char, boolean, etc.) as objects.
2. Automatic conversion between the primitive types and their corresponding
wrapper classes.
3. Once created, the value of a wrapper object cannot be changed.
4. Utility Methods: Each wrapper class provides useful methods, like comparison
valueOf, and parseXxx (e.g., parselnt for Integer).
5. Required for storing primitives in collection objects like ArrayList, HashMap
6. Allows assignment of null to primitive values when needed.

1. Autoboxing: Automatic conversion of primitive types to their
corresponding wrapper class objects.
2. Unboxing: Automatic conversion of wrapper class objects back t
their respective primitive types.
*/
public class WrapperClasses {
    //making object of integer
    //this called autoboxing
    Integer first = 55;
    //auto unboxing
    int second = first;
    
}
