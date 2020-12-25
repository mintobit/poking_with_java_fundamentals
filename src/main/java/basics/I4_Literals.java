package basics;

public class I4_Literals {
    public static void main(String[] args) {
        // Integer literals

        // base 2 (denoted by 0b)
        int binary = 0b11000;
        // base 8 (denoted by 0)
        int octal = 030;
        // base 10
        int decimal = 24;
        // base 16 (denoted by 0x)
        int hexadecimal = 0x18;

        System.out.printf(
                "base 2 (binary): %d\nbase 8 (octal): %d\nbase 10 (decimal): %d\nbase 16 (hexadecimal): %d\n\n",
                binary,
                octal,
                decimal,
                hexadecimal
        );

        // Using underscores for readability
        int integer_literal_underscores = 123_345_345;
        int integer_literal_multiple_underscores = 123__345__345;

        System.out.printf(
                "integer literal with underscores: %d = %d\n",
                integer_literal_underscores,
                integer_literal_multiple_underscores
        );

        // Floating-point literals
        float float_standard_notation = 3.5F;
        float float_scientific_notation = 2.3e-1F;

        double double_standard_notation = 3.5;
        double double_standard_notation_explicit = 3.5D;
        double double_scientific_notation = 2.3e-1;
        double double_scientific_notation_explicit = 2.3e-1D;

        double double_hexadecimal = 0x12.2P2;

        System.out.printf(
                "float standard notation: %f\nfloat scientific notation: %f\ndouble standard notation: %f\ndouble standard notation explicit: %f\ndouble scientific notation: %f\ndouble scientific notation explicit: %f\ndouble hexadecimal: %f\n\n",
                float_standard_notation,
                float_scientific_notation,
                double_standard_notation,
                double_standard_notation_explicit,
                double_scientific_notation,
                double_scientific_notation_explicit,
                double_hexadecimal
        );

        // Boolean literals
        boolean boolean_true = true;
        boolean boolean_false = false;

        System.out.printf(
                "boolean true: %s\nboolean false: %s\n\n",
                boolean_true,
                boolean_false
        );

        // Character literals
        char char_literal_integer_notation = 88;
        char char_literal_ascii_notation = 'X';
        char char_literal_octal_notation = '\130';
        char char_literal_hexadecimal_notation = '\u0058';

        System.out.printf(
                "char literal integer notation: %s\nchar literal ascii notation: %s\nchar literal octal notation: %s\nchar literal hexadecimal notation: %s\n\n",
                char_literal_integer_notation,
                char_literal_ascii_notation,
                char_literal_octal_notation,
                char_literal_hexadecimal_notation
        );

        // String literals
        String string_literal_ascii_notation = "X";
        String string_literal_octal_notation = "\130";
        String string_literal_hexadecimal_notation = "\u0058";

        System.out.printf(
                "string literal ascii notation: %s\nstring literal octal notation: %s\nstring literal hexadecimal notation: %s\n",
                string_literal_ascii_notation,
                string_literal_octal_notation,
                string_literal_hexadecimal_notation
        );
    }
}
