package LibraryManagementSystem;

public class Main {

	public static void main(String[] args) {
		LibraryItem l= new LibraryItem();
		l.displayInfo(01, "Book");
		LibraryItem l1= new LibraryItem();
		l1.displayInfo(02, "DVD");
		
		Book b=new Book();
		b.displayInfo(01,"Harry Potter","JK Rowling");
		DVD d=new DVD();
		d.displayInfo(02,"Songs","30 mins");
		
		LibraryMember student = new StudentMember(001,"Jaff","Harry Potter");
		LibraryMember faculty =new FacultyMember(1,"Prof.Sona","Songs");
		
		student.borrowItem(b);
        ((Reservable) faculty).reserveItem(b);
        faculty.borrowItem(d);

	}

}
