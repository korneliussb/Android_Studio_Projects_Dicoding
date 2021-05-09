package com.project.buku;

import java.util.ArrayList;

public class BooksData {
    private static String[] bookNames = {
            "Aplikasi Google Sketchup Untuk Desain 3 Dimensi",
            "Belajar Social Media Marketing",
            "Buku Pintar Web Desain dan SEO WordPress 5 PLUS",
            "Microsoft Excel untuk Keterampilan Vokasional",
            "Network: Tweaking dan Hacking",
            "Pemrograman Android Dengan Flutter",
            "Tip Dan Trik Adobe Illustrator",
            "Trik Pilihan Jago CorelDraw",
            "Trik Pilihan Jago Photoshop",
            "Yuk Berbisnis dengan Laravel dan Android"
    };

    private static String[] bookDetails = {
            "Google SketchUp adalah program grafis yang paling tepat untuk membuat desain dalam tampilan 3 dimensi. Tampilan layar kerja yang sederhana serta perintah kerja yang tidak rumit akan sangat memudahkan kita dalam membuat desain 3 dimensi sesuai yang kita inginkan. Ada banyak desain yang bisa dihasilkan menggunakan program ini, seperti membuat desain bangunan apartemen bertingkat banyak, membuat desain rumah, mendesain rumah toko, dan masih banyak lagi. Buku ini adalah panduan tepat yang akan menuntun Anda, langkah demi langkah, dalam membuat desain 3 dimensi. Proses mendesain dimulai dari membuat denah desain, membuatan elemen-elemen vertikal (dinding bangunan, tiang untuk canopy carport), hingga membuat desain atap.",
            "Ingin mempromosikan bisnismu melalui media sosial paling hits saat ini? Ingin meningkatkan penjualan produk memakai Instagram, Facebook, Twitter, dan YouTube? Mau belajar social media marketing dari nol sampai jago? Yuk baca buku ini. Belajar Social Media Marketing adalah buku panduan lengkap untuk mulai belajar social media marketing. Buku ini membahas empat media sosial sekaligus, yakni Instagram, Facebook, Twitter, dan YouTube. Jadi, buat kamu yang ingin berpromosi di media sosial, buku ini wajib banget untuk kamu baca. Inilah pembahasan menarik dalam buku ini. Panduan lengkap melakukan Instagram Marketing. Mulai dari membuat akun Instagram, membuat konten, meningkatkan followers, sampai berjualan di Instagram. Yuk dapatkan segera.",
            "WordPress adalah CMS paling populer sekarang ini, di mana WodPress dipilih oleh banyak kalangan, baik itu profesional ataupun pemula karena WordPress mudah digunakan. Bagi Anda yang tertarik untuk mempelajari cara membuat website WordPress, buku ini berisikan langkah demi langkah membangun website WordPress sendiri dengan mudah dan cepat. Pembahasan di dalam buku tidak hanya sampai pada cara membuat website WordPress, tetapi sampai cara membuat website tersebut dapat dengan mudah ditemukan oleh pencari informasi melalui mesin pencari Google, atau yang dikenal dengan SEO WordPress. Dengan membeli satu buku, Anda mendapatkan dua pelajaran. Pelajaran pembuatan website dengan WordPress dan panduan melakukan SEO untuk website WordPress.",
            "Pendidikan vokasi (skill base) semakin populer akhir-akhir ini yaitu pendidikan yang menekankan pada keahlian praktikal sesuai dengan kebutuhan dunia kerja. Proses belajar menggabungkan teori dengan praktik yang seimbang dengan orientasi pada kesiapan kerja lulusannya yang berbasis kebutuhan industri. Lulusan pendidikan kejuruan atau vokasi yang telah menguasai keahlian praktikal dianggap lebih siap kerja sehingga banyak diminati perusahaan. Penyiapan lulusan kerja kejuruan/vokasi tidak dapat dilepaskan dengan pengetahuan terapan tidak saja bersifat teoritis tetapi juga menggunakan alat bantu komputer. Keberadaan program aplikasi Microsoft Excel dengan kelengkapan fasilitas sudah menjadi keharusan sebagai media pembelajaran di lingkungan SMK maupun perguruan tinggi (PT). Buku pertama dan terlengkap yang mengeksplorasi Microsoft Excel sesuai tuntutan dunia kerja.",
            "Buku ini lebih mengarah kepada eksploitasi jaringan yang ada sehingga kita bisa melakukan aksi tweaking, bahkan juga berbagai aksi hacking. Buku ini, dapat digunakan oleh beberapa versi Windows sekaligus, yaitu Windows 7, Windows 8, dan Windows 10. Beberapa materi yang diuraikan dalam buku ini adalah menjelajah jaringan, mendapatkan password wifi, memutuskan koneksi internet komputer lain, menembus blokir dengan duplikasi MAC address, membuka jaringan wireless yang tersembunyi, memantau jaringan, menyadap password dalam jaringan, man in the middle attack, manipulasi jaringan via registry, mempercepat browsing pada jaringan, konfigurasi DNS cache, inbound & outbound rules, menutup port, dan mengetahui masalah TCP/IP. Apa yang diuraikan dalam buku ini terutama untuk materi hacking, penulis berharap pembaca dapat bijaksana dalam mempelajari atau menerapkannya.",
            "Buku ini berisi teknik-teknik yang diperlukan untuk membuat aplikasi Android menggunakan Flutter, salah salu framework atau Software Development Kit (SDK) untuk pengembangan aplikasi mobile yang dapat berjalan di sistem operasi iOS dan Android. Meskipun Flutter dapat digunakan untuk membuat aplikasi untuk iOS. Namun buku ini hanya membahas tentang penggunaan Flutter untuk Android. Flutter diciptakan oleh Google dan dirilis pertama kall pada Mei 2017 (versi alpha). Pada Desember 2018, Google meluncurkan Flutter 1.0.0 (versi stabil). Flutter menggunakan bahasa pemrograman Dart, yang juga diciptakan oleh Google dan dirilis pertama kali pada Oktober 2013. Flutter merupakan framework baru yang dirancang untuk mempermudah dan mempercepat proses pembuatan aplikasi mobile, yang dulunya harus ditulis menggunakan Objective-C atau Swift (untuk i0S) dan Java atau Kotlin (untuk Android).",
            "Adobe Illustrator merupakan software paling keren untuk pembuatan aneka desain grafis berbasis vector. Di dalam buku ini, Anda akan menemukan tip dan trik seputar cara-cara, rahasia, atau kiat-kiat menggunakan software ini. Pembahasan meliputi: • Mengatur tingkat kehitaman gambar sampai sehitam-hitamnya. • Membuat simulasi warna pada desain untuk para buta warna. • Membuat objek apa pun menjadi tumpul. • Mengedit teks utuh satu huruf demi satu huruf. • Membuat sebuah objek memiliki warna isian beragam dan kita tinggal memilih salah satunya tanpa perlu pewarnaan ulang. • Alur kerja membuat desain dari awal hingga akhir. Buku ini ditujukan bagi para desainer yang ingin memanfaatkan Adobe Illustrator untuk mengoptimalkan hasil desain sehari-hari.",
            "Buku ini bisa menjadi jawaban bagi Anda yang ingin tahu cara kerja dan pengoptimalan CorelDRAW secara menyeluruh. Trik-trik praktis yang dibahas dalam buku ini bisa diaplikasikan ke program CorelDRAW untuk beragam versi. Secara tuntas, buku ini akan mengulas pemahaman trik-trik pilihan, mulai dari pengenalan hingga pengoptimalan kinerja dari beragam fasilitas yang ada di CorelDRAW. Trik-trik untuk memaksimalkan kerja CorelDRAW yang meliputi fasilitas File, Edit, View, Layout, Arrange, Effect, Bitmap dibahas dalam buku ini secara lengkap dan singkat, namun tetap padat dan praktis. Di samping itu, pada buku ini juga dibahas cara membuat objek dengan Rectangle tool, Elipse Tool, dan Shape Tool. Tidak lupa dalam buku ini juga dibahas cara finishing objek, yaitu pewarnaan secara satu warna, gradasi, tekstur, dan lain sebagainya.",
            "Buku ini ditulis bagi Anda yang ingin berkembang ke tingkat trik Photoshop yang lebih mahir. Buku ini akan mengupas fitur Photoshop yang esensial secara mendalam, mulai dari membuat Photoshop bekerja lebih cepat, teknik untuk menyeleksi bagian gambar yang rumit, koreksi tonal dan warna sampai mengolah foto secara digital untuk menghasilkan foto yang indah dan menakjubkan. Buku ini akan memberi penjelasan secara rinci bagaimana Anda menggunakan teknik-teknik tersebut dan dilengkapi dengan contoh dan gambar yang indah. Dengan disertai latihan files yang dapat Anda unduh, buku ini wajib dimiliki siapa saja yang ingin belajar menggunakan Photoshop dengan lebih mahir lagi.",
            "Bagi para pembuat aplikasi mobile, buku ini mencakup pengantar teori Android, dasar-dasar programming, pengantar Android Studio, teknik menyimpan data, coding, proses bisnis, sampai dengan meluncurkan aplikasi ke dalam Play Store. Jangan khawatir, kami juga menyertakan kode program yang bisa diakses kapan saja di Github. Sampai April 2019 ini, StatCounter GlobalStats merilis bahwa Android berjaya menguasai pasar mobile sampai 93.5%. Artinya, akan sangat beruntung para developer aplikasi mobile jika bisa mengguasai dengan mempelajari serius programming di bidang Android ini. Selamat berkarya menyongsong masa depan cerah bersama Android!"
    };


