package jubaw.structuralDP.facadeDP;

public class Runner {

    public static void main(String[] args) {

        String text = "Design Pattern";

        AES_Enc aesEnc = new AES_Enc();
        aesEnc.encrypt(text);

        SHA_Enc shaEnc = new SHA_Enc();
        shaEnc.encrypt(text,"Jubaw");

        MD5_Enc md5Enc = new MD5_Enc();
        md5Enc.encrypt(text,"Jubaw",true);

        //------------------------------------------------------------------------------------------
        //If onyl there was an interface,so we would implement the algorithm we wanted to use
        //without we are dealing with details of the methods above.

        System.out.println("------------------------------------------------------------------------------------------");

        EncryptorFacade encryptor = new EncryptorFacade();
        encryptor.encrypt(text,EncryptorType.AES);
        encryptor.encrypt(text,EncryptorType.SHA);








    }
}
