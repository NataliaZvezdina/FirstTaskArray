package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;

public interface CustomArrayFindService {

    int findMax(CustomArray customArray) throws CustomArrayException;

    int findMin(CustomArray customArray) throws CustomArrayException;
}
