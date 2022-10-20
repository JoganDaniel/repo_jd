package hashmapmvc;

public class Usermodel {
	int id;
	String name;
	int age;
	char gender;
	String city;
	Usermodel(int id,String name,int age,char gender,String city)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.city=city;
	}
	public void setid(int id) {
		this.id=id;}
	public void setname(String name) {
		this.name=name;}
	public void setage(int age) {
		this.age=age;}
	public void setgender(char gender) {
		this.gender=gender;}
	public void setcity(String city) {
		this.city=city;}
	
	public int getid() {
		return this.id;}
	public String getname() {
		return this.name;}
	public int getage() {
		return this.age;}
	public char getgender() {
		return this.gender;}
	public String getcity() {
		return this.city;}

	
}
