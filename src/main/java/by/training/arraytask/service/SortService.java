package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;

public interface SortService {

    void bubbleSort(CustomArray customArray);

    void selectionSort(CustomArray customArray);

    void insertionSort(CustomArray customArray);

    void sortUsingStream(CustomArray customArray);
}
