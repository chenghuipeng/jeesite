/**
 * *
 * 适配器模式作为两个不兼容接口之间的桥梁。
 * 这种类型的设计模式属于结构模式，因为该模式组合了两个独立接口。
 * 这种模式涉及一个单独的类，它负责连接独立或不兼容接口的功能。
 * <p>
 * 现实生活的例子- 读卡器的，其用作为存储卡和笔记本电脑之间的适配器。将存储卡插入读卡器并将读卡器插入笔记本电脑接口，以便可以通过笔记本电脑读取存储卡。
 * 我们通过以下示例演示适配器模式的使用。
 * 音频播放器设备只能播放mp3文件，但希望能够实现一个可播放vlc和mp4文件的高级音频播放器。
 */
package com.feipeng.design.model04;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }


    }


}
