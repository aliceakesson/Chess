
package Schack;

import javax.swing.JLabel;


public class SchackExtra extends Main {

    public void initieringEmptyCels() {
        /*
        
    public final JLabel empty1 = new JLabel(), empty2 = new JLabel(), empty3 = new JLabel(), empty4 = new JLabel(), empty5 = new JLabel(), empty6 = new JLabel(), empty7 = new JLabel(), empty8 = new JLabel();
    public final JLabel empty9 = new JLabel(), empty10 = new JLabel(), empty11 = new JLabel(), empty12 = new JLabel(), empty13 = new JLabel(), empty14 = new JLabel(), empty15 = new JLabel(), empty16 = new JLabel();
    public final JLabel empty17 = new JLabel(), empty18 = new JLabel(), empty19 = new JLabel(), empty20 = new JLabel(), empty21 = new JLabel(), empty22 = new JLabel(), empty23 = new JLabel(), empty24 = new JLabel();
    public final JLabel empty25 = new JLabel(), empty26 = new JLabel(), empty27 = new JLabel(), empty28 = new JLabel(), empty29 = new JLabel(), empty30 = new JLabel(), empty31 = new JLabel(), empty32 = new JLabel();
    public final JLabel empty33 = new JLabel(), empty34 = new JLabel(), empty35 = new JLabel(), empty36 = new JLabel(), empty37 = new JLabel(), empty38 = new JLabel(), empty39 = new JLabel(), empty40 = new JLabel();
    public final JLabel empty41 = new JLabel(), empty42 = new JLabel(), empty43 = new JLabel(), empty44 = new JLabel(), empty45 = new JLabel(), empty46 = new JLabel(), empty47 = new JLabel(), empty48 = new JLabel();
    public final JLabel empty49 = new JLabel(), empty50 = new JLabel(), empty51 = new JLabel(), empty52 = new JLabel(), empty53 = new JLabel(), empty54 = new JLabel(), empty55 = new JLabel(), empty56 = new JLabel();
    public final JLabel empty57 = new JLabel(), empty58 = new JLabel(), empty59 = new JLabel(), empty60 = new JLabel(), empty61 = new JLabel(), empty62 = new JLabel(), empty63 = new JLabel(), empty64 = new JLabel();
    
        */
    
    }
    public void setOpaqueTrue() {
        /*
        empty1.setOpaque(true);
        empty2.setOpaque(true);
        empty3.setOpaque(true);
        empty4.setOpaque(true);
        empty5.setOpaque(true);
        empty6.setOpaque(true);
        empty7.setOpaque(true);
        empty8.setOpaque(true);
        empty9.setOpaque(true);
        empty10.setOpaque(true);
        empty11.setOpaque(true);
        empty12.setOpaque(true);
        empty13.setOpaque(true);
        empty14.setOpaque(true);
        empty15.setOpaque(true);
        empty16.setOpaque(true);
        empty17.setOpaque(true);
        empty18.setOpaque(true);
        empty19.setOpaque(true);
        empty20.setOpaque(true);
        empty21.setOpaque(true);
        empty22.setOpaque(true);
        empty23.setOpaque(true);
        empty24.setOpaque(true);
        empty25.setOpaque(true);
        empty26.setOpaque(true);
        empty27.setOpaque(true);
        empty28.setOpaque(true);
        empty29.setOpaque(true);
        empty30.setOpaque(true);
        empty31.setOpaque(true);
        empty32.setOpaque(true);
        empty33.setOpaque(true);
        empty34.setOpaque(true);
        empty35.setOpaque(true);
        empty36.setOpaque(true);
        empty37.setOpaque(true);
        empty38.setOpaque(true);
        empty39.setOpaque(true);
        empty40.setOpaque(true);
        empty41.setOpaque(true);
        empty42.setOpaque(true);
        empty43.setOpaque(true);
        empty44.setOpaque(true);
        empty45.setOpaque(true);
        empty46.setOpaque(true);
        empty47.setOpaque(true);
        empty48.setOpaque(true);
        empty49.setOpaque(true);
        empty50.setOpaque(true);
        empty51.setOpaque(true);
        empty52.setOpaque(true);
        empty53.setOpaque(true);
        empty54.setOpaque(true);
        empty55.setOpaque(true);
        empty56.setOpaque(true);
        empty57.setOpaque(true);
        empty58.setOpaque(true);
        empty59.setOpaque(true);
        empty60.setOpaque(true);
        empty61.setOpaque(true);
        empty62.setOpaque(true);
        empty63.setOpaque(true);
        empty64.setOpaque(true);
        */
    }
    public void initieringEmptyCelsArray() {
        
        /*
        
        public JLabel [] emptyCels = new JLabel[64];
    
    public final JLabel empty1 = emptyCels[0], empty2 = emptyCels[1], empty3 = emptyCels[2], empty4 = emptyCels[3], empty5 = emptyCels[4], empty6 = emptyCels[5], empty7 = emptyCels[6], empty8 = emptyCels[7];
    public final JLabel empty9 = emptyCels[8], empty10 = emptyCels[9], empty11 = emptyCels[10], empty12 = emptyCels[11], empty13 = emptyCels[12], empty14 = emptyCels[13], empty15 = emptyCels[14], empty16 = emptyCels[15];
    public final JLabel empty17 = emptyCels[16], empty18 = emptyCels[17], empty19 = emptyCels[18], empty20 = emptyCels[21], empty21 = emptyCels[22], empty22 = emptyCels[23], empty23 = emptyCels[24], empty24 = emptyCels[25];
    public final JLabel empty25 = emptyCels[24], empty26 = emptyCels[25], empty27 = emptyCels[26], empty28 = emptyCels[27], empty29 = emptyCels[28], empty30 = emptyCels[29], empty31 = emptyCels[30], empty32 = emptyCels[31];
    public final JLabel empty33 = emptyCels[32], empty34 = emptyCels[33], empty35 = emptyCels[34], empty36 = emptyCels[35], empty37 = emptyCels[36], empty38 = emptyCels[37], empty39 = emptyCels[38], empty40 = emptyCels[39];
    public final JLabel empty41 = emptyCels[40], empty42 = emptyCels[41], empty43 = emptyCels[42], empty44 = emptyCels[43], empty45 = emptyCels[44], empty46 = emptyCels[45], empty47 = emptyCels[46], empty48 = emptyCels[47];
    public final JLabel empty49 = emptyCels[48], empty50 = emptyCels[49], empty51 = emptyCels[50], empty52 = emptyCels[51], empty53 = emptyCels[52], empty54 = emptyCels[53], empty55 = emptyCels[54], empty56 = emptyCels[55];
    public final JLabel empty57 = emptyCels[56], empty58 = emptyCels[57], empty59 = emptyCels[58], empty60 = emptyCels[59], empty61 = emptyCels[60], empty62 = emptyCels[61], empty63 = emptyCels[62], empty64 = emptyCels[63];
    
        
        */
        
        
    }
    public void setBoundsCopyPaste() {
        
        /*
        
         
        blackRook1.setBounds(blackRook1_x, blackRook1_y, CEL_WIDTH, CEL_WIDTH);
        blackKnight1.setBounds(blackKnight1_x, blackKnight1_y, CEL_WIDTH, CEL_WIDTH);
        blackBishop1.setBounds(blackBishop1_x, blackBishop1_y, CEL_WIDTH, CEL_WIDTH);
        blackQueen.setBounds(blackQueen_x, blackQueen_y, CEL_WIDTH, CEL_WIDTH);
        blackKing.setBounds(blackKing_x, blackKing_y, CEL_WIDTH, CEL_WIDTH);
        blackBishop2.setBounds(blackBishop2_x, blackBishop2_y, CEL_WIDTH, CEL_WIDTH);
        blackKnight2.setBounds(blackKnight2_x, blackKnight2_y, CEL_WIDTH, CEL_WIDTH);
        blackRook2.setBounds(blackRook2_x, blackRook2_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn1.setBounds(blackPawn1_x, blackPawn1_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn2.setBounds(blackPawn2_x, blackPawn2_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn3.setBounds(blackPawn3_x, blackPawn3_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn4.setBounds(blackPawn4_x, blackPawn4_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn5.setBounds(blackPawn5_x, blackPawn5_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn6.setBounds(blackPawn6_x, blackPawn6_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn7.setBounds(blackPawn7_x, blackPawn7_y, CEL_WIDTH, CEL_WIDTH);
        blackPawn8.setBounds(blackPawn8_x, blackPawn8_y, CEL_WIDTH, CEL_WIDTH);
        
        
        whiteRook1.setBounds(whiteRook1_x, whiteRook1_y, CEL_WIDTH, CEL_WIDTH);
        whiteBishop1.setBounds(whiteBishop1_x, whiteBishop1_y, CEL_WIDTH, CEL_WIDTH);
        whiteQueen.setBounds(whiteQueen_x, whiteQueen_y, CEL_WIDTH, CEL_WIDTH);
        whiteKing.setBounds(whiteKing_x, whiteKing_y, CEL_WIDTH, CEL_WIDTH);
        whiteBishop2.setBounds(whiteBishop2_x, whiteBishop2_y, CEL_WIDTH, CEL_WIDTH);
        whiteKnight2.setBounds(whiteKnight2_x, whiteKnight2_y, CEL_WIDTH, CEL_WIDTH);
        whiteRook2.setBounds(whiteRook2_x, whiteRook2_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn1.setBounds(whitePawn1_x, whitePawn1_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn2.setBounds(whitePawn2_x, whitePawn2_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn3.setBounds(whitePawn3_x, whitePawn3_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn4.setBounds(whitePawn4_x, whitePawn4_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn5.setBounds(whitePawn5_x, whitePawn5_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn6.setBounds(whitePawn6_x, whitePawn6_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn7.setBounds(whitePawn7_x, whitePawn7_y, CEL_WIDTH, CEL_WIDTH);
        whitePawn8.setBounds(whitePawn8_x, whitePawn8_y, CEL_WIDTH, CEL_WIDTH);
        
        
        */
        
    }
    public void movePieceBlackCopy() {
        
        /*
        
         else if(cel == blackRook1) {
            xPos = blackRook1_x; 
            yPos = blackRook1_y;
            kill(blackRook1);
        }
        else if(cel == blackKnight1) {
            xPos = blackKnight1_x; 
            yPos = blackKnight1_y;
            kill(blackKnight1);
        }
        else if(cel == blackBishop1) {
            xPos = blackBishop1_x; 
            yPos = blackBishop1_y;
            kill(blackBishop1);
        }
        else if(cel == blackQueen) {
            xPos = blackQueen_x; 
            yPos = blackQueen_y;
            kill(blackQueen);
        }
        else if(cel == blackKing) {
            xPos = blackKing_x; 
            yPos = blackKing_y;
            kill(blackKing);
        }
        else if(cel == blackBishop2) {
            xPos = blackBishop2_x; 
            yPos = blackBishop2_y;
            kill(blackBishop2);
        }
        else if(cel == blackKnight2) {
            xPos = blackKnight2_x; 
            yPos = blackKnight2_y;
            kill(blackKnight2);
        }
        else if(cel == blackRook2) {
            xPos = blackRook2_x; 
            yPos = blackRook2_y;
            kill(blackRook2);
        }
        else if(cel == blackPawn1) {
            xPos = blackPawn1_x; 
            yPos = blackPawn1_y;
            kill(blackPawn1);
        }
        else if(cel == blackPawn2) {
            xPos = blackPawn2_x; 
            yPos = blackPawn2_y;
            kill(blackPawn2);
        }
        else if(cel == blackPawn3) {
            xPos = blackPawn3_x; 
            yPos = blackPawn3_y;
            kill(blackPawn3);
        }
        else if(cel == blackPawn4) {
            xPos = blackPawn4_x; 
            yPos = blackPawn4_y;
            kill(blackPawn4);
        }
        else if(cel == blackPawn5) {
            xPos = blackPawn5_x; 
            yPos = blackPawn5_y;
            kill(blackPawn5);
        }
        else if(cel == blackPawn6) {
            xPos = blackPawn6_x; 
            yPos = blackPawn6_y;
            kill(blackPawn6);
        }
        else if(cel == blackPawn7) {
            xPos = blackPawn7_x; 
            yPos = blackPawn7_y;
            kill(blackPawn7);
        }
        else if(cel == blackPawn8) {
            xPos = blackPawn8_x; 
            yPos = blackPawn8_y;
            kill(blackPawn8);
        }
        
        */
        
    }
    public void compMoveBrainstorm() {
        
         /*
        
        1. KOLLA ALLA MÖJLIGA DRAG 1 FÖR ALLA PJÄSER (possible outcomes)
            1.1 se möjliga drag för alla pjäser på plan (spara i possibleOutcome1[] x och y)
            1.2 för varje drag: gå till outcome 2 
        2. KOLLA ALLA MÖJLIGA DRAG I STEG 2 FÖR WHITE SOM GYNNAR WHITE MEST
            2.1 gå igenom alla möjliga VIT PJÄS drag från outcome1 (max 72)
            2.2 se möjliga VIT PJÄS drag FRÅN DESSA nya positioner (max 5 184 outcomes)
            2.3 kolla vilket som har högst värde för vit pjäs och välj
        3. KOLLA ALLA MÖJLIGA DRAG I STEG 3 
            3.1 ta position från 2.3 och sök outcomes för SVART PJÄS 
            3.2 välj outcome med mest högst värde för SVART PJÄS 
        4. SE VILKET SLUTLIG SÄTT SOM HAR DET BÄSTA VÄRDET 
            4.1 gå igenom alla möjliga drag från outcome3 (max 373 248)
            4.2 gå igenom värde för alla, låt ett int vara den med högst värde 
            4.3 välj de steg med högst värde 
        
        
        - iteratea alla x-positioner, y-positioner och string piece för drag
            - för varje, gå till ny funktion (int x, int y, String piece)
        - för varje drag: "skapa imaginär chessboard med nytt drag"
            - gör detta i funktion (int x, int y, String piece)
            - låt int position ex blackRook1_x, blackRook1_y ändras temporärt till nytt drag (repainta ej här) 
            - spara ursprungliga positioner i två int 
        - sök VITA PJÄSER outcomes för detta (max 72 per ny chessboard)
        - för varje VIT PJÄS outcome: beräkna värde efter bästa för vit
            - efter beräkning: låt SVART ÄNDRAD PJÄS gå tillbaka till ursprungligt värde
        - med int, hitta drag med bästa värdet för vit
        - gå efter föregående ny skapad imaginär chessboard, uppdatera den till nytt vitt drag
        - sök möjliga SVART PJÄS drag på denna chessboard och låt datan flytta till bästa värde
                
        
        VÄRDE: EFTER VILKA PJÄSER PÅ PLAN, EFTER VILKA LÄGEN, EFTER HUR MÅNGA KILLS
            - VILKA LÄGEN = HUR MÅNGA CELLER DE "VAKTAR"
        
        
        för varje value hitta: 
            - hitta value 
            - om det är högre, highestValue = value
            - efter hela sökandet, kolla drag med högst värde, ge temporär flytt till denna 
                - spara value i arrays
        
        */
        
    }
    public void switchToPosGammal() {
        
        /*
        
        if(piece == whiteRook1) { // flytta piece temporärt
            tempX = whiteRook1_x; 
            tempY = whiteRook1_y; 
            whiteRook1_x = x; 
            whiteRook1_y = y; 
        }
        else if(piece == whiteKnight1) {
            tempX = whiteKnight1_x; 
            tempY = whiteKnight1_y; 
            whiteKnight1_x = x; 
            whiteKnight1_y = y; 
        }
        else if(piece == whiteBishop1) {
            tempX = whiteBishop1_x; 
            tempY = whiteBishop1_y; 
            whiteBishop1_x = x; 
            whiteBishop1_y = y; 
        }
        else if(piece == whiteQueen) {
            tempX = whiteQueen_x; 
            tempY = whiteQueen_y; 
            whiteQueen_x = x; 
            whiteQueen_y = y; 
        }
        else if(piece == whiteKing) {
            tempX = whiteKing_x; 
            tempY = whiteKing_y; 
            whiteKing_x = x; 
            whiteKing_y = y; 
        }
        else if(piece == whiteBishop2) {
            tempX = whiteBishop2_x; 
            tempY = whiteBishop2_y; 
            whiteBishop2_x = x; 
            whiteBishop2_y = y; 
        }
        else if(piece == whiteKnight2) {
            tempX = whiteKnight2_x; 
            tempY = whiteKnight2_y; 
            whiteKnight2_x = x; 
            whiteKnight2_y = y; 
        }
        else if(piece == whiteRook2) {
            tempX = whiteRook2_x; 
            tempY = whiteRook2_y; 
            whiteRook2_x = x; 
            whiteRook2_y = y; 
        }
        else if(piece == whitePawn1) {
            tempX = whitePawn1_x; 
            tempY = whitePawn1_y; 
            whitePawn1_x = x; 
            whitePawn1_y = y; 
        }
        else if(piece == whitePawn2) {
            tempX = whitePawn2_x; 
            tempY = whitePawn2_y; 
            whitePawn2_x = x; 
            whitePawn2_y = y; 
        }
        else if(piece == whitePawn3) {
            tempX = whitePawn3_x; 
            tempY = whitePawn3_y; 
            whitePawn3_x = x; 
            whitePawn3_y = y; 
        }
        else if(piece == whitePawn4) {
            tempX = whitePawn4_x; 
            tempY = whitePawn4_y; 
            whitePawn4_x = x; 
            whitePawn4_y = y; 
        }
        else if(piece == whitePawn5) {
            tempX = whitePawn5_x; 
            tempY = whitePawn5_y; 
            whitePawn5_x = x; 
            whitePawn5_y = y; 
        }
        else if(piece == whitePawn6) {
            tempX = whitePawn6_x; 
            tempY = whitePawn6_y; 
            whitePawn6_x = x; 
            whitePawn6_y = y; 
        }
        else if(piece == whitePawn7) {
            tempX = whitePawn7_x; 
            tempY = whitePawn7_y; 
            whitePawn7_x = x; 
            whitePawn7_y = y; 
        }
        else if(piece == whitePawn8) {
            tempX = whitePawn8_x; 
            tempY = whitePawn8_y; 
            whitePawn8_x = x; 
            whitePawn8_y = y; 
        }
        if(piece == blackRook1) {
            tempX = blackRook1_x; 
            tempY = blackRook1_y; 
            blackRook1_x = x; 
            blackRook1_y = y; 
        }
        else if(piece == blackKnight1) {
            tempX = blackKnight1_x; 
            tempY = blackKnight1_y; 
            blackKnight1_x = x; 
            blackKnight1_y = y; 
        }
        else if(piece == blackBishop1) {
            tempX = blackBishop1_x; 
            tempY = blackBishop1_y; 
            blackBishop1_x = x; 
            blackBishop1_y = y; 
        }
        else if(piece == blackQueen) {
            tempX = blackQueen_x; 
            tempY = blackQueen_y; 
            blackQueen_x = x; 
            blackQueen_y = y; 
        }
        else if(piece == blackKing) {
            tempX = blackKing_x; 
            tempY = blackKing_y; 
            blackKing_x = x; 
            blackKing_y = y; 
        }
        else if(piece == blackBishop2) {
            tempX = blackBishop2_x; 
            tempY = blackBishop2_y; 
            blackBishop2_x = x; 
            blackBishop2_y = y; 
        }
        else if(piece == blackKnight2) {
            tempX = blackKnight2_x; 
            tempY = blackKnight2_y; 
            blackKnight2_x = x; 
            blackKnight2_y = y; 
        }
        else if(piece == blackRook2) {
            tempX = blackRook2_x; 
            tempY = blackRook2_y; 
            blackRook2_x = x; 
            blackRook2_y = y; 
        }
        else if(piece == blackPawn1) {
            tempX = blackPawn1_x; 
            tempY = blackPawn1_y; 
            blackPawn1_x = x; 
            blackPawn1_y = y; 
        }
        else if(piece == blackPawn2) {
            tempX = blackPawn2_x; 
            tempY = blackPawn2_y; 
            blackPawn2_x = x; 
            blackPawn2_y = y; 
        }
        else if(piece == blackPawn3) {
            tempX = blackPawn3_x; 
            tempY = blackPawn3_y; 
            blackPawn3_x = x; 
            blackPawn3_y = y; 
        }
        else if(piece == blackPawn4) {
            tempX = blackPawn4_x; 
            tempY = blackPawn4_y; 
            blackPawn4_x = x; 
            blackPawn4_y = y; 
        }
        else if(piece == blackPawn5) {
            tempX = blackPawn5_x; 
            tempY = blackPawn5_y; 
            blackPawn5_x = x; 
            blackPawn5_y = y; 
        }
        else if(piece == blackPawn6) {
            tempX = blackPawn6_x; 
            tempY = blackPawn6_y; 
            blackPawn6_x = x; 
            blackPawn6_y = y; 
        }
        else if(piece == blackPawn7) {
            tempX = blackPawn7_x; 
            tempY = blackPawn7_y; 
            blackPawn7_x = x; 
            blackPawn7_y = y; 
        }
        else if(piece == blackPawn8) {
            tempX = blackPawn8_x; 
            tempY = blackPawn8_y; 
            blackPawn8_x = x; 
            blackPawn8_y = y; 
        }
        
        */
        
    }
    public void elseIfNewOutComesBlack() {
        
        /*
        
        piece == blackRook1 || piece == blackKnight1 || piece == blackBishop1
                || piece == blackQueen || piece == blackKing || piece == blackBishop2
                || piece == blackKnight2 || piece == blackRook2 || piece == blackPawn1
                || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8
        
        */
        
    }
    public void killOpponentValueGammal() {
        
        /*
        findPossibleMoves(blackRook1);
            int count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent = count; 
            
            findPossibleMoves(blackKnight1);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackBishop1);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackQueen);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackKing);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackBishop2);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackKnight2);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackRook2);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn1);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn2);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn3);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn4);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn5);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn6);
            count = 0;
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn7);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            
            findPossibleMoves(blackPawn8);
            count = 0; 
            while(killX[count] != -1) {
                count++; 
            } killOpponent += count; 
            */
        
    }
    
