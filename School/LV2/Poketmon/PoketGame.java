public class Game {
	public static void main(String[] args) {
		  	int num;
		  	
		  
			Poketmon p1 = new Poketmon();
			p1 = new Poketmon();
			
	        p1.name = "고라파덕";
	       
	        System.out.println(p1.name+"의 레벨은: "+p1.level);
	        System.out.println("레벨업!!!!");
	       
	        p1.레벨업();
	        System.out.println(p1.name+"의 레벨은: "+p1.level);
	}
}
