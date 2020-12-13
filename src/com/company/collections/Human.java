package com.company.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Human implements Comparable<Human> {
    private String name;
    private Integer age;
    private Date birthday;
    //Устаревший
    //Хранит время в милисекундах с какого-то января какого-то 1970

    public Human() {
        name = null;
        age = null;
    }

    public Human(String name, Date date) {
        this.name = name;
        this.birthday = date;
        setAge(date);
    }

    public Human(String name) {
        this.name = name;
        input(new Scanner(System.in));
    }

    public void setAge(Date data) {
        this.birthday = birthday;

        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(birthday);

        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if ((birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH)) ||
                (birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH)) &&
                        (birthDate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))
        )
            age--;
        setAge(age);
    }


    //Сформираовть спсиок людей и найти самого старшего и младшего
    //Возраст вывести. Сколько лет, месяцев, дней
    private void input(Scanner scanner) {
        //  System.out.println("Data: dd.mm.yyyy");
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Data: dd.mm.yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        String str = scanner.nextLine();
        try {
            setBirthday(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        setAgeByDate(getBirthday());
    }

    public String getBirth() {

        Calendar birthDate = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        birthDate.setTime(birthday);
        Calendar delta = Calendar.getInstance();
        delta.setTimeInMillis(today.getTimeInMillis() - birthDate.getTimeInMillis());
        int month = delta.get(Calendar.MONTH);
        int day = delta.get(Calendar.DAY_OF_MONTH);
        int year = delta.get(Calendar.YEAR) - 1970;

        return "DAY:" + day + '\'' + "MONTH:" + month + '\'' + "YEAR:" + year;
    }

    private void setAgeByDate(Date birthday) {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(birthday);
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        //Сколько лет прошло с 1го января 1970
        if ((birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))
                || (birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
                && (birthDate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH)))
            age--;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Human o) {
        return age - o.age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + (new SimpleDateFormat("dd/MM/yyyy")).format(birthday) +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
