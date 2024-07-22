package com.codewithmosh;

import com.codewithmosh.adapter.CaramelFilter;
import com.codewithmosh.adapter.Image;
import com.codewithmosh.adapter.ImageView;
import com.codewithmosh.adapter.VividFilter;
import com.codewithmosh.adapter.avaFilters.Caramel;
import com.codewithmosh.composite.Group;
import com.codewithmosh.composite.Shape;
import com.codewithmosh.decorator.CloudStream;
import com.codewithmosh.decorator.EncryptedCloudStream;
import com.codewithmosh.decorator.Stream;

public class Main {
    public static void main(String[] args) {
        //----decorator pattern----
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
//        var cloudStream = new EncryptedCloudStream();
//        cloudStream.write("some data");
        //----adapter pattern----
//        var imageView = new ImageView(new Image());
//        imageView.apply(new CaramelFilter(new Caramel()));
        //----composite pattern----
//        var group1 = new Group();
//        group1.add(new Shape()); // square
//        group1.add(new Shape()); // square
//
//        var group2 = new Group();
//        group2.add(new Shape()); // circle
//        group2.add(new Shape()); // circle
//
//        var group = new Group();
//        group.add(group1);
//        group.add(group2);
//        group.render();
//        group.move();
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
