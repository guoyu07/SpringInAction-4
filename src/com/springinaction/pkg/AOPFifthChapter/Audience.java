package com.springinaction.pkg.AOPFifthChapter;

/**
 * Created by ilya on 15.06.15.
 */
public class Audience {
    public void takeSeats() {//Before show
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() {//before show
        System.out.println("The audience is turning off their cellphones.");
    }

    public void applaud() {//after show
        System.out.println("CLAP CLAP CLAP CLAP CLAP!");
    }

    public void demandRefund() {//after unlucky show
        System.out.println("Boo! We want our money back");
    }

}
