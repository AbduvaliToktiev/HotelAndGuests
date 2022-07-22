import java.sql.*;
import java.util.Scanner;

public class Connect implements WorkHotel {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "abdutokt2004";


    public Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void showAllClients() throws SQLException {
        Statement statement = connection().createStatement();
        String sql_clients = "select * from clients";
        ResultSet resultSet = statement.executeQuery(sql_clients);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getInt("number")
                    + " " + resultSet.getString("name"));
        }
    }

    public void addClients() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String sql_client = "insert into clients (id, number, name) values (?, ?, ?)";
        PreparedStatement preparedStatement = connection().prepareStatement(sql_client);
        System.out.println("Введите id клиента");
        int idClient = sc.nextInt();
        preparedStatement.setInt(1, idClient);
        System.out.println("Введите номер клиента:");
        int clientsNumber = sc.nextInt();
        preparedStatement.setInt(2, clientsNumber);
        System.out.println("Введите имя клиента:");
        sc.nextLine();
        String clientsName = sc.nextLine();
        preparedStatement.setString(3, clientsName);
        preparedStatement.executeUpdate();
    }

    public void deleteClient() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String sql_delete_client = "delete from clients where id = ?";
        PreparedStatement preparedStatement = connection().prepareStatement(sql_delete_client);
        System.out.println("Введите id для удаления клиента");
        int client_delete = sc.nextInt();
        preparedStatement.setInt(1, client_delete);
        preparedStatement.executeUpdate();
    }

    public void showAllRooms() throws SQLException {
        Statement statement = connection().createStatement();
        String SQL_SELECT_ROOMS = "select * from hotel_rooms";
        ResultSet resultSet = statement.executeQuery(SQL_SELECT_ROOMS);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getInt("hostel_id")
                    + " " + resultSet.getString("booking") + " " + resultSet.getString("booking_before"));
        }
    }

    public void  roomReservation() throws Exception {
        Scanner sc = new Scanner(System.in);
        String sql_rooms = "update hotel_rooms set booking = ?, booking_before = ? where id = ?";
        PreparedStatement preparedStatement = connection().prepareStatement(sql_rooms);
        System.out.println("Введите id вашего номера");
        int idRoom = sc.nextInt();
        preparedStatement.setInt(1, idRoom);
        System.out.println("Дата вашего бронирования: {dd/MM/YYYY} например {08/12/1999}");
        preparedStatement.setDate(2, readDate());
        System.out.println("До какого числа вы бранируете: {dd/MM/YYYY} например {08/12/1999}");
        preparedStatement.setDate(3, readDate());
    }
}
