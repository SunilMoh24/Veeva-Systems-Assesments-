class InvalidMarksException extends Exception {}
class Demo7{
 void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException();
        }
        System.out.println("Valid marks: " + marks);
    }
    public static void main(String[] args) {
        Demo7 d = new Demo7();
        try {
         d.validateMarks( 120);
        } catch (InvalidMarksException e) {
            System.out.println("Invalid Marks");
        }
    }
}

// Here I have defined an Exception named "InvalidMarksException" and I used both "throws" and "throw"

// I used "throw" , so that I can define when to create an Exception by using the if() condition.
// I used "throws" , so that the caller(main) will handle the exception.

