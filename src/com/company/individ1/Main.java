package com.company.individ1;

import com.company.individ1.models.otdel.Otdel;
import com.company.individ1.models.table.Day;
import com.company.individ1.models.table.FullTimeWorkersTable;
import com.company.individ1.models.time.SimpleTime;
import com.company.individ1.models.workList.HourlyWorkersWorkList;
import com.company.individ1.models.workList.Work;
import com.company.individ1.models.workers.FullTimeWorker;
import com.company.individ1.models.workers.HourlyWorker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Otdel otdel = new Otdel("OOO");
        HourlyWorker hourlyWorker1;
        HourlyWorker hourlyWorker2;
        FullTimeWorker fullTimeWorker1;
        FullTimeWorker fullTimeWorker2;

        hourlyWorker1 = new HourlyWorker("Ivan", 1990, 60);
        hourlyWorker2 = new HourlyWorker("Igor", 1980, 70);
        fullTimeWorker1 = new FullTimeWorker("Erema", 1970, 20, 8, 1);
        fullTimeWorker2 = new FullTimeWorker("Oleg", 2000, 1, 10, 2);

        otdel.add(hourlyWorker1).add(hourlyWorker2).add(fullTimeWorker1).add(fullTimeWorker2);


        FullTimeWorkersTable fullTimeWorkersTable = new FullTimeWorkersTable();
        fullTimeWorkersTable.addDay(new Day(fullTimeWorker1, new GregorianCalendar(2020, 0, 10),
                new SimpleTime(9, 3), new SimpleTime(16, 30)));
        fullTimeWorkersTable.addDay(new Day(fullTimeWorker2, new GregorianCalendar(2020, 0, 10),
                new SimpleTime(15, 0), new SimpleTime(10, 0)));
        otdel.setFullTimeWorkersTable(fullTimeWorkersTable);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Scanner scanner = new Scanner(System.in);
        HourlyWorkersWorkList hourlyWorkersWorkList = new HourlyWorkersWorkList(new LinkedList<>());
        Date date1;
        System.out.println("Data: dd.MM.yyyy");
        String str = scanner.next();
        try {
            date1 = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            date1 = new Date(11111111111l);
        }

        otdel.setHourlyWorkersWorkList(hourlyWorkersWorkList);
        hourlyWorkersWorkList.addWork(new Work(hourlyWorker1, date1, 8));
        hourlyWorkersWorkList.addWork(new Work(hourlyWorker2, new GregorianCalendar(2020, 11, 5), 8));

        System.out.println(otdel);

        hourlyWorker1.quit();

        System.out.println("\n\n" + otdel);

    }
}
