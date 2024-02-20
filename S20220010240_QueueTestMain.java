
public class S20220010240_QueueTestMain {
    public static void main(String[] args) {
        ArrayQueue employeeQueue = new ArrayQueue(5);
        // Create and insert employee objects in the ArrayQueue
        employeeQueue.enqueue(new Employee("John Abraham", 167, 50000));
        employeeQueue.enqueue(new Employee("Jaya krishna", 178, 60000));
        employeeQueue.enqueue(new Employee("satya John", 130, 55000));
        employeeQueue.enqueue(new Employee("Ariena Williams", 104, 70000));

        if (employeeQueue.getQueuesize() >= 0.75 * employeeQueue.getQueuesize()) {
            int newCapacity = employeeQueue.getQueuesize() * 2;
            ArrayQueue newEmployeeQueue = new ArrayQueue(newCapacity);

            // Copy contents to the new queue
            while (employeeQueue.getQueuesize() > 0) {
                newEmployeeQueue.enqueue(employeeQueue.dequeue());
            }

            // Update reference to the new queue
            employeeQueue = newEmployeeQueue;
        }

        // Increase the size to 10 in the program
        employeeQueue.enqueue(new Employee("David Brown", 105, 75000));
        employeeQueue.enqueue(new Employee("Eva Davis", 106, 80000));

        // Demonstrate the use findById method
        int employeeIdToFind = 130;
        int position = employeeQueue.findById(employeeIdToFind);
        if (position != -1) {
            System.out.println("Employee found at position: " + position);
        } else {
            System.out.println("Employee not found");
        }

        // Print employee details based on their Id
        while (employeeQueue.getQueuesize() > 0) {
            Employee employee = employeeQueue.dequeue();
            System.out.println("Employee Details: " + employee.getname() +
                    ", ID: " + employee.getid() +
                    ", Salary: " + employee.getsalary());
        }
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getsalary() {
        return salary;
    }
}

interface Queue {
    void enqueue(Employee employee);

    Employee dequeue();
}

class ArrayQueue implements Queue {
    private Employee[] queue;
    private int size;
    private int rear;
    private int front;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public int getQueuesize() {
        return size;
    }

    public int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (queue[i].getid() == id) {
                return i;
            }
        }
        return -1;
    }

    public void emptyQueue() {
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(Employee employee) {
        if (size == queue.length) {
            int newcapacity = queue.length * 2;
            Employee[] newQueue = new Employee[newcapacity];
            System.arraycopy(queue, 0, newQueue, 0, size);
            queue = newQueue;

        }
        rear = (rear + 1) % queue.length;
        queue[rear] = employee;
        size++;
    }

    public Employee dequeue() {
        if (size == 0) {
            return null;
        }
        Employee removedEmployee = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return removedEmployee;
    }

}
