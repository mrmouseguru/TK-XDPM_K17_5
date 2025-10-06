import java.io.PrintWriter;
import java.util.Scanner;

public class AppNhan2So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		//InputInterface inWrapper = new UIConsole(sc, pw);
		InputInterface inWrapper = new GUI();
		OutputInterface outWrappter = new UIConsoleWrapper(pw);
		                      // dependency injection
		Nhan2So nhan2So = new Nhan2So();
		
		Nhan2SoUseCaseControl control = 
				new Nhan2SoUseCaseControl(inWrapper, outWrappter, nhan2So);
		control.execute();
	}
	
	

}
