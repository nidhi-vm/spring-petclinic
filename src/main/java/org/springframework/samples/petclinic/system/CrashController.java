public class CustomException extends RuntimeException {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

@GetMapping("/oups")
public String triggerException() {
    throw new CustomException(
            "Expected: controller used to showcase what " + "happens when an exception is thrown");
}