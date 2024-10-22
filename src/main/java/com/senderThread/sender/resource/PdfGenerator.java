package com.senderThread.sender.resource;

import com.senderThread.sender.domain.Item;
import com.senderThread.sender.dto.RideBookingDTO;
import com.senderThread.sender.service.BillGenerationService;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lowagie.text.DocumentException;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.xhtmlrenderer.pdf.ITextRenderer;

@RestController
public class PdfGenerator {

    private final SpringTemplateEngine templateEngine;

  /*  @Inject
    private RideBookingRepository rideBookingRepository;
*/
    @Inject
    private BillGenerationService billGenerationService;

    public PdfGenerator(SpringTemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }



   /* @PostMapping("/pdf/download")
    public String responseDownload(){
        return "response";
    }*/
   @PostMapping("/pdf/download")
   public ResponseEntity<?> downloadPdf(@RequestBody RideBookingDTO rideBookingDTO) throws DocumentException, IOException {

       // Generate data for the template
      try  {


 /*
           Map<String, Object> data = new HashMap<>();
           data.put("title", "PDF Table Example");

           // Static item data (replace this with your dynamic data)
           List<Item> items = List.of(
                   new Item(1, "Item A", 10, 25.5),
                   new Item(2, "Item B", 5, 15.0),
                   new Item(3, "Item C", 8, 30.0)
           );
           data.put("items", items);

           // Render Thymeleaf template to HTML
           Context context = new Context();
           context.setVariables(data);
           String htmlContent = templateEngine.process("item", context);

           // Use Flying Saucer to convert the HTML to PDF
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           ITextRenderer renderer = new ITextRenderer();
           renderer.setDocumentFromString(htmlContent);
           renderer.layout();
           renderer.createPDF(byteArrayOutputStream);

           // Prepare the PDF byte array
           byte[] pdfBytes = byteArrayOutputStream.toByteArray();

           // Set headers for the response
           HttpHeaders headers = new HttpHeaders();
           headers.setContentType(org.springframework.http.MediaType.APPLICATION_PDF);
           headers.setContentDispositionFormData("filename", "generated-pdf.pdf");

           // Return the PDF as a ResponseEntity
           return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);*/
/*
           // Create a PDF writer instance
           String htmlContent = "<html><body><h1>PDF Example</h1><p>This PDF was generated using Flying Saucer with iText 2.1.7!</p></body></html>";

           // Generate PDF from HTML
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           ITextRenderer renderer = new ITextRenderer();
           renderer.setDocumentFromString(htmlContent);
           renderer.layout();
           renderer.createPDF(byteArrayOutputStream);

           // Convert ByteArrayOutputStream to byte array
           byte[] pdfBytes = byteArrayOutputStream.toByteArray();

           // Set response headers
           HttpHeaders headers = new HttpHeaders();
           headers.setContentType(MediaType.APPLICATION_PDF);
           headers.setContentDispositionFormData("filename", "generated-pdf.pdf");

           // Return the PDF as byte array
           return ResponseEntity.ok()
                   .headers(headers)
                   .body(pdfBytes);*/


            System.out.println("Started PDF generation");

       // Process the ride booking details
       billGenerationService.processBillGenerationDetails(rideBookingDTO);
       rideBookingDTO.setCarModel("");
       System.out.println("Processing ride booking details completed");

       // Set up Thymeleaf context
       Context context = new Context();
       context.setVariable("title", "Ride Bill");
       context.setVariable("rideBookingDTO", rideBookingDTO);

       // Render the HTML using Thymeleaf
       String renderedHtmlContent = templateEngine.process("pdf-template", context);

       // Create a ByteArrayOutputStream to hold the PDF
       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       ITextRenderer renderer = new ITextRenderer();

       //log.info("xhtml {}", content);
       //log.info(resourceUrl.toString());

       //renderer.getFontResolver().addFont("/static/fonts/seguisb.ttf", true);

       // Set the base URL for resolving images
       final URL resourceUrl = new ClassPathResource("/static/").getURL();
       renderer.setDocumentFromString(renderedHtmlContent, resourceUrl.toString());
       renderer.layout();
       renderer.createPDF(byteArrayOutputStream);

       renderer.layout();

       renderer.finishPDF();
       // Convert ByteArrayOutputStream to byte array for the ResponseEntity
       byte[] pdfBytes = byteArrayOutputStream.toByteArray();

       // Prepare the PDF response
       ByteArrayResource byteArrayResource = new ByteArrayResource(pdfBytes);
       HttpHeaders headers = new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_PDF);
       headers.setContentDispositionFormData("attachment", "ride-bill.pdf");
       System.out.println("Completed PDF generation");

       return ResponseEntity.ok()
               .headers(headers)  // Add headers to the response
               .contentLength(pdfBytes.length)  // Set the content length
               .body(byteArrayResource);  // Return the PDF as response body
       } catch (Exception e) {
           e.printStackTrace();
           return ResponseEntity.status(500).build();
       }

