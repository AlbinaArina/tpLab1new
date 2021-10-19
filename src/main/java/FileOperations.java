import javax.swing.*;
import java.io.*;

public class FileOperations extends JFrame {
    private static final long serialVersionUID = 1L;

    public TableData load(String filePath) throws IOException {
        try(ObjectInputStream loader = new ObjectInputStream(new FileInputStream(filePath))){
            return (TableData)loader.readObject();
        }
        catch (IOException | ClassCastException | ClassNotFoundException exception)
        {
            throw new IOException("Error during loading from location: " + filePath + ", " + exception.getClass());
        }
    }

    public void save(TableData tableData, String filePath) throws IOException {
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filePath))){
            writer.writeObject(tableData);
        }

        catch (IOException exception)
        {
            throw new IOException("Error during saving to location: " + filePath);
        }
    }

}
