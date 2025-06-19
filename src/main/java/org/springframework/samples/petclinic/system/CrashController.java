@GetMapping("/oups")
public String triggerException() {
    throw new CustomException("Expected: controller used to showcase what happens when an exception is thrown");
}

public static class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}