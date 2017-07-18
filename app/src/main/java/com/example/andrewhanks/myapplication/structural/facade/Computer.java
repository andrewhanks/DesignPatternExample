package com.example.andrewhanks.myapplication.structural.facade;

/* Complex parts */
class CPU {
    public void freeze() {
        System.out.println("CPU freezes");
    }

    public void jump(long position) {
        System.out.println("CPU jumps to position: " + position);
    }

    public void execute() {
        System.out.println("CPU starts executing");
    }
}

class Memory {
    public void load(long position, String data) {
        System.out.println("Memory loads data to position: " + position + ", data: " + data);
    }
}

class HardDrive {
    public String read(long position, int size) {
        System.out.println("HardDrive reads data from position: " + position + ", size: " + size);
        String data = "Start system core";
        return data;
    }
}

/* Façade */
class Computer {
    public void startComputer() {
        final long BOOT_ADDRESS = 4096;
        final long BOOT_SECTOR = 16384;
        final int SECTOR_SIZE = 1024;

        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}