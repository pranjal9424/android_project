package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    String questions[] = {
            "1) Which method can be defined only once in a program?",
            "2) Which of these is not a bitwise operator?",
            "3) Which keyword is used by method to refer to the object that invoked it?",
            "4) Which of these keywords is used to define interfaces in Java?",
            "5) Which of these access specifiers can be used for an interface?",
            "6) Which of the following is correct way of importing an entire package ‘pkg’?",
            "7) What is the return type of Constructors?",
            "8) Which of the following package stores all the standard java classes?",
            "9) Which of these method of class String is used to compare two String objects for their equality?",
            "10) An expression involving byte, int, & literal numbers is promoted to which of these?"
    };
    String answers[] = {"main method","<=","this","interface","public","import pkg.*","None of the mentioned","java","equals()","int"};
    String opt[] = {
            "finalize method","main method","static method","private method",
            "&","&=","|=","<=",
            "import","this","catch","abstract",
            "Interface","interface","intf","Intf",
            "public","protected","private","All of the mentioned",
            "Import pkg.","import pkg.*","Import pkg.*","import pkg.",
            "int","float","void","None of the mentioned",
            "lang","java","util","java.packages",
            "equals()","Equals()","isequal()","Isequal()",
            "int","long","byte","float"
    };
    String questions1[] = {
            "1) The fields in an interface are implicitly specified as",
            "2) Among these expressions, which is(are) of type String?",
            "3) What is printed by the following statement? System.out.print(“Hello,\\nworld!”);",
            "4) Which of the following variable declaration would NOT compile in a java program?",
            "5) A constructor",
            "6) The java run time system automatically calls this method while garbage collection",
            "7) All exception types are subclasses of the built-in class",
            "8) When an overridden method is called from within a subclass, it will always refer to the version of that method defined by the",
            "9) In java, objects are passed as",
            "10) Which of the following is not a component of Java Integrated Development Environment (IDE)?"
    };
    String answers1[] = {
            "both static and final",
            "Both (A) and (B) above",
            "None of the above.",
            "int 1_var;.",
            "all of the above.",
            "finalized()",
            "Throwable",
            "Subclass",
            "Memory address",
            "Symantec’s Visual Café"
    };
    String opt1[] = {
            "static only"," protected","private","both static and final",
            " “0” "," “ab” + “cd” "," ‘0’","Both (A) and (B) above",
            "Hello, \\nworld!","Hello, world!","“Hello, \\nworld!”","None of the above.",
            " int var; "," int VAR;","int var1; ","int 1_var;.",
            "same name as the class"," Is used to create objects.","May be declared private","all of the above.",
            "finalizer()","finalize()","finally()","finalized()",
            "Throwable","RuntimeException","Error","Exception",
            "Super class","Subclass","Compiler will choose randomly","Interpreter will choose randomly",
            "Copy of that object","Method called call by value","Memory address","Constructor",
            "Net Beans","Borland’s Jbuilder","Symantec’s Visual Café","Microsoft Visual Fox Pro"
    };




    String questions2[] = {
            "1) Decrement operator, –, decreases value of variable by what number?",
            "2) Which of these is not a bitwise operator?",
            "3) On applying Left shift operator, <<, on an integer bits are lost one they are shifted past which position bit?",
            "4) Which right shift operator preserves the sign of the value?",
            "5) What is the output of relational operators?",
            "6) Which of these operators can skip evaluating right hand operand?",
            "7) Which of these have highest precedence?",
            "8) Which of these packages contain all the collection classes?",
            "9) Which of these classes is not part of Java’s collection framework?",
            "10) Which of these interface is not a part of Java’s collection framework?"

    };
    String answers2[] = {
            "1",
            "&=",
            "31",
            ">>",
            "Boolean",
            "&&",
            "()",
            "java.util",
            "Queue",
            "SortedList"
    };
    String opt2[] = {
            "1","2","3","4",
            "&"," &=" ,"!=","none of the above",
            "1","32","33","31",
            ">>",">>=",">",">!",
            "Integer","Boolean","Characters","Double",
            "!","|","&","&&",
            "()","++","*",">>",
            "java.lang","java.util","java.net","java.awt",
            "Maps","Array","Stack","Queue",
            "List","Set","SortedMap","SortedList"
    };


    String questions3[] = {
            "1) Which of these methods deletes all the elements from invoking collection?",
            "2) What is Collection in Java",
            "3) Which of these interface declares core method that all collections will have?",
            "4) Which of these interface handle sequences?",
            "5) Which of these interface is not a part of Java’s collection framework?",
            "6) Which of these interface must contain a unique element?",
            "7) Which of these is Basic interface that all other interface inherits?",
            "8) Which of these methods sets every element of a List to a specified object?",
            "9) Which of these methods can randomize all elements in a list?",
            "10) Which of these methods can convert an object into a List?"

    };
    String answers3[] = {
            "clear()",
            "A group of objects",
            "Collection",
            "List",
            "SortedList",
            "Set",
            "Collection",
            "fill()",
            "shuffle()",
            "singletonList()"
    };
    String opt3[] = {
            "clear()","reset()","delete()","refresh()",
            "A group of objects","A group of classes","A group of interfaces"," None of the mentioned",
            "set","EventListner","Comparator","Collection",
            " Set","List","Comparator","Collection",
            "List","Set","SortedMap","SortedList",
            "List","Set","SortedMap","SortedList",
            "set","EventListner","Comparator","Collection",
            "set()","fill()","Complete()","add()",
            "rand()","randomize()","shuffle()","ambigous()",
            " SetList()","ConvertList()","singletonList()","CopyList()",
    };
    String questions4[] = {
            "1) Which of these is static variable defined in Collections?",
            "2) Which of these operators is used to allocate memory to array variable in Java?",
            "3) Which of these is necessary to specify at time of array initialization?",
            "4) When does Exceptions in Java arises in code sequence?",
            "5) Which of these keywords is not a part of exception handling?",
            "6) Which of these keywords must be used to monitor for exceptions?",
            "7) Which of these keywords must be used to handle the exception thrown by try block in some rational manner?",
            "8) Which of these keywords is used to manually throw an exception?",
            "9) Which of these keywords is used to define interfaces in Java?",
            "10) Which of these can be used to fully abstract a class from its implementation?"

    };
    String answers4[] = {
            "All of the mentioned",
            "new",
            "Row",
            "Run Time",
            "throw",
            "try",
            "catch",
            "throw",
            "interface",
            "Interfaces"
    };
    String opt4[] = {
            "EMPTY_SET","EMPTY_LIST","EMPTY_MAP","All of the mentioned",
            "malloc","alloc","new","new malloc",
            "Row","Column","Both Row and Column","None of the mentioned",
            "Run Time","Compilation Time","Can Occur Any Time","None of the mentioned",
            "try","finally","throw","catch",
            "try","finally","throw","catch",
            "try","finally","throw","catch",
            "try","finally","throw","catch",
            "Objects","Packages","Interfaces","None of the Mentioned.",
            "Objects","Packages","Interfaces","None of the Mentioned.",

    };


    String questions5[] = {
            "1) Which of these classes is not included in java.lang?",
            "2) Which of these is a process of converting a simple data type into a class?",
            "3) Which of these is a super class of wrappers Double & Integer?",
            "4) Which of these is wrapper for simple data type float?",
            "5) Which of the following is method of wrapper Float for converting the value of an object into byte?",
            "6) Which of these methods is used to check for infinitely large and small values?",
            "7) Which of the following package stores all the simple data types in java?",
            "8) Which of these is a wrapper for data type int?\n",
            "9) Which of these is a super class of wrappers Long, Character & Integer?",
            "10) Which of these class holds a collection of static methods and variables?"

    };
    String answers5[] = {
            "Array",
            "type conversion",
            "Number",
            "Float",
            "byte bytevalue()",
            "isInfinite()",
            "lang",
            "Integer",
            "Number",
            "System"
    };
    String opt5[] = {
            "Byte","Integer","Array","Class",
            "type wrapping","type conversion","type casting","None of the Mentioned",
            "Long","Digits","Float","Number",
            "float","double","Float","Double",
            " bytevalue()","byte bytevalue()","Bytevalue()","Byte Bytevalue()",
            "isInfinite()","isNaN()","Isinfinite()","IsNaN()",
            "lang","java","util","java.packages",
            "Integer","Long","Byte","Both a & b",
            "Long","Digits","Float","Number",
            "VoidB","Process","Runtime","System"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startbutton=(Button)findViewById(R.id.level);



        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Level.class);
                intent.putExtra("keyArray", questions);
                intent.putExtra("keyArra", answers);
                intent.putExtra("keyArr", opt);
                startActivity(intent);
            }
        });

        Button level2=(Button)findViewById(R.id.level2);



        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Level.class);
                intent.putExtra("keyArray", questions1);
                intent.putExtra("keyArra", answers1);
                intent.putExtra("keyArr", opt1);
                startActivity(intent);
            }
        });


        Button level3=(Button)findViewById(R.id.level3);



        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Level.class);
                intent.putExtra("keyArray", questions2);
                intent.putExtra("keyArra", answers2);
                intent.putExtra("keyArr", opt2);
                startActivity(intent);
            }
        });


        Button level4=(Button)findViewById(R.id.level4);



        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Level.class);
                intent.putExtra("keyArray", questions3);
                intent.putExtra("keyArra", answers3);
                intent.putExtra("keyArr", opt3);
                startActivity(intent);
            }
        });



        Button level5=(Button)findViewById(R.id.level5);



        level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Level.class);
                intent.putExtra("keyArray", questions4);
                intent.putExtra("keyArra", answers4);
                intent.putExtra("keyArr", opt4);
                startActivity(intent);
            }
        });


        Button level6=(Button)findViewById(R.id.level6);



        level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Level.class);
                intent.putExtra("keyArray", questions5);
                intent.putExtra("keyArra", answers5);
                intent.putExtra("keyArr", opt5);
                startActivity(intent);
            }
        });

    }
    public void onBackPressed(){
        Intent bac=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(bac);
    }
}