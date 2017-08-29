package com.vivz.multithreading.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * MyRecursiveTask class is an Example of RecursiveTask
 * Step in ForkJoinPool which follow two steps i.e.
 * Fork Step and Join Step to merge the all results
 *
 * A RecursiveTask is a task that returns a result.
 * It may split its work up into smaller tasks, and
 * merge the result of these smaller tasks into a
 * collective result. The splitting and merging may
 * take place on several levels.
 *
 * Created by vivekdwivedi on 8/29/2017.
 */
public class MyRecursiveTask extends RecursiveTask<Long>{

    private long workLoad = 0;

    public MyRecursiveTask(long workLoad){
        this.workLoad = workLoad;
    }
    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected Long compute() {
        long result = 0;
        if(this.workLoad > 16){
            System.out.println("Splitting Workload :: "+this.workLoad);
            List<MyRecursiveTask> subTasks = new ArrayList<>();
            subTasks.addAll(createSubTasks());

            subTasks.forEach(tasks -> {
                tasks.fork();
            });


            for(MyRecursiveTask tasks : subTasks){
                result += tasks.join();
            }

            return result;
        }else{
            System.out.println("Doing workLoad myself :: "+this.workLoad);
            return this.workLoad * 3;
        }
    }

    /**
     * createSubTasks Method Creates SubTasks
     * for ForkJoinPool to execute Task
     * @return
     */
    private List<MyRecursiveTask> createSubTasks(){
        List<MyRecursiveTask> subTasks = new ArrayList<>();

        MyRecursiveTask subTask1 = new MyRecursiveTask(this.workLoad / 2);
        MyRecursiveTask subTask2 = new MyRecursiveTask(this.workLoad / 2);
        subTasks.add(subTask1);
        subTasks.add(subTask2);

        return subTasks;
    }
}
