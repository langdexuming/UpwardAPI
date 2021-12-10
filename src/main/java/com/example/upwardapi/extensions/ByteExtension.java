package com.example.upwardapi.extensions;

public class ByteExtension {
    public static byte[] ConvertFrom(String byteString)
    {
        if(byteString==null||byteString.isEmpty())
        {
            return null;
        }

        byte[] data=new byte[byteString.length()/2];

        int p=0;
        for (int i=0;i<byteString.length();i++)
        {
            //data[p]=byteString.substring(i ,2);
            p++;
            i+=1;

        }

        return data;
    }
}
