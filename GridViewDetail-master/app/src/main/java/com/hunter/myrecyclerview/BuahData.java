package com.hunter.myrecyclerview;

import java.util.ArrayList;

public class BuahData {
    public static String[][] data = new String[][]{
            {"Pisang", "Musa paradisiaca", "https://www.tipsdoktercantik.com/wp-content/uploads/2017/04/manfaat-buah-pisang-bagi-kesehatan.jpg", "Pisang adalah nama umum yang diberikan pada tumbuhan terna raksasa berdaun besar memanjang dari suku Musaceae. Beberapa jenisnya menghasilkan buah konsumsi yang dinamakan sama. Buah ini tersusun dalam tandan dengan kelompok-kelompok tersusun menjari yang disebut sisir.", "Musa paradisiaca", "Mempercantik kulit, mengatasi anemia, memperkuat tulang, mangatasi sembelit"},

            {"Apel","Malus sylvestris", "https://storage.googleapis.com/manfaat/2014/08/manfaat-apel.jpg", "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.", "Malus sylvestris","Mencegah kanker, melawan asma, turunkan resiko diabetes"},

            {"Jambu Batu","Psidium guajava", "https://storage.googleapis.com/manfaat/2014/08/manfaat-jambu-biji.jpg", "Jambu batu (Psidium guajava) atau sering juga disebut jambu biji, jambu siki dan jambu klutuk adalah tanaman tropis yang berasal dari Brasil, disebarkan ke Indonesia melalui Thailand. Jambu batu memiliki buah yang berwarna hijau dengan daging buah berwarna putih atau merah dan berasa asam-manis. Buah jambu batu dikenal mengandung banyak vitamin C.", "Psidium guajava", "Mencegah kanker, menurunkan hipertensi, batuk dan flu, mengobati diare"},

            {"Salak", "Salacca edulis", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Salak200507.jpg/800px-Salak200507.jpg", "Salak adalah sejenis palma dengan buah yang biasa dimakan. Ia dikenal juga sebagai sala (Min., Mak., Bug.,[1] dan Thai). Dalam bahasa Inggris disebut salak atau snake fruit, sementara nama ilmiahnya adalah Salacca zalacca. Buah ini disebut snake fruit karena kulitnya mirip dengan sisik ular.", "Salacca edulis","Menjaga kesehatan mata, meningkatkan ingatan otak, bagus untuk usus"},

            {"Alpukat","Persea americana", "https://cdn2.tstatic.net/wow/foto/bank/images/alpukat_20180511_172506.jpg", "Avokad (Persea americana) ialah tumbuhan penghasil buah meja dengan nama sama. Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah sebagai tanaman perkebunan monokultur dan sebagai tanaman pekarangan di daerah-daerah tropika lainnya di dunia.", "Persea americana","Menurunkan kolestrol, mengatasi kanker, detoks tubuh"},

            {"Nanas","Ananas comocus", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Pineapple1.JPG/450px-Pineapple1.JPG", "Nanas, nenas, atau ananas (Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae). Perawakan (habitus) tumbuhannya rendah, herba (menahun) dengan 30 atau lebih daun yang panjang, berujung tajam, tersusun dalam bentuk roset mengelilingi batang yang tebal.", "Ananas comocus","Melawan radikal bebas, menjaga kesehatan jantung, mengontrol diabetes"},

            {"Kurma","Phoenix dactylifera", "https://cdn2.tstatic.net/jambi/foto/bank/images/15032017-kurma_20170315_000319.jpg", "Kurma, (Arab: تمر\u200E, Tamr; nama latin Phoenix dactylifera) adalah tanaman palma (Arecaceae) dalam genus Phoenix, buahnya dapat dimakan. Walaupun tempat asalnya tidak diketahui karena telah sejak lama dibudidayakan, kemungkinan tanaman ini berasal dari tanah sekitar Teluk Persia.", "Phoenix dactylifera","Membantu meringankan sembelit, membantu meringankan anemia, cegah penyakit jantung"},

            {"Ceri","Prunus apetala", "https://www.faunadanflora.com/wp-content/uploads/2016/09/Ceri-atau-Cherry.jpg", "Buah cherry (ceri) merupakan bagian dari famili Rosaceae yang juga mencakup buah persik, plum, dan nektarin. Buah mungil berwarna merah menggoda ini sudah dinikmati sebagai salah satu sajian sehat sejak zaman bangsa Romawi kuno dulu.", "Prunus apetala","Pengeluaran racun, mengatasi asam urat, merawat kulit"},

            {"Anggur","Vitis vinivera", "https://ecs7.tokopedia.net/img/cache/700/product-1/2016/4/13/18095673/18095673_e861f8c7-282b-42c6-9a52-136c1073ab27.jpg", "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae.[1] Buah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung.[1] Buah ini juga dikenal karena mengandung banyak senyawa polifenol dan resveratol yang berperan aktif dalam berbagai metabolisme tubuh, serta mampu mencegah terbentuknya sel kanker dan berbagai penyakit lainnya.", "Vitis vinivera","Menjaga kesehatan jantung, mengatasi tekanan darah tinggi, menjaga kesehatan otak"},

            {"Strwaberry","Fragaria daltoniana", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Strawberry_BNC.jpg/800px-Strawberry_BNC.jpg", "troberi atau tepatnya stroberi kebun (juga dikenal dengan nama arbei, dari bahasa Belanda aardbei) adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria (stroberi), buah ini berada dalam keluarga Rosaceae.", "Fragaria daltoniana","Meningkatkan sistem imun, mengurangi kolestrol, baik untuk mata"}
    };
    public static ArrayList<Buah> getListData(){
        Buah buah = null;
        ArrayList<Buah> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            buah = new Buah();
            buah.setName(data[i][0]);
            buah.setRemarks(data[i][1]);
            buah.setPhoto(data[i][2]);
            buah.setDeskripsi(data[i][3]);
            buah.setLatin(data[i][4]);
            buah.setManfaat(data[i][5]);

            list.add(buah);
        }

        return list;
    }

}
