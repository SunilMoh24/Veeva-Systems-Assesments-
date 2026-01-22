class InvalidPasswordException extends Exception {
}

class Demo_12{
    void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException();
        }
    }
    public static void main(String[] args) {
        String password = "mohan";  
	    Demo_12 d = new Demo_12();
        try {
            d.validatePassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password.");
        }
    }
}



