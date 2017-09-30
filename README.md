# HW2_SE

## 1. OO Design Patterns  
Design patterns are tested and proven development paradigms which help to speed up the development process.  


### Category I : Creational Design Patterns:  
They are basically about class instantiation which includes class-creational patterns(inheritance) and object-creational(delegation) patterns.   

#### (a) Factory Method  

  * **Definition:**  
    * An interface for creating an object, but subclasses will decide which class to instantiate. 
    * A “virtual” constructor.  
    * The ‘new’ operator is considered as harmful.  
    
  * **Description:**  
    * A superclass specifies all the standard and generic behavior, and then delegates the creation details to subclasses that are supplied by the client.
    * Factory Method only requires a new operation as compared to, other design patterns require new classes.  
    * Factory Method is similar to Abstract Factory, but without emphasis on families.  
    * Factory Methods are specified by an architectural framework and then they are implemented by the user of the framework.  
    * Factory Methods are basically static method of a class that return an object of that class type.   
    * But unlike constructor,  
      * The actual object they return might be object of subclass or,  
      * An existing object might be reused, instead of creating a new object.  
      * The client is totally decoupled from the implementation details of the derived classes. So, polymorphic creation is now possible.  
      
      --------------------
      
#### (b) Singleton Method  

  * **Definition:**  
    * A class of which only one instance can exist and provides a global point of access to it.  
    * Encapsulated just-in-time initialization.
    
  * **Description:**  
    * The class of the single instance object is responsible for creation, initialization, access and enforcement.  
    * Instance is declared as private static data member.  
    * A public static member function is provided which encapsulates all initialization code and provides access to the instance.  
    * The client calls the accessor function only, whenever a reference to the single instance is required.  
-------------------


    

 
