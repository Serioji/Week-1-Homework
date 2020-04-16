package mat;

public class Balcony {
    public static void main(String[] args) {
        Switch();




    }
    public static void Switch() {
        int Name = 4;
        String floor;

        switch(Name) {
            case 1:
                floor = "8";
                System.out.println("Здравей Мими");
                break;
            case 2:
                floor = "7";
                System.out.println("Здравей Пепи");

                break;
            case 3:
                floor = "6";
                System.out.println("Здравей Ваня");
                break;
            case 4:
                floor = "5";
                System.out.println("Здравей Иван");
                break;
            case 5:
                floor = "4";
                System.out.println("Здравей Гопе");
                break;
            case 6:
                floor = "3";
                System.out.println("Здравей Лъчко");
                break;
            case 7:
                floor = "2";
                System.out.println("Здравей Дара");
                break;
            case 8:
                floor = "1";
                System.out.println("Здравей Наташа");
                break;
            case 9:
                floor = "0";
                System.out.println("Ауч!!");
                break;
            default:
                floor = "invalid floor";
                break;
        }
        System.out.println("Етажа е :" + floor);
    }

}
