package duanzu.util;

import java.security.MessageDigest;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;


public class NoteUtil {
	/*
	 * ����UUID�㷨�������
	 */
	public static String createId(){
		UUID uuid=UUID.randomUUID();
		String id=uuid.toString();
		return id.replace("-", "");
	}
	/*
	 * ���������MD5����
	 */
	public static String md5(String src){
		try {
			MessageDigest md = MessageDigest.getInstance("MD5"); //����ʹ��MD5�㷨
			//MD5���ܴ���
			byte[] output = md.digest(src.getBytes());
			//Base64����
			String ret
					=Base64.encodeBase64String(output);
			return ret;
		} catch (Exception e) {
			throw new NoteException("�������ʧ��",e);
		}
	}
	public static void main(String[] ars) throws Exception{
		System.out.println(createId());
		System.out.println(md5(createId()));
		System.out.println(md5("123456"));
	}
	
}
