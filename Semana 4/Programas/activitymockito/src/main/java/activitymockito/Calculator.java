package activitymockito;

public class Calculator {
    private AdditionService additionService;

    public Calculator(AdditionService additionService) {
        this.additionService = additionService;
    }

    public int add(int a, int b) {
        return additionService.add(a, b);
    }
}
