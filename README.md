# Project2
Phần mềm Java VNExpress Crawler 

Mô tả: Hỗ trợ việc trích xuất nội dung phần lớn các bài báo trên trang báo điện tử VNExpress và lưu trữ tại MongoDB

Yêu cầu của phần mềm:

  -Môi trường làm việc: 
  
    +Java (JDK13)
    
    +MongoDB
    
  -Các thư viện cần cài:
    
    +jsoup_1.13.1: Thư viện hỗ trợ crawl dữ liệu
    
    +mongo-java-driver-3.12.8: Thư viện hỗ trợ kết nối Java và MongoDB

Hướng dẫn cách sử dụng:
  
  -Cài MongoDB và MongoDBCompass nếu chưa có; tạo database Project và collection news trong connection mặc định của MongoDB (mongodb://localhost:27017)
  
  -Clone git về file
  
  -Chỉnh sửa thông tin về url của MongoDB trong class Service
  ![alt text](https://i.imgur.com/vbsipOy.jpg)
  
  -Chạy class LoadingFrame để khởi động phần mềm
