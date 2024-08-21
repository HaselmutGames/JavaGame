package com.mime.javagame.graphics;

import java.util.Random;

public class Screen extends Render {
    private Render testRender;

    public Screen(int width, int height) {
        super(width, height);
        Random random = new Random();
        testRender = new Render(256, 256);
        for (int i = 0; i < 256 * 256; i++) {
            testRender.pixels[i] = random.nextInt();
        }
    }

    public void render() {
        int animate = (int) (Math.sin(System.currentTimeMillis() % 1000.0 / 1000 * Math.PI * 2) * 100);
        int animate2 = (int) (Math.cos(System.currentTimeMillis() % 1000.0 / 1000 * Math.PI * 2) * 100);
        draw(testRender, (width - 256) / 2 + animate, (height - 256) / 2 + animate2);
    }
}
