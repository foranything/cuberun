package com.company.Encryptors;

import java.io.File;

public class BCryptEncryptors extends Encryptors{
    public BCryptEncryptors(File file) {
        super(file);
    }

    public void encryption() {
        BCrypt();
    }

    private void BCrypt() {
        // AES256 암호화를 수행한다
    }
}
