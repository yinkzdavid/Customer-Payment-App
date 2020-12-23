package com.yinkz.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneNumberValidatorTest {


    private PhoneNumberValidator underTest;


    @BeforeEach
    void setUp(){
        underTest = new PhoneNumberValidator();

    }

    @ParameterizedTest
    @CsvSource({"+447000000000, true",
            "+44700000000078, false",
            "44700000000, false"

    })
    void itShouldValidatePhoneNumber(String phoneNumber, Boolean expected) {

        boolean isValid = underTest.test(phoneNumber);
        assertThat(isValid).isEqualTo((expected));

    }

//    @Test
//    @DisplayName("Should fail when length is bigger than 13")
//    void itShouldValidatePhoneNumberWhenIncorrectAndHasLengthBiggerThan13() {
//
//        String phoneNumber = "+44700000000078";
//
//        boolean isValid = underTest.test(phoneNumber);
//
//        assertThat(isValid).isFalse();
//
//    }
//
//    @Test
//    @DisplayName("Should fail when does not start with + ")
//    void itShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign() {
//
//        String phoneNumber = "447000000000";
//
//        boolean isValid = underTest.test(phoneNumber);
//
//        assertThat(isValid).isFalse();
//
//    }
}
