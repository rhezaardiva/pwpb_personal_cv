package org.sandec.personalcv;

import java.util.ArrayList;

public class InfoData {
    public static String[][] data = new String[][]{
            {"Circle Image View", "Membuat foto menjadi lingkaran. Dengan menambahkan implementasi ke Gradle Scripts -> build.gradle (Module: app)", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Card View", "CardView merupakan view paketan dari Material Design — diperkenalkan pada Android Versi Lolipop. Bentuk view ini biasa digunakan untuk pembungkusan data (sepaket data — beberapa view) yang ditandai dengan tampilan view nya yang memiliki drop shadow (elevation) dan corner radius. Adapun CardView ini merupakan subclass dari FrameLayout.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Recycler View", "Kelas RecyclerView adalah versi ListView yang lebih canggih dan fleksibel. Widget ini adalah kontainer untuk menampilkan rangkaian data besar yang bisa digulir secara sangat efisien dengan mempertahankan tampilan dalam jumlah terbatas.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Glide", "Glide adalah sumber terbuka perpustakaan Android yang populer untuk memuat gambar, video, dan GIF animasi. Dengan Glide, anda dapat memuat dan menampilkan media dari berbagai sumber, seperti server jarak jauh atau sistem file lokal.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Holder", "Mengambil id yang berada di xml", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Fragment", "Fragment merupakan salah satu komponen pada Android Studio dengan fungsi yang hampir sama seperti activity tetapi memiliki “lifecycle” yang berbeda. Fragment merupakan bagian dari sebuah activity yang mana sebuah fragment tidak akan ada bila tidak ada sebuah activity karena fragment membutuhkan akses dari activity untuk dapat dijalankan.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Button", "Button atau Tombol, juga salah satu komponen sebuah interface yang sudah biasa digunakan. Dengan sebuah Button pengguna dapat memerintahkan aplikasi untuk melakukan aksi yang telah ditentukan.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Relative Layout", "Relative Layout adalah layout yang penataan nya ini adalah penataan yang menempatkan widget-widget didalamnya seperti layer, sehingga sebuah widget dapat berada di atas/di bawah widget lainnya atau dengan kata lain Relative merupakan layout yang penataannya lebih bebas (Relative) sehingga bisa di tata di mana saja.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Linear Layout", "Linear Layout adalah jenis layout dimana user menempatkan 1 objek (widget) per baris/kolom. Jadi di dalam setiap baris/kolom hanya ada 1 objek (widget) yang kita tempatkan.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Scroll View", "ScrollView di Android Studio ini adalah komponen yang digunakan untuk menggulir layar aplikasi android. Jadi, ketika anda menggunakan banyak tampilan seperti Button, TextView, EditText dan lain sebagainya dan membuat layar android penuh, anda bisa menggunakan komponen ini agar tampilan-tampilan tersebut bisa digulir ke atas atau ke bawah.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Text View", "TextView adalah elemen yang berfungsi untuk menampilkan output berupa text", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Intent", "Intent juga merupakan suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi dengan activity yang lain, baik activity pada fungsi internal android misal seperti memanggil activity dalam satu package atau beda package yang masih berada dalam satu project.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Progress Bar", "ProgressBar merupakan elemen UI yang digunakan untuk indikasi suatu proses dalam aplikasi, elemen UI tersebut akan menampilkan suatu pemrosesan pada konten yang di akses oleh user.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Web View", "WebView adalah sebuah class di Android yang dapat menampilkan tampilan peramban web pada aplikasi Android. Aplikasi yang akan dibuat menghasilkan tampilan seperti kita membuka situs web menggunakan peremban web. Bedanya pada WebView ini tidak terdapat address bar, sehingga URL-nya sudah kita definisikan di dalam aplikasi Android yang kita buat.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Tab Layout", "Tab layout berguna untuk menentukan mode tab yang ingin digunakan, bernilai fixed artinya bahwa sejumlah n tab akan menyesuaikan lebar layarnya.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"View Pager", "View Pager adalah salah satu komponen view pada android, yang di sediakan pada para developer untuk membuat design yang dapat beranimasi, maksudnya design di sini adalah suatu atau kumpulan object baik berupa komponen view lainnya seperti layout, input, listview, textview, image dan lain-lain.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Array List", "ArrayList memiliki sejumlah operasi yang lebih lengkap dan mudah digunakan dibandingkan dengan array biasa. ArrayList merupakan collection yang menjadi bagian dari Java Util. Seperti biasa, ArrayList dapat menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal.", "https://www.sheetmetal-iti.org/img/courses.png"},
            {"Layout Inflater", "Sudah saya jelaskan tadi, Layout Inflater digunakan untuk menghubungkan MainActivity (Activity Utama) dengan Sub Activity, yaitu bagian kecil dari Activity.", "https://www.sheetmetal-iti.org/img/courses.png"},
    };

    public static ArrayList<Information> getListData(){
        ArrayList<Information> list = new ArrayList<>();
        for (String[] adata: data){
            Information information= new Information();
            information.setName(adata[0]);
            information.setFrom(adata[1]);
            information.setPhoto(adata[2]);
            list.add(information);
        }
        return list;
    }
}
