package com.salvador.graduationitsucreateqrs.helpers.utility;

import com.salvador.graduationitsucreateqrs.helpers.models.Alumno;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class StringHelper
{


    public static  String getCarrara(String val)
    {
        String carr = "";
        switch(val)
        {
            case "1":
                carr = "Ing. en Sistemas";
                break;
            case "3":
                carr = "Ing. en Industrial";
                break;
            case "4":
                carr = "Ing. en Alimentarias";
                break;
            case "5":
                carr = "Ing. en Electrónica";
                break;
            case "6":
                carr = "Ing. en Mecatrónica";
                break;
            case "7":
                carr = "Ing. en Administración";
                break;
            case "8":
                carr = "Ing. Mecánica";
                break;
            case "9":
                carr = "Ing. en Sistemas Mixta";
                break;
            case "10":
                carr = "Ing.en Administración Mixta";
                break;
            case "11":
                carr = "Civil";
                break;
        }
        return carr;
    }

    public static String obtenerFecha() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        return formattedDate;
    }

    public ArrayList<Alumno> getData()
    {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        //alumnos.add(new Alumno ("15040622","10","CENDEJAS MARTINEZ CLAUDIA","P"));
        alumnos.add(new Alumno ("15040084","ISC005","ALCAZAR JURADO JONATHAN ZACEK","1","B","zacekalcazar@gmail.com"));
        alumnos.add(new Alumno ("15040088","ISC006","CIPRES MEDINA EDGAR ULISES","1","B","ulilsescipresm@gmail.com"));
        alumnos.add(new Alumno ("15040053","ISC001","GARCIA ARREGUIN ROLANDO","1","A","Rolaxgar97@hotmail.com"));
        alumnos.add(new Alumno ("15040060","ISC002","LEON MUJICA CARLOS ALFREDO","1","A","calm.970604@gmail.com"));
        alumnos.add(new Alumno ("15040064","ISC003","MARTINEZ CRISTAL JOSE DAVID","1","A","david_mtz001@hotmail.com"));
        alumnos.add(new Alumno ("15040105","ISC007","MORA NUÑEZ SAMIR","1","B","burburrito@gmail.com"));
        alumnos.add(new Alumno ("15040065","ISC004","MEDIANO TINOCO RAUL","1","A","make-yousmile44@hotmail.com"));
        alumnos.add(new Alumno ("15040108","ISC008","OROZCO EQUIHUA ALEJANDRO ISRAEL","1","B","orozcoequihuaalejandro@gmail.com"));
        alumnos.add(new Alumno ("15040112","ISC009","PATLAN CARRERA MORELIA LYANNETH","1","B","more_lia96@hotmail.com"));
        alumnos.add(new Alumno ("15040122","ISC010","VILLA RODRIGUEZ ABIGAIL","1","B","abivilla12345@gmail.com"));
        alumnos.add(new Alumno ("15040115","ISC011","ROMERO ZEPEDA AMAURY VALENTIN","1","B","amaury_valentin@hotmail.com"));
        alumnos.add(new Alumno ("15040123","ISC012","VILLANUEVA ESTRADA ARLETH","1","B","avillanuevaestrada@gmail.com"));
        alumnos.add(new Alumno ("15040124","ISC013","ZALAPA MEDINA EDUARDO","1","B","eduardozalapamusic@live.com"));
        alumnos.add(new Alumno ("15040125","ISC014","ZAMBRANO RODRIGUEZ CARLOS","1","B","Carlos-campeon1964@hotmail.com"));
        alumnos.add(new Alumno ("15040130","II001","BARAJAS CARO JULIO CESAR","3","A","Barajascaro.97@hotmail.com"));
        alumnos.add(new Alumno ("15040131","II002","BEDOLLA HERRERA ALICIA GUADALUPE","3","A","bedollaherreraa@gmail.com"));
        alumnos.add(new Alumno ("15040135","II003","CARRANZA CORZA JULIO DAVID","3","A","jdcc1213@gmail.com "));
        alumnos.add(new Alumno ("15040140","II004","CASTILLO ZAMUDIO OMAR JALIL","3","A","omarzamudio6@gmail.com"));
        alumnos.add(new Alumno ("15040141","II005","DUARTE BUCIO LUIS ANTONIO","3","A","luis_duarte10@hotmail.es "));
        alumnos.add(new Alumno ("15040187","II006","ESTRADA ROSAS GABRIELA","3","A","gabriela.estrada.rosas@hotmail.com"));
        alumnos.add(new Alumno ("15040146","II007","GARCIA ROSAS EDGAR ENRIQUE","3","A","garciarosasedgarenrique@gmail.com"));
        alumnos.add(new Alumno ("15040193","II008","HERNANDEZ CHAVEZ ARIADNA MICHAEL","3","A","arihch.1230@gmail.com"));
        alumnos.add(new Alumno ("15040156","II009","MENDOZA SANCHEZ MARCO ANTONIO","3","A","marcoms_97@outlook.com"));
        alumnos.add(new Alumno ("15040161","II010","PEREZ CALDERON MARIA MONSERRAT","3","A","m.pcalderon.monse@gmail.com"));
        alumnos.add(new Alumno ("15040540","II011","SILVA FLORES LUIS GILBERTO","3","A","luis_gil1@outlook.com"));
        alumnos.add(new Alumno ("14040514","II012","VILLEGAS RAMIREZ LUIS GERARDO","3","A","LEO_LG1647@HOTMAIL.COM"));
        alumnos.add(new Alumno ("15040174","II013","AGUILAR ZUÑIGA MARIA GUADALUPE","3","B","zupeaguilarz@gmail.com"));
        alumnos.add(new Alumno ("15040176","II014","ANGEL GUERRERO JOSE ARMANDO","3","B","jose_13_armando@hotmail.com"));
        alumnos.add(new Alumno ("14040052","II015","BAEZ AGUADO PEDRO DE JESUS ","3","B","baezaguadopedro@gmail.com"));
        alumnos.add(new Alumno ("15040177","II016","BENITEZ FLORES EDUARDO","3","B","morfeo2091@gmail.com "));
        alumnos.add(new Alumno ("15040133","II017","BUCIO CHAVEZ JOSE ENRIQUE","3","B","enrique.bucioch@outlook.com"));
        alumnos.add(new Alumno ("15040186","II018","ELIAS CASTAÑEDA CARLOS ALBERTO","3","B","eliascarlos025@gmail.com"));
        alumnos.add(new Alumno ("15040188","II019","ESTRELLA GARIBAY LUIS FERNANDO","3","B","estrellagary1996@gmail.com"));
        alumnos.add(new Alumno ("15040189","II020","GALVAN CHAVEZ ALEJANDRA","3","B","alegch23@gmail.com"));
        alumnos.add(new Alumno ("15040194","II021","HUERTA MENDOZA MERCEDES GUADALUPE","3","B","julioyrafa28@gmail.com"));
        alumnos.add(new Alumno ("15040197","II022","MARTINEZ ALONSO JOSE FERNANDO","3","B","fernandoisaac687@gmail.com "));
        alumnos.add(new Alumno ("15040154","II023","MEDINA SANCHEZ LUIS FERNANDO","3","B","fernando_medina_19@hotmail.com"));
        alumnos.add(new Alumno ("15040159","II024","NAVA SANCHEZ MARCO ADALID","3","B","marcoadalid.ns@gmail.com"));
        alumnos.add(new Alumno ("15040209","II025","RIVERA CERVANTES FELIPE","3","B","Feliperc2700@gmail.com"));
        alumnos.add(new Alumno ("15040212","II026","SANCHEZ PATLAN AMELIA ALEJANDRA","3","B","alejandra_aasp@hotmail.com"));
        alumnos.add(new Alumno ("15040224","IIA001","BACA QUINTERO VIVIANA BERENICE","4","A","vivianabaca300@gmail.com"));
        alumnos.add(new Alumno ("15040262","IIA002","SANDOVAL RAMIREZ JOSE JESUS","4","A","josesandovalra@gnail.com"));
        alumnos.add(new Alumno ("15040254","IIA003","PIÑON RIOS MARIA FERNANDA","4","A","fer_pinon_rios@hotmail.com"));
        alumnos.add(new Alumno ("15040230","IIA004","CHAVEZ ZARAGOZA KAREN","4","A","czkaren@hotmail.es"));
        alumnos.add(new Alumno ("15040234","IIA005","FARFAN BECERRA ANDREA MICHELLE","4","A","Mianfaba@gmail.com "));
        alumnos.add(new Alumno ("15040239","IIA006","GODOY CORONA ALONDRA VALERIA","4","A","valeriagodoycorona@outlook.com "));
        alumnos.add(new Alumno ("15040248","IIA007","MOLINA VIDALES JOSE MARTIN","4","A","martinmolinatec@gmail.com"));
        alumnos.add(new Alumno ("15040257","IIA008","REYES GARCIA ARCELIA FERNANDA","4","A","chelyfer1996@gmail.com"));
        alumnos.add(new Alumno ("15040258","IIA009","ROBLES PEREZ VALENTINA","4","A","varope4718a@gmail.com"));
        alumnos.add(new Alumno ("15040259","IIA010","ROCHA DURAN MARIANA","4","A","mariana.rochd@gmail.com"));
        alumnos.add(new Alumno ("15040260","IIA011","SALINAS PEDRAZA VERONICA","4","A","vero_salinas08@hotmail.com"));
        alumnos.add(new Alumno ("15040264","IIA012","SOLORIO MENDOZA ARELI","4","A","arelisolorio_97@hotmail.com"));
        alumnos.add(new Alumno ("15040243","IIA013","HINOJOSA CHAVEZ JORGE ALEJANDRO","4","A","Alex.chavez.yo@gmail.com"));
        alumnos.add(new Alumno ("15040265","IIA014","VILLEGAS MARTINEZ DANIELA","4","A","Danielaamartinez4297@icloud.com"));
        alumnos.add(new Alumno ("14040033","IE001","ALVAREZ CAMPOS LUIS RODRIGO","5","A","lr.alvarez@mich.conalep.edu.mx"));
        alumnos.add(new Alumno ("15040269","IE002","ALVAREZ SILVA JESUS FERNANDO","5","A","Jalvarezs-2@hotmail.com"));
        alumnos.add(new Alumno ("15040271","IE003","AMBRIZ GUILLEN JESUS BULMARO","5","A","jesus_kiriku@yahoo.com"));
        alumnos.add(new Alumno ("14040111","IE004","CERVANTES MARTINEZ YESSICA","5","A","ye_sicervantes@live.com "));
        alumnos.add(new Alumno ("15040275","IE005","CHAVEZ BRAVO RUBEN","5","A","ruben_chavez_126@hotmail.com"));
        alumnos.add(new Alumno ("15040284","IE006","HERRERA GARCIA ROBERTO DARIO","5","A","15040284.itsu@gmail.com"));
        alumnos.add(new Alumno ("15040617","IE007","JASSO VELEZ ELIAS","5","A","elias_jasso.v@hotmail.com"));
        alumnos.add(new Alumno ("14040271","IE008","MARTINEZ BRAVO RAUL","5","A","rulomtz1995@gmail.com"));
        alumnos.add(new Alumno ("14040298","IE009","Mendoza Rea Juan Sebastian","5","A","sebastianmr32@gmail.com"));
        alumnos.add(new Alumno ("14040314","IE010","MORA AVILA IVAN","5","A","ima_leopard96@outlook.com "));
        alumnos.add(new Alumno ("14040353","IE011","PAREDES MARTINEZ IGNACIO","5","A","ignacioparedes425@gmail.com"));
        alumnos.add(new Alumno ("14040355","IE012","PAREDES NARANJO DANIEL","5","A","danielparedes245@gmail.com "));
        alumnos.add(new Alumno ("15040294","IE013","PEREZ ROJAS CESAR EDUARDO","5","A","cesar_epr@outlook.com"));
        alumnos.add(new Alumno ("15040299","IE014","RODRIGUEZ PEREZ LUIS ANGEL","5","A","luis101846@gmail.com"));
        alumnos.add(new Alumno ("14040021","IM001","ALCOCER CEDEÑO IVAN","6","A","cloudywolfkh@gmail.com"));
        alumnos.add(new Alumno ("15040316","IM002","AVILA AMBRIZ CARLOS EDUARDO","6","A","carlosavilaambriz@hotmail.com"));
        alumnos.add(new Alumno ("14040088","IM003","CAMPOS FERREIRA ROBERTO","6","A","robertf949@gmail.com"));
        alumnos.add(new Alumno ("14040173","IM004","GARCIA MENDOZA EDGAR OMAR","6","A","omeroho@gmail.com"));
        alumnos.add(new Alumno ("14040174","IM005","GARCIA MORALES ALEJANDRO ","6","A","alex-jano@live.com.mx"));
        alumnos.add(new Alumno ("15040330","IM006","HERNANDEZ ALVAREZ JOSE MIGUEL","6","A","miguelito.1996.mt@gmail.com"));
        alumnos.add(new Alumno ("14040286","IM007","MEDINA VAZQUEZ ANDREA ESTEFANIA","6","A","estefaniamedina744@gmail.com"));
        alumnos.add(new Alumno ("15040339","IM008","MENDOZA VALENCIA ALEJANDRO","6","A","alexmendozavalencia@hotmail.com"));
        alumnos.add(new Alumno ("15040341","IM009","MONTAÑEZ CURIEL MARIO ADRIAN","6","A","mariio97@hotmail.com"));
        alumnos.add(new Alumno ("15040348","IM010","RODRIGUEZ MARTINEZ JEZEL","6","A","jezelrodriguez4@outlook.es"));
        alumnos.add(new Alumno ("14040447","IM011","SOLIS SAUCEDO LUIS SEBASTIAN","6","A","sebastiansolis2738@gmail.com"));
        alumnos.add(new Alumno ("15040314","IM012","ALEJO RAMOS JOSE ANTONIO","6","B","tono2014q@gmail.com"));
        alumnos.add(new Alumno ("15040360","IM013","ALFARO RAMIREZ ERNESTO ALEJANDRO","6","B","alrjandro110421@gmail.com"));
        alumnos.add(new Alumno ("15040365","IM014","CARDENAS CABALLERO CESAR JAFET","6","B","cesarcardcab@hotmail.com "));
        alumnos.add(new Alumno ("15040366","IM015","CARDOSO DE LA FUENTE ERIK ALEXIS","6","B","e.cardoso.fuente.66@gmail.com"));
        alumnos.add(new Alumno ("15040372","IM016","GONZALEZ CASTAÑEDA JESUS DAVID","6","B","d_a_v_i_d1000@live.com"));
        alumnos.add(new Alumno ("15040374","IM017","HERNANDEZ BARRIGA JAIME RODOLFO","6","B","jimy_127@hotmail.com"));
        alumnos.add(new Alumno ("14040220","IM018","HERNANDEZ MARTINEZ JESUS","6","B","jehema.95@gmail.com"));
        alumnos.add(new Alumno ("15040381","IM019","MARES LOPEZ VICTOR FERNANDO","6","B","victor.mares1097@gmail.com"));
        alumnos.add(new Alumno ("15040388","IM020","MURILLO BAÑALES JESUS","6","B","jesusazul8_@hotmail.com"));
        alumnos.add(new Alumno ("15040391","IM021","PONCE ACOSTA DANTE HERIBERTO","6","B","ponceacosta20@gmail.com"));
        alumnos.add(new Alumno ("15040392","IM022","RAMIREZ DIAZ CARLOS ANDRES","6","B","karlozzandrezzdiazz@hotmail.com"));
        alumnos.add(new Alumno ("15040075","IM023","RAMIREZ GARCIA JORGE ARTURO","6","B","arturo_1996@live.com.mx "));
        alumnos.add(new Alumno ("15040394","IM024","RODRIGUEZ MARTINEZ JAIRO","6","B","jairo23meca@outlook.com"));
        alumnos.add(new Alumno ("15040397","IM025","SALOME MURILLO ESTEBAN","6","B","Salomeeste@gmail.com"));
        alumnos.add(new Alumno ("15040404","IM026","VAZQUEZ CERVANTES JONATHAN ALFREDO","6","B","Jonathan_vz_97@hotmail.com"));
        alumnos.add(new Alumno ("15040455","IA021","AGUILAR REYES LAURA ISELA","7","B","alauraise@gmail.com "));
        alumnos.add(new Alumno ("15040456","IA022","ALVAREZ VAZQUEZ PAOLA ARELY","7","B","alvapao811@gmail.com"));
        alumnos.add(new Alumno ("15040406","IA001","ALONSO GUERRERO ANDREA JESUS","7","A","andrea.alonso792@gmail.com"));
        alumnos.add(new Alumno ("15040407","IA002","ARELLANO GONZALEZ CINDY RUBI","7","A","cindyrag4639@gmail.com"));
        alumnos.add(new Alumno ("15040457","IA023","CABRERA REYES HECTOR","7","B","Cabrerah704@gmail.com "));
        alumnos.add(new Alumno ("15040458","IA024","CALDERON MACIEL MARIA GUADALUPE","7","B","mguadalupe_cm@hotmail.com"));
        alumnos.add(new Alumno ("15040412","IA003","CARRANZA BRAVO JOSE ADOLFO","7","A","carranza.adolfo.m1@gmail.com"));
        alumnos.add(new Alumno ("15040413","IA004","CHAPA GARCIA ULISES","7","A","ulises.chapa07@gmail.com "));
        alumnos.add(new Alumno ("15040459","IA025","CALDERON MACIEL VICTORIA","7","B","victoriacalderon590@gmail.com"));
        alumnos.add(new Alumno ("15040414","IA005","CRUZ VALENCIA LAURA","7","A","lauritha996@gmail.com "));
        alumnos.add(new Alumno ("15040415","IA006","DE LA LUZ LOPEZ ESTEBAN RODOLFO","7","A","estebandelaluzlopez@gmail.com"));
        alumnos.add(new Alumno ("15040419","IA007","GALVAN AGUILAR MARITZA JUDIT","7","A","galvanmaritza97@gmail.com "));
        alumnos.add(new Alumno ("15040423","IA008","GARIBAY ESTRADA YAHAIRA ESTEFANIA","7","A","yahisgaribay@gmail.com"));
        alumnos.add(new Alumno ("15040424","IA009","GOMEZ GUTIERREZ ALEJANDRO","7","A","Alejandrogom1g@gmail.com"));
        alumnos.add(new Alumno ("15040464","IA026","DE LA CRUZ AVELLANEDA CITLALLI","7","B","citlalli.dlca@gmail.com"));
        alumnos.add(new Alumno ("15040466","IA027","ESQUIVEL PURECO JOSE ALFREDO","7","B","alfredo_pureco97@hotmail.com "));
        alumnos.add(new Alumno ("15040468","IA028","ESTRELLA NAVA NAYELI ALEJANDRA","7","B","nayeliestrella97@gmail.com"));
        alumnos.add(new Alumno ("15040469","IA029","FLORES HERNANDEZ DAYSI EDITH","7","B","edith18florez@gmail.com"));
        alumnos.add(new Alumno ("15040425","IA010","GONZALEZ CORTES PATSY MARNELLY","7","A","pmar.gc26@gmail.con"));
        alumnos.add(new Alumno ("15040428","IA011","GUIZAR MARTINEZ FELIPE SAUL","7","A","felipe.martinez04.sg@gmail.com "));
        alumnos.add(new Alumno ("15040430","IA012","HERNANDEZ GARCIA JESSICA ROCIO","7","A","jessy199618@gmail.com"));
        alumnos.add(new Alumno ("15040471","IA030","GONZALEZ CASILLAS WRIEL","7","B","wrielglezcasillas@gmail.com"));
        alumnos.add(new Alumno ("15040462","IA031","CHAVEZ MARTINEZ PAULINA GUADALUPE","7","B","linavezmart@gmail.com"));
        alumnos.add(new Alumno ("15040431","IA013","HUITZACUA GARCÍA ALICE MABEL ","7","A","mabelhuitzacua@gmail.com"));
        alumnos.add(new Alumno ("15040472","IA032","HERNANDEZ BARBA LARISSA DAYLE","7","B","larissahernandez101@gmail.com"));
        alumnos.add(new Alumno ("15040432","IA014","JIMENEZ RODRIGUEZ MARIA GUADALUPE","7","A","lupita_jr@hotmail.com"));
        alumnos.add(new Alumno ("14040243","IA015","JUAREZ GONZALEZ TUTANKAMEN ROGELIO","7","A","tutan1496@gmail.com"));
        alumnos.add(new Alumno ("15040433","IA016","JUAREZ GUTIERREZ CARMEN SUHAIL","7","A","gtz.suhail@gmail.com "));
        alumnos.add(new Alumno ("15040473","IA033","MAGAÑA JUAREZ LILIANA GUADALUPE","7","B","lilianamagana0197@gmail.com"));
        alumnos.add(new Alumno ("15040474","IA034","MAGAÑA VIDALES KARINA","7","B","Kamavi97@gmail.com"));
        alumnos.add(new Alumno ("15040437","IA017","MELGOZA GUILLEN DIEGO ERICK","7","A","Curlyguillen@gmail.con "));
        alumnos.add(new Alumno ("15040481","IA035","QUEZADA HERNANDEZ JUANA DE JESUS","7","B","juanaquezada88@gmail.com"));
        alumnos.add(new Alumno ("15040482","IA036","RAMIREZ RODRIGUEZ ANAYELI","7","B","anayeli197@hotmail.com "));
        alumnos.add(new Alumno ("15040483","IA037","RAMIREZ SUAREZ TERESA ITZEL","7","B","Teresaitzelr@gmail.com"));
        alumnos.add(new Alumno ("15040484","IA038","RAYA ARELLANO BRIAN GABRIEL","7","B","bricarnack@gmail.com"));
        alumnos.add(new Alumno ("15040480","IA039","MORALES GONZALEZ CLAUDIA","7","B","claudiamorales7390gmail.com "));
        alumnos.add(new Alumno ("15040454","IA040","AGUILAR RAMIREZ VICTOR JAVIER","7","B","victor.ja1996@gmail.com"));
        alumnos.add(new Alumno ("15040485","IA041","RODRIGUEZ CRUZ ALONDRA","7","B","r.andylove@hotmail.com"));
        alumnos.add(new Alumno ("15040439","IA018","MURGUIA VILLAFAN DANIELA GUADALUPE","7","A","dany_murgui12@hotmail.com"));
        alumnos.add(new Alumno ("15040487","IA042","SALINAS SANTIAGO LILIANA YAQUELIN","7","B","lilianayaquelinsalinas123@gmail.com "));
        alumnos.add(new Alumno ("15040600","IA043","SANCHEZ AYALA DAVID","7","B","admon.davidayala@gmail.com"));
        alumnos.add(new Alumno ("15040488","IA044","SANCHEZ CALDERON CINTHIA ESTEFANIA","7","B","sanchezcalderoncinthiaestefani@gmail.com "));
        alumnos.add(new Alumno ("15040489","IA045","SANCHEZ RAUDA YUNUEN GUADALUPE","7","B","yunuenrauda@gmail.com"));
        alumnos.add(new Alumno ("15040443","IA019","RODRIGUEZ RUIZ VERONICA IVETTE","7","A","veronicaivetter@gmail.com"));
        alumnos.add(new Alumno ("15040490","IA046","SARABIA BARAJAS ALAN SINUE","7","B","sarabiabarajas@hotmail.com"));
        alumnos.add(new Alumno ("15040494","IA047","TALAVERA CASTILLO JESSICA PAULINA","7","B","jessitalavera2018@gmail.com"));
        alumnos.add(new Alumno ("14040468","IA048","TORAN MURILLO JHONATAN ALEJANDRO","7","B","jhonnytoran13@gmail.com"));
        alumnos.add(new Alumno ("15040496","IA049","TORRES TORRES AMERICA DANIELA","7","B","americatorres206@gmail.com"));
        alumnos.add(new Alumno ("15040503","IMEC001","BAÑUELOS MONDRAGON GABRIEL ALEJANDRO","8","A","gabrielbu67@gmail.com"));
        alumnos.add(new Alumno ("13040086","IMEC002","BRAVO CARO LUIS ALBERTO","8","A","albertob.caro95@gmail.com"));
        alumnos.add(new Alumno ("13040131","IMEC003","CRUZ HERREJON OMAR ALEJANDRO","8","A","alextorgan@hotmail.com"));
        alumnos.add(new Alumno ("15040514","IMEC004","HERNANDEZ VILLAGOMEZ JOSE SAUL","8","A","saul_13.3500@hotmal.com"));
        alumnos.add(new Alumno ("15040515","IMEC005","HUERTA GARCIA JUAN JOSE","8","A","juan_sons@hotmail.com"));
        alumnos.add(new Alumno ("15040518","IMEC006","LOPEZ AGUILAR ULISES SALVADOR","8","A","Uliseslopez234@gmail.com"));
        alumnos.add(new Alumno ("15040520","IMEC007","MARTINEZ CORDOBA ANGEL ISAI","8","A","15040520@itsuruapan.edu.mx"));
        alumnos.add(new Alumno ("15040527","IMEC008","ORTIZ LEON MANUEL ABRAHAM","8","A","purobsmi23@gmail.com"));
        alumnos.add(new Alumno ("15040531","IMEC009","RAMA SANDOVAL CAYETANO","8","A","Ramasandovall@hotmail.com"));
        alumnos.add(new Alumno ("15040534","IMEC010","ROMAN SOLORZANO JAVIER","8","A","javier_roman25@hotmail.com"));
        alumnos.add(new Alumno ("15040535","IMEC011","ROMAN SOLORZANO JESUS","8","A","jesus_roman7@outlook.com"));
        alumnos.add(new Alumno ("15040537","IMEC012","RUIZ GONZALEZ OMAR ALEJANDRO","8","A","omarruizgonzalez9@gmail.com "));
        alumnos.add(new Alumno ("15040642","ISCM003","CEJA MELGOZA RODRIGO","9","P","rodceja.rc@gmail.com"));
        alumnos.add(new Alumno ("15040643","ISCM004","CERDA MARTINEZ JOEL","9","P","jcerdamar.25@gmail.com"));
        alumnos.add(new Alumno ("15040649","ISCM005","MORENO CUEVAS EDUARDO","9","P","eduardo14nov@hotmail.com"));
        alumnos.add(new Alumno ("15040650","ISCM006","NAREZ PAROCUA ROSELIA","9","P","rosie.narez313@gmail.com "));
        alumnos.add(new Alumno ("15040652","ISCM007","OCHOA CERDA MARTHA ALICIA","9","P","aliciaochoa010975@gmail.com"));
        alumnos.add(new Alumno ("15040656","ISCM008","RAMIREZ ADAME LUIS","9","P","lrmirez22@gmail.com"));
        alumnos.add(new Alumno ("15040658","ISCM009","REYES ESQUIVEL RAFAEL","9","P","raffa_1412@hotmail.com"));
        alumnos.add(new Alumno ("15040662","ISCM010","RUIZ REYES EDITH","9","P","e-0223@hotmail.com"));
        alumnos.add(new Alumno ("13040326","ISCM001","OCHOA BARRETO JOSE URIEL","9","U","uochoab@gmail.com"));
        alumnos.add(new Alumno ("14040357","ISCM002","PATLAN CARRERA MARIO ALBERTO","9","U","gerenteoperativocaes@gmail.com"));
        alumnos.add(new Alumno ("15040619","IAM013","AGUILERA RAMIREZ ROSARIO","10","P","raguilerar12@gmail.com"));
        alumnos.add(new Alumno ("15040622","IAM014","CENDEJAS MARTINEZ CLAUDIA","10","P","claudia_cmtz0105@hotmail.com"));
        alumnos.add(new Alumno ("15040623","IAM015","CHAVEZ CASTRO GUADALUPE","10","P","lupitha_chc080597@hotmail.com"));
        alumnos.add(new Alumno ("15040624","IAM016","CHAVEZ MARTINEZ MA EUGENIA","10","P","marigeni2000@gmail.com"));
        alumnos.add(new Alumno ("15040626","IAM017","GARCIA DUARTE MARTHA ALICIA","10","P","martha.gd75@gmail.com"));
        alumnos.add(new Alumno ("15040627","IAM018","GARCIA GARCIA ALONDRA ITZEL","10","P","Alondrita_14_@hotmail.com"));
        alumnos.add(new Alumno ("15040665","IAM019","GARCIA OROZCO MAYRA ALEJANDRA","10","P","ma.alexandra.garcia@gmail.com"));
        alumnos.add(new Alumno ("15040628","IAM020","GUILLEN ALVARADO TERESA DE JESUS","10","P","teteguillen18@gmail.com"));
        alumnos.add(new Alumno ("15040631","IAM021","LOPEZ DUARTE LAURA GUADALUPE","10","P","lopezlauduarte@gmail.com"));
        alumnos.add(new Alumno ("15040636","IAM022","NUÑEZ ZAVALA ALEJANDRA","10","P","ale81063@gmail.com"));
        alumnos.add(new Alumno ("15040637","IAM023","OCHOA CERDA ANA JULIA","10","P","anaju8acerda@hotmail.com"));
        alumnos.add(new Alumno ("15040638","IAM024","RIVERA VEGA LUZ HERMINIA","10","P","zul26_@hotmail.com"));
        alumnos.add(new Alumno ("15040639","IAM025","SANCHEZ MELGOZA MAYRA ALEJANDRA","10","P","maje2630@hotmail.com"));
        alumnos.add(new Alumno ("15040561","IAM001","ABARCA JUAREZ VERONICA TANAIRI","10","U","vero.ramez@hotmail.com"));
        alumnos.add(new Alumno ("16040568","IAM002","CERANO BRIBIESCA HAYDEE GABRIELA","10","U","haygab@gmail.com"));
        alumnos.add(new Alumno ("15040567","IAM003","CORTEZ RODRIGUEZ DANIELA","10","U","danny_cortez77@hotmail.com"));
        alumnos.add(new Alumno ("15040574","IAM004","GONZALEZ ARRIOLA SELENE","10","U","selene_gonzalez_arriola_97@hotmail.com "));
        alumnos.add(new Alumno ("15040618","IAM005","LOPEZ CONTRERAS JULIA ANDREA","10","U","julia_andrea08@hotmail.com"));
        alumnos.add(new Alumno ("16040586","IAM006","MARTINEZ VIVEROS ANA ISABEL","10","U","viverosanais87@gmail.com "));
        alumnos.add(new Alumno ("13040298","IAM007","MENDEZ MINCHACA APOLINAR JUAN ABRAHAM","10","U","ajamm.admon@gmail.com"));
        alumnos.add(new Alumno ("15040585","IAM008","MUÑOZ GALVAN JOSE ANGEL","10","U","jose_munoz_63@hotmail.com"));
        alumnos.add(new Alumno ("15040587","IAM009","PEREZ GILES NAYELY","10","U","naye_9383@live.com.mx"));
        alumnos.add(new Alumno ("15040592","IAM010","REYES LOPEZ MARIA ELENA","10","U","Elena29.ramez@gmail.com"));
        alumnos.add(new Alumno ("15040595","IAM011","RODRIGUEZ MARTINEZ ROSA ELIA","10","U","rosa.rodriguez1608@hotmail.com"));
        alumnos.add(new Alumno ("15040452","IAM012","VELAZQUEZ GUILLEN JENNIFER JACQUELINE","10","U","jenniferjvlz@hotmail.com"));
        alumnos.add(new Alumno ("15040093","ISC015","GOMEZ AMBRIZ EMANNUEL ANTONIO","1","B","emmanuelgmz77@hotmail.com"));
        alumnos.add(new Alumno ("14040515","ISC016","VILLEGAS RODRIGUEZ SARAY BETSABE ","1","B","laflaqui_09@hotmail.com"));
        alumnos.add(new Alumno ("15040446","IA020","SANDOVAL DURAN ALEXA IVONNE","7","A","alexasanduran@gmail.com"));
        alumnos.add(new Alumno ("17040730","IE015","SOLIS MORALES SERGIO DAVID","5","A","sdsm1536@gmail.com"));



        return alumnos;
    }
}
