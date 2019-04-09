package com.example.gateway.filter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static java.util.Objects.hash;

public class Test {
    public static void main(String[] args) {
        Long t = 999999999L;
        String s = "192.168.2.166#1";
        System.out.println(hash(s));
        s = "192.168.2.166#2";
        System.out.println(hash(s));
        s = "192.168.2.166#3";
        System.out.println(hash(s));
        s = "192.168.2.176#1";
        System.out.println(hash(s));
        s = "192.168.2.176#2";
        System.out.println(hash(s));
        s = "192.168.2.176#3";
        System.out.println(hash(s));
        s = "192.168.2.186#1";
        System.out.println(hash(s));
        s = "192.168.2.186#2";
        System.out.println(hash(s));
        s = "192.168.2.186#3";
        System.out.println(hash(s));
        s = "192.168.2.196#1";
        System.out.println(hash(s));
        s = "192.168.2.196#2";
        System.out.println(hash(s));
        s = "192.168.2.196#3";
        System.out.println(hash(s));
        System.out.println(hash(s) % 2147482647);
    }
}
