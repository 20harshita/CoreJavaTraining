* Latest 15.x
* Java 1.8 / Java 11.x

* Platform independence
* JDK -> Java Development Kit
* jdk/bin -> tools
* jdk/jmods -> core/basic libraries that you will need to work with

* Compiled language
* Java code gets compiled to __bytecodes(IL in .NET)__
* javac is the java compiler that compiles the java code to bytecodes
* Bytecodes are instructions targeting a processor
* Java runtime executes your bytecodes

* Java Runtime = JVM == Java Runtime Environment == JRE
* Statically typed language -> you have to define the type of the variable during compile time
* Case-sensitive
* semi-colon separated

### Compiling and Running

* javac __filename.java__
* You get __filename.class__ 
* java __filename(or classname)__

### Naming Conventions

* Completely OO
* Every piece of code goes inside a class
* There is no concept of global variables or global functions
* starting point of a Java application is __main__

* Create a class __HelloWorld__
* Add a __main__ method
* All class names begin with UpperCase and follow CamelCase notation

### Abstract classes

* Represent a group or a category or an abstract concept (Employee, Animal, Vehicle)
* Marked as abstract using the __abstract__ keyword
* Cannot be instantiated but can act as references to derived classes (__Animal dog = new Dog()__)
* Abstract classes can have variables, methods and also __abstract__ methods
* Abstract methods do not have an implementation
* Classes that extend abstract classes SHOULD implement the abstract methods

<br/>

* Multiple inheritance is not allowed in Java
* A class CANNOT extend more than one class

### Interfaces
* Similar to the pure virtual functions in C++
* But have changed a lot since Java 1.1
* interfaces are like abstract classes
* They cannot be instantiated (__Terrestrial t = new Terrestrial();__)
* They cannot have constructors
* But a class can inherit more than one interface using __implements__ keyword

``` java
class Frog implements Terrestrial, Aquatic {}
```

* Interface can have abstract methods and also __default(concrete) methods__ and also __static methods__(__introduced in Java 7__)
* Interfaces can have variables. But the variables are __final (or constant)__

### final

* constants
* constant variables are defined using __final__ keyword
* Marking a class final, makes it sealed or non-extensible
* Marking a method final, makes it non-overridable


### static

* static means __shared__
* a static member is stored in a separate region in the memory
* All members of the object can access the static region

* Class can have static and non-static members
* From a static method you CANNOT directly access a non-static member. Reverse is true
* A shared vending machine in office can be accessed by all the employees
* But the operator of the shared vending machine cannot access the employee's personal coffeemaker

* static methods __ARE NOT OVERIDDEN__
* static methods have an impact on extensibility
* creating classes with a lot of static methods thinking that it saves memory is a myth
* it's a flawed design
* your code will become completely non-extensible
* __USE static methods sparingly__


* Have a lot of classes A ... Z. None of these classes will have main method
* You will have just one class usually called __Application__ with a main method. This will be the starting point for your entire application
* __java Application__
* From this main method, you will create objects of all the classes A ... Z and use their methods.


### Inner classes

* Inner classes can be instantiated only using the Outer class instance

``` java		
TV sony = new TV();
TV.Remote remote = sony.new Remote();
```

* Inner classes can access private members of Outer classes. __Important feature__
* Compiled to __Outer$Inner.class__


### Packages


* Package is a __physical__ way of grouping classes/interfaces
* Namespace is a logical way of grouping entities
* A package in Java is a __folder__
* If you create a class say __Person__ in a package __com.intuit__
* You have a folder called __com__ that contains a sub folder called __intuit__ which has __Person.java__


* core package is __java.lang__
* __java.util__: Collections (List, Set, Map)
* __java.io__ or __java.nio__ : IO operations
* __java.net__: talk to URLs 
* __java.util.stream__: new Stream API introduced in Java 1.8


### Exceptions

* Two types of Exceptions in Java
* Checked exceptions and Unchecked exceptions
* Checked: Needs to be handled during development; They extend from __Exception__ class
* IOException, DB related Exception;

* Unchecked: Need not have code written to handle; They extend from __RuntimeException__ class
* ArithmeticException, NullpointerException












































