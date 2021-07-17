package com.naufalshidqi.dicoding.manchesterunitedplayers;

import java.util.ArrayList;

public class PlayerData {
    public static String[][] data = new String[][]{
            {"David De Gea", "1", "Goalkeeper", "Spain", "27", "07/11/1990", "192cm", "David De Gea has blossomed into one of the top goalkeepers in the world since joining United in 2011", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p51940.png"},
            {"Sergio Romero", "22", "Goalkeeper", "Argentina", "31", "22/02/1987", "192cm", "While competing with David De Gea for a starting berth has traditionally been a thankless task at Old Trafford, the professionalism and consistency of Sergio Romero earned him plentiful first-team openings at United", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p42899.png"},
            {"Victor Lindelof", "2", "Defender", "Sweden", "24", "17/07/1994", "187cm", "Dealing with pressure is something that appears to come naturally to unflappable Swedish defender, Victor Lindelof", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p184667.png"},
            {"Eric Bailly", "3", "Defender", "Cote D'Ivoire", "24", "12/04/1994", "187cm", "Eric Bailly joined Manchester United from Villarreal in the summer of 2016 and quickly made a name for himself at Old Trafford", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p197365.png"},
            {"Phil Jones", "4", "Defender", "England", "26", "21/02/1992", "180cm", "Having impressed in a handful of performances against the Reds for Blackburn Rovers, the powerful, energetic defender chose Old Trafford over several alternative destinations in the summer of 2011", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p76359.png"},
            {"Marcos Rojo", "16", "Defender", "Argentina", "28", "20/03/1990", "187cm", "Marcos Rojo is an accomplished Argentina international with a tough-tackling style that has proven popular among Manchester United supporters at Old Trafford", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p58893.png"},
            {"Chris Smalling", "12", "Defender", "England", "28", "22/11/1989", "194cm", "Chris Smalling is now one of United’s longest-serving players, and one of the club’s most reliable performers too", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p55909.png"},
            {"Ashley Young", "18", "Defender", "England", "33", "09/07/1985", "175cm", "Ashley Young joined United from Aston Villa in 2011 and he has since transformed himself from an exciting winger into a formidable full-back, proving himself to be one of the most versatile options in the squad", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p18892.png"},
            {"Luke Shaw", "23", "Defender", "England", "23", "12/07/1995", "185cm", "Luke Shaw remains one of English football’s most exciting prospects after joining Manchester United from Southampton in June 2014", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p106760.png"},
            {"Antonio Valencia", "25", "Defender", "Ecuador", "33", "04/08/1985", "180cm", "Armed with pace and power, Antonio Valencia has become one of United’s most consistently solid performers", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p20695.png"},
            {"Matteo Darmian", "36", "Defender", "Italy", "28", "02/12/1989", "182cm", "One of the unsung heroes in the United squad, Matteo Darmian can be relied up upon whenever selected, with his versatility key to occupying either full-back position depending on the situation", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p40002.png"},
            {"Paul Pogba", "6", "Midfielder", "France", "25", "15/03/1993", "191cm", "Paul Pogba needs no introduction to Manchester United fans, having learned his trade at the club before blossoming into a world-class midfielder at Juventus", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p74208.png"},
            {"Juan Mata", "8", "Midfielder", "Spain", "30", "28/04/1988", "170cm", "Juan Mata exudes class, intelligence and panache – and not just with a ball at his feet", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p43670.png"},
            {"Jesse Lingard", "14", "Midfielder", "England", "25", "15/12/1992", "175cm", "esse Lingard had to wait for his chance to make a first-team impression at the club he’s been at since the age of seven but, boy, has his patience paid off", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p109322.png"},
            {"Ander Herrera", "21", "Midfielder", "Spain", "29", "14/08/1989", "182cm", "Ander Herrera became the first new arrival of Louis van Gaal’s reign at Manchester United in June 2014 and he has gone on to become one of the club’s most influential players, winning the Sir Matt Busby Player of the Year Award in 2016/17", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p59846.png"},
            {"Marouane Fellaini", "27", "Midfielder", "Belgium", "30", "22/11/1987", "194cm", "Marouane Fellaini joined Manchester United from Everton in September 2013 and his hearty performances have earned him plenty of plaudits", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p41184.png"},
            {"Nemanja Matic", "31", "Midfielder", "Serbia", "30", "01/08/1988", "194cm", "Nemanja Matic is perhaps the definition of an unsung hero in modern football - the sort of player who makes a team tick, with minimum fuss but maximum efficiency", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p62398.png"},
            {"Fred", "17", "Midfielder", "Brazil", "25", "05/03/1993", "169cm", "Fred's move to Manchester United was processed while he was away representing Brazil at the World Cup finals", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p101582.png"},
            {"Andreas Pereira", "11", "Midfielder", "Brazil", "22", "01/01/1996", "178cm", "Andreas Pereira is a talented, creative midfielder who joined Manchester United from PSV Eindhoven in 2012", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p156689.png"},
            {"Alexis Sanchez", "7", "Forward", "Chile", "29", "19/12/1988", "169cm", "Even from a young age, Alexis Sanchez’s supreme natural talent and ability to become a global superstar was evident – and his arrival at Manchester United marked a \"dream come true\" for the club's first-ever Chilean footballer", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p37265.png"},
            {"Romelu Lukaku", "9", "Forward", "Belgium", "25", "13/05/1993", "190cm", "Romelu Lukaku was long touted to achieve superstardom, ever since breaking into Anderlecht’s first team 11 days past his 16th birthday", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p66749.png"},
            {"Anthony Martial", "11", "Forward", "France", "22", "05/12/1995", "181cm", "A forward who is often compared to Premier League legend Thierry Henry, another former Monaco man, Anthony Martial has all of the tools needed to shine at Manchester United", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p148225.png"},
            {"Marcus Rashford", "10", "Forward", "England", "20", "31/10/1997", "180cm", "Marcus Rashford was thrust into the senior spotlight in February 2016 – with spectacular results – and he has not looked back since", "https://premierleague-static-files.s3.amazonaws.com/premierleague/photos/players/250x250/p176297.png"}
    };

    public static ArrayList<Player> getListData(){
        Player player = null;
        ArrayList<Player> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            player = new Player();
            player.setName(data[i][0]);
            player.setNumber(data[i][1]);
            player.setPosition(data[i][2]);
            player.setNationality(data[i][3]);
            player.setAge(data[i][4]);
            player.setBirth(data[i][5]);
            player.setHeight(data[i][6]);
            player.setRemarks(data[i][7]);
            player.setPhoto(data[i][8]);

            list.add(player);
        }

        return list;
    }
}
