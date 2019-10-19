import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmstrongNumbersTest {

    @Test
    public void test1() {
        //given
        int number = 123;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }

    @Test
    public void test2() {
        //given
        int number = 153;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isTrue();
    }

    @Test
    public void test3() {
        //given
        int number = 1890;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }

    @Test
    public void test4() {
        //given
        int number = 8208;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isTrue();
    }

    @Test
    public void test5() {
        //given
        int number = 63102;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }

    @Test
    public void test6() {
        //given
        int number = 92727;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isTrue();
    }

}
