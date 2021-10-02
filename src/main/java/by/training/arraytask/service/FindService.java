package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;

public interface FindService {

    int findMax(CustomArray customArray) throws CustomArrayException;

    int findMin(CustomArray customArray) throws CustomArrayException;

    int findMaxUsingStream(CustomArray customArray) throws CustomArrayException;

    int findMinUsingStream(CustomArray customArray) throws CustomArrayException;
}
