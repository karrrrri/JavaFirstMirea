package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;
import ru.mirea.task24.IP;

import java.util.ArrayList;
import java.util.Arrays;

public class Tests {
    @Test
    public void validate() {
        ArrayList<String> testData = new ArrayList<>(Arrays.asList("127.0.0.1", "abc.def.gha.bcd"));
        ArrayList<Boolean> expected = new ArrayList<>(Arrays.asList(true, true));
        ArrayList<Boolean> actual = new ArrayList<>();

        IP validator = new IP();
        boolean temp = true;
        for (String value : testData) {
            validator.check_ipv4(value);
            actual.add(temp);
        }

        Assert.assertEquals(expected, actual);
    }
}