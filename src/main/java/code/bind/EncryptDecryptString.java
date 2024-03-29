package code.bind;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Program to Encrypt/Decrypt String Using AES 128 bit Encryption Algorithm
 */

//https://8gwifi.org/CipherFunctions.jsp
//https://www.devglan.com/online-tools/aes-encryption-decryption
public class EncryptDecryptString {
    
    private static final String encryptionKey           = "ABCDEFGHIJKLMNOP";
//	private static final String encryptionKey           =   "MAKV2SPBNI992122";
	
	private static final String characterEncoding       = "UTF-8";
    private static final String cipherTransformation    = "AES/CBC/PKCS5PADDING";
    private static final String aesEncryptionAlgorithem = "AES";
    
    
    /**
     * Method for Encrypt Plain String Data
     * @param plainText
     * @return encryptedText
     */
    public static String encrypt(String plainText) {
        String encryptedText = "";
        try {
            Cipher cipher   = Cipher.getInstance(cipherTransformation);
            byte[] key      = encryptionKey.getBytes(characterEncoding);
            SecretKeySpec secretKey = new SecretKeySpec(key, aesEncryptionAlgorithem);
            IvParameterSpec ivparameterspec = new IvParameterSpec(key);
            
            
            
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivparameterspec);
           // cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plainText.getBytes("UTF8"));
            Base64.Encoder encoder = Base64.getEncoder();
            encryptedText = encoder.encodeToString(cipherText);

        } catch (Exception E) {
             System.err.println("Encrypt Exception : "+E.getMessage());
        }
        return encryptedText;
    }

    /**
     * Method For Get encryptedText and Decrypted provided String
     * @param encryptedText
     * @return decryptedText
     */
    public static String decrypt(String encryptedText) {
        String decryptedText = "";
        try {
            Cipher cipher = Cipher.getInstance(cipherTransformation);
            byte[] key = encryptionKey.getBytes(characterEncoding);
            SecretKeySpec secretKey = new SecretKeySpec(key, aesEncryptionAlgorithem);
            IvParameterSpec ivparameterspec = new IvParameterSpec(key);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivparameterspec);
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] cipherText = decoder.decode(encryptedText.getBytes("UTF8"));
            decryptedText = new String(cipher.doFinal(cipherText), "UTF-8");

        } catch (Exception E) {
            System.err.println("decrypt Exception : "+E.getMessage());
        }
        return decryptedText;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String plainString = sc.nextLine();
        
        String encyptStr   = encrypt(plainString);
        String decryptStr  = decrypt(encyptStr);
        
        System.out.println("Plain   String  : "+plainString);
        System.out.println("Encrypt String  : "+encyptStr);
        System.out.println("Decrypt String  : "+decryptStr);
        
    }   
}

/****

http://csharphelper.com/blog/2013/10/make-a-c-dll-and-use-it-from-excel-vba-code/
//Rextester.Program.Main is the entry point for your code. Don't change it.
//Compiler version 4.0.30319.17929 for Microsoft (R) .NET Framework 4.5
https://www.youtube.com/watch?v=7aDAyf72S7o&t=114s
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
using System.IO;
using System.Text;
using System.Security.Cryptography;

namespace Rextester
{
    public class Program
    {
        public static void Main(string[] args)
        {
            //Your code goes here
            string value = "Sanjeev";
             string mykey = "ABCDEFGHIJKLMNOP";
            

            string encryptedValue= EncryptData(value,mykey);

            
            Console.WriteLine( encryptedValue);
        }
        
    static string EncryptData(string textData, string Encryptionkey)  
        {  
            RijndaelManaged objrij = new RijndaelManaged();  
            //set the mode for operation of the algorithm   
            objrij.Mode = CipherMode.CBC;  
            //set the padding mode used in the algorithm.   
            objrij.Padding = PaddingMode.PKCS7;  
            //set the size, in bits, for the secret key.   
            objrij.KeySize = 0x80;  
            //set the block size in bits for the cryptographic operation.    
            objrij.BlockSize = 0x80;  
            //set the symmetric key that is used for encryption & decryption.    
            byte[] passBytes = Encoding.UTF8.GetBytes(Encryptionkey);  
            //set the initialization vector (IV) for the symmetric algorithm    
            byte[] EncryptionkeyBytes = new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };  
  
            int len = passBytes.Length;  
            if (len > EncryptionkeyBytes.Length)  
            {  
                len = EncryptionkeyBytes.Length;  
            }  
            Array.Copy(passBytes, EncryptionkeyBytes, len);  
  
            objrij.Key = EncryptionkeyBytes;  
            objrij.IV = EncryptionkeyBytes;  
  
            //Creates symmetric AES object with the current key and initialization vector IV.    
            ICryptoTransform objtransform = objrij.CreateEncryptor();  
            byte[] textDataByte = Encoding.UTF8.GetBytes(textData);  
            //Final transform the test string.  
            return Convert.ToBase64String(objtransform.TransformFinalBlock(textDataByte, 0, textDataByte.Length));  
        }   

   
    }
}


**********/