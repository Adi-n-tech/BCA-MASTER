package com.adintech.bcamaster;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class NotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        ExpandableListView elv = (ExpandableListView) findViewById(R.id.expandableListView);
        elv.setAdapter(new NotesActivity.SavedTabsListAdapter());
        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int parent, int child, long l) {
                if (parent == 0 && child == 0) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 111);
                    startActivity(it);
                }
                if (parent == 0 && child == 1) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 112);
                    startActivity(it);
                }
                if (parent == 0 && child == 2) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 113);
                    startActivity(it);
                }
                if (parent == 0 && child == 3) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 114);
                    startActivity(it);
                }
                if (parent == 0 && child == 4) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 115);
                    startActivity(it);
                }
                if (parent == 0 && child == 5) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 116);
                    startActivity(it);
                }
                if (parent == 0 && child == 6) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 117);
                    startActivity(it);
                }
                if (parent == 0 && child == 7) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 118);
                    startActivity(it);
                }
                /*-------------------------------------------------------------------------*/
                if (parent == 1 && child == 0) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 121);
                    startActivity(it);
                }
                if (parent == 1 && child == 1) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 122);
                    startActivity(it);
                }
                if (parent == 1 && child == 2) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 123);
                    startActivity(it);
                }
                if (parent == 1 && child == 3) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 124);
                    startActivity(it);
                }
                if (parent == 1 && child == 4) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 125);
                    startActivity(it);
                }
                if (parent == 1 && child == 5) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 126);
                    startActivity(it);
                }
                if (parent == 1 && child == 6) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 127);
                    startActivity(it);
                }
                if (parent == 1 && child == 7) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 128);
                    startActivity(it);
                }
                /*-------------------------------------------------------------------------*/
                if (parent == 2 && child == 0) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 131);
                    startActivity(it);
                }
                if (parent == 2 && child == 1) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 132);
                    startActivity(it);
                }
                if (parent == 2 && child == 2) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 133);
                    startActivity(it);
                }
                if (parent == 2 && child == 3) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 134);
                    startActivity(it);
                }
                if (parent == 2 && child == 4) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 135);
                    startActivity(it);
                }
                if (parent == 2 && child == 5) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 136);
                    startActivity(it);
                }
                /*-------------------------------------------------------------------------*/
                if (parent == 3 && child == 0) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 141);
                    startActivity(it);
                }
                if (parent == 3 && child == 1) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 142);
                    startActivity(it);
                }
                if (parent == 3 && child == 2) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 143);
                    startActivity(it);
                }
                if (parent == 3 && child == 3) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 144);
                    startActivity(it);
                }
                if (parent == 3 && child == 4) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 145);
                    startActivity(it);
                }
                if (parent == 3 && child == 5) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 146);
                    startActivity(it);
                }
                /*-------------------------------------------------------------------------*/
                if (parent == 4 && child == 0) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 151);
                    startActivity(it);
                }
                if (parent == 4 && child == 1) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 152);
                    startActivity(it);
                }
                if (parent == 4 && child == 2) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 153);
                    startActivity(it);
                }
                if (parent == 4 && child == 3) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 154);
                    startActivity(it);
                }
                if (parent == 4 && child == 4) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 155);
                    startActivity(it);
                }
                if (parent == 4 && child == 5) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 156);
                    startActivity(it);
                }
                /*-------------------------------------------------------------------------*/
                if (parent == 5 && child == 0) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 161);
                    startActivity(it);
                }
                if (parent == 5 && child == 1) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 162);
                    startActivity(it);
                }
                if (parent == 5 && child == 2) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 163);
                    startActivity(it);
                }
                if (parent == 5 && child == 3) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 164);
                    startActivity(it);
                }
                if (parent == 5 && child == 4) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 165);
                    startActivity(it);
                }
                if (parent == 5 && child == 5) {
                    Intent it = new Intent(NotesActivity.this, PdfViewer.class);
                    it.putExtra("key", 166);
                    startActivity(it);
                }
                /*-------------------------------------------------------------------------*/
                return false;
            }
        });
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6"};

        private String[][] children = {
                {"Office Automation", "Operating System", "Computer Fundamental", "Discrete Mathematics-1", "Statistical Method-1", "C Programming", "Complsary English", "Supplementary English"},
                {"C++ Programming", "Linux", "E-Commerce", "Discrete Mathematics-2", "System Analysis and Design", "Numerical Methods", "Complsary English", "Supplementary English"},
                {"DBMS", "Digital Electronics-1", "Data Structure", "Operation Research-1", "Visual Basics", "Web Technology-1"},
                {"Digital Electronics-2", "Operation Research-2", "PL-SQL", "Theory of Computation", "Software Engineering-1", "Web Technology-2"},
                {"Compiler Construction", "Computer Graphics-1", "DCN-1", "PHP-1", "Software Engineering-2", "VB.NET"},
                {"Computer Graphics-2", "ASP.NET", "DCN-2", "Java Programming", "PHP-2", "Software Testing"},
        };

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(NotesActivity.this);
            textView.setTextColor(getResources().getColor(R.color.white));
            textView.setTextSize(20);
            textView.setGravity(Gravity.CENTER);
            textView.setHeight(150);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            textView.setBackgroundColor(getResources().getColor(R.color.darkblue));
            textView.setText(getGroup(i).toString());
            return textView;
        }


        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(NotesActivity.this);
            textView.setTextColor(getResources().getColor(R.color.white));
            textView.setTextSize(14);
            textView.setGravity(Gravity.CENTER);
            textView.setHeight(115);
            textView.setBackgroundColor(getResources().getColor(R.color.bluelight));
            textView.setText(getChild(i, i1).toString());
            return textView;
        }


        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }
}
