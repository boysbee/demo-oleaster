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
public class FizzBuzzWithMockTest {
    private FizzBuzz mockFizzBuzz;

    {

        describe("FizzBuzz", () -> {
            beforeEach(() -> {
                mockFizzBuzz = mock(FizzBuzz.class);
            });
            afterEach(()->{
                mockFizzBuzz = null;
            });
            it("put 1 get result is 1", () -> {
                when(mockFizzBuzz.getResult(1)).thenReturn("1");
                expect(mockFizzBuzz.getResult(1)).toEqual("1");
                verify(mockFizzBuzz).getResult(1);
            });
            it("put 2 get result is 2", () -> {
                when(mockFizzBuzz.getResult(2)).thenReturn("2");
                expect(mockFizzBuzz.getResult(2)).toEqual("2");
                verify(mockFizzBuzz).getResult(2);
            });
            it("put 3 get result is fizz", () -> {
                when(mockFizzBuzz.getResult(3)).thenReturn("fizz");
                expect(mockFizzBuzz.getResult(3)).toEqual("fizz");
                verify(mockFizzBuzz).getResult(3);
            });
            it("put 4 get result is 4", () -> {
                when(mockFizzBuzz.getResult(4)).thenReturn("4");
                expect(mockFizzBuzz.getResult(4)).toEqual("4");
                verify(mockFizzBuzz).getResult(4);
            });
            it("put 5 get result is buzz", () -> {
                when(mockFizzBuzz.getResult(5)).thenReturn("buzz");
                expect(mockFizzBuzz.getResult(5)).toEqual("buzz");
                verify(mockFizzBuzz).getResult(5);
            });
            it("put 6 get result is fizz", () -> {
                when(mockFizzBuzz.getResult(6)).thenReturn("fizz");
                expect(mockFizzBuzz.getResult(6)).toEqual("fizz");
                verify(mockFizzBuzz).getResult(6);
            });
            it("put 10 get result is buzz", () -> {
                when(mockFizzBuzz.getResult(10)).thenReturn("buzz");
                expect(mockFizzBuzz.getResult(10)).toEqual("buzz");
                verify(mockFizzBuzz).getResult(10);
            });
            it("result is fizz when dividable by 3", () -> {
                when(mockFizzBuzz.getResult(9)).thenReturn("fizz");
                expect(mockFizzBuzz.getResult(9)).toEqual("fizz");
                verify(mockFizzBuzz).getResult(9);
            });
            it("result is buzz when dividable by 5", () -> {
                when(mockFizzBuzz.getResult(10)).thenReturn("buzz");
                when(mockFizzBuzz.getResult(25)).thenReturn("buzz");

                expect(mockFizzBuzz.getResult(10)).toEqual("buzz");
                verify(mockFizzBuzz).getResult(10);
                expect(mockFizzBuzz.getResult(25)).toEqual("buzz");
                verify(mockFizzBuzz).getResult(25);
            });
            it("result is fizzbuzz when dividable by 3 and 5", () -> {
                when(mockFizzBuzz.getResult(15)).thenReturn("fizzbuzz");
                when(mockFizzBuzz.getResult(30)).thenReturn("fizzbuzz");
                when(mockFizzBuzz.getResult(45)).thenReturn("fizzbuzz");

                expect(mockFizzBuzz.getResult(15)).toEqual("fizzbuzz");
                verify(mockFizzBuzz).getResult(15);
                expect(mockFizzBuzz.getResult(30)).toEqual("fizzbuzz");
                verify(mockFizzBuzz).getResult(30);
                expect(mockFizzBuzz.getResult(45)).toEqual("fizzbuzz");
                verify(mockFizzBuzz).getResult(45);

                verify(mockFizzBuzz,times(9));
            });
        });
    }
}
