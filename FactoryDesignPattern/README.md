# Factory Design Pattern
# Factory Pattern Implementation using Dependency Injection in real time application which provides services for Aadhar Card,Pan Card, and Driving License

It is a creational design pattern which talks about the creation of an object.
The factory design pattern says that define an interface ( A java interface or an abstract class)
and let the subclasses decide which object to instantiate.
The factory method in the interface lets a class defer the instantiation to one or more concrete subclasses.
Since this design patterns talk about instantiation of an object and so it comes under the category of creational design pattern.

Main Advantage of Factory Pattern is that -
--> We donot have to instantiate the object which we dont require and we can add 
those objects in the FactoryService class and call those objects whenever we need them.
so there will be no wastage of memory.

--> It also helps in loose coupling.