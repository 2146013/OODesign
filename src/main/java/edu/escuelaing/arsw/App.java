package edu.escuelaing.arsw;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) {
        String fileName = args[0];//nombre del archivo(demo.txt)
        System.out.println( "File name: " + fileName);
        Path path = Paths.get(fileName);
        LinkednList<Double> link = new LinkednList<>();
        try (Stream<String> stream = Files.lines(path)) {
            for ( String num: stream.collect(Collectors.toList())){
                link.add(Double.parseDouble(num.trim()));
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Calculator calculator = new Calculator(link);
        System.out.println(calculator.mean());
        System.out.println(calculator.Std_dev());
    }

}

