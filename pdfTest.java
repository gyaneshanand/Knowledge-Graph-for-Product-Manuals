import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class pdfTest
{
    public static void main(String[] args) throws IOException {
        
        File file = new File("./User Manual Philips MP50.pdf");
        PDDocument document = PDDocument.load(file);

        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);

        try (PrintWriter out = new PrintWriter("manual1.txt")) {
            out.println(text);
        }
        document.close();
    }
}
