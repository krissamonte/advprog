/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSnakes;

import java.util.ArrayDeque;
import SSnakes.Point;
import SSnakes.SnakeBody;
import SSnakes.Food;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author kris
 */
public class GameWindow extends javax.swing.JFrame {

    /**
     * Creates new form GameWindow
     */
    
    private int rows = 44;
    private int cols = 147;
    private int direction = 39;
    private int score = 0;
    private boolean grew = false; 
    private SnakeBody snake = new SnakeBody(0,0);
    private Double food = new Double(0,0);
    private Poison food2 = new Poison(0,0);
    private Faster food3 = new Faster(0,0);
    private Slower food4 = new Slower(0,0);    
    private ArrayDeque <Point> body = new ArrayDeque <Point>();
    private boolean play = true;

    public GameWindow() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
        displaySnake(score);
    }

    public void displayBorder(){
        StringBuilder display = new StringBuilder();
        
        for(int i = 0; i <= getRows(); i++){
            for(int j = 0; j <= getCols(); j++){
                if(i > 1 && i < getRows()){
                    if(j > 1 && j <= getCols()){
                        display.append(" ");
                    } else display.append("*");
                } else display.append("*");
            } display.append("*");
            
        } jTextArea1.setText(display.toString());
    }
    
    public void displayScore(int score, boolean hit){
        StringBuilder display = new StringBuilder();
        String scoreLabel = "SCORE: ";
        
        if(hit == true){
            display.append("You ate the food!");
        }else display.append(scoreLabel + score);

        jTextArea2.setText(display.toString());
    }
    
    public void displaySnake(int score){
        StringBuilder display = new StringBuilder();
        char s = 219;
        char f1 = 153;
        char f2 = 232;
        char f3 = 254;
        String scoreLabel = "SCORE: ";
        
        for(int i = 0; i < getRows(); i++){
            for(int j = 0; j < getCols(); j++){                
                if(containsBody(j,i)){
                    display.append(s);
                } else if(containsFood(j,i)){
                    display.append(f1);
                } else if(containsFood2(j,i)){
                    display.append(f2);
                } else if(containsFood3(j,i)){
                    display.append(f3);
                } else if(containsFood4(j,i)){
                    display.append("H");
                } /*else if(i == 1 && j == 75){
                    display.append(scoreLabel + score);                
                }*/ else{
                    display.append(" ");
                } 
            } display.append("\n");
        }

        jTextArea1.setText(display.toString());
    }
    
    public boolean containsBody(int x, int y){
        ArrayDeque <Point> body = snake.getBody();

        for(Point p : body){
            if(p.getX() == x && p.getY() == y){
                return true;
            }
        } return false;        
    }

    public boolean containsBorder(int x, int y){
        boolean star = false;
        
                if(x > 1 && x < getRows()){
                    if(y > 1 && y <= getCols()){
                        star = false;
                    } else star = true;
                } else star = true;
        
        return star;
    }
    
    
    public boolean containsFood(int x, int y){
        Point pp = food.getFood();
                
        //checks if food location is equal to x and y in game simulation [start()]
        if(pp.getX() == x && pp.getY() == y){
            return true;
        } 
    return false;        
    }
    
    public boolean containsFood2(int x, int y){
        Point pp = food2.getFood();
                
        //checks if food location is equal to x and y in game simulation [start()]
        if(pp.getX() == x && pp.getY() == y){
            return true;
        } 
    return false;        
    }

    public boolean containsFood3(int x, int y){
        Point pp = food3.getFood();
                
        //checks if food location is equal to x and y in game simulation [start()]
        if(pp.getX() == x && pp.getY() == y){
            return true;
        } 
    return false;        
    }

    public boolean containsFood4(int x, int y){
        Point pp = food4.getFood();
                
        //checks if food location is equal to x and y in game simulation [start()]
        if(pp.getX() == x && pp.getY() == y){
            return true;
        } 
    return false;        
    }

    public int move(int direction){
        switch(direction){
            case 32: direction = 32; break;
            case 37: snake.moveLeft();break;
            case 38: snake.moveUp();break;
            case 39: snake.moveRight();break;
            case 40: snake.moveDown();break;
        }
        return direction;
    }    

    public boolean hitBody(){
    boolean checker = false;
    boolean isHead = true;
    Point head = snake.getBody().getFirst();
    ArrayDeque <Point> body = snake.getBody();

    //print point of SnakeBody
    for(Point pp : body){
        System.out.println("PP: " + pp.getX() + ", " + pp.getY());
    }
    
    for(Point pp : body){                
        if(isHead == true){
            isHead = false;
        } else if(pp.getX() == head.getX() && pp.getY() == head.getY()){
            System.out.println("HIT BODY!");                
            System.out.println("HEAD NOW:" + head.getX() + "," + head.getY());
            checker = true;
        } 
    }    

    return checker;
    }
    
    public void start() throws IOException{
        int i = 0; //iteration
        System.out.println("WELCOME TO SNAKES!");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------ MENU ------");
        System.out.println("1 | LOAD GAME");
        System.out.println("2 | NEW GAME");
        System.out.println("3 | EXIT");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        int puntos = 0;
        String username = "";
        String filepath = "";
        
        //MAKE USER
        //FIX SCORE
        //ADD FOOD
        
            
        if(choice == 1){
            System.out.print("Username: ");
            username = sc.next();
            filepath = "C:\\Users\\kris\\Desktop\\" + username + ".txt";

            Input input = new Input();
            ArrayList <String> inputlist = input.Readfile(filepath);
            puntos = Integer.parseInt(inputlist.get(0));
            //open file here
            //get score
            //get last SnakeBody position
            //play            
            System.out.println("puntos: " + puntos);
            score = puntos;            
            //getScore(username);
        } else if(choice == 2){
            play = true;
        } else if(choice == 3){
            System.out.println("GOOD BYE.");
            play = false;
        }        
        
        int n = 100;

        Point head;
                food.randomizeFood();
                food2.randomizeFood();
                food3.randomizeFood();
                food4.randomizeFood();

        boolean hit = false;
        
        while(play){
            try {
                Thread.sleep(n);
                move(direction); //get user input (arrow keys)
                head = snake.getHead(snake.getBody());
                System.out.println(head.getX() + "," + head.getY());
                displaySnake(score);
                displayScore(score, hit);
                System.out.println("dir: " + direction);
                /* PAUSE:
                if(move(direction) == 32){
                    n = 0;
                }
                */
                if((head.getX() == (food.getFood().getX()) && head.getY() == food.getFood().getY())){
                    System.out.println("YOU GREW DOUBLE!");                                            
                        snake.doubleAdd(snake.getBody(), direction);
                        food.randomizeFood();
                        hit = true;
                } else if(head.getX() == (food2.getFood().getX()) && head.getY() == food2.getFood().getY()){ //SNAKEBODY DECREASE BY 1
                    System.out.println("YOU SHRINKED!");
                        snake.shrink(snake.getBody());
                        food2.randomizeFood();           
                        hit = true;
                } else if(head.getX() == (food3.getFood().getX()) && head.getY() == food3.getFood().getY()){
                    System.out.println("FASTER!");                    
                        n = snake.faster(snake.getBody());                        
                        food3.randomizeFood();                                 
                        hit = true;
                } else if(head.getX() == (food4.getFood().getX()) && head.getY() == food4.getFood().getY()){ 
                    System.out.println("SLOWER!");                    
                        n = snake.slower(snake.getBody());                        
                        food4.randomizeFood();                                                 
                        hit = true;
                }else if(hitBody() == true){
                    play = false;
                } 
                score = snake.getBody().size();
                i++;
                System.out.println("iteration: " + i); //an iteration is every one move of Snake

                //IF EAT SELF, BLINK
                //DISPLAY GAMEOVER
                //FOOD 3 = LIFE IMMUNITY            
            } catch (InterruptedException ex) {
                Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }//END WHILE
    }
    
    /*
    public int addScore(boolean grew){
        score++;
        return score;
    }
    */
    /*        
        public int getScore(String username){

        }
     */   
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 245));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        // TODO add your handling code here:
        
        if(this.direction == 38 && evt.getKeyCode() == 40){
            return;
        } else if(this.direction == 37 && evt.getKeyCode() == 39){
            return;
        } else if(this.direction == 40 && evt.getKeyCode() == 38){
            return;
        } else if(this.direction == 39 && evt.getKeyCode() == 37){
            return;
        } else if(evt.getKeyCode() == 32){
            return;
        }
        
        this.direction = evt.getKeyCode();
        //System.out.println(direction);
    }//GEN-LAST:event_jTextArea1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindow().setVisible(true);
            }
        });
        
        //JScrollPane2 sp2 = new JScrollPane2(new JTextArea)
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
