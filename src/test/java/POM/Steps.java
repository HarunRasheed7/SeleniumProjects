package POM;

public class Steps extends CommonActions{
	
	public static void main(String[] args) {
		launch();
		POM p=new POM();
		insertText(p.getSearch(),"iphone");
		clickk(p.getButton());
		clickk(p.getPhone());
		window();
		getText(p.getTitle());
		
	}

}
