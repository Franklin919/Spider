package com.Koali.java.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.Koali.java.utils.SpiderUtils;

public class SpiderTest {
	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream(new FileOutputStream(new File("D:\\pic\\", "���Ʋ��.txt")));
			ps.println("");// ���ļ���д���ַ���
			String url = "http://www.37zw.com/1/1227/";
			/* 605834��ҳ���ı��룬����Ҫ�޸� */
			int first = 605834;// ��һ��
			int last = 1861698;// ���һ��
			int i = 1;
			for (; i < 1307; first++,i++) {
				System.out.println(url + first + ".html");
				try {
					System.out.println("��"+i+"�¿�ʼ����!");
					ps.append("��"+i+"��!\r\n");
					ps.append(SpiderUtils.getText(url + first + ".html"));// �����еĻ���������ַ���
					ps.append("\r\n");
					System.out.println("��"+i+"�����ؽ���!");
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
