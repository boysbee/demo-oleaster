package com.demo.oleaster.fizzbuzz;

import com.mscharhag.oleaster.runner.OleasterRunner;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static com.mscharhag.oleaster.matcher.Matchers.expect;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by boysbee on 7/16/2015.
 */
@RunWith(OleasterRunner.class)
public class FizzBuzzWithMockitoTest {
    private FizzBuzz fizzBuzz;

    {

        describe("FizzBuzz", () -> {
            beforeEach(() -> {
                fizzBuzz = mock(FizzBuzz.class);
            });
            afterEach(()->{
                fizzBuzz = null;
            });
            it("put 1 get result is 1", () -> {
                when(fizzBuzz.getResult(1)).thenReturn("1");
                expect(fizzBuzz.getResult(1)).toEqual("1");
                verify(fizzBuzz).getResult(1);
            });
            it("put 2 get result is 2", () -> {
                when(fizzBuzz.getResult(2)).thenReturn("2");
                expect(fizzBuzz.getResult(2)).toEqual("2");
                verify(fizzBuzz).getResult(2);
            });
            it("put 3 get result is fizz", () -> {
                when(fizzBuzz.getResult(3)).thenReturn("fizz");
                expect(fizzBuzz.getResult(3)).toEqual("fizz");
                verify(fizzBuzz).getResult(3);
            });
            it("put 4 get result is 4", () -> {
                when(fizzBuzz.getResult(4)).thenReturn("4");
                expect(fizzBuzz.getResult(4)).toEqual("4");
                verify(fizzBuzz).getResult(4);
            });
            it("put 5 get result is buzz", () -> {
                when(fizzBuzz.getResult(5)).thenReturn("buzz");
                expect(fizzBuzz.getResult(5)).toEqual("buzz");
                verify(fizzBuzz).getResult(5);
            });
            it("put 6 get result is fizz", () -> {
                when(fizzBuzz.getResult(6)).thenReturn("fizz");
                expect(fizzBuzz.getResult(6)).toEqual("fizz");
                verify(fizzBuzz).getResult(6);
            });
            it("put 10 get result is buzz", () -> {
                when(fizzBuzz.getResult(10)).thenReturn("buzz");
                expect(fizzBuzz.getResult(10)).toEqual("buzz");
                verify(fizzBuzz).getResult(10);
            });
            it("result is fizz when dividable by 3", () -> {
                when(fizzBuzz.getResult(9)).thenReturn("fizz");
                expect(fizzBuzz.getResult(9)).toEqual("fizz");
                verify(fizzBuzz).getResult(9);
            });
            it("result is buzz when dividable by 5", () -> {
                when(fizzBuzz.getResult(10)).thenReturn("buzz");
                when(fizzBuzz.getResult(25)).thenReturn("buzz");

                expect(fizzBuzz.getResult(10)).toEqual("buzz");
                verify(fizzBuzz).getResult(10);
                expect(fizzBuzz.getResult(25)).toEqual("buzz");
                verify(fizzBuzz).getResult(25);
            });
            it("result is fizzbuzz when dividable by 3 and 5", () -> {
                when(fizzBuzz.getResult(15)).thenReturn("fizzbuzz");
                when(fizzBuzz.getResult(30)).thenReturn("fizzbuzz");
                when(fizzBuzz.getResult(45)).thenReturn("fizzbuzz");

                expect(fizzBuzz.getResult(15)).toEqual("fizzbuzz");
                verify(fizzBuzz).getResult(15);
                expect(fizzBuzz.getResult(30)).toEqual("fizzbuzz");
                verify(fizzBuzz).getResult(30);
                expect(fizzBuzz.getResult(45)).toEqual("fizzbuzz");
                verify(fizzBuzz).getResult(45);
            });
        });
    }
}
