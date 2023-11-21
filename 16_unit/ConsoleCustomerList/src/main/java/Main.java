import java.util.Scanner;

public class Main {
    private static final String ADD_COMMAND = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static final String COMMAND_EXAMPLES = "\t" + ADD_COMMAND + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final String helpText = "Command examples:\n" + COMMAND_EXAMPLES;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();

        while (true) {
            try {
                String command = scanner.nextLine();
            String[] tokens = command.split("\\s+", 2);

                if (tokens[0].equals("add")) {
                    executor.addCustomer(tokens[1]);
                } else if (tokens[0].equals("list")) {
                    executor.listCustomers();
                } else if (tokens[0].equals("remove")) {
                    executor.removeCustomer(tokens[1]);
                } else if (tokens[0].equals("count")) {
                    System.out.println("There are " + executor.getCount() + " customers");
                } else if (tokens[0].equals("help")) {
                    System.out.println(helpText);
                } else {
                    System.out.println(COMMAND_ERROR);
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
           }
//            catch (IllegalAccessException e) {
//                e.getMessage();
//            }
        }
    }
}


/*
Проект ConsoleCustomerList — консольное приложение, в котором можно хранить список клиентов.
Запустите его, введите слово help в консоль и нажмите Enter. Программа выведет
 список доступных команд и примеры их выполнения.
Поэкспериментируйте с программой: попробуйте ввести различные значения и команды,
которые не будут соответствовать примерам. Добейтесь того, чтобы программа «вылетела»,то
 есть произошёл Exception.
Напишите в классе CustomerStorage проекта ConsoleCustomerListвсе варианты защиты
от некорректных данных, которые вам удастся придумать и обнаружить. Создайте
собственные классы исключений, которые должны выбрасываться:
при некорректном количестве компонентов в переданной строке с данными;
при неверном формате номера телефона;
при неправильном формате e-mail.
 */
