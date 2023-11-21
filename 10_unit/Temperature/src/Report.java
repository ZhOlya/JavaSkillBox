import java.util.Arrays;

public class Report {

    public void generatePatientsTemperatures(float[] generateTemp) {
        for (int i = 0; i < generateTemp.length; i++) {
            float temperature = (float) (Math.random() * (40 - 32) + 32); //√енерируем рандомную температуру в диапозоне 32-40
            generateTemp[i] = Math.round(temperature * 10) / 10.0f;// добавл€ем температуру в массив, округл€€ до дес€тых
        }
        System.out.println("Patients` temperatures: " + Arrays.toString(generateTemp));
    }

    public void getReport(float[] temp) { //ќтчет о средней температуре и количестве здоровых паицентов
        generatePatientsTemperatures(temp);
        float total = 0;
        float sum = 0;
        int healthCount = 0;

        for (int i = 0; i < temp.length; i++) {
            total += temp[i];
//            int compareMin = Float.compare(temp[i], 36.2f);
//            int compareMax = Float.compare(temp[i], 36.9f);
//            if (compareMin > 0 && compareMax < 0){          //расчет количества здоровых пациентов 36.2  36.9
//                healthCount++;
//            }
            if (temp[i] <= 36.9 && temp[i] >= 36.2){         //расчет количества здоровых пациентов 36.2  36.9
                healthCount++;
            }
        }
        sum = Math.round(total / temp.length * 10) / 10.0f;  //рассчитываем среднее арифметическое
        System.out.println("Medium temperature is " + sum);
        System.out.println("Numbers of patients with a normal temperature: " + healthCount);
    }
}
