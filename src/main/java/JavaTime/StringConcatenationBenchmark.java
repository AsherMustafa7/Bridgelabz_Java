/*
 * Problem Statement: Compare repeated concatenation with String, StringBuilder, and StringBuffer.
 * Hint: String is immutable, so repeated concatenation can copy existing text. StringBuilder is mutable and not synchronized; StringBuffer is synchronized.
 * Author: Asher Mustafa
 * Date: 13 - 10 - 2026
 */
package JavaTime;
public class StringConcatenationBenchmark {
    // Tests increasing operation counts; timings depend on the computer.
    public static void main(String[] args) {
        int[] sizes={1000,10000,50000};
        for(int n:sizes) {
            long t=System.nanoTime(); String s="";
            // Repeatedly creates a new String value.
            for(int i=0;i<n;i++) s=s+"a";
            long st=System.nanoTime()-t;
            t=System.nanoTime(); StringBuilder sb=new StringBuilder(n);
            // Appends efficiently to a mutable builder.
            for(int i=0;i<n;i++) sb.append("a");
            long bt=System.nanoTime()-t;
            t=System.nanoTime(); StringBuffer sf=new StringBuffer(n);
            // Appends using synchronized StringBuffer methods.
            for(int i=0;i<n;i++) sf.append("a");
            long ft=System.nanoTime()-t;
            System.out.println("Operations = "+n+", result lengths = "+s.length()+", "+sb.length()+", "+sf.length());
            System.out.printf("String: %.4f ms%nStringBuilder: %.4f ms%nStringBuffer: %.4f ms%n%n",st/1e6,bt/1e6,ft/1e6);
        }
    }
}
