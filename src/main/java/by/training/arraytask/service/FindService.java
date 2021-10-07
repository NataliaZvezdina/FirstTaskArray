package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import java.util.OptionalInt;

public interface FindService {

    int findMax(CustomArray customArray);

    int findMin(CustomArray customArray);

    OptionalInt findMaxUsingStream(CustomArray customArray);

    OptionalInt findMinUsingStream(CustomArray customArray);
}
