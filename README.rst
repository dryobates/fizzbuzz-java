FizzBuzz
========

http://codingdojo.org/kata/FizzBuzz/

Stage1
------

Write function, that returns:

- "fizz" if given number is divisible by 3
- "buzz" if given number is divisible by 5
- "fizzbuzz" if given number is divisible by 3 and 5
- given number as a string otherwise
- raises NumberNotInValidRangeException if number outside of [1;100]

Try to make it as simple and readable as possible.

Stage2
------

Extend existing code so that it returns:
- "fizz" if given number is divisible by 3 or contains 3
- "buzz" if given number is divisible by 5 or contains 5
- "fizzbuzz" if given number matches criteria for both "fizz" and "buzz"

Try to leave code in state, so that it would be open for extending in similar manner.
E.g. answering 'buzz' also when sum of digits is equal 5.

Stage3
------

Extend existing code with different type of change. Function should:
- return "wizz" if given number is divisible by 7
- return "fizzwizz" if matches existing criteria for "fizz" and matches criteria for "wizz"
- return "buzzwizz" if matches existing criteria for "buzz" and matches criteria for "wizz"
- return "fizzbuzzwizz" if matches existing criteria for "fizzbuzz" and matches criteria for "wizz"

Try to leave code in state, so that it would be open for extending in similar manner.
E.g. answering 'zizz' if given number is divisible by 11.
