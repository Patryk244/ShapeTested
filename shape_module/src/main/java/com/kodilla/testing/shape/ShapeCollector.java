package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> myShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        myShapes.add(shape);
    }

    public int sizeList() {
        return myShapes.size();
    }

    public boolean removeFigure(Shape shape) {
        return myShapes.remove(shape);
    }

    public Shape getFigure(int i) {
        return myShapes.get(i);
    }

    public String showFigure() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < myShapes.size(); i++) {
            builder.append(myShapes.get(i).getShapeName());
            if (i != myShapes.size() - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
