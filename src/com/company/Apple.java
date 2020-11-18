package com.company;

public final class Apple extends VegeteType {

    private TypeDelivery NameSclad;
    private  String sort;
    private TypeDelivery TypeDelivery;
    private int volumeFact;

    public Apple(String kind, String sort,Sclad Sclad, com.company.TypeDelivery TypeDelivery, String owner,  int volumeFact) {
        super(kind, sort, Sclad, TypeDelivery, owner, volumeFact);
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getWeght() {
        return volumeFact;
    }

    public void setVolumeFact(int volumeFact) {
        this.volumeFact = volumeFact;
    }

    public com.company.TypeDelivery getTypeDelivery() {
        return TypeDelivery;
    }

    public void setTypeDelivery(com.company.TypeDelivery typeDelivery) {
        TypeDelivery = typeDelivery;
    }


    public  String getInfo() {
        return super.getInfo()+ ",  сорт: "+sort+", " +
                " объем выхода со склада(тыс.т):  "+volumeFact+", " +
                " вид доставки:  "+ TypeDelivery+"  ";
    }
}
