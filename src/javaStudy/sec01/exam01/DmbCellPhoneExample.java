package javaStudy.sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰" , "블랙" , 30);
        System.out.println(dmbCellPhone.color);
        System.out.println(dmbCellPhone.model);

        System.out.println(dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("ㅇㅇㅇ");
        dmbCellPhone.recceiveVoice("aaaa");
        dmbCellPhone.hangUp();


        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(25);
        dmbCellPhone.turnOffDmb();
    }
}
