package system;

//calculate wages

@FunctionalInterface
public interface WageCalculation {
	double calculateWage(double hours, double overTime);
}
