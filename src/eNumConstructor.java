enum Beer{
    KF(70),
    KO(80),
    RC(90),
    FO;
    int price;
        Beer(int price){   //paramatized constructor
        this.price=price;
    }
    Beer( ){   //Non paramized constructor for FO;
        this.price=65;
    }
    public int getPrice()
    {
        return price;
    }
}
class eNumConstructor{
    public static void main(String[] args) {
        Beer[] b = Beer.values();
        for (Beer value : b) {
            System.out.println(value + "......." + value.getPrice());
        }

    }
}