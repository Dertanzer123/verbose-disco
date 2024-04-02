package pr00;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


public class Main {
  
	
	Main() throws IOException
	{ try {
		XWPFDocument document1=new XWPFDocument();
		XWPFParagraph paragraph1=document1.createParagraph();
		
		
		
		
		
		XWPFRun run1=paragraph1.createRun();
		
		
		
		run1.addBreak();
		run1.addBreak();
		run1.addBreak();
		run1.setText("Project ROPOLIMPICS");
		run1.setFontSize(25);
		paragraph1.setAlignment(ParagraphAlignment.CENTER);
		
		
		
		document1.write(out);
		out.close();
		document1.close();
		
		System.out.println("document  creation succeed");
		
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}

	
	
	
	
	
}
