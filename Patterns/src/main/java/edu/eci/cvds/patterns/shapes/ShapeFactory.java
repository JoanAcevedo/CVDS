package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class ShapeFactory {

    public static Shape create(RegularShapeType type) {
        String shape_type = type.toString();
        Shape out = null;
        switch (shape_type) {
            case "Hexagon":
                out = new Hexagon();
                break;
            case "Triangle":
                out = new Triangle();
                break;
            case "Pentagon":
                out = new Pentagon();
                break;
        
            default:
                break;
        }

        return out;
    }

}