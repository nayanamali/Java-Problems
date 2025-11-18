class Book{
                String title="The Great Gatsby";
                String author="F. Scott Fitzgerald";
                int price=500;
                
                void borrowBook()
                {
                         System.out.println("Marks the book as borrowed");
                }
                void returnBook()
                {
                         System.out.println("Marks the book as returned");
                }
                public static void main(String args[])
                {
                         Book b1=new Book();
                         System.out.println(b1.title + " author is " + b1.author + " and price is " + b1.price );
                         b1.borrowBook();
                         b1.returnBook();
                }
}