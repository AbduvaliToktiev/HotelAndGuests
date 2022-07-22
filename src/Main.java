import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Connect connect = new Connect();
        connect.connection();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("�������� ��������:");
            System.out.println("1) ������ � ���������");
            System.out.println("2) ������ � ��������");
            System.out.println("0) ����� �� ���������");
            int choice = sc.nextInt();
            if (choice == 1) {
                // ����� ��� ������ � ���������
                customerService();
            } else if (choice == 2) {
                // ����� ��� ������ � ��������
                workWithNumbers();
            } else if (choice == 0) {
                // �����  �� ���������
                System.exit(0);
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("������. ������� ����� �� ����!!!");
                break;
            }
        }
    }

    public static void customerService() throws Exception {
        Connect connect = new Connect();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("�������� ��������:");
            System.out.println("1) �������� ���� ��������");
            System.out.println("2) �������� �������");
            System.out.println("3) ������� �������");
            System.out.println("0) ����� � ������� ����");
            int choice = sc.nextInt();
            if (choice == 1) {
                // ����� ��� ��������� ���� ��������
                connect.showAllClients();
            } else if (choice == 2) {
                // ����� ��� ���������� �������
                connect.addClients();
            } else if (choice == 3) {
                // ����� ��� �������� �������
                connect.deleteClient();
            } else if (choice == 0) {
                // ����� � ������� ����
                System.out.println("-------------------------------------------------------------");
                System.out.println("����� � ������� ����...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("������. ������� ����� �� ����!!!");
            }
        }
    }

    public static void workWithNumbers() throws Exception {
        Connect connect = new Connect();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("�������� ��������:");
            System.out.println("1) ������ ���� �������");
            System.out.println("2) ������������� �����");
            System.out.println("0) ����� � ������� ����");
            int choice = sc.nextInt();
            if (choice == 1) {
                // ����� ��� ��������� ���� �������
                connect.showAllRooms();
            } else if (choice == 2) {
                // ����� ��� ������������ ������
                connect.roomReservation();
            } else if (choice == 0){
                // ����� � ������� ����
                System.out.println("-------------------------------------------------------------");
                System.out.println("����� � ������� ����...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("������. ������� ����� �� ����!!!");
            }
        }
    }
}

