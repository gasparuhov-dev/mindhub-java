package org.mindhub.files;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println(args.length);
		System.out.println(args[0]);

//		Scanner scanner = new Scanner(System.in);
//		try {
//			scanner.useDelimiter("!");
//			int nextInt = scanner.nextInt();
//			System.out.println(nextInt);
//			String nextLine = scanner.nextLine();
//			System.out.println(nextLine);
//		} catch (Exception ex) {
//			System.out.println("Exception: " + ex.getStackTrace());
//		} finally {
//			System.out.println("Will close the stream");
//			scanner.close();
//		}
//
//		try (Scanner scanner = new Scanner(System.in)) {
//			scanner.useDelimiter("!");
//			int nextInt = scanner.nextInt();
//			System.out.println(nextInt);
//			String nextLine = scanner.nextLine();
//			System.out.println(nextLine);
//		} catch (Exception e) {
//			System.out.println("Exception: " + e.getStackTrace());
//		}

//		System.out.println("this is tab: \\t; this is new line: \nthis is after the new line; this is spcae:\s;");

//		File directory = new File("C:\\Users\\Admin\\eclipse-workspace\\mindhub-java\\files");
//		var list = directory.listFiles();
//		for (File file : list) {
//			System.out.println(file.isDirectory() ? "directory:" + file.getName() : "file:" + file.getName());
//		}

//		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\mindhub-java\\files\\test.txt");
//		if (file.exists()) {
//			System.out.println("File exists!");
//		} else {
//			file.createNewFile();
//		}
//
//		try (FileWriter fileWriter = new FileWriter(file)) {
//			fileWriter.write("Hello World!");
//			fileWriter.write("\n");
//			fileWriter.write("How Are you?");
//			fileWriter.write("\n");
//			fileWriter.write("I am good!");
//		}
//
////		try (Scanner sc = new Scanner(file)) {
//////			sc.useDelimiter("\n");
////			while (sc.hasNext()) {
////				System.out.println(sc.nextLine());
////			}
////		}
//
//		String filePath = "C:" + File.separator + "Users";
//		System.out.println("path: " + filePath);
//
//		Path path = Path.of("C:\\Users\\Admin\\eclipse-workspace\\mindhub-java", "files", "test.txt");
//		List<String> readAllLines = Files.readAllLines(path);
//		for (String line : readAllLines) {
//			System.out.println(line);
//		}
//
//		File file = new File("notifications.txt");
//		FileWriter writer = new FileWriter(file);
//		writer.write("notification");
	}

}
