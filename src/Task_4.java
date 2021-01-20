public class Task_4 {
    public static void main(String[] args) {

        int searchDay = 240;
        int dayWeek = 3;

        int i = 1;
        while (i < searchDay) {

            if (dayWeek == 7) {
                dayWeek = 1;
            } else {
                dayWeek++;
            }

            i++;
        }

        String day = "";

        switch (dayWeek) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Не знаю(";
        }

        System.out.println("Номер дня недели: " + dayWeek + ". Это будет - " + day);
    }
}
