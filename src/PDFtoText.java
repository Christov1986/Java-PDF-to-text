import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFtoText {
	public static void main(String args[]) throws IOException {

	      //Loading PDF document
	      File file = new File("/home/christov/GitHub/Java-PDF-to-text/src/atc.pdf");
	      PDDocument document = PDDocument.load(file);

	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();

	      //Retrieving text from PDF document
	      String text = pdfStripper.getText(document);
	      
	      //Instatiate new PrintWriter and write the text to file
	      PrintWriter write = new PrintWriter("PDF_text.txt", "UTF-8");
	      write.print(text);

	      //Closing the document and writer
	      document.close();
	      write.close();

	   }
}
