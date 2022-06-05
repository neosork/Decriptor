import java.io.File;

public class FileMaker {
    private  String scrFolser;
    private  String descFolder;

    public FileMaker(String scrFolser, String descFolder) {
        this.scrFolser = scrFolser;
        this.descFolder = descFolder;
    }

    File file;

    {
        assert false;
        file = new File(descFolder);
    }
}
