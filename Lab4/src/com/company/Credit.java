package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class Credit {
    private int month;
    private double amount;
    private double interestRate;
    private ArrayList<Shedule> necessaryPayments;

    public Credit(int month, double amount, double interestRate) {
        this.month = month;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public void calcNecessaryPayments() {
        necessaryPayments = new ArrayList();

        double constNecessaryPayment = amount / month,
                amountMainDebt = amount;

        for (int i = 0; i < month; i++) {
            double necessaryPayment = constNecessaryPayment + (amount - constNecessaryPayment*i) * (interestRate/100)/12;
            necessaryPayments.add(new Shedule(i+1, amountMainDebt, necessaryPayment));
            amountMainDebt -= constNecessaryPayment;
        }
    }
    public void writeIntoExcel() {
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("Necessary payments");
        int rowIndex = 0;
        Row row = sheet.createRow(rowIndex++);
        row.createCell(0).setCellValue("Порядковый месяц");
        row.createCell(1).setCellValue("Остаток основного долга");
        row.createCell(2).setCellValue("Платёж в текущем месяце");
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        sheet.autoSizeColumn(2);

        for (Shedule s: necessaryPayments) {
            row = sheet.createRow(rowIndex++);
            row.createCell(0).setCellValue(s.date);
            row.createCell(1).setCellValue(s.amountMainDebt);
            row.createCell(2).setCellValue(s.amountNecessaryPayment);
        }

        try (FileOutputStream fos = new FileOutputStream("out.xls")) {
            book.write(fos);
            book.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
