package com.fileCrypt.check.FileCryptChecker;

import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {

    private static final String PROCESSINGFILES = "A:\\Library\\Java Pack\\Spring Projects\\File Crypt Checker\\File-Crypt-Checker\\src\\main\\resources\\processingfiles";
    private static final String FILE_TO_USE = "testFile.zip";
    private static final File fileToProcess;
    private static final String DESTINATION_PATH;
    public static final String TEST_EXCEL_XLSX = "testExcel.xlsx";

    static {
        DESTINATION_PATH = Paths.get(PROCESSINGFILES).toString();
        try {
            fileToProcess = Path.of(FileProcessor.class.getClassLoader().getResource(FILE_TO_USE).toURI()).toFile();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public FileProcessor() throws URISyntaxException {
    }

    public static void runApplication() throws ZipException {
        if(fileToProcess.isFile()){
            FileDecrypter decrypter = new FileDecrypter();
            decrypter.decryptFile(fileToProcess.getPath(), DESTINATION_PATH, TEST_EXCEL_XLSX,  "test123");
        }
        File excelFile = Path.of(DESTINATION_PATH, TEST_EXCEL_XLSX).toFile();
        if(excelFile.exists()){
            System.out.println("Excel file created successfully: " + excelFile.getAbsolutePath());
        } else {
            System.out.println("Failed to create Excel file.");
        }
    }
}
