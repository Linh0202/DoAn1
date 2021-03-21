CREATE DATABASE DoAn1;
USE DoAn1;
CREATE TABLE Khoa(
    Makhoa nvarchar(10) NOT NULL PRIMARY KEY,
    Tenkhoa nvarchar(20) NOT NULL,
    Truongkhoa nvarchar(25),
    SoDTkhoa int
);
CREATE TABLE Lop(
    Malop nvarchar(10) NOT NULL PRIMARY KEY,
    Tenlop nvarchar(20),
    FOREIGN KEY (Makhoa) REFERENCES Khoa(Makhoa)
);
CREATE TABLE giangvien(
    MaGV nvarchar(10) NOT NULL PRIMARY KEY,
    FOREIGN KEY (Makhoa) REFERENCES Khoa(Makhoa),
    TenGV nvarchar(20) not null,
    Ngaysinh date,
    Hocvi nvarchar(15),
    Chuyennganh nvarchar(15),
    Gioitinh bit,
    TenTK nvarchar(15) not null,
    Diachi nvarchar(20),
    SoDTGV nvarchar(15),
    Email nvarchar(25)
);
CREATE TABLE sinhvien(
    MaSV nvarchar(10) NOT NULL PRIMARY KEY,
    FOREIGN KEY (Malop) REFERENCES Lop(Malop),
    TenSV nvarchar(20) not null,
    Ngaysinh date,
    Gioitinh bit,
    TenTK nvarchar(15) not null,
    Diachi nvarchar(20),
    SoDTSV nvarchar(15),
    Email nvarchar(25)
);
CREATE TABLE Detai(
    Madetai nvarchar(10) NOT NULL PRIMARY KEY,
    Tendetai nvarchar(20) NOT NULL,
    NguoiHD nvarchar(20),
    ThoigianDK date
);
CREATE TABLE Tiendo(
    MaBC nvarchar(10) NOT NULL PRIMARY KEY,
    ThoigianBC date,
    TDTH nvarchar(20),
    NguoiBC nvarchar(20),
    Ghichu nvarchar(20),
    FOREIGN KEY (Madetai) REFERENCES Detai(Madetai)
);
CREATE TABLE Nghiemthu(
    MaNT nvarchar(10) NOT NULL PRIMARY KEY,
    ThoigianNT date,
    ThoigianBD date,
    ThoigianKT date,
    Kinhphi float,
    Ketluan nvarchar(10),
    FOREIGN KEY (Madetai) REFERENCES Detai(Madetai)
);
CREATE TABLE Phanquyen(
    Maquyen nvarchar(10) NOT NULL PRIMARY KEY
);
CREATE TABLE User(
    TenUser nvarchar(10) NOT NULL PRIMARY KEY,
    Matkhau nvarchar(10),
    FOREIGN KEY (Maquyen) REFERENCES Phanquyen(Maquyen)
);