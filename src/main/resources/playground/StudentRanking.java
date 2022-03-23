package playground;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StudentRanking {
   public record Student(String name, int avg) {}

   public static Path namesFile = Paths.get("/home/adam/IdeaProjects/sandbox/src/main/resources/names.txt");
   public static Path scoresFile = Paths.get("/home/adam/IdeaProjects/sandbox/src/main/resources/scores.txt");

   public static int name = 0;
   public static int score = 0;

   public static void main(String[] args) {
      String[] names = getStudentNames();
      String[] scores = getStudentScores();

      System.out.println(Stream.of(
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])),
              new Student(names[name++], Integer.parseInt(scores[score++])))
                      .sorted((Student s1, Student s2) -> s1.avg >= s2.avg ? -1 : 1)
                      .toList());

   }

   public static String[] getStudentNames() {
      String[] listOfStudentNames = null;
      try {
         listOfStudentNames = String.valueOf(Files.readString(namesFile)).split("\n");
      } catch (Exception e) {
         e.printStackTrace();
      }
      return listOfStudentNames;
   }

   public static String[] getStudentScores() {
      String[] listOfStudentScores = null;
      try {
         listOfStudentScores = String.valueOf(Files.readString(scoresFile)).split("\n");
      } catch (Exception e) {
         e.printStackTrace();
      }
      return listOfStudentScores;
   }
}
