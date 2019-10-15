# [BOOTCAMP-JAVA] Web Back-end Development

##Ngôn ngữ lập trình Java

## [**Bài tập] Hiển thị 20 số nguyên tố đầu tiên
```
### Mô tả
Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép hiển thị 20 số nguyên tố đầu tiên.

### Gợi ý các bước thực hiện
* Bước 1: Khai báo biến số nguyên numbers và nhập cho nó một giá trị từ bàn phím để lưu số lượng số nguyên tố cần in ra.

* Bước 2: Khai báo biến count và gán cho nó giá trị 0, biến này để đếm xem số lượng lượng số nguyên tố cần in ra đã bằng numbers hay chưa.

* Bước 3: Khai báo biến N và gán cho giá trị 2, biến này để kiểm tra xem các giá trị nó nhận được có phải là số nguyên tố không, mỗi lần lặp giá trị của biến sẽ được tăng lên 1.

* Bước 4: Trong khi count < numbers thì:

Kiểm tra xem N có phải là số nguyên tố không. Nếu N là số nguyên tố thì in ra giá trị của N và tăng giá trị của count lên 1
Giá trị của N tăng lên 1 để kiểm tra số tiếp theo
```
## [**Bài tập] Giải thích code
##### File: HienThi20SoNguyenToDauTien.java
```
### Line 9 : Scanner scanner = new Scanner(System.in);
Cho phép nhập một giá trị từ bàn 

### Line 10 ~ 14 : while (input != 0) {...}
Trong khi nhập giá trị khác 0 thì thực hiện câu lệnh ... trong khối lệnh while {...}

### Line 11 : input = scanner.nextInt();
Lấy giá trị từ input và chuyển sang kiểu int

```
### Giới thiệu về module WBD

* [Đề cương module Web Back-end Development](https://james.codegym.vn/pluginfile.php/15152/mod_resource/content/4/%5BBC%20JAVA%5D%20WBD%20Syllabus%2020190529.pdf)
* [Slides](https://james.codegym.vn/mod/folder/view.php?id=3427)
* [Cài đặt môi trường](https://james.codegym.vn/mod/page/view.php?id=2306)
* [Quy ước viết mã trong Java](https://james.codegym.vn/mod/page/view.php?id=2851)

## Giới thiệu tác giả - link git

* **PHAN HỮU TÀI ĐỨC** - *codegymdanang* - [CGDN-Java-BTJame](https://github.com/codegymdanang/CGDN-Java-BTJame.git)

## Mục tiêu bài tập

* Luyện tập sử dụng cấu trúc lặp for/while.
## URL bài tập

* [https://james.codegym.vn/mod/assign/view.php?id=2758](https://james.codegym.vn/mod/assign/view.php?id=2758)
