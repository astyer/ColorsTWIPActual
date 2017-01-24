package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputS = new Scanner(System.in);
        Scanner inputI = new Scanner(System.in);
        System.out.println("Choose to enter a color name (1) , RGB triplet (2), or hexadecimal (3). (Input 1, 2, or 3)");
        int choice = inputI.nextInt();

        String names = "AliceBlue \n" +
                "AntiqueWhite \n" +
                "Aqua \n" +
                "Aquamarine \n" +
                "Azure \n" +
                "Beige \n" +
                "Bisque \n" +
                "Black \n" +
                "BlanchedAlmond \n" +
                "Blue \n" +
                "BlueViolet \n" +
                "Brown \n" +
                "BurlyWood \n" +
                "CadetBlue \n" +
                "Chartreuse \n" +
                "Chocolate \n" +
                "Coral \n" +
                "CornflowerBlue \n" +
                "Cornsilk \n" +
                "Crimson \n" +
                "Cyan \n" +
                "DarkBlue \n" +
                "DarkCyan \n" +
                "DarkGoldenRod \n" +
                "DarkGray \n" +
                "DarkGrey \n" +
                "DarkGreen \n" +
                "DarkKhaki \n" +
                "DarkMagenta \n" +
                "DarkOliveGreen \n" +
                "DarkOrange \n" +
                "DarkOrchid \n" +
                "DarkRed \n" +
                "DarkSalmon \n" +
                "DarkSeaGreen \n" +
                "DarkSlateBlue \n" +
                "DarkSlateGray \n" +
                "DarkSlateGrey \n" +
                "DarkTurquoise \n" +
                "DarkViolet \n" +
                "DeepPink \n" +
                "DeepSkyBlue \n" +
                "DimGray \n" +
                "DimGrey \n" +
                "DodgerBlue \n" +
                "FireBrick \n" +
                "FloralWhite \n" +
                "ForestGreen \n" +
                "Fuchsia \n" +
                "Gainsboro \n" +
                "GhostWhite \n" +
                "Gold \n" +
                "GoldenRod \n" +
                "Gray \n" +
                "Grey \n" +
                "Green \n" +
                "GreenYellow \n" +
                "HoneyDew \n" +
                "HotPink \n" +
                "IndianRed  \n" +
                "Indigo  \n" +
                "Ivory \n" +
                "Khaki \n" +
                "Lavender \n" +
                "LavenderBlush \n" +
                "LawnGreen \n" +
                "LemonChiffon \n" +
                "LightBlue \n" +
                "LightCoral \n" +
                "LightCyan \n" +
                "LightGoldenRodYellow \n" +
                "LightGray \n" +
                "LightGrey \n" +
                "LightGreen \n" +
                "LightPink \n" +
                "LightSalmon \n" +
                "LightSeaGreen \n" +
                "LightSkyBlue \n" +
                "LightSlateGray \n" +
                "LightSlateGrey \n" +
                "LightSteelBlue \n" +
                "LightYellow \n" +
                "Lime \n" +
                "LimeGreen \n" +
                "Linen \n" +
                "Magenta \n" +
                "Maroon \n" +
                "MediumAquaMarine \n" +
                "MediumBlue \n" +
                "MediumOrchid \n" +
                "MediumPurple \n" +
                "MediumSeaGreen \n" +
                "MediumSlateBlue \n" +
                "MediumSpringGreen \n" +
                "MediumTurquoise \n" +
                "MediumVioletRed \n" +
                "MidnightBlue \n" +
                "MintCream \n" +
                "MistyRose \n" +
                "Moccasin \n" +
                "NavajoWhite \n" +
                "Navy \n" +
                "OldLace \n" +
                "Olive \n" +
                "OliveDrab \n" +
                "Orange \n" +
                "OrangeRed \n" +
                "Orchid \n" +
                "PaleGoldenRod \n" +
                "PaleGreen \n" +
                "PaleTurquoise \n" +
                "PaleVioletRed \n" +
                "PapayaWhip \n" +
                "PeachPuff \n" +
                "Peru \n" +
                "Pink \n" +
                "Plum \n" +
                "PowderBlue \n" +
                "Purple \n" +
                "RebeccaPurple \n" +
                "Red \n" +
                "RosyBrown \n" +
                "RoyalBlue \n" +
                "SaddleBrown \n" +
                "Salmon \n" +
                "SandyBrown \n" +
                "SeaGreen \n" +
                "SeaShell \n" +
                "Sienna \n" +
                "Silver \n" +
                "SkyBlue \n" +
                "SlateBlue \n" +
                "SlateGray \n" +
                "SlateGrey \n" +
                "Snow \n" +
                "SpringGreen \n" +
                "SteelBlue \n" +
                "Tan \n" +
                "Teal \n" +
                "Thistle \n" +
                "Tomato \n" +
                "Turquoise \n" +
                "Violet \n" +
                "Wheat \n" +
                "White \n" +
                "WhiteSmoke \n" +
                "Yellow \n" +
                "YellowGreen \n";

        String namesAr [] = names.split(" \n");

        String hexes = "F0F8FF\n" +
                "FAEBD7\n" +
                "00FFFF\n" +
                "7FFFD4\n" +
                "F0FFFF\n" +
                "F5F5DC\n" +
                "FFE4C4\n" +
                "000000\n" +
                "FFEBCD\n" +
                "0000FF\n" +
                "8A2BE2\n" +
                "A52A2A\n" +
                "DEB887\n" +
                "5F9EA0\n" +
                "7FFF00\n" +
                "D2691E\n" +
                "FF7F50\n" +
                "6495ED\n" +
                "FFF8DC\n" +
                "DC143C\n" +
                "00FFFF\n" +
                "00008B\n" +
                "008B8B\n" +
                "B8860B\n" +
                "A9A9A9\n" +
                "A9A9A9\n" +
                "006400\n" +
                "BDB76B\n" +
                "8B008B\n" +
                "556B2F\n" +
                "FF8C00\n" +
                "9932CC\n" +
                "8B0000\n" +
                "E9967A\n" +
                "8FBC8F\n" +
                "483D8B\n" +
                "2F4F4F\n" +
                "2F4F4F\n" +
                "00CED1\n" +
                "9400D3\n" +
                "FF1493\n" +
                "00BFFF\n" +
                "696969\n" +
                "696969\n" +
                "1E90FF\n" +
                "B22222\n" +
                "FFFAF0\n" +
                "228B22\n" +
                "FF00FF\n" +
                "DCDCDC\n" +
                "F8F8FF\n" +
                "FFD700\n" +
                "DAA520\n" +
                "808080\n" +
                "808080\n" +
                "008000\n" +
                "ADFF2F\n" +
                "F0FFF0\n" +
                "FF69B4\n" +
                "CD5C5C\n" +
                "4B0082\n" +
                "FFFFF0\n" +
                "F0E68C\n" +
                "E6E6FA\n" +
                "FFF0F5\n" +
                "7CFC00\n" +
                "FFFACD\n" +
                "ADD8E6\n" +
                "F08080\n" +
                "E0FFFF\n" +
                "FAFAD2\n" +
                "D3D3D3\n" +
                "D3D3D3\n" +
                "90EE90\n" +
                "FFB6C1\n" +
                "FFA07A\n" +
                "20B2AA\n" +
                "87CEFA\n" +
                "778899\n" +
                "778899\n" +
                "B0C4DE\n" +
                "FFFFE0\n" +
                "00FF00\n" +
                "32CD32\n" +
                "FAF0E6\n" +
                "FF00FF\n" +
                "800000\n" +
                "66CDAA\n" +
                "0000CD\n" +
                "BA55D3\n" +
                "9370DB\n" +
                "3CB371\n" +
                "7B68EE\n" +
                "00FA9A\n" +
                "48D1CC\n" +
                "C71585\n" +
                "191970\n" +
                "F5FFFA\n" +
                "FFE4E1\n" +
                "FFE4B5\n" +
                "FFDEAD\n" +
                "000080\n" +
                "FDF5E6\n" +
                "808000\n" +
                "6B8E23\n" +
                "FFA500\n" +
                "FF4500\n" +
                "DA70D6\n" +
                "EEE8AA\n" +
                "98FB98\n" +
                "AFEEEE\n" +
                "DB7093\n" +
                "FFEFD5\n" +
                "FFDAB9\n" +
                "CD853F\n" +
                "FFC0CB\n" +
                "DDA0DD\n" +
                "B0E0E6\n" +
                "800080\n" +
                "663399\n" +
                "FF0000\n" +
                "BC8F8F\n" +
                "4169E1\n" +
                "8B4513\n" +
                "FA8072\n" +
                "F4A460\n" +
                "2E8B57\n" +
                "FFF5EE\n" +
                "A0522D\n" +
                "C0C0C0\n" +
                "87CEEB\n" +
                "6A5ACD\n" +
                "708090\n" +
                "708090\n" +
                "FFFAFA\n" +
                "00FF7F\n" +
                "4682B4\n" +
                "D2B48C\n" +
                "008080\n" +
                "D8BFD8\n" +
                "FF6347\n" +
                "40E0D0\n" +
                "EE82EE\n" +
                "F5DEB3\n" +
                "FFFFFF\n" +
                "F5F5F5\n" +
                "FFFF00\n" +
                "9ACD32";

        String hexesAr [] = hexes.split("\n");

        if(choice == 1)
        {
            System.out.println("Enter the color name");
            String cName = inputS.nextLine();
            for(int i = 0; i<namesAr.length; i++)
            {
                if(cName.equalsIgnoreCase(namesAr[i]))
                {
                    String RGBtripfull = "";
                    System.out.println("Hexadecimal: " + hexesAr[i]);
                    for(int x = 0; x < 7; x=x+2)
                    {
                        String hexPart = hexesAr[i].substring(x, x+2);
                    }
                }
            }
        }

        if(choice == 2)
        {
            System.out.println("Enter the RGB triplet (example: 255 255 255)");
            String RGBTrip = inputS.nextLine();
            String [] RGB = RGBTrip.split(" ");
            String hex = "";
            for(int i = 0; i < RGB.length; i++)
            {
                int a  = Integer.parseInt(RGB[i]);
                String hexPart = Integer.toHexString(a);
                hex += hexPart;
            }
            System.out.println("Hexadecimal: " + hex);
        }

        if(choice == 3)
        {
            System.out.println("Enter the hexadecimal");
            String hexa = inputS.nextLine();
        }

    }
}
