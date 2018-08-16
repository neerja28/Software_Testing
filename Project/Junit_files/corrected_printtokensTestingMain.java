import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//@RunWith(Parameterized.class)
class corrected_printtokensTestingMain {

    /*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}*/
	/*public corrected_printtokensTestingMain(String input){
        this.args = input;
    }

	@Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {""},
                {"", "L"},
                {}
        });
    }*/
    
   /* @AfterClass
	static void tearDownAfterClass() throws Exception {
	}*/

    @Test
	void test_args_length_zero() throws IOException {
		String[] args = {};
	    final InputStream original = System.in;
	    final FileInputStream fips = new FileInputStream(new File("C:\\UTA\\Summer 18\\2185-CSE-5321-001-SOFTWARE-TESTING--2018-Summer\\Project\\inputs.txt"));
//	    final FileInputStream fips = new FileInputStream(new File("DataMain.txt"));
	    
	   /* File file = new File("C:\\UTA\\Summer 18\\2185-CSE-5321-001-SOFTWARE-TESTING--2018-Summer\\Project\\out.txt"); //Your file
	    FileOutputStream fos = new FileOutputStream(file);
	    PrintStream ps = new PrintStream(fos);
	    System.setOut(ps);*/
	    
	    System.setIn(fips);
	    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
	    
	    corrected_printtokens.main(args);
	    System.setIn(original);
	    assertEquals("error,\"//\".\n" + 
	    		"identifier,\"W\".\n" + 
	    		"error,\"h$\".\n" + 
	    		"identifier,\"f4\".\n" + 
	    		"identifier,\"ff4\".\n" + 
	    		"keyword,\"and\".\n" + 
	    		"keyword,\"lambda\".\n" + 
	    		"keyword,\"if\".\n" + 
	    		"keyword,\"or\".\n" + 
	    		"keyword,\"xor\".\n" + 
	    		"keyword,\"=>\".\n" + 
	    		"error,\":and\".\n" + 
	    		"error,\"!Welcome\".\n" + 
	    		"identifier,\"to\".\n" + 
	    		"identifier,\"Software\".\n" + 
	    		"identifier,\"Testing\".\n" + 
	    		"identifier,\"Summer\".\n" + 
	    		"numeric,2018.\n" + 
	    		"character,\"s\".\n" + 
	    		"error,\"$try\".\n" + 
	    		"keyword,\"and\".\n" + 
	    		"error,\"?\\\"\".\n" + 
	    		"quote.\n" + 
	    		"lparen.\n" + 
	    		"quote.\n" + 
	    		"identifier,\"W\".\n" + 
	    		"numeric,2.\n" + 
	    		"error,\"\\\"Hello\\\"\"\".\n" + 
	    		"character,\"H\".\n" + 
	    		"comment,;Hello\\\"\n" + 
	    		"error,\"\"\".\n" + 
	    		"keyword,\"and\".\n" + 
	    		"error,\"?\\\"\"\".\n" + 
	    		"lparen.\n" + 
	    		"identifier,\"W\".\n" + 
	    		"numeric,2.\n" + 
	    		"error,\"\\\"hello\\\"\"\".\n" + 
	    		"character,\"h\".\n" +  
	    		"lparen.\n" + 
	    		"rparen.\n" + 
	    		"lsquare.\n" + 
	    		"rsquare.\n" + 
	    		"error,\"\\\".\n" + 
	    		"quote.\n" + 
	    		"bquote.\n" + 
	    		"comma.\n" + 
	    		"error,\"+\".\n" + 
	    		"error,\"\\0\".\n" + 
	    		"lparen.\n" + 
	    		"rparen.\n" + 
	    		"lsquare.\n" + 
	    		"rsquare.\n" + 
	    		"error,\"\\\".\n" + 
	    		"quote.\n" + 
	    		"bquote.\n" + 
	    		"comma.\n" + 
	    		"error,\"+\".\n" + 
	    		"numeric,6.\n" + 
	    		"numeric,123.\n" + 
	    		"identifier,\"A\".\n" + 
	    		"error,\"12*\".\n" + 
	    		"string,\"Hello\".\n" + 
	    		"identifier,\"Hello\".\n" + 
	    		"error,\"hello\\0\".\n" + 
	    		"error,\"\\\\0\".\n" + 
	    		"numeric,2.\n" + 
	    		"error,\"\"Hello\".\n" + 
	    		"error,\"hey\"\".\n",outContent.toString());
	}
	
