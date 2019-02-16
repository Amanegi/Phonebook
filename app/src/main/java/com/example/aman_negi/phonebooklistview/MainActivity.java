package com.example.aman_negi.phonebooklistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private RowLayout rowLayout;
    private ArrayList<RowLayout> rowLayoutArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);

        //Data Source
        int[] contactImage = {R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round};
        String[] contactName = {"Aman", "Kartik", "Pravesh", "Pranav", "Priya", "Rahul", "Tanya", "Abhishek", "Priyanka", "Aditya", "Divya", "Amit", "Tanvi", "Mahesh", "Ishita", "Rohit", "Vani", "Yash", "Anjali", "Ankit", "Shreya", "Shyam", "Riya", "Deepak", "Sneha", "Aryan", "Aishwarya", "Raj", "Arjun", "Varsha", "Manoj", "Sanjana", "Akash", "Niharika", "Karan", "Nikita", "Rakesh", "Natasha", "Sam", "Neha", "Naveen", "Shivangi", "Ashish", "Ramya", "Vinay", "Isha", "Parth", "Ananya", "Mayank", "Shivani"};
        String[] contactNumber = {"8802522998", "7780903112", "9953238282", "7710484499", "7845555564", "8547125465", "9658745123", "9856741235", "9874587568", "8745687456", "8754896526", "7458621547", "7845874512", "9854756221", "8574622144", "9874125635", "9856325874", "9856258541", "9785478565", "8745896523", "8745896542", "8745879556", "9878787487", "8745895698", "9874568545", "9782587854", "9878987845", "9858748798", "9788985584", "8798548974", "7489856841", "9784758465", "7845898784", "8748958745", "8758978475", "8758945687", "9584745215", "9586471223", "9874514585", "8792456215", "9635874521", "9856874565", "9874587417", "9856874174", "9874514754", "9854125485", "9632587414", "9874125632", "9854125632", "9874521563"};

        rowLayoutArrayList = new ArrayList<>();
        for (int i = 0; i < contactName.length; i++) {
            rowLayout = new RowLayout(contactImage[i], contactName[i], contactNumber[i]);
            rowLayoutArrayList.add(rowLayout);

            MyAdapter myAdapter = new MyAdapter(this, rowLayoutArrayList);
            listView.setAdapter(myAdapter);

        }
    }
}
