/**
 * Class Modifiers
 * Here are 2 class modifiers in java Default & Public.
 * The classes in the file can be public and default.
 * There is at most one class that can be public. and it is also possible that
 * ther is no public class in the file.
 * If a public class exists in the file then file name is on its public class
 * name. But main method can have in any class.
 * There can be multiple main method in java file but they will be in different
 * classes.
 */
public class FileName {
    public static void main(String[] args) {
        System.out.println("I am the main Method in FileName");
    }
}

class class1 {
    public static void main(String[] args) {
        System.out.println("I am the main Method in class 1");
    }
}

class class2 {
    public static void main(String[] args) {
        System.out.println("I am the main Method in class 2");
    }

}