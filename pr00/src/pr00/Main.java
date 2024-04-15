package pr00;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;

public class Main {

	/**
	 * @throws IOException
	 */
	Main() throws IOException {
		Machine[] machines1 = new Machine[5];

		machines1[0] = new Machine("a", "a", "a", "a", "3", "1", new MAttribute("a", "a", "a", "a"));
		machines1[1] = new Machine("a", "a", "a", "a", "3", "2", new MAttribute("a", "a", "a", "a"));
		machines1[2] = new Machine("a", "a", "a", "a", "4", "3", new MAttribute("a", "a", "a", "a"));
		machines1[3] = new Machine("a", "a", "a", "a", "5", "4", new MAttribute("a", "a", "a", "a"));
		machines1[4] = new Machine("a", "a", "a", "a", "6", "5", new MAttribute("a", "a", "a", "a"));

		
		ProposalPresentationForm form1 = new ProposalPresentationForm(former1, seller1, machines1);
		try {
			XWPFDocument document1 = new XWPFDocument();
			
			XWPFParagraph paragraph1 = document1.createParagraph();
			XWPFParagraph paragraph2 = document1.createParagraph();
			XWPFParagraph paragraph3 = document1.createParagraph();
			XWPFParagraph paragraph4 = document1.createParagraph();
			XWPFParagraph paragraph5 = document1.createParagraph();
			XWPFParagraph paragraph6 = document1.createParagraph();
			XWPFParagraph paragraph7 = document1.createParagraph();
			
			XWPFRun run1 = paragraph1.createRun();
			run1.setText(form1.getFormercorp().getCorpName());	
			run1.addBreak();
			
			XWPFRun run2 = paragraph2.createRun();
			run2.setBold(true);			
			run2.setText("Makina-Ekipman İçin Teklif Sunum Formu");
			
			XWPFRun run3 = paragraph3.createRun();
			run3.setText("Tarih 28 Şubat 2022");//add calendar methods
			
			XWPFRun run4 = paragraph4.createRun();
			printcorp(run4, seller1, 0);
			run4.setFontSize(14);

			XWPFRun run5 = paragraph5.createRun();
			printcorp(run5, former1, 0);
			run5.setFontSize(14);
			
			XWPFRun run6 = paragraph6.createRun();
			run6.setText("KIRSALA YATIRIMLA ÜRETİME DESTEK PROJESİ yatırımı kapsamında 4 Ocak 2022 tarihli teklif davet mektubunuz ile istemiş olduğunuz Makine-ekipman alımına ilişkin fiyet teklifimiz.");
			
			XWPFRun run7a = paragraph7.createRun();
			
			XWPFRun run7b1a = paragraph7.createRun();
			XWPFRun run7b1b = paragraph7.createRun();
			
			XWPFRun run7b2a = paragraph7.createRun();
			XWPFRun run7b2b = paragraph7.createRun();
			
			XWPFRun run7b3a = paragraph7.createRun();
			XWPFRun run7b3b = paragraph7.createRun();
			
			XWPFRun run7b4a = paragraph7.createRun();
			XWPFRun run7b4b = paragraph7.createRun();
			
			XWPFRun run7b5a = paragraph7.createRun();
			XWPFRun run7b5b = paragraph7.createRun();
			
			XWPFRun run7b6a = paragraph7.createRun();
			XWPFRun run7b6b = paragraph7.createRun();
			
			run7a.setText("EKLER:");
			run7a.setBold(true);
			run7a.setUnderline(UnderlinePatterns.SINGLE);
			run7a.addBreak();
			
			run7b1a.setText("1.");
			run7b1b.setText("Teklif fiyatları");
			run7b1b.addBreak();

			run7b2a.setText("2.");
			run7b2b.setText("Teklife ilişkin Beyanlar ve Taahhütler");
			run7b2b.addBreak();
			
			run7b3a.setText("3.");
			run7b3b.setText("Teklif davet mektubunun imzalanmış fotokopisi");
			run7b3b.addBreak();
			
			run7b4a.setText("4.");
			run7b4b.setText("Teknik şartnamenin imzalanmış fotokopisi");
			run7b4b.addBreak();
			
			run7b5a.setText("5.");
			run7b5b.setText("Ortaklık belgesi");
			run7b5b.addBreak();
			
			run7b6a.setText("6.");
			run7b6b.setText("Faaliyet belgesi");
			
			
			paragraph1.setAlignment(ParagraphAlignment.CENTER);
       
		//	printcorp(document1, form1.getSellercorp(), 0);
		//	printcorp(document1, form1.getFormercorp(), 0);
        //
		//	XWPFTable Table1 = document1.createTable(form1.getMachines().length + 1, 9);
		//	XWPFTableRow[] tableRows = new XWPFTableRow[form1.getMachines().length + 1];
		//	tableRows[0] = Table1.getRow(0);
		//	tableRows[0].getCell(0).setText("NO");
		//	tableRows[0].getCell(1).setText("MAKİNE-EKİPMAN ADI");
		//	tableRows[0].getCell(2).setText("TEKNİK ÖZELLİKLER");
		//	tableRows[0].getCell(3).setText("MARKA MODEL");
		//	tableRows[0].getCell(4).setText("MENŞEİ");
		//	tableRows[0].getCell(5).setText("BİRİM");
		//	tableRows[0].getCell(6).setText("MİKTAR");
		//	tableRows[0].getCell(7).setText("BİRİM FİYARI");
		//	tableRows[0].getCell(8).setText("TOPLAM FİYATI");
		//	for (int i = 0; i < tableRows.length - 1; i++) {
		//		tableRows[i + 1] = Table1.getRow(i+1);
		//		tableRows[i + 1].getCell(0).setText("" + (i + 1));
		//		tableRows[i + 1].getCell(1).setText(form1.getMachines()[i].getName());
		//		tableRows[i + 1].getCell(2).setText(form1.getMachines()[i].getAttributes().getCapacity());// Add an method in atribute class to take string																													
		//		tableRows[i + 1].getCell(3).setText(form1.getMachines()[i].getModel());
		//		tableRows[i + 1].getCell(4).setText(form1.getMachines()[i].getOrigin());
		//		tableRows[i + 1].getCell(5).setText(form1.getMachines()[i].getUnit());
		//		tableRows[i + 1].getCell(6).setText(form1.getMachines()[i].getQuantity());
		//		tableRows[i + 1].getCell(7).setText(form1.getMachines()[i].getUnitprice());
		//		tableRows[i + 1].getCell(8).setText("" + (Integer.parseInt(form1.getMachines()[i].getUnitprice())* (Integer.parseInt(form1.getMachines()[i].getQuantity()))));
		//	}
		//		
		//	XWPFTableRow lastRow = Table1.createRow();
		//	
		//	lastRow.removeCell(8);
		//	lastRow.removeCell(7);
		//	lastRow.removeCell(6);
		//	lastRow.removeCell(5);
		//	lastRow.removeCell(4);
		//	lastRow.removeCell(3);
		//	lastRow.removeCell(2);
		//	
		//	int sum=0;
		//	
		//	for(int i=0;i<tableRows.length - 1; i++) 
		//	{
		//		sum+=(Integer.parseInt(form1.getMachines()[i].getUnitprice())* (Integer.parseInt(form1.getMachines()[i].getQuantity())));
		//	}
        //
		//        CTTc ctTc = lastRow.getCell(0).getCTTc();
		//        CTTcPr ctTcPr = ctTc.addNewTcPr();
		//        CTDecimalNumber ctDecimalNumber = ctTcPr.addNewGridSpan();
		//        ctDecimalNumber.setVal(BigInteger.valueOf(7));
		//        
		//        CTTc ctTc1 = lastRow.getCell(1).getCTTc();
		//        CTTcPr ctTcPr1 = ctTc1.addNewTcPr();
		//        CTDecimalNumber ctDecimalNumber1 = ctTcPr1.addNewGridSpan();
		//        ctDecimalNumber1.setVal(BigInteger.valueOf(2));
        //
		//        lastRow.getCell(0).setText("TOPLAM");
		//        lastRow.getCell(1).setText(""+sum);
		
			
		
	        
			FileOutputStream out ;;// dirpath change before use																													
			
			for(int i=1;i<4;i++) 
			{
				out =  new FileOutputStream("C:\\Users\\emin\\Desktop\\verbose-disco-out\\"+"yuklenici"+i+".docx");
				document1.write(out);
				
				
			}
		out = new FileOutputStream("C:\\Users\\emin\\Desktop\\verbose-disco-out\\output.docx");
			out.close();
			document1.close();

			System.out.println("document  creation succeed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void printcorp(XWPFRun run1, Corp input,int paramether) 
	{
		

		
		switch (paramether) {
		case 0:
			if(input.getCorpName()!=null)
			{
			run1.addBreak();
			run1.setText("TİCARİ ÜNVANI-");
			run1.setText(input.getCorpName());
			}
			if(input.getTaxNum()!=null) 
			{
			run1.addBreak();
			run1.setText("VERGİ NO-");
			run1.setText(input.getTaxNum());
			}
			if(input.getTaxNum()!=null) 
			{
			run1.addBreak();
			run1.setText("VERGİ DAİRESİ ADI-");
			run1.setText(input.getTaxCenterName());
			}
			if(input.getAdress().allAdress()!=null) 
			{
			run1.addBreak();
			run1.setText("ADRESİ-");
			run1.setText(input.getAdress().allAdress());
			}
			if(input.getPhonenum()!=null) 
			{
			run1.addBreak();
			run1.setText("TELEFON-");
			run1.setText(input.getPhonenum());
			}
			if(input.getFaxnum()!=null) 
			{
			run1.addBreak();
			run1.setText("FAKS-");
			run1.setText(input.getFaxnum());
			}
			if(input.getEmail()!=null) 
			{
			run1.addBreak();
			run1.setText("E POSTA");
			run1.setText(input.getEmail());
			}
			run1.setFontSize(15);
			
			break;

		default:
			break;
		}
		
		
		
		
	
	}

}
