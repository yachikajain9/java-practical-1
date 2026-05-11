
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Library {
    private int availableBooks;
    public Library(int books) {
        this.availableBooks = books;
   }
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}


 class LibraryApp {
    public static void main(String[] args) {

                System.out.println("yachika jain: 240390107056");

        Library lib = new Library(3);

        try {
            lib.issueBook(2); 
            lib.issueBook(2); 
        } 
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Library process completed");
        }
    }
}