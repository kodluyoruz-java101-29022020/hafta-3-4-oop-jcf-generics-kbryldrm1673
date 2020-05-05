package linkedListAlgorithm;

import java.util.Scanner;

public class Main {

	public static <T> void main(String[] args) {

		System.out.println("select action");
		System.out.println("1)add elements to an empty array");
		System.out.println("2)add elements first node ");
		System.out.println("3)add elements to the index ");
		System.out.println("4)delete first node ");
		System.out.println("5)delete last node");
		System.out.println("6)delete elements to the index");
		System.out.println("7)find node");
		System.out.println("8)show the indexed element");
		System.out.println("9)find last node");
		System.out.println("10)linkedList size");
		System.out.println("11)Show Linked List");
		System.out.println("12)EXIT");

		int choice = -1;
		try (Scanner key = new Scanner(System.in)) {
			DualDirectionLinkedList<String> list = new DualDirectionLinkedList<String>();

			do {
				choice = key.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Item :");
					String value = key.next();
					list.insertNode(value);
					break;
				case 2:
					System.out.print("Item:");
					value = key.next();
					list.insertFirst(value);
					break;
				case 3:
					System.out.print("Item :");
					value = key.next();
					System.out.print("Index :");
					int position = key.nextInt();
					list.insertNth(value, position);
					break;
				case 4:
					list.deleteFirstNode();
					break;
				case 5:
					list.deleteLastNode();
					break;
				case 6:
					System.out.print("Index:");
					position = key.nextInt();
					list.deleteNthNode(position);
					break;
				case 7:
					System.out.print("Give value and return the index :");
					value = key.next();
					list.findNode(value);
					break;
				case 8:
					System.out.print("Give index and return the value");
					position = key.nextInt();
					list.findNodeAt(position);
					break;
				case 9:
					list.findLastNode();
					break;
				case 10:
					list.getSize();
					break;
				case 11:
					list.printDualDirectionList();
					break;
				}
			} while (choice != 12);
		}

	}

}


