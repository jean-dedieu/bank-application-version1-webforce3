package com.webforce.poo2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank soge = new Bank("SOGE","LOGO-SOGE","42 boulevar Nelson Mandela 38100","007865454","FR76",35000,"SOGEBICCFF",45660006,new Customer("Durand","Eric","durand@gmail.com","monpass","078951656","1 Rue Barack Obama",42,'M',2000.45));
		Customer customer1 = new Customer("Durand","Eric","durand@gmail.com","monpass","078951656","1 Rue Barack Obama",42,'M',2000.45);
    
		//Account accountDurand = new Account("SOGE","LOGO-SOGE","1 rue","0454556","FR",3500"SOGEBICCFF",4566)
		//String account1 = soge.getName()+""+""+soge.getBankIdentifier()+""+soge.getOfficeCode();
	   //System.out.println(soge.customer.getGender());
	   //System.out.println(customerDurand.getAddress());
	   //System.out.println(accountDurand);
	   Account account1= new Account(soge,customer1);
	  // String bankName = soge.getName();
	   
	   Rib rib1 = new Rib(account1);
	 
	   StringBuffer str1 = new StringBuffer("--------------------------");
	   System.out.println(soge.getName() + " "+ soge.getOfficeCode() +" " +soge.getAddress());
	   System.out.println(str1 +"\n");
	   System.out.println(soge.customer.getGender() + " "+soge.customer.getFirstName() + " "+ soge.customer.getLastName());
	   System.out.println(str1);
	   System.out.println("IBAN " + account1.bank.getCountryIdentifier()+" "+""+account1.bank.getBankIdentifier() +""+ account1.bank.getOfficeCode());
	   System.out.println(str1);
	   System.out.println(account1.bank.getSwiftCode());
	   
	
	}
	

}
