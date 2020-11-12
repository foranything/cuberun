package com.company.Encryptors;

import java.io.File;

public class AESEncryptors extends Encryptors{
    public AESEncryptors(File file) {
        super(file);
    }

    public void encryption() {
        AES256();
    }

    private void AES256() {
        // AES256 암호화를 수행한다
    }
}
