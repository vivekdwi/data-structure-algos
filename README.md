**`Serialization In Java`**

Serialization is the process of converting an object's state (including its references) to a sequence of bytes, as well as the process of rebuilding those bytes into a live object at some future time.
Serialization is used when you want to persist the object. It is also used by RMI to pass objects between JVMs, either as arguments in a method invocation from a client to a server or as return values 
from a method invocation. In general, serialization is used when we want the object to exist beyond the lifetime of the JVM.

_`Lets see couple of different scenarios (examples) where we use serialization.`_

1. Banking example: When the account holder tries to withdraw money from the server through ATM, the account holder information along with the withdrawal details will be serialized (marshaled/flattened 
to bytes) and sent to server where the details are dematerialized (unmarshaled/rebuilt the bytes)and used to perform operations. This will reduce the network calls as we are serializing the whole object 
and sending to server and further request for information from client is not needed by the server.


2. Stock example: Lets say an user wants the stock updates immediately when he request for it. To achieve this, everytime we have an update, we can serialize it and save it in a file. When user requests 
the information, deserialize it from file and provide the information. This way we dont need to make the user wait for the information until we hit the database, perform computations and get the result.

`Here are some uses of serialization`

a. To persist data for future use.
b. To send data to a remote computer using such client/server Java technologies as RMI or socket programming.
c. To "flatten" an object into array of bytes in memory.
d. To exchange data between applets and servlets.
e. To store user session in Web applications.
f. To activate/passivate enterprise java beans.
g. To send objects between the servers in a cluster.

_`Performance Issues/Improvement with Serialization`_
The default way of implementing the serialization (by implementing the Serializable interface) has performance glitches. Say you have to write an object 10000 times in a flat file through serialization, 
this will take much more (alomost double) the time than it takes to write the same object 10000 times to console. To overcome this issue, its always better to write your custom protocol instead of going 
for default option.

Also always note to close the streams (object output and input streams). The object references are cached in the output stream and if the stream is not closed, the system may not garbage collect the 
objects written to a stream and this will result in poor performance.

Using Serialization always have performance issues? Nope... Let me give you a situation where it is used for performance improvement. Lets assume you have an application that should display a map 
and pointing to different areas in the map should highlight those areas in different color. Since all these are images, when you point to each location, loading an image each time will slow the 
application heavily. To resolve this issue, serialization can be used. So here since the images wont change, you can serialize the image object and the respective points on the map (x and y co-ordinates) 
and deserialize it as and when necessary. This improves the performance greatly.

**`Functional Interfaces`**

How does lambda expressions fit into Java's type system? Each lambda corresponds to a given type, specified by an interface. A so called functional interface must contain exactly one abstract method declaration. Each lambda expression of that type will be matched to this abstract method. Since default methods are not abstract you're free to add default methods to your functional interface.

We can use arbitrary interfaces as lambda expressions as long as the interface only contains one abstract method. To ensure that your interface meet the requirements, you should add the @FunctionalInterface annotation. The compiler is aware of this annotation and throws a compiler error as soon as you try to add a second abstract method declaration to the interface.

Example:

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
Integer converted = converter.convert("123");
System.out.println(converted);    // 123
Keep in mind that the code is also valid if the @FunctionalInterface annotation would be omitted.****

**`Linked List vs Array`**

Both Arrays and Linked List can be used to store linear data of similar types, but they both have some advantages and disadvantages over each other.

Following are the points in favour of Linked Lists.

(1)	The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage, and in practical uses, upper limit is rarely reached.

(2)	Inserting a new element in an array of elements is expensive, because room has to be created for the new elements and to create room existing elements have to shifted.

For example, suppose we maintain a sorted list of IDs in an array id[].

id[] = [1000, 1010, 1050, 2000, 2040, …..].

And if we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 1000 (excluding 1000).

Deletion is also expensive with arrays until unless some special techniques are used. For example, to delete 1010 in id[], everything after 1010 has to be moved.

So Linked list provides following two advantages over arrays
1)	Dynamic size
2)	Ease of insertion/deletion

Linked lists have following drawbacks:
1)	Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists.
2)	Extra memory space for a pointer is required with each element of the list.
3) Arrays have better cache locality that can make a pretty big difference in performance.
