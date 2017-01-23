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

        if(choice == 1)
        {
            System.out.println("Enter the color name");
            String cName = inputS.nextLine();
            for(int i = 0; i<namesAr.length; i++)
            {
                if(cName.equals(namesAr[i]))
                {

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
