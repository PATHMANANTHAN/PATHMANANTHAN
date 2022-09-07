
package com.example.demo;

class ArrayObject
{
     int[] numArray = {1, 2, 3};

     int[] getNumArray() {
        return numArray.clone();
    }
 }