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


### Category II : I.	Structural Design Patterns:  
It includes patterns about the Class Creation and Object composition.  
 * Class-Creation Patterns: Use of inheritance to compose interfaces.  
 * Object – Patterns: To compose objects to perform new functionality.  

#### (a) Facade Method  

  * **Definition:**  
    * It has a single class that represents an entire subsystem of the whole system.  
    * So, it provides unified interface to a set of multiple interfaces in subsystem.   
    * So, this helps to encapsulate a complicated subsystem with a simple higher-level interface that makes the subsystem easier to use.   

    
  * **Description:**  
    * It decouples the subsystem from its potentially many clients.  
    * Therefore, it becomes the only access point for the subsystem, which limits the features and flexibility of the power users that may be needed.  
    * So to get a segment a simplified interface to the overall functionality of a complex subsystem required by the clients, can be given using this façade method.  
    * Thus, factory reduces dependencies of outside code on the working of external libraries.  
    * Moreover, a poorly designed APIs can be wrapped with single well-designed API.  

      
        --------------------
      
#### (b) Composite Design Method  

  * **Definition:**  
    * It is a tree structure of simple and recursive composition of the objects.  
    * It describes a group of objects that is treated the same way as a single instance of the same type of object.  

    
  * **Description:**  
    * To	Here, the Component is defined as abstract base class which specifies the behavior that needs to be exercised uniformly across all primitive objects as well as composite objects.  
    * The Primitive is sub-classes and the Composite classes off the Component class.  
    * When application needs to be manipulated a hierarchical collection of primitive and composite objects, procession of a primitive object is handled one way and processing of a composite object is handled another way.  
    * Each Composite object couples itself only to abstract type Component as it manages its children only.  

-------------------
    

### Category III : Behavioral Design Pattern:  

Behavioral design patterns that are mostly concerned with the communication between objects mainly.  

#### (a) a.	Interpreter Method  

  * **Definition:**  
    * It is a way to include language elements in a program.  
    * For the language, a representation is defined for its grammar along with an interpreter which uses the representation to interpret sentences in the given language.  
    * So, a class of problems occurs repeatedly in a well-defined and well-understood domain and id such domain were characterized with a language, then problems could be easily solved with an interpretation engine.  
  
    
  * **Description:**  
    * Defining a problem characterization as a simple language grammar, representing domain rules as language sentences and interpreting these sentences to solve the problem.  
    * Pattern uses a class to represent each grammar rule.  
    * It suggests modelling the domain with a recursive grammar.  
    * Since grammars are usually hierarchical in structure, an inheritance hierarchy of rule classes maps nicely.  
    * It defines a grammatical representation for a language and an interpreter to interpret the grammar.  

      
        --------------------
      
#### (b) a.	Observer Design Pattern Method:  

  * **Definition:**  
    * It is a way of notifying change to multiple number of classes.  
    * Define a one-to-many dependency between objects os that when one object changes state, all its dependents are notified and updated simultaneously.  
    * Encapsulates common engine components in a Subject abstraction, and the variable components in an Observer hierarchy.  

    
  * **Description:**  
    * An object which is keeper of the data model of the required business subject.  
    * It delegates all view functionality to decoupled and distinct Observer objects.  
    * It allows number of type of view objects to be configured dynamically, instead of being statically specified at compile-time.


-------------------
 
