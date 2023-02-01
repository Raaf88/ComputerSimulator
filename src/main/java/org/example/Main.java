package org.example;

import org.example.drive.HDDDrive;
import org.example.drive.SSDDrive;
import org.example.usbdevice.MemoryStick;
import org.example.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
       //HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();

        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("Rafał Lewandowski.doc"));
//        drive.listFile();
        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mouse");

        computer.addUsbDevice(memoryStick);
        computer.addUsbDevice(mouse);
        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);

    }
}