package chainOfResponsibility.ejercicio.ordenamientoPersonas;

import java.util.Arrays;

public class Client {
    public static void main(String[]args){
        Ordenador ordenador= new Ordenador();
        Persona[] lista3=new Persona[70];


        lista3[0]=new Persona("11113140","Aguilda Belorado Cea",39);
        lista3[1]=new Persona("11119251","Marshal Rioja Fresnos",65);
        lista3[2]=new Persona("11118810","Paola Aguinaco Peñin",20);
        lista3[3]=new Persona("11114458","Senén Cotilla Cartagena",84);
        lista3[4]=new Persona("11116293","Yosniel Abaunza Dorol",95);
        lista3[5]=new Persona("11111068","Nahum Pablo Mioño",39);
        lista3[6]=new Persona("11115729","Astrid Zurbano Arcaya",96);
        lista3[7]=new Persona("11113784","Rubén Maldonado Moracia",80);
        lista3[8]=new Persona("11117413","Aribellys Garrido Deco",51);
        lista3[9]=new Persona("11117887","Floresmila Riesgo Marin",50);
        lista3[10]=new Persona("11116686","Yanira Nuño Ortuño",29);
        lista3[11]=new Persona("11113742","Vania Taviel Badillo",80);
        lista3[12]=new Persona("11119784","Dorotea Yecora Alberdi",37);
        lista3[13]=new Persona("11115823","Vania Bargas Peso",86);
        lista3[14]=new Persona("11119583","Jetzabel Roda Losua",21);
        lista3[15]=new Persona("11112215","Valerie Caunedo Vilar",31);
        lista3[16]=new Persona("11115954","Romyna Coleira Gonta",99);
        lista3[17]=new Persona("11119169","Joel Urruchi Pavieta",16);
        lista3[18]=new Persona("11110148","Alain Pontones Herrea",85);
        lista3[19]=new Persona("11117491","Anneris Nestares Prado",87);
        lista3[20]=new Persona("11118182","Yamileth Villaba Mezcano",26);
        lista3[21]=new Persona("11119349","Sabel Aller Rosales",38);
        lista3[22]=new Persona("11111420","Quetzalcoatl Fortes Falla",91);
        lista3[23]=new Persona("11119969","Domnina Tornamira Vallines",25);
        lista3[24]=new Persona("11112268","Fiorela Aguirrebeña Irazu",76);
        lista3[25]=new Persona("11114875","Genoveva Garmendia Briceño",14);
        lista3[26]=new Persona("11117146","Amanda Zamora Colunga",11);
        lista3[27]=new Persona("11118160","Yadilis Taracena Achutegui",61);
        lista3[28]=new Persona("11113467","Zylo Londoño Bustillo",11);
        lista3[29]=new Persona("11111577","Alba Forcelledo Gochicoa",85);
        lista3[30]=new Persona("11119791","Samuel Buzon Cascales",54);
        lista3[31]=new Persona("11116012","Emmanuel Sereno Cifuentes",14);
        lista3[32]=new Persona("11111720","Lesly Calderon Laores",60);
        lista3[33]=new Persona("11113356","Griselda Cortes Villaraud",9);
        lista3[34]=new Persona("11119831","Giorgio Amaya Iban",62);
        lista3[35]=new Persona("11110473","Hermenegildo Barricat Verganza",52);
        lista3[36]=new Persona("11110480","Lemany  Fontan Morales",22);
        lista3[37]=new Persona("11117069","Telmo Ballesteros Cabeza",69);
        lista3[38]=new Persona("11119831","Lila Zorrilla Elzuardi",16);
        lista3[39]=new Persona("11112827","Indalecio Loño Lantadilla",22);
        lista3[40]=new Persona("11112278","Clemente Langarica Lasurtigui",39);
        lista3[41]=new Persona("11112077","Inocenta Gañona Sagarteguieta",41);
        lista3[42]=new Persona("11115730","Alain Mora Bolilla",52);
        lista3[43]=new Persona("11114465","Mabel Merecilla Falavarte",93);
        lista3[44]=new Persona("11116011","Práxedes Loinaz Guztros",21);
        lista3[45]=new Persona("11115466","Naomi Fontao Cagigal",79);
        lista3[46]=new Persona("11116516","Dalila Copeiro Entia",42);
        lista3[47]=new Persona("11118845","Eder Armea Coleira",56);
        lista3[48]=new Persona("11119254","Arelis Murguiondo Pablo",22);
        lista3[49]=new Persona("11112212","Etorne Varsana Tobalina",81);
        lista3[50]=new Persona("11112334","Deidi Raon Gimilio",91);
        lista3[51]=new Persona("11117825","Fortiá Ochandiano Mendez",10);
        lista3[52]=new Persona("11114456","Laila Hervias Oruña",14);
        lista3[53]=new Persona("11118648","Robbie Atienza Luzuriaga",54);
        lista3[54]=new Persona("11112116","Joanny Jimenez Miñon",92);
        lista3[55]=new Persona("11113118","Magnolia Busta Villaurreta",97);
        lista3[56]=new Persona("11117245","Leandro Zamarro Salcines",96);
        lista3[57]=new Persona("11112712","Luana Marroquin Paez",33);
        lista3[58]=new Persona("11113463","Rolando Arbe San",38);
        lista3[59]=new Persona("11112422","Camila Balsera Monasterio",10);
        lista3[60]=new Persona("11118311","Alien Lossada Oñatibia",87);
        lista3[61]=new Persona("11118788","Geobel Verdeces Ilarza",67);
        lista3[62]=new Persona("11113412","Daniel Ariztimuño Libran",90);
        lista3[63]=new Persona("11117371","Timo Heres Cires",97);
        lista3[64]=new Persona("11115895","Melani Villabel Durante",8);
        lista3[65]=new Persona("11118999","Rolando Bodega Rabago",43);
        lista3[66]=new Persona("11119656","Yatzel Morelle Arguiz",40);
        lista3[67]=new Persona("11112696","Yaira Aumente Zulueta",94);
        lista3[68]=new Persona("11119550","Dione Noriega Bartolome",48);
        lista3[69]=new Persona("11119001","Camila Cubas Herces",41);

        Persona[] lista2= Arrays.copyOf(lista3,30);
        Persona[] lista1= Arrays.copyOf(lista3,15);


        ordenador.realizarOrdenamiento(lista1);
        ordenador.realizarOrdenamiento(lista2);
        ordenador.realizarOrdenamiento(lista3);





    }
}
