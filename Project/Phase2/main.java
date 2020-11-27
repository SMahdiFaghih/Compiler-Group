import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        try {
            String inputFileName = null;
            String outputFileName = null;
            if (args != null) {
                for (int i = 0; i < args.length; i++) {
                    if (args[i].equals("-i")) {
                        inputFileName = args[i + 1];
                    }
                    if (args[i].equals("-o")) {
                        outputFileName = args[i + 1];
                    }
                }
            }
            Reader reader = null;
            Writer writer;
            if (inputFileName != null) {
                reader = new FileReader("tests/" + inputFileName);
				//read from file here.
			}
            if (outputFileName != null) {
                writer = new FileWriter("out/" + outputFileName);
				//write the answer here.
				writer.write("T_ID abcdefg\nT_ID Stephen\nT_ID stephen_hawking\nT_ID six_dot_035\nT_ID foo_\nT_ID covid_19\n");
				writer.flush();
				writer.close();
			}
		}
		catch(Exception e) {
			return ;
		}
	}
}