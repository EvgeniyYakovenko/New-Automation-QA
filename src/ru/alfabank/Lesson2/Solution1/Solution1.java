package ru.alfabank.Lesson2.Solution1;

public class Solution1 {
    public static void main(String[] args) {
        String str = new String("Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался");
        System.out.println(str.replace('р', '*'));
    }
}