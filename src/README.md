Assignment 06: Interfaces
📌 Description
This project demonstrates the use of interfaces and abstract classes in Java by modeling various types of ducks and their behaviors. The design follows the strategy pattern, allowing dynamic changes in duck behaviors (flying, quacking, swimming) at runtime.

📂 File Structure
1️⃣ Main.java
Purpose:

The entry point of the application.
Creates different duck objects and invokes their behaviors.
Key Methods:

public static void main(String[] args)
Instantiates various duck types (MallardDuck, RubberDuck, RedHeadDuck, DecoyDuck)
Calls methods: display(), performQuack(), performSwim(), isFlying()
2️⃣ Duck.java (Abstract Class)
Purpose:

Serves as the base class for all duck types.
Uses composition to include behavior interfaces.
Key Features:

Fields:

QuackBehavior quackBehavior
SwimBehavior swimBehavior
FlyBehavior flyBehavior
Methods:

setQuackBehavior(QuackBehavior quackBehavior) and getQuackBehavior()
performQuack() – delegates quack action
setSwimBehavior(SwimBehavior swimBehavior) and performSwim()
isFlying() – delegates flying action
abstract void display() – each subclass must implement its own display
3️⃣ Duck Subclasses
MallardDuck.java
Purpose:

Represents a mallard duck.
Initializes with standard behaviors: flying, swimming, and quacking.
Key Method:
display() – prints "Mallard Duck"
RedHeadDuck.java
Purpose:

Represents a red-head duck with standard quacking behavior.
Key Method:
display() – prints "RedHead Duck"
RubberDuck.java
Purpose:

Represents a rubber duck with non-flying behavior.
Initializes with behaviors: non-flying, floating, and standard quack.
Key Method:
display() – prints "Rubber Duck"
DecoyDuck.java
Purpose:

Represents a decoy duck, used mainly to mimic quacking behavior.
Key Method:
display() – prints "DecoyDuck"
4️⃣ Behavior Interfaces and Implementations
FlyBehavior Interface & Implementations
FlyBehavior.java

Declares fly()
Flying.java

Implements fly() to print "I'm flying"
NotFlying.java

Implements fly() to print "Not flying"
QuackBehavior Interface & Implementations
QuackBehavior.java

Declares quack()
Quack.java

Implements quack() to print "Quack"
Squeak.java

Implements quack() to print "Squeak"
SwimBehavior Interface & Implementations
SwimBehavior.java

Declares swim()
Swimming.java

Implements swim() to print "Swimming"
Floating.java

Implements swim() to print "Floating"
