package com.codewithmosh;

import com.codewithmosh.composite.Group;
import com.codewithmosh.composite.Shape;

public class Main {
    public static void main(String[] args) {
        //----composite pattern----
        var group1 = new Group();
        group1.add(new Shape()); // square
        group1.add(new Shape()); // square

        var group2 = new Group();
        group2.add(new Shape()); // circle
        group2.add(new Shape()); // circle

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }
}
