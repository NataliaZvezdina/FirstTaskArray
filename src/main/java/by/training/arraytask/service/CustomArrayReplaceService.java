package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;

public interface CustomArrayReplaceService {

    void replaceElementByIndex(CustomArray array, int index, int newElement) throws CustomArrayException;
}
