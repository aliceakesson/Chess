
package Schack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.util.*;

public class Main extends Applet implements MouseListener, ActionListener, Runnable  {
    
    //schackbräde
    ChessBoard board; 
    //  public static int BOARD_WIDTH = 500;
    public static int CEL_WIDTH = 65; 
    public static int MARGIN_X = 50, MARGIN_Y = 50; 
    
    public static JLabel blackRook1, blackKnight1, blackBishop1, blackQueen, blackKing, blackBishop2, blackKnight2, blackRook2; 
    public static JLabel blackPawn1, blackPawn2, blackPawn3, blackPawn4, blackPawn5, blackPawn6, blackPawn7, blackPawn8;
    
    public static JLabel whiteRook1, whiteKnight1, whiteBishop1, whiteQueen, whiteKing, whiteBishop2, whiteKnight2, whiteRook2; 
    public static JLabel whitePawn1, whitePawn2, whitePawn3, whitePawn4, whitePawn5, whitePawn6, whitePawn7, whitePawn8;
    
    public final JLabel empty1 = new JLabel(), empty2 = new JLabel(), empty3 = new JLabel(), empty4 = new JLabel(), empty5 = new JLabel(), empty6 = new JLabel(), empty7 = new JLabel(), empty8 = new JLabel();
    public final JLabel empty9 = new JLabel(), empty10 = new JLabel(), empty11 = new JLabel(), empty12 = new JLabel(), empty13 = new JLabel(), empty14 = new JLabel(), empty15 = new JLabel(), empty16 = new JLabel();
    public final JLabel empty17 = new JLabel(), empty18 = new JLabel(), empty19 = new JLabel(), empty20 = new JLabel(), empty21 = new JLabel(), empty22 = new JLabel(), empty23 = new JLabel(), empty24 = new JLabel();
    public final JLabel empty25 = new JLabel(), empty26 = new JLabel(), empty27 = new JLabel(), empty28 = new JLabel(), empty29 = new JLabel(), empty30 = new JLabel(), empty31 = new JLabel(), empty32 = new JLabel();
    public final JLabel empty33 = new JLabel(), empty34 = new JLabel(), empty35 = new JLabel(), empty36 = new JLabel(), empty37 = new JLabel(), empty38 = new JLabel(), empty39 = new JLabel(), empty40 = new JLabel();
    public final JLabel empty41 = new JLabel(), empty42 = new JLabel(), empty43 = new JLabel(), empty44 = new JLabel(), empty45 = new JLabel(), empty46 = new JLabel(), empty47 = new JLabel(), empty48 = new JLabel();
    public final JLabel empty49 = new JLabel(), empty50 = new JLabel(), empty51 = new JLabel(), empty52 = new JLabel(), empty53 = new JLabel(), empty54 = new JLabel(), empty55 = new JLabel(), empty56 = new JLabel();
    public final JLabel empty57 = new JLabel(), empty58 = new JLabel(), empty59 = new JLabel(), empty60 = new JLabel(), empty61 = new JLabel(), empty62 = new JLabel(), empty63 = new JLabel(), empty64 = new JLabel();
    
    
    public final int empty1_x = MARGIN_X + CEL_WIDTH*0, empty1_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty2_x = MARGIN_X + CEL_WIDTH*1, empty2_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty3_x = MARGIN_X + CEL_WIDTH*2, empty3_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty4_x = MARGIN_X + CEL_WIDTH*3, empty4_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty5_x = MARGIN_X + CEL_WIDTH*4, empty5_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty6_x = MARGIN_X + CEL_WIDTH*5, empty6_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty7_x = MARGIN_X + CEL_WIDTH*6, empty7_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty8_x = MARGIN_X + CEL_WIDTH*7, empty8_y = MARGIN_Y + CEL_WIDTH*0;
    public final int empty9_x = MARGIN_X + CEL_WIDTH*0, empty9_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty10_x = MARGIN_X + CEL_WIDTH*1, empty10_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty11_x = MARGIN_X + CEL_WIDTH*2, empty11_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty12_x = MARGIN_X + CEL_WIDTH*3, empty12_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty13_x = MARGIN_X + CEL_WIDTH*4, empty13_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty14_x = MARGIN_X + CEL_WIDTH*5, empty14_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty15_x = MARGIN_X + CEL_WIDTH*6, empty15_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty16_x = MARGIN_X + CEL_WIDTH*7, empty16_y = MARGIN_Y + CEL_WIDTH*1;
    public final int empty17_x = MARGIN_X + CEL_WIDTH*0, empty17_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty18_x = MARGIN_X + CEL_WIDTH*1, empty18_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty19_x = MARGIN_X + CEL_WIDTH*2, empty19_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty20_x = MARGIN_X + CEL_WIDTH*3, empty20_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty21_x = MARGIN_X + CEL_WIDTH*4, empty21_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty22_x = MARGIN_X + CEL_WIDTH*5, empty22_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty23_x = MARGIN_X + CEL_WIDTH*6, empty23_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty24_x = MARGIN_X + CEL_WIDTH*7, empty24_y = MARGIN_Y + CEL_WIDTH*2;
    public final int empty25_x = MARGIN_X + CEL_WIDTH*0, empty25_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty26_x = MARGIN_X + CEL_WIDTH*1, empty26_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty27_x = MARGIN_X + CEL_WIDTH*2, empty27_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty28_x = MARGIN_X + CEL_WIDTH*3, empty28_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty29_x = MARGIN_X + CEL_WIDTH*4, empty29_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty30_x = MARGIN_X + CEL_WIDTH*5, empty30_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty31_x = MARGIN_X + CEL_WIDTH*6, empty31_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty32_x = MARGIN_X + CEL_WIDTH*7, empty32_y = MARGIN_Y + CEL_WIDTH*3;
    public final int empty33_x = MARGIN_X + CEL_WIDTH*0, empty33_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty34_x = MARGIN_X + CEL_WIDTH*1, empty34_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty35_x = MARGIN_X + CEL_WIDTH*2, empty35_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty36_x = MARGIN_X + CEL_WIDTH*3, empty36_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty37_x = MARGIN_X + CEL_WIDTH*4, empty37_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty38_x = MARGIN_X + CEL_WIDTH*5, empty38_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty39_x = MARGIN_X + CEL_WIDTH*6, empty39_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty40_x = MARGIN_X + CEL_WIDTH*7, empty40_y = MARGIN_Y + CEL_WIDTH*4;
    public final int empty41_x = MARGIN_X + CEL_WIDTH*0, empty41_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty42_x = MARGIN_X + CEL_WIDTH*1, empty42_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty43_x = MARGIN_X + CEL_WIDTH*2, empty43_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty44_x = MARGIN_X + CEL_WIDTH*3, empty44_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty45_x = MARGIN_X + CEL_WIDTH*4, empty45_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty46_x = MARGIN_X + CEL_WIDTH*5, empty46_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty47_x = MARGIN_X + CEL_WIDTH*6, empty47_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty48_x = MARGIN_X + CEL_WIDTH*7, empty48_y = MARGIN_Y + CEL_WIDTH*5;
    public final int empty49_x = MARGIN_X + CEL_WIDTH*0, empty49_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty50_x = MARGIN_X + CEL_WIDTH*1, empty50_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty51_x = MARGIN_X + CEL_WIDTH*2, empty51_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty52_x = MARGIN_X + CEL_WIDTH*3, empty52_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty53_x = MARGIN_X + CEL_WIDTH*4, empty53_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty54_x = MARGIN_X + CEL_WIDTH*5, empty54_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty55_x = MARGIN_X + CEL_WIDTH*6, empty55_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty56_x = MARGIN_X + CEL_WIDTH*7, empty56_y = MARGIN_Y + CEL_WIDTH*6;
    public final int empty57_x = MARGIN_X + CEL_WIDTH*0, empty57_y = MARGIN_Y + CEL_WIDTH*7;
    public final int empty58_x = MARGIN_X + CEL_WIDTH*1, empty58_y = MARGIN_Y + CEL_WIDTH*7;
    public final int empty59_x = MARGIN_X + CEL_WIDTH*2, empty59_y = MARGIN_Y + CEL_WIDTH*7;
    public final int empty60_x = MARGIN_X + CEL_WIDTH*3, empty60_y = MARGIN_Y + CEL_WIDTH*7;
    public final int empty61_x = MARGIN_X + CEL_WIDTH*4, empty61_y = MARGIN_Y + CEL_WIDTH*7;
    public final int empty62_x = MARGIN_X + CEL_WIDTH*5, empty62_y = MARGIN_Y + CEL_WIDTH*7;
    public final int empty63_x = MARGIN_X + CEL_WIDTH*6, empty63_y = MARGIN_Y + CEL_WIDTH*7;
    public final int empty64_x = MARGIN_X + CEL_WIDTH*7, empty64_y = MARGIN_Y + CEL_WIDTH*7;
    
    //OBS! POSITION ÄR ENLIGT KOORDINATEN FÖR VÄNSTRA ÖVRE HÖRNET
    
    public static int blackRook1_x = MARGIN_X, blackRook1_y = MARGIN_Y;
    public static int blackKnight1_x = MARGIN_X+CEL_WIDTH, blackKnight1_y = MARGIN_Y;
    public static int blackBishop1_x = MARGIN_X+CEL_WIDTH*2, blackBishop1_y = MARGIN_Y; 
    public static int blackQueen_x = MARGIN_X+CEL_WIDTH*3, blackQueen_y = MARGIN_Y; 
    public static int blackKing_x = MARGIN_X+CEL_WIDTH*4, blackKing_y = MARGIN_Y; 
    public static int blackBishop2_x = MARGIN_X+CEL_WIDTH*5, blackBishop2_y = MARGIN_Y; 
    public static int blackKnight2_x = MARGIN_X+CEL_WIDTH*6, blackKnight2_y = MARGIN_Y; 
    public static int blackRook2_x = MARGIN_X+CEL_WIDTH*7, blackRook2_y = MARGIN_Y; 
    
    public static int blackPawn1_x = MARGIN_X, blackPawn1_y = MARGIN_Y+CEL_WIDTH; 
    public static int blackPawn2_x = MARGIN_X+CEL_WIDTH, blackPawn2_y = MARGIN_Y+CEL_WIDTH;
    public static int blackPawn3_x = MARGIN_X+CEL_WIDTH*2, blackPawn3_y = MARGIN_Y+CEL_WIDTH;
    public static int blackPawn4_x = MARGIN_X+CEL_WIDTH*3, blackPawn4_y = MARGIN_Y+CEL_WIDTH;
    public static int blackPawn5_x = MARGIN_X+CEL_WIDTH*4, blackPawn5_y = MARGIN_Y+CEL_WIDTH;
    public static int blackPawn6_x = MARGIN_X+CEL_WIDTH*5, blackPawn6_y = MARGIN_Y+CEL_WIDTH;
    public static int blackPawn7_x = MARGIN_X+CEL_WIDTH*6, blackPawn7_y = MARGIN_Y+CEL_WIDTH;
    public static int blackPawn8_x = MARGIN_X+CEL_WIDTH*7, blackPawn8_y = MARGIN_Y+CEL_WIDTH;
    
    public static int whiteRook1_x = MARGIN_X, whiteRook1_y = MARGIN_Y+CEL_WIDTH*7;
    public static int whiteKnight1_x = MARGIN_X+CEL_WIDTH, whiteKnight1_y = MARGIN_Y+CEL_WIDTH*7;
    public static int whiteBishop1_x = MARGIN_X+CEL_WIDTH*2, whiteBishop1_y = MARGIN_Y+CEL_WIDTH*7; 
    public static int whiteQueen_x = MARGIN_X+CEL_WIDTH*3, whiteQueen_y = MARGIN_Y+CEL_WIDTH*7; 
    public static int whiteKing_x = MARGIN_X+CEL_WIDTH*4, whiteKing_y = MARGIN_Y+CEL_WIDTH*7; 
    public static int whiteBishop2_x = MARGIN_X+CEL_WIDTH*5, whiteBishop2_y = MARGIN_Y+CEL_WIDTH*7; 
    public static int whiteKnight2_x = MARGIN_X+CEL_WIDTH*6, whiteKnight2_y = MARGIN_Y+CEL_WIDTH*7; 
    public static int whiteRook2_x = MARGIN_X+CEL_WIDTH*7, whiteRook2_y = MARGIN_Y+CEL_WIDTH*7; 
    
    public static int whitePawn1_x = MARGIN_X, whitePawn1_y = MARGIN_Y+CEL_WIDTH*6; 
    public static int whitePawn2_x = MARGIN_X+CEL_WIDTH, whitePawn2_y = MARGIN_Y+CEL_WIDTH*6;
    public static int whitePawn3_x = MARGIN_X+CEL_WIDTH*2, whitePawn3_y = MARGIN_Y+CEL_WIDTH*6;
    public static int whitePawn4_x = MARGIN_X+CEL_WIDTH*3, whitePawn4_y = MARGIN_Y+CEL_WIDTH*6;
    public static int whitePawn5_x = MARGIN_X+CEL_WIDTH*4, whitePawn5_y = MARGIN_Y+CEL_WIDTH*6;
    public static int whitePawn6_x = MARGIN_X+CEL_WIDTH*5, whitePawn6_y = MARGIN_Y+CEL_WIDTH*6;
    public static int whitePawn7_x = MARGIN_X+CEL_WIDTH*6, whitePawn7_y = MARGIN_Y+CEL_WIDTH*6;
    public static int whitePawn8_x = MARGIN_X+CEL_WIDTH*7, whitePawn8_y = MARGIN_Y+CEL_WIDTH*6;
    
    final String imagePos = "../src/Schack/Bilder/";
    
    ImageIcon imageIcon;
    Image img, newImg;
    
    boolean firstMove_Pawn1 = true;
    boolean firstMove_Pawn2 = true;
    boolean firstMove_Pawn3 = true;
    boolean firstMove_Pawn4 = true;
    boolean firstMove_Pawn5 = true;
    boolean firstMove_Pawn6 = true;
    boolean firstMove_Pawn7 = true;
    boolean firstMove_Pawn8 = true;
    
    int [] possibleX = new int[28]; //totala möjliga x-positioner
    int [] possibleY = new int[28]; //totala möjliga y-positioner
    int [] killX = new int[28]; 
    int [] killY = new int[28];
    
    
    String lastClick; 
    
    Color green = new Color(64, 219, 105, 95); 
    Color red = Color.red;
    
    boolean firstMove = true;
    int xPos = 0; 
    int yPos = 0; 
    
    int blackKillCount_col = 0; 
    int blackKillCount_row = 0; 
    int whiteKillCount_col = 0; 
    int whiteKillCount_row = 4; 
    
    int MARGIN_KILL_COUNT = 50; 

    boolean whiteTurn = true; 
    boolean gameOver = false; 
    boolean youWin = false; 
    boolean youLose = false; 
    
    //comp
    final int MAX_OUTCOMES = 74; 
    final int MAX_XPOS = MARGIN_X + CEL_WIDTH*7; 
    
    int possibleOutcomes_x [] = new int[MAX_OUTCOMES];
    int possibleOutcomes_y [] = new int[MAX_OUTCOMES];
   
    int possibleOutcomes1_x [] = new int[MAX_OUTCOMES];
    int possibleOutcomes1_y [] = new int[MAX_OUTCOMES];
    
    int possibleOutcomes2_x [] = new int[MAX_OUTCOMES];
    int possibleOutcomes2_y [] = new int[MAX_OUTCOMES];
    
    int possibleOutcomes3_x [] = new int[MAX_OUTCOMES];
    int possibleOutcomes3_y [] = new int[MAX_OUTCOMES];
    
    JLabel possibleOutcomes_piece [] = new JLabel[MAX_OUTCOMES];
    
    JLabel possibleOutcomes1_piece [] = new JLabel[MAX_OUTCOMES];
    JLabel possibleOutcomes2_piece [] = new JLabel[MAX_OUTCOMES];
    JLabel possibleOutcomes3_piece [] = new JLabel[MAX_OUTCOMES];
        
    int safePos; // första lediga array pos
    
    int value = 0; 
    
    final int valuePawn = 1, valueRook = 2, valueKnight = 3, valueBishop = 3, valueQueen = 5; 
    
    int value3[] = new int[MAX_OUTCOMES];
    
    int calcValue = 0; 
    int highestValue = 0;
    int posHighestValue = 0; 
    
    int[] posHighestValueArray = new int[MAX_OUTCOMES];
    
    int bestValue3ArrayPos[] = new int[MAX_OUTCOMES];
    int bestValuePos3 = 0; 
    int bestPos3 = 0; //bästa värde för ett drag i låda 3. också samma array pos som låda 1 och 2 
    
    int tempX = 0, tempY = 0; 
    int tempX2 = 0, tempY2 = 0; 
    int tempX3 = 0, tempY3 = 0; 
    
    JLabel none = new JLabel();
    
    int posCount = 0; 
    
    boolean firstMove_BlackPawn1 = true; 
    boolean firstMove_BlackPawn2 = true; 
    boolean firstMove_BlackPawn3 = true; 
    boolean firstMove_BlackPawn4 = true; 
    boolean firstMove_BlackPawn5 = true; 
    boolean firstMove_BlackPawn6 = true; 
    boolean firstMove_BlackPawn7 = true; 
    boolean firstMove_BlackPawn8 = true; 
    
    Random random = new Random();
    int m = random.nextInt(posHighestValueArray.length);
    
    boolean isTakenCel = false;
    
    String vertical = "";
    String horizontal = "";
    String pieceString = "";
    String kill = "";
    
    boolean lastWhiteWasPawn = false; 
    boolean lastWhiteWasKill = false; 
    
    int moveCount = 1; 
    
    boolean whiteKingFirstMove = true; 
    boolean blackKingFirstMove = true; 
    
    boolean whiteRook1FirstMove = true; 
    boolean whiteRook2FirstMove = true; 
    boolean blackRook1FirstMove = true; 
    boolean blackRook2FirstMove = true; 
    
    boolean lastPieceWasWhiteKing = false; 
    boolean lastPieceWasBlackKing = false; 
    boolean queenCastle = false; 
    
    int bestMovePos = -1; 
    
    boolean singleplayer = true; 
    boolean multiplayer = true; 
        
    public static JLabel whiteQueenPro, whiteKnightPro, whiteRookPro, whiteBishopPro; 
    public static JLabel blackQueenPro, blackKnightPro, blackRookPro, blackBishopPro; 
    
    public static int whiteQueenPro_y = MARGIN_Y, whiteKnightPro_y = MARGIN_Y + CEL_WIDTH, whiteRookPro_y = MARGIN_Y + CEL_WIDTH*2, whiteBishopPro_y = MARGIN_Y + CEL_WIDTH*3;
    public static int blackQueenPro_y = MARGIN_Y + CEL_WIDTH*7, blackKnightPro_y = MARGIN_Y + CEL_WIDTH*6, blackRookPro_y = MARGIN_Y + CEL_WIDTH*5, blackBishopPro_y = MARGIN_Y + CEL_WIDTH*4; 
            
    public static int whitePro_x = MARGIN_X; 
    public static int blackPro_x = MARGIN_X; 
    
    public static int whiteProBgWidth = 0; 
    public static int blackProBgWidth = 0; 
    
    public final Color proBgColor = Color.white; 
    
    public static int whitePawn1_PieceCount = 1; 
    public static int whitePawn2_PieceCount = 1;
    public static int whitePawn3_PieceCount = 1;
    public static int whitePawn4_PieceCount = 1;
    public static int whitePawn5_PieceCount = 1;
    public static int whitePawn6_PieceCount = 1;
    public static int whitePawn7_PieceCount = 1;
    public static int whitePawn8_PieceCount = 1;
    
    public static int blackPawn1_PieceCount = 1; 
    public static int blackPawn2_PieceCount = 1;
    public static int blackPawn3_PieceCount = 1;
    public static int blackPawn4_PieceCount = 1;
    public static int blackPawn5_PieceCount = 1;
    public static int blackPawn6_PieceCount = 1;
    public static int blackPawn7_PieceCount = 1;
    public static int blackPawn8_PieceCount = 1;
    
    public static int pieceCount = 0; 
    
    /*
    pawn = 1
    rook = 2 
    knight = 3
    bishop = 4
    queen = 5
    king = 6
    */
    
    boolean justKilled = false; 
    String promotion = ""; 
    
    boolean whitePawn1_doubleMove = false; 
    boolean whitePawn2_doubleMove = false; 
    boolean whitePawn3_doubleMove = false; 
    boolean whitePawn4_doubleMove = false; 
    boolean whitePawn5_doubleMove = false; 
    boolean whitePawn6_doubleMove = false; 
    boolean whitePawn7_doubleMove = false; 
    boolean whitePawn8_doubleMove = false; 
    
    boolean blackPawn1_doubleMove = false; 
    boolean blackPawn2_doubleMove = false; 
    boolean blackPawn3_doubleMove = false; 
    boolean blackPawn4_doubleMove = false; 
    boolean blackPawn5_doubleMove = false; 
    boolean blackPawn6_doubleMove = false; 
    boolean blackPawn7_doubleMove = false; 
    boolean blackPawn8_doubleMove = false; 
    
    JLabel enPassantKill = new JLabel(); 
    
    public final int textX = MARGIN_X + CEL_WIDTH; 
    public final int textY = MARGIN_Y + CEL_WIDTH*3;
    public final int textWidth = CEL_WIDTH*6;
    public final int textHeight = CEL_WIDTH*2; 
    
    public static int menuWidth = CEL_WIDTH*6;
    String menuText = "Schack";
    Button single = new Button("1 spelare");
    Button multi = new Button("2 spelare");
    
    boolean blackTurn = false; 
    
    String turn = "";
    
    int killOpponentPiece = 0; 
    
    int rookKillValue = 20; 
    int knightKillValue = 30; 
    int bishopKillValue = 30;
    int queenKillValue = 50; 
    int pawnKillValue = 15; 
    int kingKillValue = 1000; 
    
    public void init() //initiering av alla pjäser + schackbräde + tomma celler 
    {
  
        setLayout(null);

        this.setSize(600, 600);
                
        board = new ChessBoard(MARGIN_X, MARGIN_Y, CEL_WIDTH);
        
        add(single);
        add(multi);
        
        single.addActionListener(this);
        multi.addActionListener(this);
        
        single.setBounds(textX + textWidth/6, textY + (textHeight/3)*2, 100, 30);
        multi.setBounds(textX + textWidth/6 + 100 + 50, textY + (textHeight/3)*2, 100, 30);
       
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackRook.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackRook1 = new JLabel(imageIcon);
        blackRook1.setBounds(blackRook1_x, blackRook1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackKnight.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackKnight1 = new JLabel(imageIcon);
        blackKnight1.setBounds(blackKnight1_x, blackKnight1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackBishop.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackBishop1 = new JLabel(imageIcon);
        blackBishop1.setBounds(blackBishop1_x, blackBishop1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackQueen.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackQueen = new JLabel(imageIcon);
        blackQueen.setBounds(blackQueen_x, blackQueen_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackKing.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackKing = new JLabel(imageIcon);
        blackKing.setBounds(blackKing_x, blackKing_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackBishop.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackBishop2 = new JLabel(imageIcon);
        blackBishop2.setBounds(blackBishop2_x, blackBishop2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackKnight.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackKnight2 = new JLabel(imageIcon);
        blackKnight2.setBounds(blackKnight2_x, blackKnight2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackRook.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackRook2 = new JLabel(imageIcon);
        blackRook2.setBounds(blackRook2_x, blackRook2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn1 = new JLabel(imageIcon);
        blackPawn1.setBounds(blackPawn1_x, blackPawn1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn2 = new JLabel(imageIcon);
        blackPawn2.setBounds(blackPawn2_x, blackPawn2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn3 = new JLabel(imageIcon);
        blackPawn3.setBounds(blackPawn3_x, blackPawn3_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn4 = new JLabel(imageIcon);
        blackPawn4.setBounds(blackPawn4_x, blackPawn4_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn5 = new JLabel(imageIcon);
        blackPawn5.setBounds(blackPawn5_x, blackPawn5_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn6 = new JLabel(imageIcon);
        blackPawn6.setBounds(blackPawn6_x, blackPawn6_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn7 = new JLabel(imageIcon);
        blackPawn7.setBounds(blackPawn7_x, blackPawn7_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackPawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackPawn8 = new JLabel(imageIcon);
        blackPawn8.setBounds(blackPawn8_x, blackPawn8_y, CEL_WIDTH, CEL_WIDTH);
        
        add(blackRook1);
        add(blackKnight1);
        add(blackBishop1);
        add(blackQueen);
        add(blackKing);
        add(blackBishop2);
        add(blackKnight2);
        add(blackRook2);
        add(blackPawn1);
        add(blackPawn2);
        add(blackPawn3);
        add(blackPawn4);
        add(blackPawn5);
        add(blackPawn6);
        add(blackPawn7);
        add(blackPawn8);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteRook.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteRook1 = new JLabel(imageIcon);
        whiteRook1.setBounds(whiteRook1_x, whiteRook1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteKnight.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteKnight1 = new JLabel(imageIcon);
        whiteKnight1.setBounds(whiteKnight1_x, whiteKnight1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteBishop.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteBishop1 = new JLabel(imageIcon);
        whiteBishop1.setBounds(whiteBishop1_x, whiteBishop1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteQueen.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteQueen = new JLabel(imageIcon);
        whiteQueen.setBounds(whiteQueen_x, whiteQueen_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteKing.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteKing = new JLabel(imageIcon);
        whiteKing.setBounds(whiteKing_x, whiteKing_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteBishop.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteBishop2 = new JLabel(imageIcon);
        whiteBishop2.setBounds(whiteBishop2_x, whiteBishop2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteKnight.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteKnight2 = new JLabel(imageIcon);
        whiteKnight2.setBounds(whiteKnight2_x, whiteKnight2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteRook.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteRook2 = new JLabel(imageIcon);
        whiteRook2.setBounds(whiteRook2_x, whiteRook2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn1 = new JLabel(imageIcon);
        whitePawn1.setBounds(whitePawn1_x, whitePawn1_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn2 = new JLabel(imageIcon);
        whitePawn2.setBounds(whitePawn2_x, whitePawn2_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn3 = new JLabel(imageIcon);
        whitePawn3.setBounds(whitePawn3_x, whitePawn3_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn4 = new JLabel(imageIcon);
        whitePawn4.setBounds(whitePawn4_x, whitePawn4_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn5 = new JLabel(imageIcon);
        whitePawn5.setBounds(whitePawn5_x, whitePawn5_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn6 = new JLabel(imageIcon);
        whitePawn6.setBounds(whitePawn6_x, whitePawn6_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn7 = new JLabel(imageIcon);
        whitePawn7.setBounds(whitePawn7_x, whitePawn7_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whitePawn.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whitePawn8 = new JLabel(imageIcon);
        whitePawn8.setBounds(whitePawn8_x, whitePawn8_y, CEL_WIDTH, CEL_WIDTH);
        
        add(whiteRook1);
        add(whiteKnight1);
        add(whiteBishop1);
        add(whiteQueen);
        add(whiteKing);
        add(whiteBishop2);
        add(whiteKnight2);
        add(whiteRook2);
        add(whitePawn1);
        add(whitePawn2);
        add(whitePawn3);
        add(whitePawn4);
        add(whitePawn5);
        add(whitePawn6);
        add(whitePawn7);
        add(whitePawn8);
        
        whiteRook1.addMouseListener(this);
        whiteKnight1.addMouseListener(this);
        whiteBishop1.addMouseListener(this);
        whiteQueen.addMouseListener(this);
        whiteKing.addMouseListener(this);
        whiteBishop2.addMouseListener(this);
        whiteKnight2.addMouseListener(this);
        whiteRook2.addMouseListener(this);
        whitePawn1.addMouseListener(this);
        whitePawn2.addMouseListener(this);
        whitePawn3.addMouseListener(this);
        whitePawn4.addMouseListener(this);
        whitePawn5.addMouseListener(this);
        whitePawn6.addMouseListener(this);
        whitePawn7.addMouseListener(this);
        whitePawn8.addMouseListener(this);
        
        blackRook1.addMouseListener(this);
        blackKnight1.addMouseListener(this);
        blackBishop1.addMouseListener(this);
        blackQueen.addMouseListener(this);
        blackKing.addMouseListener(this);
        blackBishop2.addMouseListener(this);
        blackKnight2.addMouseListener(this);
        blackRook2.addMouseListener(this);
        blackPawn1.addMouseListener(this);
        blackPawn2.addMouseListener(this);
        blackPawn3.addMouseListener(this);
        blackPawn4.addMouseListener(this);
        blackPawn5.addMouseListener(this);
        blackPawn6.addMouseListener(this);
        blackPawn7.addMouseListener(this);
        blackPawn8.addMouseListener(this);
        
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
        
       
        empty1.setBounds(empty1_x, empty1_y, CEL_WIDTH, CEL_WIDTH);
        empty2.setBounds(empty2_x, empty2_y, CEL_WIDTH, CEL_WIDTH);
        empty3.setBounds(empty3_x, empty3_y, CEL_WIDTH, CEL_WIDTH);
        empty4.setBounds(empty4_x, empty4_y, CEL_WIDTH, CEL_WIDTH);
        empty5.setBounds(empty5_x, empty5_y, CEL_WIDTH, CEL_WIDTH);
        empty6.setBounds(empty6_x, empty6_y, CEL_WIDTH, CEL_WIDTH);
        empty7.setBounds(empty7_x, empty7_y, CEL_WIDTH, CEL_WIDTH);
        empty8.setBounds(empty8_x, empty8_y, CEL_WIDTH, CEL_WIDTH);
        empty9.setBounds(empty9_x, empty9_y, CEL_WIDTH, CEL_WIDTH);
        empty10.setBounds(empty10_x, empty10_y, CEL_WIDTH, CEL_WIDTH);
        empty11.setBounds(empty11_x, empty11_y, CEL_WIDTH, CEL_WIDTH);
        empty12.setBounds(empty12_x, empty12_y, CEL_WIDTH, CEL_WIDTH);
        empty13.setBounds(empty13_x, empty13_y, CEL_WIDTH, CEL_WIDTH);
        empty14.setBounds(empty14_x, empty14_y, CEL_WIDTH, CEL_WIDTH);
        empty15.setBounds(empty15_x, empty15_y, CEL_WIDTH, CEL_WIDTH);
        empty16.setBounds(empty16_x, empty16_y, CEL_WIDTH, CEL_WIDTH);
        empty17.setBounds(empty17_x, empty17_y, CEL_WIDTH, CEL_WIDTH);
        empty18.setBounds(empty18_x, empty18_y, CEL_WIDTH, CEL_WIDTH);
        empty19.setBounds(empty19_x, empty19_y, CEL_WIDTH, CEL_WIDTH);
        empty20.setBounds(empty20_x, empty20_y, CEL_WIDTH, CEL_WIDTH);
        empty21.setBounds(empty21_x, empty21_y, CEL_WIDTH, CEL_WIDTH);
        empty22.setBounds(empty22_x, empty22_y, CEL_WIDTH, CEL_WIDTH);
        empty23.setBounds(empty23_x, empty23_y, CEL_WIDTH, CEL_WIDTH);
        empty24.setBounds(empty24_x, empty24_y, CEL_WIDTH, CEL_WIDTH);
        empty25.setBounds(empty25_x, empty25_y, CEL_WIDTH, CEL_WIDTH);
        empty26.setBounds(empty26_x, empty26_y, CEL_WIDTH, CEL_WIDTH);
        empty27.setBounds(empty27_x, empty27_y, CEL_WIDTH, CEL_WIDTH);
        empty28.setBounds(empty28_x, empty28_y, CEL_WIDTH, CEL_WIDTH);
        empty29.setBounds(empty29_x, empty29_y, CEL_WIDTH, CEL_WIDTH);
        empty30.setBounds(empty30_x, empty30_y, CEL_WIDTH, CEL_WIDTH);
        empty31.setBounds(empty31_x, empty31_y, CEL_WIDTH, CEL_WIDTH);
        empty32.setBounds(empty32_x, empty32_y, CEL_WIDTH, CEL_WIDTH);
        empty33.setBounds(empty33_x, empty33_y, CEL_WIDTH, CEL_WIDTH);
        empty34.setBounds(empty34_x, empty34_y, CEL_WIDTH, CEL_WIDTH);
        empty35.setBounds(empty35_x, empty35_y, CEL_WIDTH, CEL_WIDTH);
        empty36.setBounds(empty36_x, empty36_y, CEL_WIDTH, CEL_WIDTH);
        empty37.setBounds(empty37_x, empty37_y, CEL_WIDTH, CEL_WIDTH);
        empty38.setBounds(empty38_x, empty38_y, CEL_WIDTH, CEL_WIDTH);
        empty39.setBounds(empty39_x, empty39_y, CEL_WIDTH, CEL_WIDTH);
        empty40.setBounds(empty40_x, empty40_y, CEL_WIDTH, CEL_WIDTH);
        empty41.setBounds(empty41_x, empty41_y, CEL_WIDTH, CEL_WIDTH);
        empty42.setBounds(empty42_x, empty42_y, CEL_WIDTH, CEL_WIDTH);
        empty43.setBounds(empty43_x, empty43_y, CEL_WIDTH, CEL_WIDTH);
        empty44.setBounds(empty44_x, empty44_y, CEL_WIDTH, CEL_WIDTH);
        empty45.setBounds(empty45_x, empty45_y, CEL_WIDTH, CEL_WIDTH);
        empty46.setBounds(empty46_x, empty46_y, CEL_WIDTH, CEL_WIDTH);
        empty47.setBounds(empty47_x, empty47_y, CEL_WIDTH, CEL_WIDTH);
        empty48.setBounds(empty48_x, empty48_y, CEL_WIDTH, CEL_WIDTH);
        empty49.setBounds(empty49_x, empty49_y, CEL_WIDTH, CEL_WIDTH);
        empty50.setBounds(empty50_x, empty50_y, CEL_WIDTH, CEL_WIDTH);
        empty51.setBounds(empty51_x, empty51_y, CEL_WIDTH, CEL_WIDTH);
        empty52.setBounds(empty52_x, empty52_y, CEL_WIDTH, CEL_WIDTH);
        empty53.setBounds(empty53_x, empty53_y, CEL_WIDTH, CEL_WIDTH);
        empty54.setBounds(empty54_x, empty54_y, CEL_WIDTH, CEL_WIDTH);
        empty55.setBounds(empty55_x, empty55_y, CEL_WIDTH, CEL_WIDTH);
        empty56.setBounds(empty56_x, empty56_y, CEL_WIDTH, CEL_WIDTH);
        empty57.setBounds(empty57_x, empty57_y, CEL_WIDTH, CEL_WIDTH);
        empty58.setBounds(empty58_x, empty58_y, CEL_WIDTH, CEL_WIDTH);
        empty59.setBounds(empty59_x, empty59_y, CEL_WIDTH, CEL_WIDTH);
        empty60.setBounds(empty60_x, empty60_y, CEL_WIDTH, CEL_WIDTH);
        empty61.setBounds(empty61_x, empty61_y, CEL_WIDTH, CEL_WIDTH);
        empty62.setBounds(empty62_x, empty62_y, CEL_WIDTH, CEL_WIDTH);
        empty63.setBounds(empty63_x, empty63_y, CEL_WIDTH, CEL_WIDTH);
        empty64.setBounds(empty64_x, empty64_y, CEL_WIDTH, CEL_WIDTH);
        
        add(empty1);
        add(empty2);
        add(empty3);
        add(empty4);
        add(empty5);
        add(empty6);
        add(empty7);
        add(empty8);
        add(empty9);
        add(empty10);
        add(empty11);
        add(empty12);
        add(empty13);
        add(empty14);
        add(empty15);
        add(empty16);
        add(empty17);
        add(empty18);
        add(empty19);
        add(empty20);
        add(empty21);
        add(empty22);
        add(empty23);
        add(empty24);
        add(empty25);
        add(empty26);
        add(empty27);
        add(empty28);
        add(empty29);
        add(empty30);
        add(empty31);
        add(empty32);
        add(empty33);
        add(empty34);
        add(empty35);
        add(empty36);
        add(empty37);
        add(empty38);
        add(empty39);
        add(empty40);
        add(empty41);
        add(empty42);
        add(empty43);
        add(empty44);
        add(empty45);
        add(empty46);
        add(empty47);
        add(empty48);
        add(empty49);
        add(empty50);
        add(empty51);
        add(empty52);
        add(empty53);
        add(empty54);
        add(empty55);
        add(empty56);
        add(empty57);
        add(empty58);
        add(empty59);
        add(empty60);
        add(empty61);
        add(empty62);
        add(empty63);
        add(empty64);
        
        empty1.addMouseListener(this);
        empty2.addMouseListener(this);
        empty3.addMouseListener(this);
        empty4.addMouseListener(this);
        empty5.addMouseListener(this);
        empty6.addMouseListener(this);
        empty7.addMouseListener(this);
        empty8.addMouseListener(this);
        empty9.addMouseListener(this);
        empty10.addMouseListener(this);
        empty11.addMouseListener(this);
        empty12.addMouseListener(this);
        empty13.addMouseListener(this);
        empty14.addMouseListener(this);
        empty15.addMouseListener(this);
        empty16.addMouseListener(this);
        empty17.addMouseListener(this);
        empty18.addMouseListener(this);
        empty19.addMouseListener(this);
        empty20.addMouseListener(this);
        empty21.addMouseListener(this);
        empty22.addMouseListener(this);
        empty23.addMouseListener(this);
        empty24.addMouseListener(this);
        empty25.addMouseListener(this);
        empty26.addMouseListener(this);
        empty27.addMouseListener(this);
        empty28.addMouseListener(this);
        empty29.addMouseListener(this);
        empty30.addMouseListener(this);
        empty31.addMouseListener(this);
        empty32.addMouseListener(this);
        empty33.addMouseListener(this);
        empty34.addMouseListener(this);
        empty35.addMouseListener(this);
        empty36.addMouseListener(this);
        empty37.addMouseListener(this);
        empty38.addMouseListener(this);
        empty39.addMouseListener(this);
        empty40.addMouseListener(this);
        empty41.addMouseListener(this);
        empty42.addMouseListener(this);
        empty43.addMouseListener(this);
        empty44.addMouseListener(this);
        empty45.addMouseListener(this);
        empty46.addMouseListener(this);
        empty47.addMouseListener(this);
        empty48.addMouseListener(this);
        empty49.addMouseListener(this);
        empty50.addMouseListener(this);
        empty51.addMouseListener(this);
        empty52.addMouseListener(this);
        empty53.addMouseListener(this);
        empty54.addMouseListener(this);
        empty55.addMouseListener(this);
        empty56.addMouseListener(this);
        empty57.addMouseListener(this);
        empty58.addMouseListener(this);
        empty59.addMouseListener(this);
        empty60.addMouseListener(this);
        empty61.addMouseListener(this);
        empty62.addMouseListener(this);
        empty63.addMouseListener(this);
        empty64.addMouseListener(this);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteQueen.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteQueenPro = new JLabel(imageIcon);
        whiteQueenPro.setBounds(whitePro_x, whiteQueenPro_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteKnight.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteKnightPro = new JLabel(imageIcon);
        whiteKnightPro.setBounds(whitePro_x, whiteKnightPro_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteRook.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteRookPro = new JLabel(imageIcon);
        whiteRookPro.setBounds(whitePro_x, whiteRookPro_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "whiteBishop.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        whiteBishopPro = new JLabel(imageIcon);
        whiteBishopPro.setBounds(whitePro_x, whiteBishopPro_y, CEL_WIDTH, CEL_WIDTH);
        
        add(whiteQueenPro);
        add(whiteKnightPro);
        add(whiteRookPro);
        add(whiteBishopPro);
        
        whiteQueenPro.addMouseListener(this);
        whiteKnightPro.addMouseListener(this);
        whiteRookPro.addMouseListener(this);
        whiteBishopPro.addMouseListener(this);
        
        whiteQueenPro.setVisible(false);
        whiteKnightPro.setVisible(false);
        whiteRookPro.setVisible(false);
        whiteBishopPro.setVisible(false);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackQueen.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackQueenPro = new JLabel(imageIcon);
        blackQueenPro.setBounds(blackPro_x, blackQueenPro_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackKnight.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackKnightPro = new JLabel(imageIcon);
        blackKnightPro.setBounds(blackPro_x, blackKnightPro_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackRook.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackRookPro = new JLabel(imageIcon);
        blackRookPro.setBounds(blackPro_x, blackRookPro_y, CEL_WIDTH, CEL_WIDTH);
        
        imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + "blackBishop.png")); 
        img = imageIcon.getImage();
        newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newImg); 
        blackBishopPro = new JLabel(imageIcon);
        blackBishopPro.setBounds(blackPro_x, blackBishopPro_y, CEL_WIDTH, CEL_WIDTH);
        
        add(blackQueenPro);
        add(blackKnightPro);
        add(blackRookPro);
        add(blackBishopPro);
        
        blackQueenPro.addMouseListener(this);
        blackKnightPro.addMouseListener(this);
        blackRookPro.addMouseListener(this);
        blackBishopPro.addMouseListener(this);
        
        blackQueenPro.setVisible(false);
        blackKnightPro.setVisible(false);
        blackRookPro.setVisible(false);
        blackBishopPro.setVisible(false);
        
        this.setComponentZOrder(whiteQueenPro, 5);
        this.setComponentZOrder(whiteKnightPro, 5);
        this.setComponentZOrder(whiteRookPro, 5);
        this.setComponentZOrder(whiteBishopPro, 5);
         
        clearColorEmpty();
        
    }
    
    
    @Override
    public void paint(Graphics g) {
        
        //schackbräde 
        board.ritaChessBoard(g);
        
        g.setColor(Color.white);
        g.fillRoundRect(textX, textY, menuWidth, textHeight, 30, 30);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString(menuText, (int)(MARGIN_X + CEL_WIDTH*2 + CEL_WIDTH/2), (int)(MARGIN_Y + CEL_WIDTH*4));
        
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString(turn, MARGIN_X + CEL_WIDTH*4 - CEL_WIDTH/3, MARGIN_Y/2);
        
        if(youWin) {
            g.setColor(Color.white);
            g.fillRoundRect(textX, textY, textWidth, textHeight, 30, 30);
            g.setColor(Color.black);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("Du vann", (int)(MARGIN_X + CEL_WIDTH*2 + CEL_WIDTH/2), (int)(MARGIN_Y + CEL_WIDTH*4));
        }
        
        if(youLose) {
            g.setColor(Color.white);
            g.fillRoundRect(textX, textY, textWidth, textHeight, 30, 30);
            g.setColor(Color.black);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("Du förlorade", (int)(MARGIN_X + CEL_WIDTH*2 + CEL_WIDTH/2), (int)(MARGIN_Y + CEL_WIDTH*4));
        }
        
        g.setColor(proBgColor);
        g.fillRoundRect(whitePro_x, MARGIN_Y, whiteProBgWidth, CEL_WIDTH*4, 10, 10);
        g.fillRoundRect(blackPro_x, MARGIN_Y + CEL_WIDTH*4, blackProBgWidth, CEL_WIDTH*4, 10, 10);
        
        super.paint(g);
        
        
    }
    public void start() {
        
        Thread ny = new Thread( this);
        ny.start();
        
        turn = "";
        
    }
    public void run() {
        while(gameOver == false) {
            if(singleplayer) {
                if(whiteTurn == false) {
                    compMove();
                }
            }
            else if(multiplayer) {
                if(whiteTurn == false) {
                    blackTurn = true;
                    turn = "Svarts tur";
                }
                if(blackTurn == false) {
                    whiteTurn = true; 
                    turn = "Vits tur";
                }
            }
        }
    }
    
    public boolean checkAvailability(int x, int y) {
        boolean isAvailable = true; 
        
        if((blackRook1_x == x && blackRook1_y == y) || (blackKnight1_x == x && blackKnight1_y == y) 
                || (blackBishop1_x == x && blackBishop1_y == y) || (blackQueen_x == x && blackQueen_y == y)
                || (blackKing_x == x && blackKing_y == y) || (blackBishop2_x == x && blackBishop2_y == y)
                || (blackKnight2_x == x && blackKnight2_y == y) || (blackRook2_x == x && blackRook2_y == y)
                || (blackPawn1_x == x && blackPawn1_y == y) || (blackPawn2_x == x && blackPawn2_y == y)
                || (blackPawn3_x == x && blackPawn3_y == y) || (blackPawn4_x == x && blackPawn4_y == y)
                || (blackPawn5_x == x && blackPawn5_y == y) || (blackPawn6_x == x && blackPawn6_y == y)
                || (blackPawn7_x == x && blackPawn7_y == y) || (blackPawn8_x == x && blackPawn8_y == y)) {
            isAvailable = false; 
        }
        else if((whiteRook1_x == x && whiteRook1_y == y) || (whiteKnight1_x == x && whiteKnight1_y == y) 
                || (whiteBishop1_x == x && whiteBishop1_y == y) || (whiteQueen_x == x && whiteQueen_y == y)
                || (whiteKing_x == x && whiteKing_y == y) || (whiteBishop2_x == x && whiteBishop2_y == y)
                || (whiteKnight2_x == x && whiteKnight2_y == y) || (whiteRook2_x == x && whiteRook2_y == y)
                || (whitePawn1_x == x && whitePawn1_y == y) || (whitePawn2_x == x && whitePawn2_y == y)
                || (whitePawn3_x == x && whitePawn3_y == y) || (whitePawn4_x == x && whitePawn4_y == y)
                || (whitePawn5_x == x && whitePawn5_y == y) || (whitePawn6_x == x && whitePawn6_y == y)
                || (whitePawn7_x == x && whitePawn7_y == y) || (whitePawn8_x == x && whitePawn8_y == y)) {
            isAvailable = false; 
        }
        else if ((x > MARGIN_X + CEL_WIDTH*7) || (y > MARGIN_Y + CEL_WIDTH*7) || x < MARGIN_X || y < MARGIN_Y) {
            isAvailable = false; 
        }
        
        if(isAvailable)
            return true; 
        else 
            return false; 
    }
    public void makeGreen(int x, int y) {
        
        empty1.setBackground(green);
        empty2.setBackground(green);
        empty3.setBackground(green);
        empty4.setBackground(green);
        empty5.setBackground(green);
        empty6.setBackground(green);
        empty7.setBackground(green);
        empty8.setBackground(green);
        empty9.setBackground(green);
        empty10.setBackground(green);
        empty11.setBackground(green);
        empty12.setBackground(green);
        empty13.setBackground(green);
        empty14.setBackground(green);
        empty15.setBackground(green);
        empty16.setBackground(green);
        empty17.setBackground(green);
        empty18.setBackground(green);
        empty19.setBackground(green);
        empty20.setBackground(green);
        empty21.setBackground(green);
        empty22.setBackground(green);
        empty23.setBackground(green);
        empty24.setBackground(green);
        empty25.setBackground(green);
        empty26.setBackground(green);
        empty27.setBackground(green);
        empty28.setBackground(green);
        empty29.setBackground(green);
        empty30.setBackground(green);
        empty31.setBackground(green);
        empty32.setBackground(green);
        empty33.setBackground(green);
        empty34.setBackground(green);
        empty35.setBackground(green);
        empty36.setBackground(green);
        empty37.setBackground(green);
        empty38.setBackground(green);
        empty39.setBackground(green);
        empty40.setBackground(green);
        empty41.setBackground(green);
        empty42.setBackground(green);
        empty43.setBackground(green);
        empty44.setBackground(green);
        empty45.setBackground(green);
        empty46.setBackground(green);
        empty47.setBackground(green);
        empty48.setBackground(green);
        empty49.setBackground(green);
        empty50.setBackground(green);
        empty51.setBackground(green);
        empty52.setBackground(green);
        empty53.setBackground(green);
        empty54.setBackground(green);
        empty55.setBackground(green);
        empty56.setBackground(green);
        empty57.setBackground(green);
        empty58.setBackground(green);
        empty59.setBackground(green);
        empty60.setBackground(green);
        empty61.setBackground(green);
        empty62.setBackground(green);
        empty63.setBackground(green);
        empty64.setBackground(green);
        
        
        if(empty1_x == x && empty1_y == y)
            empty1.setVisible(true);
        else if(empty2_x == x && empty2_y == y)
            empty2.setVisible(true);
        else if(empty3_x == x && empty3_y == y)
            empty3.setVisible(true);
        else if(empty4_x == x && empty4_y == y)
            empty4.setVisible(true);
        else if(empty5_x == x && empty5_y == y)
            empty5.setVisible(true);
        else if(empty6_x == x && empty6_y == y)
            empty6.setVisible(true);
        else if(empty7_x == x && empty7_y == y)
            empty7.setVisible(true);
        else if(empty8_x == x && empty8_y == y)
            empty8.setVisible(true);
        else if(empty9_x == x && empty9_y == y)
            empty9.setVisible(true);
        else if(empty10_x == x && empty10_y == y)
            empty10.setVisible(true);
        else if(empty11_x == x && empty11_y == y)
            empty11.setVisible(true);
        else if(empty12_x == x && empty12_y == y)
            empty12.setVisible(true);
        else if(empty13_x == x && empty13_y == y)
            empty13.setVisible(true);
        else if(empty14_x == x && empty14_y == y)
            empty14.setVisible(true);
        else if(empty15_x == x && empty15_y == y)
            empty15.setVisible(true);
        else if(empty16_x == x && empty16_y == y)
            empty16.setVisible(true);
        else if(empty17_x == x && empty17_y == y)
            empty17.setVisible(true);
        else if(empty18_x == x && empty18_y == y)
            empty18.setVisible(true);
        else if(empty19_x == x && empty19_y == y)
            empty19.setVisible(true);
        else if(empty20_x == x && empty20_y == y)
            empty20.setVisible(true);
        else if(empty21_x == x && empty21_y == y)
            empty21.setVisible(true);
        else if(empty22_x == x && empty22_y == y)
            empty22.setVisible(true);
        else if(empty23_x == x && empty23_y == y)
            empty23.setVisible(true);
        else if(empty24_x == x && empty24_y == y)
            empty24.setVisible(true);
        else if(empty25_x == x && empty25_y == y)
            empty25.setVisible(true);
        else if(empty26_x == x && empty26_y == y)
            empty26.setVisible(true);
        else if(empty27_x == x && empty27_y == y)
            empty27.setVisible(true);
        else if(empty28_x == x && empty28_y == y)
            empty28.setVisible(true);
        else if(empty29_x == x && empty29_y == y)
            empty29.setVisible(true);
        else if(empty30_x == x && empty30_y == y)
            empty30.setVisible(true);
        else if(empty31_x == x && empty31_y == y)
            empty31.setVisible(true);
        else if(empty32_x == x && empty32_y == y)
            empty32.setVisible(true);
        else if(empty33_x == x && empty33_y == y)
            empty33.setVisible(true);
        else if(empty34_x == x && empty34_y == y)
            empty34.setVisible(true);
        else if(empty35_x == x && empty35_y == y)
            empty35.setVisible(true);
        else if(empty36_x == x && empty36_y == y)
            empty36.setVisible(true);
        else if(empty37_x == x && empty37_y == y)
            empty37.setVisible(true);
        else if(empty38_x == x && empty38_y == y)
            empty38.setVisible(true);
        else if(empty39_x == x && empty39_y == y)
            empty39.setVisible(true);
        else if(empty40_x == x && empty40_y == y)
            empty40.setVisible(true);
        else if(empty41_x == x && empty41_y == y)
            empty41.setVisible(true);
        else if(empty42_x == x && empty42_y == y)
            empty42.setVisible(true);
        else if(empty43_x == x && empty43_y == y)
            empty43.setVisible(true);
        else if(empty44_x == x && empty44_y == y)
            empty44.setVisible(true);
        else if(empty45_x == x && empty45_y == y)
            empty45.setVisible(true);
        else if(empty46_x == x && empty46_y == y)
            empty46.setVisible(true);
        else if(empty47_x == x && empty47_y == y)
            empty47.setVisible(true);
        else if(empty48_x == x && empty48_y == y)
            empty48.setVisible(true);
        else if(empty49_x == x && empty49_y == y)
            empty49.setVisible(true);
        else if(empty50_x == x && empty50_y == y)
            empty50.setVisible(true);
        else if(empty51_x == x && empty51_y == y)
            empty51.setVisible(true);
        else if(empty52_x == x && empty52_y == y)
            empty52.setVisible(true);
        else if(empty53_x == x && empty53_y == y)
            empty53.setVisible(true);
        else if(empty54_x == x && empty54_y == y)
            empty54.setVisible(true);
        else if(empty55_x == x && empty55_y == y)
            empty55.setVisible(true);
        else if(empty56_x == x && empty56_y == y)
            empty56.setVisible(true);
        else if(empty57_x == x && empty57_y == y)
            empty57.setVisible(true);
        else if(empty58_x == x && empty58_y == y)
            empty58.setVisible(true);
        else if(empty59_x == x && empty59_y == y)
            empty59.setVisible(true);
        else if(empty60_x == x && empty60_y == y)
            empty60.setVisible(true);
        else if(empty61_x == x && empty61_y == y)
            empty61.setVisible(true);
        else if(empty62_x == x && empty62_y == y)
            empty62.setVisible(true);
        else if(empty63_x == x && empty63_y == y)
            empty63.setVisible(true);
        else if(empty64_x == x && empty64_y == y)
            empty64.setVisible(true);
        
        
    }
    public void clearColorEmpty() {
        
        empty1.setVisible(false);
        empty2.setVisible(false);
        empty3.setVisible(false);
        empty4.setVisible(false);
        empty5.setVisible(false);
        empty6.setVisible(false);
        empty7.setVisible(false);
        empty8.setVisible(false);
        empty9.setVisible(false);
        empty10.setVisible(false);
        empty11.setVisible(false);
        empty12.setVisible(false);
        empty13.setVisible(false);
        empty14.setVisible(false);
        empty15.setVisible(false);
        empty16.setVisible(false);
        empty17.setVisible(false);
        empty18.setVisible(false);
        empty19.setVisible(false);
        empty20.setVisible(false);
        empty21.setVisible(false);
        empty22.setVisible(false);
        empty23.setVisible(false);
        empty24.setVisible(false);
        empty25.setVisible(false);
        empty26.setVisible(false);
        empty27.setVisible(false);
        empty28.setVisible(false);
        empty29.setVisible(false);
        empty30.setVisible(false);
        empty31.setVisible(false);
        empty32.setVisible(false);
        empty33.setVisible(false);
        empty34.setVisible(false);
        empty35.setVisible(false);
        empty36.setVisible(false);
        empty37.setVisible(false);
        empty38.setVisible(false);
        empty39.setVisible(false);
        empty40.setVisible(false);
        empty41.setVisible(false);
        empty42.setVisible(false);
        empty43.setVisible(false);
        empty44.setVisible(false);
        empty45.setVisible(false);
        empty46.setVisible(false);
        empty47.setVisible(false);
        empty48.setVisible(false);
        empty49.setVisible(false);
        empty50.setVisible(false);
        empty51.setVisible(false);
        empty52.setVisible(false);
        empty53.setVisible(false);
        empty54.setVisible(false);
        empty55.setVisible(false);
        empty56.setVisible(false);
        empty57.setVisible(false);
        empty58.setVisible(false);
        empty59.setVisible(false);
        empty60.setVisible(false);
        empty61.setVisible(false);
        empty62.setVisible(false);
        empty63.setVisible(false);
        empty64.setVisible(false);
        
    }
    public void showPossibleMoves(JLabel piece) {
        
        clearColorEmpty();

            findPossibleMoves(piece);
            int k = 0; 
            while(possibleX[k] != -1) {
                if((whiteRook1_x == possibleX[k] && whiteRook1_y == possibleY[k]) || (whiteRook2_x == possibleX[k] && whiteRook2_y == possibleY[k])) { //undantag för castling
                    //inget
                }
                else {
                    makeGreen(possibleX[k], possibleY[k]);
                }
                k++; 
            }
            k = 0;
            while(killX[k] != -1) {
                makeRed(killX[k], killY[k]);
                k++; 
            }
        
    }
    public void reloadBounds() {
        
        whiteRook1.setBounds(whiteRook1_x, whiteRook1_y, CEL_WIDTH, CEL_WIDTH);
        whiteKnight1.setBounds(whiteKnight1_x, whiteKnight1_y, CEL_WIDTH, CEL_WIDTH);
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
        
        whiteQueenPro.setBounds(whitePro_x, whiteQueenPro_y, CEL_WIDTH, CEL_WIDTH);
        whiteKnightPro.setBounds(whitePro_x, whiteKnightPro_y, CEL_WIDTH, CEL_WIDTH);
        whiteRookPro.setBounds(whitePro_x, whiteRookPro_y, CEL_WIDTH, CEL_WIDTH);
        whiteBishopPro.setBounds(whitePro_x, whiteBishopPro_y, CEL_WIDTH, CEL_WIDTH);
        
        blackQueenPro.setBounds(blackPro_x, blackQueenPro_y, CEL_WIDTH, CEL_WIDTH);
        blackKnightPro.setBounds(blackPro_x, blackKnightPro_y, CEL_WIDTH, CEL_WIDTH);
        blackRookPro.setBounds(blackPro_x, blackRookPro_y, CEL_WIDTH, CEL_WIDTH);
        blackBishopPro.setBounds(blackPro_x, blackBishopPro_y, CEL_WIDTH, CEL_WIDTH);
        
    }
    public void checkGameOver() {
        
        if(whiteKing_x > (MARGIN_X + CEL_WIDTH*7)){
            gameOver = true; 
            youLose = true; 
            System.out.println(" ");
            System.out.println("Du förlorade!");
            hidePiecesUnderText();
        }
        else if(blackKing_x > (MARGIN_X + CEL_WIDTH*7)){
            gameOver = true; 
            youWin = true; 
            System.out.println(" ");
            System.out.println("Du vann!");
            hidePiecesUnderText();
        }
        
    }
    public void kill(JLabel piece) { // piece = piece jag dödar
        
        if(piece == whiteRook1 || piece == whiteKnight1 || piece == whiteBishop1
                || piece == whiteQueen || piece == whiteKing || piece == whiteBishop2
                || piece == whiteKnight2 || piece == whiteRook2 || piece == whitePawn1
                || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 
                || piece == whitePawn8) {
            
             
            if(whiteKillCount_col == 8) {
                whiteKillCount_row++; 
                whiteKillCount_col = 0; 
            }
            
            if(piece == whiteRook1) {
                whiteRook1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteRook1_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteRook1.setOpaque(false);
            }
            if(piece == whiteKnight1) {
                whiteKnight1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteKnight1_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteKnight1.setOpaque(false);
            }
            if(piece == whiteBishop1) {
                whiteBishop1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteBishop1_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteBishop1.setOpaque(false);
            }
            if(piece == whiteQueen) {
                whiteQueen_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteQueen_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteQueen.setOpaque(false);
            }
            if(piece == whiteKing) {
                whiteKing_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteKing_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteKing.setOpaque(false);
            }
            if(piece == whiteBishop2) {
                whiteBishop2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteBishop2_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteBishop2.setOpaque(false);
            }
            if(piece == whiteKnight2) {
                whiteKnight2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteKnight2_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteKnight2.setOpaque(false);
            }
            if(piece == whiteRook2) {
                whiteRook2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whiteRook2_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whiteRook2.setOpaque(false);
            }
            if(piece == whitePawn1) {
                whitePawn1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn1_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn1.setOpaque(false);
            }
            if(piece == whitePawn2) {
                whitePawn2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn2_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn2.setOpaque(false);
            }
            if(piece == whitePawn3) {
                whitePawn3_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn3_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn3.setOpaque(false);
            }
            if(piece == whitePawn4) {
                whitePawn4_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn4_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn4.setOpaque(false);
            }
            if(piece == whitePawn5) {
                whitePawn5_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn5_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn5.setOpaque(false);
            }
            if(piece == whitePawn6) {
                whitePawn6_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn6_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn6.setOpaque(false);
            }
            if(piece == whitePawn7) {
                whitePawn7_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn7_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn7.setOpaque(false);
            }
            if(piece == whitePawn8) {
                whitePawn8_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*whiteKillCount_col;  
                whitePawn8_y = MARGIN_Y + CEL_WIDTH*whiteKillCount_row;
                whitePawn8.setOpaque(false);
            }
            
            whiteKillCount_col++; 
            
        }
        
        if(piece == blackRook1 || piece == blackKnight1 || piece == blackBishop1
                || piece == blackQueen || piece == blackKing || piece == blackBishop2
                || piece == blackKnight2 || piece == blackRook2 || piece == blackPawn1
                || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 
                || piece == blackPawn8) {
            
             
            if(blackKillCount_col == 8) {
                blackKillCount_row++; 
                blackKillCount_col = 0; 
            }
            
            if(piece == blackRook1) {
                blackRook1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackRook1_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackRook1.setOpaque(false);
            }
            if(piece == blackKnight1) {
                blackKnight1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackKnight1_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackKnight1.setOpaque(false);
            }
            if(piece == blackBishop1) {
                blackBishop1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackBishop1_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackBishop1.setOpaque(false);
            }
            if(piece == blackQueen) {
                blackQueen_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackQueen_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackQueen.setOpaque(false);
            }
            if(piece == blackKing) {
                blackKing_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackKing_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackKing.setOpaque(false);
            }
            if(piece == blackBishop2) {
                blackBishop2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackBishop2_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackBishop2.setOpaque(false);
            }
            if(piece == blackKnight2) {
                blackKnight2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackKnight2_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackKnight2.setOpaque(false);
            }
            if(piece == blackRook2) {
                blackRook2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackRook2_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackRook2.setOpaque(false);
            }
            if(piece == blackPawn1) {
                blackPawn1_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn1_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn1.setOpaque(false);
            }
            if(piece == blackPawn2) {
                blackPawn2_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn2_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn2.setOpaque(false);
            }
            if(piece == blackPawn3) {
                blackPawn3_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn3_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn3.setOpaque(false);
            }
            if(piece == blackPawn4) {
                blackPawn4_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn4_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn4.setOpaque(false);
            }
            if(piece == blackPawn5) {
                blackPawn5_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn5_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn5.setOpaque(false);
            }
            if(piece == blackPawn6) {
                blackPawn6_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn6_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn6.setOpaque(false);
            }
            if(piece == blackPawn7) {
                blackPawn7_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn7_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn7.setOpaque(false);
            }
            if(piece == blackPawn8) {
                blackPawn8_x = MARGIN_X + CEL_WIDTH*8 + MARGIN_KILL_COUNT + CEL_WIDTH*blackKillCount_col;  
                blackPawn8_y = MARGIN_Y + CEL_WIDTH*blackKillCount_row;
                blackPawn8.setOpaque(false);
            }
            
            blackKillCount_col++; 
            
        }
        
        reloadBounds();
        repaint();
        checkGameOver();
        
    }
    public boolean checkIfBlack(int x, int y) {
        
        //om vald position är tagen av en svart pjäs
        if((blackRook1_x == x && blackRook1_y == y) || (blackKnight1_x == x && blackKnight1_y == y) 
                || (blackBishop1_x == x && blackBishop1_y == y) || (blackQueen_x == x && blackQueen_y == y)
                || (blackKing_x == x && blackKing_y == y) || (blackBishop2_x == x && blackBishop2_y == y)
                || (blackKnight2_x == x && blackKnight2_y == y) || (blackRook2_x == x && blackRook2_y == y)
                || (blackPawn1_x == x && blackPawn1_y == y) || (blackPawn2_x == x && blackPawn2_y == y)
                || (blackPawn3_x == x && blackPawn3_y == y) || (blackPawn4_x == x && blackPawn4_y == y)
                || (blackPawn5_x == x && blackPawn5_y == y) || (blackPawn6_x == x && blackPawn6_y == y)
                || (blackPawn7_x == x && blackPawn7_y == y) || (blackPawn8_x == x && blackPawn8_y == y)) {
            return true;
        }
        
        return false; 
        
    }
    public boolean checkIfWhite(int x, int y) {
        
        //om vald position är tagen av en vit pjäs
        if((whiteRook1_x == x && whiteRook1_y == y) || (whiteKnight1_x == x && whiteKnight1_y == y) 
                || (whiteBishop1_x == x && whiteBishop1_y == y) || (whiteQueen_x == x && whiteQueen_y == y)
                || (whiteKing_x == x && whiteKing_y == y) || (whiteBishop2_x == x && whiteBishop2_y == y)
                || (whiteKnight2_x == x && whiteKnight2_y == y) || (whiteRook2_x == x && whiteRook2_y == y)
                || (whitePawn1_x == x && whitePawn1_y == y) || (whitePawn2_x == x && whitePawn2_y == y)
                || (whitePawn3_x == x && whitePawn3_y == y) || (whitePawn4_x == x && whitePawn4_y == y)
                || (whitePawn5_x == x && whitePawn5_y == y) || (whitePawn6_x == x && whitePawn6_y == y)
                || (whitePawn7_x == x && whitePawn7_y == y) || (whitePawn8_x == x && whitePawn8_y == y)) {
            return true;
        }
        
        return false; 
        
    }
    public void makeRed(int x, int y) {
        
        if(empty1_x == x && empty1_y == y) {
            empty1.setBackground(red);
            empty1.setVisible(true);
        }
        else if(empty2_x == x && empty2_y == y){
            empty2.setBackground(red);
            empty2.setVisible(true);
        }
        else if(empty3_x == x && empty3_y == y){
            empty3.setBackground(red);
            empty3.setVisible(true);
        }
        else if(empty4_x == x && empty4_y == y){
            empty4.setBackground(red);
            empty4.setVisible(true);
        }
        else if(empty5_x == x && empty5_y == y){
            empty5.setBackground(red);
            empty5.setVisible(true);
        }
        else if(empty6_x == x && empty6_y == y){
            empty6.setBackground(red);
            empty6.setVisible(true);
        }
        else if(empty7_x == x && empty7_y == y){
            empty7.setBackground(red);
            empty7.setVisible(true);
        }
        else if(empty8_x == x && empty8_y == y){
            empty8.setBackground(red);
            empty8.setVisible(true);
        }
        else if(empty9_x == x && empty9_y == y){
            empty9.setBackground(red);
            empty9.setVisible(true);
        }
        else if(empty10_x == x && empty10_y == y){
            empty10.setBackground(red);
            empty10.setVisible(true);
        }
        else if(empty11_x == x && empty11_y == y){
            empty11.setBackground(red);
            empty11.setVisible(true);
        }
        else if(empty12_x == x && empty12_y == y){
            empty12.setBackground(red);
            empty12.setVisible(true);
        }
        else if(empty13_x == x && empty13_y == y){
            empty13.setBackground(red);
            empty13.setVisible(true);
        }
        else if(empty14_x == x && empty14_y == y){
            empty14.setBackground(red);
            empty14.setVisible(true);
        }
        else if(empty15_x == x && empty15_y == y){
            empty15.setBackground(red);
            empty15.setVisible(true);
        }
        else if(empty16_x == x && empty16_y == y){
            empty16.setBackground(red);
            empty16.setVisible(true);
        }
        else if(empty17_x == x && empty17_y == y){
            empty17.setBackground(red);
            empty17.setVisible(true);
        }
        else if(empty18_x == x && empty18_y == y){
            empty18.setBackground(red);
            empty18.setVisible(true);
        }
        else if(empty19_x == x && empty19_y == y){
            empty19.setBackground(red);
            empty19.setVisible(true);
        }
        else if(empty20_x == x && empty20_y == y){
            empty20.setBackground(red);
            empty20.setVisible(true);
        }
        else if(empty21_x == x && empty21_y == y){
            empty21.setBackground(red);
            empty21.setVisible(true);
        }
        else if(empty22_x == x && empty22_y == y){
            empty22.setBackground(red);
            empty22.setVisible(true);
        }
        else if(empty23_x == x && empty23_y == y){
            empty23.setBackground(red);
            empty23.setVisible(true);
        }
        else if(empty24_x == x && empty24_y == y){
            empty24.setBackground(red);
            empty24.setVisible(true);
        }
        else if(empty25_x == x && empty25_y == y){
            empty25.setBackground(red);
            empty25.setVisible(true);
        }
        else if(empty26_x == x && empty26_y == y){
            empty26.setBackground(red);
            empty26.setVisible(true);
        }
        else if(empty27_x == x && empty27_y == y){
            empty27.setBackground(red);
            empty27.setVisible(true);
        }
        else if(empty28_x == x && empty28_y == y){
            empty28.setBackground(red);
            empty28.setVisible(true);
        }
        else if(empty29_x == x && empty29_y == y){
            empty29.setBackground(red);
            empty29.setVisible(true);
        }
        else if(empty30_x == x && empty30_y == y){
            empty30.setBackground(red);
            empty30.setVisible(true);
        }
        else if(empty31_x == x && empty31_y == y){
            empty31.setBackground(red);
            empty31.setVisible(true);
        }
        else if(empty32_x == x && empty32_y == y){
            empty32.setBackground(red);
            empty32.setVisible(true);
        }
        else if(empty33_x == x && empty33_y == y){
            empty33.setBackground(red);
            empty33.setVisible(true);
        }
        else if(empty34_x == x && empty34_y == y){
            empty34.setBackground(red);
            empty34.setVisible(true);
        }
        else if(empty35_x == x && empty35_y == y){
            empty35.setBackground(red);
            empty35.setVisible(true);
        }
        else if(empty36_x == x && empty36_y == y){
            empty36.setBackground(red);
            empty36.setVisible(true);
        }
        else if(empty37_x == x && empty37_y == y){
            empty37.setBackground(red);
            empty37.setVisible(true);
        }
        else if(empty38_x == x && empty38_y == y){
            empty38.setBackground(red);
            empty38.setVisible(true);
        }
        else if(empty39_x == x && empty39_y == y){
            empty39.setBackground(red);
            empty39.setVisible(true);
        }
        else if(empty40_x == x && empty40_y == y){
            empty40.setBackground(red);
            empty40.setVisible(true);
        }
        else if(empty41_x == x && empty41_y == y){
            empty41.setBackground(red);
            empty41.setVisible(true);
        }
        else if(empty42_x == x && empty42_y == y){
            empty42.setBackground(red);
            empty42.setVisible(true);
        }
        else if(empty43_x == x && empty43_y == y){
            empty43.setBackground(red);
            empty43.setVisible(true);
        }
        else if(empty44_x == x && empty44_y == y){
            empty44.setBackground(red);
            empty44.setVisible(true);
        }
        else if(empty45_x == x && empty45_y == y){
            empty45.setBackground(red);
            empty45.setVisible(true);
        }
        else if(empty46_x == x && empty46_y == y){
            empty46.setBackground(red);
            empty46.setVisible(true);
        }
        else if(empty47_x == x && empty47_y == y){
            empty47.setBackground(red);
            empty47.setVisible(true);
        }
        else if(empty48_x == x && empty48_y == y){
            empty48.setBackground(red);
            empty48.setVisible(true);
        }
        else if(empty49_x == x && empty49_y == y){
            empty49.setBackground(red);
            empty49.setVisible(true);
        }
        else if(empty50_x == x && empty50_y == y){
            empty50.setBackground(red);
            empty50.setVisible(true);
        }
        else if(empty51_x == x && empty51_y == y){
            empty51.setBackground(red);
            empty51.setVisible(true);
        }
        else if(empty52_x == x && empty52_y == y){
            empty52.setBackground(red);
            empty52.setVisible(true);
        }
        else if(empty53_x == x && empty53_y == y){
            empty53.setBackground(red);
            empty53.setVisible(true);
        }
        else if(empty54_x == x && empty54_y == y){
            empty54.setBackground(red);
            empty54.setVisible(true);
        }
        else if(empty55_x == x && empty55_y == y){
            empty55.setBackground(red);
            empty55.setVisible(true);
        }
        else if(empty56_x == x && empty56_y == y){
            empty56.setBackground(red);
            empty56.setVisible(true);
        }
        else if(empty57_x == x && empty57_y == y){
            empty57.setBackground(red);
            empty57.setVisible(true);
        }
        else if(empty58_x == x && empty58_y == y){
            empty58.setBackground(red);
            empty58.setVisible(true);
        }
        else if(empty59_x == x && empty59_y == y){
            empty59.setBackground(red);
            empty59.setVisible(true);
        }   
         else if(empty60_x == x && empty60_y == y){
            empty60.setBackground(red);
            empty60.setVisible(true);
        }
        else if(empty61_x == x && empty61_y == y){
            empty61.setBackground(red);
            empty61.setVisible(true);
        }
        else if(empty62_x == x && empty62_y == y){
            empty62.setBackground(red);
            empty62.setVisible(true);
        }
        else if(empty63_x == x && empty63_y == y){
            empty63.setBackground(red);
            empty63.setVisible(true);
        }
        else if(empty64_x == x && empty64_y == y){
            empty64.setBackground(red);
            empty64.setVisible(true);
        }
        
    }
    public void findPossibleMoves(JLabel piece) {        
       for(int a = 0; a < possibleX.length; a++) { //rensa array
            possibleX[a] = -1; 
        }
       for(int a = 0; a < possibleY.length; a++) { //rensa array
            possibleY[a] = -1; 
       }
       for(int a = 0; a < killX.length; a++) { //rensa kill array
            killX[a] = -1; 
        }
       for(int a = 0; a < killY.length; a++) { //rensa kill array
            killY[a] = -1; 
       }
       
       firstMove = true;
        
        //pawn
        if (piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8
                || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
            
            if(piece == whitePawn1) {
                pieceCount = whitePawn1_PieceCount;
            }
            else if(piece == whitePawn2) {
                pieceCount = whitePawn2_PieceCount;
            }
            else if(piece == whitePawn3) {
                pieceCount = whitePawn3_PieceCount;
            }
            else if(piece == whitePawn4) {
                pieceCount = whitePawn4_PieceCount;
            }
            else if(piece == whitePawn5) {
                pieceCount = whitePawn5_PieceCount;
            }
            else if(piece == whitePawn6) {
                pieceCount = whitePawn6_PieceCount;
            }
            else if(piece == whitePawn7) {
                pieceCount = whitePawn7_PieceCount;
            }
            else if(piece == whitePawn8) {
                pieceCount = whitePawn8_PieceCount;
            }
            else if(piece == blackPawn1) {
                pieceCount = blackPawn1_PieceCount;
            }
            else if(piece == blackPawn2) {
                pieceCount = blackPawn2_PieceCount;
            }
            else if(piece == blackPawn3) {
                pieceCount = blackPawn3_PieceCount;
            }
            else if(piece == blackPawn4) {
                pieceCount = blackPawn4_PieceCount;
            }
            else if(piece == blackPawn5) {
                pieceCount = blackPawn5_PieceCount;
            }
            else if(piece == blackPawn6) {
                pieceCount = blackPawn6_PieceCount;
            }
            else if(piece == blackPawn7) {
                pieceCount = blackPawn7_PieceCount;
            }
            else if(piece == blackPawn8) {
                pieceCount = blackPawn8_PieceCount;
            }
            
            if(pieceCount == 1) {
                findPawnMoves(piece);
            }
            else if(pieceCount == 2) {
                findRookMoves(piece);
            }
            else if(pieceCount == 3) {
                findKnightMoves(piece);
            } 
            else if(pieceCount == 4) {
                findBishopMoves(piece);
            }
            else if(pieceCount == 5) {
                findQueenMoves(piece);
            }
            
        } // if  pawn 
       
        
        //rook 
        else if(piece == whiteRook1 || piece == whiteRook2 || piece == blackRook1 || piece == blackRook2) {

            findRookMoves(piece);
            
        } // if rook
        
        
        //häst 
        else if(piece == whiteKnight1 || piece == whiteKnight2 || piece == blackKnight1 || piece == blackKnight2) {
            
            findKnightMoves(piece);
            
        }
        
        //löpare
        else if(piece == whiteBishop1 || piece == whiteBishop2 || piece == blackBishop1 || piece == blackBishop2) {
            
            findBishopMoves(piece);
            
        }
        
        //dam 
        else if (piece == whiteQueen || piece == blackQueen) {
            
            findQueenMoves(piece);
            
        }
        
        //kung
        else if(piece == whiteKing || piece == blackKing) {
            
            findKingMoves(piece);
            
        }
        
        
        
    }
    
    public void movePiece(String piece, JLabel cel) {

        int xPos = 0;
        int yPos = 0; 
        
        if(cel == empty1) {
            xPos = empty1_x; 
            yPos = empty1_y; 
        }
        else if(cel == empty2) {
            xPos = empty2_x; 
            yPos = empty2_y; 
        } 
        else if(cel == empty3) {
            xPos = empty3_x; 
            yPos = empty3_y; 
        }
        else if(cel == empty4) {
            xPos = empty4_x; 
            yPos = empty4_y; 
        } 
        else if(cel == empty5) {
            xPos = empty5_x; 
            yPos = empty5_y; 
        }
        else if(cel == empty6) {
            xPos = empty6_x; 
            yPos = empty6_y; 
        } 
        else if(cel == empty7) {
            xPos = empty7_x; 
            yPos = empty7_y; 
        }
        else if(cel == empty8) {
            xPos = empty8_x; 
            yPos = empty8_y; 
        } 
        else if(cel == empty9) {
            xPos = empty9_x; 
            yPos = empty9_y; 
        }
        else if(cel == empty10) {
            xPos = empty10_x; 
            yPos = empty10_y; 
        }
        else if(cel == empty11) {
            xPos = empty11_x; 
            yPos = empty11_y; 
        }
        else if(cel == empty12) {
            xPos = empty12_x; 
            yPos = empty12_y; 
        }
        else if(cel == empty13) {
            xPos = empty13_x; 
            yPos = empty13_y; 
        }
        else if(cel == empty14) {
            xPos = empty14_x; 
            yPos = empty14_y; 
        }
        else if(cel == empty15) {
            xPos = empty15_x; 
            yPos = empty15_y; 
        }
        else if(cel == empty16) {
            xPos = empty16_x; 
            yPos = empty16_y; 
        }
        else if(cel == empty17) {
            xPos = empty17_x; 
            yPos = empty17_y; 
        }
        else if(cel == empty18) {
            xPos = empty18_x; 
            yPos = empty18_y; 
        }
        else if(cel == empty19) {
            xPos = empty19_x; 
            yPos = empty19_y; 
        }
        else if(cel == empty20) {
            xPos = empty20_x; 
            yPos = empty20_y; 
        }
        else if(cel == empty21) {
            xPos = empty21_x; 
            yPos = empty21_y; 
        }
        else if(cel == empty22) {
            xPos = empty22_x; 
            yPos = empty22_y; 
        }
        else if(cel == empty23) {
            xPos = empty23_x; 
            yPos = empty23_y; 
        }
        else if(cel == empty24) {
            xPos = empty24_x; 
            yPos = empty24_y; 
        }
        else if(cel == empty25) {
            xPos = empty25_x; 
            yPos = empty25_y; 
        }
        else if(cel == empty26) {
            xPos = empty26_x; 
            yPos = empty26_y; 
        }
        else if(cel == empty27) {
            xPos = empty27_x; 
            yPos = empty27_y; 
        }
        else if(cel == empty28) {
            xPos = empty28_x; 
            yPos = empty28_y; 
        }
        else if(cel == empty29) {
            xPos = empty29_x; 
            yPos = empty29_y; 
        }
        else if(cel == empty30) {
            xPos = empty30_x; 
            yPos = empty30_y; 
        }
        else if(cel == empty31) {
            xPos = empty31_x; 
            yPos = empty31_y; 
        }
        else if(cel == empty32) {
            xPos = empty32_x; 
            yPos = empty32_y; 
        }
        else if(cel == empty33) {
            xPos = empty33_x; 
            yPos = empty33_y; 
        }
        else if(cel == empty34) {
            xPos = empty34_x; 
            yPos = empty34_y; 
        }
        else if(cel == empty35) {
            xPos = empty35_x; 
            yPos = empty35_y; 
        }
        else if(cel == empty36) {
            xPos = empty36_x; 
            yPos = empty36_y; 
        }
        else if(cel == empty37) {
            xPos = empty37_x; 
            yPos = empty37_y; 
        }
        else if(cel == empty38) {
            xPos = empty38_x; 
            yPos = empty38_y; 
        }
        else if(cel == empty39) {
            xPos = empty39_x; 
            yPos = empty39_y; 
        }
        else if(cel == empty40) {
            xPos = empty40_x; 
            yPos = empty40_y; 
        }
        else if(cel == empty41) {
            xPos = empty41_x; 
            yPos = empty41_y; 
        }
        else if(cel == empty42) {
            xPos = empty42_x; 
            yPos = empty42_y; 
        }
        else if(cel == empty43) {
            xPos = empty43_x; 
            yPos = empty43_y; 
        }
        else if(cel == empty44) {
            xPos = empty44_x; 
            yPos = empty44_y; 
        }
        else if(cel == empty45) {
            xPos = empty45_x; 
            yPos = empty45_y; 
        }
        else if(cel == empty46) {
            xPos = empty46_x; 
            yPos = empty46_y; 
        }
        else if(cel == empty47) {
            xPos = empty47_x; 
            yPos = empty47_y; 
        }
        else if(cel == empty48) {
            xPos = empty48_x; 
            yPos = empty48_y; 
        }
        else if(cel == empty49) {
            xPos = empty49_x; 
            yPos = empty49_y; 
        }
        else if(cel == empty50) {
            xPos = empty50_x; 
            yPos = empty50_y; 
        }
        else if(cel == empty51) {
            xPos = empty51_x; 
            yPos = empty51_y; 
        }
        else if(cel == empty52) {
            xPos = empty52_x; 
            yPos = empty52_y; 
        }
        else if(cel == empty53) {
            xPos = empty53_x; 
            yPos = empty53_y; 
        }
        else if(cel == empty54) {
            xPos = empty54_x; 
            yPos = empty54_y; 
        }
        else if(cel == empty55) {
            xPos = empty55_x; 
            yPos = empty55_y; 
        }
        else if(cel == empty56) {
            xPos = empty56_x; 
            yPos = empty56_y; 
        }
        else if(cel == empty57) {
            xPos = empty57_x; 
            yPos = empty57_y; 
        }
        else if(cel == empty58) {
            xPos = empty58_x; 
            yPos = empty58_y; 
        }
        else if(cel == empty59) {
            xPos = empty59_x; 
            yPos = empty59_y; 
        }
        else if(cel == empty60) {
            xPos = empty60_x; 
            yPos = empty60_y; 
        }
        else if(cel == empty61) {
            xPos = empty61_x; 
            yPos = empty61_y; 
        }
        else if(cel == empty62) {
            xPos = empty62_x; 
            yPos = empty62_y; 
        }
        else if(cel == empty63) {
            xPos = empty63_x; 
            yPos = empty63_y; 
        }
        else if(cel == empty64) {
            xPos = empty64_x; 
            yPos = empty64_y; 
        }
     
        if(whiteTurn) {
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
            if(piece.equals("whiteRook1")){
                whiteRook1_x = xPos; 
                whiteRook1_y = yPos; 
            }
            else if(piece.equals("whiteKnight1")){
                whiteKnight1_x = xPos; 
                whiteKnight1_y = yPos; 
            }
            else if(piece.equals("whiteBishop1")){
                whiteBishop1_x = xPos; 
                whiteBishop1_y = yPos; 
            }
            else if(piece.equals("whiteQueen")){
                whiteQueen_x = xPos; 
                whiteQueen_y = yPos; 
            }
            else if(piece.equals("whiteKing")){
                whiteKing_x = xPos; 
                whiteKing_y = yPos; 
            }
            else if(piece.equals("whiteBishop2")){
                whiteBishop2_x = xPos; 
                whiteBishop2_y = yPos; 
            }
            else if(piece.equals("whiteKnight2")){
                whiteKnight2_x = xPos; 
                whiteKnight2_y = yPos; 
            }
            else if(piece.equals("whiteRook2")){
                whiteRook2_x = xPos; 
                whiteRook2_y = yPos; 
            }
            else if(piece.equals("whitePawn1")){
                if(firstMove_Pawn1 == true){
                    firstMove_Pawn1 = false;
                }
                if(yPos == whitePawn1_y - CEL_WIDTH*2) {
                    whitePawn1_doubleMove = true;
                }
                else {
                    whitePawn1_doubleMove = false; 
                }
                whitePawn1_x = xPos; 
                whitePawn1_y = yPos; 
            }
            else if(piece.equals("whitePawn2")){
                if(firstMove_Pawn2 == true){
                    firstMove_Pawn2 = false;
                }
                if(yPos == whitePawn2_y - CEL_WIDTH*2) {
                    whitePawn2_doubleMove = true;
                }
                else {
                    whitePawn2_doubleMove = false; 
                }
                whitePawn2_x = xPos; 
                whitePawn2_y = yPos; 
            }
            else if(piece.equals("whitePawn3")){
                if(firstMove_Pawn3 == true){
                    firstMove_Pawn3 = false;
                }
                if(yPos == whitePawn3_y - CEL_WIDTH*2) {
                    whitePawn3_doubleMove = true;
                }
                else {
                    whitePawn3_doubleMove = false; 
                }
                whitePawn3_x = xPos; 
                whitePawn3_y = yPos; 
            }
            else if(piece.equals("whitePawn4")){
                if(firstMove_Pawn4 == true){
                    firstMove_Pawn4 = false;
                }
                if(yPos == whitePawn4_y - CEL_WIDTH*2) {
                    whitePawn4_doubleMove = true;
                }
                else {
                    whitePawn4_doubleMove = false; 
                }
                whitePawn4_x = xPos; 
                whitePawn4_y = yPos; 
            }
            else if(piece.equals("whitePawn5")){
                if(firstMove_Pawn5 == true){
                    firstMove_Pawn5 = false;
                }
                if(yPos == whitePawn5_y - CEL_WIDTH*2) {
                    whitePawn5_doubleMove = true;
                }
                else {
                    whitePawn5_doubleMove = false; 
                }
                whitePawn5_x = xPos; 
                whitePawn5_y = yPos; 
            }
            else if(piece.equals("whitePawn6")){
                if(firstMove_Pawn6 == true){
                    firstMove_Pawn6 = false;
                }
                if(yPos == whitePawn6_y - CEL_WIDTH*2) {
                    whitePawn6_doubleMove = true;
                }
                else {
                    whitePawn6_doubleMove = false; 
                }
                whitePawn6_x = xPos; 
                whitePawn6_y = yPos; 
            }
            else if(piece.equals("whitePawn7")){
                if(firstMove_Pawn7 == true){
                    firstMove_Pawn7 = false;
                }
                if(yPos == whitePawn7_y - CEL_WIDTH*2) {
                    whitePawn7_doubleMove = true;
                }
                else {
                    whitePawn7_doubleMove = false; 
                }
                whitePawn7_x = xPos; 
                whitePawn7_y = yPos; 
            }
            else if(piece.equals("whitePawn8")){
                if(firstMove_Pawn8 == true){
                    firstMove_Pawn8 = false;
                }
                if(yPos == whitePawn8_y - CEL_WIDTH*2) {
                    whitePawn8_doubleMove = true;
                }
                else {
                    whitePawn8_doubleMove = false; 
                }
                whitePawn8_x = xPos; 
                whitePawn8_y = yPos; 
            }

            if(!piece.equals("whitePawn1"))  {
                whitePawn1_doubleMove = false;
            }
            if(!piece.equals("whitePawn2"))  {
                whitePawn2_doubleMove = false;
            }
            if(!piece.equals("whitePawn3"))  {
                whitePawn3_doubleMove = false;
            }
            if(!piece.equals("whitePawn4"))  {
                whitePawn4_doubleMove = false;
            }
            if(!piece.equals("whitePawn5"))  {
                whitePawn5_doubleMove = false;
            }
            if(!piece.equals("whitePawn6"))  {
                whitePawn6_doubleMove = false;
            }
            if(!piece.equals("whitePawn7"))  {
                whitePawn7_doubleMove = false;
            }
            if(!piece.equals("whitePawn8"))  {
                whitePawn8_doubleMove = false;
            }

            notationWhite(piece, cel);

            whiteTurn = false; 
            blackTurn = true; 
            
            reloadBounds();
            clearColorEmpty();
            repaint();
            
        }
        else if(blackTurn) {
            
            JLabel pieceJLabel = new JLabel();
            
            whitePawn1_doubleMove = false; 
            whitePawn2_doubleMove = false; 
            whitePawn3_doubleMove = false; 
            whitePawn4_doubleMove = false; 
            whitePawn5_doubleMove = false; 
            whitePawn6_doubleMove = false; 
            whitePawn7_doubleMove = false; 
            whitePawn8_doubleMove = false; 
            
            if(piece.equals("blackRook1")){
                pieceJLabel = blackRook1; 
                blackRook1_x = xPos; 
                blackRook1_y = yPos; 
            }
            else if(piece.equals("blackKnight1")){
                pieceJLabel = blackKnight1; 
                blackKnight1_x = xPos; 
                blackKnight1_y = yPos; 
            }
            else if(piece.equals("blackBishop1")){
                pieceJLabel = blackBishop1; 
                blackBishop1_x = xPos; 
                blackBishop1_y = yPos; 
            }
            else if(piece.equals("blackQueen")){
                pieceJLabel = blackQueen; 
                blackQueen_x = xPos; 
                blackQueen_y = yPos; 
            }
            else if(piece.equals("blackKing")){
                pieceJLabel = blackKing;   
                blackKing_x = xPos; 
                blackKing_y = yPos; 
            }
            else if(piece.equals("blackBishop2")){
                pieceJLabel = blackBishop2; 
                blackBishop2_x = xPos; 
                blackBishop2_y = yPos; 
            }
            else if(piece.equals("blackKnight2")){
                pieceJLabel = blackKnight2; 
                blackKnight2_x = xPos; 
                blackKnight2_y = yPos; 
            }
            else if(piece.equals("blackRook2")){
                pieceJLabel = blackRook2; 
                blackRook2_x = xPos; 
                blackRook2_y = yPos; 
            }
            else if(piece.equals("blackPawn1")){
                pieceJLabel = blackPawn1; 
                if(firstMove_Pawn1 == true){
                    firstMove_Pawn1 = false;
                }
                if(yPos == blackPawn1_y + CEL_WIDTH*2) {
                    blackPawn1_doubleMove = true;
                }
                else {
                    blackPawn1_doubleMove = false; 
                }
                blackPawn1_x = xPos; 
                blackPawn1_y = yPos; 
            }
            else if(piece.equals("blackPawn2")){
                pieceJLabel = blackPawn2;
                if(firstMove_Pawn2 == true){
                    firstMove_Pawn2 = false;
                }
                if(yPos == blackPawn2_y + CEL_WIDTH*2) {
                    blackPawn2_doubleMove = true;
                }
                else {
                    blackPawn2_doubleMove = false; 
                }
                blackPawn2_x = xPos; 
                blackPawn2_y = yPos; 
            }
            else if(piece.equals("blackPawn3")){
                pieceJLabel = blackPawn3;
                if(firstMove_Pawn3 == true){
                    firstMove_Pawn3 = false;
                }
                if(yPos == blackPawn3_y + CEL_WIDTH*2) {
                    blackPawn3_doubleMove = true;
                }
                else {
                    blackPawn3_doubleMove = false; 
                }
                blackPawn3_x = xPos; 
                blackPawn3_y = yPos; 
            }
            else if(piece.equals("blackPawn4")){
                pieceJLabel = blackPawn4;
                if(firstMove_Pawn4 == true){
                    firstMove_Pawn4 = false;
                }
                if(yPos == blackPawn4_y + CEL_WIDTH*2) {
                    blackPawn4_doubleMove = true;
                }
                else {
                    blackPawn4_doubleMove = false; 
                }
                blackPawn4_x = xPos; 
                blackPawn4_y = yPos; 
            }
            else if(piece.equals("blackPawn5")){ 
                pieceJLabel = blackPawn5;
                if(firstMove_Pawn5 == true){
                    firstMove_Pawn5 = false;
                }
                if(yPos == blackPawn5_y + CEL_WIDTH*2) {
                    blackPawn5_doubleMove = true;
                }
                else {
                    blackPawn5_doubleMove = false; 
                }
                blackPawn5_x = xPos; 
                blackPawn5_y = yPos; 
            }
            else if(piece.equals("blackPawn6")){
                pieceJLabel = blackPawn6;
                if(firstMove_Pawn6 == true){
                    firstMove_Pawn6 = false;
                }
                if(yPos == blackPawn6_y + CEL_WIDTH*2) {
                    blackPawn6_doubleMove = true;
                }
                else {
                    blackPawn6_doubleMove = false; 
                }
                blackPawn6_x = xPos; 
                blackPawn6_y = yPos; 
            }
            else if(piece.equals("blackPawn7")){
                pieceJLabel = blackPawn7;
                if(firstMove_Pawn7 == true){
                    firstMove_Pawn7 = false;
                }
                if(yPos == blackPawn7_y + CEL_WIDTH*2) {
                    blackPawn7_doubleMove = true;
                }
                else {
                    blackPawn7_doubleMove = false; 
                }
                blackPawn7_x = xPos; 
                blackPawn7_y = yPos; 
            }
            else if(piece.equals("blackPawn8")){
                pieceJLabel = blackPawn8;
                if(firstMove_Pawn8 == true){
                    firstMove_Pawn8 = false;
                }
                if(yPos == blackPawn8_y + CEL_WIDTH*2) {
                    blackPawn8_doubleMove = true;
                }
                else {
                    blackPawn8_doubleMove = false; 
                }
                blackPawn8_x = xPos; 
                blackPawn8_y = yPos; 
            }

            if(!piece.equals("blackPawn1"))  {
                blackPawn1_doubleMove = false;
            }
            if(!piece.equals("blackPawn2"))  {
                blackPawn2_doubleMove = false;
            }
            if(!piece.equals("blackPawn3"))  {
                blackPawn3_doubleMove = false;
            }
            if(!piece.equals("blackPawn4"))  {
                blackPawn4_doubleMove = false;
            }
            if(!piece.equals("blackPawn5"))  {
                blackPawn5_doubleMove = false;
            }
            if(!piece.equals("blackPawn6"))  {
                blackPawn6_doubleMove = false;
            }
            if(!piece.equals("blackPawn7"))  {
                blackPawn7_doubleMove = false;
            }
            if(!piece.equals("blackPawn8"))  {
                blackPawn8_doubleMove = false;
            }
            
            notationBlack(pieceJLabel, xPos, yPos);

            blackTurn = false; 
            whiteTurn = true; 

            
            reloadBounds();
            clearColorEmpty();
            repaint();
            
        }
       
        
    }
    public void moveWithKill(String piece, JLabel cel) {

        int xPos = 0;
        int yPos = 0; 
        
        if(cel == empty1) {
            xPos = empty1_x; 
            yPos = empty1_y; 
        }
        else if(cel == empty2) {
            xPos = empty2_x; 
            yPos = empty2_y; 
        } 
        else if(cel == empty3) {
            xPos = empty3_x; 
            yPos = empty3_y; 
        }
        else if(cel == empty4) {
            xPos = empty4_x; 
            yPos = empty4_y; 
        } 
        else if(cel == empty5) {
            xPos = empty5_x; 
            yPos = empty5_y; 
        }
        else if(cel == empty6) {
            xPos = empty6_x; 
            yPos = empty6_y; 
        } 
        else if(cel == empty7) {
            xPos = empty7_x; 
            yPos = empty7_y; 
        }
        else if(cel == empty8) {
            xPos = empty8_x; 
            yPos = empty8_y; 
        } 
        else if(cel == empty9) {
            xPos = empty9_x; 
            yPos = empty9_y; 
        }
        else if(cel == empty10) {
            xPos = empty10_x; 
            yPos = empty10_y; 
        }
        else if(cel == empty11) {
            xPos = empty11_x; 
            yPos = empty11_y; 
        }
        else if(cel == empty12) {
            xPos = empty12_x; 
            yPos = empty12_y; 
        }
        else if(cel == empty13) {
            xPos = empty13_x; 
            yPos = empty13_y; 
        }
        else if(cel == empty14) {
            xPos = empty14_x; 
            yPos = empty14_y; 
        }
        else if(cel == empty15) {
            xPos = empty15_x; 
            yPos = empty15_y; 
        }
        else if(cel == empty16) {
            xPos = empty16_x; 
            yPos = empty16_y; 
        }
        else if(cel == empty17) {
            xPos = empty17_x; 
            yPos = empty17_y; 
        }
        else if(cel == empty18) {
            xPos = empty18_x; 
            yPos = empty18_y; 
        }
        else if(cel == empty19) {
            xPos = empty19_x; 
            yPos = empty19_y; 
        }
        else if(cel == empty20) {
            xPos = empty20_x; 
            yPos = empty20_y; 
        }
        else if(cel == empty21) {
            xPos = empty21_x; 
            yPos = empty21_y; 
        }
        else if(cel == empty22) {
            xPos = empty22_x; 
            yPos = empty22_y; 
        }
        else if(cel == empty23) {
            xPos = empty23_x; 
            yPos = empty23_y; 
        }
        else if(cel == empty24) {
            xPos = empty24_x; 
            yPos = empty24_y; 
        }
        else if(cel == empty25) {
            xPos = empty25_x; 
            yPos = empty25_y; 
        }
        else if(cel == empty26) {
            xPos = empty26_x; 
            yPos = empty26_y; 
        }
        else if(cel == empty27) {
            xPos = empty27_x; 
            yPos = empty27_y; 
        }
        else if(cel == empty28) {
            xPos = empty28_x; 
            yPos = empty28_y; 
        }
        else if(cel == empty29) {
            xPos = empty29_x; 
            yPos = empty29_y; 
        }
        else if(cel == empty30) {
            xPos = empty30_x; 
            yPos = empty30_y; 
        }
        else if(cel == empty31) {
            xPos = empty31_x; 
            yPos = empty31_y; 
        }
        else if(cel == empty32) {
            xPos = empty32_x; 
            yPos = empty32_y; 
        }
        else if(cel == empty33) {
            xPos = empty33_x; 
            yPos = empty33_y; 
        }
        else if(cel == empty34) {
            xPos = empty34_x; 
            yPos = empty34_y; 
        }
        else if(cel == empty35) {
            xPos = empty35_x; 
            yPos = empty35_y; 
        }
        else if(cel == empty36) {
            xPos = empty36_x; 
            yPos = empty36_y; 
        }
        else if(cel == empty37) {
            xPos = empty37_x; 
            yPos = empty37_y; 
        }
        else if(cel == empty38) {
            xPos = empty38_x; 
            yPos = empty38_y; 
        }
        else if(cel == empty39) {
            xPos = empty39_x; 
            yPos = empty39_y; 
        }
        else if(cel == empty40) {
            xPos = empty40_x; 
            yPos = empty40_y; 
        }
        else if(cel == empty41) {
            xPos = empty41_x; 
            yPos = empty41_y; 
        }
        else if(cel == empty42) {
            xPos = empty42_x; 
            yPos = empty42_y; 
        }
        else if(cel == empty43) {
            xPos = empty43_x; 
            yPos = empty43_y; 
        }
        else if(cel == empty44) {
            xPos = empty44_x; 
            yPos = empty44_y; 
        }
        else if(cel == empty45) {
            xPos = empty45_x; 
            yPos = empty45_y; 
        }
        else if(cel == empty46) {
            xPos = empty46_x; 
            yPos = empty46_y; 
        }
        else if(cel == empty47) {
            xPos = empty47_x; 
            yPos = empty47_y; 
        }
        else if(cel == empty48) {
            xPos = empty48_x; 
            yPos = empty48_y; 
        }
        else if(cel == empty49) {
            xPos = empty49_x; 
            yPos = empty49_y; 
        }
        else if(cel == empty50) {
            xPos = empty50_x; 
            yPos = empty50_y; 
        }
        else if(cel == empty51) {
            xPos = empty51_x; 
            yPos = empty51_y; 
        }
        else if(cel == empty52) {
            xPos = empty52_x; 
            yPos = empty52_y; 
        }
        else if(cel == empty53) {
            xPos = empty53_x; 
            yPos = empty53_y; 
        }
        else if(cel == empty54) {
            xPos = empty54_x; 
            yPos = empty54_y; 
        }
        else if(cel == empty55) {
            xPos = empty55_x; 
            yPos = empty55_y; 
        }
        else if(cel == empty56) {
            xPos = empty56_x; 
            yPos = empty56_y; 
        }
        else if(cel == empty57) {
            xPos = empty57_x; 
            yPos = empty57_y; 
        }
        else if(cel == empty58) {
            xPos = empty58_x; 
            yPos = empty58_y; 
        }
        else if(cel == empty59) {
            xPos = empty59_x; 
            yPos = empty59_y; 
        }
        else if(cel == empty60) {
            xPos = empty60_x; 
            yPos = empty60_y; 
        }
        else if(cel == empty61) {
            xPos = empty61_x; 
            yPos = empty61_y; 
        }
        else if(cel == empty62) {
            xPos = empty62_x; 
            yPos = empty62_y; 
        }
        else if(cel == empty63) {
            xPos = empty63_x; 
            yPos = empty63_y; 
        }
        else if(cel == empty64) {
            xPos = empty64_x; 
            yPos = empty64_y; 
        }
     
        JLabel pickedLabel = new JLabel();
        
        if(piece.equals("whiteRook1")){
            whiteRook1_x = xPos; 
            whiteRook1_y = yPos; 
        }
        else if(piece.equals("whiteKnight1")){
            whiteKnight1_x = xPos; 
            whiteKnight1_y = yPos; 
        }
        else if(piece.equals("whiteBishop1")){
            whiteBishop1_x = xPos; 
            whiteBishop1_y = yPos; 
        }
        else if(piece.equals("whiteQueen")){
            whiteQueen_x = xPos; 
            whiteQueen_y = yPos; 
        }
        else if(piece.equals("whiteKing")){
            whiteKing_x = xPos; 
            whiteKing_y = yPos; 
        }
        else if(piece.equals("whiteBishop2")){
            whiteBishop2_x = xPos; 
            whiteBishop2_y = yPos; 
        }
        else if(piece.equals("whiteKnight2")){
            whiteKnight2_x = xPos; 
            whiteKnight2_y = yPos; 
        }
        else if(piece.equals("whiteRook2")){
            whiteRook2_x = xPos; 
            whiteRook2_y = yPos; 
        }
        else if(piece.equals("whitePawn1")){
            if(firstMove_Pawn1 == true){
                firstMove_Pawn1 = false;
            }
            whitePawn1_x = xPos; 
            whitePawn1_y = yPos; 
        }
        else if(piece.equals("whitePawn2")){
            if(firstMove_Pawn2 == true){
                firstMove_Pawn2 = false;
            }
            whitePawn2_x = xPos; 
            whitePawn2_y = yPos; 
        }
        else if(piece.equals("whitePawn3")){
            if(firstMove_Pawn3 == true){
                firstMove_Pawn3 = false;
            }
            whitePawn3_x = xPos; 
            whitePawn3_y = yPos; 
        }
        else if(piece.equals("whitePawn4")){
            if(firstMove_Pawn4 == true){
                firstMove_Pawn4 = false;
            }
            whitePawn4_x = xPos; 
            whitePawn4_y = yPos; 
        }
        else if(piece.equals("whitePawn5")){
            if(firstMove_Pawn5 == true){
                firstMove_Pawn5 = false;
            }
            whitePawn5_x = xPos; 
            whitePawn5_y = yPos; 
        }
        else if(piece.equals("whitePawn6")){
            if(firstMove_Pawn6 == true){
                firstMove_Pawn6 = false;
            }
            whitePawn6_x = xPos; 
            whitePawn6_y = yPos; 
        }
        else if(piece.equals("whitePawn7")){
            if(firstMove_Pawn7 == true){
                firstMove_Pawn7 = false;
            }
            whitePawn7_x = xPos; 
            whitePawn7_y = yPos; 
        }
        else if(piece.equals("whitePawn8")){
            if(firstMove_Pawn8 == true){
                firstMove_Pawn8 = false;
            }
            whitePawn8_x = xPos; 
            whitePawn8_y = yPos; 
        }
        else if(piece.equals("blackRook1")){
            pickedLabel = blackRook1; 
            blackRook1_x = xPos; 
            blackRook1_y = yPos; 
        }
        else if(piece.equals("blackKnight1")){
            pickedLabel = blackKnight1; 
            blackKnight1_x = xPos; 
            blackKnight1_y = yPos; 
        }
        else if(piece.equals("blackBishop1")){
            pickedLabel = blackBishop1; 
            blackBishop1_x = xPos; 
            blackBishop1_y = yPos; 
        }
        else if(piece.equals("blackQueen")){
            pickedLabel = blackQueen; 
            blackQueen_x = xPos; 
            blackQueen_y = yPos; 
        }
        else if(piece.equals("blackKing")){
            pickedLabel = blackKing; 
            blackKing_x = xPos; 
            blackKing_y = yPos; 
        }
        else if(piece.equals("blackBishop2")){
            pickedLabel = blackBishop2; 
            blackBishop2_x = xPos; 
            blackBishop2_y = yPos; 
        }
        else if(piece.equals("blackKnight2")){
            pickedLabel = blackKnight2; 
            blackKnight2_x = xPos; 
            blackKnight2_y = yPos; 
        }
        else if(piece.equals("blackRook2")){
            pickedLabel = blackRook2; 
            blackRook2_x = xPos; 
            blackRook2_y = yPos; 
        }
        else if(piece.equals("blackPawn1")){
            pickedLabel = blackPawn1; 
            if(firstMove_Pawn1 == true){
                firstMove_Pawn1 = false;
            }
            blackPawn1_x = xPos; 
            blackPawn1_y = yPos; 
        }
        else if(piece.equals("blackPawn2")){
            pickedLabel = blackPawn2;  
            if(firstMove_Pawn2 == true){
                firstMove_Pawn2 = false;
            }
            blackPawn2_x = xPos; 
            blackPawn2_y = yPos; 
        }
        else if(piece.equals("blackPawn3")){
            pickedLabel = blackPawn3; 
            if(firstMove_Pawn3 == true){
                firstMove_Pawn3 = false;
            }
            blackPawn3_x = xPos; 
            blackPawn3_y = yPos; 
        }
        else if(piece.equals("blackPawn4")){
            pickedLabel = blackPawn4; 
            if(firstMove_Pawn4 == true){
                firstMove_Pawn4 = false;
            }
            blackPawn4_x = xPos; 
            blackPawn4_y = yPos; 
        }
        else if(piece.equals("blackPawn5")){
            pickedLabel = blackPawn5; 
            if(firstMove_Pawn5 == true){
                firstMove_Pawn5 = false;
            }
            blackPawn5_x = xPos; 
            blackPawn5_y = yPos; 
        }
        else if(piece.equals("blackPawn6")){
            pickedLabel = blackPawn6; 
            if(firstMove_Pawn6 == true){
                firstMove_Pawn6 = false;
            }
            blackPawn6_x = xPos; 
            blackPawn6_y = yPos; 
        }
        else if(piece.equals("blackPawn7")){
            pickedLabel = blackPawn7;
            if(firstMove_Pawn7 == true){
                firstMove_Pawn7 = false;
            }
            blackPawn7_x = xPos; 
            blackPawn7_y = yPos; 
        }
        else if(piece.equals("blackPawn8")){
            pickedLabel = blackPawn8; 
            if(firstMove_Pawn8 == true){
                firstMove_Pawn8 = false;
            }
            blackPawn8_x = xPos; 
            blackPawn8_y = yPos; 
        }
        
        if(piece.equals("whitePawn1") || piece.equals("whitePawn2") || piece.equals("whitePawn3") || piece.equals("whitePawn4") ||
                piece.equals("whitePawn5") || piece.equals("whitePawn6") || piece.equals("whitePawn7") || piece.equals("whitePawn8")) {
            
            if(cel == empty1 || cel == empty2 || cel == empty3 || cel == empty4 || cel == empty5 || cel == empty6 || cel == empty7 || cel == empty8) {
                
                if(lastClick.equals("whitePawn1")) {
                    pieceCount = whitePawn1_PieceCount; 
                }
                else if(lastClick.equals("whitePawn2")) {
                    pieceCount = whitePawn2_PieceCount; 
                }
                else if(lastClick.equals("whitePawn3")) {
                    pieceCount = whitePawn3_PieceCount; 
                }
                else if(lastClick.equals("whitePawn4")) {
                    pieceCount = whitePawn4_PieceCount; 
                }
                else if(lastClick.equals("whitePawn5")) {
                    pieceCount = whitePawn5_PieceCount; 
                }
                else if(lastClick.equals("whitePawn6")) {
                    pieceCount = whitePawn6_PieceCount; 
                }
                else if(lastClick.equals("whitePawn7")) {
                    pieceCount = whitePawn7_PieceCount; 
                }
                else if(lastClick.equals("whitePawn8")) {
                    pieceCount = whitePawn8_PieceCount; 
                }

                if(pieceCount == 1) {
                    justKilled = true; 
                    changePromotions("show");
                }
                else {
                    whiteTurn = false; 
                }
                
            }
            else {
                whiteTurn = false; 
            }
            
        } 
        else {
            whiteTurn = false; 
        }
        
        if(piece.equals("blackPawn1") || piece.equals("blackPawn2") || piece.equals("blackPawn3") || piece.equals("blackPawn4") ||
                piece.equals("blackPawn5") || piece.equals("blackPawn6") || piece.equals("blackPawn7") || piece.equals("blackPawn8")) {
            
            if(cel == empty57 || cel == empty58 || cel == empty59 || cel == empty60 || cel == empty61 || cel == empty62 || cel == empty63 || cel == empty64) {
                
                if(lastClick.equals("blackPawn1")) {
                    pieceCount = blackPawn1_PieceCount; 
                }
                else if(lastClick.equals("blackPawn2")) {
                    pieceCount = blackPawn2_PieceCount; 
                }
                else if(lastClick.equals("blackPawn3")) {
                    pieceCount = blackPawn3_PieceCount; 
                }
                else if(lastClick.equals("blackPawn4")) {
                    pieceCount = blackPawn4_PieceCount; 
                }
                else if(lastClick.equals("blackPawn5")) {
                    pieceCount = blackPawn5_PieceCount; 
                }
                else if(lastClick.equals("blackPawn6")) {
                    pieceCount = blackPawn6_PieceCount; 
                }
                else if(lastClick.equals("blackPawn7")) {
                    pieceCount = blackPawn7_PieceCount; 
                }
                else if(lastClick.equals("blackPawn8")) {
                    pieceCount = blackPawn8_PieceCount; 
                }

                if(pieceCount == 1) {
                    justKilled = true; 
                    changePromotions("show");
                }
                else {
                    blackTurn = false; 
                }
                
            }
            else {
                blackTurn = false; 
            }
            
        } 
        else {
            blackTurn = false; 
        }
        
        if(piece.equals("whitePawn1") || piece.equals("whitePawn2") || piece.equals("whitePawn3") || piece.equals("whitePawn4") || piece.equals("whitePawn5") 
                 || piece.equals("whitePawn6") || piece.equals("whitePawn7") || piece.equals("whitePawn8") || piece.equals("whiteRook1") || piece.equals("whiteKnight1") 
                 || piece.equals("whiteBishop1") || piece.equals("whiteQueen") || piece.equals("whiteKing") || piece.equals("whiteBishop2") || piece.equals("whiteKnight2") 
                 || piece.equals("whiteRook2")) {
            notationWhite(piece, cel);
        }
        else if(piece.equals("blackPawn1") || piece.equals("blackPawn2") || piece.equals("blackPawn3") || piece.equals("blackPawn4") || piece.equals("blackPawn5") 
                 || piece.equals("blackPawn6") || piece.equals("blackPawn7") || piece.equals("blackPawn8") || piece.equals("blackRook1") || piece.equals("blackKnight1") 
                 || piece.equals("blackBishop1") || piece.equals("blackQueen") || piece.equals("blackKing") || piece.equals("blackBishop2") || piece.equals("blackKnight2") 
                 || piece.equals("blackRook2")){
            notationBlack(pickedLabel, xPos, yPos);
        }
        
        reloadBounds();
        clearColorEmpty();
        repaint();
        
    }
    
    public void notationWhite(String piece, JLabel cel) {
        
        if(cel == empty1 || cel == empty9 || cel == empty17 || cel == empty25 || cel == empty33 || cel == empty41 || 
                cel == empty49 || cel == empty57) {
            vertical = "a";
        }
        else if(cel == empty2 || cel == empty10 || cel == empty18 || cel == empty26 || cel == empty34 || cel == empty42 || 
                cel == empty50 || cel == empty58) {
            vertical = "b";
        }
        else if(cel == empty3 || cel == empty11 || cel == empty19 || cel == empty27 || cel == empty35 || cel == empty43 || 
                cel == empty51 || cel == empty59) {
            vertical = "c";
        }
        else if(cel == empty4 || cel == empty12 || cel == empty20 || cel == empty28 || cel == empty36 || cel == empty44 || 
                cel == empty52 || cel == empty60) {
            vertical = "d";
        }
        else if(cel == empty5 || cel == empty13 || cel == empty21 || cel == empty29 || cel == empty37 || cel == empty45 || 
                cel == empty53 || cel == empty61) {
            vertical = "e";
        }
        else if(cel == empty6 || cel == empty14 || cel == empty22 || cel == empty30 || cel == empty38 || cel == empty46 || 
                cel == empty54 || cel == empty62) {
            vertical = "f";
        }
        else if(cel == empty7 || cel == empty15 || cel == empty23 || cel == empty31 || cel == empty39 || cel == empty47 || 
                cel == empty55 || cel == empty63) {
            vertical = "g";
        }
        else if(cel == empty8 || cel == empty16 || cel == empty24 || cel == empty32 || cel == empty40 || cel == empty48 || 
                cel == empty56 || cel == empty64) {
            vertical = "h";
        }
        
        if(cel == empty1 || cel == empty2 || cel == empty3 || cel == empty4 || cel == empty5 || cel == empty6
                || cel == empty7 || cel == empty8) {
            horizontal = "1";
        }
        else if(cel == empty9 || cel == empty10 || cel == empty11 || cel == empty12 || cel == empty13 || cel == empty14
                || cel == empty15 || cel == empty16) {
            horizontal = "2";
        }
        else if(cel == empty17 || cel == empty18 || cel == empty19 || cel == empty20 || cel == empty21 || cel == empty22
                || cel == empty23 || cel == empty24) {
            horizontal = "3";
        }
        else if(cel == empty25 || cel == empty26 || cel == empty27 || cel == empty28 || cel == empty29 || cel == empty30
                || cel == empty31 || cel == empty32) {
            horizontal = "4";
        }
        else if(cel == empty33 || cel == empty34 || cel == empty35 || cel == empty36 || cel == empty37 || cel == empty38
                || cel == empty39 || cel == empty40) {
            horizontal = "5";
        }
        else if(cel == empty41 || cel == empty42 || cel == empty43 || cel == empty44 || cel == empty45 || cel == empty46
                || cel == empty47 || cel == empty48) {
            horizontal = "6";
        }
        else if(cel == empty49 || cel == empty50 || cel == empty51 || cel == empty52 || cel == empty53 || cel == empty54
                || cel == empty55 || cel == empty56) {
            horizontal = "7";
        }
        else if(cel == empty57 || cel == empty58 || cel == empty59 || cel == empty60 || cel == empty61 || cel == empty62
                || cel == empty63 || cel == empty64) {
            horizontal = "8";
        }
        
        if(piece == "whiteRook1" || piece == "whiteRook2") {
            lastWhiteWasPawn = false; 
            pieceString = "R";
        }
        else if(piece == "whiteKnight1" || piece == "whiteKnight2") {
            lastWhiteWasPawn = false; 
            pieceString = "N";
        }
        else if(piece == "whiteBishop1" || piece == "whiteBishop2") {
            lastWhiteWasPawn = false; 
            pieceString = "B";
        }
        else if(piece == "whiteQueen") {
            lastWhiteWasPawn = false; 
            pieceString = "Q";
        }
        else if(piece == "whiteKing") {
            lastWhiteWasPawn = false; 
            pieceString = "K";
        }
        else {
            lastWhiteWasPawn = true; 
            pieceString = "";
        }
        
        if(kill == "x") {
            lastWhiteWasKill = true; 
        }
        else {
            lastWhiteWasKill = false; 
        }
        
        if(!gameOver) {
            System.out.print(moveCount + ". " + pieceString + kill + vertical + horizontal);
            moveCount++; 
        }
        
    }
    public void notationBlack(JLabel piece, int x, int y) {
        
        if(piece == blackRook1 || piece == blackRook2) {
            pieceString = "R";
        }
        else if (piece == blackKnight1 || piece == blackKnight2) {
            pieceString = "N";
        }
        else if(piece == blackBishop1 || piece == blackBishop2) {
            pieceString = "B";
        }
        else if(piece == blackQueen) {
            pieceString = "Q";
        }
        else if(piece == blackKing) {
            pieceString = "K";
        }
        else {
            pieceString = "";
        }

        if(empty1_x == x || empty9_x == x || empty17_x == x || empty25_x == x || empty33_x == x 
                || empty41_x == x || empty49_x == x || empty57_x == x) {
            vertical = "a";
        }
        else if(empty2_x == x || empty10_x == x || empty18_x == x || empty26_x == x || empty34_x == x 
                || empty42_x == x || empty50_x == x || empty58_x == x) {
            vertical = "b";
        }
        else if(empty3_x == x || empty11_x == x || empty19_x == x || empty27_x == x || empty35_x == x 
                || empty43_x == x || empty51_x == x || empty59_x == x) {
            vertical = "c";
        }
        else if(empty4_x == x || empty12_x == x || empty20_x == x || empty28_x == x || empty36_x == x 
                || empty44_x == x || empty52_x == x || empty60_x == x) {
            vertical = "d";
        }
        else if(empty5_x == x || empty13_x == x || empty21_x == x || empty29_x == x || empty37_x == x 
                || empty45_x == x || empty53_x == x || empty61_x == x) {
            vertical = "e";
        }
        else if(empty6_x == x || empty14_x == x || empty22_x == x || empty30_x == x || empty38_x == x 
                || empty46_x == x || empty54_x == x || empty62_x == x) {
            vertical = "f";
        }
        else if(empty7_x == x || empty15_x == x || empty23_x == x || empty31_x == x || empty39_x == x 
                || empty47_x == x || empty55_x == x || empty63_x == x) {
            vertical = "g";
        }
        else if(empty8_x == x || empty16_x == x || empty24_x == x || empty32_x == x || empty40_x == x 
                || empty48_x == x || empty56_x == x || empty64_x == x) {
            vertical = "h";
        }
        
        if(empty1_y == y|| empty2_y == y || empty3_y == y || empty4_y == y || empty5_y == y
                || empty6_y == y || empty7_y == y || empty8_y == y) {
            horizontal = "1";
        }
        else if(empty9_y == y|| empty10_y == y || empty11_y == y || empty12_y == y || empty13_y == y
                || empty14_y == y || empty15_y == y || empty16_y == y) {
            horizontal = "2";
        }
        else if(empty17_y == y|| empty18_y == y || empty19_y == y || empty20_y == y || empty21_y == y
                || empty22_y == y || empty23_y == y || empty24_y == y) {
            horizontal = "3";
        }
        else if(empty25_y == y|| empty26_y == y || empty27_y == y || empty28_y == y || empty29_y == y
                || empty30_y == y || empty31_y == y || empty32_y == y) {
            horizontal = "4";
        }
        else if(empty33_y == y|| empty34_y == y || empty35_y == y || empty36_y == y || empty37_y == y
                || empty38_y == y || empty39_y == y || empty40_y == y) {
            horizontal = "5";
        }
        else if(empty41_y == y|| empty42_y == y || empty43_y == y || empty44_y == y || empty45_y == y
                || empty46_y == y || empty47_y == y || empty48_y == y) {
            horizontal = "6";
        }
        else if(empty49_y == y|| empty50_y == y || empty51_y == y || empty52_y == y || empty53_y == y
                || empty54_y == y || empty55_y == y || empty56_y == y) {
            horizontal = "7";
        }
        else if(empty57_y == y|| empty58_y == y || empty59_y == y || empty60_y == y || empty61_y == y
                || empty62_y == y || empty63_y == y || empty64_y == y) {
            horizontal = "8";
        }
        
        if(!gameOver) {
            if(moveCount <= 10)  {
                if(queenCastle) {
                    System.out.println("     " + pieceString + kill + vertical + horizontal);
                }
                else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                    System.out.println("      " + pieceString + kill + vertical + horizontal);
                }
                else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                    System.out.println("       " + pieceString + kill + vertical + horizontal);
                }
                else {
                    System.out.println("        " + pieceString + kill + vertical + horizontal);
                }
            }
            else {
                if(queenCastle) {
                    System.out.println("    " + pieceString + kill + vertical + horizontal);
                }
                else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                    System.out.println("     " + pieceString + kill + vertical + horizontal);
                }
                else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                    System.out.println("      " + pieceString + kill + vertical + horizontal);
                }
                else {
                    System.out.println("       " + pieceString + kill + vertical + horizontal);
                }
            }
        }
        
        
    }
    public int getEmptyCelCoordX(JLabel cel) {
        
        if(cel == empty1) {
            xPos = empty1_x; 
            yPos = empty1_y; 
        }
        else if(cel == empty2) {
            xPos = empty2_x; 
            yPos = empty2_y; 
        } 
        else if(cel == empty3) {
            xPos = empty3_x; 
            yPos = empty3_y; 
        }
        else if(cel == empty4) {
            xPos = empty4_x; 
            yPos = empty4_y; 
        } 
        else if(cel == empty5) {
            xPos = empty5_x; 
            yPos = empty5_y; 
        }
        else if(cel == empty6) {
            xPos = empty6_x; 
            yPos = empty6_y; 
        } 
        else if(cel == empty7) {
            xPos = empty7_x; 
            yPos = empty7_y; 
        }
        else if(cel == empty8) {
            xPos = empty8_x; 
            yPos = empty8_y; 
        } 
        else if(cel == empty9) {
            xPos = empty9_x; 
            yPos = empty9_y; 
        }
        else if(cel == empty10) {
            xPos = empty10_x; 
            yPos = empty10_y; 
        }
        else if(cel == empty11) {
            xPos = empty11_x; 
            yPos = empty11_y; 
        }
        else if(cel == empty12) {
            xPos = empty12_x; 
            yPos = empty12_y; 
        }
        else if(cel == empty13) {
            xPos = empty13_x; 
            yPos = empty13_y; 
        }
        else if(cel == empty14) {
            xPos = empty14_x; 
            yPos = empty14_y; 
        }
        else if(cel == empty15) {
            xPos = empty15_x; 
            yPos = empty15_y; 
        }
        else if(cel == empty16) {
            xPos = empty16_x; 
            yPos = empty16_y; 
        }
        else if(cel == empty17) {
            xPos = empty17_x; 
            yPos = empty17_y; 
        }
        else if(cel == empty18) {
            xPos = empty18_x; 
            yPos = empty18_y; 
        }
        else if(cel == empty19) {
            xPos = empty19_x; 
            yPos = empty19_y; 
        }
        else if(cel == empty20) {
            xPos = empty20_x; 
            yPos = empty20_y; 
        }
        else if(cel == empty21) {
            xPos = empty21_x; 
            yPos = empty21_y; 
        }
        else if(cel == empty22) {
            xPos = empty22_x; 
            yPos = empty22_y; 
        }
        else if(cel == empty23) {
            xPos = empty23_x; 
            yPos = empty23_y; 
        }
        else if(cel == empty24) {
            xPos = empty24_x; 
            yPos = empty24_y; 
        }
        else if(cel == empty25) {
            xPos = empty25_x; 
            yPos = empty25_y; 
        }
        else if(cel == empty26) {
            xPos = empty26_x; 
            yPos = empty26_y; 
        }
        else if(cel == empty27) {
            xPos = empty27_x; 
            yPos = empty27_y; 
        }
        else if(cel == empty28) {
            xPos = empty28_x; 
            yPos = empty28_y; 
        }
        else if(cel == empty29) {
            xPos = empty29_x; 
            yPos = empty29_y; 
        }
        else if(cel == empty30) {
            xPos = empty30_x; 
            yPos = empty30_y; 
        }
        else if(cel == empty31) {
            xPos = empty31_x; 
            yPos = empty31_y; 
        }
        else if(cel == empty32) {
            xPos = empty32_x; 
            yPos = empty32_y; 
        }
        else if(cel == empty33) {
            xPos = empty33_x; 
            yPos = empty33_y; 
        }
        else if(cel == empty34) {
            xPos = empty34_x; 
            yPos = empty34_y; 
        }
        else if(cel == empty35) {
            xPos = empty35_x; 
            yPos = empty35_y; 
        }
        else if(cel == empty36) {
            xPos = empty36_x; 
            yPos = empty36_y; 
        }
        else if(cel == empty37) {
            xPos = empty37_x; 
            yPos = empty37_y; 
        }
        else if(cel == empty38) {
            xPos = empty38_x; 
            yPos = empty38_y; 
        }
        else if(cel == empty39) {
            xPos = empty39_x; 
            yPos = empty39_y; 
        }
        else if(cel == empty40) {
            xPos = empty40_x; 
            yPos = empty40_y; 
        }
        else if(cel == empty41) {
            xPos = empty41_x; 
            yPos = empty41_y; 
        }
        else if(cel == empty42) {
            xPos = empty42_x; 
            yPos = empty42_y; 
        }
        else if(cel == empty43) {
            xPos = empty43_x; 
            yPos = empty43_y; 
        }
        else if(cel == empty44) {
            xPos = empty44_x; 
            yPos = empty44_y; 
        }
        else if(cel == empty45) {
            xPos = empty45_x; 
            yPos = empty45_y; 
        }
        else if(cel == empty46) {
            xPos = empty46_x; 
            yPos = empty46_y; 
        }
        else if(cel == empty47) {
            xPos = empty47_x; 
            yPos = empty47_y; 
        }
        else if(cel == empty48) {
            xPos = empty48_x; 
            yPos = empty48_y; 
        }
        else if(cel == empty49) {
            xPos = empty49_x; 
            yPos = empty49_y; 
        }
        else if(cel == empty50) {
            xPos = empty50_x; 
            yPos = empty50_y; 
        }
        else if(cel == empty51) {
            xPos = empty51_x; 
            yPos = empty51_y; 
        }
        else if(cel == empty52) {
            xPos = empty52_x; 
            yPos = empty52_y; 
        }
        else if(cel == empty53) {
            xPos = empty53_x; 
            yPos = empty53_y; 
        }
        else if(cel == empty54) {
            xPos = empty54_x; 
            yPos = empty54_y; 
        }
        else if(cel == empty55) {
            xPos = empty55_x; 
            yPos = empty55_y; 
        }
        else if(cel == empty56) {
            xPos = empty56_x; 
            yPos = empty56_y; 
        }
        else if(cel == empty57) {
            xPos = empty57_x; 
            yPos = empty57_y; 
        }
        else if(cel == empty58) {
            xPos = empty58_x; 
            yPos = empty58_y; 
        }
        else if(cel == empty59) {
            xPos = empty59_x; 
            yPos = empty59_y; 
        }
        else if(cel == empty60) {
            xPos = empty60_x; 
            yPos = empty60_y; 
        }
        else if(cel == empty61) {
            xPos = empty61_x; 
            yPos = empty61_y; 
        }
        else if(cel == empty62) {
            xPos = empty62_x; 
            yPos = empty62_y; 
        }
        else if(cel == empty63) {
            xPos = empty63_x; 
            yPos = empty63_y; 
        }
        else if(cel == empty64) {
            xPos = empty64_x; 
            yPos = empty64_y; 
        }
        
        return xPos; 
        
    }
    public int getEmptyCelCoordY(JLabel cel) {
        
        if(cel == empty1) {
            xPos = empty1_x; 
            yPos = empty1_y; 
        }
        else if(cel == empty2) {
            xPos = empty2_x; 
            yPos = empty2_y; 
        } 
        else if(cel == empty3) {
            xPos = empty3_x; 
            yPos = empty3_y; 
        }
        else if(cel == empty4) {
            xPos = empty4_x; 
            yPos = empty4_y; 
        } 
        else if(cel == empty5) {
            xPos = empty5_x; 
            yPos = empty5_y; 
        }
        else if(cel == empty6) {
            xPos = empty6_x; 
            yPos = empty6_y; 
        } 
        else if(cel == empty7) {
            xPos = empty7_x; 
            yPos = empty7_y; 
        }
        else if(cel == empty8) {
            xPos = empty8_x; 
            yPos = empty8_y; 
        } 
        else if(cel == empty9) {
            xPos = empty9_x; 
            yPos = empty9_y; 
        }
        else if(cel == empty10) {
            xPos = empty10_x; 
            yPos = empty10_y; 
        }
        else if(cel == empty11) {
            xPos = empty11_x; 
            yPos = empty11_y; 
        }
        else if(cel == empty12) {
            xPos = empty12_x; 
            yPos = empty12_y; 
        }
        else if(cel == empty13) {
            xPos = empty13_x; 
            yPos = empty13_y; 
        }
        else if(cel == empty14) {
            xPos = empty14_x; 
            yPos = empty14_y; 
        }
        else if(cel == empty15) {
            xPos = empty15_x; 
            yPos = empty15_y; 
        }
        else if(cel == empty16) {
            xPos = empty16_x; 
            yPos = empty16_y; 
        }
        else if(cel == empty17) {
            xPos = empty17_x; 
            yPos = empty17_y; 
        }
        else if(cel == empty18) {
            xPos = empty18_x; 
            yPos = empty18_y; 
        }
        else if(cel == empty19) {
            xPos = empty19_x; 
            yPos = empty19_y; 
        }
        else if(cel == empty20) {
            xPos = empty20_x; 
            yPos = empty20_y; 
        }
        else if(cel == empty21) {
            xPos = empty21_x; 
            yPos = empty21_y; 
        }
        else if(cel == empty22) {
            xPos = empty22_x; 
            yPos = empty22_y; 
        }
        else if(cel == empty23) {
            xPos = empty23_x; 
            yPos = empty23_y; 
        }
        else if(cel == empty24) {
            xPos = empty24_x; 
            yPos = empty24_y; 
        }
        else if(cel == empty25) {
            xPos = empty25_x; 
            yPos = empty25_y; 
        }
        else if(cel == empty26) {
            xPos = empty26_x; 
            yPos = empty26_y; 
        }
        else if(cel == empty27) {
            xPos = empty27_x; 
            yPos = empty27_y; 
        }
        else if(cel == empty28) {
            xPos = empty28_x; 
            yPos = empty28_y; 
        }
        else if(cel == empty29) {
            xPos = empty29_x; 
            yPos = empty29_y; 
        }
        else if(cel == empty30) {
            xPos = empty30_x; 
            yPos = empty30_y; 
        }
        else if(cel == empty31) {
            xPos = empty31_x; 
            yPos = empty31_y; 
        }
        else if(cel == empty32) {
            xPos = empty32_x; 
            yPos = empty32_y; 
        }
        else if(cel == empty33) {
            xPos = empty33_x; 
            yPos = empty33_y; 
        }
        else if(cel == empty34) {
            xPos = empty34_x; 
            yPos = empty34_y; 
        }
        else if(cel == empty35) {
            xPos = empty35_x; 
            yPos = empty35_y; 
        }
        else if(cel == empty36) {
            xPos = empty36_x; 
            yPos = empty36_y; 
        }
        else if(cel == empty37) {
            xPos = empty37_x; 
            yPos = empty37_y; 
        }
        else if(cel == empty38) {
            xPos = empty38_x; 
            yPos = empty38_y; 
        }
        else if(cel == empty39) {
            xPos = empty39_x; 
            yPos = empty39_y; 
        }
        else if(cel == empty40) {
            xPos = empty40_x; 
            yPos = empty40_y; 
        }
        else if(cel == empty41) {
            xPos = empty41_x; 
            yPos = empty41_y; 
        }
        else if(cel == empty42) {
            xPos = empty42_x; 
            yPos = empty42_y; 
        }
        else if(cel == empty43) {
            xPos = empty43_x; 
            yPos = empty43_y; 
        }
        else if(cel == empty44) {
            xPos = empty44_x; 
            yPos = empty44_y; 
        }
        else if(cel == empty45) {
            xPos = empty45_x; 
            yPos = empty45_y; 
        }
        else if(cel == empty46) {
            xPos = empty46_x; 
            yPos = empty46_y; 
        }
        else if(cel == empty47) {
            xPos = empty47_x; 
            yPos = empty47_y; 
        }
        else if(cel == empty48) {
            xPos = empty48_x; 
            yPos = empty48_y; 
        }
        else if(cel == empty49) {
            xPos = empty49_x; 
            yPos = empty49_y; 
        }
        else if(cel == empty50) {
            xPos = empty50_x; 
            yPos = empty50_y; 
        }
        else if(cel == empty51) {
            xPos = empty51_x; 
            yPos = empty51_y; 
        }
        else if(cel == empty52) {
            xPos = empty52_x; 
            yPos = empty52_y; 
        }
        else if(cel == empty53) {
            xPos = empty53_x; 
            yPos = empty53_y; 
        }
        else if(cel == empty54) {
            xPos = empty54_x; 
            yPos = empty54_y; 
        }
        else if(cel == empty55) {
            xPos = empty55_x; 
            yPos = empty55_y; 
        }
        else if(cel == empty56) {
            xPos = empty56_x; 
            yPos = empty56_y; 
        }
        else if(cel == empty57) {
            xPos = empty57_x; 
            yPos = empty57_y; 
        }
        else if(cel == empty58) {
            xPos = empty58_x; 
            yPos = empty58_y; 
        }
        else if(cel == empty59) {
            xPos = empty59_x; 
            yPos = empty59_y; 
        }
        else if(cel == empty60) {
            xPos = empty60_x; 
            yPos = empty60_y; 
        }
        else if(cel == empty61) {
            xPos = empty61_x; 
            yPos = empty61_y; 
        }
        else if(cel == empty62) {
            xPos = empty62_x; 
            yPos = empty62_y; 
        }
        else if(cel == empty63) {
            xPos = empty63_x; 
            yPos = empty63_y; 
        }
        else if(cel == empty64) {
            xPos = empty64_x; 
            yPos = empty64_y; 
        }
        
        return yPos; 
        
    }
    
    public void visibilityUnderDrawing(String color, boolean b) {

        if(b == false) {
            if(color.equals("white")) {

                if(whitePawn1_x == whitePro_x && (whitePawn1_y == whiteQueenPro_y || whitePawn1_y == whiteKnightPro_y || whitePawn1_y == whiteRookPro_y || whitePawn1_y == whiteBishopPro_y)) {
                    whitePawn1.setVisible(false);
                }
                else if(whitePawn2_x == whitePro_x && (whitePawn2_y == whiteQueenPro_y || whitePawn2_y == whiteKnightPro_y || whitePawn2_y == whiteRookPro_y || whitePawn2_y == whiteBishopPro_y)) {
                    whitePawn2.setVisible(false);
                }
                else if(whitePawn3_x == whitePro_x && (whitePawn3_y == whiteQueenPro_y || whitePawn3_y == whiteKnightPro_y || whitePawn3_y == whiteRookPro_y || whitePawn3_y == whiteBishopPro_y)) {
                    whitePawn3.setVisible(false);
                }
                else if(whitePawn4_x == whitePro_x && (whitePawn4_y == whiteQueenPro_y || whitePawn4_y == whiteKnightPro_y || whitePawn4_y == whiteRookPro_y || whitePawn4_y == whiteBishopPro_y)) {
                    whitePawn4.setVisible(false);
                }
                else if(whitePawn5_x == whitePro_x && (whitePawn5_y == whiteQueenPro_y || whitePawn5_y == whiteKnightPro_y || whitePawn5_y == whiteRookPro_y || whitePawn5_y == whiteBishopPro_y)) {
                    whitePawn5.setVisible(false);
                }
                else if(whitePawn6_x == whitePro_x && (whitePawn6_y == whiteQueenPro_y || whitePawn6_y == whiteKnightPro_y || whitePawn6_y == whiteRookPro_y || whitePawn6_y == whiteBishopPro_y)) {
                    whitePawn6.setVisible(false);
                }
                else if(whitePawn7_x == whitePro_x && (whitePawn7_y == whiteQueenPro_y || whitePawn7_y == whiteKnightPro_y || whitePawn7_y == whiteRookPro_y || whitePawn7_y == whiteBishopPro_y)) {
                    whitePawn7.setVisible(false);
                }
                else if(whitePawn8_x == whitePro_x && (whitePawn8_y == whiteQueenPro_y || whitePawn8_y == whiteKnightPro_y || whitePawn8_y == whiteRookPro_y || whitePawn8_y == whiteBishopPro_y)) {
                    whitePawn8.setVisible(false);
                }
                else if(whiteRook1_x == whitePro_x && (whiteRook1_y == whiteQueenPro_y || whiteRook1_y == whiteKnightPro_y || whiteRook1_y == whiteRookPro_y || whiteRook1_y == whiteBishopPro_y)) {
                    whiteRook1.setVisible(false);
                }
                else if(whiteKnight1_x == whitePro_x && (whiteKnight1_y == whiteQueenPro_y || whiteKnight1_y == whiteKnightPro_y || whiteKnight1_y == whiteRookPro_y || whiteKnight1_y == whiteBishopPro_y)) {
                    whiteKnight1.setVisible(false);
                }
                else if(whiteBishop1_x == whitePro_x && (whiteBishop1_y == whiteQueenPro_y || whiteBishop1_y == whiteKnightPro_y || whiteBishop1_y == whiteRookPro_y || whiteBishop1_y == whiteBishopPro_y)) {
                    whiteBishop1.setVisible(false);
                }
                else if(whiteQueen_x == whitePro_x && (whiteQueen_y == whiteQueenPro_y || whiteQueen_y == whiteKnightPro_y || whiteQueen_y == whiteRookPro_y || whiteQueen_y == whiteBishopPro_y)) {
                    whiteQueen.setVisible(false);
                }
                else if(whiteKing_x == whitePro_x && (whiteKing_y == whiteQueenPro_y || whiteKing_y == whiteKnightPro_y || whiteKing_y == whiteRookPro_y || whiteKing_y == whiteBishopPro_y)) {
                    whiteKing.setVisible(false);
                }
                else if(whiteBishop2_x == whitePro_x && (whiteBishop2_y == whiteQueenPro_y || whiteBishop2_y == whiteKnightPro_y || whiteBishop2_y == whiteRookPro_y || whiteBishop2_y == whiteBishopPro_y)) {
                    whiteBishop2.setVisible(false);
                }
                else if(whiteKnight2_x == whitePro_x && (whiteKnight2_y == whiteQueenPro_y || whiteKnight2_y == whiteKnightPro_y || whiteKnight2_y == whiteRookPro_y || whiteKnight2_y == whiteBishopPro_y)) {
                    whiteKnight2.setVisible(false);
                }
                else if(whiteRook2_x == whitePro_x && (whiteRook2_y == whiteQueenPro_y || whiteRook2_y == whiteKnightPro_y || whiteRook2_y == whiteRookPro_y || whiteRook2_y == whiteBishopPro_y)) {
                    whiteRook2.setVisible(false);
                }
                else if(blackPawn1_x == whitePro_x && (blackPawn1_y == whiteQueenPro_y || blackPawn1_y == whiteKnightPro_y || blackPawn1_y == whiteRookPro_y || blackPawn1_y == whiteBishopPro_y)) {
                    blackPawn1.setVisible(false);
                }
                else if(blackPawn2_x == whitePro_x && (blackPawn2_y == whiteQueenPro_y || blackPawn2_y == whiteKnightPro_y || blackPawn2_y == whiteRookPro_y || blackPawn2_y == whiteBishopPro_y)) {
                    blackPawn2.setVisible(false);
                }
                else if(blackPawn3_x == whitePro_x && (blackPawn3_y == whiteQueenPro_y || blackPawn3_y == whiteKnightPro_y || blackPawn3_y == whiteRookPro_y || blackPawn3_y == whiteBishopPro_y)) {
                    blackPawn3.setVisible(false);
                }
                else if(blackPawn4_x == whitePro_x && (blackPawn4_y == whiteQueenPro_y || blackPawn4_y == whiteKnightPro_y || blackPawn4_y == whiteRookPro_y || blackPawn4_y == whiteBishopPro_y)) {
                    blackPawn4.setVisible(false);
                }
                else if(blackPawn5_x == whitePro_x && (blackPawn5_y == whiteQueenPro_y || blackPawn5_y == whiteKnightPro_y || blackPawn5_y == whiteRookPro_y || blackPawn5_y == whiteBishopPro_y)) {
                    blackPawn5.setVisible(false);
                }
                else if(blackPawn6_x == whitePro_x && (blackPawn6_y == whiteQueenPro_y || blackPawn6_y == whiteKnightPro_y || blackPawn6_y == whiteRookPro_y || blackPawn6_y == whiteBishopPro_y)) {
                    blackPawn6.setVisible(false);
                }
                else if(blackPawn7_x == whitePro_x && (blackPawn7_y == whiteQueenPro_y || blackPawn7_y == whiteKnightPro_y || blackPawn7_y == whiteRookPro_y || blackPawn7_y == whiteBishopPro_y)) {
                    blackPawn7.setVisible(false);
                }
                else if(blackPawn8_x == whitePro_x && (blackPawn8_y == whiteQueenPro_y || blackPawn8_y == whiteKnightPro_y || blackPawn8_y == whiteRookPro_y || blackPawn8_y == whiteBishopPro_y)) {
                    blackPawn8.setVisible(false);
                }
                else if(blackRook1_x == whitePro_x && (blackRook1_y == whiteQueenPro_y || blackRook1_y == whiteKnightPro_y || blackRook1_y == whiteRookPro_y || blackRook1_y == whiteBishopPro_y)) {
                    blackRook1.setVisible(false);
                }
                else if(blackKnight1_x == whitePro_x && (blackKnight1_y == whiteQueenPro_y || blackKnight1_y == whiteKnightPro_y || blackKnight1_y == whiteRookPro_y || blackKnight1_y == whiteBishopPro_y)) {
                    blackKnight1.setVisible(false);
                }
                else if(blackBishop1_x == whitePro_x && (blackBishop1_y == whiteQueenPro_y || blackBishop1_y == whiteKnightPro_y || blackBishop1_y == whiteRookPro_y || blackBishop1_y == whiteBishopPro_y)) {
                    blackBishop1.setVisible(false);
                }
                else if(blackQueen_x == whitePro_x && (blackQueen_y == whiteQueenPro_y || blackQueen_y == whiteKnightPro_y || blackQueen_y == whiteRookPro_y || blackQueen_y == whiteBishopPro_y)) {
                    whiteQueen.setVisible(false);
                }
                else if(blackKing_x == whitePro_x && (blackKing_y == whiteQueenPro_y || blackKing_y == whiteKnightPro_y || blackKing_y == whiteRookPro_y || blackKing_y == whiteBishopPro_y)) {
                    whiteKing.setVisible(false);
                }
                else if(blackBishop2_x == whitePro_x && (blackBishop2_y == whiteQueenPro_y || blackBishop2_y == whiteKnightPro_y || blackBishop2_y == whiteRookPro_y || blackBishop2_y == whiteBishopPro_y)) {
                    blackBishop2.setVisible(false);
                }
                else if(blackKnight2_x == whitePro_x && (blackKnight2_y == whiteQueenPro_y || blackKnight2_y == whiteKnightPro_y || blackKnight2_y == whiteRookPro_y || blackKnight2_y == whiteBishopPro_y)) {
                    blackKnight2.setVisible(false);
                }
                else if(blackRook2_x == whitePro_x && (blackRook2_y == whiteQueenPro_y || blackRook2_y == whiteKnightPro_y || blackRook2_y == whiteRookPro_y || blackRook2_y == whiteBishopPro_y)) {
                    blackRook2.setVisible(false);
                }

            }
            else if(color.equals("black")) {

                if(whitePawn1_x == blackPro_x && (whitePawn1_y == blackQueenPro_y || whitePawn1_y == blackKnightPro_y || whitePawn1_y == blackRookPro_y || whitePawn1_y == blackBishopPro_y)) {
                    whitePawn1.setVisible(false);
                }
                else if(whitePawn2_x == blackPro_x && (whitePawn2_y == blackQueenPro_y || whitePawn2_y == blackKnightPro_y || whitePawn2_y == blackRookPro_y || whitePawn2_y == blackBishopPro_y)) {
                    whitePawn2.setVisible(false);
                }
                else if(whitePawn3_x == blackPro_x && (whitePawn3_y == blackQueenPro_y || whitePawn3_y == blackKnightPro_y || whitePawn3_y == blackRookPro_y || whitePawn3_y == blackBishopPro_y)) {
                    whitePawn3.setVisible(false);
                }
                else if(whitePawn4_x == blackPro_x && (whitePawn4_y == blackQueenPro_y || whitePawn4_y == blackKnightPro_y || whitePawn4_y == blackRookPro_y || whitePawn4_y == blackBishopPro_y)) {
                    whitePawn4.setVisible(false);
                }
                else if(whitePawn5_x == blackPro_x && (whitePawn5_y == blackQueenPro_y || whitePawn5_y == blackKnightPro_y || whitePawn5_y == blackRookPro_y || whitePawn5_y == blackBishopPro_y)) {
                    whitePawn5.setVisible(false);
                }
                else if(whitePawn6_x == blackPro_x && (whitePawn6_y == blackQueenPro_y || whitePawn6_y == blackKnightPro_y || whitePawn6_y == blackRookPro_y || whitePawn6_y == blackBishopPro_y)) {
                    whitePawn6.setVisible(false);
                }
                else if(whitePawn7_x == blackPro_x && (whitePawn7_y == blackQueenPro_y || whitePawn7_y == blackKnightPro_y || whitePawn7_y == blackRookPro_y || whitePawn7_y == blackBishopPro_y)) {
                    whitePawn7.setVisible(false);
                }
                else if(whitePawn8_x == blackPro_x && (whitePawn8_y == blackQueenPro_y || whitePawn8_y == blackKnightPro_y || whitePawn8_y == blackRookPro_y || whitePawn8_y == blackBishopPro_y)) {
                    whitePawn8.setVisible(false);
                }
                else if(whiteRook1_x == blackPro_x && (whiteRook1_y == blackQueenPro_y || whiteRook1_y == blackKnightPro_y || whiteRook1_y == blackRookPro_y || whiteRook1_y == blackBishopPro_y)) {
                    whiteRook1.setVisible(false);
                }
                else if(whiteKnight1_x == blackPro_x && (whiteKnight1_y == blackQueenPro_y || whiteKnight1_y == blackKnightPro_y || whiteKnight1_y == blackRookPro_y || whiteKnight1_y == blackBishopPro_y)) {
                    whiteKnight1.setVisible(false);
                }
                else if(whiteBishop1_x == blackPro_x && (whiteBishop1_y == blackQueenPro_y || whiteBishop1_y == blackKnightPro_y || whiteBishop1_y == blackRookPro_y || whiteBishop1_y == blackBishopPro_y)) {
                    whiteBishop1.setVisible(false);
                }
                else if(whiteQueen_x == blackPro_x && (whiteQueen_y == blackQueenPro_y || whiteQueen_y == blackKnightPro_y || whiteQueen_y == blackRookPro_y || whiteQueen_y == blackBishopPro_y)) {
                    whiteQueen.setVisible(false);
                }
                else if(whiteKing_x == blackPro_x && (whiteKing_y == blackQueenPro_y || whiteKing_y == blackKnightPro_y || whiteKing_y == blackRookPro_y || whiteKing_y == blackBishopPro_y)) {
                    whiteKing.setVisible(false);
                }
                else if(whiteBishop2_x == blackPro_x && (whiteBishop2_y == blackQueenPro_y || whiteBishop2_y == blackKnightPro_y || whiteBishop2_y == blackRookPro_y || whiteBishop2_y == blackBishopPro_y)) {
                    whiteBishop2.setVisible(false);
                }
                else if(whiteKnight2_x == blackPro_x && (whiteKnight2_y == blackQueenPro_y || whiteKnight2_y == blackKnightPro_y || whiteKnight2_y == blackRookPro_y || whiteKnight2_y == blackBishopPro_y)) {
                    whiteKnight2.setVisible(false);
                }
                else if(whiteRook2_x == blackPro_x && (whiteRook2_y == blackQueenPro_y || whiteRook2_y == blackKnightPro_y || whiteRook2_y == blackRookPro_y || whiteRook2_y == blackBishopPro_y)) {
                    whiteRook2.setVisible(false);
                }
                else if(blackPawn1_x == blackPro_x && (blackPawn1_y == blackQueenPro_y || blackPawn1_y == blackKnightPro_y || blackPawn1_y == blackRookPro_y || blackPawn1_y == blackBishopPro_y)) {
                    blackPawn1.setVisible(false);
                }
                else if(blackPawn2_x == blackPro_x && (blackPawn2_y == blackQueenPro_y || blackPawn2_y == blackKnightPro_y || blackPawn2_y == blackRookPro_y || blackPawn2_y == blackBishopPro_y)) {
                    blackPawn2.setVisible(false);
                }
                else if(blackPawn3_x == blackPro_x && (blackPawn3_y == blackQueenPro_y || blackPawn3_y == blackKnightPro_y || blackPawn3_y == blackRookPro_y || blackPawn3_y == blackBishopPro_y)) {
                    blackPawn3.setVisible(false);
                }
                else if(blackPawn4_x == blackPro_x && (blackPawn4_y == blackQueenPro_y || blackPawn4_y == blackKnightPro_y || blackPawn4_y == blackRookPro_y || blackPawn4_y == blackBishopPro_y)) {
                    blackPawn4.setVisible(false);
                }
                else if(blackPawn5_x == blackPro_x && (blackPawn5_y == blackQueenPro_y || blackPawn5_y == blackKnightPro_y || blackPawn5_y == blackRookPro_y || blackPawn5_y == blackBishopPro_y)) {
                    blackPawn5.setVisible(false);
                }
                else if(blackPawn6_x == blackPro_x && (blackPawn6_y == blackQueenPro_y || blackPawn6_y == blackKnightPro_y || blackPawn6_y == blackRookPro_y || blackPawn6_y == blackBishopPro_y)) {
                    blackPawn6.setVisible(false);
                }
                else if(blackPawn7_x == blackPro_x && (blackPawn7_y == blackQueenPro_y || blackPawn7_y == blackKnightPro_y || blackPawn7_y == blackRookPro_y || blackPawn7_y == blackBishopPro_y)) {
                    blackPawn7.setVisible(false);
                }
                else if(blackPawn8_x == blackPro_x && (blackPawn8_y == blackQueenPro_y || blackPawn8_y == blackKnightPro_y || blackPawn8_y == blackRookPro_y || blackPawn8_y == blackBishopPro_y)) {
                    blackPawn8.setVisible(false);
                }
                else if(blackRook1_x == blackPro_x && (blackRook1_y == blackQueenPro_y || blackRook1_y == blackKnightPro_y || blackRook1_y == blackRookPro_y || blackRook1_y == blackBishopPro_y)) {
                    blackRook1.setVisible(false);
                }
                else if(blackKnight1_x == blackPro_x && (blackKnight1_y == blackQueenPro_y || blackKnight1_y == blackKnightPro_y || blackKnight1_y == blackRookPro_y || blackKnight1_y == blackBishopPro_y)) {
                    blackKnight1.setVisible(false);
                }
                else if(blackBishop1_x == blackPro_x && (blackBishop1_y == blackQueenPro_y || blackBishop1_y == blackKnightPro_y || blackBishop1_y == blackRookPro_y || blackBishop1_y == blackBishopPro_y)) {
                    blackBishop1.setVisible(false);
                }
                else if(blackQueen_x == blackPro_x && (blackQueen_y == blackQueenPro_y || blackQueen_y == blackKnightPro_y || blackQueen_y == blackRookPro_y || blackQueen_y == blackBishopPro_y)) {
                    whiteQueen.setVisible(false);
                }
                else if(blackKing_x == blackPro_x && (blackKing_y == blackQueenPro_y || blackKing_y == blackKnightPro_y || blackKing_y == blackRookPro_y || blackKing_y == blackBishopPro_y)) {
                    whiteKing.setVisible(false);
                }
                else if(blackBishop2_x == blackPro_x && (blackBishop2_y == blackQueenPro_y || blackBishop2_y == blackKnightPro_y || blackBishop2_y == blackRookPro_y || blackBishop2_y == blackBishopPro_y)) {
                    blackBishop2.setVisible(false);
                }
                else if(blackKnight2_x == blackPro_x && (blackKnight2_y == blackQueenPro_y || blackKnight2_y == blackKnightPro_y || blackKnight2_y == blackRookPro_y || blackKnight2_y == blackBishopPro_y)) {
                    blackKnight2.setVisible(false);
                }
                else if(blackRook2_x == blackPro_x && (blackRook2_y == blackQueenPro_y || blackRook2_y == blackKnightPro_y || blackRook2_y == blackRookPro_y || blackRook2_y == blackBishopPro_y)) {
                    blackRook2.setVisible(false);
                }
            }
        }
        else  {
            if(color.equals("white")) {
            
                if(whitePawn1_x == whitePro_x && (whitePawn1_y == whiteQueenPro_y || whitePawn1_y == whiteKnightPro_y || whitePawn1_y == whiteRookPro_y || whitePawn1_y == whiteBishopPro_y)) {
                    whitePawn1.setVisible(true);
                }
                else if(whitePawn2_x == whitePro_x && (whitePawn2_y == whiteQueenPro_y || whitePawn2_y == whiteKnightPro_y || whitePawn2_y == whiteRookPro_y || whitePawn2_y == whiteBishopPro_y)) {
                    whitePawn2.setVisible(true);
                }
                else if(whitePawn3_x == whitePro_x && (whitePawn3_y == whiteQueenPro_y || whitePawn3_y == whiteKnightPro_y || whitePawn3_y == whiteRookPro_y || whitePawn3_y == whiteBishopPro_y)) {
                    whitePawn3.setVisible(true);
                }
                else if(whitePawn4_x == whitePro_x && (whitePawn4_y == whiteQueenPro_y || whitePawn4_y == whiteKnightPro_y || whitePawn4_y == whiteRookPro_y || whitePawn4_y == whiteBishopPro_y)) {
                    whitePawn4.setVisible(true);
                }
                else if(whitePawn5_x == whitePro_x && (whitePawn5_y == whiteQueenPro_y || whitePawn5_y == whiteKnightPro_y || whitePawn5_y == whiteRookPro_y || whitePawn5_y == whiteBishopPro_y)) {
                    whitePawn5.setVisible(true);
                }
                else if(whitePawn6_x == whitePro_x && (whitePawn6_y == whiteQueenPro_y || whitePawn6_y == whiteKnightPro_y || whitePawn6_y == whiteRookPro_y || whitePawn6_y == whiteBishopPro_y)) {
                    whitePawn6.setVisible(true);
                }
                else if(whitePawn7_x == whitePro_x && (whitePawn7_y == whiteQueenPro_y || whitePawn7_y == whiteKnightPro_y || whitePawn7_y == whiteRookPro_y || whitePawn7_y == whiteBishopPro_y)) {
                    whitePawn7.setVisible(true);
                }
                else if(whitePawn8_x == whitePro_x && (whitePawn8_y == whiteQueenPro_y || whitePawn8_y == whiteKnightPro_y || whitePawn8_y == whiteRookPro_y || whitePawn8_y == whiteBishopPro_y)) {
                    whitePawn8.setVisible(true);
                }
                else if(whiteRook1_x == whitePro_x && (whiteRook1_y == whiteQueenPro_y || whiteRook1_y == whiteKnightPro_y || whiteRook1_y == whiteRookPro_y || whiteRook1_y == whiteBishopPro_y)) {
                    whiteRook1.setVisible(true);
                }
                else if(whiteKnight1_x == whitePro_x && (whiteKnight1_y == whiteQueenPro_y || whiteKnight1_y == whiteKnightPro_y || whiteKnight1_y == whiteRookPro_y || whiteKnight1_y == whiteBishopPro_y)) {
                    whiteKnight1.setVisible(true);
                }
                else if(whiteBishop1_x == whitePro_x && (whiteBishop1_y == whiteQueenPro_y || whiteBishop1_y == whiteKnightPro_y || whiteBishop1_y == whiteRookPro_y || whiteBishop1_y == whiteBishopPro_y)) {
                    whiteBishop1.setVisible(true);
                }
                else if(whiteQueen_x == whitePro_x && (whiteQueen_y == whiteQueenPro_y || whiteQueen_y == whiteKnightPro_y || whiteQueen_y == whiteRookPro_y || whiteQueen_y == whiteBishopPro_y)) {
                    whiteQueen.setVisible(true);
                }
                else if(whiteKing_x == whitePro_x && (whiteKing_y == whiteQueenPro_y || whiteKing_y == whiteKnightPro_y || whiteKing_y == whiteRookPro_y || whiteKing_y == whiteBishopPro_y)) {
                    whiteKing.setVisible(true);
                }
                else if(whiteBishop2_x == whitePro_x && (whiteBishop2_y == whiteQueenPro_y || whiteBishop2_y == whiteKnightPro_y || whiteBishop2_y == whiteRookPro_y || whiteBishop2_y == whiteBishopPro_y)) {
                    whiteBishop2.setVisible(true);
                }
                else if(whiteKnight2_x == whitePro_x && (whiteKnight2_y == whiteQueenPro_y || whiteKnight2_y == whiteKnightPro_y || whiteKnight2_y == whiteRookPro_y || whiteKnight2_y == whiteBishopPro_y)) {
                    whiteKnight2.setVisible(true);
                }
                else if(whiteRook2_x == whitePro_x && (whiteRook2_y == whiteQueenPro_y || whiteRook2_y == whiteKnightPro_y || whiteRook2_y == whiteRookPro_y || whiteRook2_y == whiteBishopPro_y)) {
                    whiteRook2.setVisible(true);
                }
                else if(blackPawn1_x == whitePro_x && (blackPawn1_y == whiteQueenPro_y || blackPawn1_y == whiteKnightPro_y || blackPawn1_y == whiteRookPro_y || blackPawn1_y == whiteBishopPro_y)) {
                    blackPawn1.setVisible(true);
                }
                else if(blackPawn2_x == whitePro_x && (blackPawn2_y == whiteQueenPro_y || blackPawn2_y == whiteKnightPro_y || blackPawn2_y == whiteRookPro_y || blackPawn2_y == whiteBishopPro_y)) {
                    blackPawn2.setVisible(true);
                }
                else if(blackPawn3_x == whitePro_x && (blackPawn3_y == whiteQueenPro_y || blackPawn3_y == whiteKnightPro_y || blackPawn3_y == whiteRookPro_y || blackPawn3_y == whiteBishopPro_y)) {
                    blackPawn3.setVisible(true);
                }
                else if(blackPawn4_x == whitePro_x && (blackPawn4_y == whiteQueenPro_y || blackPawn4_y == whiteKnightPro_y || blackPawn4_y == whiteRookPro_y || blackPawn4_y == whiteBishopPro_y)) {
                    blackPawn4.setVisible(true);
                }
                else if(blackPawn5_x == whitePro_x && (blackPawn5_y == whiteQueenPro_y || blackPawn5_y == whiteKnightPro_y || blackPawn5_y == whiteRookPro_y || blackPawn5_y == whiteBishopPro_y)) {
                    blackPawn5.setVisible(true);
                }
                else if(blackPawn6_x == whitePro_x && (blackPawn6_y == whiteQueenPro_y || blackPawn6_y == whiteKnightPro_y || blackPawn6_y == whiteRookPro_y || blackPawn6_y == whiteBishopPro_y)) {
                    blackPawn6.setVisible(true);
                }
                else if(blackPawn7_x == whitePro_x && (blackPawn7_y == whiteQueenPro_y || blackPawn7_y == whiteKnightPro_y || blackPawn7_y == whiteRookPro_y || blackPawn7_y == whiteBishopPro_y)) {
                    blackPawn7.setVisible(true);
                }
                else if(blackPawn8_x == whitePro_x && (blackPawn8_y == whiteQueenPro_y || blackPawn8_y == whiteKnightPro_y || blackPawn8_y == whiteRookPro_y || blackPawn8_y == whiteBishopPro_y)) {
                    blackPawn8.setVisible(true);
                }
                else if(blackRook1_x == whitePro_x && (blackRook1_y == whiteQueenPro_y || blackRook1_y == whiteKnightPro_y || blackRook1_y == whiteRookPro_y || blackRook1_y == whiteBishopPro_y)) {
                    blackRook1.setVisible(true);
                }
                else if(blackKnight1_x == whitePro_x && (blackKnight1_y == whiteQueenPro_y || blackKnight1_y == whiteKnightPro_y || blackKnight1_y == whiteRookPro_y || blackKnight1_y == whiteBishopPro_y)) {
                    blackKnight1.setVisible(true);
                }
                else if(blackBishop1_x == whitePro_x && (blackBishop1_y == whiteQueenPro_y || blackBishop1_y == whiteKnightPro_y || blackBishop1_y == whiteRookPro_y || blackBishop1_y == whiteBishopPro_y)) {
                    blackBishop1.setVisible(true);
                }
                else if(blackQueen_x == whitePro_x && (blackQueen_y == whiteQueenPro_y || blackQueen_y == whiteKnightPro_y || blackQueen_y == whiteRookPro_y || blackQueen_y == whiteBishopPro_y)) {
                    whiteQueen.setVisible(true);
                }
                else if(blackKing_x == whitePro_x && (blackKing_y == whiteQueenPro_y || blackKing_y == whiteKnightPro_y || blackKing_y == whiteRookPro_y || blackKing_y == whiteBishopPro_y)) {
                    whiteKing.setVisible(true);
                }
                else if(blackBishop2_x == whitePro_x && (blackBishop2_y == whiteQueenPro_y || blackBishop2_y == whiteKnightPro_y || blackBishop2_y == whiteRookPro_y || blackBishop2_y == whiteBishopPro_y)) {
                    blackBishop2.setVisible(true);
                }
                else if(blackKnight2_x == whitePro_x && (blackKnight2_y == whiteQueenPro_y || blackKnight2_y == whiteKnightPro_y || blackKnight2_y == whiteRookPro_y || blackKnight2_y == whiteBishopPro_y)) {
                    blackKnight2.setVisible(true);
                }
                else if(blackRook2_x == whitePro_x && (blackRook2_y == whiteQueenPro_y || blackRook2_y == whiteKnightPro_y || blackRook2_y == whiteRookPro_y || blackRook2_y == whiteBishopPro_y)) {
                    blackRook2.setVisible(true);
                }

            }
            else if(color.equals("black")) {

                if(whitePawn1_x == blackPro_x && (whitePawn1_y == blackQueenPro_y || whitePawn1_y == blackKnightPro_y || whitePawn1_y == blackRookPro_y || whitePawn1_y == blackBishopPro_y)) {
                    whitePawn1.setVisible(true);
                }
                else if(whitePawn2_x == blackPro_x && (whitePawn2_y == blackQueenPro_y || whitePawn2_y == blackKnightPro_y || whitePawn2_y == blackRookPro_y || whitePawn2_y == blackBishopPro_y)) {
                    whitePawn2.setVisible(true);
                }
                else if(whitePawn3_x == blackPro_x && (whitePawn3_y == blackQueenPro_y || whitePawn3_y == blackKnightPro_y || whitePawn3_y == blackRookPro_y || whitePawn3_y == blackBishopPro_y)) {
                    whitePawn3.setVisible(true);
                }
                else if(whitePawn4_x == blackPro_x && (whitePawn4_y == blackQueenPro_y || whitePawn4_y == blackKnightPro_y || whitePawn4_y == blackRookPro_y || whitePawn4_y == blackBishopPro_y)) {
                    whitePawn4.setVisible(true);
                }
                else if(whitePawn5_x == blackPro_x && (whitePawn5_y == blackQueenPro_y || whitePawn5_y == blackKnightPro_y || whitePawn5_y == blackRookPro_y || whitePawn5_y == blackBishopPro_y)) {
                    whitePawn5.setVisible(true);
                }
                else if(whitePawn6_x == blackPro_x && (whitePawn6_y == blackQueenPro_y || whitePawn6_y == blackKnightPro_y || whitePawn6_y == blackRookPro_y || whitePawn6_y == blackBishopPro_y)) {
                    whitePawn6.setVisible(true);
                }
                else if(whitePawn7_x == blackPro_x && (whitePawn7_y == blackQueenPro_y || whitePawn7_y == blackKnightPro_y || whitePawn7_y == blackRookPro_y || whitePawn7_y == blackBishopPro_y)) {
                    whitePawn7.setVisible(true);
                }
                else if(whitePawn8_x == blackPro_x && (whitePawn8_y == blackQueenPro_y || whitePawn8_y == blackKnightPro_y || whitePawn8_y == blackRookPro_y || whitePawn8_y == blackBishopPro_y)) {
                    whitePawn8.setVisible(true);
                }
                else if(whiteRook1_x == blackPro_x && (whiteRook1_y == blackQueenPro_y || whiteRook1_y == blackKnightPro_y || whiteRook1_y == blackRookPro_y || whiteRook1_y == blackBishopPro_y)) {
                    whiteRook1.setVisible(true);
                }
                else if(whiteKnight1_x == blackPro_x && (whiteKnight1_y == blackQueenPro_y || whiteKnight1_y == blackKnightPro_y || whiteKnight1_y == blackRookPro_y || whiteKnight1_y == blackBishopPro_y)) {
                    whiteKnight1.setVisible(true);
                }
                else if(whiteBishop1_x == blackPro_x && (whiteBishop1_y == blackQueenPro_y || whiteBishop1_y == blackKnightPro_y || whiteBishop1_y == blackRookPro_y || whiteBishop1_y == blackBishopPro_y)) {
                    whiteBishop1.setVisible(true);
                }
                else if(whiteQueen_x == blackPro_x && (whiteQueen_y == blackQueenPro_y || whiteQueen_y == blackKnightPro_y || whiteQueen_y == blackRookPro_y || whiteQueen_y == blackBishopPro_y)) {
                    whiteQueen.setVisible(true);
                }
                else if(whiteKing_x == blackPro_x && (whiteKing_y == blackQueenPro_y || whiteKing_y == blackKnightPro_y || whiteKing_y == blackRookPro_y || whiteKing_y == blackBishopPro_y)) {
                    whiteKing.setVisible(true);
                }
                else if(whiteBishop2_x == blackPro_x && (whiteBishop2_y == blackQueenPro_y || whiteBishop2_y == blackKnightPro_y || whiteBishop2_y == blackRookPro_y || whiteBishop2_y == blackBishopPro_y)) {
                    whiteBishop2.setVisible(true);
                }
                else if(whiteKnight2_x == blackPro_x && (whiteKnight2_y == blackQueenPro_y || whiteKnight2_y == blackKnightPro_y || whiteKnight2_y == blackRookPro_y || whiteKnight2_y == blackBishopPro_y)) {
                    whiteKnight2.setVisible(true);
                }
                else if(whiteRook2_x == blackPro_x && (whiteRook2_y == blackQueenPro_y || whiteRook2_y == blackKnightPro_y || whiteRook2_y == blackRookPro_y || whiteRook2_y == blackBishopPro_y)) {
                    whiteRook2.setVisible(true);
                }
                else if(blackPawn1_x == blackPro_x && (blackPawn1_y == blackQueenPro_y || blackPawn1_y == blackKnightPro_y || blackPawn1_y == blackRookPro_y || blackPawn1_y == blackBishopPro_y)) {
                    blackPawn1.setVisible(true);
                }
                else if(blackPawn2_x == blackPro_x && (blackPawn2_y == blackQueenPro_y || blackPawn2_y == blackKnightPro_y || blackPawn2_y == blackRookPro_y || blackPawn2_y == blackBishopPro_y)) {
                    blackPawn2.setVisible(true);
                }
                else if(blackPawn3_x == blackPro_x && (blackPawn3_y == blackQueenPro_y || blackPawn3_y == blackKnightPro_y || blackPawn3_y == blackRookPro_y || blackPawn3_y == blackBishopPro_y)) {
                    blackPawn3.setVisible(true);
                }
                else if(blackPawn4_x == blackPro_x && (blackPawn4_y == blackQueenPro_y || blackPawn4_y == blackKnightPro_y || blackPawn4_y == blackRookPro_y || blackPawn4_y == blackBishopPro_y)) {
                    blackPawn4.setVisible(true);
                }
                else if(blackPawn5_x == blackPro_x && (blackPawn5_y == blackQueenPro_y || blackPawn5_y == blackKnightPro_y || blackPawn5_y == blackRookPro_y || blackPawn5_y == blackBishopPro_y)) {
                    blackPawn5.setVisible(true);
                }
                else if(blackPawn6_x == blackPro_x && (blackPawn6_y == blackQueenPro_y || blackPawn6_y == blackKnightPro_y || blackPawn6_y == blackRookPro_y || blackPawn6_y == blackBishopPro_y)) {
                    blackPawn6.setVisible(true);
                }
                else if(blackPawn7_x == blackPro_x && (blackPawn7_y == blackQueenPro_y || blackPawn7_y == blackKnightPro_y || blackPawn7_y == blackRookPro_y || blackPawn7_y == blackBishopPro_y)) {
                    blackPawn7.setVisible(true);
                }
                else if(blackPawn8_x == blackPro_x && (blackPawn8_y == blackQueenPro_y || blackPawn8_y == blackKnightPro_y || blackPawn8_y == blackRookPro_y || blackPawn8_y == blackBishopPro_y)) {
                    blackPawn8.setVisible(true);
                }
                else if(blackRook1_x == blackPro_x && (blackRook1_y == blackQueenPro_y || blackRook1_y == blackKnightPro_y || blackRook1_y == blackRookPro_y || blackRook1_y == blackBishopPro_y)) {
                    blackRook1.setVisible(true);
                }
                else if(blackKnight1_x == blackPro_x && (blackKnight1_y == blackQueenPro_y || blackKnight1_y == blackKnightPro_y || blackKnight1_y == blackRookPro_y || blackKnight1_y == blackBishopPro_y)) {
                    blackKnight1.setVisible(true);
                }
                else if(blackBishop1_x == blackPro_x && (blackBishop1_y == blackQueenPro_y || blackBishop1_y == blackKnightPro_y || blackBishop1_y == blackRookPro_y || blackBishop1_y == blackBishopPro_y)) {
                    blackBishop1.setVisible(true);
                }
                else if(blackQueen_x == blackPro_x && (blackQueen_y == blackQueenPro_y || blackQueen_y == blackKnightPro_y || blackQueen_y == blackRookPro_y || blackQueen_y == blackBishopPro_y)) {
                    whiteQueen.setVisible(true);
                }
                else if(blackKing_x == blackPro_x && (blackKing_y == blackQueenPro_y || blackKing_y == blackKnightPro_y || blackKing_y == blackRookPro_y || blackKing_y == blackBishopPro_y)) {
                    whiteKing.setVisible(true);
                }
                else if(blackBishop2_x == blackPro_x && (blackBishop2_y == blackQueenPro_y || blackBishop2_y == blackKnightPro_y || blackBishop2_y == blackRookPro_y || blackBishop2_y == blackBishopPro_y)) {
                    blackBishop2.setVisible(true);
                }
                else if(blackKnight2_x == blackPro_x && (blackKnight2_y == blackQueenPro_y || blackKnight2_y == blackKnightPro_y || blackKnight2_y == blackRookPro_y || blackKnight2_y == blackBishopPro_y)) {
                    blackKnight2.setVisible(true);
                }
                else if(blackRook2_x == blackPro_x && (blackRook2_y == blackQueenPro_y || blackRook2_y == blackKnightPro_y || blackRook2_y == blackRookPro_y || blackRook2_y == blackBishopPro_y)) {
                    blackRook2.setVisible(true);
                }

            }
        }
        
        
    }
    public void hidePiecesUnderText() {
        
        for(int y = textY; y < textY + textHeight; y += CEL_WIDTH) {
            
            for(int x = textX; x < textWidth; x += CEL_WIDTH) {
                
                if(whitePawn1_x == x && whitePawn1_y == y) {
                    whitePawn1.setVisible(false);
                }
                if(whitePawn2_x == x && whitePawn2_y == y) {
                    whitePawn2.setVisible(false);
                }
                if(whitePawn3_x == x && whitePawn3_y == y) {
                    whitePawn3.setVisible(false);
                }
                if(whitePawn4_x == x && whitePawn4_y == y) {
                    whitePawn4.setVisible(false);
                }
                if(whitePawn5_x == x && whitePawn5_y == y) {
                    whitePawn5.setVisible(false);
                }
                if(whitePawn6_x == x && whitePawn6_y == y) {
                    whitePawn6.setVisible(false);
                }
                if(whitePawn7_x == x && whitePawn7_y == y) {
                    whitePawn7.setVisible(false);
                }
                if(whitePawn8_x == x && whitePawn8_y == y) {
                    whitePawn8.setVisible(false);
                }
                if(whiteRook1_x == x && whiteRook1_y == y) {
                    whiteRook1.setVisible(false);
                }
                if(whiteKnight1_x == x && whiteKnight1_y == y) {
                    whiteKnight1.setVisible(false);
                }
                if(whiteBishop1_x == x && whiteBishop1_y == y) {
                    whiteBishop1.setVisible(false);
                }
                if(whiteQueen_x == x && whiteQueen_y == y) {
                    whiteQueen.setVisible(false);
                }
                if(whiteKing_x == x && whiteKing_y == y) {
                    whiteKing.setVisible(false);
                }
                if(whiteBishop2_x == x && whiteBishop2_y == y) {
                    whiteBishop2.setVisible(false);
                }
                if(whiteKnight2_x == x && whiteKnight2_y == y) {
                    whiteKnight2.setVisible(false);
                }
                if(whiteRook2_x == x && whiteRook2_y == y) {
                    whiteRook2.setVisible(false);
                }
                if(blackPawn1_x == x && blackPawn1_y == y) {
                    blackPawn1.setVisible(false);
                }
                if(blackPawn2_x == x && blackPawn2_y == y) {
                    blackPawn2.setVisible(false);
                }
                if(blackPawn3_x == x && blackPawn3_y == y) {
                    blackPawn3.setVisible(false);
                }
                if(blackPawn4_x == x && blackPawn4_y == y) {
                    blackPawn4.setVisible(false);
                }
                if(blackPawn5_x == x && blackPawn5_y == y) {
                    blackPawn5.setVisible(false);
                }
                if(blackPawn6_x == x && blackPawn6_y == y) {
                    blackPawn6.setVisible(false);
                }
                if(blackPawn7_x == x && blackPawn7_y == y) {
                    blackPawn7.setVisible(false);
                }
                if(blackPawn8_x == x && blackPawn8_y == y) {
                    blackPawn8.setVisible(false);
                }
                if(blackRook1_x == x && blackRook1_y == y) {
                    blackRook1.setVisible(false);
                }
                if(blackKnight1_x == x && blackKnight1_y == y) {
                    blackKnight1.setVisible(false);
                }
                if(blackBishop1_x == x && blackBishop1_y == y) {
                    blackBishop1.setVisible(false);
                }
                if(blackQueen_x == x && blackQueen_y == y) {
                    blackQueen.setVisible(false);
                }
                if(blackKing_x == x && blackKing_y == y) {
                    blackKing.setVisible(false);
                }
                if(blackBishop2_x == x && blackBishop2_y == y) {
                    blackBishop2.setVisible(false);
                }
                if(blackKnight2_x == x && blackKnight2_y == y) {
                    blackKnight2.setVisible(false);
                }
                if(blackRook2_x == x && blackRook2_y == y) {
                    blackRook2.setVisible(false);
                }
            }     
        }
        
        repaint();
        
    }
    
    //olika pjäsers drag
    public void findPawnMoves(JLabel piece) {
        
        if (piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            
            if(piece == whitePawn1){
                firstMove = firstMove_Pawn1;
                xPos = whitePawn1_x; 
                yPos = whitePawn1_y;
            }
            else if(piece == whitePawn2){
                firstMove = firstMove_Pawn2;
                xPos = whitePawn2_x; 
                yPos = whitePawn2_y;
            }
            else if(piece == whitePawn3){
                firstMove = firstMove_Pawn3;
                xPos = whitePawn3_x; 
                yPos = whitePawn3_y;
            }
            else if(piece == whitePawn4){
                firstMove = firstMove_Pawn4;
                xPos = whitePawn4_x; 
                yPos = whitePawn4_y;
            }
            else if(piece == whitePawn5){
                firstMove = firstMove_Pawn5;
                xPos = whitePawn5_x; 
                yPos = whitePawn5_y;
            }
            else if(piece == whitePawn6){
                firstMove = firstMove_Pawn6;
                xPos = whitePawn6_x; 
                yPos = whitePawn6_y;
            }
            else if(piece == whitePawn7){
                firstMove = firstMove_Pawn7;
                xPos = whitePawn7_x; 
                yPos = whitePawn7_y;
            }
            else if(piece == whitePawn8){
                firstMove = firstMove_Pawn8;
                xPos = whitePawn8_x; 
                yPos = whitePawn8_y;
            }   
            
            if(firstMove){
            if(checkAvailability(xPos, (yPos - CEL_WIDTH)) == false){
                //inget, inga möjliga drag
            }
            else if(checkAvailability(xPos, (yPos - CEL_WIDTH)) == true &&
                    checkAvailability(xPos, (yPos - 2*CEL_WIDTH)) == false) {
                possibleX[0] = xPos;
                possibleY[0] = yPos - CEL_WIDTH;
            }
            else if(checkAvailability(xPos, (yPos - CEL_WIDTH)) == true &&
                    checkAvailability(xPos, (yPos - 2*CEL_WIDTH)) == true) {
                possibleX[0] = xPos;
                possibleY[0] = yPos - CEL_WIDTH;
                possibleX[1] = xPos;
                possibleY[1] = yPos - 2*CEL_WIDTH;
            }
          }
          else {
            if(checkAvailability(xPos, (yPos - CEL_WIDTH)) == false){
                //inget, inga möjliga drag
            }
            else if(checkAvailability(xPos, (yPos - CEL_WIDTH)) == true){
                possibleX[0] = xPos;
                possibleY[0] = yPos - CEL_WIDTH;
            }
          }
            
            int killSafeArray = 0; 
            if(checkIfBlack(xPos - CEL_WIDTH, yPos - CEL_WIDTH) == true){
                killX[killSafeArray] = xPos - CEL_WIDTH; 
                killY[killSafeArray] = yPos - CEL_WIDTH; 
                killSafeArray++; 
            }
            if(checkIfBlack(xPos + CEL_WIDTH, yPos - CEL_WIDTH) == true){
                killX[killSafeArray] = xPos + CEL_WIDTH; 
                killY[killSafeArray] = yPos - CEL_WIDTH; 
                killSafeArray++; 
            }
            
            if((blackPawn1_x == xPos - CEL_WIDTH && blackPawn1_y == yPos && blackPawn1_doubleMove == true) || (blackPawn2_x == xPos - CEL_WIDTH && blackPawn2_y == yPos &&  blackPawn2_doubleMove == true)
                     || (blackPawn3_x == xPos - CEL_WIDTH && blackPawn3_y == yPos && blackPawn3_doubleMove == true)  || (blackPawn4_x == xPos - CEL_WIDTH && blackPawn4_y == yPos && blackPawn4_doubleMove == true)
                     || (blackPawn5_x == xPos - CEL_WIDTH && blackPawn5_y == yPos && blackPawn5_doubleMove == true)  || (blackPawn6_x == xPos - CEL_WIDTH && blackPawn6_y == yPos && blackPawn6_doubleMove == true)
                     || (blackPawn7_x == xPos - CEL_WIDTH && blackPawn7_y == yPos && blackPawn7_doubleMove == true)  || (blackPawn8_x == xPos - CEL_WIDTH && blackPawn8_y == yPos && blackPawn8_doubleMove == true)) {
                killX[killSafeArray] = xPos - CEL_WIDTH;
                killY[killSafeArray] = yPos - CEL_WIDTH;
                killSafeArray++; 
            }
            else if((blackPawn1_x == xPos + CEL_WIDTH && blackPawn1_y == yPos && blackPawn1_doubleMove == true) || (blackPawn2_x == xPos + CEL_WIDTH && blackPawn2_y == yPos && blackPawn2_doubleMove == true) // kan inte vara båda, bara en double move per drag möjligt 
                     || (blackPawn3_x == xPos + CEL_WIDTH && blackPawn3_y == yPos && blackPawn3_doubleMove == true)  || (blackPawn4_x == xPos + CEL_WIDTH && blackPawn4_y == yPos && blackPawn4_doubleMove == true)
                     || (blackPawn5_x == xPos + CEL_WIDTH && blackPawn5_y == yPos && blackPawn5_doubleMove == true)  || (blackPawn6_x == xPos + CEL_WIDTH && blackPawn6_y == yPos && blackPawn6_doubleMove == true)
                     || (blackPawn7_x == xPos + CEL_WIDTH && blackPawn7_y == yPos && blackPawn7_doubleMove == true)  || (blackPawn8_x == xPos + CEL_WIDTH && blackPawn8_y == yPos && blackPawn8_doubleMove == true)) {
                killX[killSafeArray] = xPos + CEL_WIDTH;
                killY[killSafeArray] = yPos - CEL_WIDTH;
            }
            
            
        } // if vit pawn 
        
        //if svart pawn 
        if (piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
            
            if(piece == blackPawn1){
                firstMove = firstMove_BlackPawn1;
                xPos = blackPawn1_x; 
                yPos = blackPawn1_y;
            }
            else if(piece == blackPawn2){
                firstMove = firstMove_BlackPawn2;
                xPos = blackPawn2_x; 
                yPos = blackPawn2_y;
            }
            else if(piece == blackPawn3){
                firstMove = firstMove_BlackPawn3;
                xPos = blackPawn3_x; 
                yPos = blackPawn3_y;
            }
            else if(piece == blackPawn4){
                firstMove = firstMove_BlackPawn4;
                xPos = blackPawn4_x; 
                yPos = blackPawn4_y;
            }
            else if(piece == blackPawn5){
                firstMove = firstMove_BlackPawn5;
                xPos = blackPawn5_x; 
                yPos = blackPawn5_y;
            }
            else if(piece == blackPawn6){
                firstMove = firstMove_BlackPawn6;
                xPos = blackPawn6_x; 
                yPos = blackPawn6_y;
            }
            else if(piece == blackPawn7){
                firstMove = firstMove_BlackPawn7;
                xPos = blackPawn7_x; 
                yPos = blackPawn7_y;
            }
            else if(piece == blackPawn8){
                firstMove = firstMove_BlackPawn8;
                xPos = blackPawn8_x; 
                yPos = blackPawn8_y;
            }
            
            if(firstMove){
            if(checkAvailability(xPos, (yPos + CEL_WIDTH)) == false){
                //inget, inga möjliga drag
            }
            else if(checkAvailability(xPos, (yPos + CEL_WIDTH)) == true &&
                    checkAvailability(xPos, (yPos + 2*CEL_WIDTH)) == false) {
                possibleX[0] = xPos;
                possibleY[0] = yPos + CEL_WIDTH;
            }
            else if(checkAvailability(xPos, (yPos + CEL_WIDTH)) == true &&
                    checkAvailability(xPos, (yPos + 2*CEL_WIDTH)) == true) {
                possibleX[0] = xPos;
                possibleY[0] = yPos + CEL_WIDTH;
                possibleX[1] = xPos;
                possibleY[1] = yPos + 2*CEL_WIDTH;
            }
          }
          else {
            if(checkAvailability(xPos, (yPos + CEL_WIDTH)) == false){
                //inget, inga möjliga drag
            }
            else if(checkAvailability(xPos, (yPos + CEL_WIDTH)) == true){
                possibleX[0] = xPos;
                possibleY[0] = yPos + CEL_WIDTH;
            }
          }
            
            int killSafeArray = 0; 
            if(checkIfWhite(xPos - CEL_WIDTH, yPos + CEL_WIDTH) == true){
                killX[killSafeArray] = xPos - CEL_WIDTH; 
                killY[killSafeArray] = yPos + CEL_WIDTH; 
                killSafeArray++; 
            }
            if(checkIfWhite(xPos + CEL_WIDTH, yPos + CEL_WIDTH) == true){
                killX[killSafeArray] = xPos + CEL_WIDTH; 
                killY[killSafeArray] = yPos + CEL_WIDTH; 
                killSafeArray++; 
            }
            
            if((whitePawn1_x == xPos - CEL_WIDTH && whitePawn1_y == yPos && whitePawn1_doubleMove == true) || (whitePawn2_x == xPos - CEL_WIDTH && whitePawn2_y == yPos &&  whitePawn2_doubleMove == true)
                     || (whitePawn3_x == xPos - CEL_WIDTH && whitePawn3_y == yPos && whitePawn3_doubleMove == true)  || (whitePawn4_x == xPos - CEL_WIDTH && whitePawn4_y == yPos && whitePawn4_doubleMove == true)
                     || (whitePawn5_x == xPos - CEL_WIDTH && whitePawn5_y == yPos && whitePawn5_doubleMove == true)  || (whitePawn6_x == xPos - CEL_WIDTH && whitePawn6_y == yPos && whitePawn6_doubleMove == true)
                     || (whitePawn7_x == xPos - CEL_WIDTH && whitePawn7_y == yPos && whitePawn7_doubleMove == true)  || (whitePawn8_x == xPos - CEL_WIDTH && whitePawn8_y == yPos && whitePawn8_doubleMove == true)) {
                killX[killSafeArray] = xPos - CEL_WIDTH;
                killY[killSafeArray] = yPos + CEL_WIDTH;
                killSafeArray++; 
            }
            else if((whitePawn1_x == xPos + CEL_WIDTH && whitePawn1_y == yPos && whitePawn1_doubleMove == true) || (whitePawn2_x == xPos + CEL_WIDTH && whitePawn2_y == yPos && whitePawn2_doubleMove == true) // kan inte vara båda, bara en double move per drag möjligt 
                     || (whitePawn3_x == xPos + CEL_WIDTH && whitePawn3_y == yPos && whitePawn3_doubleMove == true)  || (whitePawn4_x == xPos + CEL_WIDTH && whitePawn4_y == yPos && whitePawn4_doubleMove == true)
                     || (whitePawn5_x == xPos + CEL_WIDTH && whitePawn5_y == yPos && whitePawn5_doubleMove == true)  || (whitePawn6_x == xPos + CEL_WIDTH && whitePawn6_y == yPos && whitePawn6_doubleMove == true)
                     || (whitePawn7_x == xPos + CEL_WIDTH && whitePawn7_y == yPos && whitePawn7_doubleMove == true)  || (whitePawn8_x == xPos + CEL_WIDTH && whitePawn8_y == yPos && whitePawn8_doubleMove == true)) {
                killX[killSafeArray] = xPos + CEL_WIDTH;
                killY[killSafeArray] = yPos + CEL_WIDTH;
            }
            
        }
        
    }
    public void findRookMoves(JLabel piece) {
        
        if(piece == whiteRook1) {
            xPos = whiteRook1_x; 
            yPos = whiteRook1_y; 
        }
        else if(piece == whiteRook2) {
            xPos = whiteRook2_x; 
            yPos = whiteRook2_y; 
        }
        else if(piece == blackRook1) {
            xPos = blackRook1_x; 
            yPos = blackRook1_y; 
        }
        else if(piece == blackRook2) {
            xPos = blackRook2_x; 
            yPos = blackRook2_y; 
        }
        else if(piece == whitePawn1){
            xPos = whitePawn1_x; 
            yPos = whitePawn1_y;
        }
        else if(piece == whitePawn2){
            xPos = whitePawn2_x; 
            yPos = whitePawn2_y;
        }
        else if(piece == whitePawn3){
            xPos = whitePawn3_x; 
            yPos = whitePawn3_y;
        }
        else if(piece == whitePawn4){
            xPos = whitePawn4_x; 
            yPos = whitePawn4_y;
        }
        else if(piece == whitePawn5){
            xPos = whitePawn5_x; 
            yPos = whitePawn5_y;
        }
        else if(piece == whitePawn6){
            xPos = whitePawn6_x; 
            yPos = whitePawn6_y;
        }
        else if(piece == whitePawn7){
            xPos = whitePawn7_x; 
            yPos = whitePawn7_y;
        }
        else if(piece == whitePawn8){
            xPos = whitePawn8_x; 
            yPos = whitePawn8_y;
        }
        else if(piece == blackPawn1){
            xPos = blackPawn1_x; 
            yPos = blackPawn1_y;
        }
        else if(piece == blackPawn2){
            xPos = blackPawn2_x; 
            yPos = blackPawn2_y;
        }
        else if(piece == blackPawn3){
            xPos = blackPawn3_x; 
            yPos = blackPawn3_y;
        }
        else if(piece == blackPawn4){
            xPos = blackPawn4_x; 
            yPos = blackPawn4_y;
        }
        else if(piece == blackPawn5){
            xPos = blackPawn5_x; 
            yPos = blackPawn5_y;
        }
        else if(piece == blackPawn6){
            xPos = blackPawn6_x; 
            yPos = blackPawn6_y;
        }
        else if(piece == blackPawn7){
            xPos = blackPawn7_x; 
            yPos = blackPawn7_y;
        }
        else if(piece == blackPawn8){
            xPos = blackPawn8_x; 
            yPos = blackPawn8_y;
        }

        //upp
        int k = 1;
        while(checkAvailability(xPos, (yPos - CEL_WIDTH*k)) == true){
            k++; 
        } // möjliga steg upp 
        k--; 
        if(checkAvailability(xPos, (yPos - CEL_WIDTH*1)) == true) {
            for(int i = 0; i < k; i++) {
            possibleX[i] = xPos; 
            possibleY[i] = yPos - CEL_WIDTH*(i+1); 
            }
        }
        if(piece == whiteRook1 || piece == whiteRook2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            if(checkIfBlack(xPos, (yPos - CEL_WIDTH*(k+1))) == true) {
                killX[0] = xPos; 
                killY[0] = yPos - CEL_WIDTH*(k+1);
            }
        }
        else if(piece == blackRook1 || piece == blackRook2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
            if(checkIfWhite(xPos, (yPos - CEL_WIDTH*(k+1))) == true) {
                killX[0] = xPos; 
                killY[0] = yPos - CEL_WIDTH*(k+1);
            }
        }
        k = 0; 
        while(possibleX[k] != -1) {
            k++; 
        } int firstSafeArray = k; 
        k = 0; 
        while(killX[k] != -1) {
            k++; 
        } int killSafeArray = k; 

        //ner
        k = 1;
        while(checkAvailability(xPos, (yPos + CEL_WIDTH*k)) == true){ 
            k++; 
        } // möjliga steg ner
        k--; 
        if(checkAvailability(xPos, (yPos + CEL_WIDTH*1)) == true) {
            for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos; 
                possibleY[i+firstSafeArray] = yPos + CEL_WIDTH*(i+1); 
            }
        } 
        if(piece == whiteRook1 || piece == whiteRook2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            if(checkIfBlack(xPos, (yPos + CEL_WIDTH*(k+1))) == true) {
                killX[killSafeArray] = xPos; 
                killY[killSafeArray] = yPos + CEL_WIDTH*(k+1);
            }
        }
        else if(piece == blackRook1 || piece == blackRook2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
            if(checkIfWhite(xPos, (yPos + CEL_WIDTH*(k+1))) == true) {
                killX[killSafeArray] = xPos; 
                killY[killSafeArray] = yPos + CEL_WIDTH*(k+1);
            }
        }
        k = 0; 
        while(possibleX[k] != -1) {
            k++; 
        } firstSafeArray = k;
        k = 0; 
        while(killX[k] != -1) {
            k++; 
        } killSafeArray = k; 

        //vänster 
        k = 1;
        while(checkAvailability((xPos - CEL_WIDTH*k), yPos) == true){ 
            k++; 
        } 
        k--; 
        if(checkAvailability((xPos - CEL_WIDTH*1), yPos) == true) {
            for(int i = 0; i < k; i++) {
            possibleX[i+firstSafeArray] = xPos - CEL_WIDTH*(i+1); 
            possibleY[i+firstSafeArray] = yPos; 
            }
        }
        if(piece == whiteRook1 || piece == whiteRook2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            if(checkIfBlack((xPos - CEL_WIDTH*(k+1)), yPos) == true) {
                killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                killY[killSafeArray] = yPos;
            }
        }
        else if(piece == blackRook1 || piece == blackRook2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
            if(checkIfWhite((xPos - CEL_WIDTH*(k+1)), yPos) == true) {
                killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                killY[killSafeArray] = yPos;
            }
        }
        k = 0; 
        while(possibleX[k] != -1) {
            k++; 
        } firstSafeArray = k;
        k = 0; 
        while(killX[k] != -1) {
            k++; 
        } killSafeArray = k; 

        //höger
        k = 1;
        while(checkAvailability((xPos + CEL_WIDTH*k), yPos) == true){ 
            k++; 
        } 
        k--; 
        if(checkAvailability((xPos + CEL_WIDTH*1), yPos) == true) {
            for(int i = 0; i < k; i++) {
            possibleX[i+firstSafeArray] = xPos + CEL_WIDTH*(i+1); 
            possibleY[i+firstSafeArray] = yPos; 
            }
        } 
        if(piece == whiteRook1 || piece == whiteRook2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            if(checkIfBlack((xPos + CEL_WIDTH*(k+1)), yPos) == true) {
                killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                killY[killSafeArray] = yPos;
            }
        }
        else if(piece == blackRook1 || piece == blackRook2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
            if(checkIfWhite((xPos + CEL_WIDTH*(k+1)), yPos) == true) {
                killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                killY[killSafeArray] = yPos;
            }
        }
        
    }
    public void findKnightMoves(JLabel piece) {
        
        if(piece == whiteKnight1) {
            xPos = whiteKnight1_x; 
            yPos = whiteKnight1_y; 
        }
        else if(piece == whiteKnight2) {
            xPos = whiteKnight2_x; 
            yPos = whiteKnight2_y; 
        }
        else if(piece == blackKnight1) {
            xPos = blackKnight1_x; 
            yPos = blackKnight1_y; 
        }
        else if(piece == blackKnight2) {
            xPos = blackKnight2_x; 
            yPos = blackKnight2_y; 
        }
        else if(piece == whitePawn1){
            xPos = whitePawn1_x; 
            yPos = whitePawn1_y;
        }
        else if(piece == whitePawn2){
            xPos = whitePawn2_x; 
            yPos = whitePawn2_y;
        }
        else if(piece == whitePawn3){
            xPos = whitePawn3_x; 
            yPos = whitePawn3_y;
        }
        else if(piece == whitePawn4){
            xPos = whitePawn4_x; 
            yPos = whitePawn4_y;
        }
        else if(piece == whitePawn5){
            xPos = whitePawn5_x; 
            yPos = whitePawn5_y;
        }
        else if(piece == whitePawn6){
            xPos = whitePawn6_x; 
            yPos = whitePawn6_y;
        }
        else if(piece == whitePawn7){
            xPos = whitePawn7_x; 
            yPos = whitePawn7_y;
        }
        else if(piece == whitePawn8){
            xPos = whitePawn8_x; 
            yPos = whitePawn8_y;
        }
        else if(piece == blackPawn1){
            xPos = blackPawn1_x; 
            yPos = blackPawn1_y;
        }
        else if(piece == blackPawn2){
            xPos = blackPawn2_x; 
            yPos = blackPawn2_y;
        }
        else if(piece == blackPawn3){
            xPos = blackPawn3_x; 
            yPos = blackPawn3_y;
        }
        else if(piece == blackPawn4){
            xPos = blackPawn4_x; 
            yPos = blackPawn4_y;
        }
        else if(piece == blackPawn5){
            xPos = blackPawn5_x; 
            yPos = blackPawn5_y;
        }
        else if(piece == blackPawn6){
            xPos = blackPawn6_x; 
            yPos = blackPawn6_y;
        }
        else if(piece == blackPawn7){
            xPos = blackPawn7_x; 
            yPos = blackPawn7_y;
        }
        else if(piece == blackPawn8){
            xPos = blackPawn8_x; 
            yPos = blackPawn8_y;
        }


        int firstSafeArray = 0; 
        int killSafeArray = 0; 
        //upp
        if(checkAvailability(xPos - CEL_WIDTH, yPos - CEL_WIDTH*2) == true){
            possibleX[firstSafeArray] = xPos - CEL_WIDTH; 
            possibleY[firstSafeArray] = yPos - CEL_WIDTH*2;
            firstSafeArray++; 
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos - CEL_WIDTH, yPos - CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH; 
                    killY[killSafeArray] = yPos - CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos - CEL_WIDTH, yPos - CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH; 
                    killY[killSafeArray] = yPos - CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
        }
        if(checkAvailability(xPos + CEL_WIDTH, yPos - CEL_WIDTH*2) == true){
            possibleX[firstSafeArray] = xPos + CEL_WIDTH; 
            possibleY[firstSafeArray] = yPos - CEL_WIDTH*2;
            firstSafeArray++; 
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos + CEL_WIDTH, yPos - CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH; 
                    killY[killSafeArray] = yPos - CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos + CEL_WIDTH, yPos - CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH; 
                    killY[killSafeArray] = yPos - CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
        }
        //höger
        if(checkAvailability(xPos + CEL_WIDTH*2, yPos - CEL_WIDTH) == true){
            possibleX[firstSafeArray] = xPos + CEL_WIDTH*2; 
            possibleY[firstSafeArray] = yPos - CEL_WIDTH;
            firstSafeArray++; 
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos + CEL_WIDTH*2, yPos - CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos - CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos + CEL_WIDTH*2, yPos - CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos - CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
        }
        if(checkAvailability(xPos + CEL_WIDTH*2, yPos + CEL_WIDTH) == true){
            possibleX[firstSafeArray] = xPos + CEL_WIDTH*2; 
            possibleY[firstSafeArray] = yPos + CEL_WIDTH;
            firstSafeArray++; 
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos + CEL_WIDTH*2, yPos + CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos + CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos + CEL_WIDTH*2, yPos + CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos + CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
        }
        //ner
        if(checkAvailability(xPos + CEL_WIDTH, yPos + CEL_WIDTH*2) == true){
            possibleX[firstSafeArray] = xPos + CEL_WIDTH; 
            possibleY[firstSafeArray] = yPos + CEL_WIDTH*2;
            firstSafeArray++; 
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos + CEL_WIDTH, yPos + CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH; 
                    killY[killSafeArray] = yPos + CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos + CEL_WIDTH, yPos + CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH; 
                    killY[killSafeArray] = yPos + CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
        }
        if(checkAvailability(xPos - CEL_WIDTH, yPos + CEL_WIDTH*2) == true){
            possibleX[firstSafeArray] = xPos - CEL_WIDTH; 
            possibleY[firstSafeArray] = yPos + CEL_WIDTH*2;
            firstSafeArray++; 
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos - CEL_WIDTH, yPos + CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH; 
                    killY[killSafeArray] = yPos + CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos - CEL_WIDTH, yPos + CEL_WIDTH*2) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH; 
                    killY[killSafeArray] = yPos + CEL_WIDTH*2; 
                    killSafeArray++; 
                }
            }
        }
        //vänster
        if(checkAvailability(xPos - CEL_WIDTH*2, yPos + CEL_WIDTH) == true){
            possibleX[firstSafeArray] = xPos - CEL_WIDTH*2; 
            possibleY[firstSafeArray] = yPos + CEL_WIDTH;
            firstSafeArray++; 
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos - CEL_WIDTH*2, yPos + CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos + CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos - CEL_WIDTH*2, yPos + CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos + CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
        }
        if(checkAvailability(xPos - CEL_WIDTH*2, yPos - CEL_WIDTH) == true){
            possibleX[firstSafeArray] = xPos - CEL_WIDTH*2; 
            possibleY[firstSafeArray] = yPos - CEL_WIDTH;
        }
        else {
            if(piece == whiteKnight1 || piece == whiteKnight2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos - CEL_WIDTH*2, yPos - CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos - CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
            else if(piece == blackKnight1 || piece == blackKnight2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite(xPos - CEL_WIDTH*2, yPos - CEL_WIDTH) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*2; 
                    killY[killSafeArray] = yPos - CEL_WIDTH; 
                    killSafeArray++; 
                }
            }
        }
        
    }
    public void findBishopMoves(JLabel piece) {
        
        if(piece == whiteBishop1) {
            xPos = whiteBishop1_x; 
            yPos = whiteBishop1_y; 
        }
        else if(piece == whiteBishop2) {
            xPos = whiteBishop2_x; 
            yPos = whiteBishop2_y; 
        }
        else if(piece == blackBishop1) {
            xPos = blackBishop1_x; 
            yPos = blackBishop1_y; 
        }
        else if(piece == blackBishop2) {
            xPos = blackBishop2_x; 
            yPos = blackBishop2_y; 
        }
        else if(piece == whitePawn1){
            xPos = whitePawn1_x; 
            yPos = whitePawn1_y;
        }
        else if(piece == whitePawn2){
            xPos = whitePawn2_x; 
            yPos = whitePawn2_y;
        }
        else if(piece == whitePawn3){
            xPos = whitePawn3_x; 
            yPos = whitePawn3_y;
        }
        else if(piece == whitePawn4){
            xPos = whitePawn4_x; 
            yPos = whitePawn4_y;
        }
        else if(piece == whitePawn5){
            xPos = whitePawn5_x; 
            yPos = whitePawn5_y;
        }
        else if(piece == whitePawn6){
            xPos = whitePawn6_x; 
            yPos = whitePawn6_y;
        }
        else if(piece == whitePawn7){
            xPos = whitePawn7_x; 
            yPos = whitePawn7_y;
        }
        else if(piece == whitePawn8){
            xPos = whitePawn8_x; 
            yPos = whitePawn8_y;
        }
        else if(piece == blackPawn1){
            xPos = blackPawn1_x; 
            yPos = blackPawn1_y;
        }
        else if(piece == blackPawn2){
            xPos = blackPawn2_x; 
            yPos = blackPawn2_y;
        }
        else if(piece == blackPawn3){
            xPos = blackPawn3_x; 
            yPos = blackPawn3_y;
        }
        else if(piece == blackPawn4){
            xPos = blackPawn4_x; 
            yPos = blackPawn4_y;
        }
        else if(piece == blackPawn5){
            xPos = blackPawn5_x; 
            yPos = blackPawn5_y;
        }
        else if(piece == blackPawn6){
            xPos = blackPawn6_x; 
            yPos = blackPawn6_y;
        }
        else if(piece == blackPawn7){
            xPos = blackPawn7_x; 
            yPos = blackPawn7_y;
        }
        else if(piece == blackPawn8){
            xPos = blackPawn8_x; 
            yPos = blackPawn8_y;
        }
            
            //nordväst
            int k = 1;
            while(checkAvailability((xPos - CEL_WIDTH*k), (yPos - CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability((xPos - CEL_WIDTH*1), (yPos - CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i] = xPos - CEL_WIDTH*(i+1); 
                possibleY[i] = yPos - CEL_WIDTH*(i+1); 
                }
            }
            if(piece == whiteBishop1 || piece == whiteBishop2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos - CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[0] = xPos - CEL_WIDTH*(k+1); 
                    killY[0] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackBishop1 || piece == blackBishop2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos - CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[0] = xPos - CEL_WIDTH*(k+1); 
                    killY[0] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } int firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } int killSafeArray = k; 
            
            //nordost
            k = 1;
            while(checkAvailability((xPos + CEL_WIDTH*k), (yPos - CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability((xPos + CEL_WIDTH*1), (yPos - CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos + CEL_WIDTH*(i+1); 
                possibleY[i+firstSafeArray] = yPos - CEL_WIDTH*(i+1); 
                }
            } 
            if(piece == whiteBishop1 || piece == whiteBishop2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos + CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackBishop1 || piece == blackBishop2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos + CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k;
            
            //sydost
            k = 1;
            while(checkAvailability((xPos + CEL_WIDTH*k), (yPos + CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability((xPos + CEL_WIDTH*1), (yPos + CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos + CEL_WIDTH*(i+1); 
                possibleY[i+firstSafeArray] = yPos + CEL_WIDTH*(i+1); 
                }
            } 
            if(piece == whiteBishop1 || piece == whiteBishop2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos + CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackBishop1 || piece == blackBishop2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos + CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k;
            
            //sydväst
            k = 1;
            while(checkAvailability((xPos - CEL_WIDTH*k), (yPos + CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability((xPos - CEL_WIDTH*1), (yPos + CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos - CEL_WIDTH*(i+1); 
                possibleY[i+firstSafeArray] = yPos + CEL_WIDTH*(i+1); 
                }
            } 
            if(piece == whiteBishop1 || piece == whiteBishop2 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos - CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackBishop1 || piece == blackBishop2 || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos - CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
        
    }
    public void findQueenMoves(JLabel piece) {
        
        if(piece == whiteQueen) {
            xPos = whiteQueen_x; 
            yPos = whiteQueen_y; 
        }
        else if (piece == blackQueen) {
            xPos = blackQueen_x; 
            yPos = blackQueen_y;
        }
        else if(piece == whitePawn1){
            xPos = whitePawn1_x; 
            yPos = whitePawn1_y;
        }
        else if(piece == whitePawn2){
            xPos = whitePawn2_x; 
            yPos = whitePawn2_y;
        }
        else if(piece == whitePawn3){
            xPos = whitePawn3_x; 
            yPos = whitePawn3_y;
        }
        else if(piece == whitePawn4){
            xPos = whitePawn4_x; 
            yPos = whitePawn4_y;
        }
        else if(piece == whitePawn5){
            xPos = whitePawn5_x; 
            yPos = whitePawn5_y;
        }
        else if(piece == whitePawn6){
            xPos = whitePawn6_x; 
            yPos = whitePawn6_y;
        }
        else if(piece == whitePawn7){
            xPos = whitePawn7_x; 
            yPos = whitePawn7_y;
        }
        else if(piece == whitePawn8){
            xPos = whitePawn8_x; 
            yPos = whitePawn8_y;
        }
        else if(piece == blackPawn1){
            xPos = blackPawn1_x; 
            yPos = blackPawn1_y;
        }
        else if(piece == blackPawn2){
            xPos = blackPawn2_x; 
            yPos = blackPawn2_y;
        }
        else if(piece == blackPawn3){
            xPos = blackPawn3_x; 
            yPos = blackPawn3_y;
        }
        else if(piece == blackPawn4){
            xPos = blackPawn4_x; 
            yPos = blackPawn4_y;
        }
        else if(piece == blackPawn5){
            xPos = blackPawn5_x; 
            yPos = blackPawn5_y;
        }
        else if(piece == blackPawn6){
            xPos = blackPawn6_x; 
            yPos = blackPawn6_y;
        }
        else if(piece == blackPawn7){
            xPos = blackPawn7_x; 
            yPos = blackPawn7_y;
        }
        else if(piece == blackPawn8){
            xPos = blackPawn8_x; 
            yPos = blackPawn8_y;
        }
            
            //nordväst
            int k = 1;
            while(checkAvailability((xPos - CEL_WIDTH*k), (yPos - CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg nordväst 
            k--; 
            if(checkAvailability((xPos - CEL_WIDTH*1), (yPos - CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                    possibleX[i] = xPos - CEL_WIDTH*(i+1); 
                    possibleY[i] = yPos - CEL_WIDTH*(i+1); 
                }
            }
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos - CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[0] = xPos - CEL_WIDTH*(k+1); 
                    killY[0] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos - CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[0] = xPos - CEL_WIDTH*(k+1); 
                    killY[0] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } int firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } int killSafeArray = k; 
            
            //nordost
            k = 1;
            while(checkAvailability((xPos + CEL_WIDTH*k), (yPos - CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability((xPos + CEL_WIDTH*1), (yPos - CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                    possibleX[i+firstSafeArray] = xPos + CEL_WIDTH*(i+1); 
                    possibleY[i+firstSafeArray] = yPos - CEL_WIDTH*(i+1); 
                }
            } 
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos + CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos + CEL_WIDTH*(k+1)), (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos - CEL_WIDTH*(k+1); 
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k;
            
            //sydost
            k = 1;
            while(checkAvailability((xPos + CEL_WIDTH*k), (yPos + CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability((xPos + CEL_WIDTH*1), (yPos + CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos + CEL_WIDTH*(i+1); 
                possibleY[i+firstSafeArray] = yPos + CEL_WIDTH*(i+1); 
                }
            } 
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos + CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos + CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k;
            
            //sydväst
            k = 1;
            while(checkAvailability((xPos - CEL_WIDTH*k), (yPos + CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability((xPos - CEL_WIDTH*1), (yPos + CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                    possibleX[i+firstSafeArray] = xPos - CEL_WIDTH*(i+1); 
                    possibleY[i+firstSafeArray] = yPos + CEL_WIDTH*(i+1); 
                }
            } 
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos - CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8) {
                if(checkIfWhite((xPos - CEL_WIDTH*(k+1)), (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1); 
                }
            }
            
            k = 0;
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k;
            
            //upp
            k = 1;
            while(checkAvailability(xPos, (yPos - CEL_WIDTH*k)) == true){
                k++; 
            } // möjliga steg upp 
            k--; 
            if(checkAvailability(xPos, (yPos - CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                    possibleX[i+firstSafeArray] = xPos; 
                    possibleY[i+firstSafeArray] = yPos - CEL_WIDTH*(i+1); 
                }
            }
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos, (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos; 
                    killY[killSafeArray] = yPos - CEL_WIDTH*(k+1);
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
                if(checkIfWhite(xPos, (yPos - CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos; 
                    killY[killSafeArray] = yPos - CEL_WIDTH*(k+1);
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k; 
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k; 
            
            //ner
            k = 1;
            while(checkAvailability(xPos, (yPos + CEL_WIDTH*k)) == true){ 
                k++; 
            } // möjliga steg ner
            k--; 
            if(checkAvailability(xPos, (yPos + CEL_WIDTH*1)) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos; 
                possibleY[i+firstSafeArray] = yPos + CEL_WIDTH*(i+1); 
                }
            } 
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack(xPos, (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos; 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1);
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
                if(checkIfWhite(xPos, (yPos + CEL_WIDTH*(k+1))) == true) {
                    killX[killSafeArray] = xPos; 
                    killY[killSafeArray] = yPos + CEL_WIDTH*(k+1);
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k;
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k; 

            //vänster 
            k = 1;
            while(checkAvailability((xPos - CEL_WIDTH*k), yPos) == true){ 
                k++; 
            } 
            k--; 
            if(checkAvailability((xPos - CEL_WIDTH*1), yPos) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos - CEL_WIDTH*(i+1); 
                possibleY[i+firstSafeArray] = yPos; 
                }
            }
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos - CEL_WIDTH*(k+1)), yPos) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos;
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
                if(checkIfWhite((xPos - CEL_WIDTH*(k+1)), yPos) == true) {
                    killX[killSafeArray] = xPos - CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos;
                }
            }
            k = 0; 
            while(possibleX[k] != -1) {
                k++; 
            } firstSafeArray = k;
            k = 0; 
            while(killX[k] != -1) {
                k++; 
            } killSafeArray = k; 
            
            //höger
            k = 1;
            while(checkAvailability((xPos + CEL_WIDTH*k), yPos) == true){ 
                k++; 
            } 
            k--; 
            if(checkAvailability((xPos + CEL_WIDTH*1), yPos) == true) {
                for(int i = 0; i < k; i++) {
                possibleX[i+firstSafeArray] = xPos + CEL_WIDTH*(i+1); 
                possibleY[i+firstSafeArray] = yPos; 
                }
            } 
            if(piece == whiteQueen || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
                if(checkIfBlack((xPos + CEL_WIDTH*(k+1)), yPos) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos;
                }
            }
            else if(piece == blackQueen || piece == blackPawn1 || piece == blackPawn2 || piece == blackPawn3 || piece == blackPawn4
                || piece == blackPawn5 || piece == blackPawn6 || piece == blackPawn7 || piece == blackPawn8){
                if(checkIfWhite((xPos + CEL_WIDTH*(k+1)), yPos) == true) {
                    killX[killSafeArray] = xPos + CEL_WIDTH*(k+1); 
                    killY[killSafeArray] = yPos;
                }
            }
        
    }
    public void findKingMoves(JLabel piece) {
        
        if(piece == whiteKing) {
                xPos = whiteKing_x; 
                yPos = whiteKing_y; 
            }
            else if(piece == blackKing) {
                xPos = blackKing_x; 
                yPos = blackKing_y; 
            }
            
            int firstSafeArray = 0; 
            int killSafeArray = 0; 
            
            if(checkAvailability(xPos, yPos - CEL_WIDTH) == true) {
                possibleX[firstSafeArray] = xPos; 
                possibleY[firstSafeArray] = yPos - CEL_WIDTH; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos, yPos - CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos; 
                        killY[killSafeArray] = yPos - CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos, yPos - CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos; 
                        killY[killSafeArray] = yPos - CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
            }
            if(checkAvailability(xPos + CEL_WIDTH, yPos - CEL_WIDTH) == true) {
                possibleX[firstSafeArray] = xPos + CEL_WIDTH; 
                possibleY[firstSafeArray] = yPos - CEL_WIDTH; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos + CEL_WIDTH, yPos - CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos + CEL_WIDTH; 
                        killY[killSafeArray] = yPos - CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos + CEL_WIDTH, yPos - CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos + CEL_WIDTH; 
                        killY[killSafeArray] = yPos - CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
            }
            if(checkAvailability(xPos + CEL_WIDTH, yPos) == true) {
                possibleX[firstSafeArray] = xPos + CEL_WIDTH; 
                possibleY[firstSafeArray] = yPos; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos + CEL_WIDTH, yPos) == true) {
                        killX[killSafeArray] = xPos + CEL_WIDTH; 
                        killY[killSafeArray] = yPos; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos + CEL_WIDTH, yPos) == true) {
                        killX[killSafeArray] = xPos + CEL_WIDTH; 
                        killY[killSafeArray] = yPos; 
                        killSafeArray++;
                    }
                }
            }
            if(checkAvailability(xPos + CEL_WIDTH, yPos + CEL_WIDTH) == true) {
                possibleX[firstSafeArray] = xPos + CEL_WIDTH; 
                possibleY[firstSafeArray] = yPos + CEL_WIDTH; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos + CEL_WIDTH, yPos + CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos + CEL_WIDTH; 
                        killY[killSafeArray] = yPos + CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos + CEL_WIDTH, yPos + CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos + CEL_WIDTH; 
                        killY[killSafeArray] = yPos + CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
            }
            if(checkAvailability(xPos, yPos + CEL_WIDTH) == true) {
                possibleX[firstSafeArray] = xPos; 
                possibleY[firstSafeArray] = yPos + CEL_WIDTH; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos, yPos + CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos; 
                        killY[killSafeArray] = yPos + CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos, yPos + CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos; 
                        killY[killSafeArray] = yPos + CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
            }
            if(checkAvailability(xPos - CEL_WIDTH, yPos + CEL_WIDTH) == true) {
                possibleX[firstSafeArray] = xPos - CEL_WIDTH; 
                possibleY[firstSafeArray] = yPos + CEL_WIDTH; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos - CEL_WIDTH, yPos + CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos - CEL_WIDTH; 
                        killY[killSafeArray] = yPos + CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos - CEL_WIDTH, yPos + CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos - CEL_WIDTH; 
                        killY[killSafeArray] = yPos + CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
            }
            if(checkAvailability(xPos - CEL_WIDTH, yPos) == true) {
                possibleX[firstSafeArray] = xPos - CEL_WIDTH; 
                possibleY[firstSafeArray] = yPos; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos - CEL_WIDTH, yPos) == true) {
                        killX[killSafeArray] = xPos - CEL_WIDTH; 
                        killY[killSafeArray] = yPos; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos - CEL_WIDTH, yPos) == true) {
                        killX[killSafeArray] = xPos - CEL_WIDTH; 
                        killY[killSafeArray] = yPos; 
                        killSafeArray++;
                    }
                }
            }
            if(checkAvailability(xPos - CEL_WIDTH, yPos - CEL_WIDTH) == true) {
                possibleX[firstSafeArray] = xPos - CEL_WIDTH; 
                possibleY[firstSafeArray] = yPos - CEL_WIDTH; 
                firstSafeArray++; 
            }
            else {
                if(piece == whiteKing) {
                    if(checkIfBlack(xPos - CEL_WIDTH, yPos - CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos - CEL_WIDTH; 
                        killY[killSafeArray] = yPos - CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
                else if (piece == blackKing) {
                    if(checkIfWhite(xPos - CEL_WIDTH, yPos - CEL_WIDTH) == true) {
                        killX[killSafeArray] = xPos - CEL_WIDTH; 
                        killY[killSafeArray] = yPos - CEL_WIDTH; 
                        killSafeArray++;
                    }
                }
            }
            
            if(piece == whiteKing && whiteKingFirstMove) {
                if(whiteRook1FirstMove) {
                    if(checkAvailability(xPos - CEL_WIDTH, yPos) && checkAvailability(xPos - CEL_WIDTH*2, yPos) && checkAvailability(xPos - CEL_WIDTH*3, yPos)) {
                        possibleX[firstSafeArray] = xPos - CEL_WIDTH*4; 
                        possibleY[firstSafeArray] = yPos; 
                        possibleX[firstSafeArray+1] = xPos - CEL_WIDTH*2;
                        possibleY[firstSafeArray+1] = yPos; 
                        firstSafeArray += 2; 
                    }
                }
                if(whiteRook2FirstMove) {
                    if(checkAvailability(xPos + CEL_WIDTH, yPos) && checkAvailability(xPos + CEL_WIDTH*2, yPos)) {
                        possibleX[firstSafeArray] = xPos + CEL_WIDTH*3; 
                        possibleY[firstSafeArray] = yPos; 
                        possibleX[firstSafeArray+1] = xPos + CEL_WIDTH*2; 
                        possibleY[firstSafeArray+1] = yPos; 
                        firstSafeArray += 2; 
                    }
                }
            }
            else if(piece == blackKing && blackKingFirstMove) {
                if(blackRook1FirstMove) {
                    if(checkAvailability(xPos - CEL_WIDTH, yPos) && checkAvailability(xPos - CEL_WIDTH*2, yPos) && checkAvailability(xPos - CEL_WIDTH*3, yPos)) {
                        possibleX[firstSafeArray] = xPos - CEL_WIDTH*4; 
                        possibleY[firstSafeArray] = yPos; 
                        firstSafeArray++; 
                    }
                }
                if(blackRook2FirstMove) {
                    if(checkAvailability(xPos + CEL_WIDTH, yPos) && checkAvailability(xPos + CEL_WIDTH*2, yPos)) {
                        possibleX[firstSafeArray] = xPos + CEL_WIDTH*3; 
                        possibleY[firstSafeArray] = yPos; 
                        firstSafeArray++; 
                    }
                }
            }
        
    }
    
    /////////////COMP MOVE///////////////////////
    public void changePos() {

        if(possibleOutcomes1_piece[bestPos3] == blackRook1) {
            blackRook1_x = possibleOutcomes1_x[bestPos3]; 
            blackRook1_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackKnight1) {
            blackKnight1_x = possibleOutcomes1_x[bestPos3]; 
            blackKnight1_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackBishop1) {
            blackBishop1_x = possibleOutcomes1_x[bestPos3]; 
            blackBishop1_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackQueen) {
            blackQueen_x = possibleOutcomes1_x[bestPos3]; 
            blackQueen_y = possibleOutcomes1_y[bestPos3];
        }   
        else if(possibleOutcomes1_piece[bestPos3] == blackKing) {
            blackKing_x = possibleOutcomes1_x[bestPos3]; 
            blackKing_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackBishop2) {
            blackBishop2_x = possibleOutcomes1_x[bestPos3]; 
            blackBishop2_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackKnight2) {
            blackKnight2_x = possibleOutcomes1_x[bestPos3]; 
            blackKnight2_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackRook2) {
            blackRook2_x = possibleOutcomes1_x[bestPos3]; 
            blackRook2_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn1) {
            blackPawn1_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn1_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn2) {
            blackPawn2_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn2_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn3) {
            blackPawn3_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn3_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn4) {
            blackPawn4_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn4_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn5) {
            blackPawn5_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn5_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn6) {
            blackPawn6_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn6_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn7) {
            blackPawn7_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn7_y = possibleOutcomes1_y[bestPos3];
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn8) {
            blackPawn8_x = possibleOutcomes1_x[bestPos3]; 
            blackPawn8_y = possibleOutcomes1_y[bestPos3];
        }
        
        //om plats är tagen av en annan pjäs (om draget är en kill)
        if((whiteRook1_x == possibleOutcomes1_x[bestPos3] && whiteRook1_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteRook1);
            kill = "x";
        }
        else if((whiteKnight1_x == possibleOutcomes1_x[bestPos3] && whiteKnight1_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteKnight1);
            kill = "x";
        }
        else if((whiteBishop1_x == possibleOutcomes1_x[bestPos3] && whiteBishop1_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteBishop1);
            kill = "x";
        }
        else if((whiteQueen_x == possibleOutcomes1_x[bestPos3] && whiteQueen_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteQueen);
            kill = "x";
        }
        else if((whiteKing_x == possibleOutcomes1_x[bestPos3] && whiteKing_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteKing);
            kill = "x";
        }
        else if((whiteBishop2_x == possibleOutcomes1_x[bestPos3] && whiteBishop2_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteBishop2);
            kill = "x";
        }
        else if((whiteKnight2_x == possibleOutcomes1_x[bestPos3] && whiteKnight2_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteKnight2);
            kill = "x";
        }
        else if((whiteRook2_x == possibleOutcomes1_x[bestPos3] && whiteRook2_y == possibleOutcomes1_y[bestPos3])) {
            kill(whiteRook2);
            kill = "x";
        }
        else if((whitePawn1_x == possibleOutcomes1_x[bestPos3] && whitePawn1_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn1);
            kill = "x";
        }
        else if((whitePawn2_x == possibleOutcomes1_x[bestPos3] && whitePawn2_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn2);
            kill = "x";
        }
        else if((whitePawn3_x == possibleOutcomes1_x[bestPos3] && whitePawn3_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn3);
            kill = "x";
        }
        else if((whitePawn4_x == possibleOutcomes1_x[bestPos3] && whitePawn4_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn4);
            kill = "x";
        }
        else if((whitePawn5_x == possibleOutcomes1_x[bestPos3] && whitePawn5_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn5);
            kill = "x";
        }
        else if((whitePawn6_x == possibleOutcomes1_x[bestPos3] && whitePawn6_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn6);
            kill = "x";
        }
        else if((whitePawn7_x == possibleOutcomes1_x[bestPos3] && whitePawn7_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn7);
            kill = "x";
        }
        else if((whitePawn8_x == possibleOutcomes1_x[bestPos3] && whitePawn8_y == possibleOutcomes1_y[bestPos3])) {
            kill(whitePawn8);
            kill = "x";
        }
        else {
            kill = "";
        }
        
        notationBlack(possibleOutcomes1_piece[bestPos3], possibleOutcomes1_x[bestPos3], possibleOutcomes1_y[bestPos3]);
        
    }
    public void valueMoveKill(int x, int y, JLabel piece) {
        
       int xPos = 0, yPos = 0; 
       if(piece == whiteRook1) {
            xPos = whiteRook1_x; 
            yPos = whiteRook1_y;
        }
        else if(piece == whiteKnight1) {
            xPos = whiteKnight1_x; 
            yPos = whiteKnight1_y; 
        }
        else if(piece == whiteBishop1) {
            xPos = whiteBishop1_x; 
            yPos = whiteBishop1_y; 
        }
        else if(piece == whiteQueen) {
            xPos = whiteQueen_x; 
            yPos = whiteQueen_y; 
        }
        else if(piece == whiteKing) {
            xPos = whiteKing_x; 
            yPos = whiteKing_y; 
        }
        else if(piece == whiteBishop2) {
            xPos = whiteBishop2_x; 
            yPos = whiteBishop2_y; 
        }
        else if(piece == whiteKnight2) {
            xPos = whiteKnight2_x; 
            yPos = whiteKnight2_y; 
        }
        else if(piece == whiteRook2) {
            xPos = whiteRook2_x; 
            yPos = whiteRook2_y; 
        }
        else if(piece == whitePawn1) {
            xPos = whitePawn1_x; 
            yPos = whitePawn1_y; 
        }
        else if(piece == whitePawn2) {
            xPos = whitePawn2_x; 
            yPos = whitePawn2_y; 
        }
        else if(piece == whitePawn3) {
            xPos = whitePawn3_x; 
            yPos = whitePawn3_y; 
        }
        else if(piece == whitePawn4) {
            xPos = whitePawn4_x; 
            yPos = whitePawn4_y; 
        }
        else if(piece == whitePawn5) {
            xPos = whitePawn5_x; 
            yPos = whitePawn5_y; 
        }
        else if(piece == whitePawn6) {
            xPos = whitePawn6_x; 
            yPos = whitePawn6_y; 
        }
        else if(piece == whitePawn7) {
            xPos = whitePawn7_x; 
            yPos = whitePawn7_y; 
        }
        else if(piece == whitePawn8) {
            xPos = whitePawn8_x; 
            yPos = whitePawn8_y; 
        }
        else if(piece == blackRook1) {
            xPos = blackRook1_x; 
            yPos = blackRook1_y;
        }
        else if(piece == blackKnight1) {
            xPos = blackKnight1_x; 
            yPos = blackKnight1_y; 
        }
        else if(piece == blackBishop1) {
            xPos = blackBishop1_x; 
            yPos = blackBishop1_y; 
        }
        else if(piece == blackQueen) {
            xPos = blackQueen_x; 
            yPos = blackQueen_y; 
        }
        else if(piece == blackKing) {
            xPos = blackKing_x; 
            yPos = blackKing_y; 
        }
        else if(piece == blackBishop2) {
            xPos = blackBishop2_x; 
            yPos = blackBishop2_y; 
        }
        else if(piece == blackKnight2) {
            xPos = blackKnight2_x; 
            yPos = blackKnight2_y; 
        }
        else if(piece == blackRook2) {
            xPos = blackRook2_x; 
            yPos = blackRook2_y; 
        }
        else if(piece == blackPawn1) {
            xPos = blackPawn1_x; 
            yPos = blackPawn1_y; 
        }
        else if(piece == blackPawn2) {
            xPos = blackPawn2_x; 
            yPos = blackPawn2_y; 
        }
        else if(piece == blackPawn3) {
            xPos = blackPawn3_x; 
            yPos = blackPawn3_y; 
        }
        else if(piece == blackPawn4) {
            xPos = blackPawn4_x; 
            yPos = blackPawn4_y; 
        }
        else if(piece == blackPawn5) {
            xPos = blackPawn5_x; 
            yPos = blackPawn5_y; 
        }
        else if(piece == blackPawn6) {
            xPos = blackPawn6_x; 
            yPos = blackPawn6_y; 
        }
        else if(piece == blackPawn7) {
            xPos = blackPawn7_x; 
            yPos = blackPawn7_y; 
        }
        else if(piece == blackPawn8) {
            xPos = blackPawn8_x; 
            yPos = blackPawn8_y; 
        }
        
        if(piece == whiteRook1 || piece == whiteKnight1 || piece == whiteBishop1 || piece == whiteQueen ||
                 piece == whiteKing || piece == whiteBishop2 || piece == whiteKnight2 || piece == whiteRook2
                 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                 || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            
            if(blackRook1_x == xPos && blackRook1_y == yPos) {
                value += rookKillValue; 
            }
            else if(blackKnight1_x == xPos && blackKnight1_y == yPos) {
                value += knightKillValue; 
            }
            else if(blackBishop1_x == xPos && blackBishop1_y == yPos) {
                value += bishopKillValue; 
            }
            else if(blackQueen_x == xPos && blackQueen_y == yPos) {
                value += queenKillValue; 
            }
            else if(blackKing_x == xPos && blackKing_y == yPos) {
                value += kingKillValue; 
            }
            else if(blackBishop2_x == xPos && blackBishop2_y == yPos) {
                value += bishopKillValue; 
            }
            else if(blackKnight2_x == xPos && blackKnight2_y == yPos) {
                value += knightKillValue; 
            }
            else if(blackRook2_x == xPos && blackRook2_y == yPos) {
                value += rookKillValue; 
            }
            else if(blackPawn1_x == xPos && blackPawn1_y == yPos) {
                value += pawnKillValue; 
            }
            else if(blackPawn2_x == xPos && blackPawn2_y == yPos) {
                value += pawnKillValue; 
            }
            else if(blackPawn3_x == xPos && blackPawn3_y == yPos) {
                value += pawnKillValue; 
            }
            else if(blackPawn4_x == xPos && blackPawn4_y == yPos) {
                value += pawnKillValue; 
            }
            else if(blackPawn5_x == xPos && blackPawn5_y == yPos) {
                value += pawnKillValue; 
            }
            else if(blackPawn6_x == xPos && blackPawn6_y == yPos) {
                value += pawnKillValue; 
            }
            else if(blackPawn7_x == xPos && blackPawn7_y == yPos) {
                value += pawnKillValue; 
            }
            else if(blackPawn8_x == xPos && blackPawn8_y == yPos) {
                value += pawnKillValue; 
            }
            
        } else {
            if(whiteRook1_x == xPos && whiteRook1_y == yPos) {
                value += rookKillValue; 
            }
            else if(whiteKnight1_x == xPos && whiteKnight1_y == yPos) {
                value += knightKillValue; 
            }
            else if(whiteBishop1_x == xPos && whiteBishop1_y == yPos) {
                value += bishopKillValue; 
            }
            else if(whiteQueen_x == xPos && whiteQueen_y == yPos) {
                value += queenKillValue; 
            }
            else if(whiteKing_x == xPos && whiteKing_y == yPos) {
                value += kingKillValue; 
            }
            else if(whiteBishop2_x == xPos && whiteBishop2_y == yPos) {
                value += bishopKillValue; 
            }
            else if(whiteKnight2_x == xPos && whiteKnight2_y == yPos) {
                value += knightKillValue; 
            }
            else if(whiteRook2_x == xPos && whiteRook2_y == yPos) {
                value += rookKillValue; 
            }
            else if(whitePawn1_x == xPos && whitePawn1_y == yPos) {
                value += pawnKillValue; 
            }
            else if(whitePawn2_x == xPos && whitePawn2_y == yPos) {
                value += pawnKillValue; 
            }
            else if(whitePawn3_x == xPos && whitePawn3_y == yPos) {
                value += pawnKillValue; 
            }
            else if(whitePawn4_x == xPos && whitePawn4_y == yPos) {
                value += pawnKillValue; 
            }
            else if(whitePawn5_x == xPos && whitePawn5_y == yPos) {
                value += pawnKillValue; 
            }
            else if(whitePawn6_x == xPos && whitePawn6_y == yPos) {
                value += pawnKillValue; 
            }
            else if(whitePawn7_x == xPos && whitePawn7_y == yPos) {
                value += pawnKillValue; 
            }
            else if(whitePawn8_x == xPos && whitePawn8_y == yPos) {
                value += pawnKillValue; 
            }
        }
        
    }
    public void valueKill(JLabel piece, JLabel enemy) {
        
        int xPos = 0, yPos = 0; 
        if(piece == whiteRook1) {
            xPos = whiteRook1_x; 
            yPos = whiteRook1_y;
        }
        else if(piece == whiteKnight1) {
            xPos = whiteKnight1_x; 
            yPos = whiteKnight1_y; 
        }
        else if(piece == whiteBishop1) {
            xPos = whiteBishop1_x; 
            yPos = whiteBishop1_y; 
        }
        else if(piece == whiteQueen) {
            xPos = whiteQueen_x; 
            yPos = whiteQueen_y; 
        }
        else if(piece == whiteKing) {
            xPos = whiteKing_x; 
            yPos = whiteKing_y; 
        }
        else if(piece == whiteBishop2) {
            xPos = whiteBishop2_x; 
            yPos = whiteBishop2_y; 
        }
        else if(piece == whiteKnight2) {
            xPos = whiteKnight2_x; 
            yPos = whiteKnight2_y; 
        }
        else if(piece == whiteRook2) {
            xPos = whiteRook2_x; 
            yPos = whiteRook2_y; 
        }
        else if(piece == whitePawn1) {
            xPos = whitePawn1_x; 
            yPos = whitePawn1_y; 
        }
        else if(piece == whitePawn2) {
            xPos = whitePawn2_x; 
            yPos = whitePawn2_y; 
        }
        else if(piece == whitePawn3) {
            xPos = whitePawn3_x; 
            yPos = whitePawn3_y; 
        }
        else if(piece == whitePawn4) {
            xPos = whitePawn4_x; 
            yPos = whitePawn4_y; 
        }
        else if(piece == whitePawn5) {
            xPos = whitePawn5_x; 
            yPos = whitePawn5_y; 
        }
        else if(piece == whitePawn6) {
            xPos = whitePawn6_x; 
            yPos = whitePawn6_y; 
        }
        else if(piece == whitePawn7) {
            xPos = whitePawn7_x; 
            yPos = whitePawn7_y; 
        }
        else if(piece == whitePawn8) {
            xPos = whitePawn8_x; 
            yPos = whitePawn8_y; 
        }
        else if(piece == blackRook1) {
            xPos = blackRook1_x; 
            yPos = blackRook1_y;
        }
        else if(piece == blackKnight1) {
            xPos = blackKnight1_x; 
            yPos = blackKnight1_y; 
        }
        else if(piece == blackBishop1) {
            xPos = blackBishop1_x; 
            yPos = blackBishop1_y; 
        }
        else if(piece == blackQueen) {
            xPos = blackQueen_x; 
            yPos = blackQueen_y; 
        }
        else if(piece == blackKing) {
            xPos = blackKing_x; 
            yPos = blackKing_y; 
        }
        else if(piece == blackBishop2) {
            xPos = blackBishop2_x; 
            yPos = blackBishop2_y; 
        }
        else if(piece == blackKnight2) {
            xPos = blackKnight2_x; 
            yPos = blackKnight2_y; 
        }
        else if(piece == blackRook2) {
            xPos = blackRook2_x; 
            yPos = blackRook2_y; 
        }
        else if(piece == blackPawn1) {
            xPos = blackPawn1_x; 
            yPos = blackPawn1_y; 
        }
        else if(piece == blackPawn2) {
            xPos = blackPawn2_x; 
            yPos = blackPawn2_y; 
        }
        else if(piece == blackPawn3) {
            xPos = blackPawn3_x; 
            yPos = blackPawn3_y; 
        }
        else if(piece == blackPawn4) {
            xPos = blackPawn4_x; 
            yPos = blackPawn4_y; 
        }
        else if(piece == blackPawn5) {
            xPos = blackPawn5_x; 
            yPos = blackPawn5_y; 
        }
        else if(piece == blackPawn6) {
            xPos = blackPawn6_x; 
            yPos = blackPawn6_y; 
        }
        else if(piece == blackPawn7) {
            xPos = blackPawn7_x; 
            yPos = blackPawn7_y; 
        }
        else if(piece == blackPawn8) {
            xPos = blackPawn8_x; 
            yPos = blackPawn8_y; 
        }
                    
        findPossibleMoves(enemy);
        int count = 0; 
        while(killX[count] != -1) {
            count++; // count = hur många kills 
        }
        if(count != 0)  {
            for(int i = 0; i < count; i++) { // i = alla kills i array 
                if(killX[i] == xPos && killY[i] == yPos) {
                    killOpponentPiece++; 
                }
            }
        }
        
    }
    public void calculateValueBoard(JLabel piece) {
        
        killOpponentPiece = 0; 
        
        if(piece == whiteRook1 || piece == whiteKnight1 || piece == whiteBishop1 || piece == whiteQueen ||
                 piece == whiteKing || piece == whiteBishop2 || piece == whiteKnight2 || piece == whiteRook2
                 || piece == whitePawn1 || piece == whitePawn2 || piece == whitePawn3 || piece == whitePawn4
                 || piece == whitePawn5 || piece == whitePawn6 || piece == whitePawn7 || piece == whitePawn8) {
            
            valueKill(piece, blackRook1);
            valueKill(piece, blackKnight1);
            valueKill(piece, blackBishop1);
            valueKill(piece, blackQueen);
            valueKill(piece, blackKing);
            valueKill(piece, blackBishop2);
            valueKill(piece, blackKnight2);
            valueKill(piece, blackRook2);
            valueKill(piece, blackPawn1);
            valueKill(piece, blackPawn2);
            valueKill(piece, blackPawn1);
            valueKill(piece, blackPawn4);
            valueKill(piece, blackPawn5);
            valueKill(piece, blackPawn6);
            valueKill(piece, blackPawn7);
            valueKill(piece, blackPawn8);
            
        }
        else {
            valueKill(piece, whiteRook1);
            valueKill(piece, whiteKnight1);
            valueKill(piece, whiteBishop1);
            valueKill(piece, whiteQueen);
            valueKill(piece, whiteKing);
            valueKill(piece, whiteBishop2);
            valueKill(piece, whiteKnight2);
            valueKill(piece, whiteRook2);
            valueKill(piece, whitePawn1);
            valueKill(piece, whitePawn2);
            valueKill(piece, whitePawn1);
            valueKill(piece, whitePawn4);
            valueKill(piece, whitePawn5);
            valueKill(piece, whitePawn6);
            valueKill(piece, whitePawn7);
            valueKill(piece, whitePawn8);
        }
        
        calcValue = 0; 
        findPossibleMoves(piece);
        int i = 0; 
        while(possibleX[i] != -1) {
            i++; 
        } // i = möjliga lediga celler flytt
        int j = 0; 
        while(killX[j] != -1) {
            j++; 
        } // j = möjliga kills 
        calcValue = i + j; 
        calcValue -= killOpponentPiece; 
        
        if(calcValue < 0)
            calcValue = 0; 
        
    }
    public void getValue(String color) {
                
        value = 0; 
        
        if(color.equals("white")) {
            
            if(whiteRook1_x <= MAX_XPOS) {
                calculateValueBoard(whiteRook1);
                value += calcValue + valueRook; 
            }
            if(whiteKnight1_x <= MAX_XPOS) {
                calculateValueBoard(whiteKnight1);
                value += calcValue +  valueKnight; 
            }
            if(whiteBishop1_x <= MAX_XPOS) {
                calculateValueBoard(whiteBishop1);
                value += calcValue +  valueBishop; 
            }
            if(whiteQueen_x <= MAX_XPOS) {
                calculateValueBoard(whiteQueen);
                value += calcValue +  valueQueen; 
            }
            if(whiteBishop2_x <= MAX_XPOS) {
                calculateValueBoard(whiteBishop2);
                value += calcValue +  valueBishop; 
            }
            if(whiteKnight2_x <= MAX_XPOS) {
                calculateValueBoard(whiteKnight2);
                value += calcValue +  valueKnight; 
            }
            if(whiteRook2_x <= MAX_XPOS) {
                calculateValueBoard(whiteRook2);
                value += calcValue +  valueRook; 
            }
            if(whitePawn1_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn1);
                value += calcValue +  valuePawn; 
            }
            if(whitePawn2_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn2);
                value += calcValue +  valuePawn; 
            }
            if(whitePawn3_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn3);
                value += calcValue +  valuePawn; 
            }
            if(whitePawn4_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn4);
                value += calcValue +  valuePawn; 
            }
            if(whitePawn5_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn5);
                value += calcValue +  valuePawn; 
            }
            if(whitePawn6_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn6);
                value += calcValue +  valuePawn; 
            }
            if(whitePawn7_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn7);
                value += calcValue +  valuePawn; 
            }
            if(whitePawn8_x <= MAX_XPOS) {
                calculateValueBoard(whitePawn8);
                value += calcValue +  valuePawn; 
            }
            
        }
        else if(color.equals("black")) {
            
            if(blackRook1_x <= MAX_XPOS) {
                calculateValueBoard(blackRook1);
                value += calcValue + valueRook; 
            }
            if(blackKnight1_x <= MAX_XPOS) {
                calculateValueBoard(blackKnight1);
                value += calcValue +  valueKnight; 
            }
            if(blackBishop1_x <= MAX_XPOS) {
                calculateValueBoard(blackBishop1);
                value += calcValue +  valueBishop; 
            }
            if(blackQueen_x <= MAX_XPOS) {
                calculateValueBoard(blackQueen);
                value += calcValue +  valueQueen; 
            }
            if(blackBishop2_x <= MAX_XPOS) {
                calculateValueBoard(blackBishop2);
                value += calcValue +  valueBishop; 
            }
            if(blackKnight2_x <= MAX_XPOS) {
                calculateValueBoard(blackKnight2);
                value += calcValue +  valueKnight; 
            }
            if(blackRook2_x <= MAX_XPOS) {
                calculateValueBoard(blackRook2);
                value += calcValue +  valueRook; 
            }
            if(blackPawn1_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn1);
                value += calcValue +  valuePawn; 
            }
            if(blackPawn2_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn2);
                value += calcValue +  valuePawn; 
            }
            if(blackPawn3_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn3);
                value += calcValue +  valuePawn; 
            }
            if(blackPawn4_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn4);
                value += calcValue +  valuePawn; 
            }
            if(blackPawn5_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn5);
                value += calcValue +  valuePawn; 
            }
            if(blackPawn6_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn6);
                value += calcValue +  valuePawn; 
            }
            if(blackPawn7_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn7);
                value += calcValue +  valuePawn; 
            }
            if(blackPawn8_x <= MAX_XPOS) {
                calculateValueBoard(blackPawn8);
                value += calcValue +  valuePawn; 
            }
            
        }
        
    }
    /////////////
    public void switchBackPiece3(JLabel piece) {
        
        if(piece == whiteRook1) { //byt tillbaka till ursprunglig position
            whiteRook1_x = tempX3;
            whiteRook1_y = tempY3; 
        }
        else if(piece == whiteKnight1) {
            whiteKnight1_x = tempX3;
            whiteKnight1_y = tempY3; 
        }
        else if(piece == whiteBishop1) {
            whiteBishop1_x = tempX3;
            whiteBishop1_y = tempY3; 
        }
        else if(piece == whiteQueen) {
            whiteQueen_x = tempX3;
            whiteQueen_y = tempY3; 
        }
        else if(piece == whiteKing) {
            whiteKing_x = tempX3;
            whiteKing_y = tempY3; 
        }
        else if(piece == whiteBishop2) {
            whiteBishop2_x = tempX3;
            whiteBishop2_y = tempY3; 
        }
        else if(piece == whiteKnight2) {
            whiteKnight2_x = tempX3;
            whiteKnight2_y = tempY3; 
        }
        else if(piece == whiteRook2) {
            whiteRook2_x = tempX3;
            whiteRook2_y = tempY3; 
        }
        else if(piece == whitePawn1) {
            whitePawn1_x = tempX3;
            whitePawn1_y = tempY3; 
        }
        else if(piece == whitePawn2) {
            whitePawn2_x = tempX3;
            whitePawn2_y = tempY3; 
        }
        else if(piece == whitePawn3) {
            whitePawn3_x = tempX3;
            whitePawn3_y = tempY3; 
        }
        else if(piece == whitePawn4) {
            whitePawn4_x = tempX3;
            whitePawn4_y = tempY3; 
        }
        else if(piece == whitePawn5) {
            whitePawn5_x = tempX3;
            whitePawn5_y = tempY3; 
        }
        else if(piece == whitePawn6) {
            whitePawn6_x = tempX3;
            whitePawn6_y = tempY3; 
        }
        else if(piece == whitePawn7) {
            whitePawn7_x = tempX3;
            whitePawn7_y = tempY3; 
        }
        else if(piece == whitePawn8) {
            whitePawn8_x = tempX3;
            whitePawn8_y = tempY3; 
        }
        if(piece == blackRook1) { 
            blackRook1_x = tempX3;
            blackRook1_y = tempY3; 
        }
        else if(piece == blackKnight1) {
            blackKnight1_x = tempX3;
            blackKnight1_y = tempY3; 
        }
        else if(piece == blackBishop1) {
            blackBishop1_x = tempX3;
            blackBishop1_y = tempY3; 
        }
        else if(piece == blackQueen) {
            blackQueen_x = tempX3;
            blackQueen_y = tempY3; 
        }
        else if(piece == blackKing) {
            blackKing_x = tempX3;
            blackKing_y = tempY3; 
        }
        else if(piece == blackBishop2) {
            blackBishop2_x = tempX3;
            blackBishop2_y = tempY3; 
        }
        else if(piece == blackKnight2) {
            blackKnight2_x = tempX3;
            blackKnight2_y = tempY3; 
        }
        else if(piece == blackRook2) {
            blackRook2_x = tempX3;
            blackRook2_y = tempY3; 
        }
        else if(piece == blackPawn1) {
            blackPawn1_x = tempX3;
            blackPawn1_y = tempY3; 
        }
        else if(piece == blackPawn2) {
            blackPawn2_x = tempX3;
            blackPawn2_y = tempY3; 
        }
        else if(piece == blackPawn3) {
            blackPawn3_x = tempX3;
            blackPawn3_y = tempY3; 
        }
        else if(piece == blackPawn4) {
            blackPawn4_x = tempX3;
            blackPawn4_y = tempY3; 
        }
        else if(piece == blackPawn5) {
            blackPawn5_x = tempX3;
            blackPawn5_y = tempY3; 
        }
        else if(piece == blackPawn6) {
            blackPawn6_x = tempX3;
            blackPawn6_y = tempY3; 
        }
        else if(piece == blackPawn7) {
            blackPawn7_x = tempX3;
            blackPawn7_y = tempY3; 
        }
        else if(piece == blackPawn8) {
            blackPawn8_x = tempX3;
            blackPawn8_y = tempY3; 
        }
        
    }
    public void switchToPos3(int x, int y, JLabel piece) {
        
        if(piece == whiteRook1) { // flytta piece temporärt
            tempX3 = whiteRook1_x; 
            tempY3 = whiteRook1_y; 
        }
        else if(piece == whiteKnight1) {
            tempX3 = whiteKnight1_x; 
            tempY3 = whiteKnight1_y; 
        }
        else if(piece == whiteBishop1) {
            tempX3 = whiteBishop1_x; 
            tempY3 = whiteBishop1_y; 
        }
        else if(piece == whiteQueen) {
            tempX3 = whiteQueen_x; 
            tempY3 = whiteQueen_y; 
        }
        else if(piece == whiteKing) {
            tempX3 = whiteKing_x; 
            tempY3 = whiteKing_y; 
        }
        else if(piece == whiteBishop2) {
            tempX3 = whiteBishop2_x; 
            tempY3 = whiteBishop2_y; 
        }
        else if(piece == whiteKnight2) {
            tempX3 = whiteKnight2_x; 
            tempY3 = whiteKnight2_y; 
        }
        else if(piece == whiteRook2) {
            tempX3 = whiteRook2_x; 
            tempY3 = whiteRook2_y; 
        }
        else if(piece == whitePawn1) {
            tempX3 = whitePawn1_x; 
            tempY3 = whitePawn1_y; 
        }
        else if(piece == whitePawn2) {
            tempX3 = whitePawn2_x; 
            tempY3 = whitePawn2_y; 
        }
        else if(piece == whitePawn3) {
            tempX3 = whitePawn3_x; 
            tempY3 = whitePawn3_y; 
        }
        else if(piece == whitePawn4) {
            tempX3 = whitePawn4_x; 
            tempY3 = whitePawn4_y; 
        }
        else if(piece == whitePawn5) {
            tempX3 = whitePawn5_x; 
            tempY3 = whitePawn5_y; 
        }
        else if(piece == whitePawn6) {
            tempX3 = whitePawn6_x; 
            tempY3 = whitePawn6_y; 
        }
        else if(piece == whitePawn7) {
            tempX3 = whitePawn7_x; 
            tempY3 = whitePawn7_y; 
        }
        else if(piece == whitePawn8) {
            tempX3 = whitePawn8_x; 
            tempY3 = whitePawn8_y; 
        }
        else if(piece == blackRook1) {
            tempX3 = blackRook1_x; 
            tempY3 = blackRook1_y; 
        }
        else if(piece == blackKnight1) {
            tempX3 = blackKnight1_x; 
            tempY3 = blackKnight1_y; 
        }
        else if(piece == blackBishop1) {
            tempX3 = blackBishop1_x; 
            tempY3 = blackBishop1_y; 
        }
        else if(piece == blackQueen) {
            tempX3 = blackQueen_x; 
            tempY3 = blackQueen_y; 
        }
        else if(piece == blackKing) {
            tempX3 = blackKing_x; 
            tempY3 = blackKing_y; 
        }
        else if(piece == blackBishop2) {
            tempX3 = blackBishop2_x; 
            tempY3 = blackBishop2_y; 
        }
        else if(piece == blackKnight2) {
            tempX3 = blackKnight2_x; 
            tempY3 = blackKnight2_y; 
        }
        else if(piece == blackRook2) {
            tempX3 = blackRook2_x; 
            tempY3 = blackRook2_y; 
        }
        else if(piece == blackPawn1) {
            tempX3 = blackPawn1_x; 
            tempY3 = blackPawn1_y; 
        }
        else if(piece == blackPawn2) {
            tempX3 = blackPawn2_x; 
            tempY3 = blackPawn2_y; 
        }
        else if(piece == blackPawn3) {
            tempX3 = blackPawn3_x; 
            tempY3 = blackPawn3_y; 
        }
        else if(piece == blackPawn4) {
            tempX3 = blackPawn4_x; 
            tempY3 = blackPawn4_y; 
        }
        else if(piece == blackPawn5) {
            tempX3 = blackPawn5_x; 
            tempY3 = blackPawn5_y; 
        }
        else if(piece == blackPawn6) {
            tempX3 = blackPawn6_x; 
            tempY3 = blackPawn6_y; 
        }
        else if(piece == blackPawn7) {
            tempX3 = blackPawn7_x; 
            tempY3 = blackPawn7_y; 
        }
        else if(piece == blackPawn8) {
            tempX3 = blackPawn8_x; 
            tempY3 = blackPawn8_y; 
        }
        
        if(piece == whiteRook1) {
            whiteRook1_x = x; 
            whiteRook1_y = y; 
        }
        else if(piece == whiteKnight1) {
            whiteKnight1_x = x; 
            whiteKnight1_y = y; 
        }
        else if(piece == whiteBishop1) {
            whiteBishop1_x = x; 
            whiteBishop1_y = y; 
        }
        else if(piece == whiteQueen) {
            whiteQueen_x = x; 
            whiteQueen_y = y; 
        }
        else if(piece == whiteKing) {
            whiteKing_x = x; 
            whiteKing_y = y; 
        }
        else if(piece == whiteBishop2) {
            whiteBishop2_x = x; 
            whiteBishop2_y = y; 
        }
        else if(piece == whiteKnight2) {
            whiteKnight2_x = x; 
            whiteKnight2_y = y; 
        }
        else if(piece == whiteRook2) {
            whiteRook2_x = x; 
            whiteRook2_y = y; 
        }
        else if(piece == whitePawn1) {
            whitePawn1_x = x; 
            whitePawn1_y = y; 
        }
        else if(piece == whitePawn2) {
            whitePawn2_x = x; 
            whitePawn2_y = y; 
        }
        else if(piece == whitePawn3) {
            whitePawn3_x = x; 
            whitePawn3_y = y; 
        }
        else if(piece == whitePawn4) {
            whitePawn4_x = x; 
            whitePawn4_y = y; 
        }
        else if(piece == whitePawn5) {
            whitePawn5_x = x; 
            whitePawn5_y = y; 
        }
        else if(piece == whitePawn6) {
            whitePawn6_x = x; 
            whitePawn6_y = y; 
        }
        else if(piece == whitePawn7) {
            whitePawn7_x = x; 
            whitePawn7_y = y; 
        }
        else if(piece == whitePawn8) {
            whitePawn8_x = x; 
            whitePawn8_y = y; 
        }
        else if(piece == blackRook1) {
            blackRook1_x = x; 
            blackRook1_y = y; 
        }
        else if(piece == blackKnight1) {
            blackKnight1_x = x; 
            blackKnight1_y = y; 
        }
        else if(piece == blackBishop1) {
            blackBishop1_x = x; 
            blackBishop1_y = y; 
        }
        else if(piece == blackQueen) {
            blackQueen_x = x; 
            blackQueen_y = y; 
        }
        else if(piece == blackKing) {
            blackKing_x = x; 
            blackKing_y = y; 
        }
        else if(piece == blackBishop2) {
            blackBishop2_x = x; 
            blackBishop2_y = y; 
        }
        else if(piece == blackKnight2) {
            blackKnight2_x = x; 
            blackKnight2_y = y; 
        }
        else if(piece == blackRook2) {
            blackRook2_x = x; 
            blackRook2_y = y; 
        }
        else if(piece == blackPawn1) {
            blackPawn1_x = x; 
            blackPawn1_y = y; 
        }
        else if(piece == blackPawn2) {
            blackPawn2_x = x; 
            blackPawn2_y = y; 
        }
        else if(piece == blackPawn3) {
            blackPawn3_x = x; 
            blackPawn3_y = y; 
        }
        else if(piece == blackPawn4) {
            blackPawn4_x = x; 
            blackPawn4_y = y; 
        }
        else if(piece == blackPawn5) {
            blackPawn5_x = x; 
            blackPawn5_y = y; 
        }
        else if(piece == blackPawn6) {
            blackPawn6_x = x; 
            blackPawn6_y = y; 
        }
        else if(piece == blackPawn7) {
            blackPawn7_x = x; 
            blackPawn7_y = y; 
        }
        else if(piece == blackPawn8) {
            blackPawn8_x = x; 
            blackPawn8_y = y; 
        }
        
        
    }
    public void switchBackPiece2(JLabel piece) {
        
        if(piece == whiteRook1) { //byt tillbaka till ursprunglig position
            whiteRook1_x = tempX2;
            whiteRook1_y = tempY2; 
        }
        else if(piece == whiteKnight1) {
            whiteKnight1_x = tempX2;
            whiteKnight1_y = tempY2; 
        }
        else if(piece == whiteBishop1) {
            whiteBishop1_x = tempX2;
            whiteBishop1_y = tempY2; 
        }
        else if(piece == whiteQueen) {
            whiteQueen_x = tempX2;
            whiteQueen_y = tempY2; 
        }
        else if(piece == whiteKing) {
            whiteKing_x = tempX2;
            whiteKing_y = tempY2; 
        }
        else if(piece == whiteBishop2) {
            whiteBishop2_x = tempX2;
            whiteBishop2_y = tempY2; 
        }
        else if(piece == whiteKnight2) {
            whiteKnight2_x = tempX2;
            whiteKnight2_y = tempY2; 
        }
        else if(piece == whiteRook2) {
            whiteRook2_x = tempX2;
            whiteRook2_y = tempY2; 
        }
        else if(piece == whitePawn1) {
            whitePawn1_x = tempX2;
            whitePawn1_y = tempY2; 
        }
        else if(piece == whitePawn2) {
            whitePawn2_x = tempX2;
            whitePawn2_y = tempY2; 
        }
        else if(piece == whitePawn3) {
            whitePawn3_x = tempX2;
            whitePawn3_y = tempY2; 
        }
        else if(piece == whitePawn4) {
            whitePawn4_x = tempX2;
            whitePawn4_y = tempY2; 
        }
        else if(piece == whitePawn5) {
            whitePawn5_x = tempX2;
            whitePawn5_y = tempY2; 
        }
        else if(piece == whitePawn6) {
            whitePawn6_x = tempX2;
            whitePawn6_y = tempY2; 
        }
        else if(piece == whitePawn7) {
            whitePawn7_x = tempX2;
            whitePawn7_y = tempY2; 
        }
        else if(piece == whitePawn8) {
            whitePawn8_x = tempX2;
            whitePawn8_y = tempY2; 
        }
        if(piece == blackRook1) { 
            blackRook1_x = tempX2;
            blackRook1_y = tempY2; 
        }
        else if(piece == blackKnight1) {
            blackKnight1_x = tempX2;
            blackKnight1_y = tempY2; 
        }
        else if(piece == blackBishop1) {
            blackBishop1_x = tempX2;
            blackBishop1_y = tempY2; 
        }
        else if(piece == blackQueen) {
            blackQueen_x = tempX2;
            blackQueen_y = tempY2; 
        }
        else if(piece == blackKing) {
            blackKing_x = tempX2;
            blackKing_y = tempY2; 
        }
        else if(piece == blackBishop2) {
            blackBishop2_x = tempX2;
            blackBishop2_y = tempY2; 
        }
        else if(piece == blackKnight2) {
            blackKnight2_x = tempX2;
            blackKnight2_y = tempY2; 
        }
        else if(piece == blackRook2) {
            blackRook2_x = tempX2;
            blackRook2_y = tempY2; 
        }
        else if(piece == blackPawn1) {
            blackPawn1_x = tempX2;
            blackPawn1_y = tempY2; 
        }
        else if(piece == blackPawn2) {
            blackPawn2_x = tempX2;
            blackPawn2_y = tempY2; 
        }
        else if(piece == blackPawn3) {
            blackPawn3_x = tempX2;
            blackPawn3_y = tempY2; 
        }
        else if(piece == blackPawn4) {
            blackPawn4_x = tempX2;
            blackPawn4_y = tempY2; 
        }
        else if(piece == blackPawn5) {
            blackPawn5_x = tempX2;
            blackPawn5_y = tempY2; 
        }
        else if(piece == blackPawn6) {
            blackPawn6_x = tempX2;
            blackPawn6_y = tempY2; 
        }
        else if(piece == blackPawn7) {
            blackPawn7_x = tempX2;
            blackPawn7_y = tempY2; 
        }
        else if(piece == blackPawn8) {
            blackPawn8_x = tempX2;
            blackPawn8_y = tempY2; 
        }
        
    }
    public void switchToPos2(int x, int y, JLabel piece) {
        
        if(piece == whiteRook1) { // flytta piece temporärt
            tempX2 = whiteRook1_x; 
            tempY2 = whiteRook1_y; 
        }
        else if(piece == whiteKnight1) {
            tempX2 = whiteKnight1_x; 
            tempY2 = whiteKnight1_y; 
        }
        else if(piece == whiteBishop1) {
            tempX2 = whiteBishop1_x; 
            tempY2 = whiteBishop1_y; 
        }
        else if(piece == whiteQueen) {
            tempX2 = whiteQueen_x; 
            tempY2 = whiteQueen_y; 
        }
        else if(piece == whiteKing) {
            tempX2 = whiteKing_x; 
            tempY2 = whiteKing_y; 
        }
        else if(piece == whiteBishop2) {
            tempX2 = whiteBishop2_x; 
            tempY2 = whiteBishop2_y; 
        }
        else if(piece == whiteKnight2) {
            tempX2 = whiteKnight2_x; 
            tempY2 = whiteKnight2_y; 
        }
        else if(piece == whiteRook2) {
            tempX2 = whiteRook2_x; 
            tempY2 = whiteRook2_y; 
        }
        else if(piece == whitePawn1) {
            tempX2 = whitePawn1_x; 
            tempY2 = whitePawn1_y; 
        }
        else if(piece == whitePawn2) {
            tempX2 = whitePawn2_x; 
            tempY2 = whitePawn2_y; 
        }
        else if(piece == whitePawn3) {
            tempX2 = whitePawn3_x; 
            tempY2 = whitePawn3_y; 
        }
        else if(piece == whitePawn4) {
            tempX2 = whitePawn4_x; 
            tempY2 = whitePawn4_y; 
        }
        else if(piece == whitePawn5) {
            tempX2 = whitePawn5_x; 
            tempY2 = whitePawn5_y; 
        }
        else if(piece == whitePawn6) {
            tempX2 = whitePawn6_x; 
            tempY2 = whitePawn6_y; 
        }
        else if(piece == whitePawn7) {
            tempX2 = whitePawn7_x; 
            tempY2 = whitePawn7_y; 
        }
        else if(piece == whitePawn8) {
            tempX2 = whitePawn8_x; 
            tempY2 = whitePawn8_y; 
        }
        else if(piece == blackRook1) {
            tempX2 = blackRook1_x; 
            tempY2 = blackRook1_y; 
        }
        else if(piece == blackKnight1) {
            tempX2 = blackKnight1_x; 
            tempY2 = blackKnight1_y; 
        }
        else if(piece == blackBishop1) {
            tempX2 = blackBishop1_x; 
            tempY2 = blackBishop1_y; 
        }
        else if(piece == blackQueen) {
            tempX2 = blackQueen_x; 
            tempY2 = blackQueen_y; 
        }
        else if(piece == blackKing) {
            tempX2 = blackKing_x; 
            tempY2 = blackKing_y; 
        }
        else if(piece == blackBishop2) {
            tempX2 = blackBishop2_x; 
            tempY2 = blackBishop2_y; 
        }
        else if(piece == blackKnight2) {
            tempX2 = blackKnight2_x; 
            tempY2 = blackKnight2_y; 
        }
        else if(piece == blackRook2) {
            tempX2 = blackRook2_x; 
            tempY2 = blackRook2_y; 
        }
        else if(piece == blackPawn1) {
            tempX2 = blackPawn1_x; 
            tempY2 = blackPawn1_y; 
        }
        else if(piece == blackPawn2) {
            tempX2 = blackPawn2_x; 
            tempY2 = blackPawn2_y; 
        }
        else if(piece == blackPawn3) {
            tempX2 = blackPawn3_x; 
            tempY2 = blackPawn3_y; 
        }
        else if(piece == blackPawn4) {
            tempX2 = blackPawn4_x; 
            tempY2 = blackPawn4_y; 
        }
        else if(piece == blackPawn5) {
            tempX2 = blackPawn5_x; 
            tempY2 = blackPawn5_y; 
        }
        else if(piece == blackPawn6) {
            tempX2 = blackPawn6_x; 
            tempY2 = blackPawn6_y; 
        }
        else if(piece == blackPawn7) {
            tempX2 = blackPawn7_x; 
            tempY2 = blackPawn7_y; 
        }
        else if(piece == blackPawn8) {
            tempX2 = blackPawn8_x; 
            tempY2 = blackPawn8_y; 
        }
        
        if(piece == whiteRook1) {
            whiteRook1_x = x; 
            whiteRook1_y = y; 
        }
        else if(piece == whiteKnight1) {
            whiteKnight1_x = x; 
            whiteKnight1_y = y; 
        }
        else if(piece == whiteBishop1) {
            whiteBishop1_x = x; 
            whiteBishop1_y = y; 
        }
        else if(piece == whiteQueen) {
            whiteQueen_x = x; 
            whiteQueen_y = y; 
        }
        else if(piece == whiteKing) {
            whiteKing_x = x; 
            whiteKing_y = y; 
        }
        else if(piece == whiteBishop2) {
            whiteBishop2_x = x; 
            whiteBishop2_y = y; 
        }
        else if(piece == whiteKnight2) {
            whiteKnight2_x = x; 
            whiteKnight2_y = y; 
        }
        else if(piece == whiteRook2) {
            whiteRook2_x = x; 
            whiteRook2_y = y; 
        }
        else if(piece == whitePawn1) {
            whitePawn1_x = x; 
            whitePawn1_y = y; 
        }
        else if(piece == whitePawn2) {
            whitePawn2_x = x; 
            whitePawn2_y = y; 
        }
        else if(piece == whitePawn3) {
            whitePawn3_x = x; 
            whitePawn3_y = y; 
        }
        else if(piece == whitePawn4) {
            whitePawn4_x = x; 
            whitePawn4_y = y; 
        }
        else if(piece == whitePawn5) {
            whitePawn5_x = x; 
            whitePawn5_y = y; 
        }
        else if(piece == whitePawn6) {
            whitePawn6_x = x; 
            whitePawn6_y = y; 
        }
        else if(piece == whitePawn7) {
            whitePawn7_x = x; 
            whitePawn7_y = y; 
        }
        else if(piece == whitePawn8) {
            whitePawn8_x = x; 
            whitePawn8_y = y; 
        }
        else if(piece == blackRook1) {
            blackRook1_x = x; 
            blackRook1_y = y; 
        }
        else if(piece == blackKnight1) {
            blackKnight1_x = x; 
            blackKnight1_y = y; 
        }
        else if(piece == blackBishop1) {
            blackBishop1_x = x; 
            blackBishop1_y = y; 
        }
        else if(piece == blackQueen) {
            blackQueen_x = x; 
            blackQueen_y = y; 
        }
        else if(piece == blackKing) {
            blackKing_x = x; 
            blackKing_y = y; 
        }
        else if(piece == blackBishop2) {
            blackBishop2_x = x; 
            blackBishop2_y = y; 
        }
        else if(piece == blackKnight2) {
            blackKnight2_x = x; 
            blackKnight2_y = y; 
        }
        else if(piece == blackRook2) {
            blackRook2_x = x; 
            blackRook2_y = y; 
        }
        else if(piece == blackPawn1) {
            blackPawn1_x = x; 
            blackPawn1_y = y; 
        }
        else if(piece == blackPawn2) {
            blackPawn2_x = x; 
            blackPawn2_y = y; 
        }
        else if(piece == blackPawn3) {
            blackPawn3_x = x; 
            blackPawn3_y = y; 
        }
        else if(piece == blackPawn4) {
            blackPawn4_x = x; 
            blackPawn4_y = y; 
        }
        else if(piece == blackPawn5) {
            blackPawn5_x = x; 
            blackPawn5_y = y; 
        }
        else if(piece == blackPawn6) {
            blackPawn6_x = x; 
            blackPawn6_y = y; 
        }
        else if(piece == blackPawn7) {
            blackPawn7_x = x; 
            blackPawn7_y = y; 
        }
        else if(piece == blackPawn8) {
            blackPawn8_x = x; 
            blackPawn8_y = y; 
        }
        
        
    }
    public void switchBackPiece(JLabel piece) {
        
        if(piece == whiteRook1) { //byt tillbaka till ursprunglig position
            whiteRook1_x = tempX;
            whiteRook1_y = tempY; 
        }
        else if(piece == whiteKnight1) {
            whiteKnight1_x = tempX;
            whiteKnight1_y = tempY; 
        }
        else if(piece == whiteBishop1) {
            whiteBishop1_x = tempX;
            whiteBishop1_y = tempY; 
        }
        else if(piece == whiteQueen) {
            whiteQueen_x = tempX;
            whiteQueen_y = tempY; 
        }
        else if(piece == whiteKing) {
            whiteKing_x = tempX;
            whiteKing_y = tempY; 
        }
        else if(piece == whiteBishop2) {
            whiteBishop2_x = tempX;
            whiteBishop2_y = tempY; 
        }
        else if(piece == whiteKnight2) {
            whiteKnight2_x = tempX;
            whiteKnight2_y = tempY; 
        }
        else if(piece == whiteRook2) {
            whiteRook2_x = tempX;
            whiteRook2_y = tempY; 
        }
        else if(piece == whitePawn1) {
            whitePawn1_x = tempX;
            whitePawn1_y = tempY; 
        }
        else if(piece == whitePawn2) {
            whitePawn2_x = tempX;
            whitePawn2_y = tempY; 
        }
        else if(piece == whitePawn3) {
            whitePawn3_x = tempX;
            whitePawn3_y = tempY; 
        }
        else if(piece == whitePawn4) {
            whitePawn4_x = tempX;
            whitePawn4_y = tempY; 
        }
        else if(piece == whitePawn5) {
            whitePawn5_x = tempX;
            whitePawn5_y = tempY; 
        }
        else if(piece == whitePawn6) {
            whitePawn6_x = tempX;
            whitePawn6_y = tempY; 
        }
        else if(piece == whitePawn7) {
            whitePawn7_x = tempX;
            whitePawn7_y = tempY; 
        }
        else if(piece == whitePawn8) {
            whitePawn8_x = tempX;
            whitePawn8_y = tempY; 
        }
        else if(piece == blackRook1) { 
            blackRook1_x = tempX;
            blackRook1_y = tempY; 
        }
        else if(piece == blackKnight1) {
            blackKnight1_x = tempX;
            blackKnight1_y = tempY; 
        }
        else if(piece == blackBishop1) {
            blackBishop1_x = tempX;
            blackBishop1_y = tempY; 
        }
        else if(piece == blackQueen) {
            blackQueen_x = tempX;
            blackQueen_y = tempY; 
        }
        else if(piece == blackKing) {
            blackKing_x = tempX;
            blackKing_y = tempY; 
        }
        else if(piece == blackBishop2) {
            blackBishop2_x = tempX;
            blackBishop2_y = tempY; 
        }
        else if(piece == blackKnight2) {
            blackKnight2_x = tempX;
            blackKnight2_y = tempY; 
        }
        else if(piece == blackRook2) {
            blackRook2_x = tempX;
            blackRook2_y = tempY; 
        }
        else if(piece == blackPawn1) {
            blackPawn1_x = tempX;
            blackPawn1_y = tempY; 
        }
        else if(piece == blackPawn2) {
            blackPawn2_x = tempX;
            blackPawn2_y = tempY; 
        }
        else if(piece == blackPawn3) {
            blackPawn3_x = tempX;
            blackPawn3_y = tempY; 
        }
        else if(piece == blackPawn4) {
            blackPawn4_x = tempX;
            blackPawn4_y = tempY; 
        }
        else if(piece == blackPawn5) {
            blackPawn5_x = tempX;
            blackPawn5_y = tempY; 
        }
        else if(piece == blackPawn6) {
            blackPawn6_x = tempX;
            blackPawn6_y = tempY; 
        }
        else if(piece == blackPawn7) {
            blackPawn7_x = tempX;
            blackPawn7_y = tempY; 
        }
        else if(piece == blackPawn8) {
            blackPawn8_x = tempX;
            blackPawn8_y = tempY; 
        }
        
    }
    public void switchToPos(int x, int y, JLabel piece) {
        
        if(piece == whiteRook1) { // flytta piece temporärt
            tempX = whiteRook1_x; 
            tempY = whiteRook1_y; 
        }
        else if(piece == whiteKnight1) {
            tempX = whiteKnight1_x; 
            tempY = whiteKnight1_y; 
        }
        else if(piece == whiteBishop1) {
            tempX = whiteBishop1_x; 
            tempY = whiteBishop1_y; 
        }
        else if(piece == whiteQueen) {
            tempX = whiteQueen_x; 
            tempY = whiteQueen_y; 
        }
        else if(piece == whiteKing) {
            tempX = whiteKing_x; 
            tempY = whiteKing_y; 
        }
        else if(piece == whiteBishop2) {
            tempX = whiteBishop2_x; 
            tempY = whiteBishop2_y; 
        }
        else if(piece == whiteKnight2) {
            tempX = whiteKnight2_x; 
            tempY = whiteKnight2_y; 
        }
        else if(piece == whiteRook2) {
            tempX = whiteRook2_x; 
            tempY = whiteRook2_y; 
        }
        else if(piece == whitePawn1) {
            tempX = whitePawn1_x; 
            tempY = whitePawn1_y; 
        }
        else if(piece == whitePawn2) {
            tempX = whitePawn2_x; 
            tempY = whitePawn2_y; 
        }
        else if(piece == whitePawn3) {
            tempX = whitePawn3_x; 
            tempY = whitePawn3_y; 
        }
        else if(piece == whitePawn4) {
            tempX = whitePawn4_x; 
            tempY = whitePawn4_y; 
        }
        else if(piece == whitePawn5) {
            tempX = whitePawn5_x; 
            tempY = whitePawn5_y; 
        }
        else if(piece == whitePawn6) {
            tempX = whitePawn6_x; 
            tempY = whitePawn6_y; 
        }
        else if(piece == whitePawn7) {
            tempX = whitePawn7_x; 
            tempY = whitePawn7_y; 
        }
        else if(piece == whitePawn8) {
            tempX = whitePawn8_x; 
            tempY = whitePawn8_y; 
        }
        else if(piece == blackRook1) {
            tempX = blackRook1_x; 
            tempY = blackRook1_y; 
        }
        else if(piece == blackKnight1) {
            tempX = blackKnight1_x; 
            tempY = blackKnight1_y; 
        }
        else if(piece == blackBishop1) {
            tempX = blackBishop1_x; 
            tempY = blackBishop1_y; 
        }
        else if(piece == blackQueen) {
            tempX = blackQueen_x; 
            tempY = blackQueen_y; 
        }
        else if(piece == blackKing) {
            tempX = blackKing_x; 
            tempY = blackKing_y; 
        }
        else if(piece == blackBishop2) {
            tempX = blackBishop2_x; 
            tempY = blackBishop2_y; 
        }
        else if(piece == blackKnight2) {
            tempX = blackKnight2_x; 
            tempY = blackKnight2_y; 
        }
        else if(piece == blackRook2) {
            tempX = blackRook2_x; 
            tempY = blackRook2_y; 
        }
        else if(piece == blackPawn1) {
            tempX = blackPawn1_x; 
            tempY = blackPawn1_y; 
        }
        else if(piece == blackPawn2) {
            tempX = blackPawn2_x; 
            tempY = blackPawn2_y; 
        }
        else if(piece == blackPawn3) {
            tempX = blackPawn3_x; 
            tempY = blackPawn3_y; 
        }
        else if(piece == blackPawn4) {
            tempX = blackPawn4_x; 
            tempY = blackPawn4_y; 
        }
        else if(piece == blackPawn5) {
            tempX = blackPawn5_x; 
            tempY = blackPawn5_y; 
        }
        else if(piece == blackPawn6) {
            tempX = blackPawn6_x; 
            tempY = blackPawn6_y; 
        }
        else if(piece == blackPawn7) {
            tempX = blackPawn7_x; 
            tempY = blackPawn7_y; 
        }
        else if(piece == blackPawn8) {
            tempX = blackPawn8_x; 
            tempY = blackPawn8_y; 
        }
        
        if(piece == whiteRook1) {
            whiteRook1_x = x; 
            whiteRook1_y = y; 
        }
        else if(piece == whiteKnight1) {
            whiteKnight1_x = x; 
            whiteKnight1_y = y; 
        }
        else if(piece == whiteBishop1) {
            whiteBishop1_x = x; 
            whiteBishop1_y = y; 
        }
        else if(piece == whiteQueen) {
            whiteQueen_x = x; 
            whiteQueen_y = y; 
        }
        else if(piece == whiteKing) {
            whiteKing_x = x; 
            whiteKing_y = y; 
        }
        else if(piece == whiteBishop2) {
            whiteBishop2_x = x; 
            whiteBishop2_y = y; 
        }
        else if(piece == whiteKnight2) {
            whiteKnight2_x = x; 
            whiteKnight2_y = y; 
        }
        else if(piece == whiteRook2) {
            whiteRook2_x = x; 
            whiteRook2_y = y; 
        }
        else if(piece == whitePawn1) {
            whitePawn1_x = x; 
            whitePawn1_y = y; 
        }
        else if(piece == whitePawn2) {
            whitePawn2_x = x; 
            whitePawn2_y = y; 
        }
        else if(piece == whitePawn3) {
            whitePawn3_x = x; 
            whitePawn3_y = y; 
        }
        else if(piece == whitePawn4) {
            whitePawn4_x = x; 
            whitePawn4_y = y; 
        }
        else if(piece == whitePawn5) {
            whitePawn5_x = x; 
            whitePawn5_y = y; 
        }
        else if(piece == whitePawn6) {
            whitePawn6_x = x; 
            whitePawn6_y = y; 
        }
        else if(piece == whitePawn7) {
            whitePawn7_x = x; 
            whitePawn7_y = y; 
        }
        else if(piece == whitePawn8) {
            whitePawn8_x = x; 
            whitePawn8_y = y; 
        }
        else if(piece == blackRook1) {
            blackRook1_x = x; 
            blackRook1_y = y; 
        }
        else if(piece == blackKnight1) {
            blackKnight1_x = x; 
            blackKnight1_y = y; 
        }
        else if(piece == blackBishop1) {
            blackBishop1_x = x; 
            blackBishop1_y = y; 
        }
        else if(piece == blackQueen) {
            blackQueen_x = x; 
            blackQueen_y = y; 
        }
        else if(piece == blackKing) {
            blackKing_x = x; 
            blackKing_y = y; 
        }
        else if(piece == blackBishop2) {
            blackBishop2_x = x; 
            blackBishop2_y = y; 
        }
        else if(piece == blackKnight2) {
            blackKnight2_x = x; 
            blackKnight2_y = y; 
        }
        else if(piece == blackRook2) {
            blackRook2_x = x; 
            blackRook2_y = y; 
        }
        else if(piece == blackPawn1) {
            blackPawn1_x = x; 
            blackPawn1_y = y; 
        }
        else if(piece == blackPawn2) {
            blackPawn2_x = x; 
            blackPawn2_y = y; 
        }
        else if(piece == blackPawn3) {
            blackPawn3_x = x; 
            blackPawn3_y = y; 
        }
        else if(piece == blackPawn4) {
            blackPawn4_x = x; 
            blackPawn4_y = y; 
        }
        else if(piece == blackPawn5) {
            blackPawn5_x = x; 
            blackPawn5_y = y; 
        }
        else if(piece == blackPawn6) {
            blackPawn6_x = x; 
            blackPawn6_y = y; 
        }
        else if(piece == blackPawn7) {
            blackPawn7_x = x; 
            blackPawn7_y = y; 
        }
        else if(piece == blackPawn8) {
            blackPawn8_x = x; 
            blackPawn8_y = y; 
        }
        
        
    }
    //////////
    public void moveArrayPositionsTo(int n) { // flytta från possibleoutcomes till annan outcome array
        
        if(n == 1) {
            int k = 0; 
            while(possibleOutcomes_x[k] != -1) {
                k++; 
            } // k = antal tagna positioner
            if(possibleOutcomes_x[0] == -1) {
                //gör inget/lägg inte till några nya positioner
            }
            else {
                for(int i = 0; i < k; i++) {
                    possibleOutcomes1_x[i] = possibleOutcomes_x[i];
                    possibleOutcomes1_y[i] = possibleOutcomes_y[i];
                    possibleOutcomes1_piece[i] = possibleOutcomes_piece[i];
                }
            }
        }
        else if(n == 2) {
            int k = 0; 
            while(possibleOutcomes_x[k] != -1) {
                k++; 
            } 
            if(possibleOutcomes_x[0] == -1) {
                //gör inget/lägg inte till några nya positioner
            }
            else {
                for(int i = 0; i < k; i++) {
                    possibleOutcomes2_x[i] = possibleOutcomes_x[i];
                    possibleOutcomes2_y[i] = possibleOutcomes_y[i];
                    possibleOutcomes2_piece[i] = possibleOutcomes_piece[i];
                }
            }
        }
        else if(n == 3) {
            int k = 0; 
            while(possibleOutcomes_x[k] != -1) {
                k++; 
            }
            if(possibleOutcomes_x[0] == -1) {
                //gör inget/lägg inte till några nya positioner
            }
            else {
                for(int i = 0; i < k; i++) {
                    possibleOutcomes3_x[i] = possibleOutcomes_x[i];
                    possibleOutcomes3_y[i] = possibleOutcomes_y[i];
                    possibleOutcomes3_piece[i] = possibleOutcomes_piece[i];
                }
            }
        }
        
    }
    public void getArrayPositions(JLabel piece) {
        
        findPossibleMoves(piece);
        
        int k = 0; 
        while(possibleX[k] != -1) {
            k++; 
        } // k = antal möjliga positioner
  
        if(possibleX[0] == -1) {
            //gör inget/lägg inte till några nya positioner
        }
        else {
            for(int i = 0; i < k; i++) { // flytta positions till possibleOutcomes[]
                possibleOutcomes_x[i + safePos] = possibleX[i];
                possibleOutcomes_y[i + safePos] = possibleY[i];
                possibleOutcomes_piece[i + safePos] = piece;  
            }
            int i = 0; 
            while(possibleOutcomes_x[i] != -1) {
                i++; // i = antal tagna positioner
            } i--;
            safePos = i; //uppdaterar safePos 
        }
        int j = 0; 
        while(killX[j] != -1) {
            j++; //lägg till för kills 
        }
        if(killX[0] == -1) {
            //inget
        }
        else {
            for(int i = 0; i < j; i++) { // flytta positions till possibleOutcomes[]
                possibleOutcomes_x[i + safePos] = killX[i];
                possibleOutcomes_y[i + safePos] = killY[i];
                possibleOutcomes_piece[i + safePos] = piece;  
            }
            int i = 0; 
            while(possibleOutcomes_x[i] != -1) {
                i++; 
            } i--; 
            safePos = i; //uppdaterar safePos igen
        }
        
    }
    public void findPossibleOutcomes(String color) { // gå igenom alla pjäser på plan och ge möjliga drag för denna runda
        
        for(int i = 0; i < possibleOutcomes_x.length; i++) { // cleara positioner 0-71
            possibleOutcomes_x[i] = -1; 
            possibleOutcomes_y[i] = -1; 
            possibleOutcomes_piece[i] = none;
        }
        safePos = 0; 
        
        if(color.equals("black")) {
            if(blackRook1_x <= (MAX_XPOS)) {
                getArrayPositions(blackRook1);
            }
            if(blackKnight1_x <= (MAX_XPOS)) {
                getArrayPositions(blackKnight1);
            }
            if(blackBishop1_x <= (MAX_XPOS)) {
                getArrayPositions(blackBishop1);
            }
            if(blackQueen_x <= (MAX_XPOS)) {
                getArrayPositions(blackQueen);
            }
            if(blackKing_x <= (MAX_XPOS)) {
                getArrayPositions(blackKing);
            }
            if(blackBishop2_x <= (MAX_XPOS)) {
                getArrayPositions(blackBishop2);
            }
            if(blackKnight2_x <= (MAX_XPOS)) {
                getArrayPositions(blackKnight2);
            }
            if(blackRook2_x <= (MAX_XPOS)) {
                getArrayPositions(blackRook2);
            }
            if(blackPawn1_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn1);
            }
            if(blackPawn2_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn2);
            }
            if(blackPawn3_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn3);
            }
            if(blackPawn4_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn4);
            }
            if(blackPawn5_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn5);
            }
            if(blackPawn6_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn6);
            }
            if(blackPawn7_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn7);
            }
            if(blackPawn8_x <= (MAX_XPOS)) {
                getArrayPositions(blackPawn8);
            }
        }
        else if (color.equals("white")) {
            if(whiteRook1_x <= (MAX_XPOS)) {
                getArrayPositions(whiteRook1);
            }
            if(whiteKnight1_x <= (MAX_XPOS)) {
                getArrayPositions(whiteKnight1);
            }
            if(whiteBishop1_x <= (MAX_XPOS)) {
                getArrayPositions(whiteBishop1);
            }
            if(whiteQueen_x <= (MAX_XPOS)) {
                getArrayPositions(whiteQueen);
            }
            if(whiteKing_x <= (MAX_XPOS)) {
                getArrayPositions(whiteKing);
            }
            if(whiteBishop2_x <= (MAX_XPOS)) {
                getArrayPositions(whiteBishop2);
            }
            if(whiteKnight2_x <= (MAX_XPOS)) {
                getArrayPositions(whiteKnight2);
            }
            if(whiteRook2_x <= (MAX_XPOS)) {
                getArrayPositions(whiteRook2);
            }
            if(whitePawn1_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn1);
            }
            if(whitePawn2_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn2);
            }
            if(whitePawn3_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn3);
            }
            if(whitePawn4_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn4);
            }
            if(whitePawn5_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn5);
            }
            if(whitePawn6_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn6);
            }
            if(whitePawn7_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn7);
            }
            if(whitePawn8_x <= (MAX_XPOS)) {
                getArrayPositions(whitePawn8);
            }
        }
        
    }
    public void clearArrays() {
        
        for(int i = 0; i < MAX_OUTCOMES; i++) { //positioner 0-71
            possibleOutcomes_x[i] = -1; 
            possibleOutcomes1_x[i] = -1; 
            possibleOutcomes2_x[i] = -1; 
            possibleOutcomes3_x[i] = -1; 
            
            possibleOutcomes_y[i] = -1; 
            possibleOutcomes1_y[i] = -1; 
            possibleOutcomes2_y[i] = -1; 
            possibleOutcomes3_y[i] = -1; 
            
            possibleOutcomes_piece[i] = none;
            possibleOutcomes1_piece[i] = none;
            possibleOutcomes2_piece[i] = none;
            possibleOutcomes3_piece[i] = none;
            
            posHighestValueArray[i] = -1;
            value3[i] = -1; 
            bestValue3ArrayPos[i] = -1; 
        }
        
    }
    ///////////
    public void compMove() {
        
        whitePawn1_doubleMove = false; 
        whitePawn2_doubleMove = false; 
        whitePawn3_doubleMove = false; 
        whitePawn4_doubleMove = false; 
        whitePawn5_doubleMove = false; 
        whitePawn6_doubleMove = false; 
        whitePawn7_doubleMove = false; 
        whitePawn8_doubleMove = false; 
        
        lastPieceWasWhiteKing = false; 
        justKilled = false; 
        
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
                valueMoveKill(possibleOutcomes_x[b], possibleOutcomes_y[b], possibleOutcomes_piece[b]);
                
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
            
                switchToPos2(possibleOutcomes2_x[a], possibleOutcomes2_y[a], possibleOutcomes2_piece[a]);

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
                    valueMoveKill(possibleOutcomes_x[c], possibleOutcomes_y[c], possibleOutcomes_piece[c]);
                    
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
        
        if(possibleOutcomes1_piece[bestPos3] == blackPawn1 && possibleOutcomes1_y[bestPos3] == blackPawn1_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = true; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn2 && possibleOutcomes1_y[bestPos3] == blackPawn2_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = true; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn3 && possibleOutcomes1_y[bestPos3] == blackPawn3_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = true; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn4 && possibleOutcomes1_y[bestPos3] == blackPawn4_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = true; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn5 && possibleOutcomes1_y[bestPos3] == blackPawn5_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = true; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn6 && possibleOutcomes1_y[bestPos3] == blackPawn6_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = true; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn7 && possibleOutcomes1_y[bestPos3] == blackPawn7_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = true; 
            blackPawn8_doubleMove = false; 
            
        }
        else if(possibleOutcomes1_piece[bestPos3] == blackPawn8 && possibleOutcomes1_y[bestPos3] == blackPawn8_y + CEL_WIDTH*2) {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = true; 
            
        }
        else {
            
            blackPawn1_doubleMove = false; 
            blackPawn2_doubleMove = false; 
            blackPawn3_doubleMove = false; 
            blackPawn4_doubleMove = false; 
            blackPawn5_doubleMove = false; 
            blackPawn6_doubleMove = false; 
            blackPawn7_doubleMove = false; 
            blackPawn8_doubleMove = false; 
            
        }
        
    }
    ///////////COMP SLUT//////////////////////////
    
    public void getPromotionVertical(String piece) {
        
        if(piece.equals("whitePawn1")) {
            getCel(whitePawn1_x);
        }
        else if(piece.equals("whitePawn2")) {
            getCel(whitePawn2_x);
        }
        else if(piece.equals("whitePawn3")) {
            getCel(whitePawn3_x);
        }
        else if(piece.equals("whitePawn4")) {
            getCel(whitePawn4_x);
        }
        else if(piece.equals("whitePawn5")) {
            getCel(whitePawn5_x);
        }
        else if(piece.equals("whitePawn6")) {
            getCel(whitePawn6_x);
        }
        else if(piece.equals("whitePawn7")) {
            getCel(whitePawn7_x);
        }
        else if(piece.equals("whitePawn8")) {
            getCel(whitePawn8_x);
        }
        else if(piece.equals("whiteRook1")) {
            getCel(whiteRook1_x);
        }
        else if(piece.equals("whiteKnight1")) {
            getCel(whiteKnight1_x);
        }
        else if(piece.equals("whiteBishop1")) {
            getCel(whiteBishop1_x);
        }
        else if(piece.equals("whiteQueen")) {
            getCel(whiteQueen_x);
        }
        else if(piece.equals("whiteKing")) {
            getCel(whiteKing_x);
        }
        else if(piece.equals("whiteBishop2")) {
            getCel(whiteBishop2_x);
        }
        else if(piece.equals("whiteKnight2")) {
            getCel(whiteKnight2_x);
        }
        else if(piece.equals("whiteRook2")) {
            getCel(whiteRook2_x);
        }
        else if(piece.equals("blackPawn1")) {
            getCel(blackPawn1_x);
        }
        else if(piece.equals("blackPawn2")) {
            getCel(blackPawn2_x);
        }
        else if(piece.equals("blackPawn3")) {
            getCel(blackPawn3_x);
        }
        else if(piece.equals("blackPawn4")) {
            getCel(blackPawn4_x);
        }
        else if(piece.equals("blackPawn5")) {
            getCel(blackPawn5_x);
        }
        else if(piece.equals("blackPawn6")) {
            getCel(blackPawn6_x);
        }
        else if(piece.equals("blackPawn7")) {
            getCel(blackPawn7_x);
        }
        else if(piece.equals("blackPawn8")) {
            getCel(blackPawn8_x);
        }
        else if(piece.equals("blackRook1")) {
            getCel(blackRook1_x);
        }
        else if(piece.equals("blackKnight1")) {
            getCel(blackKnight1_x);
        }
        else if(piece.equals("blackBishop1")) {
            getCel(blackBishop1_x);
        }
        else if(piece.equals("blackQueen")) {
            getCel(blackQueen_x);
        }
        else if(piece.equals("blackKing")) {
            getCel(blackKing_x);
        }
        else if(piece.equals("blackBishop2")) {
            getCel(blackBishop2_x);
        }
        else if(piece.equals("blackKnight2")) {
            getCel(blackKnight2_x);
        }
        else if(piece.equals("blackRook2")) {
            getCel(blackRook2_x);
        }
        
    }
    public void getCel(int x) {
        
        if(empty1_x == x || empty57_x == x) {
            vertical = "a";
        }
        else if(empty2_x == x || empty58_x == x) {
            vertical = "b";
        }
        else if(empty3_x == x || empty59_x == x) {
            vertical = "c";
        }
        else if(empty4_x == x || empty60_x == x) {
            vertical = "d";
        }
        else if(empty5_x == x || empty61_x == x) {
            vertical = "e";
        }
        else if(empty6_x == x || empty62_x == x) {
            vertical = "f";
        }
        else if(empty7_x == x || empty63_x == x) {
            vertical = "g";
        }
        else if(empty8_x == x || empty64_x == x) {
            vertical = "h";
        }
        
    }
    
    //mouseclicked checks
    public void checkPromotion(JLabel click) {
        
        if(click == whiteQueenPro || click == whiteKnightPro || click == whiteRookPro || click == whiteBishopPro || 
                click == blackQueenPro || click == blackKnightPro || click == blackRookPro || click == blackBishopPro) {

            if(click == whiteQueenPro) {

                changeToPromotion("whiteQueen.png");
                promotion = "Q";

            }
            else if(click == whiteKnightPro) {
                
                changeToPromotion("whiteKnight.png");
                promotion = "N";
                
            }
            else if(click == whiteRookPro) {
                
                changeToPromotion("whiteRook.png");
                promotion = "R";
                
            }
            else if(click == whiteBishopPro) {
                
                changeToPromotion("whiteBishop.png");
                promotion = "B";
                
            }
            else if(click == blackQueenPro) {

                changeToPromotion("blackQueen.png");
                promotion = "Q";

            }
            else if(click == blackKnightPro) {
                
                changeToPromotion("blackKnight.png");
                promotion = "N";
                
            }
            else if(click == blackRookPro) {
                
                changeToPromotion("blackRook.png");
                promotion = "R";
                
            }
            else if(click == blackBishopPro) {
                
                changeToPromotion("blackBishop.png");
                promotion = "B";
                
            }

            changePromotions("hide");

            getPromotionVertical(lastClick);

            if(justKilled == false) { // om man dödar med promotion
                if(lastClick.equals("whitePawn1") || lastClick.equals("whitePawn2") || lastClick.equals("whitePawn3") || lastClick.equals("whitePawn4") ||
                        lastClick.equals("whitePawn5") || lastClick.equals("whitePawn6") || lastClick.equals("whitePawn7") || lastClick.equals("whitePawn8")) {

                    System.out.print(moveCount + ". " + vertical + "1" + promotion);
                    moveCount++;

                }
                else { // om pjäsen är svart

                    if(moveCount <= 10)  {
                        if(queenCastle) {
                            System.out.println("     " + vertical + "8" + promotion);
                        }
                        else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                            System.out.println("      " + vertical + "8" + promotion);
                        }
                        else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                            System.out.println("       " + vertical + "8" + promotion);
                        }
                        else {
                            System.out.println("        " + vertical + "8" + promotion);
                        }
                    }
                    else {
                        if(queenCastle) {
                            System.out.println("    " + vertical + "8" + promotion);
                        }
                        else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                            System.out.println("     " + vertical + "8" + promotion);
                        }
                        else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                            System.out.println("      " + vertical + "8" + promotion);
                        }
                        else {
                            System.out.println("       " + vertical + "8" + promotion);
                        }
                    }
                }
            }
            else if(justKilled) {
                if(lastClick.equals("whitePawn1") || lastClick.equals("whitePawn2") || lastClick.equals("whitePawn3") || lastClick.equals("whitePawn4") ||
                        lastClick.equals("whitePawn5") || lastClick.equals("whitePawn6") || lastClick.equals("whitePawn7") || lastClick.equals("whitePawn8")) {

                    System.out.print(" " + vertical + "1" + promotion);

                }
                else { // om pjäsen är svart

                    System.out.print(" " + vertical + "8" + promotion);
                    
                }
            }
            
            if(whiteTurn) {
                whiteTurn = false; 
                if(multiplayer) {
                    blackTurn = true; 
                }
            }
            else if(blackTurn) {
                blackTurn = false;
                whiteTurn = true; 
            }
            
        } 
        
    }
    public void changeToPromotion(String imgSrc) {
        if(imgSrc.equals("whiteQueen.png")) {
            pieceCount = 5; 
        }
        else if(imgSrc.equals("whiteKnight.png")) {
            pieceCount = 3; 
        }
        else if(imgSrc.equals("whiteRook.png")) {
            pieceCount = 2; 
        }
        else if(imgSrc.equals("whiteBishop.png")) {
            pieceCount = 4; 
        }
        else if(imgSrc.equals("blackQueen.png")) {
            pieceCount = 5; 
        }
        else if(imgSrc.equals("blackKnight.png")) {
            pieceCount = 3; 
        }
        else if(imgSrc.equals("blackRook.png")) {
            pieceCount = 2; 
        }
        else if(imgSrc.equals("blackBishop.png")) {
            pieceCount = 4; 
        }
        
        if(lastClick.equals("whitePawn1")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn1.setIcon(imageIcon);

            whitePawn1_y = MARGIN_Y;
                        
            whitePawn1_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("whitePawn2")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn2.setIcon(imageIcon);

            whitePawn2_y = MARGIN_Y;

            whitePawn2_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("whitePawn3")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn3.setIcon(imageIcon);

            whitePawn3_y = MARGIN_Y;

            whitePawn3_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("whitePawn4")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn4.setIcon(imageIcon);

            whitePawn4_y = MARGIN_Y;

            whitePawn4_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("whitePawn5")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn5.setIcon(imageIcon);

            whitePawn5_y = MARGIN_Y;

            whitePawn5_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("whitePawn6")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn6.setIcon(imageIcon);

            whitePawn6_y = MARGIN_Y;

            whitePawn6_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("whitePawn7")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn7.setIcon(imageIcon);

            whitePawn7_y = MARGIN_Y;

            whitePawn7_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("whitePawn8")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            whitePawn8.setIcon(imageIcon);

            whitePawn8_y = MARGIN_Y;

            whitePawn8_PieceCount = pieceCount;

        }
        else if(lastClick.equals("blackPawn1")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn1.setIcon(imageIcon);

            blackPawn1_y = MARGIN_Y;
                        
            blackPawn1_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("blackPawn2")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn2.setIcon(imageIcon);

            blackPawn2_y = MARGIN_Y;

            blackPawn2_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("blackPawn3")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn3.setIcon(imageIcon);

            blackPawn3_y = MARGIN_Y;

            blackPawn3_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("blackPawn4")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn4.setIcon(imageIcon);

            blackPawn4_y = MARGIN_Y;

            blackPawn4_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("blackPawn5")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn5.setIcon(imageIcon);

            blackPawn5_y = MARGIN_Y;

            blackPawn5_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("blackPawn6")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn6.setIcon(imageIcon);

            blackPawn6_y = MARGIN_Y;

            blackPawn6_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("blackPawn7")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn7.setIcon(imageIcon);

            blackPawn7_y = MARGIN_Y;

            blackPawn7_PieceCount = pieceCount; 

        }
        else if(lastClick.equals("blackPawn8")){

            imageIcon = new ImageIcon(getImage(getDocumentBase(), imagePos + imgSrc)); 
            img = imageIcon.getImage();
            newImg = img.getScaledInstance(CEL_WIDTH, CEL_WIDTH,  java.awt.Image.SCALE_SMOOTH); 
            imageIcon = new ImageIcon(newImg); 
            blackPawn8.setIcon(imageIcon);

            blackPawn1_y = MARGIN_Y;

            blackPawn8_PieceCount = pieceCount; 

        }
        
    }
    //
    public void checkKillWhite(JLabel click) {
        
        if(click == blackRook1 || click == blackKnight1 || click == blackBishop1
                        || click == blackQueen || click == blackKing || click == blackBishop2
                        || click == blackKnight2 || click == blackRook2 || click == blackPawn1 
                        || click == blackPawn2 || click == blackPawn3  || click == blackPawn4
                        || click == blackPawn5  || click == blackPawn6 || click == blackPawn7 
                        || click == blackPawn8) {

            //get empty som delar pos med black pjäs och se om den är röd
            int x=0, y=0;
            if(click  == blackRook1) {
                x = blackRook1_x; 
                y = blackRook1_y;
            }
            else if(click  == blackKnight1) {
                x = blackKnight1_x; 
                y = blackKnight1_y;
            }
            else if(click  == blackBishop1) {
                x = blackBishop1_x; 
                y = blackBishop1_y;
            }
            else if(click  == blackQueen) {
                x = blackQueen_x; 
                y = blackQueen_y;
            }
            else if(click  == blackKing) {
                x = blackKing_x; 
                y = blackKing_y;
            }
            else if(click  == blackBishop2) {
                x = blackBishop2_x; 
                y = blackBishop2_y;
            }
            else if(click  == blackKnight2) {
                x = blackKnight2_x; 
                y = blackKnight2_y;
            }
            else if(click  == blackRook2) {
                x = blackRook2_x; 
                y = blackRook2_y;
            }
            else if(click  == blackPawn1) {
                x = blackPawn1_x; 
                y = blackPawn1_y;
            }
            else if(click  == blackPawn2) {
                x = blackPawn2_x; 
                y = blackPawn2_y;
            }
            else if(click  == blackPawn3) {
                x = blackPawn3_x; 
                y = blackPawn3_y;
            }
            else if(click  == blackPawn4) {
                x = blackPawn4_x; 
                y = blackPawn4_y;
            }
            else if(click  == blackPawn5) {
                x = blackPawn5_x; 
                y = blackPawn5_y;
            }
            else if(click  == blackPawn6) {
                x = blackPawn6_x; 
                y = blackPawn6_y;
            }
            else if(click  == blackPawn7) {
                x = blackPawn7_x; 
                y = blackPawn7_y;
            }
            else if(click  == blackPawn8) {
                x = blackPawn8_x; 
                y = blackPawn8_y;
            }
           

            if(empty1_x == x && empty1_y == y) {
                if(empty1.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty1);
                }
                else {
                    kill ="";
                }
            }
            else if(empty2_x == x && empty2_y == y) {
                if(empty2.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty2);
                }   
                else {
                    kill ="";
                }
            }
            else if(empty3_x == x && empty3_y == y) {
                if(empty3.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty3);
                }   
                else {
                    kill ="";
                }
            }
            else if(empty4_x == x && empty4_y == y) {
                if(empty4.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty4);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty5_x == x && empty5_y == y) {
                if(empty5.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty5);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty6_x == x && empty6_y == y) {
                if(empty6.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty6);
                }   
                else {
                     kill = "";
                }
            }
            else if(empty7_x == x && empty7_y == y) {
                if(empty7.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty7);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty8_x == x && empty8_y == y) {
                if(empty8.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty8);
                }   
                else {
                    kill ="";
                }
            }
            else if(empty9_x == x && empty9_y == y) {
                if(empty9.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty9);
                }   
                else {
                     kill = "";
                }
            }
            else if(empty10_x == x && empty10_y == y) {
                if(empty10.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty10);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty11_x == x && empty11_y == y) {
                if(empty11.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty11);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty12_x == x && empty12_y == y) {
                if(empty12.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty12);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty13_x == x && empty13_y == y) {
                if(empty13.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty13);
                } 
                else {
                    kill = "";
                }
            }
            else if(empty14_x == x && empty14_y == y) {
                if(empty14.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty14);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty15_x == x && empty15_y == y) {
                if(empty15.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty15);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty16_x == x && empty16_y == y) {
                if(empty16.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty16);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty17_x == x && empty17_y == y) {
                if(empty17.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty17);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty18_x == x && empty18_y == y) {
                if(empty18.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty18);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty19_x == x && empty19_y == y) {
                if(empty19.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty19);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty20_x == x && empty20_y == y) {
                if(empty20.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty20);
                }   
                else  {
                    kill = "";
                }
            }
            else if(empty21_x == x && empty21_y == y) {
                if(empty21.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty21);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty22_x == x && empty22_y == y) {
                if(empty22.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty22);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty23_x == x && empty23_y == y) {
                if(empty23.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty23);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty24_x == x && empty24_y == y) {
                if(empty24.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty24);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty25_x == x && empty25_y == y) {
                if(empty25.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty25);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty26_x == x && empty26_y == y) {
                if(empty26.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty26);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty27_x == x && empty27_y == y) {
                if(empty27.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty27);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty28_x == x && empty28_y == y) {
                if(empty28.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty28);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty29_x == x && empty29_y == y) {
                if(empty29.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty29);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty30_x == x && empty30_y == y) {
                if(empty30.getBackground() == red) {
                    kill((JLabel)click);
                    kill = "x";
                    justKilled = true; 
                    moveWithKill(lastClick, empty30);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty31_x == x && empty31_y == y) {
                if(empty31.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty31);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty32_x == x && empty32_y == y) {
                if(empty32.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty32);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty33_x == x && empty33_y == y) {
                if(empty33.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty33);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty34_x == x && empty34_y == y) {
                if(empty34.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty34);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty35_x == x && empty35_y == y) {
                if(empty35.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty35);
                }   
                else {
                    kill = "x";
                }
            }
            else if(empty36_x == x && empty36_y == y) {
                if(empty36.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty36);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty37_x == x && empty37_y == y) {
                if(empty37.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty37);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty38_x == x && empty38_y == y) {
                if(empty38.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty38);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty39_x == x && empty39_y == y) {
                if(empty39.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty39);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty40_x == x && empty40_y == y) {
                if(empty40.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty40);
                } 
                else {
                    kill = "";
                }
            }
            else if(empty41_x == x && empty41_y == y) {
                if(empty41.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty41);
                }  
                else {
                    kill = "";
                }
            }
            else if(empty42_x == x && empty42_y == y) {
                if(empty42.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty42);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty43_x == x && empty43_y == y) {
                if(empty43.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty43);
                }  
                else {
                    kill = "";
                }
            }
            else if(empty44_x == x && empty44_y == y) {
                if(empty44.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty44);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty45_x == x && empty45_y == y) {
                if(empty45.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty45);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty46_x == x && empty46_y == y) {
                if(empty46.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty46);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty47_x == x && empty47_y == y) {
                if(empty47.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty47);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty48_x == x && empty48_y == y) {
                if(empty48.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty48);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty49_x == x && empty49_y == y) {
                if(empty49.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty49);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty50_x == x && empty50_y == y) {
                if(empty50.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty50);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty51_x == x && empty51_y == y) {
                if(empty51.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty51);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty52_x == x && empty52_y == y) {
                if(empty52.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty52);
                }   
                else{
                    kill = "";
                }
            }
            else if(empty53_x == x && empty53_y == y) {
                if(empty53.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty53);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty54_x == x && empty54_y == y) {
                if(empty54.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty54);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty55_x == x && empty55_y == y) {
                if(empty55.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty55);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty56_x == x && empty56_y == y) {
                if(empty56.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty56);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty57_x == x && empty57_y == y) {
                if(empty57.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty57);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty58_x == x && empty58_y == y) {
                if(empty58.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty58);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty59_x == x && empty59_y == y) {
                if(empty59.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty59);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty60_x == x && empty60_y == y) {
                if(empty60.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty60);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty61_x == x && empty61_y == y) {
                if(empty61.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty61);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty62_x == x && empty62_y == y) {
                if(empty62.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty62);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty63_x == x && empty63_y == y) {
                if(empty63.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty63);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty64_x == x && empty64_y == y) {
                if(empty64.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty64);
                }   
                else {
                    kill = "";
                }
            }
            
            if(kill.equals("")) {
                justKilled = false; 
            }

        }
        
    }
    public void checkKillBlack(JLabel click) {
        
        if(click == whiteRook1 || click == whiteKnight1 || click == whiteBishop1
                        || click == whiteQueen || click == whiteKing || click == whiteBishop2
                        || click == whiteKnight2 || click == whiteRook2 || click == whitePawn1 
                        || click == whitePawn2 || click == whitePawn3  || click == whitePawn4
                        || click == whitePawn5  || click == whitePawn6 || click == whitePawn7 
                        || click == whitePawn8) {

            //get empty som delar pos med white pjäs och se om den är röd
            int x=0, y=0;
            if(click  == whiteRook1) {
                x = whiteRook1_x; 
                y = whiteRook1_y;
            }
            else if(click  == whiteKnight1) {
                x = whiteKnight1_x; 
                y = whiteKnight1_y;
            }
            else if(click  == whiteBishop1) {
                x = whiteBishop1_x; 
                y = whiteBishop1_y;
            }
            else if(click  == whiteQueen) {
                x = whiteQueen_x; 
                y = whiteQueen_y;
            }
            else if(click  == whiteKing) {
                x = whiteKing_x; 
                y = whiteKing_y;
            }
            else if(click  == whiteBishop2) {
                x = whiteBishop2_x; 
                y = whiteBishop2_y;
            }
            else if(click  == whiteKnight2) {
                x = whiteKnight2_x; 
                y = whiteKnight2_y;
            }
            else if(click  == whiteRook2) {
                x = whiteRook2_x; 
                y = whiteRook2_y;
            }
            else if(click  == whitePawn1) {
                x = whitePawn1_x; 
                y = whitePawn1_y;
            }
            else if(click  == whitePawn2) {
                x = whitePawn2_x; 
                y = whitePawn2_y;
            }
            else if(click  == whitePawn3) {
                x = whitePawn3_x; 
                y = whitePawn3_y;
            }
            else if(click  == whitePawn4) {
                x = whitePawn4_x; 
                y = whitePawn4_y;
            }
            else if(click  == whitePawn5) {
                x = whitePawn5_x; 
                y = whitePawn5_y;
            }
            else if(click  == whitePawn6) {
                x = whitePawn6_x; 
                y = whitePawn6_y;
            }
            else if(click  == whitePawn7) {
                x = whitePawn7_x; 
                y = whitePawn7_y;
            }
            else if(click  == whitePawn8) {
                x = whitePawn8_x; 
                y = whitePawn8_y;
            }
           

            if(empty1_x == x && empty1_y == y) {
                if(empty1.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty1);
                }
                else {
                    kill ="";
                }
            }
            else if(empty2_x == x && empty2_y == y) {
                if(empty2.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty2);
                }   
                else {
                    kill ="";
                }
            }
            else if(empty3_x == x && empty3_y == y) {
                if(empty3.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty3);
                }   
                else {
                    kill ="";
                }
            }
            else if(empty4_x == x && empty4_y == y) {
                if(empty4.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty4);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty5_x == x && empty5_y == y) {
                if(empty5.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty5);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty6_x == x && empty6_y == y) {
                if(empty6.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty6);
                }   
                else {
                     kill = "";
                }
            }
            else if(empty7_x == x && empty7_y == y) {
                if(empty7.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty7);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty8_x == x && empty8_y == y) {
                if(empty8.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty8);
                }   
                else {
                    kill ="";
                }
            }
            else if(empty9_x == x && empty9_y == y) {
                if(empty9.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty9);
                }   
                else {
                     kill = "";
                }
            }
            else if(empty10_x == x && empty10_y == y) {
                if(empty10.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty10);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty11_x == x && empty11_y == y) {
                if(empty11.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty11);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty12_x == x && empty12_y == y) {
                if(empty12.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty12);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty13_x == x && empty13_y == y) {
                if(empty13.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty13);
                } 
                else {
                    kill = "";
                }
            }
            else if(empty14_x == x && empty14_y == y) {
                if(empty14.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty14);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty15_x == x && empty15_y == y) {
                if(empty15.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty15);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty16_x == x && empty16_y == y) {
                if(empty16.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty16);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty17_x == x && empty17_y == y) {
                if(empty17.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty17);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty18_x == x && empty18_y == y) {
                if(empty18.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty18);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty19_x == x && empty19_y == y) {
                if(empty19.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty19);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty20_x == x && empty20_y == y) {
                if(empty20.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty20);
                }   
                else  {
                    kill = "";
                }
            }
            else if(empty21_x == x && empty21_y == y) {
                if(empty21.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty21);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty22_x == x && empty22_y == y) {
                if(empty22.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty22);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty23_x == x && empty23_y == y) {
                if(empty23.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty23);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty24_x == x && empty24_y == y) {
                if(empty24.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty24);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty25_x == x && empty25_y == y) {
                if(empty25.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty25);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty26_x == x && empty26_y == y) {
                if(empty26.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty26);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty27_x == x && empty27_y == y) {
                if(empty27.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty27);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty28_x == x && empty28_y == y) {
                if(empty28.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty28);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty29_x == x && empty29_y == y) {
                if(empty29.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty29);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty30_x == x && empty30_y == y) {
                if(empty30.getBackground() == red) {
                    kill((JLabel)click);
                    kill = "x";
                    justKilled = true; 
                    moveWithKill(lastClick, empty30);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty31_x == x && empty31_y == y) {
                if(empty31.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty31);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty32_x == x && empty32_y == y) {
                if(empty32.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty32);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty33_x == x && empty33_y == y) {
                if(empty33.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty33);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty34_x == x && empty34_y == y) {
                if(empty34.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty34);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty35_x == x && empty35_y == y) {
                if(empty35.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty35);
                }   
                else {
                    kill = "x";
                }
            }
            else if(empty36_x == x && empty36_y == y) {
                if(empty36.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty36);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty37_x == x && empty37_y == y) {
                if(empty37.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty37);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty38_x == x && empty38_y == y) {
                if(empty38.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty38);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty39_x == x && empty39_y == y) {
                if(empty39.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty39);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty40_x == x && empty40_y == y) {
                if(empty40.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty40);
                } 
                else {
                    kill = "";
                }
            }
            else if(empty41_x == x && empty41_y == y) {
                if(empty41.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty41);
                }  
                else {
                    kill = "";
                }
            }
            else if(empty42_x == x && empty42_y == y) {
                if(empty42.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty42);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty43_x == x && empty43_y == y) {
                if(empty43.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty43);
                }  
                else {
                    kill = "";
                }
            }
            else if(empty44_x == x && empty44_y == y) {
                if(empty44.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty44);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty45_x == x && empty45_y == y) {
                if(empty45.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty45);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty46_x == x && empty46_y == y) {
                if(empty46.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty46);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty47_x == x && empty47_y == y) {
                if(empty47.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty47);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty48_x == x && empty48_y == y) {
                if(empty48.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty48);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty49_x == x && empty49_y == y) {
                if(empty49.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty49);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty50_x == x && empty50_y == y) {
                if(empty50.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty50);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty51_x == x && empty51_y == y) {
                if(empty51.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty51);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty52_x == x && empty52_y == y) {
                if(empty52.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty52);
                }   
                else{
                    kill = "";
                }
            }
            else if(empty53_x == x && empty53_y == y) {
                if(empty53.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty53);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty54_x == x && empty54_y == y) {
                if(empty54.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty54);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty55_x == x && empty55_y == y) {
                if(empty55.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty55);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty56_x == x && empty56_y == y) {
                if(empty56.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty56);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty57_x == x && empty57_y == y) {
                if(empty57.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty57);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty58_x == x && empty58_y == y) {
                if(empty58.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty58);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty59_x == x && empty59_y == y) {
                if(empty59.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty59);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty60_x == x && empty60_y == y) {
                if(empty60.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty60);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty61_x == x && empty61_y == y) {
                if(empty61.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty61);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty62_x == x && empty62_y == y) {
                if(empty62.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty62);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty63_x == x && empty63_y == y) {
                if(empty63.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty63);
                }   
                else {
                    kill = "";
                }
            }
            else if(empty64_x == x && empty64_y == y) {
                if(empty64.getBackground() == red) {
                    kill = "x";
                    kill((JLabel)click);
                    justKilled = true; 
                    moveWithKill(lastClick, empty64);
                }   
                else {
                    kill = "";
                }
            }
            
            if(kill.equals("")) {
                justKilled = false; 
            }

        }
        
    }
    public void changePromotions(String s) {
        
        if(whiteTurn)  {
            if(s.equals("show") && !gameOver) {
                whiteProBgWidth = CEL_WIDTH; 

                whiteQueenPro.setVisible(true);
                whiteKnightPro.setVisible(true);
                whiteRookPro.setVisible(true);
                whiteBishopPro.setVisible(true);

                if(lastClick.equals("whitePawn1")) {
                    whitePro_x = whitePawn1_x; 
                }
                else if(lastClick.equals("whitePawn2")) {
                    whitePro_x = whitePawn2_x; 
                }
                else if(lastClick.equals("whitePawn3")) {
                    whitePro_x = whitePawn3_x; 
                }
                else if(lastClick.equals("whitePawn4")) {
                    whitePro_x = whitePawn4_x; 
                }
                else if(lastClick.equals("whitePawn5")) {
                    whitePro_x = whitePawn5_x; 
                }
                else if(lastClick.equals("whitePawn6")) {
                    whitePro_x = whitePawn6_x; 
                }
                else if(lastClick.equals("whitePawn7")) {
                    whitePro_x = whitePawn7_x; 
                }
                else if(lastClick.equals("whitePawn8")) {
                    whitePro_x = whitePawn8_x; 
                }

                visibilityUnderDrawing("white", false);

                clearColorEmpty();
                reloadBounds();
                repaint();
            }
            else if(s.equals("hide")) {
                visibilityUnderDrawing("white", true);
                whiteProBgWidth = 0; 

                whiteQueenPro.setVisible(false);
                whiteKnightPro.setVisible(false);
                whiteRookPro.setVisible(false);
                whiteBishopPro.setVisible(false); 

                clearColorEmpty();
                reloadBounds();
                repaint();
            }
        }
        else if(blackTurn) {
            if(s.equals("show") && !gameOver) {
                blackProBgWidth = CEL_WIDTH; 

                blackQueenPro.setVisible(true);
                blackKnightPro.setVisible(true);
                blackRookPro.setVisible(true);
                blackBishopPro.setVisible(true);

                if(lastClick.equals("blackPawn1")) {
                    blackPro_x = blackPawn1_x; 
                }
                else if(lastClick.equals("blackPawn2")) {
                    blackPro_x = blackPawn2_x; 
                }
                else if(lastClick.equals("blackPawn3")) {
                    blackPro_x = blackPawn3_x; 
                }
                else if(lastClick.equals("blackPawn4")) {
                    blackPro_x = blackPawn4_x; 
                }
                else if(lastClick.equals("blackPawn5")) {
                    blackPro_x = blackPawn5_x; 
                }
                else if(lastClick.equals("blackPawn6")) {
                    blackPro_x = blackPawn6_x; 
                }
                else if(lastClick.equals("blackPawn7")) {
                    blackPro_x = blackPawn7_x; 
                }
                else if(lastClick.equals("blackPawn8")) {
                    blackPro_x = blackPawn8_x; 
                }

                visibilityUnderDrawing("black", false);

                clearColorEmpty();
                reloadBounds();
                repaint();
            }
            else if(s.equals("hide")) {
                visibilityUnderDrawing("black", true);
                blackProBgWidth = 0; 

                blackQueenPro.setVisible(false);
                blackKnightPro.setVisible(false);
                blackRookPro.setVisible(false);
                blackBishopPro.setVisible(false); 

                clearColorEmpty();
                reloadBounds();
                repaint();
            }
        }
        
        
    }
    public void checkClickedPiece(JLabel click) {
        
        if(whiteTurn) {
            lastPieceWasBlackKing = false; 
            if(click == whitePawn1) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn1";
                showPossibleMoves(whitePawn1);
            }
            else if(click == whitePawn2) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn2";
                showPossibleMoves(whitePawn2);
            }
            else if(click == whitePawn3) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn3";
                showPossibleMoves(whitePawn3);
            }
            else if(click == whitePawn4) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn4";
                showPossibleMoves(whitePawn4);
            }
            else if(click == whitePawn5) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn5";
                showPossibleMoves(whitePawn5);
            }
            else if(click == whitePawn6) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn6";
                showPossibleMoves(whitePawn6);
            }
            else if(click == whitePawn7){
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn7";
                showPossibleMoves(whitePawn7);
            }
            else if(click == whitePawn8) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whitePawn8";
                showPossibleMoves(whitePawn8);
            }
            else if(click == whiteRook1) {
                if(lastPieceWasWhiteKing) {
                    if(whiteRook1FirstMove && whiteKingFirstMove){
                        whiteRook1_x += CEL_WIDTH*3; 
                        whiteKing_x -= CEL_WIDTH*2;
                        reloadBounds();
                        clearColorEmpty();
                        repaint();
                        lastPieceWasWhiteKing = false; 
                        whiteTurn = false; 
                        if(multiplayer) {
                            blackTurn = true; 
                        }
                        whiteRook1FirstMove = false; 
                        whiteKingFirstMove = false; 
                        System.out.print(moveCount + ". " + "O-O-O");
                        moveCount++; 
                    }
                }
                else {
                    lastPieceWasWhiteKing = false; 
                    lastClick = "whiteRook1";
                    showPossibleMoves(whiteRook1);
                }
            }
            else if(click == whiteKnight1) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whiteKnight1";
                showPossibleMoves(whiteKnight1);
            }
            else if(click == whiteBishop1) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whiteBishop1";
                showPossibleMoves(whiteBishop1);
            }
            else if(click == whiteQueen) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whiteQueen";
                showPossibleMoves(whiteQueen);
            }
            else if(click == whiteKing) {
                lastPieceWasWhiteKing = true; 
                lastClick = "whiteKing";
                showPossibleMoves(whiteKing);
            }
            else if(click == whiteBishop2) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whiteBishop2";
                showPossibleMoves(whiteBishop2);
            }
            else if(click == whiteKnight2) {
                lastPieceWasWhiteKing = false; 
                lastClick = "whiteKnight2";
                showPossibleMoves(whiteKnight2);
            }
            else if(click == whiteRook2) {
                if(lastPieceWasWhiteKing) {
                    if(whiteRook2FirstMove && whiteKingFirstMove){
                        whiteRook2_x -= CEL_WIDTH*2; 
                        whiteKing_x += CEL_WIDTH*2;
                        reloadBounds();
                        clearColorEmpty();
                        repaint();
                        lastPieceWasWhiteKing = false; 
                        whiteTurn = false; 
                        if(multiplayer) {
                            blackTurn = true; 
                        }
                        whiteRook2FirstMove = false; 
                        whiteKingFirstMove = false; 
                        System.out.print(moveCount + ". " + "O-O");
                        moveCount++; 
                    }
                }
                else {
                    lastPieceWasWhiteKing = false; 
                    lastClick = "whiteRook2";
                    showPossibleMoves(whiteRook2);
                }
            }
            
            if(click == whiteRook1) {
                if(lastPieceWasWhiteKing) {
                    if(whiteRook1FirstMove && whiteKingFirstMove){
                        queenCastle = true; 
                    }
                    else {
                        queenCastle = false; 
                    }
                }
                else {
                    queenCastle = false; 
                }
            }
            else {
                queenCastle = false; 
            }

            if(lastClick.equals("whiteKing")) {
                if(getEmptyCelCoordX(click) == whiteKing_x-CEL_WIDTH*2 && click != whiteRook1 && click != whiteRook2) { // castla genom att trycka på empty cel 

                    whiteRook1_x += CEL_WIDTH*3; 
                    whiteKing_x -= CEL_WIDTH*2;
                    reloadBounds();
                    clearColorEmpty();
                    repaint();
                    lastPieceWasWhiteKing = false; 
                    whiteTurn = false; 
                    whiteRook1FirstMove = false; 
                    whiteKingFirstMove = false; 
                    System.out.print(moveCount + ". " + "O-O-O");
                    moveCount++; 

                }
                else if(getEmptyCelCoordX(click) == whiteKing_x+CEL_WIDTH*2 && click != whiteRook1 && click != whiteRook2) {

                    whiteRook2_x -= CEL_WIDTH*2; 
                    whiteKing_x += CEL_WIDTH*2;
                    reloadBounds();
                    clearColorEmpty();
                    repaint();
                    lastPieceWasWhiteKing = false; 
                    whiteTurn = false; 
                    whiteRook2FirstMove = false; 
                    whiteKingFirstMove = false; 
                    System.out.print(moveCount + ". " + "O-O");
                    moveCount++; 

                }
            }
            
        }
        else if(blackTurn) { // BLACKTURN --------------------------------------------------------------------------
            lastPieceWasWhiteKing = false; 
            if(click == blackPawn1) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn1";
                showPossibleMoves(blackPawn1);
            }
            else if(click == blackPawn2) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn2";
                showPossibleMoves(blackPawn2);
            }
            else if(click == blackPawn3) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn3";
                showPossibleMoves(blackPawn3);
            }
            else if(click == blackPawn4) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn4";
                showPossibleMoves(blackPawn4);
            }
            else if(click == blackPawn5) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn5";
                showPossibleMoves(blackPawn5);
            }
            else if(click == blackPawn6) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn6";
                showPossibleMoves(blackPawn6);
            }
            else if(click == blackPawn7){
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn7";
                showPossibleMoves(blackPawn7);
            }
            else if(click == blackPawn8) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackPawn8";
                showPossibleMoves(blackPawn8);
            }
            else if(click == blackRook1) {
                if(lastPieceWasBlackKing) {
                    if(blackRook1FirstMove && blackKingFirstMove){
                        blackRook1_x += CEL_WIDTH*3; 
                        blackKing_x -= CEL_WIDTH*2;
                        reloadBounds();
                        clearColorEmpty();
                        repaint();
                        lastPieceWasBlackKing = false; 
                        blackTurn = false; 
                        blackRook1FirstMove = false; 
                        blackKingFirstMove = false; 
                        if(moveCount <= 10)  {
                            if(queenCastle) {
                                System.out.println("     " + "O-O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("      " + "O-O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("       " + "O-O-O");
                            }
                            else {
                                System.out.println("        " + "O-O-O");
                            }
                        }
                        else {
                            if(queenCastle) {
                                System.out.println("    " + "O-O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("     " + "O-O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("      " + "O-O-O");
                            }
                            else {
                                System.out.println("       " + "O-O-O");
                            }
                        }
                    }
                }
                else {
                    lastPieceWasBlackKing = false; 
                    lastClick = "blackRook1";
                    showPossibleMoves(blackRook1);
                }
            }
            else if(click == blackKnight1) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackKnight1";
                showPossibleMoves(blackKnight1);
            }
            else if(click == blackBishop1) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackBishop1";
                showPossibleMoves(blackBishop1);
            }
            else if(click == blackQueen) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackQueen";
                showPossibleMoves(blackQueen);
            }
            else if(click == blackKing) {
                lastPieceWasBlackKing = true; 
                lastClick = "blackKing";
                showPossibleMoves(blackKing);
            }
            else if(click == blackBishop2) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackBishop2";
                showPossibleMoves(blackBishop2);
            }
            else if(click == blackKnight2) {
                lastPieceWasBlackKing = false; 
                lastClick = "blackKnight2";
                showPossibleMoves(blackKnight2);
            }
            else if(click == blackRook2) {
                if(lastPieceWasBlackKing) {
                    if(blackRook2FirstMove && blackKingFirstMove){
                        blackRook2_x -= CEL_WIDTH*2; 
                        blackKing_x += CEL_WIDTH*2;
                        reloadBounds();
                        clearColorEmpty();
                        repaint();
                        lastPieceWasBlackKing = false; 
                        blackTurn = false; 
                        blackRook2FirstMove = false; 
                        blackKingFirstMove = false; 
                        if(moveCount <= 10)  {
                            if(queenCastle) {
                                System.out.println("     " + "O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("      " + "O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("       " + "O-O");
                            }
                            else {
                                System.out.println("        " + "O-O");
                            }
                        }
                        else {
                            if(queenCastle) {
                                System.out.println("    " + "O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("     " + "O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("      " + "O-O");
                            }
                            else {
                                System.out.println("       " + "O-O");
                            }
                        }
                    }
                }
                else {
                    lastPieceWasBlackKing = false; 
                    lastClick = "blackRook2";
                    showPossibleMoves(blackRook2);
                }
            }


            if(lastClick.equals("blackKing")) {

                if(getEmptyCelCoordX(click) == blackKing_x-CEL_WIDTH*2 && click != blackRook1 && click != blackRook2) {

                    blackRook1_x += CEL_WIDTH*3; 
                    blackKing_x -= CEL_WIDTH*2;
                    reloadBounds();
                    clearColorEmpty();
                    repaint();
                    lastPieceWasBlackKing = false; 
                    blackTurn = false; 
                    blackRook1FirstMove = false; 
                    blackKingFirstMove = false; 
                    if(moveCount <= 10)  {
                            if(queenCastle) {
                                System.out.println("     " + "O-O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("      " + "O-O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("       " + "O-O-O");
                            }
                            else {
                                System.out.println("        " + "O-O-O");
                            }
                        }
                        else {
                            if(queenCastle) {
                                System.out.println("    " + "O-O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("     " + "O-O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("      " + "O-O-O");
                            }
                            else {
                                System.out.println("       " + "O-O-O");
                            }
                        }

                }
                else if(getEmptyCelCoordX(click) == blackKing_x+CEL_WIDTH*2 && click != blackRook1 && click != blackRook2) {

                    blackRook2_x -= CEL_WIDTH*2; 
                    blackKing_x += CEL_WIDTH*2;
                    reloadBounds();
                    clearColorEmpty();
                    repaint();
                    lastPieceWasBlackKing = false; 
                    blackTurn = false; 
                    blackRook2FirstMove = false; 
                    blackKingFirstMove = false; 
                    if(moveCount <= 10)  {
                            if(queenCastle) {
                                System.out.println("     " + "O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("      " + "O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("       " + "O-O");
                            }
                            else {
                                System.out.println("        " + "O-O");
                            }
                        }
                        else {
                            if(queenCastle) {
                                System.out.println("    " + "O-O");
                            }
                            else if(!lastWhiteWasPawn && lastWhiteWasKill) {
                                System.out.println("     " + "O-O");
                            }
                            else if ((!lastWhiteWasPawn && !lastWhiteWasKill) || (lastWhiteWasPawn && lastWhiteWasKill)){
                                System.out.println("      " + "O-O");
                            }
                            else {
                                System.out.println("       " + "O-O");
                            }
                        }

                }
            }
        } // blackturn   
        
    }
    public void checkMove(JLabel click) {
        
        if(click == empty1 || click == empty2 || click == empty3 || click == empty4
            || click == empty5 || click == empty6 || click == empty7
            || click == empty8 || click == empty9 || click == empty10
            || click == empty11 || click == empty12 || click == empty13
            || click == empty14 || click == empty15 || click == empty16
            || click == empty17 || click == empty18 || click == empty19
            || click == empty20 || click == empty21 || click == empty22
            || click == empty23 || click == empty24 || click == empty25
            || click == empty26 || click == empty27 || click == empty28
            || click == empty29 || click == empty30 || click == empty31
            || click == empty32 || click == empty33 || click == empty34
            || click == empty35 || click == empty36 || click == empty37
            || click == empty38 || click == empty39 || click == empty40
            || click == empty41 || click == empty42 || click == empty43
            || click == empty44 || click == empty45 || click == empty46
            || click == empty47 || click == empty48 || click == empty49
            || click == empty50 || click == empty51 || click == empty52
            || click == empty53 || click == empty54 || click == empty55
            || click == empty56 || click == empty57 || click == empty58
            || click == empty59 || click == empty60 || click == empty61
            || click == empty62 || click == empty63 || click == empty64) {

            if(click.getBackground() == red) { // en passant
                if(whiteTurn) {
                    killPawnUnderCel(click);
                }
                else {
                    killPawnOverCel(click);
                }
                
                movePiece(lastClick, click);
                clearColorEmpty();
            }
            else {
                kill = "";
            }

            if((lastClick.equals("whitePawn1") || lastClick.equals("whitePawn2") || lastClick.equals("whitePawn3") || lastClick.equals("whitePawn4")
                    || lastClick.equals("whitePawn5") || lastClick.equals("whitePawn6") ||lastClick.equals("whitePawn7") || lastClick.equals("whitePawn8")) && (click == empty1 || click == empty2|| click == empty3|| click == empty4
                        || click == empty5|| click == empty6|| click == empty7|| click == empty8)) {

                if(lastClick.equals("whitePawn1")) {
                    pieceCount = whitePawn1_PieceCount; 
                }
                else if(lastClick.equals("whitePawn2")) {
                    pieceCount = whitePawn2_PieceCount; 
                }
                else if(lastClick.equals("whitePawn3")) {
                    pieceCount = whitePawn3_PieceCount; 
                }
                else if(lastClick.equals("whitePawn4")) {
                    pieceCount = whitePawn4_PieceCount; 
                }
                else if(lastClick.equals("whitePawn5")) {
                    pieceCount = whitePawn5_PieceCount; 
                }
                else if(lastClick.equals("whitePawn6")) {
                    pieceCount = whitePawn6_PieceCount; 
                }
                else if(lastClick.equals("whitePawn7")) {
                    pieceCount = whitePawn7_PieceCount; 
                }
                else if(lastClick.equals("whitePawn8")) {
                    pieceCount = whitePawn8_PieceCount; 
                }

                if(pieceCount == 1) {
                    changePromotions("show");
                }
                else {
                    movePiece(lastClick, click);
                }
            }
            else if((lastClick.equals("blackPawn1") || lastClick.equals("blackPawn2") || lastClick.equals("blackPawn3") || lastClick.equals("blackPawn4")
                    || lastClick.equals("blackPawn5") || lastClick.equals("blackPawn6") ||lastClick.equals("blackPawn7") || lastClick.equals("blackPawn8")) && (click == empty57 || click == empty58|| click == empty59|| click == empty60
                        || click == empty61|| click == empty62|| click == empty63|| click == empty64)) {

                if(lastClick.equals("blackPawn1")) {
                    pieceCount = blackPawn1_PieceCount; 
                }
                else if(lastClick.equals("blackPawn2")) {
                    pieceCount = blackPawn2_PieceCount; 
                }
                else if(lastClick.equals("blackPawn3")) {
                    pieceCount = blackPawn3_PieceCount; 
                }
                else if(lastClick.equals("blackPawn4")) {
                    pieceCount = blackPawn4_PieceCount; 
                }
                else if(lastClick.equals("blackPawn5")) {
                    pieceCount = blackPawn5_PieceCount; 
                }
                else if(lastClick.equals("blackPawn6")) {
                    pieceCount = blackPawn6_PieceCount; 
                }
                else if(lastClick.equals("blackPawn7")) {
                    pieceCount = blackPawn7_PieceCount; 
                }
                else if(lastClick.equals("blackPawn8")) {
                    pieceCount = blackPawn8_PieceCount; 
                }

                if(pieceCount == 1) {
                    changePromotions("show");
                }
                else {
                    movePiece(lastClick, click);
                }        

            }
            else {
                movePiece(lastClick, click);
            }

        }
        
    }
    //
    public void clearSelections() {
        
        if(!lastClick.equals("whitePawn1")) { //TA BORT ANDRA SELECTIONS
            whitePawn1.setForeground(new Color(0, 0, 0, 0));
            whitePawn1.setOpaque(false);
            }
        if(!lastClick.equals("whitePawn2")) { 
            whitePawn2.setForeground(new Color(0, 0, 0, 0));
            whitePawn2.setOpaque(false);
            }
        if(!lastClick.equals("whitePawn3")) { 
            whitePawn3.setForeground(new Color(0, 0, 0, 0));
            whitePawn3.setOpaque(false);
            }
        if(!lastClick.equals("whitePawn4")) { 
            whitePawn4.setForeground(new Color(0, 0, 0, 0));
            whitePawn4.setOpaque(false);
            }
        if(!lastClick.equals("whitePawn5")) { 
            whitePawn5.setForeground(new Color(0, 0, 0, 0));
            whitePawn5.setOpaque(false);
            }
        if(!lastClick.equals("whitePawn6")) { 
            whitePawn6.setForeground(new Color(0, 0, 0, 0));
            whitePawn6.setOpaque(false);
            }
        if(!lastClick.equals("whitePawn7")) { 
            whitePawn7.setForeground(new Color(0, 0, 0, 0));
            whitePawn7.setOpaque(false);
            }
        if(!lastClick.equals("whitePawn8")) { 
            whitePawn8.setForeground(new Color(0, 0, 0, 0));
            whitePawn8.setOpaque(false);
            }
        if(!lastClick.equals("whiteRook1")) {
            whiteRook1.setForeground(new Color(0, 0, 0, 0));
            whiteRook1.setOpaque(false);
            }
        if(!lastClick.equals("whiteKnight1")) { 
            whiteKnight1.setForeground(new Color(0, 0, 0, 0));
            whiteKnight1.setOpaque(false);
            }
        if(!lastClick.equals("whiteBishop1")) { 
            whiteBishop1.setForeground(new Color(0, 0, 0, 0));
            whiteBishop1.setOpaque(false);
            }
        if(!lastClick.equals("whiteQueen")) { 
            whiteQueen.setForeground(new Color(0, 0, 0, 0));
            whiteQueen.setOpaque(false);
            }
        if(!lastClick.equals("whiteKing")) { 
            whiteKing.setForeground(new Color(0, 0, 0, 0));
            whiteKing.setOpaque(false);
            }
        if(!lastClick.equals("whiteBishop2")) { 
            whiteBishop2.setForeground(new Color(0, 0, 0, 0));
            whiteBishop2.setOpaque(false);
            }
        if(!lastClick.equals("whiteKnight2")) { 
            whiteKnight2.setForeground(new Color(0, 0, 0, 0));
            whiteKnight2.setOpaque(false);
            }
        if(!lastClick.equals("whiteRook2")) { 
            whiteRook2.setForeground(new Color(0, 0, 0, 0));
            whiteRook2.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn1")) { 
            blackPawn1.setForeground(new Color(0, 0, 0, 0));
            blackPawn1.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn2")) { 
            blackPawn2.setForeground(new Color(0, 0, 0, 0));
            blackPawn2.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn3")) { 
            blackPawn3.setForeground(new Color(0, 0, 0, 0));
            blackPawn3.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn4")) { 
            blackPawn4.setForeground(new Color(0, 0, 0, 0));
            blackPawn4.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn5")) { 
            blackPawn5.setForeground(new Color(0, 0, 0, 0));
            blackPawn5.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn6")) { 
            blackPawn6.setForeground(new Color(0, 0, 0, 0));
            blackPawn6.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn7")) { 
            blackPawn7.setForeground(new Color(0, 0, 0, 0));
            blackPawn7.setOpaque(false);
            }
        if(!lastClick.equals("blackPawn8")) { 
            blackPawn8.setForeground(new Color(0, 0, 0, 0));
            blackPawn8.setOpaque(false);
            }
        if(!lastClick.equals("blackRook1")) {
            blackRook1.setForeground(new Color(0, 0, 0, 0));
            blackRook1.setOpaque(false);
            }
        if(!lastClick.equals("blackKnight1")) { 
            blackKnight1.setForeground(new Color(0, 0, 0, 0));
            blackKnight1.setOpaque(false);
            }
        if(!lastClick.equals("blackBishop1")) { 
            blackBishop1.setForeground(new Color(0, 0, 0, 0));
            blackBishop1.setOpaque(false);
            }
        if(!lastClick.equals("blackQueen")) { 
            blackQueen.setForeground(new Color(0, 0, 0, 0));
            blackQueen.setOpaque(false);
            }
        if(!lastClick.equals("blackKing")) { 
            blackKing.setForeground(new Color(0, 0, 0, 0));
            blackKing.setOpaque(false);
            }
        if(!lastClick.equals("blackBishop2")) { 
            blackBishop2.setForeground(new Color(0, 0, 0, 0));
            blackBishop2.setOpaque(false);
            }
        if(!lastClick.equals("blackKnight2")) { 
            blackKnight2.setForeground(new Color(0, 0, 0, 0));
            blackKnight2.setOpaque(false);
            }
        if(!lastClick.equals("blackRook2")) { 
            blackRook2.setForeground(new Color(0, 0, 0, 0));
            blackRook2.setOpaque(false);
            }
        
    }
    
    public void killPawnUnderCel(JLabel cel) {
        
        int x = getEmptyCelCoordX(cel);
        int y = getEmptyCelCoordY(cel);
        
        if(blackPawn1_x == x && blackPawn1_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn1; 
        }
        else if(blackPawn2_x == x && blackPawn2_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn2; 
        }
        else if(blackPawn3_x == x && blackPawn3_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn3; 
        }
        else if(blackPawn4_x == x && blackPawn4_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn4; 
        }
        else if(blackPawn5_x == x && blackPawn5_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn5; 
        }
        else if(blackPawn6_x == x && blackPawn6_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn6; 
        }
        else if(blackPawn7_x == x && blackPawn7_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn7; 
        }
        else if(blackPawn8_x == x && blackPawn8_y == y + CEL_WIDTH) {
            enPassantKill = blackPawn8; 
        }
        
        kill(enPassantKill);
        
    }
    public void killPawnOverCel(JLabel cel) {
        
        int x = getEmptyCelCoordX(cel);
        int y = getEmptyCelCoordY(cel);
        
        if(whitePawn1_x == x && whitePawn1_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn1; 
        }
        else if(whitePawn2_x == x && whitePawn2_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn2; 
        }
        else if(whitePawn3_x == x && whitePawn3_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn3; 
        }
        else if(whitePawn4_x == x && whitePawn4_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn4; 
        }
        else if(whitePawn5_x == x && whitePawn5_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn5; 
        }
        else if(whitePawn6_x == x && whitePawn6_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn6; 
        }
        else if(whitePawn7_x == x && whitePawn7_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn7; 
        }
        else if(whitePawn8_x == x && whitePawn8_y == y - CEL_WIDTH) {
            enPassantKill = whitePawn8; 
        }
        
        kill(enPassantKill);
        
    }
    
    @Override 
    public void mouseClicked(MouseEvent e) {     
        
        if(whiteTurn) {
            JLabel clickedLabel = (JLabel) e.getSource();

            if((e.getSource() == whiteRook1 || e.getSource() == whiteKnight1 || e.getSource() == whiteBishop1
                        || e.getSource() == whiteQueen || e.getSource() == whiteKing || e.getSource() == whiteBishop2
                        || e.getSource() == whiteKnight2 || e.getSource() == whiteRook2 || e.getSource() == whitePawn1 
                        || e.getSource() == whitePawn2 || e.getSource() == whitePawn3  || e.getSource() == whitePawn4
                        || e.getSource() == whitePawn5  || e.getSource() == whitePawn6 || e.getSource() == whitePawn7 
                        || e.getSource() == whitePawn8) && gameOver == false) { 

                clickedLabel.setForeground(Color.GRAY);
                clickedLabel.setOpaque(true);

            }


            if (gameOver == false) {
                
                if(e.getSource() == whiteRook1 || e.getSource() == whiteKnight1 || e.getSource() == whiteBishop1
                        || e.getSource() == whiteQueen || e.getSource() == whiteKing || e.getSource() == whiteBishop2
                        || e.getSource() == whiteKnight2 || e.getSource() == whiteRook2 || e.getSource() == whitePawn1 
                        || e.getSource() == whitePawn2 || e.getSource() == whitePawn3  || e.getSource() == whitePawn4
                        || e.getSource() == whitePawn5  || e.getSource() == whitePawn6 || e.getSource() == whitePawn7 
                        || e.getSource() == whitePawn8)  {
                    
                    checkClickedPiece((JLabel) e.getSource()); // om click = en pjäs
                    
                }
                else { 
                    checkMove((JLabel) e.getSource()); // om click = empty cel 
                }
                
                checkKillWhite((JLabel) e.getSource());

                clearSelections();
                
                checkPromotion((JLabel) e.getSource());

            }
                        
        }
        if(blackTurn && multiplayer) {
            JLabel clickedLabel = (JLabel) e.getSource();

            if((e.getSource() == blackRook1 || e.getSource() == blackKnight1 || e.getSource() == blackBishop1
                        || e.getSource() == blackQueen || e.getSource() == blackKing || e.getSource() == blackBishop2
                        || e.getSource() == blackKnight2 || e.getSource() == blackRook2 || e.getSource() == blackPawn1 
                        || e.getSource() == blackPawn2 || e.getSource() == blackPawn3  || e.getSource() == blackPawn4
                        || e.getSource() == blackPawn5  || e.getSource() == blackPawn6 || e.getSource() == blackPawn7 
                        || e.getSource() == blackPawn8) && gameOver == false) { 

                clickedLabel.setForeground(Color.GRAY);
                clickedLabel.setOpaque(true);
            }

            if (gameOver == false) {
                
                if(e.getSource() == blackRook1 || e.getSource() == blackKnight1 || e.getSource() == blackBishop1
                        || e.getSource() == blackQueen || e.getSource() == blackKing || e.getSource() == blackBishop2
                        || e.getSource() == blackKnight2 || e.getSource() == blackRook2 || e.getSource() == blackPawn1 
                        || e.getSource() == blackPawn2 || e.getSource() == blackPawn3  || e.getSource() == blackPawn4
                        || e.getSource() == blackPawn5  || e.getSource() == blackPawn6 || e.getSource() == blackPawn7 
                        || e.getSource() == blackPawn8) {
                    
                    checkClickedPiece((JLabel) e.getSource());
                    
                }
                else {
                    checkMove((JLabel) e.getSource()); 
                }

                checkKillBlack((JLabel) e.getSource());

                clearSelections();
                
                checkPromotion((JLabel) e.getSource());
            }          
        }
        
    }
    @Override
    public void mousePressed(MouseEvent e) { 
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override 
    public void mouseEntered(MouseEvent e) { //hover-effekt
     
    }
    @Override
    public void mouseExited(MouseEvent e) {
      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == single) {
            
            singleplayer = true;
            multiplayer = false;
            
        }
        if(e.getSource() == multi) {
            
            multiplayer = true;
            singleplayer = false; 
            
        }
        
        single.setVisible(false);
        multi.setVisible(false);
        
        menuWidth = 0; 
        menuText = "";
        
        repaint();
        
    }
}

