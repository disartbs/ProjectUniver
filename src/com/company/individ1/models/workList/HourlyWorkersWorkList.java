package com.company.individ1.models.workList;

import com.company.individ1.models.workers.HourlyWorker;

import java.util.Iterator;
import java.util.LinkedList;

public class HourlyWorkersWorkList {

    LinkedList<Work> list;

    public HourlyWorkersWorkList(LinkedList<Work> list) {
        this.list = list;
    }

    public void remove(HourlyWorker worker) {
        Iterator<Work> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (iterator.next().getWorker().equals(worker)) {
                list.remove(i);
                break;
            }
            i++;
        }
    }

    public void addWork(Work work) {
        list.add(work);
    }

    public void setWork(int index, Work work) {
        list.set(index, work);
    }

    public LinkedList<Work> getList() {
        return list;
    }

    public void setList(LinkedList<Work> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "HourlyWorkersWorkList{" +
                "list=" + list +
                '}';
    }
}
