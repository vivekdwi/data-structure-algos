package com.vivz.programs;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * {@link MonitorDirectory} class is an Example to
 * Monitor Directory for any file creation, modify
 * and deletion in that particular directory.
 *
 * Created by vivekdwivedi on 11/2/2017.
 */
public class MonitorDirectory {
    public static void main(String[] args) throws IOException, InterruptedException {
        Path monitorDir = Paths.get("./test/");
        WatchService lWatchService = FileSystems.getDefault().newWatchService();
        monitorDir.register(lWatchService, StandardWatchEventKinds.ENTRY_CREATE
                ,StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
        boolean lValid = Boolean.TRUE;
        do {
            WatchKey key = lWatchService.take();
            for (WatchEvent event: key.pollEvents()) {
                WatchEvent.Kind kind = event.kind();
                if(StandardWatchEventKinds.ENTRY_CREATE.equals(kind)) {
                    String fileName = event.context().toString();
                    System.out.println("File Created :: " + fileName);
                }else if(StandardWatchEventKinds.ENTRY_MODIFY.equals(kind)){
                    String fileName = event.context().toString();
                    System.out.println("File Modified :: " + fileName);
                }else if(StandardWatchEventKinds.ENTRY_DELETE.equals(kind)){
                    String fileName = event.context().toString();
                    System.out.println("File Deleted :: " + fileName);
                }
            }
            lValid = key.reset();
        }while (lValid);
    }
}
