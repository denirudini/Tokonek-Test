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

## ▶️ Cara Menjalankan Tes

1. Pastikan sudah terinstall Java dan Maven.
2. Jalankan perintah berikut di root project:

   ```sh
   mvn clean test
   ```

3. Hasil laporan dapat dilihat di:
   - `target/ExtentReport.html`
   - `target/surefire-reports/`

## ⚙️ Konfigurasi

- Konfigurasi test suite ada di [`src/test/resources/testng.xml`](src/test/resources/testng.xml).
- Konfigurasi ExtentReport di [`src/test/resources/extent.properties`](src/test/resources/extent.properties).

## 🧪 Struktur Test

- Test login: [`AuthenticationTest`](src/test/java/com/tokonek/AuthenticationTest.java)
- Test organisasi: [`OrganizationsTest`](src/test/java/com/tokonek/organization/OrganizationsTest.java), [`AddOrganizationsTest`](src/test/java/com/tokonek/organization/AddOrganizationsTest.java), [`ChoseOrganizationsTest`](src/test/java/com/tokonek/organization/ChoseOrganizationsTest.java)
- Test kategori & inventori: [`CategoryTest`](src/test/java/com/tokonek/dashboard/CategoryTest.java), [`inventoryTest`](src/test/java/com/tokonek/dashboard/inventoryTest.java)

## 👤 Author

- QA Engineer: Deni Rudini

---

Untuk pertanyaan lebih lanjut, silakan kontak
