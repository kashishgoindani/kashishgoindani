//library management system
import java.util.ArrayList;
import java.util.Scanner;

class book {
int id;
String Btitle;
String bauthor;
String bsubject;
boolean bissued;

 book(int id , String Btitle , String bauthor , String bsubject)
{
this.id= id;
this.Btitle = Btitle;
this.bauthor = bauthor;
this.bsubject = bsubject;
this.bissued = false;
}

public void issuebook()
{
	if(!bissued)
	{
	   bissued = true;
	   System.out.println(" book is issued " );	
	}

	else
	{
	   System.out.println("This book is already issued");
	}
}
  

public void returnbook()
{
	if(bissued)
	{
	   bissued = false;
	   System.out.println("book is returned");
	}
	else
	{
	   System.out.println("This book was not issued.");
	}
}
       
//override
public String toString()
{
	return "BOOK ID: " + id + " | TITLE: " + Btitle + 
           " | AUTHOR: " + bauthor + " | SUBJECT: " + bsubject + 
           " | STATUS: " + (bissued ? "Issued" : "Available");
}
}

public class Main
{
	private static ArrayList<book> library = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	private static int bookidcounter = library.size()+1;  // nect book id after 5 books
 
	public static void main(String[] args)
	{
	  //add 5 books
	  library.add(new book(1 , " java " , " Herbert Schildt " , " Computer Science "));
	  library.add(new book(2 , " C++ " , " Robert " , " Computer Science "));
	  library.add(new book(3 , " Python " , " Herbert Schildt " , " Computer Science "));
	  library.add(new book(4 , " Data Structure" , " Robert Lafore " , " Computer Science "));
 	  library.add(new book(5 , " Database" , " Stuart Russell " , " Computer Science "));


	while(true)
	{
	  System.out.println( "library management System  " );
 	  System.out.println( " 1 Add book ");
	  System.out.println( " 2 Issue book ");
	  System.out.println( " 3 Return book ");
 	  System.out.println( " 4 Display books ");
	  System.out.println( " 5 Exit program");
 
	  System.out.println("Choose An Option: ");

	  int choice = sc.nextInt();
	  sc.nextLine();
            
	switch(choice)
	{	
	  case 1: 
	   {
	      addbook();
		break;
	   }
	  case 2: 
	   {
	      issuebook();
		break;
	   }
	  case 3: 
	   {
	      returnbook();
	 	break;
	   }
	  case 4: 
	   {
	      displaybooks();
		break;
	   }
	  case 5: 
	   {
	      System.out.println("Existing Library System: ");
		return;
	   }
	 default:
	  {
		System.out.println("Invalid choice: sorry");
	  }
	}
    }
  }

    public static void addbook()
     {
	 System.out.println( "Enter book title" );
	 String Btitle = sc.nextLine();
	
	 System.out.println( "Enter Author name" );
	 String bauthor = sc.nextLine();

	 System.out.println( "Enter subject" );
	 String bsubject = sc.nextLine();
	
	library.add(new book(bookidcounter++ , Btitle , bauthor , bsubject));
	System.out.println("book added:");
    }

  public static void issuebook()
 {
   if(library.isEmpty())
  {
	System.out.println("No books available in the library");
	return;
  }

    displaybooks();
    System.out.println("Enter book id to issue:");
    int bookid = sc.nextInt();

   for(book b: library)
   { 
       if(b.id == bookid)
       {
        b.issuebook();
       return;
   }
      
	System.out.println("invalid book id");
  }
 }
            
      public static void returnbook()
     {
	if(library.isEmpty())
	{ 
	 System.out.println("No books available in the library ");
 	 return; 
	} 
	 displaybooks();
	System.out.println("Enter book id to return");
	int bookid = sc.nextInt();
	for( book b : library)
	{  	
	    if(b.id == bookid)
	    {
		b.returnbook();
		return;
	    }
	}


  	   System.out.println("Ivalid book id");
	}
     
  public static void displaybooks()
  {
	if(library.isEmpty())
	{
	 System.out.println(" No books available in the library ");
	 return;
	}
	System.out.println("/n library books");
	for(book b : library)
	{
	  System.out.println(b);
	}
 }  
}
     