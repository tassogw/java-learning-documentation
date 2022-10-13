# Java Learning Documentation

> Before start reading, it's strongly recommended that you check the "README" file for more details about the repository in general.

## Summary
1. [Java presentation](#java-presentation)
    - Early concepts
    - Why learn Java?
    - File managing
1. [Variables in Java](#variables-in-java)
    - Primitive Types and their usage
    - Variables and constants
    - Type Casting and Promotion
1. [Operators](#operators)
    - Arithmetic operators
    - Relational operators
    - Logic operators

1. [Structures](#structures)
    - Repetition structures
    - Decision structures

1. [Data input and output](#data-input-and-output)
    - _DataInputStream_
    - _BufferedReader_
    - _Scanner_
    - _JOptionPane_
    - _System.out_
    - Special characters for output
1. (to be added)

---

## Java presentation
First of all, we'll get started with the basics: what do you need to know about Java before start learning? What's its **programming paradigm**? Why is it a great programming language to learn? etc.  

### Early concepts
Java is a **object-oriented programming (OOP)** language, which means it works mainly with _classes_ and _objects_, being that the major difference in relation to structured programming. It also means that Java can work with coding structures better approached to real life object managing. Java is also known for being flexible in terms of **compatibility**, this means that it can be apllied in various device types with many different purposes (for example: web or distributed programming for PC's and mobile devices).  

### Why learn Java?
Marketwise, Java is one of the most demanded programming languages nowadays and it's for a good amount of reasons. As mentioned before, Java is compatible with various devices and can be useful for many ideas, giving the developers lots of opportunities to work with, specially with big multiplatform applications that requires great amounts of features and conectivity. Besides that, it's relativily beginner friendly (for being high level) in comparison to other languages like _C_ and _C++_ and it has a huge community of devs that can help anyone anywhere you can find online. These are just some of many reasons to learn Java, it surely is a big deal in software creation.

![Most demanded programming languages of 2022](https://github.com/tassogw/java-learning-documentation/blob/main/assets/images/most-in-demand-programming-languages-of-2022-codingnomads.jpg?raw=true)
> Java appears in 2nd place among the most demanded languages of 2022 based on _LinkedIn_ job posts in USA and Europe.

### File managing
With a proper IDE, managing files in Java can be a great way to organize programs and make everything properly connected. A Java application consists in a group of **classes** (functions, in a certain way), with each class having their own implementation inside the system in question and being connected one with another, making the whole code work. You're also able to group up those linked classes _logically_ inside a **package**, making the proccess more practical considering it's easier to visualize. Once you have a code, it can run pretty much everywhere with **JVM (Java Virtual Machine)**, that generates a _Bytecode_ from the `.java` compiled file and executes it in any operational system. JVM has a version for each OS, making the compatibility as it is.

## Variables in Java

### Primitive types and their usage
About **declaring variables**, it's pretty simple to get started, you just need to use the following model to create a variable: \<type> \<name> = \<value>  
Example:  
``` java
int count = 10;
```  

It's also very easy getting used to the referred syntax and their specific sizes and usage, just by following this table:  

![Primitive types in Java](https://github.com/tassogw/java-learning-documentation/blob/main/assets/images/java-primitive-type-keywords-.png?raw=true)

Having these informations in hand, we'll head into each type and their characteristics, knowing how to insert them properly inside your code.  

- byte
    - It's the smallest **number** type (_1 byte_)
    - Useful for **control variables** and **memory limited devices**
- short
    - Referred to small integers
    - Useful for **basic sums or subtractions** and **small sized data** (i.e.: living beings ages, book pages, etc.)
- int
    - Medium sized integers, generally the most used _int_ size
- long
    - Long sized integers, useful for **factorial scaled** numbers (i.e.: 20!)
    - To declare long variables, you need to end the value with an **L**, otherwise, it'll be considered as a normal int type. Example:  
    ```java
    int num1 = 500; //<-- declaring normal int
    long num2 = 500L; //<-- declaring long int
    ```
- float
    - Referred to small and medium sized values with **floating points** (6~7 significant decimal digits)
    - To declare float variables, you need to end the value with an **F**, otherwise, it'll be considered as a _double_ type. Example:  
    ```java
    float num1 = 12,50F; //<-- correct way of declaring float numbers
    float num2 = 12,50; //<-- incorrect way, the sabe number is now a double
    ```
- double
    - Long sized values with **floating points** (~15 significant decimal digits)
    - More precise than _float_ numbers, but takes up **double** the memory
- char
    - Single _Unicode_ characters (i.e.: 'a', 'z', '?', '@', etc.)
    - Has a int value that is converted to the referred char
    - Use **single quotation marks ('')** to declare char variables  
    ```java
    char letter = 'a';
    ```
- boolean
    - A variable with **true** or **false** value, meaning it occupies _1 bit_ of memory.
    - Its default value is **false**, so keep that in mind when declaring a boolean variable with no initial value.

Later on, we'll be learning how to _get_ some of these types using [data input](#data-input-and-output) from the user.  

### Variables and constants
There are some important rules and patterns envolving variables in Java that the coder need to know to avoid errors and other mistakes.  

- When **declaring** a variable in Java, some steps and tips must be followed, including:
    1. Starting the variable's name with a letter, an underscore (_) or a dollar sign ($). **Never** start with a number.
    1. Using **Camel Case** when naming a variable, which means using capital case letters every initial from the second one (Recommendation).
    1. Knowing that Java is **case sensitive**, this means that two variables can be named after the same word as long as their different when comparing each letter's case.
    1. Not declaring variables' values means using their **default value** until changed by the code. Most types use 0 (zero or equivalent) as default but _boolean_ (false).  
    ```java
    int var1, _var2, $var3; //<-- Valid names | All start at 0
    double 4var = 0.5; //<-- Invalid name
    float varfive = 3.5F, varFive = 3.5F; //<-- These are different variables
    boolean boxIsOpen; //<-- False by default | This is Camel Case
    ```

- There are also some few rules about **constants** to be followed:
    1. A constant value **can't be changed** after its creation.
    1. Use the **final** keyword when declaring a constant.
    1. It's recommended using **all capital letters** to declare a constant.
    ```java
    final double PI = 3.14; //<-- PI will always be 3.14 
    ```

- Both variables and constants can't assume any of Java's **keywords** as a name (i.e.: null, for, double, if, etc.).  

### Type Casting and Promotion
In relation to primitive types, there are some conditions to consider before **converting** one into another. We'll divide it into two different methods:  

- Promotion
    - When the referred types are **compatible**, this means, when you're trying to convert a type to a **bigger** one.
    - There's no keyword necessary to do this **automatic** conversion.
    ```java
    byte smaller = 10;
    short bigger = 0;

    bigger = smaller; //<-- Automatic conversion (bigger = 10)
    ```

- Casting
    - When the referred types are **not compatible**, this means, when you're trying to convert a type to a **smaller** one.
    - You need to _cast_ a **type keyword** to convert the type correctly.
    - There's probably going to happen a **data loss**.
     ```java
    int smaller = 10;
    float bigger = 12.50F;

    smaller = (int)(bigger); //<-- Manual conversion with data loss (smaller = 12)
    ```

> Even though it's not necessary _casting_ a smaller type to a bigger type, it's a **good habit**, so you can keep your code more readable and to make sure no error will occur.  

There's also a **expression** promotion in Java, which is an automatic conversion that changes each operand to a certain type depending on the situatio, that is:
- Convert each byte, short or char operand into **int** when computing the expression.
- Convert the whole expression to **long**, **float** or **double** if that's a operand's type.

## Operators
...

## Structures

## Data input and output