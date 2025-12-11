package M2_Activity4;

public class M2_Activity4 {

	public static void main(String[] args) {
		MSExcel myExcel = new MSExcel();
		MSWord myWord = new MSWord();
		
		runProgram(myExcel);
		runProgram(myWord);
		
		stopProgram(myExcel);
		stopProgram(myWord);
	}
	
	private static void runProgram(Executable executableProgram) {
		executableProgram.run();
	}
	
	private static void stopProgram(Executable executableProgram) {
		executableProgram.stop();
	}

}
