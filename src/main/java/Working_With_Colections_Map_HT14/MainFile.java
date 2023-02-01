package Working_With_Colections_Map_HT14;


public class MainFile {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.addListMap("src/main/java/File_1");
        fileNavigator.addListMap("src/main/java/File_2");
        fileNavigator.addListMap("src/main/java/File_3");
        FileData fileData = new FileData("File_1.xml", 120, "src/main/java/File_1");
        FileData fileData1 = new FileData("File_2.xml", 90, "src/main/java/File_2");
        FileData fileData2 = new FileData("File_3.xml", 70, "src/main/java/File_3");
        fileNavigator.add(fileData);
        fileNavigator.add(fileData1);
        fileNavigator.add(fileData2);
        System.out.println(" Adding to map :" + '\n' + fileNavigator.getListMap());
        fileNavigator.find("src/main/java/File_3");
        System.out.println(" Filter by size :" + '\n' + fileNavigator.filterBySize(100));
        System.out.println("Sorted by size :" + '\n' + fileNavigator.sortBySize());
        fileNavigator.remove("src/main/java/File_2");
        System.out.println(" After remove :" + '\n' + fileNavigator.getListMap());
    }
}
