package com.company.individ1.models.otdel;

import com.company.individ1.models.table.FullTimeWorkersTable;
import com.company.individ1.models.workList.HourlyWorkersWorkList;
import com.company.individ1.models.workList.Work;
import com.company.individ1.models.workers.FullTimeWorker;
import com.company.individ1.models.workers.HourlyWorker;
import com.company.individ1.models.workers.Worker;

import java.util.ArrayList;

public class Otdel implements MyOtdel {
    ArrayList<Worker> workers;
    FullTimeWorkersTable fullTimeWorkersTable;
    HourlyWorkersWorkList hourlyWorkersWorkList;
    String name;

    public Otdel(String name){
        workers = new ArrayList<>();
        this.name = name;
    }

    public Otdel(String name, ArrayList<Worker> workers) {
        this.workers = workers;
        this.name = name;
    }

    public Otdel(ArrayList<Worker> workers, FullTimeWorkersTable fullTimeWorkersTable, HourlyWorkersWorkList hourlyWorkersWorkList, String name) {
        this.workers = workers;
        this.fullTimeWorkersTable = fullTimeWorkersTable;
        this.hourlyWorkersWorkList = hourlyWorkersWorkList;
        this.name = name;
    }

    public void setFullTimeWorkersTable(FullTimeWorkersTable fullTimeWorkersTable) {
        this.fullTimeWorkersTable = fullTimeWorkersTable;
    }

    public void setHourlyWorkersWorkList(HourlyWorkersWorkList hourlyWorkersWorkList) {
        this.hourlyWorkersWorkList = hourlyWorkersWorkList;
    }

    public Otdel add(Worker worker){
        workers.add(worker);
        worker.attachOtdel(this);
        return this;
    }

    @Override
    public void quitMe(Worker worker) {
        workers.remove(worker);
        if(worker instanceof FullTimeWorker)
            fullTimeWorkersTable.remove((FullTimeWorker) worker);
        if(worker instanceof HourlyWorker)
            hourlyWorkersWorkList.remove((HourlyWorker) worker);
        worker.deleteOtdel();
    }

    @Override
    public String getName() {
        return name;
    }

    public String outputWorkers(){
        StringBuilder str = new StringBuilder();
        for (Worker worker : workers) {
            str.append("   ").append(worker.output());
        }
        return str.toString();
    }



    @Override
    public String toString() {
        return "Otdel{" +
                "workers=" + outputWorkers() + "\n" +
                hourlyWorkersWorkList + "\n" +
                fullTimeWorkersTable +
                '}';
    }
}
