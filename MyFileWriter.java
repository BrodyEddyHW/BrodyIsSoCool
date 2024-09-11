import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void printFileSize (String fileName) {
        File file = new File (fileName);
        System.out.print(file.length());
    }
    
    private static void printTotalFileSize(String... fileNames) {
    
        System.out.println("Total size of all files: ...TBD... bytes");
    }

    public static void main(String[] args) {
        String data = "Hello, World!";
        System.out.println(data);
        String fileName1 = "example1.txt";
        String fileName2 = "example2.txt";
        String fileName3 = "example3.txt";
        String fileName4 = "example4.txt";
        String fileName5 = "example5.txt";

        // 1. Using FileWriter
        // try (FileWriter writer = new FileWriter(fileName1)) {
        //     writer.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 2. Using BufferedWriter
        // try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
        //     bufferedWriter.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        File root = new File ("BrodyIsSoCool");
        root.mkdirs();
        File secretPassword = new File (root, ".brodyHiddenPassword.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(secretPassword))) {
            bw.write("NobodyWillGuessThis69");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        File repo = new File ("BrodyIsSoCool");
        repo.mkdirs();
        File newDir = new File (repo, ".brodyHiddenFolder");
        newDir.mkdirs();
        File hiddenData = new File (newDir, "hiddenStuff.dat");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(hiddenData))) {
            bw.write("Nobody can find this or the rizzler will die.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Using FileOutputStream
        // try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
        //     outputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 4. Using BufferedOutputStream
        // try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName4))) {
        //     bufferedOutputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 5. Using Files (java.nio.file)
        // try {
        //     Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}