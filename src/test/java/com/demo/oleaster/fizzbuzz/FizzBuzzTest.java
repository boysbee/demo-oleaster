package com.demo.oleaster.fizzbuzz;

import com.mscharhag.oleaster.runner.OleasterRunner;
import org.junit.runner.RunWith;

import static com.mscharhag.oleaster.matcher.Matchers.expect;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.describe;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.it;

/**
 * Created by boysbee on 7/14/2015.
 */
@RunWith(OleasterRunner.class)
public class FizzBuzzTest {{
    describe("FizzBuzz", () -> {
        it("put 1 get result is 1", () -> {
            expect(FizzBuzz.getResult(1)).toEqual("1");
        });
        it("put 2 get result is 2", () -> {
            expect(FizzBuzz.getResult(2)).toEqual("2");
        });
        it("put 3 get result is fizz", () -> {
            expect(FizzBuzz.getResult(3)).toEqual("fizz");
        });
        it("put 4 get result is 4", () -> {
            expect(FizzBuzz.getResult(4)).toEqual("4");
        });
        it("put 5 get result is buzz", () -> {
            expect(FizzBuzz.getResult(5)).toEqual("buzz");
        });
        it("put 6 get result is fizz", () -> {
            expect(FizzBuzz.getResult(6)).toEqual("fizz");
        });
        it("put 10 get result is buzz", () -> {
            expect(FizzBuzz.getResult(10)).toEqual("buzz");
        });
        it("result is fizz when dividable by 3", () -> {
            expect(FizzBuzz.getResult(9)).toEqual("fizz");
        });
        it("result is buzz when dividable by 5", () -> {
            expect(FizzBuzz.getResult(10)).toEqual("buzz");
        });
        it("result is fizzbuzz when dividable by 3 and 5", () -> {
            expect(FizzBuzz.getResult(15)).toEqual("fizzbuzz");
        });
    });
}


}
