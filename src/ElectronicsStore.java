import java.util.*;

public class ElectronicsStore {
    static Map<String, String> filterSettings = new HashMap<>();
    static Notebook notebook1 = new Notebook("Asus1", "windows10", "black", 15,
            "intel core-i3", 2.1, 8, "ssd", 250);
    static Notebook notebook2 = new Notebook("Asus2", "windows11", "grey", 17,
            "intel core-i5", 2.4, 16, "ssd", 500);
    static Notebook notebook3 = new Notebook("Acer1", "windows11", "black", 15,
            "intel core-i5", 2.4, 8, "ssd", 250);
    static Notebook notebook4 = new Notebook("Acer2", "windows10", "pink", 13,
            "intel core-i3", 2.1, 8, "hdd", 1000);
    static Notebook notebook5 = new Notebook("Samsung1", "windows10", "black", 14.5,
            "intel core-i5", 2.4, 8, "hdd", 500);
    static Notebook notebook6 = new Notebook("Samsung2", "windows10", "black", 15,
            "intel core-i3", 2.1, 8, "ssd", 250);
    static Notebook notebook7 = new Notebook("Dell1", "windows11", "silver", 16.2,
            "intel core-i7", 3.4, 32, "ssd", 1000);
    static Notebook notebook8 = new Notebook("Dell2", "windows11", "black", 15.4,
            "intel core-i3", 2.3, 8, "ssd", 500);
    static Notebook notebook9 = new Notebook("Lenovo1", "windows11", "grey", 17.2,
            "intel core-i5", 2.5, 16, "ssd", 750);
    static Notebook notebook10 = new Notebook("Lenovo2", "noOS", "black", 14.8,
            "intel core-i3", 2.1, 8, "ssd", 250);

    static Set<Notebook> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3,
            notebook4, notebook5, notebook6, notebook7, notebook8, notebook9, notebook10));

    public static void main(String[] args) {

        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("ГЛАВНОЕ МЕНЮ");
            System.out.println();
            System.out.println("Введите start, для настройки фильтра поиска ноутбуков");
            System.out.println("для завершения программы введите end");
            String command = scan.nextLine();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("start")) {
                filterSettings.clear();
                searchFilter();
            } else System.err.println("Ошибка! Введена неверная команда");
        }
    }

    public static void searchFilter() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("ФИЛЬТР");
            System.out.println();
            System.out.println("Выберите характетиристику, для добавления в фильтр: ");
            System.out.println(
                    "1 модель ноутбука      4 частота процессора(МГц)                7 объем памяти постоянного носителя(Гб)\n" +
                            "2 операционная система 5 объем оперативной памяти(Гб)           8 диагональ экрана(дюймы)\n" +
                            "3 модель процессора    6 тип постоянного носителя(hdd или ssd)  9 цвет\n" +
                            "Введите \n" +
                            "search - для начала поиска(хотя бы одна характеристика должна быть добавлена в фильтр)\n" +
                            "0 - для выхода в главное меню(настройки фильтра будут сброшены)");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    break;
                case "1":
                    System.out.println();
                    System.out.println("Введите модель ноутбука(Например Asus1, Acer2, Samsung1)");
                    String model = scanner.nextLine();
                    filterSettings.put("model", model);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Введите операционную систему(Например Windows10, Windows11)");
                    String os = scanner.nextLine();
                    filterSettings.put("os", os);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Введите модель процессора(Например intel core-i5, intel core-i7)");
                    String cpuType = scanner.nextLine();
                    filterSettings.put("cpuType", cpuType);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;
                case "4":
                    System.out.println();
                    System.out.println("Введите минимальную частоту процессора(МГц)");
                    String cpuSpeed = scanner.nextLine();
                    filterSettings.put("cpuSpeed", cpuSpeed);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;

                case "5":
                    System.out.println();
                    System.out.println("Введите минимальный объем оперативной памяти(Гб)");
                    String memory = scanner.nextLine();
                    filterSettings.put("memory", memory);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;
                case "6":
                    System.out.println();
                    System.out.println("тип постоянного носителя(hdd или ssd)");
                    String storageType = scanner.nextLine();
                    filterSettings.put("storageType", storageType);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;

                case "7":
                    System.out.println();
                    System.out.println("Введите минимальный объем памяти постоянного носителя(Гб)");
                    String storageSize = scanner.nextLine();
                    filterSettings.put("storageSize", storageSize);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;
                case "8":
                    System.out.println();
                    System.out.println("Введите минимальный размер диагонали экрана(дюймы)");
                    String displaySize = scanner.nextLine();
                    filterSettings.put("displaySize", displaySize);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;
                case "9":
                    System.out.println();
                    System.out.println("Введите цвет ноутбука(например black, grey, silver)");
                    String color = scanner.nextLine();
                    filterSettings.put("color", color);
                    System.out.println("Текущие настройки фильтра: ");
                    System.out.println(filterSettings);
                    searchFilter();
                    break;


                case "search":
                    scanner.close();
                    System.out.println("Запуск поиска с фильтром: ");
                    System.out.println(filterSettings);
                    searchNotebook();
                    break;
                default:
                    System.err.println("Ошибка! Неверная команда");
                    searchFilter();

            }
            break;
        }
    }

    private static void searchNotebook() {
        int count = 0;
        for (Notebook notebook : notebooks) {
            if (filterSettings.containsKey("model") && !notebook.getModel().equals(filterSettings.get("model"))) {
                continue;
            }
            if (filterSettings.containsKey("os") && !notebook.getOs().equals(filterSettings.get("os"))) {
                continue;
            }
            if (filterSettings.containsKey("cpuType") && !notebook.getCpuType().equals(filterSettings.get("cpuType"))) {
                continue;
            }
            if (filterSettings.containsKey("storageType") && !notebook.getStorageType().equals(filterSettings.get("storageType"))) {
                continue;
            }
            if (filterSettings.containsKey("color") && !notebook.getColor().equals(filterSettings.get("color"))) {
                continue;
            }
            if (filterSettings.containsKey("displaySize")) {
                if (notebook.getDisplaySize() < Double.parseDouble(filterSettings.get("displaySize"))) {
                    continue;
                }
            }
            if (filterSettings.containsKey("cpuSpeed")) {
                if (notebook.getCpuSpeed() < Double.parseDouble(filterSettings.get("cpuSpeed"))) {
                    continue;
                }
            }
            if (filterSettings.containsKey("memory")) {
                if (notebook.getMemory() < Integer.parseInt(filterSettings.get("memory"))) {
                    continue;
                }
            }
            if (filterSettings.containsKey("storageSize")) {
                if (notebook.getStorageSize() < Integer.parseInt(filterSettings.get("storageSize"))) {
                    continue;
                }
            }
            System.out.println(notebook);
            count++;
        }
        if (count == 0) {
            System.out.println();
            System.out.println("К сожалению, подходящий товар не найден. Попробуйте изменить критерии поиска");
        }
    }


}