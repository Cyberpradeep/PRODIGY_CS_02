import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgEncryptDecrypt {

    public static void processImg(String inFile, String outFile, int key) {
        try {
            // Load image
            BufferedImage img = ImageIO.read(new File(inFile));

            // Get image dimensions
            int w = img.getWidth();
            int h = img.getHeight();

            // Loop through each pixel
            for (int x = 0; x < w; x++) {
                for (int y = 0; y < h; y++) {
                    int px = img.getRGB(x, y);

                    // Extract RGB
                    int r = (px >> 16) & 0xff;
                    int g = (px >> 8) & 0xff;
                    int b = px & 0xff;

                    // XOR each component
                    r ^= key;
                    g ^= key;
                    b ^= key;

                    // Recombine RGB
                    px = (r << 16) | (g << 8) | b;

                    // Set modified pixel
                    img.setRGB(x, y, px);
                }
            }

            // Save image
            ImageIO.write(img, "PNG", new File(outFile));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inFile = "input.png";  // Input image
        String outFile = "output.png";  // Output image
        int key = 12345;  // Key

        processImg(inFile, outFile, key);
        System.out.println("Encryption/Decryption complete.");
    }
}
