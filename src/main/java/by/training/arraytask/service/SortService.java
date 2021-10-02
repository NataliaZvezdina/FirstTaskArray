package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;

public interface SortService {

    void bubbleSort(CustomArray customArray) throws CustomArrayException;

    void selectionSort(CustomArray customArray) throws CustomArrayException;

    void insertionSort(CustomArray customArray) throws CustomArrayException;

    void sortUsingStream(CustomArray customArray) throws CustomArrayException;
}
