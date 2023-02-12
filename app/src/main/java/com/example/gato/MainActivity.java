package com.example.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

        public class MainActivity extends AppCompatActivity {
            Button b1,b2,b3,b4,b5,b6,b7,b8,b9,tx,to;
            int tiro=0,o1,o2,o3,o4,o5,o6,o7,o8,o9;
            String cp1="",cp2 ="";
            EditText jugador,jugador1;
            TextView winpl;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                b1 = (Button) findViewById(R.id.bt1);
                b2 = (Button) findViewById(R.id.bt2);
                b3 = (Button) findViewById(R.id.bt3);
                b4 = (Button) findViewById(R.id.bt4);
                b5 = (Button) findViewById(R.id.bt5);
                b6 = (Button) findViewById(R.id.bt6);
                b7 = (Button) findViewById(R.id.bt7);
                b8 = (Button) findViewById(R.id.bt8);
                b9 = (Button) findViewById(R.id.bt9);
                //tx = (Button) findViewById(R.id.pl1);
                //to = (Button) findViewById(R.id.pl2);
                jugador=(EditText) findViewById(R.id.juagador);
                jugador1=(EditText) findViewById(R.id.jugador1);
                winpl = (TextView) findViewById(R.id.ganador);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o1==0) {

                            o1=1;
                            if(tiro==0) {
                                b1.setText("X");
                                cp1=cp1+"1";
                                tiro=1;

                            }else{
                                b1.setText("O");
                                cp2=cp2+"1";
                                tiro=0;

                            }
                            Ganador();
                        }

                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o2==0) {

                            o2=1;
                            if(tiro==0) {
                                b2.setText("X");
                                cp1=cp1+"2";
                                tiro=1;

                            }else{
                                b2.setText("O");
                                cp2=cp2+"2";
                                tiro=0;

                            }
                            Ganador();
                        }
                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o3==0) {

                            o3=1;
                            if(tiro==0) {
                                b3.setText("X");
                                tiro=1;
                                cp1=cp1+"3";
                            }else{
                                b3.setText("O");
                                cp2=cp2+"3";
                                tiro=0;
                            }
                            Ganador();
                        }
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o4==0) {
                            Ganador();
                            o4=1;
                            if(tiro==0) {
                                b4.setText("X");
                                tiro=1;
                                cp1=cp1+"4";
                            }else{
                                b4.setText("O");
                                tiro=0;
                                cp2=cp2+"4";
                            }
                            Ganador();
                        }
                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o5==0) {
                            Ganador();
                            o5=1;
                            if(tiro==0) {
                                b5.setText("X");
                                tiro=1;
                                cp1=cp1+"5";
                            }else{
                                b5.setText("O");
                                tiro=0;
                                cp2=cp2+"5";
                            }
                            Ganador();
                        }
                    }
                });

                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o6==0) {
                            Ganador();
                            o6=1;
                            if(tiro==0) {
                                b6.setText("X");
                                tiro=1;
                                cp1=cp1+"6";
                            }else{
                                b6.setText("O");
                                cp2=cp2+"6";
                                tiro=0;
                            }
                            Ganador();
                        }
                    }
                });

                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o7==0) {
                            Ganador();
                            o7=1;
                            if(tiro==0) {
                                b7.setText("X");
                                tiro=1;
                                cp1=cp1+"7";
                            }else{
                                b7.setText("O");
                                tiro=0;
                                cp2=cp2+"7";
                            }
                            Ganador();
                        }
                    }
                });

                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o8==0) {
                            Ganador();
                            o8=1;
                            if(tiro==0) {
                                b8.setText("X");
                                tiro=1;
                                cp1=cp1+"8";
                            }else{
                                b8.setText("O");
                                cp2=cp2+"8";
                                tiro=0;
                            }
                            Ganador();
                        }
                    }
                });

                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(o9==0) {
                            Ganador();
                            o9=1;
                            if(tiro==0) {
                                b9.setText("X");
                                tiro=1;
                                cp1=cp1+"9";
                            }else{
                                b9.setText("O");
                                tiro=0;
                                cp2=cp2+"9";
                            }
                            Ganador();
                        }
                    }
                });



            }

            public void Ganador(){
                Boolean co1=true;
                int g1=0,g2=0,g3=0,g4=0,g5=0,g6=0,g7=0,g8=0,g9=0,g10=0,g11=0,g12=0,g13=0,g14=0,g15=0,g16=0;
                int acu=0;
                String acum="";
                String hola ="1";
                int j=1;
                for (int i = 0; i < 10; i++){
                    acum=""+j;
                    j++;
                    boolean isExist = cp1.contains(String.valueOf(acum));
                    boolean isExist2 = cp2.contains(String.valueOf(acum));
                    if(acum.equals("1") && co1.equals(isExist) || acum.equals("2") && co1.equals(isExist) || acum.equals("3") && co1.equals(isExist)  ){
                        g1=g1+1;

                    }
                    if(acum.equals("1") && co1.equals(isExist) || acum.equals("4") && co1.equals(isExist) || acum.equals("7") && co1.equals(isExist)  ){
                        g2=g2+1;

                    }
                    if(acum.equals("1") && co1.equals(isExist) || acum.equals("5") && co1.equals(isExist) || acum.equals("9") && co1.equals(isExist)  ){
                        g3=g3+1;

                    }
                    if(acum.equals("4") && co1.equals(isExist) || acum.equals("5") && co1.equals(isExist) || acum.equals("6") && co1.equals(isExist)  ){
                        g4=g4+1;
                    }
                    if(acum.equals("7") && co1.equals(isExist) || acum.equals("8") && co1.equals(isExist) || acum.equals("9") && co1.equals(isExist)  ){
                        g5=g5+1;

                    }
                    if(acum.equals("2") && co1.equals(isExist) || acum.equals("5") && co1.equals(isExist) || acum.equals("8") && co1.equals(isExist)  ){
                        g6=g6+1;

                    }
                    if(acum.equals("7") && co1.equals(isExist) || acum.equals("5") && co1.equals(isExist) || acum.equals("3") && co1.equals(isExist)  ){
                        g7=g7+1;

                    }
                    if(acum.equals("3") && co1.equals(isExist) || acum.equals("6") && co1.equals(isExist) || acum.equals("9") && co1.equals(isExist)  ){
                        g8=g8+1;

                    }
                    if(acum.equals("1") && co1.equals(isExist2) || acum.equals("2") && co1.equals(isExist2) || acum.equals("3") && co1.equals(isExist2)  ){
                        g9=g9+1;

                    }
                    if(acum.equals("1") && co1.equals(isExist2) || acum.equals("4") && co1.equals(isExist2) || acum.equals("7") && co1.equals(isExist2)  ){
                        g10=g10+1;

                    }
                    if(acum.equals("1") && co1.equals(isExist2) || acum.equals("5") && co1.equals(isExist2) || acum.equals("9") && co1.equals(isExist2)  ){
                        g11=g11+1;

                    }
                    if(acum.equals("4") && co1.equals(isExist2) || acum.equals("5") && co1.equals(isExist2) || acum.equals("5") && co1.equals(isExist2)  ){
                        g12=g12+1;

                    }
                    if(acum.equals("7") && co1.equals(isExist2) || acum.equals("8") && co1.equals(isExist2) || acum.equals("9") && co1.equals(isExist2)  ){
                        g13=g13+1;

                    }
                    if(acum.equals("2") && co1.equals(isExist2) || acum.equals("5") && co1.equals(isExist2) || acum.equals("8") && co1.equals(isExist2)  ){
                        g14=g14+1;

                    }
                    if(acum.equals("7") && co1.equals(isExist2) || acum.equals("5") && co1.equals(isExist2) || acum.equals("3") && co1.equals(isExist2)  ){
                        g15=g15+1;

                    }
                    if(acum.equals("3") && co1.equals(isExist2) || acum.equals("6") && co1.equals(isExist2) || acum.equals("9") && co1.equals(isExist2)  ){
                        g16=g16+1;

                    }
                }


                if(g1==3 || g2==3 || g3==3 || g4==3 || g5==3 || g6==3 || g7==3 || g8==3)  {
                    winpl.setText("Gano jugador 1"+jugador.getText().toString());
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                } else if (g9==3 || g10==3 || g11==3 || g12==3 || g13==3 || g14==3 || g15==3 || g16==3) {
                    winpl.setText("Gano jugador2 "+jugador1.getText().toString());
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }


            };
        }