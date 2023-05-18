import  java.util.Scanner;

public class BurcTakvimi {
    public static void main(String[] args) {

        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();


        if ((month<=12 && month >0)){
            // ocak ayı-----------------
            if (month ==1){
                if (day >0 && day<=31){
                if (day <=21){
                    System.out.print("Oğlak burcu");
                } else if (day >=22 ) {
                    System.out.print("Kova burcu");
                }
                } else {
                    System.out.print("ocak ayı 1-31 arasında olmalıdır");
                }
            }

                // şubat ayı------------
            if (month ==2){
                if (day >0 && day<=29){
                    if (day <=19){
                        System.out.print("Kova burcu");
                    } else if (day >=20 ) {
                        System.out.print("Balık burcu");
                    }
                } else {
                    System.out.print("Şubat ayı 1-29 arasında olmalıdır");
                }
            }

            // mart ayı------------
            if (month ==3){
                if (day >0 && day<=31){
                    if (day <=20){
                        System.out.print("Balık burcu");
                    } else if (day >=21 ) {
                        System.out.print("Koç burcu");
                    }
                } else {
                    System.out.print("mart ayı 1-31 arasında olmalıdır");
                }
            }

            // Nisan ayıı
            if (month ==4){
                if (day >0 && day<=30){
                    if (day <=20){
                        System.out.print("Koç burcu");
                    } else if (day >=21) {
                        System.out.print("Boğa burcu");
                    }
                } else {
                    System.out.print("Nisan ayı 1-30 arasında olmalıdır");
                }
            }

            //Mayıs ayı------
            if (month ==5){
                if (day >0 && day<=31){
                    if (day <=21){
                        System.out.print("Boğa  burcu");
                    } else if (day >=22 ) {
                        System.out.print("ikizler burcu");
                    }
                } else {
                    System.out.print("Mayıs ayı 1-31 arasında olmalıdır");
                }
            }


            //haziran ayı----------

            if (month ==6){
                if (day >0 && day<=30){
                    if (day <=22){
                        System.out.print("İkizler burcu");
                    } else if (day >=23 ) {
                        System.out.print("Yengeç burcu");
                    }
                } else {
                    System.out.print("Haziran ayı 1-30 arasında olmalıdır");
                }
            }

            //Temmuz ayı-------------

            if (month ==7){
                if (day >0 && day<=31){
                    if (day <=22){
                        System.out.print("Yengeç burcu");
                    } else if (day >=23 ) {
                        System.out.print("Aslan burcu");
                    }
                } else {
                    System.out.print("Temmuz ayı 1-31 arasında olmalıdır");
                }
            }

            //ağustos ayı----------
            if (month ==8){
                if (day >0 && day<=31){
                    if (day <=22){
                        System.out.print("Aslan burcu");
                    } else if (day >=23 ) {
                        System.out.print("Başak burcu");
                    }
                } else {
                    System.out.print("Ağustos ayı 1-31 arasında olmalıdır");
                }
            }

            // Eylül ayı-----------
            if (month ==9){
                if (day >0 && day<=30){
                    if (day <=22){
                        System.out.print("Başak burcu");
                    } else if (day >=23 ) {
                        System.out.print("Terazi burcu");
                    }
                } else {
                    System.out.print("Eylül ayı 1-30 arasında olmalıdır");
                }
            }

            //Ekim ayı------------------
            if (month ==10){
                if (day >0 && day<=31){
                    if (day <=22){
                        System.out.print("Terazi burcu");
                    } else if (day >=23 ) {
                        System.out.print("Akrep burcu");
                    }
                } else {
                    System.out.print("Ekim ayı 1-31 arasında olmalıdır");
                }
            }
            // kasım ayı----------
            if (month ==11){
                if (day >0 && day<=30){
                    if (day <=21){
                        System.out.print("Akrep burcu");
                    } else if (day >=22 ) {
                        System.out.print("Yay burcu");
                    }
                } else {
                    System.out.print("Kasım ayı 1-30 arasında olmalıdır");
                }
            }

            //Aralık ayı---------

            if (month ==12){
                if (day >0 && day<=31){
                    if (day <=21){
                        System.out.print("Yay burcu");
                    } else if (day >=22 ) {
                        System.out.print("Oğlak burcu");
                    }
                } else {
                    System.out.print("Temmuz ayı 1-31 arasında olmalıdır");
                }
            }


        }else {
            System.out.print("Doğduğunuz ay 1- 12 degerleri arasında olmalı");
        }



    }
}