package com.company;

import com.company.Encryptors.AESEncryptors;
import com.company.Encryptors.Encryptors;

import java.io.File;

public class Main {
    static public void main(String[] args) {
        AESEncryptors encryptors = new AESEncryptors(new File(""));
        encryptors.encryption();
        encryptors.fileWriter("/user/tmp");
    }
}
