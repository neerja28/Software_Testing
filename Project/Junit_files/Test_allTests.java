package printtokens;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class Test_allTests {
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hi All,The test begins now..!!");
	}

	
	@Test
	public void test_identifier1() {
		String id="//";
		boolean isKey  = corrected_printtokens.is_identifier(id);
        System.out.println(id);
        assertFalse(isKey);
        
		
	}
	
	@Test
	public void test_identifier2() {
		String id="W";
		boolean isKey  = corrected_printtokens.is_identifier(id);
        System.out.println(id);
        assertTrue(isKey);
        
		
	}
	@Test
	public void test_identifier3() {
		String id="h$";
		boolean isKey  = corrected_printtokens.is_identifier(id);
        System.out.println(id);
        assertFalse(isKey);
        
		
	}
	@Test
	public void test_identifier4() {
		String id="f4";
		boolean isKey  = corrected_printtokens.is_identifier(id);
        System.out.println(id);
        assertTrue(isKey);
        
		
	}
	@Test
	public void test_identifier5() {
		String id="ff4";
		boolean isKey  = corrected_printtokens.is_identifier(id);
        System.out.println(id);
        assertTrue(isKey);
        
		
	}
	@Test
	public void test_keyword_1() {
		String keyword="and";
		boolean isKey  = corrected_printtokens.is_keyword(keyword);
        System.out.println(keyword);
        assertTrue(isKey);
        
		
	}
	
	@Test
	public void test_keyword_2() {
		String keyword="lambda";
		boolean isKey  = corrected_printtokens.is_keyword(keyword);
        System.out.println(keyword);
        assertTrue(isKey);
        
		
	}
	
	@Test
	public void test_keyword_3() {
		String keyword="if";
		boolean isKey  = corrected_printtokens.is_keyword(keyword);
        System.out.println(keyword);
        assertTrue(isKey);
        		
	}
	
	@Test
	public void test_keyword_4() {
		String keyword="or";
		boolean isKey  = corrected_printtokens.is_keyword(keyword);
        System.out.println(keyword);
        assertTrue(isKey);
        		
	}
	
	@Test
	public void test_keyword_5() {
		String keyword="xor";
		boolean isKey  = corrected_printtokens.is_keyword(keyword);
        System.out.println(keyword);
        assertTrue(isKey);
        		
	}
	@Test
	public void test_keyword_6() {
		String keyword="=>";
		boolean isKey  = corrected_printtokens.is_keyword(keyword);
        System.out.println(keyword);
        assertTrue(isKey);
        		
	}
	@Test
	public void test_keyword_7() {
		String keyword=":and";
		boolean isKey  = corrected_printtokens.is_keyword(keyword);
        System.out.println(keyword);
        assertFalse(isKey);
        		
	}
	@Test
	public void test_comment1() {
		String comment=";Welcome to Software Testing Summer 2018";
		boolean isKey  = corrected_printtokens.is_comment(comment);
        System.out.println(comment);
        assertTrue(isKey);
        
		
	}
	
	@Test
	public void test_comment2() {
		String comment="!Welcome to Software Testing Summer 2018";
		boolean isKey  = corrected_printtokens.is_comment(comment);
        System.out.println(comment);
        assertFalse(isKey);
        
		
	}
	@Test
	public void test_character1() {
		String id="#sum";
		boolean isKey  = corrected_printtokens.is_char_constant(id);
        System.out.println(id);
        assertTrue(isKey);
        
		
	}
	
	@Test
	public void test_character2() {
		String id="$try";
		boolean isKey  = corrected_printtokens.is_char_constant(id);
        System.out.println(id);
        assertFalse(isKey);
        
		
	}
	@Test
	public void test_for_keyword_token() {
		String id="and";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(1,isKey);
        
		}
	
	@Test
	public void test_for_errors_token() {
		String id="?\"";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(0,isKey);
        
		
	}
	
	@Test
	public void test_for_spec_symbol_token() {
		String id="'('";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(2,isKey);
        
		
	}
	
	@Test
	public void test_for_is_identifier_token() {
		String id="W";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(3,isKey);
        
		
	}
	@Test
	public void test_for_is_num_constant_token() {
		String id="2";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(41,isKey);
        
		
	}
	@Test
	public void test_for_is_str_constant_token() {
		String id="\"Hello\"";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(42,isKey);
        
		
	}
	
	@Test
	public void test_for_is_char_constant_token() {
		String id="#Hello";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(43,isKey);
        
		
	}
	@Test
	public void test_for_is_comment_token() {
		String id=";Hello\"";
		int isKey  = corrected_printtokens.token_type(id);
        System.out.println(isKey);
        assertEquals(5,isKey);
        
		
	}
	@Test
	public void test_for_keyword_type() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id="and";
		corrected_printtokens.print_token(id);
        assertEquals("keyword,\"and\".\n",outContent.toString());
        
		}
	
	@Test
	public void test_for_errors_type() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id="?\"";
		corrected_printtokens.print_token(id);
        assertEquals("error,\"?\"\".\n",outContent.toString());
        
		}
	@Test
	public void test_for_spec_symbol() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id="(";
		corrected_printtokens.print_token(id);
        assertEquals("lparen.\n",outContent.toString());
        
		}
	
	@Test
	public void test_for_is_identifier() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id="W";
		corrected_printtokens.print_token(id);
        assertEquals("identifier,\"W\".\n",outContent.toString());
        
		}
	
	@Test
	public void test_for_is_num_constant() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id="2";
		corrected_printtokens.print_token(id);
        assertEquals("numeric,2.\n",outContent.toString());
        
		}
	@Test
	public void test_for_is_str_constant() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id="\"hello\"";
		corrected_printtokens.print_token(id);
        assertEquals("string,\"hello\".\n",outContent.toString());
        
		}
	@Test
	public void test_for_is_char_constant() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id="#hello";
		corrected_printtokens.print_token(id);
        assertEquals("character,\"h\".\n",outContent.toString());
        
		}
	@Test
	public void test_for_is_comment() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();         
        System.setOut(new PrintStream(outContent));
        String id=";hello";
		corrected_printtokens.print_token(id);
        assertEquals("comment,\";hello",outContent.toString());
        
		}
	
	@Test
    public void check_symbol_lparan(){
		char symbol = '(';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_rparan(){
		char symbol = ')';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_lsquare(){
		char symbol = '[';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_rsquare(){
		char symbol = ']';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_quote(){
		char symbol = '\'';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_bquote(){
		char symbol = '`';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_comma(){
		char symbol = ',';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_invalid(){
		char symbol = '+';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertFalse(is_Symbol);
    }
	
	@Test
    public void check_symbol_null_input(){
		char symbol='\0';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertFalse(is_Symbol);
    }
	
	@Test
    public void check_symbol_space(){
		char symbol = ' ';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertFalse(is_Symbol);
    }
	
	@Test
    public void printtest_symbol_lparan(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = "(";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("lparen.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_rparan(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = ")";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("rparen.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_lsquare(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = "[";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("lsquare.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_rsquare(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = "]";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("rsquare.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_quote(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = "\'";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("quote.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_bquote(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = "`";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("bquote.\n",outContent.toString());
    }

	@Test
    public void printtest_symbol_comma(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = ",";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("comma.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_others(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = "+";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("comma.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_null_input(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = "";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("comma.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_space(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        String symbol_val = " ";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("comma.\n",outContent.toString());
    }
	
	@Test
	public void test_num_positive() {
		String id="6";
		boolean isKey  = corrected_printtokens.is_num_constant(id);
        System.out.println(id);
        assertTrue(isKey);}
	
	@Test
	public void test_num_positive_three_digits() {
		String id="123";
		boolean isKey  = corrected_printtokens.is_num_constant(id);
        System.out.println(id);
        assertTrue(isKey);}
	
	@Test
	public void test_num_positive_null() {
		String id=" ";
		boolean isKey  = corrected_printtokens.is_num_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	@Test
	public void test_num_negative() {
		String id="A";
		boolean isKey  = corrected_printtokens.is_num_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	
	@Test
	public void test_num_negative_with_no_quotes() {
		String id="12*";
		boolean isKey  = corrected_printtokens.is_num_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	
	@Test
	public void test_string_positive() {
		String id="\"Hello\"";
		boolean isKey  = corrected_printtokens.is_str_constant(id);
        System.out.println(id);
        assertTrue(isKey);}
	
	@Test
	public void test_string_negative_with_no_quotes() {
		String id="Hello";
		boolean isKey  = corrected_printtokens.is_str_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	
	@Test
	public void test_string_negative_with_null_in_quotes() {
		String id="hello\0";
		boolean isKey  = corrected_printtokens.is_str_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	
	@Test
	public void test_string_negative_with_null_inputs() {
		String id="\\0";
		boolean isKey  = corrected_printtokens.is_str_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	
	@Test
	public void test_string_negative_with_digit_inputs() {
		String id="2";
		boolean isKey  = corrected_printtokens.is_str_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	
	@Test
	public void test_string_negative_with_null_variable_inputs() {
		String id=" ";
		boolean isKey  = corrected_printtokens.is_str_constant(id);
        System.out.println(id);
        assertFalse(isKey);}
	
	@Test
	public void test_string_negative_with_two_variable_inputs() {
		String id="\"Hello hey\"";
		boolean isKey  = corrected_printtokens.is_str_constant(id);
        System.out.println(id);
        assertTrue(isKey);}
	
	@Test
	public void test_open_character_stream_with_null_input() throws FileNotFoundException {
		corrected_printtokens t = new corrected_printtokens();
		BufferedReader br = null;
		br = t.open_character_stream(null);
		assertNotNull(br);
	}

	@Test
	public void test_open_character_stream() {
		corrected_printtokens t = new corrected_printtokens();
		BufferedReader br = null;
		br = t.open_character_stream("/Users/Karthik Padiyar/eclipse-workspace/st_project/src/printtokens/Untitled 1");
		assertNotNull(br);
	}
	
	@Test
	public void test_open_character_stream_with_empty_input() throws FileNotFoundException {
	corrected_printtokens t = new corrected_printtokens();
	BufferedReader br = null;
	br = t.open_character_stream("");
	assertNull(br);
	}
	
	@Test
    public void test_open_token_stream_with_null_input() throws FileNotFoundException {
                    corrected_printtokens t = new corrected_printtokens();
                    BufferedReader br = null;
                    br = t.open_token_stream("");
                    assertNotNull(br);
    }
   
    @Test
    public void test_open_token_stream_positive() {
                    corrected_printtokens t = new corrected_printtokens();
                    BufferedReader br = null;
                    br = t.open_token_stream("/Users/Karthik Padiyar/eclipse-workspace/st_project/src/printtokens/Untitled 1");
                    assertNotNull(br);
    }
    
    
    @Test
	public void test_get_token_positive()
	{
		BufferedReader br = null;
	    Reader input = null;
		corrected_printtokens t = new corrected_printtokens();

		input = new StringReader("abc");
		br = new BufferedReader(input);
		assertEquals("abc", t.get_token(br).toString());

		input = new StringReader("");
		br  = new BufferedReader(input);
		assertEquals(null, t.get_token(br));

		input = new StringReader(" ");
		br = new BufferedReader(input);
		assertEquals(null, t.get_token(br));

		input = new StringReader("\n");
		br = new BufferedReader(input);
		assertEquals(null, t.get_token(br));

		input = new StringReader("\r");
		br = new BufferedReader(input);
		assertEquals(null, t.get_token(br));

		input = new StringReader(" z");
		br = new BufferedReader(input);
		assertEquals("z", t.get_token(br).toString());

		input = new StringReader("n");
		br = new BufferedReader(input);
		assertEquals("n", t.get_token(br).toString());

		input = new StringReader("\"n\"");
		br = new BufferedReader(input);
		assertEquals("\"n\"", t.get_token(br).toString());

		input = new StringReader(",");
		br = new BufferedReader(input);
		assertEquals(",", t.get_token(br).toString());

		 input = new StringReader("\0");
         br = new BufferedReader(input);
         assertEquals("\0", t.get_token(br));
        
         input = new StringReader("a\'");
         br = new BufferedReader(input);
         assertEquals("a", t.get_token(br).toString());
        
         input = new StringReader("comment;");
         br = new BufferedReader(input);
         assertEquals("comment", t.get_token(br).toString());
        
         input = new StringReader("comment\"");
         br = new BufferedReader(input);
         assertEquals("comment\"", t.get_token(br).toString());
        
         input = new StringReader(";comment");
         br = new BufferedReader(input);
         assertEquals(";comment", t.get_token(br).toString());
        
         input = new StringReader("try,");
         br = new BufferedReader(input);
         assertEquals("try", t.get_token(br).toString());
        
         input = new StringReader("   ;");
         br = new BufferedReader(input);
         assertEquals(";", t.get_token(br));
         

         input = new StringReader("\"abc\"");
         br = new BufferedReader(input);
         assertEquals("\"abc\"", t.get_token(br));
         
         input = new StringReader(";");
         br = new BufferedReader(input);
         assertEquals(";", t.get_token(br));}
    
    @Test
    
	public void test_is_token_end_positive_cases()
	{
    	int id, res;

    	// For String token and invalid input
    	id = 1;
    	res = -1;
    	assertTrue(corrected_printtokens.is_token_end(id, res));
    	
//    	For String token and "
    	id = 1;
    	res = 34;
    	assertTrue(corrected_printtokens.is_token_end(id, res));
//    	For string token and alphabet N
    	id = 1;
    	res = 78;
    	assertEquals(false,corrected_printtokens.is_token_end(id, res));
//    	For string token and \n
    	id = 1;
    	res = 10;
    	assertTrue(corrected_printtokens.is_token_end(id, res));
//    	For string token and \r
    	id = 1;
    	res = 13;
    	assertTrue(corrected_printtokens.is_token_end(id, res));
    	// For comment token and \n

    	id = 2;
    	res = 10;
    	assertTrue(corrected_printtokens.is_token_end(id, res));

    // For comment token and \r
    	id = 2;
    	res = 13;
    	assertTrue(corrected_printtokens.is_token_end(id, res));
    	// For comment token and  space
    	id = 2;
    	res = 32;
    	assertTrue(corrected_printtokens.is_token_end(id, res));

    // For comment token and  invalid input

    	id = 2;
    	res = -1;
    	assertTrue(corrected_printtokens.is_token_end(id, res));

    // For comment token and alphabet N
    	id = 2;
    	res = 78;
    	assertEquals(false,corrected_printtokens.is_token_end(id, res));
    	// For spec symbol and ]

    	id = 0;
    	res = 93;
    	assertTrue(corrected_printtokens.is_token_end(id, res));

    // For spec symbol and space
    	id = 0;
    	res = 32;
    	assertTrue(corrected_printtokens.is_token_end(id, res));

    	// For spec symbol and \r

    	id = 0;
    	res = 13;
    	assertTrue(corrected_printtokens.is_token_end(id, res));

    	// For spec symbol and comment

    	id = 0;
    	res = 59;
    	assertTrue(corrected_printtokens.is_token_end(id, res));


    // For spec symbol and 	alphabet N
    	id = 0;
    	res = 78;
    	assertEquals(false,corrected_printtokens.is_token_end(id, res));
	}

		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Hi All,The test ends successfully..!!");
	
	}

}
