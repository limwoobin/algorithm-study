package test;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class test {
	public static void main(String[] args) {

	}

	public static String encrypt(String plain, String privatePem) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeySpecException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException {


			byte[] plainDataByteArr = plain.getBytes(StandardCharsets.UTF_8);

			int chunkSize = 245; // 2048 / 8 - 11(padding) = 245
			int totalByteSize = (int) (Math.ceil(plainDataByteArr.length / 245.0) * 256);
			int index = 0;
			ByteBuffer buf = ByteBuffer.allocate(totalByteSize);

			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, convertToPrivateKey(privatePem));
			while (index < plainDataByteArr.length) {
				int len = Math.min(plainDataByteArr.length - index, chunkSize);
				byte[] encChunk = cipher.doFinal(plainDataByteArr, index, len);
				buf.put(encChunk);
				index += len;
			}
			return Base64.getEncoder().withoutPadding().encodeToString(buf.array());

	}


	/**
	 * pem string 으로부터 Private Key 객체 생성
	 * @param pem : private pem string
	 * @return PrivateKey 객체
	 */
	public static PrivateKey convertToPrivateKey(String pem) throws NoSuchAlgorithmException, InvalidKeySpecException {

			byte[] pkcs8EncodedByte = Base64.getDecoder().decode(pem);
			return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(pkcs8EncodedByte));
	}
}