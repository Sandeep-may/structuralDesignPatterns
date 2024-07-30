package com.codewithmosh;

import com.codewithmosh.decorator.Stream;
import com.codewithmosh.proxy.EbookProxy;
import com.codewithmosh.proxy.Library;
import com.codewithmosh.proxy.LoggingEbookProxy;
import com.codewithmosh.proxy.RealEbook;

public class Main {
    public static void main(String[] args) {
        //----proxy pattern----
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
//        //----bridge pattern----
//        var remoteControl = new RemoteControl(new SamsungTV());
//        remoteControl.turnOn();
        //----flyweight pattern----
//        var service = new PointService(new PointIconFactory());
//        for (var point : service.getPoints())
//            point.draw();
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
