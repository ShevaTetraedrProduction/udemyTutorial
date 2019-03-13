public class Challenge30 {

    static final String[] monthUkr = {"Січень", "Лютий", "Березень", "Квітень", "Травень", "Червень", "Липень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень"};
    static final String[] monthEng = {"January", " February", " March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public void lesson() {
        char s = 'K';


       symvol(s);
        System.out.println("======================");
        monthes(2);
        System.out.println("======================");
        monthes(1,12);


    }

private void symvol(char s){
    switch (s) {
        case 'A':
            System.out.println("It is " + s);
            break;

        case 'B':
            System.out.println("It is " + s);
            break;

        case 'C':
            System.out.println("It is " + s);
            break;

        case 'D':
        case 'E':
            System.out.println("It is " + s);
            break;

        default:
            System.out.println("Somthing else -->" + s);
            break;
    }
}

    private void monthes(int month) {
        month--;
        System.out.println(monthUkr[month] + "-->" + monthEng[month]);
    }

    private void monthes(int f, int s) {
        if (f < s)
            for (int i = f-1; i < s ; i++) {
                System.out.println(monthUkr[i] + "-->" + monthEng[i]);
            }
    }
}
