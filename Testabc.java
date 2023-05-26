package com.demo;

import java.util.Stack;

import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  

  

  String input="DB_*";

  System.out.print("Input is :"+Pattern.compile("[a-zA-Z][a-zA-Z0-9]*(([_][a-zA-Z][a-zA-Z0-9]*[_]([a-zA-Z][a-zA-Z0-9]*|\\*?))|[_]\\*?)").matcher(input).matches());

  

  }

}
