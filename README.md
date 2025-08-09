# 🚀 ToKonek Automated Testing

Project ini merupakan suite otomatisasi pengujian berbasis Selenium dan TestNG untuk aplikasi web dashboard Tokonek.

## 📁 Struktur Project

- `src/main/java/`  
  Berisi kode utama (Page Object, utilitas).
- `src/test/java/`  
  Berisi kode test case (TestNG).
- `src/test/resources/`  
  Berisi konfigurasi seperti `testng.xml`.
- `target/`  
  Berisi hasil build, report, dan screenshot.

## 🛠️ Teknologi

- **Selenium WebDriver**: Automasi browser.
- **TestNG**: Framework pengujian.
- **ExtentReports**: Laporan hasil tes otomatis.
- **Maven**: Manajemen dependensi dan build.

## 📦 Instalasi

1. Clone repository ini:
   ```sh
   git clone https://github.com/username/tokonek-automation.git
   cd tokonek-automation
   ```
2. Pastikan sudah terinstall **Java (JDK 8+)** dan **Maven**.
3. Install dependency:
   ```sh
   mvn clean install
   ```

## ▶️ Cara Menjalankan Tes

1. Jalankan perintah berikut di root project:
   ```sh
   mvn test
   ```
2. Hasil laporan dapat dilihat di:
   - `target/ExtentReport.html`
   - `target/surefire-reports/`

## ⚙️ Konfigurasi

- Konfigurasi test suite: [`src/test/resources/testng.xml`](src/test/resources/testng.xml)
- Konfigurasi ExtentReport: [`src/test/resources/extent.properties`](src/test/resources/extent.properties)
- Konfigurasi browser dan environment dapat diubah pada file properties di folder resources.

## 🧪 Struktur Test

- **Login Test**: [`AuthenticationTest`](src/test/java/com/tokonek/AuthenticationTest.java)
- **Organisasi**: [`OrganizationsTest`](src/test/java/com/tokonek/organization/OrganizationsTest.java), [`AddOrganizationsTest`](src/test/java/com/tokonek/organization/AddOrganizationsTest.java), [`ChoseOrganizationsTest`](src/test/java/com/tokonek/organization/ChoseOrganizationsTest.java)
- **Kategori & Inventori**: [`CategoryTest`](src/test/java/com/tokonek/dashboard/CategoryTest.java), [`ProductTest`](src/test/java/com/tokonek/dashboard/ProductTest.java)

## 📊 Reporting

- Setelah tes selesai, laporan otomatis akan dibuat di `target/ExtentReport.html` dengan detail hasil pengujian, screenshot, dan log.

## 🧑‍💻 Kontribusi

Kontribusi sangat terbuka!  
Silakan buat pull request atau buka issue untuk diskusi fitur/bug.

1. Fork repo ini
2. Buat branch fitur/bugfix
3. Commit perubahan
4. Buat pull request

## ❓ FAQ

- **Bagaimana menambah test baru?**  
  Tambahkan file test di `src/test/java` dan daftarkan di `testng.xml`.
- **Bagaimana mengganti browser?**  
  Ubah konfigurasi di file properties atau pada inisialisasi WebDriver.

## 👤 Author

- QA Engineer: Deni Rudini

## 📬 Kontak

Untuk pertanyaan lebih lanjut, silakan kontak tim QA melalui email: **Denirudini99@gmail.com* 💬

---
