package com.mime.javagame.graphics;

import java.util.Random;

public class Screen extends Render {
    private Render testRender;

    public Screen(int width, int height) {
        super(width, height);
        Random random = new Random();
        testRender = new Render(256, 256);
        for(int i = 0; i < 256*256; i++){
            testRender.pixels[i] = random.nextInt();
        }
    }

    public void render() {
        draw(testRender, 0, 0);
    }
}
