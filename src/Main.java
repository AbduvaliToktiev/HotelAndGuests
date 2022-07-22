import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Connect connect = new Connect();
        connect.connection();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите действие:");
            System.out.println("1) Работа с клиентами");
            System.out.println("2) Работа с номерами");
            System.out.println("0) Выход из программы");
            int choice = sc.nextInt();
            if (choice == 1) {
                // Метод для работы с клиентами
                customerService();
            } else if (choice == 2) {
                // Метод для работы с номерами
                workWithNumbers();
            } else if (choice == 0) {
                // Выход  из программы
                System.exit(0);
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
                break;
            }
        }
    }

    public static void customerService() throws Exception {
        Connect connect = new Connect();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите действие:");
            System.out.println("1) Показать всех клиентов");
            System.out.println("2) Добавить клиента");
            System.out.println("3) Удалить клиента");
            System.out.println("0) Выйти в главное меню");
            int choice = sc.nextInt();
            if (choice == 1) {
                // Метод для показания всех клиентов
                connect.showAllClients();
            } else if (choice == 2) {
                // Метод для добавления клиента
                connect.addClients();
            } else if (choice == 3) {
                // Метод для удаления клиента
                connect.deleteClient();
            } else if (choice == 0) {
                // Выход в главное меню
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в главное меню...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }

    public static void workWithNumbers() throws Exception {
        Connect connect = new Connect();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите действие:");
            System.out.println("1) Список всех номеров");
            System.out.println("2) Забронировать номер");
            System.out.println("0) Выйти в главное меню");
            int choice = sc.nextInt();
            if (choice == 1) {
                // Метод для показания всех номеров
                connect.showAllRooms();
            } else if (choice == 2) {
                // Метод для бронирования номера
                connect.roomReservation();
            } else if (choice == 0){
                // Выход в главное меню
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход в главное меню...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }
}

