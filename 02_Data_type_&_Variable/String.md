## String là gì?
Nói chung, `String` là một chuỗi các ký tự. Nhưng trong Java, `String` là một đối tượng đại diện cho một chuỗi ký tự.
Nằm trong package `java.lang`, class `String` được sử dụng để tạo đối tượng String.

## Tạo đối tượng String
Có 2 cách để tạo đối tượng `String` đó là:
- String literal
- Sử dụng từ khóa new

### 1. String literal

String literal được tạo bằng cách sử dụng dấu nháy kép:
```java
String name = "Cô giáo Ngọc";
```

Các đối tượng String được lưu trữ trong một khu vực bộ nhớ đặc biệt được gọi là String Contant Pool
Sử dụng String literal giúp cho việc sử dụng bộ nhớ hiệu quả hơn vì nếu chuỗi đã tồn tại trong Pool thì sẽ không có đối tượng mới được tạo ra

### 2. Sử dụng từ khóa new

```java
String name = new String("Cô giáo Ngọc");
```

Trong trường hợp này, JVM sẽ tạo một đối tượng mới như bình thường trong bộ nhớ Heap (không phải Pool) và hằng `Cô giáo Ngọc` sẽ được đặt trong Pool. Biến sẽ tham chiếu tới đối tượng trong Heap (không phải Pool)

## Lớp String trong Java
Lớp `String` nằm trong package `java.lang` cung cấp rất nhiều phương thức để xử lý chuỗi. Các phương thức này giúp chúng ta thực hiện nhiều thao tác như cắt, ghép, chuyển đổi, so sánh, thay thế các chuỗi,...
Một số phương thức thường hay sử dụng có thể kể đến như:
| Phương thức | Mô tả |
| --- | --- |
| `toUpperCase()` | Chuyển đổi chuỗi thành chữ hoa |
| `toLowerCase()` | Chuyển đổi chuỗi thành chữ thường |
| `trim()` | Xóa khoảng trắng ở đầu và cuối chuỗi |
| `length()` | Trả về độ dài của chuỗi |
| `equals()` | So sánh nội dung 2 chuỗi |
| `equalsIgnoreCase()` | So sánh nôi dung 2 chuỗi nhưng không phân biệt chữ hoa, thường |
| `charAt()` | Lấy một ký tự tại vị trí index được chỉ định |
| `indexOf()` | Trả về index của ký tự được chỉ định xuất hiện đầu tiên |
| `substring()`| Trả về đối tượng chuỗi mới là chuỗi con của chuỗi đã cho tính từ startIndex đã nhập đến cuối cùng hoặc đến endIndex |