package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bpi, bequal, bplus, bmin, bmul, bdiv, binv, bsqrt, bsquare, bfact, bln, blog, btan, bcos, bsin, bb1, bb2, bc, bac;
    TextView tvmain, tvsec;
    String pi = "3.14159265";

    @Override //ПЕРЕОП МЕТОД
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bdot = findViewById(R.id.bdot);
        bpi = findViewById(R.id.bpi);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bcos = findViewById(R.id.bcos);
        bsin = findViewById(R.id.bsin);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        b1.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "1"));
        b2.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "2"));
        b3.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "3"));
        b4.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "4"));
        b5.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "5"));
        b6.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "6"));
        b7.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "7"));
        b8.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "8"));
        b9.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "9"));
        b0.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "0"));
        bdot.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "."));
        bac.setOnClickListener(view -> {
            tvmain.setText("");
            tvsec.setText("");
        });
        bc.setOnClickListener(view -> {
            String val = tvmain.getText().toString();
            val = val.substring(0, val.length() - 1);
            tvmain.setText(val);

        });
        bplus.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "+"));
        bmin.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "-"));
        bmul.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "×"));
        bdiv.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "÷"));
        try {
            bsqrt.setOnClickListener(view -> {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            });
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bb1.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "("));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bb2.setOnClickListener(view -> tvmain.setText(tvmain.getText() + ")"));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bpi.setOnClickListener(view -> {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText() + pi);
            });
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bsin.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "sin"));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bcos.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "cos"));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            btan.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "tan"));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            binv.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "^" + "(-1)"));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bfact.setOnClickListener(view -> {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val + "!");
            });
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bsquare.setOnClickListener(view -> {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d * d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d + "²");
            });
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bpi.setOnClickListener(view -> {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText() + pi);
            });
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bln.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "ln"));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            blog.setOnClickListener(view -> tvmain.setText(tvmain.getText() + "log"));
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
        try {
            bequal.setOnClickListener(view -> {
                String val = tvmain.getText().toString();
                String replacedstr = val.replace('÷', '/').replace('×', '*');
                double result = eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            });
        } catch (Exception e) {
            Log.e("Error", "Error");
        }
    }

    //factorial function
    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Result", tvmain.getText().toString());
        outState.putString("Calculate", tvsec.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tvmain.setText(savedInstanceState.getString("Result"));
        tvsec.setText(savedInstanceState.getString("Calculate"));
    }

    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }


            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}