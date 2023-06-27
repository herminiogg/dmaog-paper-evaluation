package com.example;

import com.example.domain.Film;
import com.github.kburger.rdf4j.beans.BeanAnalyzer;
import com.github.kburger.rdf4j.beans.BeanMapper;
import com.github.kburger.rdf4j.beans.ClassAnalysis;
import org.eclipse.rdf4j.rio.RDFFormat;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BeanMapper mapper = new BeanMapper();
        String fileContent = Files.readString(Path.of("..\\..\\bigFilmsFile.ttl"));

        List<Film> films = null;

        for(int i = 0; i < 30; i++) {
            long millis1 = System.currentTimeMillis();
            for (int j = 0; j < 10; j++) {
                films = loadFilms(mapper, fileContent);
            }
            long millis2 = System.currentTimeMillis();
            System.out.println(millis2 - millis1);
        }

        for(int i = 0; i < 30; i++) {
            long millis1 = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                films.stream().filter(f -> f.getName().stream().anyMatch(n -> n.equals("Carmen"))).findFirst().get();
            }
            long millis2 = System.currentTimeMillis();
            System.out.println(millis2 - millis1);
        }

        for(int i = 0; i < 30; i++) {
            long millis1 = System.currentTimeMillis();
            for (int j = 0; j < 10; j++) {
                List<Film> notInMemoryFilms = loadFilms(mapper, fileContent);
                notInMemoryFilms.stream().filter(f -> f.getName().stream().anyMatch(n -> n.equals("Carmen"))).findFirst().get();
            }
            long millis2 = System.currentTimeMillis();
            System.out.println(millis2 - millis1);
        }

    }

    public static List<Film> loadFilms(BeanMapper mapper, String fileContent) {
        Film filmQ79325925 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q79325925", RDFFormat.TURTLE);
        Film filmQ4171789 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4171789", RDFFormat.TURTLE);
        Film filmQ2382876 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2382876", RDFFormat.TURTLE);
        Film filmQ2856158 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2856158", RDFFormat.TURTLE);
        Film filmQ87126428 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87126428", RDFFormat.TURTLE);
        Film filmQ3505874 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3505874", RDFFormat.TURTLE);
        Film filmQ3273610 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3273610", RDFFormat.TURTLE);
        Film filmQ1176468 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1176468", RDFFormat.TURTLE);
        Film filmQ55596316 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q55596316", RDFFormat.TURTLE);
        Film filmQ57280267 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q57280267", RDFFormat.TURTLE);
        Film filmQ3565938 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3565938", RDFFormat.TURTLE);
        Film filmQ5659581 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5659581", RDFFormat.TURTLE);
        Film filmQ3226566 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3226566", RDFFormat.TURTLE);
        Film filmQ3202804 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3202804", RDFFormat.TURTLE);
        Film filmQ14956653 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14956653", RDFFormat.TURTLE);
        Film filmQ3507676 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3507676", RDFFormat.TURTLE);
        Film filmQ16352387 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16352387", RDFFormat.TURTLE);
        Film filmQ1962929 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1962929", RDFFormat.TURTLE);
        Film filmQ2793244 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2793244", RDFFormat.TURTLE);
        Film filmQ20736973 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q20736973", RDFFormat.TURTLE);
        Film filmQ8074754 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q8074754", RDFFormat.TURTLE);
        Film filmQ18168128 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18168128", RDFFormat.TURTLE);
        Film filmQ100745823 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100745823", RDFFormat.TURTLE);
        Film filmQ6727707 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6727707", RDFFormat.TURTLE);
        Film filmQ9386264 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q9386264", RDFFormat.TURTLE);
        Film filmQ555367 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q555367", RDFFormat.TURTLE);
        Film filmQ7134201 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7134201", RDFFormat.TURTLE);
        Film filmQ49436483 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q49436483", RDFFormat.TURTLE);
        Film filmQ108633594 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q108633594", RDFFormat.TURTLE);
        Film filmQ848182 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q848182", RDFFormat.TURTLE);
        Film filmQ3472411 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3472411", RDFFormat.TURTLE);
        Film filmQ17049931 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17049931", RDFFormat.TURTLE);
        Film filmQ3207681 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3207681", RDFFormat.TURTLE);
        Film filmQ97732951 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q97732951", RDFFormat.TURTLE);
        Film filmQ111264314 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111264314", RDFFormat.TURTLE);
        Film filmQ14912519 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14912519", RDFFormat.TURTLE);
        Film filmQ491442 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q491442", RDFFormat.TURTLE);
        Film filmQ151751 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q151751", RDFFormat.TURTLE);
        Film filmQ3443570 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3443570", RDFFormat.TURTLE);
        Film filmQ841958 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q841958", RDFFormat.TURTLE);
        Film filmQ10649818 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10649818", RDFFormat.TURTLE);
        Film filmQ114710612 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114710612", RDFFormat.TURTLE);
        Film filmQ10510627 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10510627", RDFFormat.TURTLE);
        Film filmQ18245027 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18245027", RDFFormat.TURTLE);
        Film filmQ11960872 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11960872", RDFFormat.TURTLE);
        Film filmQ18161925 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18161925", RDFFormat.TURTLE);
        Film filmQ593718 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q593718", RDFFormat.TURTLE);
        Film filmQ6532425 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6532425", RDFFormat.TURTLE);
        Film filmQ592300 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q592300", RDFFormat.TURTLE);
        Film filmQ684936 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q684936", RDFFormat.TURTLE);
        Film filmQ10667067 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10667067", RDFFormat.TURTLE);
        Film filmQ118253328 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q118253328", RDFFormat.TURTLE);
        Film filmQ11997515 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11997515", RDFFormat.TURTLE);
        Film filmQ5288137 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5288137", RDFFormat.TURTLE);
        Film filmQ1249706 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1249706", RDFFormat.TURTLE);
        Film filmQ1242727 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1242727", RDFFormat.TURTLE);
        Film filmQ10551717 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10551717", RDFFormat.TURTLE);
        Film filmQ1218528 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1218528", RDFFormat.TURTLE);
        Film filmQ7332167 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7332167", RDFFormat.TURTLE);
        Film filmQ55766341 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q55766341", RDFFormat.TURTLE);
        Film filmQ1034579 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1034579", RDFFormat.TURTLE);
        Film filmQ7621068 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7621068", RDFFormat.TURTLE);
        Film filmQ104501654 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q104501654", RDFFormat.TURTLE);
        Film filmQ767502 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q767502", RDFFormat.TURTLE);
        Film filmQ1061541 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1061541", RDFFormat.TURTLE);
        Film filmQ16560275 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16560275", RDFFormat.TURTLE);
        Film filmQ2891629 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2891629", RDFFormat.TURTLE);
        Film filmQ4848906 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4848906", RDFFormat.TURTLE);
        Film filmQ775356 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q775356", RDFFormat.TURTLE);
        Film filmQ3140771 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3140771", RDFFormat.TURTLE);
        Film filmQ10571193 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10571193", RDFFormat.TURTLE);
        Film filmQ8354260 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q8354260", RDFFormat.TURTLE);
        Film filmQ1306792 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1306792", RDFFormat.TURTLE);
        Film filmQ18290460 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18290460", RDFFormat.TURTLE);
        Film filmQ5850047 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5850047", RDFFormat.TURTLE);
        Film filmQ28750010 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28750010", RDFFormat.TURTLE);
        Film filmQ10539097 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10539097", RDFFormat.TURTLE);
        Film filmQ28494295 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28494295", RDFFormat.TURTLE);
        Film filmQ152206 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q152206", RDFFormat.TURTLE);
        Film filmQ110878301 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110878301", RDFFormat.TURTLE);
        Film filmQ1758987 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1758987", RDFFormat.TURTLE);
        Film filmQ1321885 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1321885", RDFFormat.TURTLE);
        Film filmQ392684 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q392684", RDFFormat.TURTLE);
        Film filmQ105702167 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105702167", RDFFormat.TURTLE);
        Film filmQ109772275 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q109772275", RDFFormat.TURTLE);
        Film filmQ17414136 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17414136", RDFFormat.TURTLE);
        Film filmQ1056376 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1056376", RDFFormat.TURTLE);
        Film filmQ1142950 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1142950", RDFFormat.TURTLE);
        Film filmQ1437026 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1437026", RDFFormat.TURTLE);
        Film filmQ917910 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q917910", RDFFormat.TURTLE);
        Film filmQ274895 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q274895", RDFFormat.TURTLE);
        Film filmQ3549732 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3549732", RDFFormat.TURTLE);
        Film filmQ16176965 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16176965", RDFFormat.TURTLE);
        Film filmQ17761130 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17761130", RDFFormat.TURTLE);
        Film filmQ1897674 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1897674", RDFFormat.TURTLE);
        Film filmQ2944340 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2944340", RDFFormat.TURTLE);
        Film filmQ16655559 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16655559", RDFFormat.TURTLE);
        Film filmQ101091534 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q101091534", RDFFormat.TURTLE);
        Film filmQ115806129 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115806129", RDFFormat.TURTLE);
        Film filmQ1756532 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1756532", RDFFormat.TURTLE);
        Film filmQ100401223 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100401223", RDFFormat.TURTLE);
        Film filmQ3211075 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3211075", RDFFormat.TURTLE);
        Film filmQ338253 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q338253", RDFFormat.TURTLE);
        Film filmQ10727897 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10727897", RDFFormat.TURTLE);
        Film filmQ100558146 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100558146", RDFFormat.TURTLE);
        Film filmQ100564447 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100564447", RDFFormat.TURTLE);
        Film filmQ99372801 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q99372801", RDFFormat.TURTLE);
        Film filmQ3580165 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3580165", RDFFormat.TURTLE);
        Film filmQ126123 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q126123", RDFFormat.TURTLE);
        Film filmQ1043604 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1043604", RDFFormat.TURTLE);
        Film filmQ1193633 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1193633", RDFFormat.TURTLE);
        Film filmQ20493926 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q20493926", RDFFormat.TURTLE);
        Film filmQ114958631 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114958631", RDFFormat.TURTLE);
        Film filmQ83772164 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q83772164", RDFFormat.TURTLE);
        Film filmQ1212650 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1212650", RDFFormat.TURTLE);
        Film filmQ114902139 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114902139", RDFFormat.TURTLE);
        Film filmQ3515276 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3515276", RDFFormat.TURTLE);
        Film filmQ60854215 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q60854215", RDFFormat.TURTLE);
        Film filmQ1305605 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1305605", RDFFormat.TURTLE);
        Film filmQ106375335 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q106375335", RDFFormat.TURTLE);
        Film filmQ330113 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q330113", RDFFormat.TURTLE);
        Film filmQ89186326 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q89186326", RDFFormat.TURTLE);
        Film filmQ4411796 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4411796", RDFFormat.TURTLE);
        Film filmQ19885882 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19885882", RDFFormat.TURTLE);
        Film filmQ976934 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q976934", RDFFormat.TURTLE);
        Film filmQ11883018 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11883018", RDFFormat.TURTLE);
        Film filmQ17257743 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17257743", RDFFormat.TURTLE);
        Film filmQ4030599 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4030599", RDFFormat.TURTLE);
        Film filmQ110869210 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110869210", RDFFormat.TURTLE);
        Film filmQ113360807 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113360807", RDFFormat.TURTLE);
        Film filmQ17859530 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17859530", RDFFormat.TURTLE);
        Film filmQ5554658 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5554658", RDFFormat.TURTLE);
        Film filmQ10706553 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10706553", RDFFormat.TURTLE);
        Film filmQ23899153 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q23899153", RDFFormat.TURTLE);
        Film filmQ75016227 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q75016227", RDFFormat.TURTLE);
        Film filmQ15831535 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15831535", RDFFormat.TURTLE);
        Film filmQ1192184 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1192184", RDFFormat.TURTLE);
        Film filmQ110269385 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110269385", RDFFormat.TURTLE);
        Film filmQ1458594 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1458594", RDFFormat.TURTLE);
        Film filmQ46997065 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q46997065", RDFFormat.TURTLE);
        Film filmQ3057816 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3057816", RDFFormat.TURTLE);
        Film filmQ3113698 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3113698", RDFFormat.TURTLE);
        Film filmQ6321280 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6321280", RDFFormat.TURTLE);
        Film filmQ866673 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q866673", RDFFormat.TURTLE);
        Film filmQ11899615 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11899615", RDFFormat.TURTLE);
        Film filmQ96108011 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q96108011", RDFFormat.TURTLE);
        Film filmQ27134309 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27134309", RDFFormat.TURTLE);
        Film filmQ114708739 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114708739", RDFFormat.TURTLE);
        Film filmQ1101982 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1101982", RDFFormat.TURTLE);
        Film filmQ16651349 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16651349", RDFFormat.TURTLE);
        Film filmQ601511 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q601511", RDFFormat.TURTLE);
        Film filmQ110825629 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110825629", RDFFormat.TURTLE);
        Film filmQ5011810 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5011810", RDFFormat.TURTLE);
        Film filmQ28750121 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28750121", RDFFormat.TURTLE);
        Film filmQ990857 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q990857", RDFFormat.TURTLE);
        Film filmQ5411520 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5411520", RDFFormat.TURTLE);
        Film filmQ16423637 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16423637", RDFFormat.TURTLE);
        Film filmQ7295394 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7295394", RDFFormat.TURTLE);
        Film filmQ23040725 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q23040725", RDFFormat.TURTLE);
        Film filmQ14970927 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14970927", RDFFormat.TURTLE);
        Film filmQ470375 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q470375", RDFFormat.TURTLE);
        Film filmQ27703697 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27703697", RDFFormat.TURTLE);
        Film filmQ110837871 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110837871", RDFFormat.TURTLE);
        Film filmQ1056388 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1056388", RDFFormat.TURTLE);
        Film filmQ16516858 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16516858", RDFFormat.TURTLE);
        Film filmQ385167 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q385167", RDFFormat.TURTLE);
        Film filmQ3269855 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3269855", RDFFormat.TURTLE);
        Film filmQ117075837 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q117075837", RDFFormat.TURTLE);
        Film filmQ10672590 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10672590", RDFFormat.TURTLE);
        Film filmQ111971525 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111971525", RDFFormat.TURTLE);
        Film filmQ947538 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q947538", RDFFormat.TURTLE);
        Film filmQ977950 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q977950", RDFFormat.TURTLE);
        Film filmQ10551011 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10551011", RDFFormat.TURTLE);
        Film filmQ3225644 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3225644", RDFFormat.TURTLE);
        Film filmQ65055322 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q65055322", RDFFormat.TURTLE);
        Film filmQ5133706 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5133706", RDFFormat.TURTLE);
        Film filmQ2094615 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2094615", RDFFormat.TURTLE);
        Film filmQ15990789 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15990789", RDFFormat.TURTLE);
        Film filmQ1176116 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1176116", RDFFormat.TURTLE);
        Film filmQ100718251 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100718251", RDFFormat.TURTLE);
        Film filmQ1388936 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1388936", RDFFormat.TURTLE);
        Film filmQ18674916 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18674916", RDFFormat.TURTLE);
        Film filmQ786492 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q786492", RDFFormat.TURTLE);
        Film filmQ6438945 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6438945", RDFFormat.TURTLE);
        Film filmQ1678442 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1678442", RDFFormat.TURTLE);
        Film filmQ107270 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107270", RDFFormat.TURTLE);
        Film filmQ18760009 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18760009", RDFFormat.TURTLE);
        Film filmQ14955328 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14955328", RDFFormat.TURTLE);
        Film filmQ23035641 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q23035641", RDFFormat.TURTLE);
        Film filmQ27870191 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27870191", RDFFormat.TURTLE);
        Film filmQ1329527 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1329527", RDFFormat.TURTLE);
        Film filmQ1329415 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1329415", RDFFormat.TURTLE);
        Film filmQ5831962 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5831962", RDFFormat.TURTLE);
        Film filmQ114662298 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114662298", RDFFormat.TURTLE);
        Film filmQ7037327 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7037327", RDFFormat.TURTLE);
        Film filmQ112584985 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q112584985", RDFFormat.TURTLE);
        Film filmQ13591827 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q13591827", RDFFormat.TURTLE);
        Film filmQ16411911 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16411911", RDFFormat.TURTLE);
        Film filmQ16643742 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16643742", RDFFormat.TURTLE);
        Film filmQ48751380 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q48751380", RDFFormat.TURTLE);
        Film filmQ1794537 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1794537", RDFFormat.TURTLE);
        Film filmQ3368190 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3368190", RDFFormat.TURTLE);
        Film filmQ3715945 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3715945", RDFFormat.TURTLE);
        Film filmQ14790983 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14790983", RDFFormat.TURTLE);
        Film filmQ64768475 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q64768475", RDFFormat.TURTLE);
        Film filmQ110397 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110397", RDFFormat.TURTLE);
        Film filmQ22001133 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q22001133", RDFFormat.TURTLE);
        Film filmQ1125308 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1125308", RDFFormat.TURTLE);
        Film filmQ316018 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q316018", RDFFormat.TURTLE);
        Film filmQ1245864 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1245864", RDFFormat.TURTLE);
        Film filmQ366675 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q366675", RDFFormat.TURTLE);
        Film filmQ4357404 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4357404", RDFFormat.TURTLE);
        Film filmQ7801113 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7801113", RDFFormat.TURTLE);
        Film filmQ3365352 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3365352", RDFFormat.TURTLE);
        Film filmQ3493985 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3493985", RDFFormat.TURTLE);
        Film filmQ84724287 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q84724287", RDFFormat.TURTLE);
        Film filmQ1403033 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1403033", RDFFormat.TURTLE);
        Film filmQ66758332 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q66758332", RDFFormat.TURTLE);
        Film filmQ17102851 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17102851", RDFFormat.TURTLE);
        Film filmQ30763271 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q30763271", RDFFormat.TURTLE);
        Film filmQ12049575 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12049575", RDFFormat.TURTLE);
        Film filmQ9004754 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q9004754", RDFFormat.TURTLE);
        Film filmQ152090 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q152090", RDFFormat.TURTLE);
        Film filmQ58875268 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q58875268", RDFFormat.TURTLE);
        Film filmQ67400758 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q67400758", RDFFormat.TURTLE);
        Film filmQ109281584 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q109281584", RDFFormat.TURTLE);
        Film filmQ105443513 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105443513", RDFFormat.TURTLE);
        Film filmQ3235295 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3235295", RDFFormat.TURTLE);
        Film filmQ96628864 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q96628864", RDFFormat.TURTLE);
        Film filmQ16916708 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16916708", RDFFormat.TURTLE);
        Film filmQ1167202 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1167202", RDFFormat.TURTLE);
        Film filmQ166960 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q166960", RDFFormat.TURTLE);
        Film filmQ7258417 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7258417", RDFFormat.TURTLE);
        Film filmQ145274 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q145274", RDFFormat.TURTLE);
        Film filmQ1479633 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1479633", RDFFormat.TURTLE);
        Film filmQ916645 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q916645", RDFFormat.TURTLE);
        Film filmQ15240736 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15240736", RDFFormat.TURTLE);
        Film filmQ499851 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q499851", RDFFormat.TURTLE);
        Film filmQ107150070 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107150070", RDFFormat.TURTLE);
        Film filmQ5311397 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5311397", RDFFormat.TURTLE);
        Film filmQ81924220 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q81924220", RDFFormat.TURTLE);
        Film filmQ661422 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q661422", RDFFormat.TURTLE);
        Film filmQ2873275 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2873275", RDFFormat.TURTLE);
        Film filmQ1141186 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1141186", RDFFormat.TURTLE);
        Film filmQ1196825 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1196825", RDFFormat.TURTLE);
        Film filmQ5139651 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5139651", RDFFormat.TURTLE);
        Film filmQ109249780 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q109249780", RDFFormat.TURTLE);
        Film filmQ604954 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q604954", RDFFormat.TURTLE);
        Film filmQ1989715 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1989715", RDFFormat.TURTLE);
        Film filmQ7841992 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7841992", RDFFormat.TURTLE);
        Film filmQ88194278 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q88194278", RDFFormat.TURTLE);
        Film filmQ3233216 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3233216", RDFFormat.TURTLE);
        Film filmQ466101 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q466101", RDFFormat.TURTLE);
        Film filmQ1108354 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1108354", RDFFormat.TURTLE);
        Film filmQ10516771 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10516771", RDFFormat.TURTLE);
        Film filmQ61742357 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q61742357", RDFFormat.TURTLE);
        Film filmQ3068188 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3068188", RDFFormat.TURTLE);
        Film filmQ3202552 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3202552", RDFFormat.TURTLE);
        Film filmQ113025535 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113025535", RDFFormat.TURTLE);
        Film filmQ14895327 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14895327", RDFFormat.TURTLE);
        Film filmQ113269780 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113269780", RDFFormat.TURTLE);
        Film filmQ18274653 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18274653", RDFFormat.TURTLE);
        Film filmQ4170147 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4170147", RDFFormat.TURTLE);
        Film filmQ10527257 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10527257", RDFFormat.TURTLE);
        Film filmQ5997486 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5997486", RDFFormat.TURTLE);
        Film filmQ1633225 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1633225", RDFFormat.TURTLE);
        Film filmQ1538599 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1538599", RDFFormat.TURTLE);
        Film filmQ3227440 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3227440", RDFFormat.TURTLE);
        Film filmQ10673442 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10673442", RDFFormat.TURTLE);
        Film filmQ2608398 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2608398", RDFFormat.TURTLE);
        Film filmQ60737525 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q60737525", RDFFormat.TURTLE);
        Film filmQ16246693 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16246693", RDFFormat.TURTLE);
        Film filmQ1407454 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1407454", RDFFormat.TURTLE);
        Film filmQ5775720 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5775720", RDFFormat.TURTLE);
        Film filmQ5098148 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5098148", RDFFormat.TURTLE);
        Film filmQ90698580 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q90698580", RDFFormat.TURTLE);
        Film filmQ1759123 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1759123", RDFFormat.TURTLE);
        Film filmQ5271999 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5271999", RDFFormat.TURTLE);
        Film filmQ5966420 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5966420", RDFFormat.TURTLE);
        Film filmQ1426269 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1426269", RDFFormat.TURTLE);
        Film filmQ17505968 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17505968", RDFFormat.TURTLE);
        Film filmQ25447784 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q25447784", RDFFormat.TURTLE);
        Film filmQ113030595 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113030595", RDFFormat.TURTLE);
        Film filmQ701252 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q701252", RDFFormat.TURTLE);
        Film filmQ110671126 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110671126", RDFFormat.TURTLE);
        Film filmQ2345475 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2345475", RDFFormat.TURTLE);
        Film filmQ7362416 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7362416", RDFFormat.TURTLE);
        Film filmQ96215709 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q96215709", RDFFormat.TURTLE);
        Film filmQ3233424 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3233424", RDFFormat.TURTLE);
        Film filmQ98293661 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q98293661", RDFFormat.TURTLE);
        Film filmQ4147895 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4147895", RDFFormat.TURTLE);
        Film filmQ110949249 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110949249", RDFFormat.TURTLE);
        Film filmQ387727 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q387727", RDFFormat.TURTLE);
        Film filmQ9019307 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q9019307", RDFFormat.TURTLE);
        Film filmQ28726241 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28726241", RDFFormat.TURTLE);
        Film filmQ3363266 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3363266", RDFFormat.TURTLE);
        Film filmQ15916672 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15916672", RDFFormat.TURTLE);
        Film filmQ90565192 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q90565192", RDFFormat.TURTLE);
        Film filmQ28733239 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28733239", RDFFormat.TURTLE);
        Film filmQ1629022 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1629022", RDFFormat.TURTLE);
        Film filmQ3346105 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3346105", RDFFormat.TURTLE);
        Film filmQ64019350 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q64019350", RDFFormat.TURTLE);
        Film filmQ577875 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q577875", RDFFormat.TURTLE);
        Film filmQ1107196 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1107196", RDFFormat.TURTLE);
        Film filmQ18291583 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18291583", RDFFormat.TURTLE);
        Film filmQ14955376 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14955376", RDFFormat.TURTLE);
        Film filmQ113466212 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113466212", RDFFormat.TURTLE);
        Film filmQ99059867 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q99059867", RDFFormat.TURTLE);
        Film filmQ941542 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q941542", RDFFormat.TURTLE);
        Film filmQ6358078 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6358078", RDFFormat.TURTLE);
        Film filmQ14955432 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14955432", RDFFormat.TURTLE);
        Film filmQ1035214 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1035214", RDFFormat.TURTLE);
        Film filmQ110892400 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110892400", RDFFormat.TURTLE);
        Film filmQ1827484 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1827484", RDFFormat.TURTLE);
        Film filmQ1471526 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1471526", RDFFormat.TURTLE);
        Film filmQ61043040 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q61043040", RDFFormat.TURTLE);
        Film filmQ88215326 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q88215326", RDFFormat.TURTLE);
        Film filmQ205687 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q205687", RDFFormat.TURTLE);
        Film filmQ594649 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q594649", RDFFormat.TURTLE);
        Film filmQ5469760 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5469760", RDFFormat.TURTLE);
        Film filmQ23685899 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q23685899", RDFFormat.TURTLE);
        Film filmQ10540168 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10540168", RDFFormat.TURTLE);
        Film filmQ13461536 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q13461536", RDFFormat.TURTLE);
        Film filmQ10713122 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10713122", RDFFormat.TURTLE);
        Film filmQ277038 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q277038", RDFFormat.TURTLE);
        Film filmQ1130310 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1130310", RDFFormat.TURTLE);
        Film filmQ1578702 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1578702", RDFFormat.TURTLE);
        Film filmQ18609942 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18609942", RDFFormat.TURTLE);
        Film filmQ27864184 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27864184", RDFFormat.TURTLE);
        Film filmQ105748250 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105748250", RDFFormat.TURTLE);
        Film filmQ61726949 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q61726949", RDFFormat.TURTLE);
        Film filmQ105296607 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105296607", RDFFormat.TURTLE);
        Film filmQ21899325 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q21899325", RDFFormat.TURTLE);
        Film filmQ64995036 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q64995036", RDFFormat.TURTLE);
        Film filmQ1249296 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1249296", RDFFormat.TURTLE);
        Film filmQ2398968 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2398968", RDFFormat.TURTLE);
        Film filmQ3492392 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3492392", RDFFormat.TURTLE);
        Film filmQ17415300 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17415300", RDFFormat.TURTLE);
        Film filmQ115224292 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115224292", RDFFormat.TURTLE);
        Film filmQ36998754 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q36998754", RDFFormat.TURTLE);
        Film filmQ5183676 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5183676", RDFFormat.TURTLE);
        Film filmQ94579290 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q94579290", RDFFormat.TURTLE);
        Film filmQ6547945 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6547945", RDFFormat.TURTLE);
        Film filmQ91236969 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q91236969", RDFFormat.TURTLE);
        Film filmQ1651807 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1651807", RDFFormat.TURTLE);
        Film filmQ15243037 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15243037", RDFFormat.TURTLE);
        Film filmQ432088 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q432088", RDFFormat.TURTLE);
        Film filmQ633131 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q633131", RDFFormat.TURTLE);
        Film filmQ3363736 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3363736", RDFFormat.TURTLE);
        Film filmQ15916412 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15916412", RDFFormat.TURTLE);
        Film filmQ2600583 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2600583", RDFFormat.TURTLE);
        Film filmQ8027984 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q8027984", RDFFormat.TURTLE);
        Film filmQ97548877 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q97548877", RDFFormat.TURTLE);
        Film filmQ48674479 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q48674479", RDFFormat.TURTLE);
        Film filmQ587566 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q587566", RDFFormat.TURTLE);
        Film filmQ107549128 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107549128", RDFFormat.TURTLE);
        Film filmQ1758061 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1758061", RDFFormat.TURTLE);
        Film filmQ988018 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q988018", RDFFormat.TURTLE);
        Film filmQ2637045 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2637045", RDFFormat.TURTLE);
        Film filmQ4116194 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4116194", RDFFormat.TURTLE);
        Film filmQ695908 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q695908", RDFFormat.TURTLE);
        Film filmQ28720641 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28720641", RDFFormat.TURTLE);
        Film filmQ2980748 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2980748", RDFFormat.TURTLE);
        Film filmQ115210 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115210", RDFFormat.TURTLE);
        Film filmQ15233484 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15233484", RDFFormat.TURTLE);
        Film filmQ10656828 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10656828", RDFFormat.TURTLE);
        Film filmQ1319856 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1319856", RDFFormat.TURTLE);
        Film filmQ19824614 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19824614", RDFFormat.TURTLE);
        Film filmQ63207551 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q63207551", RDFFormat.TURTLE);
        Film filmQ25503 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q25503", RDFFormat.TURTLE);
        Film filmQ1304948 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1304948", RDFFormat.TURTLE);
        Film filmQ3442112 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3442112", RDFFormat.TURTLE);
        Film filmQ327775 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q327775", RDFFormat.TURTLE);
        Film filmQ4549654 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4549654", RDFFormat.TURTLE);
        Film filmQ5310123 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5310123", RDFFormat.TURTLE);
        Film filmQ19706919 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19706919", RDFFormat.TURTLE);
        Film filmQ7718072 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7718072", RDFFormat.TURTLE);
        Film filmQ8240308 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q8240308", RDFFormat.TURTLE);
        Film filmQ10822367 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10822367", RDFFormat.TURTLE);
        Film filmQ55987638 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q55987638", RDFFormat.TURTLE);
        Film filmQ327681 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q327681", RDFFormat.TURTLE);
        Film filmQ3222729 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3222729", RDFFormat.TURTLE);
        Film filmQ3507182 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3507182", RDFFormat.TURTLE);
        Film filmQ11602165 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11602165", RDFFormat.TURTLE);
        Film filmQ1139214 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1139214", RDFFormat.TURTLE);
        Film filmQ1134037 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1134037", RDFFormat.TURTLE);
        Film filmQ3090986 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3090986", RDFFormat.TURTLE);
        Film filmQ6692614 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6692614", RDFFormat.TURTLE);
        Film filmQ1641246 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1641246", RDFFormat.TURTLE);
        Film filmQ2679094 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2679094", RDFFormat.TURTLE);
        Film filmQ89799633 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q89799633", RDFFormat.TURTLE);
        Film filmQ3228480 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3228480", RDFFormat.TURTLE);
        Film filmQ3205456 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3205456", RDFFormat.TURTLE);
        Film filmQ109556784 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q109556784", RDFFormat.TURTLE);
        Film filmQ69303989 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q69303989", RDFFormat.TURTLE);
        Film filmQ661142 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q661142", RDFFormat.TURTLE);
        Film filmQ111678098 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111678098", RDFFormat.TURTLE);
        Film filmQ73223275 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q73223275", RDFFormat.TURTLE);
        Film filmQ18291669 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18291669", RDFFormat.TURTLE);
        Film filmQ20428303 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q20428303", RDFFormat.TURTLE);
        Film filmQ1595568 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1595568", RDFFormat.TURTLE);
        Film filmQ3552767 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3552767", RDFFormat.TURTLE);
        Film filmQ18709384 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18709384", RDFFormat.TURTLE);
        Film filmQ5392951 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5392951", RDFFormat.TURTLE);
        Film filmQ59644269 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q59644269", RDFFormat.TURTLE);
        Film filmQ113056313 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113056313", RDFFormat.TURTLE);
        Film filmQ1138846 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1138846", RDFFormat.TURTLE);
        Film filmQ5485474 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5485474", RDFFormat.TURTLE);
        Film filmQ3222149 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3222149", RDFFormat.TURTLE);
        Film filmQ18679473 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18679473", RDFFormat.TURTLE);
        Film filmQ111134216 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111134216", RDFFormat.TURTLE);
        Film filmQ17448098 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17448098", RDFFormat.TURTLE);
        Film filmQ11891168 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11891168", RDFFormat.TURTLE);
        Film filmQ847031 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q847031", RDFFormat.TURTLE);
        Film filmQ10671338 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10671338", RDFFormat.TURTLE);
        Film filmQ1233436 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1233436", RDFFormat.TURTLE);
        Film filmQ6321276 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6321276", RDFFormat.TURTLE);
        Film filmQ5795840 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5795840", RDFFormat.TURTLE);
        Film filmQ1338487 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1338487", RDFFormat.TURTLE);
        Film filmQ3445514 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3445514", RDFFormat.TURTLE);
        Film filmQ7770736 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7770736", RDFFormat.TURTLE);
        Film filmQ1406280 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1406280", RDFFormat.TURTLE);
        Film filmQ1306557 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1306557", RDFFormat.TURTLE);
        Film filmQ2434685 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2434685", RDFFormat.TURTLE);
        Film filmQ508766 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q508766", RDFFormat.TURTLE);
        Film filmQ101165631 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q101165631", RDFFormat.TURTLE);
        Film filmQ3209691 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3209691", RDFFormat.TURTLE);
        Film filmQ303312 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q303312", RDFFormat.TURTLE);
        Film filmQ54975435 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q54975435", RDFFormat.TURTLE);
        Film filmQ42297120 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q42297120", RDFFormat.TURTLE);
        Film filmQ29380607 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q29380607", RDFFormat.TURTLE);
        Film filmQ1216674 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1216674", RDFFormat.TURTLE);
        Film filmQ11821482 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11821482", RDFFormat.TURTLE);
        Film filmQ110934760 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110934760", RDFFormat.TURTLE);
        Film filmQ55241380 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q55241380", RDFFormat.TURTLE);
        Film filmQ20428185 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q20428185", RDFFormat.TURTLE);
        Film filmQ7741216 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7741216", RDFFormat.TURTLE);
        Film filmQ5398806 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5398806", RDFFormat.TURTLE);
        Film filmQ12314585 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12314585", RDFFormat.TURTLE);
        Film filmQ6358074 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6358074", RDFFormat.TURTLE);
        Film filmQ12369119 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12369119", RDFFormat.TURTLE);
        Film filmQ491352 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q491352", RDFFormat.TURTLE);
        Film filmQ12308291 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12308291", RDFFormat.TURTLE);
        Film filmQ15095097 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15095097", RDFFormat.TURTLE);
        Film filmQ2840653 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2840653", RDFFormat.TURTLE);
        Film filmQ18517241 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18517241", RDFFormat.TURTLE);
        Film filmQ2907529 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2907529", RDFFormat.TURTLE);
        Film filmQ46028619 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q46028619", RDFFormat.TURTLE);
        Film filmQ314962 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q314962", RDFFormat.TURTLE);
        Film filmQ65245405 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q65245405", RDFFormat.TURTLE);
        Film filmQ107452739 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107452739", RDFFormat.TURTLE);
        Film filmQ49096626 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q49096626", RDFFormat.TURTLE);
        Film filmQ1254081 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1254081", RDFFormat.TURTLE);
        Film filmQ3342211 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3342211", RDFFormat.TURTLE);
        Film filmQ850866 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q850866", RDFFormat.TURTLE);
        Film filmQ4533604 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4533604", RDFFormat.TURTLE);
        Film filmQ4766080 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4766080", RDFFormat.TURTLE);
        Film filmQ100573244 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100573244", RDFFormat.TURTLE);
        Film filmQ15710747 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15710747", RDFFormat.TURTLE);
        Film filmQ1143646 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1143646", RDFFormat.TURTLE);
        Film filmQ1472854 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1472854", RDFFormat.TURTLE);
        Film filmQ5728309 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5728309", RDFFormat.TURTLE);
        Film filmQ27158930 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27158930", RDFFormat.TURTLE);
        Film filmQ31509489 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q31509489", RDFFormat.TURTLE);
        Film filmQ65939784 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q65939784", RDFFormat.TURTLE);
        Film filmQ54847553 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q54847553", RDFFormat.TURTLE);
        Film filmQ747346 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q747346", RDFFormat.TURTLE);
        Film filmQ28750050 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28750050", RDFFormat.TURTLE);
        Film filmQ5351367 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5351367", RDFFormat.TURTLE);
        Film filmQ3549474 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3549474", RDFFormat.TURTLE);
        Film filmQ100721048 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100721048", RDFFormat.TURTLE);
        Film filmQ5969148 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5969148", RDFFormat.TURTLE);
        Film filmQ64212593 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q64212593", RDFFormat.TURTLE);
        Film filmQ7997063 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7997063", RDFFormat.TURTLE);
        Film filmQ2268575 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2268575", RDFFormat.TURTLE);
        Film filmQ1219667 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1219667", RDFFormat.TURTLE);
        Film filmQ21819915 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q21819915", RDFFormat.TURTLE);
        Film filmQ15695282 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15695282", RDFFormat.TURTLE);
        Film filmQ1310893 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1310893", RDFFormat.TURTLE);
        Film filmQ30763173 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q30763173", RDFFormat.TURTLE);
        Film filmQ3506147 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3506147", RDFFormat.TURTLE);
        Film filmQ2679556 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2679556", RDFFormat.TURTLE);
        Film filmQ425602 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q425602", RDFFormat.TURTLE);
        Film filmQ3525095 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3525095", RDFFormat.TURTLE);
        Film filmQ66587727 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q66587727", RDFFormat.TURTLE);
        Film filmQ318838 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q318838", RDFFormat.TURTLE);
        Film filmQ115788403 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115788403", RDFFormat.TURTLE);
        Film filmQ56223523 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q56223523", RDFFormat.TURTLE);
        Film filmQ10540694 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10540694", RDFFormat.TURTLE);
        Film filmQ11958374 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11958374", RDFFormat.TURTLE);
        Film filmQ117309390 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q117309390", RDFFormat.TURTLE);
        Film filmQ3495258 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3495258", RDFFormat.TURTLE);
        Film filmQ1336344 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1336344", RDFFormat.TURTLE);
        Film filmQ105117959 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105117959", RDFFormat.TURTLE);
        Film filmQ116908759 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q116908759", RDFFormat.TURTLE);
        Film filmQ10542151 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10542151", RDFFormat.TURTLE);
        Film filmQ111512798 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111512798", RDFFormat.TURTLE);
        Film filmQ3215779 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3215779", RDFFormat.TURTLE);
        Film filmQ106209394 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q106209394", RDFFormat.TURTLE);
        Film filmQ11705049 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11705049", RDFFormat.TURTLE);
        Film filmQ14955456 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14955456", RDFFormat.TURTLE);
        Film filmQ99656499 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q99656499", RDFFormat.TURTLE);
        Film filmQ21094914 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q21094914", RDFFormat.TURTLE);
        Film filmQ5479720 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5479720", RDFFormat.TURTLE);
        Film filmQ111472431 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111472431", RDFFormat.TURTLE);
        Film filmQ705887 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q705887", RDFFormat.TURTLE);
        Film filmQ112285446 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q112285446", RDFFormat.TURTLE);
        Film filmQ111103511 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111103511", RDFFormat.TURTLE);
        Film filmQ1851033 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1851033", RDFFormat.TURTLE);
        Film filmQ111208483 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111208483", RDFFormat.TURTLE);
        Film filmQ701369 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q701369", RDFFormat.TURTLE);
        Film filmQ3828502 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3828502", RDFFormat.TURTLE);
        Film filmQ93449101 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q93449101", RDFFormat.TURTLE);
        Film filmQ85915104 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q85915104", RDFFormat.TURTLE);
        Film filmQ6321283 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6321283", RDFFormat.TURTLE);
        Film filmQ100719246 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100719246", RDFFormat.TURTLE);
        Film filmQ3987923 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3987923", RDFFormat.TURTLE);
        Film filmQ920218 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q920218", RDFFormat.TURTLE);
        Film filmQ19977845 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19977845", RDFFormat.TURTLE);
        Film filmQ2209782 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2209782", RDFFormat.TURTLE);
        Film filmQ451568 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q451568", RDFFormat.TURTLE);
        Film filmQ1636502 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1636502", RDFFormat.TURTLE);
        Film filmQ695888 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q695888", RDFFormat.TURTLE);
        Film filmQ1759628 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1759628", RDFFormat.TURTLE);
        Film filmQ20428287 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q20428287", RDFFormat.TURTLE);
        Film filmQ1760094 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1760094", RDFFormat.TURTLE);
        Film filmQ1194323 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1194323", RDFFormat.TURTLE);
        Film filmQ27243409 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27243409", RDFFormat.TURTLE);
        Film filmQ113000489 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113000489", RDFFormat.TURTLE);
        Film filmQ15915588 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15915588", RDFFormat.TURTLE);
        Film filmQ4127687 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4127687", RDFFormat.TURTLE);
        Film filmQ2576433 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2576433", RDFFormat.TURTLE);
        Film filmQ4428244 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4428244", RDFFormat.TURTLE);
        Film filmQ6547944 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6547944", RDFFormat.TURTLE);
        Film filmQ595 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q595", RDFFormat.TURTLE);
        Film filmQ688506 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q688506", RDFFormat.TURTLE);
        Film filmQ11906150 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11906150", RDFFormat.TURTLE);
        Film filmQ669619 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q669619", RDFFormat.TURTLE);
        Film filmQ1217941 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1217941", RDFFormat.TURTLE);
        Film filmQ16723938 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16723938", RDFFormat.TURTLE);
        Film filmQ86087438 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q86087438", RDFFormat.TURTLE);
        Film filmQ682574 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q682574", RDFFormat.TURTLE);
        Film filmQ106206819 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q106206819", RDFFormat.TURTLE);
        Film filmQ7514682 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7514682", RDFFormat.TURTLE);
        Film filmQ4026963 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4026963", RDFFormat.TURTLE);
        Film filmQ114650454 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114650454", RDFFormat.TURTLE);
        Film filmQ3230571 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3230571", RDFFormat.TURTLE);
        Film filmQ107092356 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107092356", RDFFormat.TURTLE);
        Film filmQ105152510 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105152510", RDFFormat.TURTLE);
        Film filmQ55237863 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q55237863", RDFFormat.TURTLE);
        Film filmQ18625564 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18625564", RDFFormat.TURTLE);
        Film filmQ29017163 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q29017163", RDFFormat.TURTLE);
        Film filmQ5475151 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5475151", RDFFormat.TURTLE);
        Film filmQ111621124 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111621124", RDFFormat.TURTLE);
        Film filmQ98073566 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q98073566", RDFFormat.TURTLE);
        Film filmQ6802050 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6802050", RDFFormat.TURTLE);
        Film filmQ18289731 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18289731", RDFFormat.TURTLE);
        Film filmQ104782076 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q104782076", RDFFormat.TURTLE);
        Film filmQ28869984 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28869984", RDFFormat.TURTLE);
        Film filmQ1247293 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1247293", RDFFormat.TURTLE);
        Film filmQ3227016 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3227016", RDFFormat.TURTLE);
        Film filmQ3210712 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3210712", RDFFormat.TURTLE);
        Film filmQ18290985 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18290985", RDFFormat.TURTLE);
        Film filmQ10685760 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10685760", RDFFormat.TURTLE);
        Film filmQ117359374 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q117359374", RDFFormat.TURTLE);
        Film filmQ49101906 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q49101906", RDFFormat.TURTLE);
        Film filmQ4004139 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4004139", RDFFormat.TURTLE);
        Film filmQ18609932 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18609932", RDFFormat.TURTLE);
        Film filmQ1199716 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1199716", RDFFormat.TURTLE);
        Film filmQ1767675 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1767675", RDFFormat.TURTLE);
        Film filmQ3351715 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3351715", RDFFormat.TURTLE);
        Film filmQ3208293 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3208293", RDFFormat.TURTLE);
        Film filmQ472007 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q472007", RDFFormat.TURTLE);
        Film filmQ3208725 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3208725", RDFFormat.TURTLE);
        Film filmQ4353940 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4353940", RDFFormat.TURTLE);
        Film filmQ1123891 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1123891", RDFFormat.TURTLE);
        Film filmQ3222297 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3222297", RDFFormat.TURTLE);
        Film filmQ84810567 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q84810567", RDFFormat.TURTLE);
        Film filmQ6105351 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6105351", RDFFormat.TURTLE);
        Film filmQ3209080 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3209080", RDFFormat.TURTLE);
        Film filmQ2080828 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2080828", RDFFormat.TURTLE);
        Film filmQ101215825 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q101215825", RDFFormat.TURTLE);
        Film filmQ1409673 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1409673", RDFFormat.TURTLE);
        Film filmQ97200052 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q97200052", RDFFormat.TURTLE);
        Film filmQ88470513 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q88470513", RDFFormat.TURTLE);
        Film filmQ4127016 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4127016", RDFFormat.TURTLE);
        Film filmQ309459 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q309459", RDFFormat.TURTLE);
        Film filmQ954039 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q954039", RDFFormat.TURTLE);
        Film filmQ713916 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q713916", RDFFormat.TURTLE);
        Film filmQ85855063 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q85855063", RDFFormat.TURTLE);
        Film filmQ3208927 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3208927", RDFFormat.TURTLE);
        Film filmQ17413591 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17413591", RDFFormat.TURTLE);
        Film filmQ3566341 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3566341", RDFFormat.TURTLE);
        Film filmQ2567849 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2567849", RDFFormat.TURTLE);
        Film filmQ557990 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q557990", RDFFormat.TURTLE);
        Film filmQ4657304 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4657304", RDFFormat.TURTLE);
        Film filmQ2808301 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2808301", RDFFormat.TURTLE);
        Film filmQ11900201 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11900201", RDFFormat.TURTLE);
        Film filmQ5225914 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5225914", RDFFormat.TURTLE);
        Film filmQ3294972 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3294972", RDFFormat.TURTLE);
        Film filmQ3201987 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3201987", RDFFormat.TURTLE);
        Film filmQ3223681 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3223681", RDFFormat.TURTLE);
        Film filmQ113989251 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q113989251", RDFFormat.TURTLE);
        Film filmQ1542071 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1542071", RDFFormat.TURTLE);
        Film filmQ1388920 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1388920", RDFFormat.TURTLE);
        Film filmQ12328150 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12328150", RDFFormat.TURTLE);
        Film filmQ115256026 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115256026", RDFFormat.TURTLE);
        Film filmQ21079521 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q21079521", RDFFormat.TURTLE);
        Film filmQ431948 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q431948", RDFFormat.TURTLE);
        Film filmQ7332165 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7332165", RDFFormat.TURTLE);
        Film filmQ518137 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q518137", RDFFormat.TURTLE);
        Film filmQ820628 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q820628", RDFFormat.TURTLE);
        Film filmQ81058936 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q81058936", RDFFormat.TURTLE);
        Film filmQ99372454 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q99372454", RDFFormat.TURTLE);
        Film filmQ3561479 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3561479", RDFFormat.TURTLE);
        Film filmQ4240309 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4240309", RDFFormat.TURTLE);
        Film filmQ18695675 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18695675", RDFFormat.TURTLE);
        Film filmQ106774335 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q106774335", RDFFormat.TURTLE);
        Film filmQ10554715 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10554715", RDFFormat.TURTLE);
        Film filmQ4940557 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4940557", RDFFormat.TURTLE);
        Film filmQ110323755 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110323755", RDFFormat.TURTLE);
        Film filmQ30738266 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q30738266", RDFFormat.TURTLE);
        Film filmQ2943636 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2943636", RDFFormat.TURTLE);
        Film filmQ9077202 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q9077202", RDFFormat.TURTLE);
        Film filmQ1465323 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1465323", RDFFormat.TURTLE);
        Film filmQ690651 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q690651", RDFFormat.TURTLE);
        Film filmQ18332407 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18332407", RDFFormat.TURTLE);
        Film filmQ3612288 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3612288", RDFFormat.TURTLE);
        Film filmQ1989832 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1989832", RDFFormat.TURTLE);
        Film filmQ87904378 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87904378", RDFFormat.TURTLE);
        Film filmQ12126149 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12126149", RDFFormat.TURTLE);
        Film filmQ27536918 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27536918", RDFFormat.TURTLE);
        Film filmQ5824564 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5824564", RDFFormat.TURTLE);
        Film filmQ104144643 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q104144643", RDFFormat.TURTLE);
        Film filmQ1213714 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1213714", RDFFormat.TURTLE);
        Film filmQ18200409 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18200409", RDFFormat.TURTLE);
        Film filmQ33101290 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q33101290", RDFFormat.TURTLE);
        Film filmQ110218542 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110218542", RDFFormat.TURTLE);
        Film filmQ95753983 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q95753983", RDFFormat.TURTLE);
        Film filmQ87915228 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87915228", RDFFormat.TURTLE);
        Film filmQ1179378 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1179378", RDFFormat.TURTLE);
        Film filmQ12004262 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12004262", RDFFormat.TURTLE);
        Film filmQ59651754 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q59651754", RDFFormat.TURTLE);
        Film filmQ3548540 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3548540", RDFFormat.TURTLE);
        Film filmQ600674 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q600674", RDFFormat.TURTLE);
        Film filmQ18333993 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18333993", RDFFormat.TURTLE);
        Film filmQ98726041 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q98726041", RDFFormat.TURTLE);
        Film filmQ1213713 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1213713", RDFFormat.TURTLE);
        Film filmQ1756526 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1756526", RDFFormat.TURTLE);
        Film filmQ6798250 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6798250", RDFFormat.TURTLE);
        Film filmQ11890922 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11890922", RDFFormat.TURTLE);
        Film filmQ85296314 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q85296314", RDFFormat.TURTLE);
        Film filmQ4680027 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4680027", RDFFormat.TURTLE);
        Film filmQ30139493 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q30139493", RDFFormat.TURTLE);
        Film filmQ918380 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q918380", RDFFormat.TURTLE);
        Film filmQ18589892 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18589892", RDFFormat.TURTLE);
        Film filmQ107689737 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107689737", RDFFormat.TURTLE);
        Film filmQ10726831 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10726831", RDFFormat.TURTLE);
        Film filmQ340126 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q340126", RDFFormat.TURTLE);
        Film filmQ100276888 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100276888", RDFFormat.TURTLE);
        Film filmQ56999748 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q56999748", RDFFormat.TURTLE);
        Film filmQ2354576 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2354576", RDFFormat.TURTLE);
        Film filmQ5552455 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5552455", RDFFormat.TURTLE);
        Film filmQ287001 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q287001", RDFFormat.TURTLE);
        Film filmQ98378016 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q98378016", RDFFormat.TURTLE);
        Film filmQ111838990 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111838990", RDFFormat.TURTLE);
        Film filmQ55237869 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q55237869", RDFFormat.TURTLE);
        Film filmQ10506677 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10506677", RDFFormat.TURTLE);
        Film filmQ2466081 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2466081", RDFFormat.TURTLE);
        Film filmQ11851734 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11851734", RDFFormat.TURTLE);
        Film filmQ908750 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q908750", RDFFormat.TURTLE);
        Film filmQ1243969 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1243969", RDFFormat.TURTLE);
        Film filmQ95633701 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q95633701", RDFFormat.TURTLE);
        Film filmQ87990737 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87990737", RDFFormat.TURTLE);
        Film filmQ3851902 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3851902", RDFFormat.TURTLE);
        Film filmQ116510820 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q116510820", RDFFormat.TURTLE);
        Film filmQ30782103 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q30782103", RDFFormat.TURTLE);
        Film filmQ107068399 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107068399", RDFFormat.TURTLE);
        Film filmQ54975514 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q54975514", RDFFormat.TURTLE);
        Film filmQ96033230 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q96033230", RDFFormat.TURTLE);
        Film filmQ48672559 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q48672559", RDFFormat.TURTLE);
        Film filmQ786222 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q786222", RDFFormat.TURTLE);
        Film filmQ87005467 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87005467", RDFFormat.TURTLE);
        Film filmQ110783594 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110783594", RDFFormat.TURTLE);
        Film filmQ534447 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q534447", RDFFormat.TURTLE);
        Film filmQ87983078 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87983078", RDFFormat.TURTLE);
        Film filmQ60536766 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q60536766", RDFFormat.TURTLE);
        Film filmQ671754 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q671754", RDFFormat.TURTLE);
        Film filmQ51880327 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q51880327", RDFFormat.TURTLE);
        Film filmQ81550678 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q81550678", RDFFormat.TURTLE);
        Film filmQ18291668 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18291668", RDFFormat.TURTLE);
        Film filmQ4700549 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4700549", RDFFormat.TURTLE);
        Film filmQ665371 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q665371", RDFFormat.TURTLE);
        Film filmQ49001848 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q49001848", RDFFormat.TURTLE);
        Film filmQ1073297 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1073297", RDFFormat.TURTLE);
        Film filmQ3548773 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3548773", RDFFormat.TURTLE);
        Film filmQ118113614 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q118113614", RDFFormat.TURTLE);
        Film filmQ18291670 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18291670", RDFFormat.TURTLE);
        Film filmQ110323754 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110323754", RDFFormat.TURTLE);
        Film filmQ1763166 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1763166", RDFFormat.TURTLE);
        Film filmQ1170819 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1170819", RDFFormat.TURTLE);
        Film filmQ95386344 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q95386344", RDFFormat.TURTLE);
        Film filmQ65055293 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q65055293", RDFFormat.TURTLE);
        Film filmQ9006259 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q9006259", RDFFormat.TURTLE);
        Film filmQ4142285 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4142285", RDFFormat.TURTLE);
        Film filmQ106489375 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q106489375", RDFFormat.TURTLE);
        Film filmQ17009876 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17009876", RDFFormat.TURTLE);
        Film filmQ3211637 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3211637", RDFFormat.TURTLE);
        Film filmQ15729867 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15729867", RDFFormat.TURTLE);
        Film filmQ28170395 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28170395", RDFFormat.TURTLE);
        Film filmQ615237 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q615237", RDFFormat.TURTLE);
        Film filmQ50877869 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q50877869", RDFFormat.TURTLE);
        Film filmQ115180359 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115180359", RDFFormat.TURTLE);
        Film filmQ165525 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q165525", RDFFormat.TURTLE);
        Film filmQ61672494 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q61672494", RDFFormat.TURTLE);
        Film filmQ3828459 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3828459", RDFFormat.TURTLE);
        Film filmQ3744320 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3744320", RDFFormat.TURTLE);
        Film filmQ108936156 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q108936156", RDFFormat.TURTLE);
        Film filmQ11980227 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11980227", RDFFormat.TURTLE);
        Film filmQ30126665 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q30126665", RDFFormat.TURTLE);
        Film filmQ47087456 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q47087456", RDFFormat.TURTLE);
        Film filmQ7440814 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7440814", RDFFormat.TURTLE);
        Film filmQ81089885 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q81089885", RDFFormat.TURTLE);
        Film filmQ9252015 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q9252015", RDFFormat.TURTLE);
        Film filmQ105123734 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105123734", RDFFormat.TURTLE);
        Film filmQ11977524 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11977524", RDFFormat.TURTLE);
        Film filmQ15550189 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15550189", RDFFormat.TURTLE);
        Film filmQ108133935 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q108133935", RDFFormat.TURTLE);
        Film filmQ27996429 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27996429", RDFFormat.TURTLE);
        Film filmQ110206775 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110206775", RDFFormat.TURTLE);
        Film filmQ12334998 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12334998", RDFFormat.TURTLE);
        Film filmQ11190016 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11190016", RDFFormat.TURTLE);
        Film filmQ63985561 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q63985561", RDFFormat.TURTLE);
        Film filmQ107305176 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107305176", RDFFormat.TURTLE);
        Film filmQ14955418 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14955418", RDFFormat.TURTLE);
        Film filmQ2153352 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2153352", RDFFormat.TURTLE);
        Film filmQ110797609 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110797609", RDFFormat.TURTLE);
        Film filmQ110365 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110365", RDFFormat.TURTLE);
        Film filmQ1197861 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1197861", RDFFormat.TURTLE);
        Film filmQ676723 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q676723", RDFFormat.TURTLE);
        Film filmQ19750881 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19750881", RDFFormat.TURTLE);
        Film filmQ7741096 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7741096", RDFFormat.TURTLE);
        Film filmQ1058682 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1058682", RDFFormat.TURTLE);
        Film filmQ87914692 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87914692", RDFFormat.TURTLE);
        Film filmQ633836 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q633836", RDFFormat.TURTLE);
        Film filmQ62513 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q62513", RDFFormat.TURTLE);
        Film filmQ1360124 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1360124", RDFFormat.TURTLE);
        Film filmQ7620423 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7620423", RDFFormat.TURTLE);
        Film filmQ65055359 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q65055359", RDFFormat.TURTLE);
        Film filmQ111622379 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111622379", RDFFormat.TURTLE);
        Film filmQ56276944 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q56276944", RDFFormat.TURTLE);
        Film filmQ18713337 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18713337", RDFFormat.TURTLE);
        Film filmQ15401854 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15401854", RDFFormat.TURTLE);
        Film filmQ472034 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q472034", RDFFormat.TURTLE);
        Film filmQ90545563 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q90545563", RDFFormat.TURTLE);
        Film filmQ18290865 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18290865", RDFFormat.TURTLE);
        Film filmQ108442799 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q108442799", RDFFormat.TURTLE);
        Film filmQ67022467 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q67022467", RDFFormat.TURTLE);
        Film filmQ116870208 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q116870208", RDFFormat.TURTLE);
        Film filmQ1432953 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1432953", RDFFormat.TURTLE);
        Film filmQ11942384 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11942384", RDFFormat.TURTLE);
        Film filmQ377274 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q377274", RDFFormat.TURTLE);
        Film filmQ48807252 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q48807252", RDFFormat.TURTLE);
        Film filmQ107428689 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107428689", RDFFormat.TURTLE);
        Film filmQ3050323 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3050323", RDFFormat.TURTLE);
        Film filmQ105067221 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q105067221", RDFFormat.TURTLE);
        Film filmQ3742608 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3742608", RDFFormat.TURTLE);
        Film filmQ61731409 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q61731409", RDFFormat.TURTLE);
        Film filmQ3399752 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3399752", RDFFormat.TURTLE);
        Film filmQ180244 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q180244", RDFFormat.TURTLE);
        Film filmQ88012667 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q88012667", RDFFormat.TURTLE);
        Film filmQ102039464 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q102039464", RDFFormat.TURTLE);
        Film filmQ3382170 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3382170", RDFFormat.TURTLE);
        Film filmQ2904867 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2904867", RDFFormat.TURTLE);
        Film filmQ89281065 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q89281065", RDFFormat.TURTLE);
        Film filmQ7091877 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7091877", RDFFormat.TURTLE);
        Film filmQ106103421 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q106103421", RDFFormat.TURTLE);
        Film filmQ31749504 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q31749504", RDFFormat.TURTLE);
        Film filmQ114662969 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114662969", RDFFormat.TURTLE);
        Film filmQ4993093 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4993093", RDFFormat.TURTLE);
        Film filmQ1322361 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1322361", RDFFormat.TURTLE);
        Film filmQ401539 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q401539", RDFFormat.TURTLE);
        Film filmQ61726953 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q61726953", RDFFormat.TURTLE);
        Film filmQ3794489 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3794489", RDFFormat.TURTLE);
        Film filmQ107174589 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107174589", RDFFormat.TURTLE);
        Film filmQ80177730 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q80177730", RDFFormat.TURTLE);
        Film filmQ46078971 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q46078971", RDFFormat.TURTLE);
        Film filmQ976119 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q976119", RDFFormat.TURTLE);
        Film filmQ18334119 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18334119", RDFFormat.TURTLE);
        Film filmQ2632905 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2632905", RDFFormat.TURTLE);
        Film filmQ28750102 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28750102", RDFFormat.TURTLE);
        Film filmQ1571941 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1571941", RDFFormat.TURTLE);
        Film filmQ18693351 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18693351", RDFFormat.TURTLE);
        Film filmQ2895605 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2895605", RDFFormat.TURTLE);
        Film filmQ95627061 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q95627061", RDFFormat.TURTLE);
        Film filmQ13406787 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q13406787", RDFFormat.TURTLE);
        Film filmQ20155790 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q20155790", RDFFormat.TURTLE);
        Film filmQ1409130 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1409130", RDFFormat.TURTLE);
        Film filmQ7148826 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7148826", RDFFormat.TURTLE);
        Film filmQ27832313 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27832313", RDFFormat.TURTLE);
        Film filmQ2053630 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2053630", RDFFormat.TURTLE);
        Film filmQ104180428 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q104180428", RDFFormat.TURTLE);
        Film filmQ10428399 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10428399", RDFFormat.TURTLE);
        Film filmQ3576737 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3576737", RDFFormat.TURTLE);
        Film filmQ200607 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q200607", RDFFormat.TURTLE);
        Film filmQ659442 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q659442", RDFFormat.TURTLE);
        Film filmQ107647646 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107647646", RDFFormat.TURTLE);
        Film filmQ111667677 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111667677", RDFFormat.TURTLE);
        Film filmQ117378 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q117378", RDFFormat.TURTLE);
        Film filmQ66442210 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q66442210", RDFFormat.TURTLE);
        Film filmQ49102385 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q49102385", RDFFormat.TURTLE);
        Film filmQ1467757 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1467757", RDFFormat.TURTLE);
        Film filmQ1256208 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1256208", RDFFormat.TURTLE);
        Film filmQ73481992 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q73481992", RDFFormat.TURTLE);
        Film filmQ127542 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q127542", RDFFormat.TURTLE);
        Film filmQ3549138 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3549138", RDFFormat.TURTLE);
        Film filmQ111668041 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111668041", RDFFormat.TURTLE);
        Film filmQ110892074 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q110892074", RDFFormat.TURTLE);
        Film filmQ104898284 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q104898284", RDFFormat.TURTLE);
        Film filmQ6461048 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6461048", RDFFormat.TURTLE);
        Film filmQ3212094 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3212094", RDFFormat.TURTLE);
        Film filmQ1284439 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1284439", RDFFormat.TURTLE);
        Film filmQ1784355 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1784355", RDFFormat.TURTLE);
        Film filmQ17415616 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17415616", RDFFormat.TURTLE);
        Film filmQ17018223 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q17018223", RDFFormat.TURTLE);
        Film filmQ98652006 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q98652006", RDFFormat.TURTLE);
        Film filmQ10535496 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10535496", RDFFormat.TURTLE);
        Film filmQ322206 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q322206", RDFFormat.TURTLE);
        Film filmQ87977631 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87977631", RDFFormat.TURTLE);
        Film filmQ80678019 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q80678019", RDFFormat.TURTLE);
        Film filmQ670309 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q670309", RDFFormat.TURTLE);
        Film filmQ10672407 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10672407", RDFFormat.TURTLE);
        Film filmQ6321287 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6321287", RDFFormat.TURTLE);
        Film filmQ115739625 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115739625", RDFFormat.TURTLE);
        Film filmQ12006352 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12006352", RDFFormat.TURTLE);
        Film filmQ7771540 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7771540", RDFFormat.TURTLE);
        Film filmQ21646496 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q21646496", RDFFormat.TURTLE);
        Film filmQ114728589 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q114728589", RDFFormat.TURTLE);
        Film filmQ795680 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q795680", RDFFormat.TURTLE);
        Film filmQ23931098 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q23931098", RDFFormat.TURTLE);
        Film filmQ19384587 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19384587", RDFFormat.TURTLE);
        Film filmQ100490548 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100490548", RDFFormat.TURTLE);
        Film filmQ18647013 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18647013", RDFFormat.TURTLE);
        Film filmQ5826813 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5826813", RDFFormat.TURTLE);
        Film filmQ2298877 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2298877", RDFFormat.TURTLE);
        Film filmQ3479117 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3479117", RDFFormat.TURTLE);
        Film filmQ2346134 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2346134", RDFFormat.TURTLE);
        Film filmQ94968121 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q94968121", RDFFormat.TURTLE);
        Film filmQ481606 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q481606", RDFFormat.TURTLE);
        Film filmQ5675778 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5675778", RDFFormat.TURTLE);
        Film filmQ221887 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q221887", RDFFormat.TURTLE);
        Film filmQ107133629 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q107133629", RDFFormat.TURTLE);
        Film filmQ3212176 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3212176", RDFFormat.TURTLE);
        Film filmQ3202989 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3202989", RDFFormat.TURTLE);
        Film filmQ12058242 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q12058242", RDFFormat.TURTLE);
        Film filmQ11876205 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q11876205", RDFFormat.TURTLE);
        Film filmQ15696724 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15696724", RDFFormat.TURTLE);
        Film filmQ3223189 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3223189", RDFFormat.TURTLE);
        Film filmQ111970534 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q111970534", RDFFormat.TURTLE);
        Film filmQ3455471 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3455471", RDFFormat.TURTLE);
        Film filmQ19816400 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19816400", RDFFormat.TURTLE);
        Film filmQ10526581 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10526581", RDFFormat.TURTLE);
        Film filmQ5968422 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5968422", RDFFormat.TURTLE);
        Film filmQ4752697 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4752697", RDFFormat.TURTLE);
        Film filmQ82936372 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q82936372", RDFFormat.TURTLE);
        Film filmQ1758592 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1758592", RDFFormat.TURTLE);
        Film filmQ18713321 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18713321", RDFFormat.TURTLE);
        Film filmQ18450499 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18450499", RDFFormat.TURTLE);
        Film filmQ87263554 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87263554", RDFFormat.TURTLE);
        Film filmQ18674926 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18674926", RDFFormat.TURTLE);
        Film filmQ220741 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q220741", RDFFormat.TURTLE);
        Film filmQ18202649 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18202649", RDFFormat.TURTLE);
        Film filmQ59721 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q59721", RDFFormat.TURTLE);
        Film filmQ100535001 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100535001", RDFFormat.TURTLE);
        Film filmQ3281101 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3281101", RDFFormat.TURTLE);
        Film filmQ115284841 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q115284841", RDFFormat.TURTLE);
        Film filmQ19819323 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q19819323", RDFFormat.TURTLE);
        Film filmQ707220 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q707220", RDFFormat.TURTLE);
        Film filmQ15847583 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q15847583", RDFFormat.TURTLE);
        Film filmQ5573686 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5573686", RDFFormat.TURTLE);
        Film filmQ87921252 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87921252", RDFFormat.TURTLE);
        Film filmQ464032 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q464032", RDFFormat.TURTLE);
        Film filmQ4233797 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4233797", RDFFormat.TURTLE);
        Film filmQ4902928 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4902928", RDFFormat.TURTLE);
        Film filmQ60581101 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q60581101", RDFFormat.TURTLE);
        Film filmQ94636850 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q94636850", RDFFormat.TURTLE);
        Film filmQ6122924 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6122924", RDFFormat.TURTLE);
        Film filmQ2841294 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2841294", RDFFormat.TURTLE);
        Film filmQ1216353 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1216353", RDFFormat.TURTLE);
        Film filmQ5450095 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5450095", RDFFormat.TURTLE);
        Film filmQ94996524 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q94996524", RDFFormat.TURTLE);
        Film filmQ7776218 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7776218", RDFFormat.TURTLE);
        Film filmQ16029070 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16029070", RDFFormat.TURTLE);
        Film filmQ6172472 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6172472", RDFFormat.TURTLE);
        Film filmQ14955332 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q14955332", RDFFormat.TURTLE);
        Film filmQ86996395 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q86996395", RDFFormat.TURTLE);
        Film filmQ64666990 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q64666990", RDFFormat.TURTLE);
        Film filmQ2518061 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2518061", RDFFormat.TURTLE);
        Film filmQ28750149 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28750149", RDFFormat.TURTLE);
        Film filmQ5901176 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q5901176", RDFFormat.TURTLE);
        Film filmQ60173789 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q60173789", RDFFormat.TURTLE);
        Film filmQ58424028 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q58424028", RDFFormat.TURTLE);
        Film filmQ2746391 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2746391", RDFFormat.TURTLE);
        Film filmQ27996422 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q27996422", RDFFormat.TURTLE);
        Film filmQ16643070 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16643070", RDFFormat.TURTLE);
        Film filmQ117787446 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q117787446", RDFFormat.TURTLE);
        Film filmQ43231040 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q43231040", RDFFormat.TURTLE);
        Film filmQ88172500 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q88172500", RDFFormat.TURTLE);
        Film filmQ323275 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q323275", RDFFormat.TURTLE);
        Film filmQ21877685 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q21877685", RDFFormat.TURTLE);
        Film filmQ2986152 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2986152", RDFFormat.TURTLE);
        Film filmQ7651880 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q7651880", RDFFormat.TURTLE);
        Film filmQ16670248 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q16670248", RDFFormat.TURTLE);
        Film filmQ95483925 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q95483925", RDFFormat.TURTLE);
        Film filmQ3849768 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3849768", RDFFormat.TURTLE);
        Film filmQ6321278 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q6321278", RDFFormat.TURTLE);
        Film filmQ478780 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q478780", RDFFormat.TURTLE);
        Film filmQ2983218 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2983218", RDFFormat.TURTLE);
        Film filmQ3024177 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3024177", RDFFormat.TURTLE);
        Film filmQ87917568 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q87917568", RDFFormat.TURTLE);
        Film filmQ65126245 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q65126245", RDFFormat.TURTLE);
        Film filmQ4317084 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q4317084", RDFFormat.TURTLE);
        Film filmQ108885070 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q108885070", RDFFormat.TURTLE);
        Film filmQ152181 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q152181", RDFFormat.TURTLE);
        Film filmQ593573 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q593573", RDFFormat.TURTLE);
        Film filmQ97620735 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q97620735", RDFFormat.TURTLE);
        Film filmQ104177168 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q104177168", RDFFormat.TURTLE);
        Film filmQ3311787 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3311787", RDFFormat.TURTLE);
        Film filmQ759439 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q759439", RDFFormat.TURTLE);
        Film filmQ572772 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q572772", RDFFormat.TURTLE);
        Film filmQ10709396 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q10709396", RDFFormat.TURTLE);
        Film filmQ1170481 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q1170481", RDFFormat.TURTLE);
        Film filmQ3000734 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q3000734", RDFFormat.TURTLE);
        Film filmQ2579095 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q2579095", RDFFormat.TURTLE);
        Film filmQ100323695 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q100323695", RDFFormat.TURTLE);
        Film filmQ18333956 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q18333956", RDFFormat.TURTLE);
        Film filmQ82847 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q82847", RDFFormat.TURTLE);
        Film filmQ28493932 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/Q28493932", RDFFormat.TURTLE);
        return Arrays.asList(filmQ79325925,
                filmQ4171789,
                filmQ2382876,
                filmQ2856158,
                filmQ87126428,
                filmQ3505874,
                filmQ3273610,
                filmQ1176468,
                filmQ55596316,
                filmQ57280267,
                filmQ3565938,
                filmQ5659581,
                filmQ3226566,
                filmQ3202804,
                filmQ14956653,
                filmQ3507676,
                filmQ16352387,
                filmQ1962929,
                filmQ2793244,
                filmQ20736973,
                filmQ8074754,
                filmQ18168128,
                filmQ100745823,
                filmQ6727707,
                filmQ9386264,
                filmQ555367,
                filmQ7134201,
                filmQ49436483,
                filmQ108633594,
                filmQ848182,
                filmQ3472411,
                filmQ17049931,
                filmQ3207681,
                filmQ97732951,
                filmQ111264314,
                filmQ14912519,
                filmQ491442,
                filmQ151751,
                filmQ3443570,
                filmQ841958,
                filmQ10649818,
                filmQ114710612,
                filmQ10510627,
                filmQ18245027,
                filmQ11960872,
                filmQ18161925,
                filmQ593718,
                filmQ6532425,
                filmQ592300,
                filmQ684936,
                filmQ10667067,
                filmQ118253328,
                filmQ11997515,
                filmQ5288137,
                filmQ1249706,
                filmQ1242727,
                filmQ10551717,
                filmQ1218528,
                filmQ7332167,
                filmQ55766341,
                filmQ1034579,
                filmQ7621068,
                filmQ104501654,
                filmQ767502,
                filmQ1061541,
                filmQ16560275,
                filmQ2891629,
                filmQ4848906,
                filmQ775356,
                filmQ3140771,
                filmQ10571193,
                filmQ8354260,
                filmQ1306792,
                filmQ18290460,
                filmQ5850047,
                filmQ28750010,
                filmQ10539097,
                filmQ28494295,
                filmQ152206,
                filmQ110878301,
                filmQ1758987,
                filmQ1321885,
                filmQ392684,
                filmQ105702167,
                filmQ109772275,
                filmQ17414136,
                filmQ1056376,
                filmQ1142950,
                filmQ1437026,
                filmQ917910,
                filmQ274895,
                filmQ3549732,
                filmQ16176965,
                filmQ17761130,
                filmQ1897674,
                filmQ2944340,
                filmQ16655559,
                filmQ101091534,
                filmQ115806129,
                filmQ1756532,
                filmQ100401223,
                filmQ3211075,
                filmQ338253,
                filmQ10727897,
                filmQ100558146,
                filmQ100564447,
                filmQ99372801,
                filmQ3580165,
                filmQ126123,
                filmQ1043604,
                filmQ1193633,
                filmQ20493926,
                filmQ114958631,
                filmQ83772164,
                filmQ1212650,
                filmQ114902139,
                filmQ3515276,
                filmQ60854215,
                filmQ1305605,
                filmQ106375335,
                filmQ330113,
                filmQ89186326,
                filmQ4411796,
                filmQ19885882,
                filmQ976934,
                filmQ11883018,
                filmQ17257743,
                filmQ4030599,
                filmQ110869210,
                filmQ113360807,
                filmQ17859530,
                filmQ5554658,
                filmQ10706553,
                filmQ23899153,
                filmQ75016227,
                filmQ15831535,
                filmQ1192184,
                filmQ110269385,
                filmQ1458594,
                filmQ46997065,
                filmQ3057816,
                filmQ3113698,
                filmQ6321280,
                filmQ866673,
                filmQ11899615,
                filmQ96108011,
                filmQ27134309,
                filmQ114708739,
                filmQ1101982,
                filmQ16651349,
                filmQ601511,
                filmQ110825629,
                filmQ5011810,
                filmQ28750121,
                filmQ990857,
                filmQ5411520,
                filmQ16423637,
                filmQ7295394,
                filmQ23040725,
                filmQ14970927,
                filmQ470375,
                filmQ27703697,
                filmQ110837871,
                filmQ1056388,
                filmQ16516858,
                filmQ385167,
                filmQ3269855,
                filmQ117075837,
                filmQ10672590,
                filmQ111971525,
                filmQ947538,
                filmQ977950,
                filmQ10551011,
                filmQ3225644,
                filmQ65055322,
                filmQ5133706,
                filmQ2094615,
                filmQ15990789,
                filmQ1176116,
                filmQ100718251,
                filmQ1388936,
                filmQ18674916,
                filmQ786492,
                filmQ6438945,
                filmQ1678442,
                filmQ107270,
                filmQ18760009,
                filmQ14955328,
                filmQ23035641,
                filmQ27870191,
                filmQ1329527,
                filmQ1329415,
                filmQ5831962,
                filmQ114662298,
                filmQ7037327,
                filmQ112584985,
                filmQ13591827,
                filmQ16411911,
                filmQ16643742,
                filmQ48751380,
                filmQ1794537,
                filmQ3368190,
                filmQ3715945,
                filmQ14790983,
                filmQ64768475,
                filmQ110397,
                filmQ22001133,
                filmQ1125308,
                filmQ316018,
                filmQ1245864,
                filmQ366675,
                filmQ4357404,
                filmQ7801113,
                filmQ3365352,
                filmQ3493985,
                filmQ84724287,
                filmQ1403033,
                filmQ66758332,
                filmQ17102851,
                filmQ30763271,
                filmQ12049575,
                filmQ9004754,
                filmQ152090,
                filmQ58875268,
                filmQ67400758,
                filmQ109281584,
                filmQ105443513,
                filmQ3235295,
                filmQ96628864,
                filmQ16916708,
                filmQ1167202,
                filmQ166960,
                filmQ7258417,
                filmQ145274,
                filmQ1479633,
                filmQ916645,
                filmQ15240736,
                filmQ499851,
                filmQ107150070,
                filmQ5311397,
                filmQ81924220,
                filmQ661422,
                filmQ2873275,
                filmQ1141186,
                filmQ1196825,
                filmQ5139651,
                filmQ109249780,
                filmQ604954,
                filmQ1989715,
                filmQ7841992,
                filmQ88194278,
                filmQ3233216,
                filmQ466101,
                filmQ1108354,
                filmQ10516771,
                filmQ61742357,
                filmQ3068188,
                filmQ3202552,
                filmQ113025535,
                filmQ14895327,
                filmQ113269780,
                filmQ18274653,
                filmQ4170147,
                filmQ10527257,
                filmQ5997486,
                filmQ1633225,
                filmQ1538599,
                filmQ3227440,
                filmQ10673442,
                filmQ2608398,
                filmQ60737525,
                filmQ16246693,
                filmQ1407454,
                filmQ5775720,
                filmQ5098148,
                filmQ90698580,
                filmQ1759123,
                filmQ5271999,
                filmQ5966420,
                filmQ1426269,
                filmQ17505968,
                filmQ25447784,
                filmQ113030595,
                filmQ701252,
                filmQ110671126,
                filmQ2345475,
                filmQ7362416,
                filmQ96215709,
                filmQ3233424,
                filmQ98293661,
                filmQ4147895,
                filmQ110949249,
                filmQ387727,
                filmQ9019307,
                filmQ28726241,
                filmQ3363266,
                filmQ15916672,
                filmQ90565192,
                filmQ28733239,
                filmQ1629022,
                filmQ3346105,
                filmQ64019350,
                filmQ577875,
                filmQ1107196,
                filmQ18291583,
                filmQ14955376,
                filmQ113466212,
                filmQ99059867,
                filmQ941542,
                filmQ6358078,
                filmQ14955432,
                filmQ1035214,
                filmQ110892400,
                filmQ1827484,
                filmQ1471526,
                filmQ61043040,
                filmQ88215326,
                filmQ205687,
                filmQ594649,
                filmQ5469760,
                filmQ23685899,
                filmQ10540168,
                filmQ13461536,
                filmQ10713122,
                filmQ277038,
                filmQ1130310,
                filmQ1578702,
                filmQ18609942,
                filmQ27864184,
                filmQ105748250,
                filmQ61726949,
                filmQ105296607,
                filmQ21899325,
                filmQ64995036,
                filmQ1249296,
                filmQ2398968,
                filmQ3492392,
                filmQ17415300,
                filmQ115224292,
                filmQ36998754,
                filmQ5183676,
                filmQ94579290,
                filmQ6547945,
                filmQ91236969,
                filmQ1651807,
                filmQ15243037,
                filmQ432088,
                filmQ633131,
                filmQ3363736,
                filmQ15916412,
                filmQ2600583,
                filmQ8027984,
                filmQ97548877,
                filmQ48674479,
                filmQ587566,
                filmQ107549128,
                filmQ1758061,
                filmQ988018,
                filmQ2637045,
                filmQ4116194,
                filmQ695908,
                filmQ28720641,
                filmQ2980748,
                filmQ115210,
                filmQ15233484,
                filmQ10656828,
                filmQ1319856,
                filmQ19824614,
                filmQ63207551,
                filmQ25503,
                filmQ1304948,
                filmQ3442112,
                filmQ327775,
                filmQ4549654,
                filmQ5310123,
                filmQ19706919,
                filmQ7718072,
                filmQ8240308,
                filmQ10822367,
                filmQ55987638,
                filmQ327681,
                filmQ3222729,
                filmQ3507182,
                filmQ11602165,
                filmQ1139214,
                filmQ1134037,
                filmQ3090986,
                filmQ6692614,
                filmQ1641246,
                filmQ2679094,
                filmQ89799633,
                filmQ3228480,
                filmQ3205456,
                filmQ109556784,
                filmQ69303989,
                filmQ661142,
                filmQ111678098,
                filmQ73223275,
                filmQ18291669,
                filmQ20428303,
                filmQ1595568,
                filmQ3552767,
                filmQ18709384,
                filmQ5392951,
                filmQ59644269,
                filmQ113056313,
                filmQ1138846,
                filmQ5485474,
                filmQ3222149,
                filmQ18679473,
                filmQ111134216,
                filmQ17448098,
                filmQ11891168,
                filmQ847031,
                filmQ10671338,
                filmQ1233436,
                filmQ6321276,
                filmQ5795840,
                filmQ1338487,
                filmQ3445514,
                filmQ7770736,
                filmQ1406280,
                filmQ1306557,
                filmQ2434685,
                filmQ508766,
                filmQ101165631,
                filmQ3209691,
                filmQ303312,
                filmQ54975435,
                filmQ42297120,
                filmQ29380607,
                filmQ1216674,
                filmQ11821482,
                filmQ110934760,
                filmQ55241380,
                filmQ20428185,
                filmQ7741216,
                filmQ5398806,
                filmQ12314585,
                filmQ6358074,
                filmQ12369119,
                filmQ491352,
                filmQ12308291,
                filmQ15095097,
                filmQ2840653,
                filmQ18517241,
                filmQ2907529,
                filmQ46028619,
                filmQ314962,
                filmQ65245405,
                filmQ107452739,
                filmQ49096626,
                filmQ1254081,
                filmQ3342211,
                filmQ850866,
                filmQ4533604,
                filmQ4766080,
                filmQ100573244,
                filmQ15710747,
                filmQ1143646,
                filmQ1472854,
                filmQ5728309,
                filmQ27158930,
                filmQ31509489,
                filmQ65939784,
                filmQ54847553,
                filmQ747346,
                filmQ28750050,
                filmQ5351367,
                filmQ3549474,
                filmQ100721048,
                filmQ5969148,
                filmQ64212593,
                filmQ7997063,
                filmQ2268575,
                filmQ1219667,
                filmQ21819915,
                filmQ15695282,
                filmQ1310893,
                filmQ30763173,
                filmQ3506147,
                filmQ2679556,
                filmQ425602,
                filmQ3525095,
                filmQ66587727,
                filmQ318838,
                filmQ115788403,
                filmQ56223523,
                filmQ10540694,
                filmQ11958374,
                filmQ117309390,
                filmQ3495258,
                filmQ1336344,
                filmQ105117959,
                filmQ116908759,
                filmQ10542151,
                filmQ111512798,
                filmQ3215779,
                filmQ106209394,
                filmQ11705049,
                filmQ14955456,
                filmQ99656499,
                filmQ21094914,
                filmQ5479720,
                filmQ111472431,
                filmQ705887,
                filmQ112285446,
                filmQ111103511,
                filmQ1851033,
                filmQ111208483,
                filmQ701369,
                filmQ3828502,
                filmQ93449101,
                filmQ85915104,
                filmQ6321283,
                filmQ100719246,
                filmQ3987923,
                filmQ920218,
                filmQ19977845,
                filmQ2209782,
                filmQ451568,
                filmQ1636502,
                filmQ695888,
                filmQ1759628,
                filmQ20428287,
                filmQ1760094,
                filmQ1194323,
                filmQ27243409,
                filmQ113000489,
                filmQ15915588,
                filmQ4127687,
                filmQ2576433,
                filmQ4428244,
                filmQ6547944,
                filmQ595,
                filmQ688506,
                filmQ11906150,
                filmQ669619,
                filmQ1217941,
                filmQ16723938,
                filmQ86087438,
                filmQ682574,
                filmQ106206819,
                filmQ7514682,
                filmQ4026963,
                filmQ114650454,
                filmQ3230571,
                filmQ107092356,
                filmQ105152510,
                filmQ55237863,
                filmQ18625564,
                filmQ29017163,
                filmQ5475151,
                filmQ111621124,
                filmQ98073566,
                filmQ6802050,
                filmQ18289731,
                filmQ104782076,
                filmQ28869984,
                filmQ1247293,
                filmQ3227016,
                filmQ3210712,
                filmQ18290985,
                filmQ10685760,
                filmQ117359374,
                filmQ49101906,
                filmQ4004139,
                filmQ18609932,
                filmQ1199716,
                filmQ1767675,
                filmQ3351715,
                filmQ3208293,
                filmQ472007,
                filmQ3208725,
                filmQ4353940,
                filmQ1123891,
                filmQ3222297,
                filmQ84810567,
                filmQ6105351,
                filmQ3209080,
                filmQ2080828,
                filmQ101215825,
                filmQ1409673,
                filmQ97200052,
                filmQ88470513,
                filmQ4127016,
                filmQ309459,
                filmQ954039,
                filmQ713916,
                filmQ85855063,
                filmQ3208927,
                filmQ17413591,
                filmQ3566341,
                filmQ2567849,
                filmQ557990,
                filmQ4657304,
                filmQ2808301,
                filmQ11900201,
                filmQ5225914,
                filmQ3294972,
                filmQ3201987,
                filmQ3223681,
                filmQ113989251,
                filmQ1542071,
                filmQ1388920,
                filmQ12328150,
                filmQ115256026,
                filmQ21079521,
                filmQ431948,
                filmQ7332165,
                filmQ518137,
                filmQ820628,
                filmQ81058936,
                filmQ99372454,
                filmQ3561479,
                filmQ4240309,
                filmQ18695675,
                filmQ106774335,
                filmQ10554715,
                filmQ4940557,
                filmQ110323755,
                filmQ30738266,
                filmQ2943636,
                filmQ9077202,
                filmQ1465323,
                filmQ690651,
                filmQ18332407,
                filmQ3612288,
                filmQ1989832,
                filmQ87904378,
                filmQ12126149,
                filmQ27536918,
                filmQ5824564,
                filmQ104144643,
                filmQ1213714,
                filmQ18200409,
                filmQ33101290,
                filmQ110218542,
                filmQ95753983,
                filmQ87915228,
                filmQ1179378,
                filmQ12004262,
                filmQ59651754,
                filmQ3548540,
                filmQ600674,
                filmQ18333993,
                filmQ98726041,
                filmQ1213713,
                filmQ1756526,
                filmQ6798250,
                filmQ11890922,
                filmQ85296314,
                filmQ4680027,
                filmQ30139493,
                filmQ918380,
                filmQ18589892,
                filmQ107689737,
                filmQ10726831,
                filmQ340126,
                filmQ100276888,
                filmQ56999748,
                filmQ2354576,
                filmQ5552455,
                filmQ287001,
                filmQ98378016,
                filmQ111838990,
                filmQ55237869,
                filmQ10506677,
                filmQ2466081,
                filmQ11851734,
                filmQ908750,
                filmQ1243969,
                filmQ95633701,
                filmQ87990737,
                filmQ3851902,
                filmQ116510820,
                filmQ30782103,
                filmQ107068399,
                filmQ54975514,
                filmQ96033230,
                filmQ48672559,
                filmQ786222,
                filmQ87005467,
                filmQ110783594,
                filmQ534447,
                filmQ87983078,
                filmQ60536766,
                filmQ671754,
                filmQ51880327,
                filmQ81550678,
                filmQ18291668,
                filmQ4700549,
                filmQ665371,
                filmQ49001848,
                filmQ1073297,
                filmQ3548773,
                filmQ118113614,
                filmQ18291670,
                filmQ110323754,
                filmQ1763166,
                filmQ1170819,
                filmQ95386344,
                filmQ65055293,
                filmQ9006259,
                filmQ4142285,
                filmQ106489375,
                filmQ17009876,
                filmQ3211637,
                filmQ15729867,
                filmQ28170395,
                filmQ615237,
                filmQ50877869,
                filmQ115180359,
                filmQ165525,
                filmQ61672494,
                filmQ3828459,
                filmQ3744320,
                filmQ108936156,
                filmQ11980227,
                filmQ30126665,
                filmQ47087456,
                filmQ7440814,
                filmQ81089885,
                filmQ9252015,
                filmQ105123734,
                filmQ11977524,
                filmQ15550189,
                filmQ108133935,
                filmQ27996429,
                filmQ110206775,
                filmQ12334998,
                filmQ11190016,
                filmQ63985561,
                filmQ107305176,
                filmQ14955418,
                filmQ2153352,
                filmQ110797609,
                filmQ110365,
                filmQ1197861,
                filmQ676723,
                filmQ19750881,
                filmQ7741096,
                filmQ1058682,
                filmQ87914692,
                filmQ633836,
                filmQ62513,
                filmQ1360124,
                filmQ7620423,
                filmQ65055359,
                filmQ111622379,
                filmQ56276944,
                filmQ18713337,
                filmQ15401854,
                filmQ472034,
                filmQ90545563,
                filmQ18290865,
                filmQ108442799,
                filmQ67022467,
                filmQ116870208,
                filmQ1432953,
                filmQ11942384,
                filmQ377274,
                filmQ48807252,
                filmQ107428689,
                filmQ3050323,
                filmQ105067221,
                filmQ3742608,
                filmQ61731409,
                filmQ3399752,
                filmQ180244,
                filmQ88012667,
                filmQ102039464,
                filmQ3382170,
                filmQ2904867,
                filmQ89281065,
                filmQ7091877,
                filmQ106103421,
                filmQ31749504,
                filmQ114662969,
                filmQ4993093,
                filmQ1322361,
                filmQ401539,
                filmQ61726953,
                filmQ3794489,
                filmQ107174589,
                filmQ80177730,
                filmQ46078971,
                filmQ976119,
                filmQ18334119,
                filmQ2632905,
                filmQ28750102,
                filmQ1571941,
                filmQ18693351,
                filmQ2895605,
                filmQ95627061,
                filmQ13406787,
                filmQ20155790,
                filmQ1409130,
                filmQ7148826,
                filmQ27832313,
                filmQ2053630,
                filmQ104180428,
                filmQ10428399,
                filmQ3576737,
                filmQ200607,
                filmQ659442,
                filmQ107647646,
                filmQ111667677,
                filmQ117378,
                filmQ66442210,
                filmQ49102385,
                filmQ1467757,
                filmQ1256208,
                filmQ73481992,
                filmQ127542,
                filmQ3549138,
                filmQ111668041,
                filmQ110892074,
                filmQ104898284,
                filmQ6461048,
                filmQ3212094,
                filmQ1284439,
                filmQ1784355,
                filmQ17415616,
                filmQ17018223,
                filmQ98652006,
                filmQ10535496,
                filmQ322206,
                filmQ87977631,
                filmQ80678019,
                filmQ670309,
                filmQ10672407,
                filmQ6321287,
                filmQ115739625,
                filmQ12006352,
                filmQ7771540,
                filmQ21646496,
                filmQ114728589,
                filmQ795680,
                filmQ23931098,
                filmQ19384587,
                filmQ100490548,
                filmQ18647013,
                filmQ5826813,
                filmQ2298877,
                filmQ3479117,
                filmQ2346134,
                filmQ94968121,
                filmQ481606,
                filmQ5675778,
                filmQ221887,
                filmQ107133629,
                filmQ3212176,
                filmQ3202989,
                filmQ12058242,
                filmQ11876205,
                filmQ15696724,
                filmQ3223189,
                filmQ111970534,
                filmQ3455471,
                filmQ19816400,
                filmQ10526581,
                filmQ5968422,
                filmQ4752697,
                filmQ82936372,
                filmQ1758592,
                filmQ18713321,
                filmQ18450499,
                filmQ87263554,
                filmQ18674926,
                filmQ220741,
                filmQ18202649,
                filmQ59721,
                filmQ100535001,
                filmQ3281101,
                filmQ115284841,
                filmQ19819323,
                filmQ707220,
                filmQ15847583,
                filmQ5573686,
                filmQ87921252,
                filmQ464032,
                filmQ4233797,
                filmQ4902928,
                filmQ60581101,
                filmQ94636850,
                filmQ6122924,
                filmQ2841294,
                filmQ1216353,
                filmQ5450095,
                filmQ94996524,
                filmQ7776218,
                filmQ16029070,
                filmQ6172472,
                filmQ14955332,
                filmQ86996395,
                filmQ64666990,
                filmQ2518061,
                filmQ28750149,
                filmQ5901176,
                filmQ60173789,
                filmQ58424028,
                filmQ2746391,
                filmQ27996422,
                filmQ16643070,
                filmQ117787446,
                filmQ43231040,
                filmQ88172500,
                filmQ323275,
                filmQ21877685,
                filmQ2986152,
                filmQ7651880,
                filmQ16670248,
                filmQ95483925,
                filmQ3849768,
                filmQ6321278,
                filmQ478780,
                filmQ2983218,
                filmQ3024177,
                filmQ87917568,
                filmQ65126245,
                filmQ4317084,
                filmQ108885070,
                filmQ152181,
                filmQ593573,
                filmQ97620735,
                filmQ104177168,
                filmQ3311787,
                filmQ759439,
                filmQ572772,
                filmQ10709396,
                filmQ1170481,
                filmQ3000734,
                filmQ2579095,
                filmQ100323695,
                filmQ18333956,
                filmQ82847,
                filmQ28493932);
    }
}
