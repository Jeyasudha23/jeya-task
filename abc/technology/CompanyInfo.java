package abc.technology;

public class CompanyInfo {
//method creation
	public void companyName() {
		System.out.println("ABC Techno Pvt Ltd");
	}
	public void companyId() {
		System.out.println("x y z");
	}
	public void companyAddress() {
		System.out.println("1/22 PQR colony");
	}
	
	//main method creation
	public static void main(String []args) {
		//object creation
		CompanyInfo efg = new CompanyInfo();
		efg.companyName();
		efg.companyId();
		efg.companyAddress();
		}
}
