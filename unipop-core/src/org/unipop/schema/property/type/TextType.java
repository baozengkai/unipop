package org.unipop.schema.property.type;

/**
 * Created by sbarzilay on 8/19/16.
 */
public class TextType implements PropertyType {
    @Override
    public String getType() {
        return "STRING";
    }

    @Override
    public Object convertToType(Object object) {
        return object.toString();
    }
}
