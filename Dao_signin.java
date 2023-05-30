package hib_signin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao_signin extends validation_signin{
public static void main(String[] args) {
		boolean q=true;
		validation_signin s1=new validation_signin();
		Dto_signin s=new Dto_signin();
		System.out.println("1.enter the name 2.enter the mobile_no 3.enter the gender 4.enter the password 5.enter the Dob 6.enter the age 7.enter the gmail 8.enter the Alt_gmail 9.enter the Alt_mblno");
		while (q) {
			String f=sc.next();
			switch (f) {
			case "1":
				System.out.println("enter the name");
				s1.validateName(sc.next()); 
				String name12= s.getName();
				System.out.println("2.for mobile_no 3.for gender 4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gamil 9.for Alt_mblno");
				break;
			case "2":
				System.out.println("enter the mobile_no");
				s1.validateMobile_no(sc.nextLong()); 
				long mblno1= s.getMobile_no();
				System.out.println("3.for gender 4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
				break;
			case "3":
//				System.out.println("choose the gender");
//				System.out.println("select the gender");
//				System.out.println("click a.for MALE");
//				System.out.println("click b.for FEMALE");
//				System.out.println("click c.for OTHERS");
				System.out.println("enter the gender");
				s1.validateGender(sc.next()); 
				//String gender1= s.getGender();
				System.out.println("4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
				break;
			case "4":
				System.out.println("enter the password");
				s1.validatePassword(sc.next()); 
				String password1= s.getPassword();
				System.out.println("5.for Dob 6.for age 7.for gamil 8.for Alt_gmail 9.for Alt_mblno");
				break;
			case "5":
				System.out.println("enter the Dob");
				s1.validateDob(sc.next()); 
				String dob1= s.getDob();
				System.out.println("6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
				break;
			case "6":
				System.out.println("enter the Age");
				s1.validateAge(sc.nextInt()); 
				int age1= s.getAge();
				System.out.println("7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
				break;
			case "7":
				System.out.println("enter the gmail");
				s1.validateGmail(sc.next()); 
				String gmail1= s.getGmail();
				System.out.println("8.for Alt_gmail 9.for Alt_mblno");
				break;
			case "8":
				System.out.println("enter the Alt_gmail");
				s1.validateAlternate_gmail(sc.next()); 
				String alt_gmail1= s.getAlternate_gmail();
				System.out.println("9.for Alt_mblno");
				break;
			case "9":
				System.out.println("enter the Alt_mblno");
				s1.validateAlternate_mobileno(sc.nextLong()); 
				long alt_mblno1= s.getAlternate_mobileno();
				q=false;
			default:
				System.out.println("choose correct one");
			}
		}
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Dto_signin s3=new Dto_signin();
		s3.setName(sign1.getName());
		s3.setMobile_no(sign1.getMobile_no());
		s3.setGender(sign1.getGender());
		s3.setPassword(sign1.getPassword());
		s3.setDob(sign1.getDob());
		s3.setAge(sign1.getAge());
		s3.setGmail(sign1.getGmail());
		s3.setAlternate_gmail(sign1.getAlternate_gmail());
		s3.setAlternate_mobileno(sign1.getAlternate_mobileno());
		et.begin();
		em.persist(s3);
		et.commit();
		

}
}
