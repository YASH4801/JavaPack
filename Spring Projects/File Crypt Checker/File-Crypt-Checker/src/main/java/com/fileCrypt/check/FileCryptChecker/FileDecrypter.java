package com.fileCrypt.check.FileCryptChecker;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.IOException;


public class FileDecrypter {



    public void decryptFile(String encryptedFilePath, String destinationPath, String excelFileName, String key) throws ZipException {
        ZipFile file = new ZipFile(encryptedFilePath, key.toCharArray());
        file.extractFile(excelFileName, destinationPath);
    }
}
