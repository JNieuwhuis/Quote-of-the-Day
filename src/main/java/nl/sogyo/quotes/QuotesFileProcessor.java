package nl.sogyo.quotes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class QuotesFileProcessor {
	
	private int quoteNumber;
	private String author;
	private String quote;
	private String finalString;
	DatePrinter datePrinter;

	public QuotesFileProcessor(String filename) {
	
		datePrinter = new DatePrinter();
		quoteNumber = datePrinter.getToBePrintedLine();
		
		try {
			this.processFile(this.getFile(filename));
		} catch (IOException ioe) {
			System.out.println("Error reading file '" + filename + "'!");
		}
	}
	
	private File getFile(String filename) {
		
		ClassLoader classLoader = this.getClass().getClassLoader();
		File file = new File(classLoader.getResource(filename).getFile());
		
		return file;
	}
	
	private void processFile(File file) throws IOException {
		
		Scanner scanner = new Scanner(file);
		int lineNumber = 0;
		
		while (scanner.hasNextLine()) {
			if (lineNumber == quoteNumber) {
				String line = scanner.nextLine();
				getAuthorFromLine(line);
				getQuoteFromLine(line);
				printQuote();
		} else{
			scanner.nextLine();
		}
		lineNumber++;
		}
	
		scanner.close();
	}
	
	private String getAuthorFromLine(String line) {
		
		this.author = line.substring(0, line.indexOf(','));
		this.author = (this.author.substring(0,1).toUpperCase() + this.author.substring(1).toLowerCase());
		
		return this.author;
	}

	private String getQuoteFromLine(String line) {
		
		this.quote = line.substring(line.indexOf(',')+2);
		this.quote = (this.quote.substring(0,1).toUpperCase() + this.quote.substring(1).toLowerCase());
		
		if (!(this.quote.charAt(this.quote.length()-1) == '!' || this.quote.charAt(this.quote.length()-1) == '.'))	{
			this.quote = this.quote + ".";
		}
		return this.quote;
	}

	private void printQuote(){
		
		this.finalString = "Quote for ";
		this.finalString += datePrinter.getDateString();
		this.finalString += '\n';
		this.finalString += this.author;
		this.finalString += " -- ";
		this.finalString += "\"" + this.quote + "\"";
		
		System.out.println(this.finalString);
	}

}