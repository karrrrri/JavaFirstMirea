package ru.mirea.task31;

import org.junit.runner.JUnitCore;
import ru.mirea.task30.Tests;
import org.junit.internal.TextListener;
import java.io.*;

public class Tests_md {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        ByteArrayOutputStream work = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(work);
        System.setOut(ps);

        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(Tests.class);

        System.out.flush();
        System.setOut(System.out);
        String testResult = work.toString();

        testResult = "Test \"127.0.0.1\", \"abc.def.gha.bcd\"" + testResult;
        testResult = testResult.trim();

        PrintWriter writer = new PrintWriter("/media/win10/Users/user/IdeaProjects/JavaFirstMirea/src/ru/mirea/task31/opt1/test_result.md");
        writer.println(testResult);
        writer.close();
    }
}