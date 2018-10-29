package com.hundsun.nio;

import java.nio.ByteBuffer;

public class ByteBufferMethods {

	public static void main(String args[]) {
		//���仺������Allocating a Buffer��
		ByteBuffer buffer = ByteBuffer.allocate(33);
		System.out.println("-------------Test reset-------------");
		//clear()������position�������0��limit�����ó� capacity��ֵ
		buffer.clear();
		//���������������λ��
		buffer.position(5);
		//���˻������ı����������λ�á�û��buffer.mark();��仰�ᱨ��
		buffer.mark();
		buffer.position(10);
		System.out.println("before reset:      "+ buffer);

		//���˻�������λ������Ϊ��ǰ��ǵ�λ�á���buffer.position(5)��
		buffer.reset();
		System.out.println("after reset:       "+ buffer);
		System.out.println("-------------Test rewind-------------");
		buffer.clear();
		buffer.position(10);
		//���ش˻����������ơ�
		buffer.limit(15);
		System.out.println("before rewind:       "+ buffer);

		//��position��Ϊ0��mark��Ϊ-1�����ı�limit��ֵ

		buffer.rewind();
		System.out.println("before rewind:       "+ buffer);
		System.out.println("-------------Test compact-------------");
		buffer.clear();
		buffer.put("abcd��".getBytes());
		System.out.println("before compact:       "	+ buffer);
		System.out.println(new String(buffer.array()));

		//limit = position;position = 0;mark = -1; ��ת��Ҳ������flip֮���position��limit���������֮ǰ��0��position��飬
		//��ת���ǽ�һ�����ڴ�����״̬�Ļ�������Ϊһ������׼��ȡ���ݵ�״̬
		buffer.flip();
		System.out.println("after flip:       "	+ buffer);

		//get()��������Զ�����positionλ�ö�ȡһ��byte������position+1��Ϊ�´ζ�д��׼��

		System.out.println((char) buffer.get());
		System.out.println((char) buffer.get());
		System.out.println((char) buffer.get());
		System.out.println("after three gets:       "+ buffer);
		System.out.println("\t"	+new String(buffer.array()));

		//�Ѵ�position��limit�е������Ƶ�0��limit-position�������ڣ�position��limit��ȡֵҲ�ֱ���limit-position��capacity��

		//����Ƚ�positon���õ�limit����compact����ô�൱��clear()
		buffer.compact();
		System.out.println("after compact:       "	+ buffer);
		System.out.println("\t"	+new String(buffer.array()));
		System.out.println("-------------Test get-------------");
		buffer = ByteBuffer.allocate(32);
		buffer.put((byte)'a').put((byte)'b').put((byte)'c').put((byte)'d').put((byte)'e').put((byte)'f');

		System.out.println("before flip():       "+ buffer);
		//ת��Ϊ��ȡģʽ
		buffer.flip();
		System.out.println("before get():       "+ buffer);
		System.out.println((char) buffer.get());
		System.out.println("after get():       "+ buffer);

		//get(index)��Ӱ��position��ֵ
		System.out.println((char) buffer.get(2));
		System.out.println("after get(index):       "+ buffer);

		byte[] dst =new byte[10];
		buffer.get(dst,	0, 2);

		System.out.println("after get(dst, 0, 2):       "+ buffer);
		System.out.println("\t dst:"+new String(dst));

		System.out.println("buffer now is:       "+ buffer);
		System.out.println("\t"	+new String(buffer.array()));
		System.out.println("-------------Test put-------------");

		ByteBuffer bb = ByteBuffer.allocate(32);
		System.out.println("before put(byte):       "+ bb);
		System.out.println("after put(byte):       "+ bb.put((byte)'z'));
		System.out.println("\t"	+ bb.put(2,	(byte)'c'));

		//put(2,(byte) 'c')���ı�position��λ��
		System.out.println("after put(2,(byte) 'c'):       "+ bb);
		System.out.println("\t"	+new String(bb.array()));

		//�����buffer�� abcdef[pos=3 lim=6 cap=32]
		bb.put(buffer);
		System.out.println("after put(buffer):       "+ bb);
		System.out.println("\t"	+new String(bb.array()));
	}
}