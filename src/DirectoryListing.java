import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryListing {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\alvsh\\IdeaProjects\\JavaTask21\\folder";
        List<String> fileList = getFileList(directoryPath);

        System.out.println("Первые 5 элементов:");
        for (int i = 0; i < 5 && i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }
    }

    public static List<String> getFileList(String directoryPath) {
        List<String> fileList = new ArrayList<>();

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                fileList.add(file.getName());
            }
        }

        return fileList;
    }
}
