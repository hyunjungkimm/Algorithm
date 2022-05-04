package sorting.no20291.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> sorted = new TreeMap<>();

        // Pattern reg = Pattern.compile("(.*)\\.+(.*)");
        for (int i = 0; i < n; i++) {
            // Matcher m = reg.matcher(br.readLine());
            // if (m.find()) {
            // String ext = m.group(2);
            String input = br.readLine();
            String ext = input.substring(input.indexOf(".") + 1);
            // System.out.printf("filename %s, ext %s", filename, ext);
            if (sorted.containsKey(ext)) {
                sorted.put(ext, sorted.get(ext) + 1);
            } else {
                sorted.put(ext, 1);
            }
            // }
        }

        for (String ext : sorted.keySet()) {
            // printf 했다가, 시간초과 떴다;;;;
            System.out.println(ext + " " + sorted.get(ext));
        }
    }
}
