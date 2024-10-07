package com.shizubro.cardorders.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@Slf4j
public class Utility {

    public static void downloadData(String urlString, String destination) {
        if (StringUtils.isEmpty(urlString) || StringUtils.isEmpty(destination)) {
            return;
        }
        try {
            FileUtils.copyURLToFile(new URL(urlString),
                    new File(destination));
        } catch (IOException e) {
            log.error("Download oracle cards failed", e);
        }
    }
}
