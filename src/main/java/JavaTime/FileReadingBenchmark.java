/*
 * Problem Statement: Compare FileReader and InputStreamReader when reading a large text file.
 * Hint: Both are character-reading approaches. InputStreamReader converts bytes to characters using a charset. Buffered reading is used for efficiency; results depend on disk cache and charset.
 * Author: Asher Mustafa
 * Date: 13 - 10 - 2026
 */
package JavaTime;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class FileReadingBenchmark {
    // Reads the supplied path or input.txt in the current directory.
    public static void main(String[] args) {
        String path=args.length>0?args[0]:"input.txt";
        try {
            long t=System.nanoTime(); long a=readFileReader(path); long at=System.nanoTime()-t;
            t=System.nanoTime(); long b=readInputStreamReader(path); long bt=System.nanoTime()-t;
            System.out.println("File: "+path+"; character counts: "+a+", "+b);
            System.out.printf("FileReader: %.4f ms%nInputStreamReader: %.4f ms%n",at/1e6,bt/1e6);
        } catch(IOException e) { System.out.println("Could not read file: "+e.getMessage()); }
    }
    // Counts characters through a buffered FileReader.
    static long readFileReader(String path) throws IOException {
        long count=0;
        try(BufferedReader br=new BufferedReader(new FileReader(path))) { while(br.read()!=-1) count++; }
        return count;
    }
    // Counts UTF-8 characters through a buffered InputStreamReader.
    static long readInputStreamReader(String path) throws IOException {
        long count=0;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(path),StandardCharsets.UTF_8))) { while(br.read()!=-1) count++; }
        return count;
    }
}
