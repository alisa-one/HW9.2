package com.company;

public class VegeteType extends AgroProduct {

    private String kind;


    private TypeDelivery TypeOfDelivery;




    public String getKind() {

        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }


    public  VegeteType(String s, String kind, Sclad Sclad, TypeDelivery TypeDelivery, String owner, int volumeFact) {

        super.setSclad(Sclad.getNameSclad());
        super.setOwner();
        this.kind = kind;
        this.TypeOfDelivery=TypeDelivery;


    }

    public final void VegeteType(String kind, Sclad sclad) {

        super.getSclad();
        this.kind = kind;
    }

    public  void VegeteType(String kind, int VolumeDeal) {

        super.getSclad();
        this.kind = kind;
    }



    public String getInfo() {
        return "Поставка = { вид продукта = "+kind +
                " Склад =   "+super.getSclad().getNameSclad()+ super.getSclad().getAdressSclad()+
                "владелец = "+ super.getOwner()+";  ";
    }
    private int generateVolumeDeal() {

        return (int) (Math.random() * 10 + 80000);
    }

}





