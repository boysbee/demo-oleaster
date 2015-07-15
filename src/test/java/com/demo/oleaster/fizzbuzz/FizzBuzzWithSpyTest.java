package com.demo.oleaster.fizzbuzz;

import com.mscharhag.oleaster.runner.OleasterRunner;
import org.junit.runner.RunWith;

import static com.mscharhag.oleaster.matcher.Matchers.expect;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by boysbee on 7/16/2015.
 */
@RunWith(OleasterRunner.class)
public class FizzBuzzWithSpyTest {
    private FizzBuzz spyFizzBuzz;

    {

        describe("FizzBuzz", () -> {
            beforeEach(() -> {
                spyFizzBuzz = spy(FizzBuzz.class);
            });
            afterEach(() -> {
                spyFizzBuzz = null;
            });
            it("put 1 get result is 1", () -> {
                doReturn("1").when(spyFizzBuzz).getResult(1);
                String result = spyFizzBuzz.getResult(1);
                expect(result).toEqual("1");
                verify(spyFizzBuzz).getResult(1);
            });
            it("put 3 get result is fizz", () -> {
                doReturn("fizz").when(spyFizzBuzz).getResult(3);
                String result = spyFizzBuzz.getResult(3);
                expect(result).toEqual("fizz");
                verify(spyFizzBuzz).getResult(3);
            });
            it("put 5 get result is buzz", () -> {
                doReturn("buzz").when(spyFizzBuzz).getResult(5);
                String result = spyFizzBuzz.getResult(5);
                verify(spyFizzBuzz).getResult(5);
            });
            it("put 6 get result is fizz", () -> {
                doReturn("fizz").when(spyFizzBuzz).getResult(6);
                spyFizzBuzz.getResult(6);
                verify(spyFizzBuzz).getResult(6);
            });
            it("put 10 get result is buzz", () -> {
                doReturn("buzz").when(spyFizzBuzz).getResult(10);
                spyFizzBuzz.getResult(10);
                verify(spyFizzBuzz).getResult(10);
            });
            it("result is fizz when dividable by 3", () -> {
                doReturn("fizz").when(spyFizzBuzz).getResult(9);
                spyFizzBuzz.getResult(9);
                verify(spyFizzBuzz).getResult(9);
            });
            it("result is buzz when dividable by 5", () -> {
                doReturn("buzz").when(spyFizzBuzz).getResult(10);
                doReturn("buzz").when(spyFizzBuzz).getResult(25);

                spyFizzBuzz.getResult(10);
                verify(spyFizzBuzz).getResult(10);
                spyFizzBuzz.getResult(25);
                verify(spyFizzBuzz).getResult(25);
            });
            it("result is fizzbuzz when dividable by 3 and 5", () -> {
                doReturn("fizzbuzz").when(spyFizzBuzz).getResult(15);
                doReturn("fizzbuzz").when(spyFizzBuzz).getResult(30);
                doReturn("fizzbuzz").when(spyFizzBuzz).getResult(45);

                spyFizzBuzz.getResult(15);
                verify(spyFizzBuzz).getResult(15);
                spyFizzBuzz.getResult(30);
                verify(spyFizzBuzz).getResult(30);
                spyFizzBuzz.getResult(45);
                verify(spyFizzBuzz).getResult(45);
                verify(spyFizzBuzz, times(9));
            });
        });
    }
}
