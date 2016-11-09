package exercises.serealization.itemorder;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by joschinc on 11/9/16.
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String description;
    private transient ArrayList<Item> items;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
        this.items = new ArrayList<Item>();
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + description.hashCode();
        return result;
    }
}