      /* System.out.println("Started PDF generation");

       // Process the ride booking details
       billGenerationService.processBillGenerationDetails(rideBookingDTO);
       System.out.println("Processing ride booking details completed");

       // Set up Thymeleaf context
       Context context = new Context();
       context.setVariable("title", "Ride Bill");
       context.setVariable("rideBookingDTO", rideBookingDTO);

       // Render the HTML using Thymeleaf
       String renderedHtmlContent = templateEngine.process("pdf-template", context);

       // Create a ByteArrayOutputStream to hold the PDF
       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
       ITextRenderer renderer = new ITextRenderer();

       //log.info("xhtml {}", content);
       //log.info(resourceUrl.toString());

       //renderer.getFontResolver().addFont("/static/fonts/seguisb.ttf", true);

       // Set the base URL for resolving images
       final URL resourceUrl = new ClassPathResource("static/").getURL();
       renderer.setDocumentFromString(renderedHtmlContent, resourceUrl.toString());
       renderer.layout();
       renderer.createPDF(byteArrayOutputStream);

       renderer.layout();

       renderer.finishPDF();
       // Convert ByteArrayOutputStream to byte array for the ResponseEntity
       byte[] pdfBytes = byteArrayOutputStream.toByteArray();

       // Prepare the PDF response
       ByteArrayResource byteArrayResource = new ByteArrayResource(pdfBytes);
       HttpHeaders headers = new HttpHeaders();
       headers.setContentType(MediaType.APPLICATION_PDF);
       headers.setContentDispositionFormData("attachment", "ride-bill.pdf");
       System.out.println("Completed PDF generation");

       return ResponseEntity.ok()
               .headers(headers)  // Add headers to the response
               .contentLength(pdfBytes.length)  // Set the content length
               .body(byteArrayResource);  // Return the PDF as response body
*/

   //    System.out.println("started pdf generation");
//        billGenerationService.processBillGenerationDetails(rideBookingDTO);
//        System.out.println("stating pdf generation end");
//
//        // Set up Thymeleaf context
//        Context context = new Context();
//        context.setVariable("title", "Ride Bill");
//        context.setVariable("rideBookingDTO", rideBookingDTO);
//
//        // Render the HTML using Thymeleaf
//        String renderedHtmlContent = templateEngine.process("pdf-template", context);
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        ITextRenderer renderer = new ITextRenderer();
//
//        final URL resourceUrl = new ClassPathResource("/static/").getURL();
//        renderer.setDocumentFromString(renderedHtmlContent,resourceUrl.toString());
//        renderer.layout();
//        renderer.createPDF(byteArrayOutputStream);
//
//
//
//        // Convert ByteArrayOutputStream to byte array for the ResponseEntity
//        byte[] pdfBytes = byteArrayOutputStream.toByteArray();
//
//        // Return the PDF as a ResponseEntity
//        ByteArrayResource byteArrayResource = new ByteArrayResource(pdfBytes);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_PDF);
//        headers.setContentDispositionFormData("attachment", "ride-bill.pdf");
//        System.out.println("completed pdf generation");
//        return ResponseEntity
//                .ok()
//                .headers(headers)
//                .contentLength(pdfBytes.length)
//                .body(byteArrayResource);
   }
}
