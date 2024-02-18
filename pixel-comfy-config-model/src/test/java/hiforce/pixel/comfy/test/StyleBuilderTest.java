package hiforce.pixel.comfy.test;

import com.google.common.collect.Lists;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author Rocky Yu
 * @since 2023/10/31
 */
public class StyleBuilderTest {
    public static void main(String[] args) throws IOException {

        String str = "\\ddd/";
        System.out.println(URLEncoder.encode(str));
    }
}
