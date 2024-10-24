package Test;
public class SumOfNumbers {
public static void main(String[] args) {
int i = 1, sum = 0;
do {
	sum += i; //sum=sum+i;
	i++;
} 
while (i <= 10);
	System.out.println("The sum of numbers from 1 to 10 is: " + sum);
}
public static int calculateSum(int start, int end) {
	int i = start, sum = 0;
	do {
		sum += i;
		i++;} 
			while (i <= end);
				return sum;

}
}


package Test;
import org.junit.Assert;
import org.junit.Test;
public class SumOfNumbersTest {
@Test
public void testPositiveValuesInRange() {
int expectedSum = 55;
int actualSum=SumOfNumbers.calculateSum(1,10);
Assert.assertEquals(actualSum,expectedSum);
}
@Test
public void testNegativeValuesInRange() {
int expectedSum =0;
int actualSum=SumOfNumbers.calculateSum(-10,10);
Assert.assertEquals(actualSum,expectedSum);
}
@Test
public void testOutOfRange() {
//int expectedSum=155
int expectedSum = 0;
int actualSum =SumOfNumbers.calculateSum(11,20);
Assert.assertEquals(actualSum,expectedSum);
}
}
