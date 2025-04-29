import java.io.*;
import java.util.*;
import javax.swing.*;

public class Club_Prefi {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("club.txt"));

        String playerCharacter = JOptionPane.showInputDialog("""
                Select your character:
                
                "Alejandro" or "Samantha"
                """);
        boolean isAlejandro = playerCharacter.equalsIgnoreCase("Alejandro");
        
        // Stats idk
        int position = 1;
        int otherCharacterPos = 15;
        int moveRange;
        
        boolean hasToiletBuff = false;
        
        int enjoymentLevel;
        String[] enjoymentBars;
        
        String playerEmoji = isAlejandro ? "👦" : "👧";
        String otherEmoji = isAlejandro ? "👧" : "👦";
        
        // Enjoyment and movement range
        if (isAlejandro) {
            enjoymentLevel = 5;
            moveRange = 4; // Can move 1-4 spaces
        } else {
            enjoymentLevel = 8;
            moveRange = 5; // Add 2 to the roll
        }
        
        // Initial Enjoyment Bars
        enjoymentBars = new String[enjoymentLevel];
        for (int i = 0; i < enjoymentLevel; i++) {
            enjoymentBars[i] = "⚡";
        }
        
        // Club array
        String[] club = {
            "🤮",
            "🍸",
            "🎶",
            "😎",
            "🚽",
            "🔐",
            "😎",
            "🍸",
            "🎶",
            "😎",
            "🚽",   
            "🍸",
            "😎",
            "🔐",
            "🍸",
            otherEmoji,
            "🎶",
            "🤮"
        };
        
        Random rand = new Random();
    
        out.println("""
                === Club Entrance ===
                %s %s arrives with their friend at the club
                The crowd swept eachother away and they became separated!
                =====================
                """.formatted(playerCharacter, playerEmoji));
        
        // Game loop
        for (int turn = 0; turn < 8; turn++) {
            int currentHour = 7 + turn;
            String amPm = currentHour >= 12 ? "am" : "pm";
            if (currentHour > 12) currentHour -= 12;
            out.println("@ " + currentHour + amPm);
            
            // Print enjoyment bar
            out.print(playerCharacter + "'s Enjoyment Bar: ");
            for (int i = 0; i < enjoymentLevel; i++) {
                out.print("⚡");
            }
            out.println();
            
            // Print club array with player positions
            out.print("[");
            for (int i = 0; i < club.length; i++) {
                if (i == position && i == otherCharacterPos) {
                    out.print(playerEmoji + otherEmoji);
                } else if (i == position) {
                    out.print(playerEmoji);
                } else if (i == otherCharacterPos) {
                    out.print(otherEmoji);
                } else {
                    out.print(club[i]);
                }
                if (i < club.length - 1) out.print(", ");
            }
            out.println("]");

            // Movement
            int baseMove = rand.nextInt(moveRange) + (isAlejandro ? 1 : 2);
            int actualMove = baseMove + (hasToiletBuff ? 2 : 0);
            hasToiletBuff = false;
            position = (position + actualMove) % club.length;
            
            String currentTile = club[position];
            
            switch (currentTile) {
                case "🤮":
                    enjoymentLevel -= 3;
                    out.println("A drunk person burped in " + playerCharacter + "'s face 🤮! -3 enjoyment");
                    out.println(playerCharacter + " rolled " + baseMove + ".");
                    out.println();              
                    break;
                case "🔐": 
                    position = 1;
                    out.println("Security check 🔐! Back to the entrance.");
                    out.println(playerCharacter + " rolled " + baseMove + ".");
                    out.println();
                    break;
                    
                case "🚽": 
                    hasToiletBuff = true;
                    out.println("Quick bathroom break 🚽! Next move will be faster.");
                    out.println(playerCharacter + " rolled " + baseMove + ".");
                    out.println();
                    break;
                    
                case "🎶": 
                    if (isAlejandro) {
                        enjoymentLevel++;
                        out.println("Great music 🎶! +1 enjoyment");
                    } else {
                        enjoymentLevel++;
                        out.println("Time to dance 🎶! +1 enjoyment");
                    }
                    out.println(playerCharacter + " rolled " + baseMove + ".");
                    out.println();
                    break;
                    
                case "🍸": 
                    if (isAlejandro) {
                        enjoymentLevel++;
                        out.println("Nice drink 🍸! +1 enjoyment");
                    } else {
                        enjoymentLevel -= 3;
                        out.println("No thanks to alcohol 🍸! -3 enjoyment");
                    }
                    out.println(playerCharacter + " rolled " + baseMove + ".");
                    out.println();
                    break;
                    
                case "😎": 
                    if (isAlejandro) {
                        enjoymentLevel -= 2;
                        out.println("Alejandro got shaken by the social atmosphere 😎... -2 enjoyment");
                    } else {
                        enjoymentLevel++;
                        out.println("Made new friends 😎! +1 enjoyment");
                    }
                    out.println(playerCharacter + " rolled " + baseMove);
                    out.println();
                    break;
                    
                default:
                    out.println("Alejandro met up with Samantha.");
                    out.println();
                    break;
            }
            
            // Update enjoyment bars
            enjoymentLevel = Math.max(0, enjoymentLevel);
            enjoymentBars = new String[enjoymentLevel];
            for (int i = 0; i < enjoymentLevel; i++) {
                enjoymentBars[i] = "⚡";
            }
            
            // Check end conditions
            if (enjoymentLevel <= 0) {
                out.println("\n=== THE NIGHT ENDS ===");
                if (isAlejandro) {
                    out.println("Alejandro's social anxiety got to him. He silently left the club.");
                } else {
                    out.println("Samantha got too pressured. She feigned a sick stomach and left.");
                }
                out.close();
                return;
            }
            
            if (position == otherCharacterPos) {
                out.println("\n=== THE NIGHT ENDS ===");
                out.println(playerCharacter + " found their friend! They decided they had enough fun and left together.");
                out.close();
                return;
            }
            
            if (turn == 7) {
                out.println("\n=== THE NIGHT ENDS ===");
                out.println("The club is closing! " + playerCharacter + " had a great time but couldn't find their friend. They agreed to meet outside.");
                out.close();
                return;
            }
        }
        out.close();
    }
}
