package JavaIOStreams.AssignmentQuestion.EmployeePayrollService;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeePayrollService {

    public static void main(String[] args) {

        String inputPath = "InputFiles/employees.txt";
        String outputPath = "Outputfiles/payroll_report.txt";

        // Create the output directory if it does not exist
        File outputDirectory = new File("Outputfiles");

        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
        }

        int processedEmployees = 0;

        try (
            BufferedReader reader = new BufferedReader(
                new FileReader(inputPath)
            );

            BufferedWriter writer = new BufferedWriter(
                new FileWriter(outputPath)
            )
        ) {

            // Skip the header row
            String line = reader.readLine();

            // Write the report heading
            writer.write("EMPLOYEE PAYROLL REPORT");
            writer.newLine();
            writer.write("==================================================");
            writer.newLine();

            writer.write(
                "ID,Name,Basic,HRA,DA,PF,Gross Salary,Net Salary"
            );
            writer.newLine();

            // Read each employee record
            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] details = line.split(",");

                if (details.length != 3) {
                    System.out.println(
                        "Skipping invalid record: " + line
                    );
                    continue;
                }

                try {
                    int employeeId = Integer.parseInt(
                        details[0].trim()
                    );

                    String name = details[1].trim();

                    double basicSalary = Double.parseDouble(
                        details[2].trim()
                    );

                    if (basicSalary < 0) {
                        System.out.println(
                            "Skipping negative salary: " + line
                        );
                        continue;
                    }

                    // Calculate salary components
                    double hra = basicSalary * 0.20;
                    double da = basicSalary * 0.10;
                    double pf = basicSalary * 0.12;

                    double grossSalary =
                        basicSalary + hra + da;

                    double netSalary = grossSalary - pf;

                    // Write the employee's payroll details
                    writer.write(
                        employeeId + "," +
                        name + "," +
                        String.format("%.2f", basicSalary) + "," +
                        String.format("%.2f", hra) + "," +
                        String.format("%.2f", da) + "," +
                        String.format("%.2f", pf) + "," +
                        String.format("%.2f", grossSalary) + "," +
                        String.format("%.2f", netSalary)
                    );

                    writer.newLine();

                    processedEmployees++;

                } catch (NumberFormatException e) {
                    System.out.println(
                        "Skipping record with invalid numbers: " + line
                    );
                }
            }

            writer.newLine();
            writer.write(
                "Total employees processed: " + processedEmployees
            );
            writer.newLine();

            System.out.println("Payroll processing completed.");
            System.out.println(
                "Employees processed: " + processedEmployees
            );
            System.out.println(
                "Report saved to: " + outputPath
            );

        } catch (IOException e) {
            System.out.println(
                "File processing error: " + e.getMessage()
            );
        }
    }
}