    private static int[] bookImages = {
            R.drawable.aplikasi_google_sketchup,
            R.drawable.belajar_social_media_marketing,
            R.drawable.buku_pintar_web_desain,
            R.drawable.microsoft_excel_untuk_keterampilan_vokasional,
            R.drawable.network_tweaking_dan_hacking,
            R.drawable.pemrograman_android_dengan_flutter,
            R.drawable.tip_dan_trik_adobe_illustrator,
            R.drawable.trik_pilihan_jago_coreldraw,
            R.drawable.trik_pilihan_jago_photoshop,
            R.drawable.yuk_berbisnis_dengan_laravel_dan_android
    };

    private static String[] bookPenerbit = {
            "Elex Media Komputindo",
            "Elex Media Komputindo",
            "Elex Media Komputindo",
            "Elex Media Komputindo",
            "Elex Media Komputindo",
            "Informatika",
            "Elex Media Komputindo",
            "Elex Media Komputindo",
            "Elex Media Komputindo",
            "Elex Media Komputindo"
    };

    private static String[] bookTanggalTerbit = {
            "9 Sep 2019",
            "19 Agt 2019",
            "1 Juli 2019",
            "7 Okt 2019",
            "15 Apr 2019",
            "21 Mei 2019",
            "2 Sep 2019",
            "23 Sep 2019",
            "23 Sep 2019",
            "8 Juli 2019"
    };

    private static int[] bookJumlahHalaman= {
            208,
            192,
            400,
            560,
            216,
            161,
            200,
            160,
            168,
            192
    };

    static ArrayList<Book> getListData(){
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < bookNames.length; position++){
            Book book = new Book();
            book.setName(bookNames[position]);
            book.setDetail(bookDetails[position]);
            book.setPhoto(bookImages[position]);
            book.setPenerbit(bookPenerbit[position]);
            book.setTanggal_terbit(bookTanggalTerbit[position]);
            book.setJumlah_halaman(bookJumlahHalaman[position]);
            list.add(book);
        }
        return list;
    }

}
