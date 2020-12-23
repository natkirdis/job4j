package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );

        Comparator<Job> combDescNameDescPriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        Comparator<Job> combAscNameDescPriority = new JobAscByName()
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, combDescNameDescPriority);
        System.out.println(jobs);
        Collections.sort(jobs, combAscNameDescPriority);
        System.out.println(jobs);
    }
}