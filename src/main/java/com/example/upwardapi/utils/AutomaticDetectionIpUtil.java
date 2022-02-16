package com.example.upwardapi.utils;

import java.util.ArrayList;
import java.util.List;

public class AutomaticDetectionIpUtil {

    public static List<String> getIpList() {
        List<String> result=new ArrayList<>();
        Integer i,j,k,l;
        for (l=0;l<256;l++){
            for (k=0;k<256;k++){
                for (j=0;j<256;j++){
                    for (i=0;i<256;i++){
                        result.add("{i}.");
                    }
                }
            }
        }
        return result;
    }
}
