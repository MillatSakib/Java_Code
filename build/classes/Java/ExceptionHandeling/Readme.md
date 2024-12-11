### Chat 1:

**User:**  
How much type of exception are available in java?

**Assistant:**  
In Java, exceptions are broadly categorized into **two main types** based on their handling mechanism:

---

### 1. **Checked Exceptions**

- **Definition**: These are exceptions that are checked at compile-time by the Java compiler. The programmer must handle these exceptions either by using a `try-catch` block or by declaring them with a `throws` clause in the method signature.
- **Examples**:
  - `IOException`
  - `SQLException`
  - `ClassNotFoundException`
  - `FileNotFoundException`

---

### 2. **Unchecked Exceptions**

- **Definition**: These are exceptions that are not checked at compile-time but occur during runtime. These are typically programming errors that the programmer should prevent through proper logic.
- **Examples**:
  - `ArithmeticException`
  - `NullPointerException`
  - `ArrayIndexOutOfBoundsException`
  - `IllegalArgumentException`

---

### 3. **Errors (Special Case)**

Errors are not exceptions but belong to the same hierarchy (`Throwable`). They indicate serious issues that applications should not attempt to recover from. Errors typically result from the environment rather than the program itself.

- **Examples**:
  - `StackOverflowError`
  - `OutOfMemoryError`
  - `VirtualMachineError`

---

### Summary of Exception Hierarchy:

The Java exception hierarchy is structured under the `Throwable` class:

1. **Throwable**
   - **Error**: Represents critical issues.
   - **Exception**: Recoverable issues.
     - **Checked Exceptions**
     - **Unchecked Exceptions (RuntimeException)**

Would you like further examples or a code demonstration of handling these exceptions?

---

### Chat 2:

**User:**  
Please give me all checked exception.

**Assistant:**  
Here is a list of **checked exceptions** in Java. These exceptions must be handled at compile time using a `try-catch` block or declared with a `throws` clause in the method signature.

---

### Common Checked Exceptions:

1. **IOException**

   - Thrown when an input or output operation fails.
   - Example: Reading a non-existent file.

2. **FileNotFoundException**

   - Subclass of `IOException`.
   - Thrown when a file is not found in the specified location.

3. **SQLException**

   - Thrown when there is an error interacting with a database.

4. **ClassNotFoundException**

   - Thrown when an application tries to load a class by its name using `Class.forName()`, and the class is not found.

5. **CloneNotSupportedException**

   - Thrown when attempting to clone an object that does not implement the `Cloneable` interface.

6. **InterruptedException**

   - Thrown when a thread is interrupted while waiting or sleeping.

7. **NoSuchMethodException**

   - Thrown when a particular method cannot be found in a class.

8. **InvocationTargetException**

   - Thrown when a method invoked via reflection throws an exception.

9. **InstantiationException**

   - Thrown when an application tries to create an object of an abstract class or interface using reflection.

10. **IllegalAccessException**

    - Thrown when an application attempts to reflectively access a field or method it does not have permission to access.

11. **UnsupportedEncodingException**

    - Subclass of `IOException`.
    - Thrown when a character encoding is not supported.

12. **EOFException**

    - Subclass of `IOException`.
    - Thrown when the end of a file or stream is reached unexpectedly.

13. **MalformedURLException**

    - Subclass of `IOException`.
    - Thrown when a malformed URL occurs.

14. **URISyntaxException**

    - Thrown when a string cannot be parsed as a valid URI.

15. **DataFormatException**

    - Thrown when data in a particular format is invalid or corrupt.

16. **ObjectStreamException**

    - Subclass of `IOException`.
    - Base class for exceptions during object serialization or deserialization.

17. **TimeoutException**

    - Thrown when a blocking operation times out.

18. **ReflectiveOperationException**
    - A superclass of many exceptions that occur during reflection (`ClassNotFoundException`, `NoSuchMethodException`, etc.).

---

These exceptions are **part of the `Exception` class** hierarchy and are separate from runtime exceptions and errors. Handling these is crucial for creating robust programs. Let me know if you’d like code examples of any specific checked exception!
