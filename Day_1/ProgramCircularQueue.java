import java.util.*;

public class ProgramCircularQueue {

  public static void main(String args[]) {
    int ch, e;
    CircularQueueDemo obj = new CircularQueueDemo();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of Queue:");
    int s = in.nextInt();
    obj.createQueue(s);
    do {
      System.out.println("1.Enqueue\n2.Dequeue\n3.print\n0.exit");
      ch = in.nextInt();
      switch (ch) {
        case 1:
          if (
            !obj.isFull()
          ) { //is not full
            System.out.println("Enter Data:");
            e = in.nextInt();
            obj.enqueue(e);
            System.out.println("Enqueue");
          } else System.out.println("Queue Full");
          break;
        case 2:
          if (
            !obj.isEmpty()
          ) { //is not empty
            e = obj.dequeue();
            System.out.println("Dequeue:" + e);
          } else System.out.println("Queue Empty");
          break;
        case 3:
          if (
            !obj.isEmpty()
          ) { //is not empty
            System.out.println("Queue has:");
            obj.printQueue();
          } else System.out.println("Queue Empty");
          break;
        case 0:
          System.out.println("Exiting ");
          break;
        default:
          System.out.println("Wrong option selected");
          break;
      }
    } while (ch != 0);
  }
}
