# csc402-assignment1
---

# Instructions for HW1.java

This program contains a set of utility methods for working with arrays in Java. Below are the instructions for understanding and testing the functionality of each method.

---

## **Methods Overview**

### 1. **`sum(double[] a)`**
   - **Description**: Computes the sum of all elements in the array.
   - **Edge Case**: If the array is empty, the method returns `0`.
   - **Usage**:
     ```java
     double[] array = {1.5, 2.5, 3.0};
     System.out.println(HW1.sum(array)); // Output: 7.0
     ```

### 2. **`all(int[] a, int x)`**
   - **Description**: Returns `true` if all elements in the array are equal to `x`. If the array is empty, it returns `true`.
   - **Usage**:
     ```java
     int[] array = {5, 5, 5};
     System.out.println(HW1.all(array, 5)); // Output: true
     ```

### 3. **`any(int[] a, int x)`**
   - **Description**: Returns `true` if any element in the array equals `x`. If the array is empty, it returns `false`.
   - **Usage**:
     ```java
     int[] array = {1, 2, 3};
     System.out.println(HW1.any(array, 2)); // Output: true
     ```

### 4. **`count(int[] a, int x)`**
   - **Description**: Counts the number of elements in the array that are equal to `x`. If the array is empty, it returns `0`.
   - **Usage**:
     ```java
     int[] array = {1, 2, 2, 3};
     System.out.println(HW1.count(array, 2)); // Output: 2
     ```

### 5. **`minValue(double[] list)`**
   - **Description**: Finds the minimum value in the array. Assumes the array is non-empty and contains no duplicates.
   - **Usage**:
     ```java
     double[] array = {1.5, -2.5, 3.0};
     System.out.println(HW1.minValue(array)); // Output: -2.5
     ```

### 6. **`minPosition(double[] list)`**
   - **Description**: Returns the index of the minimum value in the array. Assumes the array is non-empty and contains no duplicates.
   - **Usage**:
     ```java
     double[] array = {1.5, -2.5, 3.0};
     System.out.println(HW1.minPosition(array)); // Output: 1
     ```

### 7. **`distanceBetweenMinAndMax(double[] list)`**
   - **Description**: Computes the difference between the indices of the minimum and maximum values in the array. Assumes the array is non-empty and contains no duplicates.
   - **Usage**:
     ```java
     double[] array = {1.5, -2.5, 3.0};
     System.out.println(HW1.distanceBetweenMinAndMax(array)); // Output: 2
     ```

### 8. **`numUnique(double[] list)`**
   - **Description**: Counts the number of unique values in a sorted array. The array may be empty or contain duplicates.
   - **Usage**:
     ```java
     double[] array = {1.0, 1.0, 2.0, 3.0};
     System.out.println(HW1.numUnique(array)); // Output: 3
     ```

### 9. **`removeDuplicates(double[] list)`**
   - **Description**: Removes duplicate values from a sorted array and returns a new array with only unique values.
   - **Usage**:
     ```java
     double[] array = {1.0, 1.0, 2.0, 3.0};
     double[] result = HW1.removeDuplicates(array);
     System.out.println(Arrays.toString(result)); // Output: [1.0, 2.0, 3.0]
     ```

---

## **Testing the Methods**

### Running the Tests
1. Open the HW1.java file.
2. Locate the `main1` method, which contains test cases for all the methods.
3. Run the program to verify the output of each test case.

### Example Test Output
- **`sum` Method**:
  ```
  Tests for SUM
  array of size 0true
  array of size 2 [1,2]true
  ```
- **`minValue` Method**:
  ```
  minValue:
  -7 == minValue(new double[] { -7 }) true
  -7 == minValue(new double[] { 1, -4, -7, 7, 8, 11 }) true
  ```

---

## **Notes**
- Ensure the input arrays meet the assumptions specified in the method descriptions (e.g., sorted arrays for `numUnique` and `removeDuplicates`).
- The `main1` method is provided for testing purposes. You can add additional test cases as needed.

---
