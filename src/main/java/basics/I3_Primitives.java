package basics;

class I3_Primitives {
    public static void main(String[] args) {
        // Integer types

        // byte (8-bit)
        byte a_byte = -128;
        byte z_byte = 127;
        // short (16-bit)
        short a_short = -32_768;
        short z_short = 32_767;
        // int (32-bit)
        int a_int = -2_147_483_648;
        int z_int = 2_147_483_647;
        // long (64-bit)
        long a_long = -9_223_372_036_854_775_808L;
        long z_long = 9_223_372_036_854_775_807L;

        // Floating-Point types

        // double (64-bit)
        double example_double = 4.5;
        // float (32-bit)
        float example_float = 3.5F;

        // char (16-bit)
        char a_char = 0;
        char z_char = 65_535;
        char example_char = 88;
        char example_char2 = 'X';

        // boolean (1-bit)
        boolean a_boolean = true;
        boolean z_boolean = false;

        System.out.printf(
                "byte range (8-bit): %d to %d\nshort range (16-bit): %d to %d\nint range (32-bit): %d to %d\nlong range (64-bit): %d to %d\n\ndouble (64-bit) example: %f\nfloat (32-bit) example: %f\nchar (16-bit) (number codes starting from 0) example : %c = %c\nboolean (1-bit): %s, %s\n",
                a_byte,
                z_byte,
                a_short,
                z_short,
                a_int,
                z_int,
                a_long,
                z_long,
                example_double,
                example_float,
                example_char,
                example_char2,
                a_boolean,
                z_boolean
        );
    }
}
