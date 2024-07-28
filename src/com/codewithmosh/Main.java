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
import com.codewithmosh.facade.Message;
import com.codewithmosh.facade.NotificationServer;
import com.codewithmosh.facade.NotificationService;
import com.codewithmosh.flyweight.PointIconFactory;
import com.codewithmosh.flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        //----flyweight pattern----
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
        //----facade pattern----
//        var service = new NotificationService();
//        service.send("Hello World", "target");
        //----decorator pattern----
//        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
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
