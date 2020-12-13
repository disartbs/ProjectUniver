package com.company.individ1.models.table;

import com.company.individ1.models.workers.FullTimeWorker;

import java.util.Iterator;
import java.util.LinkedList;

public class FullTimeWorkersTable {
    LinkedList<Day> table;

    public FullTimeWorkersTable(LinkedList<Day> table) {
        this.table = table;
    }

    public FullTimeWorkersTable() {
        table = new LinkedList<>();
    }

    public void remove(FullTimeWorker worker) {
        Iterator<Day> iterator = table.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (iterator.next().getWorker().equals(worker)) {
                table.remove(i);
                break;
            }
            i++;
        }
    }


    public void addDay(Day day) {
        table.add(day);
    }

    public void setDay(int index, Day day) {
        table.set(index, day);
    }

    public LinkedList<Day> getTable() {
        return table;
    }

    public void setTable(LinkedList<Day> table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "FullTimeWorkersTable{" +
                "table=" + table +
                '}';
    }
}
