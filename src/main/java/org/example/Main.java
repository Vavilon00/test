package org.example;

import com.automation.remarks.video.RecorderFactory;
import com.automation.remarks.video.enums.RecorderType;
import com.automation.remarks.video.recorder.IVideoRecorder;
import com.codeborne.selenide.Selenide;

public class Main {
    public static void main(String[] args) {
        IVideoRecorder recorder = RecorderFactory.getRecorder(RecorderType.FFMPEG);
        Selenide.open("https://www.google.ru/");
        recorder.start();
        Selenide.sleep(10000);
        recorder.stopAndSave("test_video");
    }
}