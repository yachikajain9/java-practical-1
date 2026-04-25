class AverageApp {
    public static double average(String[] values) 
            throws NullPointerException, NumberFormatException {

        double sum = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] == null) {
                throw new NullPointerException("Null value found at index " + i);
            }

            double num = Double.parseDouble(values[i]);
            sum += num;
        }

        return sum / values.length;
    }

    public static void main(String[] args) {

          System.out.println("yachika jain: 240390107056");

        String[] valid = {"10", "20", "30"};
        String[] invalidNumber = {"10", "abc", "30"};
        String[] nullValue = {"10", null, "30"};

        try {
            System.out.println("Average: " + average(valid));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Process completed\n");
        }

        try {
            System.out.println("Average: " + average(invalidNumber));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Process completed\n");
        }

        try {
            System.out.println("Average: " + average(nullValue));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Process completed\n");
        }
    }
}