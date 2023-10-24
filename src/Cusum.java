import java.io.File;

public class Cusum
{
    private final File dataFile;
    private final double confidence;

    public Cusum(String filename, double conf)
    {
        dataFile = new File(filename);
        confidence = conf;
    }

    public void processData()
    {

    }

    public int[] split(int start, int end)
    {
        return null;
    }
}
