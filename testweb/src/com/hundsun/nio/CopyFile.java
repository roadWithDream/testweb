package com.hundsun.nio;


import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CopyFile
{
  @SuppressWarnings("resource")
static public void main( String args[] ) throws Exception {

    String infile = "C:\\Users\\liumm19506\\git\\repository\\testweb\\src\\spring.xml";
    String outfile = "C:\\Users\\liumm19506\\git\\repository\\testweb\\src\\spring1.xml";

    FileInputStream fin = new FileInputStream( infile );
    FileOutputStream fout = new FileOutputStream( outfile );

    FileChannel fcin = fin.getChannel();
    FileChannel fcout = fout.getChannel();

    ByteBuffer buffer = ByteBuffer.allocate( 1024 );

    while (true) {
      buffer.clear();

      int r = fcin.read( buffer );

      if (r==-1) {
        break;
      }

      buffer.flip();

      fcout.write( buffer );
    }
  }
}
