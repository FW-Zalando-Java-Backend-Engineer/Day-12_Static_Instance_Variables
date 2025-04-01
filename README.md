# **📘 Day-12: Java Object Lifecycle & Static vs Instance Variables**  
Welcome to **Day-12** of our Java learning journey! Today, we explored the **lifecycle of Java objects**, and clarified the difference between **static and instance variables**. These core concepts are crucial for mastering object-oriented programming and efficient memory management.

---

## **📌 Lesson Structure**

### **1️⃣ Object Lifecycle**
- **Creation** – How objects are instantiated.
- **Usage** – How references interact with objects.
- **Destruction** – How Java handles unused objects through garbage collection.

### **2️⃣ Object Creation**
```java
String s; // Declaration only – s is null
String s = new String("abc"); // Now s points to a real object in memory
```

### **3️⃣ Object Usage Scenarios**

#### ✅ One Variable, One Object
```java
String s = new String("abc");
s.length();       // 3
s.substring(2);   // "c"
```

#### ✅ Two Variables, One Object
```java
String s1 = new String("abc");
String s2 = s1;
s1 = null;        // s2 still refers to "abc"
```

#### ✅ Two Variables, Two Objects
```java
String s1 = new String("abc");
String s2 = new String("abc");

s1.equals(s2);    // true
s1 == s2;         // false
```

#### ✅ One Variable, Two Objects
```java
String s = new String("abc");
s = new String("cba"); // "abc" is now unreachable
```

### **4️⃣ Object Destruction**
- Java uses **automatic garbage collection**.
- When an object is **no longer referenced**, it's marked for removal by the **Garbage Collector**.
- Unlike C/C++, Java doesn't require manual memory cleanup.

---

## **📌 Static vs Instance Variables**

### **🔹 Instance Variables**
- Declared **without `static`**
- **Each object** has its own copy
- Initialized during object creation

### **🔹 Static Variables**
- Declared **with `static`**
- **Shared across all instances**
- Belong to the class, not the object

### **🖥️ Example**
```java
public class Student {
    static int totalStudents = 0;  // Shared across all
    String name;                   // Unique to each instance

    Student(String name) {
        this.name = name;
        totalStudents++;
    }
}
```

**📝 Output Behavior:**
- Every new `Student` increments `totalStudents`
- `name` stays unique per instance

---

## **🧪 Live Concept Demonstrations**

### **🖥️ Comparing References vs Objects**
```java
String s1 = new String("hello");
String s2 = new String("hello");

System.out.println(s1 == s2);      // false (different memory addresses)
System.out.println(s1.equals(s2)); // true (same content)
```

---

## **🎯 Hands-on Exercises**
✅ Write a class with both static and instance variables.  
✅ Track the number of objects created using a static variable.  
✅ Demonstrate garbage collection by nullifying all references to an object.  
✅ Compare multiple `String` objects using both `==` and `.equals()`.

---

## **📚 Additional Resources**
- [JavaGuides: Static vs Instance Variables](https://www.javaguides.net/2023/11/static-variable-vs-instance-variable-in-java.html#google_vignette)
- [FreeCodeCamp: Static Variables in Java](https://www.freecodecamp.org/news/static-variables-in-java/)
- [Medium: Understanding Static and Instance Variables](https://medium.com/@barbieri.santiago/understanding-static-and-instance-variables-in-java-f53173cabe8c)
- [Baeldung: Java Static](https://www.baeldung.com/java-static)
- [Baeldung: Initializer Blocks](https://www.baeldung.com/java-static-instance-initializer-blocks)

---

## **🎥 Video Lesson Recording**
📺 _To be added soon after the class!_

---

## **📑 Slides**
📂 [Java - Object Lifecycle Slides](_To be added soon after the class!_)

---

🚀 **Fantastic work today! Understanding object behavior is key to mastering Java. See you tomorrow for more backend brilliance!** 💡
