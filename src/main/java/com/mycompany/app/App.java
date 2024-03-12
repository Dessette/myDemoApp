package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App
{
    public static String passGenerator(String string,int [] secondLayer, ArrayList<Integer> firstLayer, int num) {
      
      if(string == null || secondLayer == null || firstLayer == null) return "";
      if(firstLayer.size() - 1 < num) return "";
      if(secondLayer.length - 1 < firstLayer.get(num)) return "";
      if(firstLayer.get(num) >= secondLayer[firstLayer.get(num)]) return "";
      String str = string;

      for(int i = firstLayer.get(num); i<secondLayer[firstLayer.get(num)]; i++){
        char c = (char)((int)'0' + (i%79));
        str = str + c;
      }

      return str;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
      System.out.println("Hello world!");
    }
}