    //extras, används ej längre
    public void newOutcomes(int x, int y, JLabel piece, int n) { //nytt drag efter (int x, int y, JLabel piece), efter detta drag, hitta vita outcomes. n = låda den kommer från 

        switchToPos(x, y, piece);

        //piece = flyttad piece
        if(piece == whiteRook1 || piece == whiteKnight1 || piece == whiteBishop1
                || piece == whiteQueen || piece == whiteKing || piece == whiteBishop2
                || piece == whiteKnight2 || piece == whiteRook2 || piece == whitePawn1
                || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            findPossibleOutcomes("black");
        }
        else {
            findPossibleOutcomes("white");
        }
        
        findValuesForPos(n+1);
        
        switchBackPiece(piece);
        
    }
    public void getNewPositionsFromPos(int n) { //få nya outcomes från en viss låda 
                
        if(n == 1) { // låda 1: första möjliga drag svart nr 1 
            int length = 0; 
            while(possibleOutcomes1_x[length] != -1) {
                length++;
            }
            for(int i = 0; i < length; i++) {
            
                newOutcomes(possibleOutcomes1_x[i], possibleOutcomes1_y[i], possibleOutcomes1_piece[i], n); // n = låda den kommer från 
   
                possibleOutcomes2_x[i] = possibleOutcomes_x[posHighestValue];
                possibleOutcomes2_y[i] = possibleOutcomes_y[posHighestValue];
                possibleOutcomes2_piece[i] = possibleOutcomes_piece[posHighestValue];
            
            }
        }
        else if(n == 2) { // låda 2: möljliga drag på vit genom alla outcomes från låda1
            int length = 0; 
            while(possibleOutcomes2_x[length] != -1) {
                length++;
            } 
            for(int i = 0; i < length; i++) {
            
                newOutcomes(possibleOutcomes2_x[i], possibleOutcomes2_y[i], possibleOutcomes2_piece[i], n+1);
                
                value3[i] = value; 
                
                possibleOutcomes3_x[i] = possibleOutcomes_x[posHighestValue]; // högsta värde outcome för SVART PJÄS ut från låda 2 
                possibleOutcomes3_y[i] = possibleOutcomes_y[posHighestValue];
                possibleOutcomes3_piece[i] = possibleOutcomes_piece[posHighestValue];
            
            }
        }
        
    }
    public void oldComp() {
        
        lastPieceWasWhiteKing = false; 
        
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {};

        clearArrays();
        
        findPossibleOutcomes("black");
        moveArrayPositionsTo(1); // flytta från låda 0 till 1 

        getNewPositionsFromPos(1); //sök och sätt högsta VIT PJÄS outcome från varje drag från possibleOutcomes1[] i possibleOutcomes2[]
        getNewPositionsFromPos(2);

        getHighest3Value(); // för låda 3 
        changePos();

        reloadBounds();
        repaint();
        
        whiteTurn = true;
        
    }
    public void findValuesForPos(int n) {
        
            int k = 0;
            while(possibleOutcomes_x[k] != -1) {
                k++; 
            } // k = hur många outcomes det finns i låda 0
            
            posHighestValue = 0;
            highestValue = 0; 
            for(int i = 0; i < posHighestValueArray.length; i++) {
                posHighestValueArray[i] = -1;
            }

            for(int i = 0; i < k; i++) { // gå igenom alla positioner i possibleoutcomes[] och sök värde för alla outcomes
                
                switchToPos2(possibleOutcomes_x[i], possibleOutcomes_y[i], possibleOutcomes_piece[i]);
                
                if(n == 1) {
                    getValue("black");
                }
                else if(n == 2) {
                    getValue("white");
                }
                else if(n == 3) {
                    getValue("black");
                    value3[i] = value; 
                }
               
                
                if(value > highestValue) {
                    for(int j = 0; j < posHighestValueArray.length; j++) {
                        posHighestValueArray[j] = -1; // rensa högsta värde array
                    }
                    posHighestValueArray[0] = i; 
                    highestValue = value; 
                }
                else if(value == highestValue) {
                    int l = 0; 
                    while(posHighestValueArray[l] != -1) {
                        l++; 
                    } 
                    posHighestValueArray[l] = i; 
                }
                
                switchBackPiece2(possibleOutcomes_piece[i]);

            }

            int length = 0; 
            while(posHighestValueArray[length] != -1) {
                length++; //antal positioner
            }

            if(length == 1) {
                posHighestValue = posHighestValueArray[0]; 
            }
            else {
                int arrayPos = (int) ((Math.random()*length));
                posHighestValue = posHighestValueArray[arrayPos];
                if(posHighestValueArray[arrayPos] == -1) {
                    posHighestValue = posHighestValueArray[arrayPos+1];
                }
            }
        
        
    }
    public void getHighest3Value() { // för låda 3
        
        bestValuePos3 = 0; 
        bestPos3 = 0; 
        
        int k = 0; 
        while(possibleOutcomes3_x[k] != -1) {
            k++; 
        }
        
        for(int i = 0; i < k; i++) {
            if(value3[i] > bestValuePos3) {
                bestValuePos3 = value3[i]; // för att for-loopen ska kunna fortsätta 
                bestPos3 = i; 
            }
            
        }
        
    }
}
class Comp extends Main {
    public void testComp() {
        
        lastPieceWasWhiteKing = false; 
        
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {};
        
        clearArrays();
        
        findMove();
        
        changePos();
        reloadBounds();
        repaint();
        
        whiteTurn = true;   
        
    }
    public void findMove() {
                
        findPossibleOutcomes("black");
        moveArrayPositionsTo(1);
        
        int length = 0; 
        while(possibleOutcomes1_x[length] != -1){
            length++;  
        } 
        for(int a = 0; a < length; a++)  {
            switchToPos(possibleOutcomes1_x[a], possibleOutcomes1_y[a], possibleOutcomes1_piece[a]);
            
            findPossibleOutcomes("white");
            
            posHighestValue = -1; 
            highestValue = -1; 
            for(int array = 0; array < posHighestValueArray.length; array++){
                posHighestValueArray[array] = -1; 
            }
            
            int length2 = 0; 
            while(possibleOutcomes_x[length2] != -1) {
                length2++; 
            }
            for(int b = 0; b < length2; b++) { // iteratea positioner för white. räkna värde för alla 
                
                switchToPos2(possibleOutcomes_x[b], possibleOutcomes_y[b], possibleOutcomes_piece[b]);
                
                getValue("white"); // värde för detta drag på brädet
                
                if(value > highestValue) {
                    for(int b2 = 0; b2 < posHighestValueArray.length; b2++) {
                        posHighestValueArray[b2] = -1; 
                    }
                    posHighestValueArray[0] = b; 
                    highestValue = value; 
                }
                else if(value == highestValue) {
                    int b3 = 0; 
                    while(posHighestValueArray[b3] != -1) {
                        b3++; 
                    }
                    posHighestValueArray[b3] = b; 
                }
                
                switchBackPiece2(possibleOutcomes_piece[b]);
                
            }
            
            int arraylength = 0; 
            while(posHighestValueArray[arraylength] != -1) {
                arraylength++; // antal drag som har högsta värde av alla
            }
            if(arraylength == 1) {
                posHighestValue = posHighestValueArray[0]; 
            }
            else {
                int arrayPos = (int) (Math.random()*arraylength); 
                posHighestValue = posHighestValueArray[arrayPos];
                if(posHighestValueArray[arrayPos] == -1) {
                    posHighestValue = posHighestValueArray[arrayPos+1];
                }
            }
            
            possibleOutcomes2_x[a] = possibleOutcomes_x[posHighestValue];
            possibleOutcomes2_y[a] = possibleOutcomes_y[posHighestValue];
            possibleOutcomes2_piece[a] = possibleOutcomes_piece[posHighestValue];
            
                switchToPos2(possibleOutcomes2_x[a], possibleOutcomes2_y[a], possibleOutcomes_piece[a]);

                findPossibleOutcomes("black");

                posHighestValue = -1; 
                highestValue = -1; 
                for(int array = 0; array < posHighestValueArray.length; array++){
                    posHighestValueArray[array] = -1; 
                }

                length2 = 0; 
                while(possibleOutcomes_x[length2] != -1) {
                    length2++; 
                }
                for(int c = 0; c < length2; c++) {
                    
                    switchToPos3(possibleOutcomes_x[c], possibleOutcomes_y[c], possibleOutcomes_piece[c]);
                    
                    getValue("black");
                    
                    if(value > highestValue) {
                        for(int c2 = 0; c2 < posHighestValueArray.length; c2++) {
                            posHighestValueArray[c2] = -1; 
                        }
                        posHighestValueArray[0] = c; 
                        highestValue = value; 
                    }
                    else if(value == highestValue) {
                        int c3 = 0; 
                        while(posHighestValueArray[c3] != -1) {
                            c3++; 
                        }
                        posHighestValueArray[c3] = c; 
                    }
                    
                    switchBackPiece3(possibleOutcomes_piece[c]);

                }
                
                arraylength = 0; 
                while(posHighestValueArray[arraylength] != -1) {
                    arraylength++; // antal drag som har högsta värde av alla
                }
                if(arraylength == 1) {
                    posHighestValue = posHighestValueArray[0]; 
                }
                else {
                    int arrayPos = (int) (Math.random()*arraylength); 
                    posHighestValue = posHighestValueArray[arrayPos];
                    if(posHighestValueArray[arrayPos] == -1) {
                        posHighestValue = posHighestValueArray[arrayPos+1];
                    }
                }

                possibleOutcomes3_x[a] = possibleOutcomes_x[posHighestValue];
                possibleOutcomes3_y[a] = possibleOutcomes_y[posHighestValue];
                possibleOutcomes3_piece[a] = possibleOutcomes_piece[posHighestValue];
                
                value3[a] = highestValue; 

                switchBackPiece2(possibleOutcomes2_piece[a]);
            
            switchBackPiece(possibleOutcomes1_piece[a]);
            
        }
        
        int valuepos = 0; 
        while(value3[valuepos] != -1) {
            valuepos++; 
        }
        bestValuePos3 = -1; 
        bestPos3 = -1; 
        for(int i = 0; i < bestValue3ArrayPos.length; i++) {
            bestValue3ArrayPos[i] = -1; 
        }
        
        for(int i = 0; i < valuepos; i++) {
            if(value3[i] > bestValuePos3) {
                for(int j = 0; j < bestValue3ArrayPos.length; j++) {
                    bestValue3ArrayPos[j] = -1; 
                }
                bestValue3ArrayPos[0] = i;
                bestValuePos3 = value3[i];
            }
            else if(value3[i] == bestValuePos3) {
                int j = 0;
                while(bestValue3ArrayPos[j] != -1) {
                    j++;
                }
                bestValue3ArrayPos[j] = i; 
            }
        }
        
        int arraylength = 0; 
        while(bestValue3ArrayPos[arraylength] != -1) {
            arraylength++; // antal drag som har högsta värde av alla
        }
        
        if(arraylength == 1) {
            bestMovePos = bestValue3ArrayPos[0]; 
        }
        else {
            int arrayPos = (int) (Math.random()*arraylength); 
            bestMovePos = bestValue3ArrayPos[arrayPos];
            if(bestValue3ArrayPos[arrayPos] == -1) {
                bestMovePos = bestValue3ArrayPos[arrayPos+1];
            }
        }
       
        bestPos3 = bestMovePos; 
        
        
    }
}
