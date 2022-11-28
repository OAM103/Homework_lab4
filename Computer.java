package com.metanit;

import java.util.Scanner;

public class Computer {
    public enum Trademark {
        Samsung(1),
        HP(2),
        Lenovo(3),
        Sony(4);

        private final int levelS;

        private Trademark(int levelS) {
            this.levelS = levelS;
        }
    }


    Memory memory;
    Monitor monitor;
    Processor processor;

    public class Memory extends Computer {
        public void Do() {
            System.out.println("Memory");
        }

    }
    public class Monitor extends Computer {
        public void Do() {
            System.out.println("Monitor");
        }

    }
    public class Processor extends Computer {
        public void Do() {
            System.out.println("Processor");
        }

    }

    public void Do() {
        this.memory = new Memory();
        this.monitor = new Monitor();
        this.processor = new Processor();
        this.processor.Do();
        this.memory.Do();
        this.monitor.Do();
        System.out.println("Computer is running" );
    }

    public static void main(String [] args) {
        Computer a = new Computer();
        a.Do();
        System.out.println ( Trademark.HP + " " +Trademark.HP.levelS);
    }

}
