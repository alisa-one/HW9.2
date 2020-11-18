package com.company;

public class Main {


    public static void main(String[] args) {

        Apple deal1 = new Apple("яблоки", "превосход", , "Ыссык-кульБаза", TypeDelivery.SCLAD_TO_MARKET,
                "ОсОО Рич", 50000);
        System.out.println(deal1.getInfo());

        Apple deal2 = new Apple("яблоки", "LLLL");
        System.out.println(deal2.getInfo());

        Apple deal3 = new Apple("яблоки", "голден", ,"КараколБаза", TypeDelivery.SCLAD_TO_FOREGN_BORDER,
                "ОсОО Путь",70000);

        System.out.println(deal3.getInfo());

        Apple deal4 = new Apple("яблоки", "ринат", ,"Каджи-Сай-База", TypeDelivery.SCLAD_TO_AVTO,
                "ОсОО Сары-Озон",60000);
        System.out.println(deal3.getInfo());

    }


}
