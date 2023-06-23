class Start { 	 
 public static void main(String[] args) {         
 StoryBook sb1 = new StoryBook("1234678900", "ABC", "James Evans", 100.52, 10, "Fictional");         
 StoryBook sb2 = new StoryBook("1478523690", "DEF", "Peter Granger", 842.84, 5, "Motivational");         
 StoryBook sb3 = new StoryBook("3698521470", "GHI", "Daniel Roberts", 142.45, 7, "Biographical");         
 
 StoryBook sb4 = new StoryBook("2583697410", "JKL", "Julian Forte", 654.25, 3, "Thriller");         
 
 StoryBook sb5 = new StoryBook("3697412580", "MNO", "Maria D'Costa", 963.5, 2, "Mystery");                  
  TextBook tb1 = new TextBook("1458237960", "PQR", "Kyle Hoppins", 145.85, 12, 5);         
  TextBook tb2 = new TextBook("7458231690", "STU", "Ann Mary", 842.74, 10, 7);         
  
  TextBook tb3 = new TextBook("4547128784", "VWX", "Nicholas D'Mello", 784.1, 8, 9);         
  TextBook tb4 = new TextBook("9745136486", "YZA", "Summer Stark", 357.14, 6, 5);         
  TextBook tb5 = new TextBook("9851236415", "BCD", "Steve Clark", 452.36, 9, 4);                  
  BookShop bs = new BookShop("Book World");                  
  bs.insertBook(sb1);         
  bs.insertBook(sb2);         
  bs.insertBook(sb3);         
  bs.insertBook(sb4);         
  bs.insertBook(sb5);         
  bs.insertBook(tb1);         
  bs.insertBook(tb2);         
  bs.insertBook(tb3);         
  bs.insertBook(tb4);         
  bs.insertBook(tb5);                  
 System.out.println("The books in the book shop are:");	         
 bs.showAllBooks();         System.out.println("\n");                  
if(!bs.removeBook(sb3))              
	System.out.println("The book "+sb3.getBookTitle()+" is removed from the book shop!");         
if(!bs.removeBook(tb1))             System.out.println("The book "+tb1.getBookTitle()+" is removed from the book shop!");                 
 System.out.println("The books in the book shop after removal of some books are:");         
 bs.showAllBooks();         
 System.out.println("\n");                  
 String isbn = "1478523690";         
 Book b = bs.searchBook(isbn);         
         if(b != null) {             
		 System.out.println("The book "+b.getBookTitle()+" with ISBN "+isbn+" is found in the book shop!");         
		 }         else {             
		 System.out.println("The book '"+b.getBookTitle()+"' with ISBN "+isbn+"  is not found in the book shop!");         
		 }     
 } 
} 
 