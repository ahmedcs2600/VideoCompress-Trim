package com.gowtham.library.utils;

public class CompressOption {

    private int frameRate=30;

    private String videoBitrate="0k";

    public String audioBitrate="0k";

    private int width=0;

    private int height=0;

    public CompressOption() {

    }

    public CompressOption(int frameRate, String bitRate, int width, int height) {
        this.frameRate = frameRate;
        this.videoBitrate = bitRate;
        this.width = width;
        this.height = height;
    }

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }

    public void setVideoBitrate(String bitRate) {
        this.videoBitrate = bitRate;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public String getVideoBitrate() {
        return videoBitrate;
    }

}
