package com.example.fitfinessee.RecipePage.data;

import com.example.fitfinessee.R;
import com.example.fitfinessee.RecipePage.data.model.Category;
import com.example.fitfinessee.RecipePage.data.model.Ingredient;
import com.example.fitfinessee.RecipePage.data.model.Recipe;

import java.util.Arrays;
import java.util.List;

public class DummyDataUtil {
    public static List<Category> generateDummyCategories() {
        return Arrays.asList(
            new Category(1, "Aneka Karbo", R.drawable.rsm2),
            new Category(2, "Protein", R.drawable.rsm3),
            new Category(3, "Minuman", R.drawable.rsm4),
            new Category(4, "Sayuran", R.drawable.rsm5),
            new Category(5, "Cemilan", R.drawable.rsm6),
            new Category(6, "Pencuci Mulut", R.drawable.rsm7)
        );
    }

    public static List<Recipe> generateDummyRecipes() {
        return Arrays.asList(
                new Recipe(
                        1,
                        4,
                        "Capcay Kuah Kental",
                        "https://www.masakapahariini.com/wp-content/uploads/2019/10/shutterstock_343043879-500x300.jpg",
                        "Lagi cari masakan sehari-hari enak dan kaya serat? Yuk, coba resep capcay kuah kental rumahan ini! Sejatinya capcay merupakan hidangan sayuran tumis yang berisi sepuluh atau lebih variasi bahan. Namun kini tumis sayuran khas dapur Cina ini sering diolah dengan jumlah variasi bahan masakan yang tersedia.",
                        Arrays.asList(
                                new Ingredient("Udang Kupas", "https://images.tokopedia.net/img/cache/700/VqbcmM/2022/9/20/3c3cd3ee-202d-4019-b506-7ecc43bd5235.jpg", "200 gram"),
                                new Ingredient("Kembang Kol", "https://asset.kompas.com/crops/NbFzrsGTbVrIfY4LmJa-lZpvzYE=/0x0:1263x842/1200x800/data/photo/2021/11/08/6188f5997f4e0.jpg", "100 gram"),
                                new Ingredient("Brokoli", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//110/MTA-78508288/local_brokoli_hijau_kol_hijau_500_gram_sayuran_segar_full11_kdbl2tcj.jpg", "50 gram"),
                                new Ingredient("Sawi Hijau", "https://i0.wp.com/umsu.ac.id/berita/wp-content/uploads/2024/04/10-manfaat-luar-biasa-sawi-hijau-untuk-kesehatan-tubuh.webp?fit=800%2C533&ssl=1", "100 gram")
                        ),
                        Arrays.asList(
                                "Panaskan minyak, tumis bawang bombay dan bawang putih hingga harum.",
                                "Masukkan wortel, kembang kol, dan brokoli, tumis hingga layu.",
                                "Tambahkan Royco Saus Tiram, Royco Kaldu Ayam,  Bango Kecap Manis, dan merica, aduk.",
                                "Masukkan udang, aduk rata. Tuang air, masak hingga mendidih.",
                                "Masukkan sawi dan kacang kapri, aduk hingga layu.",
                                "Tuang larutan maizena, aduk hingga mengental. Tambahkan telur, aduk perlahan hingga menyerupai serabut. Angkat dan sajikan."
                        )
                ),
                new Recipe(
                        2,
                        4,
                        "Tumis Buncis Telur",
                        "https://www.masakapahariini.com/wp-content/uploads/2018/09/tumis-buncis-telur-MAHI-6-250x150.jpg",
                        "Tumis buncis telur, sajian mudah dan lezat yang cocok dinikmati dari sarapan hingga makan malam. Itulah sebabnya wajib untuk bisa resep yang satu ini. Yuk, ikuti cara membuatnya berikut ini!",
                        Arrays.asList(
                                new Ingredient("Buncis", "https://res.cloudinary.com/dk0z4ums3/image/upload/v1645002933/attached_image/manfaat-buncis-ternyata-lebih-kaya-daripada-sayuran-kacang-sejenis.jpg", "250 gram"),
                                new Ingredient("Telur Ayam", "https://asset.kompas.com/crops/KWgxkOjXdDkhVPZzvc88GjJRXmI=/0x7:740x500/1200x800/data/photo/2020/11/13/5fae4aae98da3.jpg", "2 butir"),
                                new Ingredient("Bawang Merah", "https://cdn.rri.co.id/berita/98/images/1706207334354-e/smzma31xy2ckbvw.png", "3 butir"),
                                new Ingredient("Bawang Putih", "https://www.yesdok.com/visual/slideshow/screen%20shot%202022-01-16%20at%208.34.32%20am-article-1642296895.png?w=1200", "2 siung"),
                                new Ingredient("Cabai Merah Besar", "https://storage.boksay.id/products/KpN1LrwzVMcMfWESNIDmllqrSN6jLY87IIX6SesS.jpeg", "3 buah")
                        ),
                        Arrays.asList(
                                "Tumis bawang merah, bawang putih, dan cabai merah besar sampai harum.",
                                "Masukkan telur, masak orak arik. Tambahkan buncis, air dan tumis hingga setengah layu.",
                                "Tuangkan Bango Kecap Manis Light, Royco Kaldu Ayam, dan merica. Aduk rata.",
                                "Setelah matang, angkat dan sajikan."
                        )
                ),
                new Recipe(
                        3,
                        1,
                        "Mie Goreng Jawa Spesial",
                        "https://www.masakapahariini.com/wp-content/uploads/2024/05/Mie-Goreng-Jawa-500x300.jpeg",
                        "Resep mie goreng Jawa spesial yang mudah dibuat. Cocok disajikan untuk hidangan kalau kamu sedang sibuk atau lagi malas berlama-lama di dapur.",
                        Arrays.asList(
                                new Ingredient("Mie Telur", "https://filmapro.co.id/0_repository/images/20160404122111Mie_Kering.jpg", "2 buah"),
                                new Ingredient("Bawang Putih", "https://www.yesdok.com/visual/slideshow/screen%20shot%202022-01-16%20at%208.34.32%20am-article-1642296895.png?w=1200", "2 siung"),
                                new Ingredient("Telur Ayam", "https://asset.kompas.com/crops/KWgxkOjXdDkhVPZzvc88GjJRXmI=/0x7:740x500/1200x800/data/photo/2020/11/13/5fae4aae98da3.jpg", "2 butir"),
                                new Ingredient("Sawi Hijau", "https://i0.wp.com/umsu.ac.id/berita/wp-content/uploads/2024/04/10-manfaat-luar-biasa-sawi-hijau-untuk-kesehatan-tubuh.webp?fit=800%2C533&ssl=1", "100 gram")
                        ),
                        Arrays.asList(
                                "Rebus mie hingga matang lalu tiriskan. Tambahkan 1 sendok makan minyak sayur dan aduk rata.",
                                "Tumis bahan-bahan bumbu halus hingga harum dan matang matang. Kemudian masukkan bakso serta udang dan tumis hingga berubah warna. Terakhir tambahkan telur.",
                                "Setelah telur matang, masukkan sayuran, Royco Kaldu Sapi, garam, dan gula.",
                                "Terakhir masukkan mie dan tambahkan Bango Kecap Manis Pedas Gurih. Aduk hingga bumbu merata dengan mie.",
                                "Sajikan selagi hangat bersama kerupuk dan teh hangat."
                        )
                ),
                new Recipe(
                        4,
                        2,
                        "Tumis Tahu Daging Cincang",
                        "https://www.masakapahariini.com/wp-content/uploads/2019/07/tumis-tahu-daging-cincang-500x300.jpg",
                        "Resep tumis tahu daging cincang ini akan melengkapi seluruh sajian makan bersama keluarga. Kaya protein dan cara membuatnya juga sangat praktis. Yuk, cobain resepnya!",
                        Arrays.asList(
                                new Ingredient("Daging Sapi Cincang", "https://asset.kompas.com/crops/loXNzgMXFEX_3avDpy_53_3rXsU=/1x0:1000x666/750x500/data/photo/2021/07/14/60ee601a87545.jpg", "100 gram"),
                                new Ingredient("Tahu Putih", "https://mlijoy.com/data/images/product/IMG50877.jpg", "500 gram"),
                                new Ingredient("Bawang Putih", "https://www.yesdok.com/visual/slideshow/screen%20shot%202022-01-16%20at%208.34.32%20am-article-1642296895.png?w=1200", "4 siung"),
                                new Ingredient("Cabai Merah Besar", "https://storage.boksay.id/products/KpN1LrwzVMcMfWESNIDmllqrSN6jLY87IIX6SesS.jpeg", "2 buah")
                        ),
                        Arrays.asList(
                                "Tumis bawang putih, bawang bombay, dan jahe hingga harum di atas api sedang.",
                                "Tumis cabai sejenak. Masukkan daging dan masak hingga berubah warna dan air surut.",
                                "Masukkan tahu, bubuhkan Royco Kaldu Sapi, dan campuran bumbu lainnya. Masak hingga matang dan meresap.",
                                "Sajikan"
                        )
                ),
                new Recipe(
                        5,
                        3,
                        "Es Teh Kampul Khas Solo",
                        "https://www.masakapahariini.com/wp-content/uploads/2023/01/es-teh-kampul-khas-solo-dinikmati-250x150.jpg",
                        "Siapkan minuman enak ini saat butuh yang segar-segar atau waktunya kumpul keluarga. Coba resep es teh kampul khas Solo, yuk!",
                        Arrays.asList(
                                new Ingredient("SariWangi Teh Asli", "https://images.tokopedia.net/img/cache/700/VqbcmM/2021/1/16/232c77a4-ee1c-4256-ae64-8f085c08c065.jpg", "2 kantung"),
                                new Ingredient("Gula Pasir", "https://filmapro.co.id/0_repository/images/20140516190946gulapasir.jpg", "2 sendok makan"),
                                new Ingredient("Madu", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQA2Xkk13O0iaE-Y-yPtkU34oMUd7cKq1H9Fw&s", "2 sendok makan"),
                                new Ingredient("Jeruk Peras", "https://yubissayur.com/wp-content/uploads/2020/08/jeruk-peras.jpg", "4 buah")
                        ),
                        Arrays.asList(
                                "Seduh SariWangi Teh Asli bersama air panas selama 3-5 menit. Keluarkan kantung teh, sisihkan.",
                                "Aduk rata teh bersama gula pasir hingga larut. Tambahkan madu, aduk. Sisihkan.",
                                "Ambil 4 buah jeruk peras, ambil Tuang air perasan jeruk ke dalam campuran teh. Sisihkan.",
                                "Iris sisa jeruk peras. Masukkan ke dalam gelas saji yang sudah diisi dengan es batu.",
                                "Tuang campuran teh dan air jeruk peras ke dalam gelas. Sajikan."
                        )
                ),
                new Recipe(
                        6,
                        5,
                        "Crab Rangoon",
                        "https://www.masakapahariini.com/wp-content/uploads/2022/06/resep-crab-rangoon-500x300.jpg",
                        "Camilan klasik yang sedang viral ini punya isian yang bikin ngiler. Kalau kamu belum kenal dengan resep Crab Rangoon, wajib untuk coba hari ini!",
                        Arrays.asList(
                                new Ingredient("Cream Cheese", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.delish.com%2Fcooking%2Fa45210469%2Fbest-cream-cheese-frosting-recipe%2F&psig=AOvVaw0uRInK8K9d3UggHwSr1wqx&ust=1717156386077000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNCU3ZaotYYDFQAAAAAdAAAAABAE", "100 gram"),
                                new Ingredient("Daun Bawang", "https://ovegi.co.id/wp-content/uploads/2020/09/daun-bawang.jpg", "1 batang"),
                                new Ingredient("Kulit Pangsit", "https://static.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/p1/364/2023/08/28/resep-kulit-pangsit-super-lentur-anti-sobek-bisa-digoreng-atau-rebus-3650353084.png", "10 lembar"),
                                new Ingredient("Surimi", "https://rmol.id/images/berita/normal/2018/01/233442_10442318012018_industri-surimi-(ikan-olahan).jpg", "100 gram")
                        ),
                        Arrays.asList(
                                "Aduk rata cream cheese, Royco Kaldu Ayam, garam, gula, dan merica. Tambahkan surimi dan daun bawang, aduk rata.",
                                "Ambil selembar kulit pangsit, olesi bagian pinggirnya dengan telur kocok. Letakkan campuran surimi ke bagian tengahnya. Lipat setiap bagian ujungnya ke arah bagian tengah kulit pangsit sehingga membentuk piramida. Ulangi proses serupa pada sisa bahan hingga habis.",
                                "Panaskan minyak, goreng Crab Rangoon hingga matang dan kecokelatan. Angkat.",
                                "Sajikan dengan Jawara Saus Sambal Extra Hot."
                        )
                ),
                new Recipe(
                        7,
                        6,
                        "Mille Crepes Cake Mangga",
                        "https://www.masakapahariini.com/wp-content/uploads/2023/06/mango-mille-crepes-cake-500x300.jpeg",
                        "Yuk, coba bikin mille crepes cake mangga di rumah! Jangan lupa lengkapi dulu peralatan membuatnya supaya hasilnya lebih rapi dan cantik.",
                        Arrays.asList(
                                new Ingredient("Telur Ayam", "https://asset.kompas.com/crops/KWgxkOjXdDkhVPZzvc88GjJRXmI=/0x7:740x500/1200x800/data/photo/2020/11/13/5fae4aae98da3.jpg", "4 butir"),
                                new Ingredient("Buavita Mango", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//92/MTA-13119491/buavita_buavita-mango-250-ml-_full01.jpg", "200 ml"),
                                new Ingredient("Tepung Terigu", "https://cdn1-production-images-kly.akamaized.net/HJV1GQWIoFnVm_Wdgkl7RYbExjs=/91x0:758x667/1200x1200/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/4048511/original/024182700_1654835595-shutterstock_679619884.jpg", "200 gram"),
                                new Ingredient("Mentega Tawar", "https://res.cloudinary.com/dk0z4ums3/image/upload/v1643714477/attached_image/waspadai-bahaya-mentega-karena-mengandung-lemak-jenuh.jpg", "100 gram"),
                                new Ingredient("Cream Cheese", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.delish.com%2Fcooking%2Fa45210469%2Fbest-cream-cheese-frosting-recipe%2F&psig=AOvVaw0uRInK8K9d3UggHwSr1wqx&ust=1717156386077000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNCU3ZaotYYDFQAAAAAdAAAAABAE", "100 gram")
                        ),
                        Arrays.asList(
                                "Adonan crepes: Kocok telur dan ekstrak vanilla dalam mangkuk besar. Sisihkan.",
                                "Masukkan tepung terigu ke dalam mangkuk sambil diayak. Tuang Buavita Mango, aduk rata menggunakan whisk. Tambahkan susu cair dan mentega cair, aduk kembali hingga rata. Saring adonan agar hasil crepes mulus. Tutup mangkuk dengan plastic wrap. Diamkan adonan selama 1 jam dalam kulkas. Sisihkan.",
                                "Pure mangga: Haluskan daging buah mangga bersama Buavita Mango. Sisihkan.",
                                "Mango cream: Kocok mentega tawar menggunakan mixer hingga halus. Masukkan gula halus, aduk menggunakan spatula hingga rata. Tambahkan whipped cream, kocok sebentar, tambahkan cream cheese, dan ekstrak vanilla, kocok rata. Tambahkan pure mangga, Kocok sebentar hingga rata. Sisihkan dalam kulkas.",
                                "Panaskan wajan datar diameter 18 cm atau 20 cm di atas api kecil. Tuang 60 ml adonan atau 1 sendok sayur adonan crepes ke atas wajan, ratakan. Masak hingga matang di kedua sisinya. Angkat. Letakkan di atas baking paper. Ulangi proses serupa hingga adonan crepes habis.",
                                "Siapkan meja putar, spatula besi, kantung plastik segitigan dan spuit bintang.",
                                "Ambil selembar crepes, olesi dengan mango cream dan ratakan menggunakan spatula. Ulangi proses serupa hingga didapat 5 atau 6 lapisan.",
                                "Letakkan separuh bagian potongan buah mangga ke atasnya. Tambahkan mango cream kemudian ratakan kembali.",
                                "Ulangi melapisi lembaran crepes hingga didapat 5 atau 6 lapisan. Kemudian ulangi dengan sisa potongan mangga dan mango cream. Tutup kembali dengan lapisan crepes yang tersisa.",
                                "Olesi sisa mango cream untuk menutup lapisan crepes. Gunakan spatula besi khusus dekorasi cake untuk merapikan.",
                                "Dinginkan mille crepes cake dalam kulkas hingga sedikit padat atau mengeras. Potong-potong dan sajikan."
                        )
                )
        );
    }

    public static Recipe getRecipeById(int recipeId) {
        return generateDummyRecipes().stream()
                .filter(recipe -> recipe.getId() == recipeId)
                .findFirst()
                .orElse(null);
    }
}