import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Zakaznik> kolekce=new ArrayList<>();
        kolekce.add(new Zakaznik("Pepa", 2));
        kolekce.add(new Zakaznik("Lojza", 3));

        kolekce.remove(new Zakaznik("Lojza", 3));

        try(PrintWriter out = new PrintWriter(new PrintWriter(new File("textak.txt")))){

        out.println(kolekce);

        out.close();}

        //w.useDelimer(";");
        
        Scanner s=new Scanner(new BufferedReader(new FileReader("textak.txt")));

        out.println(s);



    }
}}