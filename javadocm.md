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
    - Decision structures
    - Repetition structures

1. [Libraries](#libraries)
    - ...

1. [Data input and output](#data-input-and-output)
    - Input methods
    - _System.out_
    - Special characters for output

---

## Java presentation
First of all, we'll get started with the basics: what do you need to know about Java before start learning? What's its **programming paradigm**? Why is it a great programming language to learn? etc.  

### Early concepts
Java is a **object-oriented programming (OOP)** language, which means it works mainly with _classes_ and _objects_, being that the major difference in relation to structured programming. It also means that Java can work with coding structures better approached to real life object managing. Java is also known for being flexible in terms of **compatibility**, this means that it can be apllied in various device types with many different purposes (for example: web or distributed programming for PC's and mobile devices).  

### Why learn Java?
Marketwise, Java is one of the most demanded programming languages nowadays and it's for a good amount of reasons. As mentioned before, Java is compatible with various devices and can be useful for many ideas, giving the developers lots of opportunities to work with, specially with big multiplatform applications that requires great amounts of features and conectivity. Besides that, it's relativily beginner friendly (for being high level) in comparison to other languages like _C_ and _C++_ and it has a huge community of devs that can help anyone anywhere you can find online. These are just some of many reasons to learn Java, it surely is a big deal in software creation.

![Most demanded programming languages of 2022](https://github.com/tassogw/java-learning-documentation/blob/main/assets/images/most-in-demand-programming-languages-of-2022-codingnomads.jpg?raw=true)  
<sup>image by CodingNomad reference [link here](https://www.techrepublic.com/article/the-best-programming-languages-to-learn-in-2022/)</sup>  

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
<sup>image by Facing Issues on IT [link here](https://facingissuesonit.com/2019/06/24/java-primitive-type/)</sup>

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
    int num1 = 500; // declaring normal int
    long num2 = 500L; // declaring long int
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
    final double PI = 3.14; // PI will always be 3.14 
    ```

- Both variables and constants can't assume any of Java's **keywords** as a name (i.e.: null, for, double, if, etc.).  

### Type Casting and Promotion
In relation to primitive types, there are some conditions to consider before **converting** one into another. We'll divide it into two different methods:  

- Promotion
    - When the referred types are **compatible**, this means, when you're trying to convert a type to a **greater** one.
    - There's no keyword necessary to do this **automatic** conversion.
    ```java
    byte smaller = 10;
    short greater = 0;

    greater = smaller; // Automatic conversion (greater = 10)
    ```

- Casting
    - When the referred types are **not compatible**, this means, when you're trying to convert a type to a **smaller** one.
    - You need to _cast_ a **type keyword** to convert the type correctly.
    - There's probably going to happen a **data loss**.
     ```java
    int smaller = 10;
    float greater = 12.50F;

    smaller = (int)(greater); // Manual conversion with data loss (smaller = 12)
    ```

> Even though it's not necessary _casting_ a smaller type to a greater type, it's a **good habit**, so you can keep your code more readable and to make sure no errors will occur.  

There's also a **expression** promotion in Java, which is an automatic conversion that changes each operand to a certain type depending on the situatio, that is:
- Convert each byte, short or char operand into **int** when computing the expression.
- Convert the whole expression to **long**, **float** or **double** if that's a operand's type.

## Operators
Solving equations and creating logic systems are routine tasks in software development and that's no different in Java. For these cases, we'll learn the main operators for each type of problem, these being:
- Arithmetic operators:  
    For **arithmetic equations**, there's some basic operators to be known at the list below:
    - **+** : sum (x + y = z)
    - **-** : subtraction (x - y = z)
    - **/** : division (x / y = z)
    - **\*** : multiplication (x * y = z)
    - **%** : mod division (x % y = z)
    - **- or +** (anticipating a number) : signal assigment (-x)
    - **++** : simple increment (++x or x++)
    - **--** : simple decrement (--x or x--)

    We can also combine the basic arithmetic operators _(+, -, *, /)_ with the **attribution operator (=)** to change a variables value easily, for example:
    ```java
    int number = 10;
    number += 2; //<-- number's value is now 12
    number -= 10; //<-- now the value is 2
    //and so on...
    ```

    There are also some specifications about the **decrement and increment operators**. We change a variable's value by one using them:
    change a variables value easily, for example:
    ```java
    int number = 10;
    number++; //<-- number is now 11
    number--; //<-- number is now 10 again
    ```
    However, the order where you put these signs in relation to an operand can change the final result. That is, anticipating a value change its value before finishing the bigger equation, and at the other way around, the value changes only after the equation. Let's see it more clearly:
    ```java
    int num1 = 10, sum1 = 0;
    sum1 += ++num1; // First, num1 is incremented (10 + 1) and then added its value to sum1 (11 + 0)

    int num2= 10, sum2 = 0;
    sum2 += num2++; // First, num2 is added to sum2 (0 + 10) and then it's incremented (10 + 1)
    ```
    This happens because of **operator's precedence**, which means some operators will be solved in a certain order as shown below:
    ![Operators precedence in Java](https://github.com/tassogw/java-learning-documentation/blob/main/assets/images/java-operator-precedence.png?raw=true)
    <sup>image by javatpoint [link here](https://www.javatpoint.com/java-operator-precedence)</sup>  

    > According to the image, the operators at the top are the highest priority inside an equation while the ones at the bottom are the lowest. The chart also includes the other types of operators that will be learnt about next.  

- Relational Operators
    When trying to **compare values or expressions**, the relational operators come in handy. These being:
    - **==** : equality (x == y)
    - **!=** : non-equality (x != y)
    - **<** : less than (x < y)
    - **>** : greater than (x > y)
    - **<=** : less or equal to (x <= y)
    - **>=** : greater or equal to (x >= y)

    The operators listed above work with **boolean** returns, meaning it contains a _true_ or _false_ value. If the condition related to the operator being used is true, as expected, it returns a true value, otherwise, a false one. For example:  
    ```java
    int num1 = 1, num2 = 2;
    boolean op;

    op = (num1 > num2); //In this case, the boolean op's value would be false
    ```  

- Logic Operators
    To solve problems involving certain **conditions**, logic operators are used to analyse different expressions.
    - **&&** : and (x && y)
    - **||** : or (x || y)
    - **!** : not (!x)

    In those cases, _x_ and _y_ are mostly expressions that will be compared to run a specific part inside the program. Each operator acts in a different way to return a boolean value when comparing operands:  
    - to return _true_, the **&&** operator needs to compare **only true** values
    ```java
    op = (x && y); //x and y need to be true
    ```
    - to return _true_, the **||** operator needs to compare **at least one true value** with another one
    ```java
    op = (x || y); //just x or y need to be true, x and y being true also works
    ```
    - the **!** operator simply changes an expression's value
    ```java
    op = !(5 > 4); //"5 > 4" would return true, but the NOT operator changes it to false
    ```

 Even though all the examples envolving boolean values would run correctly, that's not a very common way to use the operators. That is, it's uncommon to assign a value of an expression directly to a variable, instead we use them to execute only **certain parts of our code**. But how?  


## Structures
Structures are necessary for our code to be functional in a way the coder has **control** over the software by taking decisions on when and what to run. By inserting certain conditions inside structures, the developer creates different paths inside the program, these paths may have be inside two types of structures:  
- Decision structures
    When dealing with **different possibilities**, decision structures are used to divide the code into various paths, mostly by using conditions based on **relational** and **logic**. For example:
    ```java
    if ((num1 > num2)&&((num1 % 2) == 0)){
        //This code only runs if both conditions are true
    }
    ```
    In the example, two different expressions were used as a condition to run our code inside the **if** statement, let's check how each structure works:

    1. If
    A part of code inside an _if statement_ will only run if the stabilished condition is true.
    ```java
    int sum, num1 = 3, num2 = 10;

    sum = num1 + num2;

    if ((num1 < 0)||(num2 < 0)){
        sum = 0;
        /* In this case, we want sum only positive numbers, so if at least one is negative
        *  the sum variable will now equal 0.
        */
    }
    ```  

    1. if-else
    When using if statements, the dev may want to run different paths depending on multiple conditions, in this case, a bigger structure with **ifs** and **elses** would be created.
    ```java
    int age = 16, range = 0;

    if (age < 12){
        range = 1
    } else if (age < 18) {
        range = 2;
    } else {
        range = 3;
    }
    ```

    In relation to the example above, the intention is to assign different range values according to the age specified, so, different conditions were created. To a person aged below 12, range equals 1, **else**, if aged below 18, range equals 2, and so on.  

    1. switch-case
    ...

## Libraries

## Data input and output