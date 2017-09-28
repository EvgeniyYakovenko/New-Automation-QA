package ru.alfabank.Lesson2.Solution2;

public class Solutoin2 {
    public static void main(String[] args) {
        String s1 = "Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался";
        for (int x=0; x<s1.length();x++){
            if (s1.charAt(x)=='р')
                s1=s1.replace('р', '*');
        }
    }
}