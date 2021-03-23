package generics.utils;

public class ContantValueContainerWithCode implements ValueContainer, CodeAware {
    private final String code;
    private final int value;

    public ContantValueContainerWithCode(String code, int value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getValue() {
        return value;
    }
}
