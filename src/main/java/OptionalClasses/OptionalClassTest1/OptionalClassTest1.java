/*
Line-by-line explanation
1. import java.util.*;
   - Imports utility classes, including Optional.
2. public class Main {
   - Defines the Main class.
3. static String getDefaultName() {
   - Defines a method that returns a String.
4. System.out.println("Creating default");
   - Prints Creating default when the method is called.
5. return "Unknown";
   - Returns the default name Unknown.
6. Optional<String> name = Optional.of("Asher");
   - Creates an Optional containing Asher. It is not empty.
7. String a = name.orElse(getDefaultName());
   - Returns Asher because the Optional contains a value.
   - Important: getDefaultName() is still executed because orElse() evaluates its argument eagerly.
8. System.out.println(a);
   - Prints Asher.
9. Optional<String> name2 = Optional.empty();
   - Creates an empty Optional, containing no value.
10. String b = name2.orElseGet(() -> getDefaultName());
    - Since name2 is empty, orElseGet() calls getDefaultName() to obtain the default value Unknown.
    - The lambda () -> getDefaultName() delays the method call until needed.
11. System.out.println(b);
    - Prints Unknown.
12. }
    - Closes the main() method and the class.
Output
Creating default
Asher
Creating default
Unknown


Key difference:
- orElse() calls the default method even when a value exists.
- orElseGet() calls the default method only when the Optional is empty.
 */
package OptionalClasses.OptionalClassTest1;
import java.util.*;
public class OptionalClassTest1 
{
    static String getDefaultName() {
        System.out.println("Creating default");
        return "Unknown";
    }

    public static void main(String[] args) {
        Optional<String> name = Optional.of("Asher");

        String a = name.orElse(getDefaultName());
        System.out.println(a);
        
        Optional<String> name2= Optional.empty();
        String b = name2.orElseGet(() -> getDefaultName());
        System.out.println(b);
}
}