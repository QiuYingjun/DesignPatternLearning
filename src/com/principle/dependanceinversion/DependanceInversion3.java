package com.principle.dependanceinversion;

public class DependanceInversion3 {
    public static void main(String[] args) {
        // 方式1：作为参数传进去
        TV tv = new TV();
        OpenAndClose1 op1 = new OpenAndClose1();
        op1.open(tv);
        op1.close(tv);

        // 方式2：通过构造函数传进去
        Radio radio = new Radio();
        OpenAndClose2 op2 = new OpenAndClose2(radio);
        op2.open();
        op2.close();

        // 方式3：用setter传进去
        Computer computer = new Computer();
        OpenAndClose3 op3 = new OpenAndClose3();
        op3.setDevice(computer);
        op3.open();
        op3.close();

    }
}

interface IDevice {
    public void play();

    public void stop();
}

class TV implements IDevice {
    @Override
    public void play() {
        System.out.println("TV plays");
    }

    @Override
    public void stop() {
        System.out.println("TV stops");
    }
}

class Radio implements IDevice {
    @Override
    public void play() {
        System.out.println("Radio plays");
    }

    @Override
    public void stop() {
        System.out.println("Radio stops");
    }
}

class Computer implements IDevice {
    @Override
    public void play() {
        System.out.println("Computer plays");
    }

    @Override
    public void stop() {
        System.out.println("Computer stops");
    }
}

// 方式1：作为参数传进去
interface IOpenAndClose1 {
    public void open(IDevice d);

    public void close(IDevice d);
}

class OpenAndClose1 implements IOpenAndClose1 {
    @Override
    public void open(IDevice device) {
        device.play();
    }

    @Override
    public void close(IDevice device) {
        device.stop();
    }
}

// 方式2：通过构造函数传进去
interface IOpenAndClose2 {
    public void open();

    public void close();
}

class OpenAndClose2 implements IOpenAndClose2 {
    private IDevice device;

    public OpenAndClose2(IDevice device) {
        this.device = device;
    }

    @Override
    public void open() {
        this.device.play();
    }

    @Override
    public void close() {
        this.device.stop();
    }
}

// 方式3：用setter传进去
interface IOpenAndClose3 {
    public void open();

    public void close();

    public void setDevice(IDevice device);
}

class OpenAndClose3 implements IOpenAndClose3 {
    private IDevice device;

    @Override
    public void setDevice(IDevice device) {
        this.device = device;
    }

    @Override
    public void open() {
        this.device.play();
    }

    @Override
    public void close() {
        this.device.stop();
    }
}