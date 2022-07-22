// CS3100 Assignment 2
// Created by: Spencer R. Hall (A02248808)

/**
 * Retreives system info requested by the user.
 */
public class Assign2 {

    public static void main(String[] args) {
        Assign2 runner = new Assign2();
        if (args.length < 1) {
            return;
        } else {
            runner.executeArgs(args);
        }
    }

    /**
     * Executes each of the given CL arguments.
     * @param: List of CL Aruguments.
     */
    private void executeArgs(String[] args) {
        for (int i=0; i < args.length; i++) {
            switch (args[i]) {
                case "-cpu":
                    execCPU();
                    break;
                case "-mem":
                    execMem();
                    break;
                case "-dirs":
                    execDirs();
                    break;
                case "-os":
                    execOS();
                    break;
                case "-java":
                    execJava();
                    break;
                default:
                    break;
            }
        }
    }
    
    /**
     * Retrieves the CPU system info, and prints it to the user.
     */
    private void execCPU() {
        System.out.println("Processors: " + Runtime.getRuntime().availableProcessors());
    }

    /**
     * Retrives the system memory info, and prints it to the user.
     */
    private void execMem() {
        System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory());
        System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory());
        System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory());
    }

    /**
     * Retrieves the working and user home directories, prints them to user.
     */
    private void execDirs() {
        System.out.println("Working Directory: " + System.getProperty("user.dir"));
        System.out.println("User Home Directory: " + System.getProperty("user.home"));
    }

    /**
     * Retrieves OS name and Version, prints them to user.
     */
    private void execOS() {
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
    }

    /**
     * Retreives JVM info and prints it to the user.
     */
    private void execJava() {
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Runtime: " + System.getProperty("java.runtime.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java VM Version: " + System.getProperty("java.vm.version"));
        System.out.println("Java VM Name: " + System.getProperty("java.vm.name"));
    }
}