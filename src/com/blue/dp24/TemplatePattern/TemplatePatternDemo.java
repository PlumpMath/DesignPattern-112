package com.blue.dp24.TemplatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
