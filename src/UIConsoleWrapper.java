import java.io.PrintWriter;

public class UIConsoleWrapper implements OutputInterface{
	private PrintWriter out;
	
	
	
	public UIConsoleWrapper(PrintWriter out) {
		this.out = out;
	}



	@Override
	public void output(OutputData outData) {
		out.println("Result: " + 
	outData.result);
		out.flush();
	}

}
