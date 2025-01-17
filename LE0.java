public class Main{
        
    int age;
    String name;
    
    void setAge(int age){
        this.age = age;
    }
    
    int getAge(){
        return this.age;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
	public static void main(String[] args) {
		
		Main m1 = new Main();
		m1.setName("Manoj Kumar");
		m1.setAge(20);
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
		
	}
}
