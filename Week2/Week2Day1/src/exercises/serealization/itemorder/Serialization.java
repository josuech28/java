package exercises.serealization.itemorder;

import java.io.*;

/**
 * Created by joschinc on 11/8/16.
 */
public class Serialization  {

    private ByteArrayOutputStream bout = new ByteArrayOutputStream();

        public void serialize(Object object) throws IOException {
            ObjectOutputStream oos = new ObjectOutputStream(bout);
            oos.writeObject(object);
        }

        public Object deserealizable() throws IOException, ClassNotFoundException{
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bout.toByteArray()));
            Order objectDeserealizable = (Order)ois.readObject();
            return objectDeserealizable;
        }

}
