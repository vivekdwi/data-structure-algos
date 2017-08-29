package com.vivz.multithreading.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * MyRecursiveAction Class is an Example of RecursiveAction
 * Step in ForkJoinPool which follow 1 step i.e. Fork Step
 * to Divide the Task into smaller subTasks based on WorkLoad
 * Thresholds Level
 *
 * A RecursiveAction is a task which does not return any value.
 * It just does some work, e.g. writing data to disk, and then exits.
 * A RecursiveAction may still need to break up its work into smaller
 * chunks which can be executed by independent threads or CPUs.
 *
 * Created by vivekdwivedi on 8/29/2017.
 */
public class MyRecursiveAction extends RecursiveAction{

    private long workLoad = 0;

    public MyRecursiveAction(long workLoad){
        this.workLoad = workLoad;
    }

    /**
     * The main computation performed by this task.
     */
    @Override
    protected void compute() {

        if(this.workLoad > 16){
            System.out.println("Splitting Workload :: "+this.workLoad);
            List<MyRecursiveAction> subTasks = new ArrayList<>();
            subTasks.addAll(createSubTasks());

            subTasks.forEach(tasks -> {
                tasks.fork();
            });
        }else{
            System.out.println("Doing Workload myself :: "+this.workLoad);
        }
    }

    /**
     * createSubTasks Method Creates SubTasks
     * for ForkJoinPool to execute Task
     * @return
     */
    private List<MyRecursiveAction> createSubTasks(){
        List<MyRecursiveAction> subTasks = new ArrayList<>();

        MyRecursiveAction subTask1 = new MyRecursiveAction(this.workLoad / 2);
        MyRecursiveAction subTask2 = new MyRecursiveAction(this.workLoad / 2);
        subTasks.add(subTask1);
        subTasks.add(subTask2);

        return subTasks;
    }
}
