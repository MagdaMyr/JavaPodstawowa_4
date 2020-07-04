public class SplittingFilepath {

    public static void main(String[] args) {
        //1. Pobranie sciezki do pliku (Scanner)

        //2.
        String exampleFilepath = "/home/user/index.html";
        String[] result = filepathData(exampleFilepath);
        for(String r : result)
            System.out.println(r);
    }

    /**
     * ...
     *
     * @param path to be evaluated
     * @return array which contains file extension, filename, path to file
     */
    public static String[] filepathData(String path) {
        String[] splittedPath = path.split("/");
        String file = splittedPath[splittedPath.length - 1];
        String[] splittedFile = file.split("\\.");  //argument to RegEx

        String[] result = new String[3];
        result[0] = splittedFile[1];
        result[1] = splittedFile[0];
        result[2] = path.replace(file, "");
        return result;
    }

}