	@Test
	void test_args_length_one() throws IOException {
		String[] args = {""};
	    final InputStream original = System.in;
	    final FileInputStream fips = new FileInputStream(new File("C:\\UTA\\Summer 18\\2185-CSE-5321-001-SOFTWARE-TESTING--2018-Summer\\Project\\inputs.txt"));
	    System.setIn(fips);
	    
	    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
	    
	    corrected_printtokens.main(args);
	    System.setIn(original);
	    assertEquals("error,\"//\".\n" + 
	    		"identifier,\"W\".\n" + 
	    		"error,\"h$\".\n" + 
	    		"identifier,\"f4\".\n" + 
	    		"identifier,\"ff4\".\n" + 
	    		"keyword,\"and\".\n" + 
	    		"keyword,\"lambda\".\n" + 
	    		"keyword,\"if\".\n" + 
	    		"keyword,\"or\".\n" + 
	    		"keyword,\"xor\".\n" + 
	    		"keyword,\"=>\".\n" + 
	    		"error,\":and\".\n" + 
	    		"error,\"!Welcome\".\n" + 
	    		"identifier,\"to\".\n" + 
	    		"identifier,\"Software\".\n" + 
	    		"identifier,\"Testing\".\n" + 
	    		"identifier,\"Summer\".\n" + 
	    		"numeric,2018.\n" + 
	    		"character,\"s\".\n" + 
	    		"error,\"$try\".\n" + 
	    		"keyword,\"and\".\n" + 
	    		"error,\"?\\\"\".\n" + 
	    		"quote.\n" + 
	    		"lparen.\n" + 
	    		"quote.\n" + 
	    		"identifier,\"W\".\n" + 
	    		"numeric,2.\n" + 
	    		"error,\"\\\"Hello\\\"\"\".\n" + 
	    		"character,\"H\".\n" + 
	    		"comment,;Hello\\\"\n" + 
	    		"error,\"\"\".\n" + 
	    		"keyword,\"and\".\n" + 
	    		"error,\"?\\\"\"\".\n" + 
	    		"lparen.\n" + 
	    		"identifier,\"W\".\n" + 
	    		"numeric,2.\n" + 
	    		"error,\"\\\"hello\\\"\"\".\n" + 
	    		"character,\"h\".\n" +  
	    		"lparen.\n" + 
	    		"rparen.\n" + 
	    		"lsquare.\n" + 
	    		"rsquare.\n" + 
	    		"error,\"\\\".\n" + 
	    		"quote.\n" + 
	    		"bquote.\n" + 
	    		"comma.\n" + 
	    		"error,\"+\".\n" + 
	    		"error,\"\\0\".\n" + 
	    		"lparen.\n" + 
	    		"rparen.\n" + 
	    		"lsquare.\n" + 
	    		"rsquare.\n" + 
	    		"error,\"\\\".\n" + 
	    		"quote.\n" + 
	    		"bquote.\n" + 
	    		"comma.\n" + 
	    		"error,\"+\".\n" + 
	    		"numeric,6.\n" + 
	    		"numeric,123.\n" + 
	    		"identifier,\"A\".\n" + 
	    		"error,\"12*\".\n" + 
	    		"string,\"Hello\".\n" + 
	    		"identifier,\"Hello\".\n" + 
	    		"error,\"hello\\0\".\n" + 
	    		"error,\"\\\\0\".\n" + 
	    		"numeric,2.\n" + 
	    		"error,\"\"Hello\".\n" + 
	    		"error,\"hey\"\".\n",outContent.toString());
	}
	
	@Test
	void test_args_length_morethanone() throws IOException {
		String[] args = {"", "new"};
	    final InputStream original = System.in;
	    final FileInputStream fips = new FileInputStream(new File("C:\\UTA\\Summer 18\\2185-CSE-5321-001-SOFTWARE-TESTING--2018-Summer\\Project\\inputs.txt"));
	    System.setIn(fips);
	    
	    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
	    
        corrected_printtokens.main(args);
	    System.setIn(original);
	    assertEquals("Error!,please give the token stream\n",outContent.toString());
	}

}
