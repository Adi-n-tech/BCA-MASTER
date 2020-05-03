package com.adintech.bcamaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {

    PDFView pdfView;
    Integer s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        Intent it = getIntent();
        s = it.getIntExtra("key", 0);
        pdfView = (PDFView) findViewById(R.id.pdfview);
        pdfView.fitToWidth();
        pdfView.getMaxZoom();
        pdfView.getOptimalPageWidth();
        /*--------------Syllabus viewer start---------------------*/
        if (s == 111) {
            pdfView.fromAsset("bca_sem1_syll_oa.pdf").load();
        }
        if (s == 112) {
            pdfView.fromAsset("bca_sem1_syll_os.pdf").load();
        }
        if (s == 113) {
            pdfView.fromAsset("bca_sem1_syll_cf.pdf").load();
        }
        if (s == 114) {
            pdfView.fromAsset("bca_sem1_syll_dms.pdf").load();
        }
        if (s == 115) {
            pdfView.fromAsset("bca_sem1_syll_Stat.pdf").load();
        }
        if (s == 116) {
            pdfView.fromAsset("bca_sem1_syll_c.pdf").load();
        }
        if (s == 117) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 118) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 121) {
            pdfView.fromAsset("bca_sem2_syll_c++.pdf").load();
        }
        if (s == 122) {
            pdfView.fromAsset("bca_sem2_syll_linux.pdf").load();
        }
        if (s == 123) {
            pdfView.fromAsset("bca_sem2_syll_E-Com.pdf").load();
        }
        if (s == 124) {
            pdfView.fromAsset("bca_sem2_syll_dms.pdf").load();
        }
        if (s == 125) {
            pdfView.fromAsset("bca_sem2_syll_sad.pdf").load();
        }
        if (s == 126) {
            pdfView.fromAsset("bca_sem2_syll_nm.pdf").load();
        }
        if (s == 127) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 128) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 131) {
            pdfView.fromAsset("bca_sem3_syll_dbms.pdf").load();
        }
        if (s == 132) {
            pdfView.fromAsset("bca_sem3_syll_de-I.pdf").load();
        }
        if (s == 133) {
            pdfView.fromAsset("bca_sem3_syll_ds.pdf").load();
        }
        if (s == 134) {
            pdfView.fromAsset("bca_sem3_syll_or-I.pdf").load();
        }
        if (s == 135) {
            pdfView.fromAsset("bca_sem3_syll_vb.pdf").load();
        }
        if (s == 136) {
            pdfView.fromAsset("bca_sem3_syll_wt-I.pdf").load();
        }
        if (s == 141) {
            pdfView.fromAsset("bca_sem4_syll_de-II.pdf").load();
        }
        if (s == 142) {
            pdfView.fromAsset("bca_sem4_syll_or-II.pdf").load();
        }
        if (s == 143) {
            pdfView.fromAsset("bca_sem4_syll_pl-sql.pdf").load();
        }
        if (s == 144) {
            pdfView.fromAsset("bca_sem4_syll_toc.pdf").load();
        }
        if (s == 145) {
            pdfView.fromAsset("bca_sem4_syll_se-I.pdf").load();
        }
        if (s == 146) {
            pdfView.fromAsset("bca_sem4_syll_wt-II.pdf").load();
        }
        if (s == 151) {
            pdfView.fromAsset("bca_sem5_syll_cc.pdf").load();
        }
        if (s == 152) {
            pdfView.fromAsset("bca_sem5_syll_cg.pdf").load();
        }
        if (s == 153) {
            pdfView.fromAsset("bca_sem5_syll_dcn-I.pdf").load();
        }
        if (s == 154) {
            pdfView.fromAsset("bca_sem5_syll_php-I.pdf").load();
        }
        if (s == 155) {
            pdfView.fromAsset("bca_sem5_syll_se-II.pdf").load();
        }
        if (s == 156) {
            pdfView.fromAsset("bca_sem5_syll_vb.net.pdf").load();
        }
        if (s == 161) {
            pdfView.fromAsset("bca_sem6_syll_cg-II.pdf").load();
        }
        if (s == 162) {
            pdfView.fromAsset("bca_sem6_syll_asp.net.pdf").load();
        }
        if (s == 163) {
            pdfView.fromAsset("bca_sem6_syll_dcn-II.pdf").load();
        }
        if (s == 164) {
            pdfView.fromAsset("bca_sem6_syll_java.pdf").load();
        }
        if (s == 165) {
            pdfView.fromAsset("bca_sem6_syll_php-II.pdf").load();
        }
        if (s == 166) {
            pdfView.fromAsset("bca_sem6_syll_st.pdf").load();
        }
        /*--------------Syllabus viewer End ---------------------*/
        /*--------------Notes viewer start---------------------*/
        if (s == 211) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 212) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 213) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 214) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 215) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 216) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 217) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 218) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 221) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 222) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 223) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 224) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 225) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 226) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 227) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 228) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 231) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 232) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 233) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 234) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 235) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 236) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 241) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 242) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 243) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 244) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 245) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 246) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 251) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 252) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 253) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 254) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 255) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 256) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 261) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 262) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 263) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 264) {
            pdfView.fromAsset("cv.pdf").load();
        }
        if (s == 265) {
            pdfView.fromAsset("syll5thsem.pdf").load();
        }
        if (s == 266) {
            pdfView.fromAsset("cv.pdf").load();
        }
        /*--------------Notes viewer start---------------------*/
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pdf_download, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.downloads) {
            /*--------------Syllabus viewer start---------------------*/
            if (s == 111) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Y4YoE3pUXW6eP7710tLYN0-iSAoHK5U6")));
            }
            if (s == 112) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=17jUFJJTE6D20mY4F2RD7RSo58K0_ekPX")));
            }
            if (s == 113) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=19EhNeWLfq--Zd4vQOmiDxKMUyVjg1lGF")));
            }
            if (s == 114) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=19t8fGXAaZ4zEnXqvaJtNcDtHBvNCVhLXg")));
            }
            if (s == 115) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1VQLsnt4rfaMcDEmgBPb-tBrN0jwDRgGG")));
            }
            if (s == 116) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1-5U4uTmCLooY-xkkxpclw2JYy7gcLBO0")));
            }
            if (s == 117) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 118) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 121) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1OFP7gBE8F_nD1ROiIvNA7Z8wwl4gMYP3")));
            }
            if (s == 122) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1XeVXXiM1m75vdb3AzqZqXTx-UETSBKGb")));
            }
            if (s == 123) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1hac98S0HzLUokNHovW6zaJsq2rUTnulQ")));
            }
            if (s == 124) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Xdc-Jl0V15RXl76KSX6OvJHy2Jf5iuSO")));
            }
            if (s == 125) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1AXVkBWmcHnoEBu9uyXOYz8tx1L22mZ5W")));
            }
            if (s == 126) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1u6ttO25GQxvZ9P1tMe4B3RSSSZd5iy0R")));
            }
            if (s == 127) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 128) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 131) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Fv3hs-ys2o5UXSPjguI9xYghEeilOfpp")));
            }
            if (s == 132) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1BIAIXzDqVKNGhFk81ixGpfD1aU5YJ4LR")));
            }
            if (s == 133) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1AGi4Fl6wrLyHNSW5OZf3ThHBeIF2nGZ3")));
            }
            if (s == 134) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1xCG6G691dlF2z_s_qfF5NsI_MwoYwMDb")));
            }
            if (s == 135) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1kYSnyk_ewAAs3L4UWzytRWEvl6Sp9kU6")));
            }
            if (s == 136) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1wjj1VVGw5InXiTbtVU3TL_s6dqGF-xtU")));
            }
            if (s == 141) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1uqkL5vPO-L5poxxpSnPhpGb-Felvsr0a")));
            }
            if (s == 142) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1dUJKO2cPmspEg51xwyD7KIv7wgcTyMzK")));
            }
            if (s == 143) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1-vM2XYbF2Vhf9Xg17dP7UYQLumVmq8W4")));
            }
            if (s == 144) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=17L_ds1A7uWBGDqmvBmyKvyAI4he-Zoy9")));
            }
            if (s == 145) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=11xGIoduDopBsZ0KkKtkgA1hIMNH1kB-j")));
            }
            if (s == 146) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1KhHy_H18xVX2V0K9xyJxqbpUnZ-Pkkhy")));
            }
            if (s == 151) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=15gcJSUMAly-smSaaCyihLnS8TlUkb9Xr")));
            }
            if (s == 152) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1sByA9Yye-V-bEazKYPfwaDKJ6VmvIAwh")));
            }
            if (s == 153) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1tBJdhX1-4Yy-siu4nxmh7HczYootWUol")));
            }
            if (s == 154) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1kVoOvluXznG9wlwKw3ID2ItqUHqyDN7w")));
            }
            if (s == 155) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=189t5NuxNNSAmeCH9Fme8QvDKpaimi4bZb")));
            }
            if (s == 156) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1iMY_ReuLK1ZNGyl1VayPe_0KcwAYMlHp")));
            }
            if (s == 161) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1qp8Y4upAxt7d-UcB9n4wwHq8NtEwN-p-")));
            }
            if (s == 162) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1pTg0RrBJJQXgbq9E5WTgJ8fpE7T0AbTG")));
            }
            if (s == 163) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1pcFqMcMnTomWMMTArSTSNMjsXIJ_B1aP")));
            }
            if (s == 164) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=15dqOuQf0Ux-HXO8MTxp987Rqsb0PpFq4")));
            }
            if (s == 165) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1G8-O3GDVwmU89HG1MIC4hvUJQNrD4q7a")));
            }
            if (s == 166) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1o5Et69F9RlqIB1ke9rbhGQU_g-jYuh6R")));
            }
            /*--------------Syllabus viewer End ---------------------*/
            /*--------------Notes viewer start---------------------*/
            if (s == 211) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 212) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 213) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 214) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 215) {
                this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
            if (s == 216) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 217) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 218) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 221) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 222) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 223) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 224) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 225) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 226) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 227) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 228) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 231) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 232) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 233) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 234) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 235) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 236) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 241) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 242) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 243) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 244) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 245) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 246) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 251) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 252) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 253) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 254) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 255) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 256) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 261) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 262) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 263) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 264) {
                pdfView.fromAsset("cv.pdf").load();
            }
            if (s == 265) {
                pdfView.fromAsset("syll5thsem.pdf").load();
            }
            if (s == 266) {
                pdfView.fromAsset("cv.pdf").load();
            }
            /*--------------Notes viewer start---------------------*/
        }
        return true;
    }

}


