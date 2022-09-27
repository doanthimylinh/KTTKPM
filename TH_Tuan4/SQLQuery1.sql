
--1. Cho biết các chuyến bay đi Đà Lạt (DAD).

select * from [dbo].[chuyenbay] where [GaDen]=N'DAD'
--2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.

select loai from [dbo].[maybay] where [TamBay]>10000
--3. Tìm các nhân viên có lương nhỏ hơn 10,000

select * from [dbo].[nhanvien] where [Luong]<10000
--4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km

select * from chuyenbay where dodai < 10000 and dodai > 8000
--5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV)

select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'
--6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).

select count(*) from chuyenbay where GaDi = 'SGN'
--7. Có bao nhiêu loại máy báy Boeing.

select count(*) from [dbo].[maybay] where [Loai] like '%Boeing%'
--8. Cho biết tổng số lương phải trả cho các nhân viên.

select SUM([Luong]) from [dbo].[nhanvien]
--9. Cho biết mã số của các phi công lái máy báy Boeing.
SELECT        nhanvien.MaNV
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
where  Loai like '%Boeing%'
group by nhanvien.MaNV
--10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
SELECT        nhanvien.MaNV, nhanvien.Ten, nhanvien.Luong
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
where chungnhan.MaMB=747
--11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
SELECT        maybay.MaMB
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                        nhanvien ON chungnhan.MaNV = nhanvien.MaNV
where [dbo].[nhanvien].Ten like '%Nguyen%'
group by maybay.MaMB
--12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
SELECT        nhanvien.MaNV
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
where ([Loai] like '%Boeing%' or [Loai] like '%Airbus%')
group by nhanvien.MaNV
--13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.

select Loai from maybay where TamBay < (select DoDai from chuyenbay where MaCB = 'VN280')
--14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320

SELECT * from chuyenbay where DoDai < ( select TamBay from [dbo].[maybay] where Loai =N'Airbus A320')
--5. Cho biết tên của các phi công lái máy bay Boeing.
SELECT        nhanvien.Ten
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
where [Loai] like '%Boeing%'
group by nhanvien.Ten
--16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể
--lái loại máy bay đó.
SELECT        maybay.MaMB, maybay.Loai, count(nhanvien.MaNV) AS SoLuongPhiCong
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
where maybay.MaMB=chungnhan.MaMB
group by maybay.MaMB, maybay.Loai

--17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các
--đường bay nào có thể đáp ứng yêu cầu này.

select * from [dbo].[chuyenbay] where [GaDi] in (select [GaDen] from [dbo].[chuyenbay]) and [GaDen] in (select [GaDi] from [dbo].[chuyenbay])
--18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga 
--đó.
select [GaDi], count(*) as SoChuyenBay from [dbo].[chuyenbay]
group by GaDi

--19. Với mỗi ga có chuyến bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các 
--chuyến bay khởi hành từ ga đó.
select [GaDi], sum(chiPhi) as Tongchiphi from [dbo].[chuyenbay]
group by GaDi


--20. Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00

select * from chuyenbay where [GioDi]<'12:00:00'
--21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
select [GaDi], count(*) as soluong from [dbo].[chuyenbay]where [GioDi]<'12:00:00'
group by [GaDi]
--22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
SELECT        nhanvien.MaNV
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
group by  nhanvien.MaNV
having COUNT(maybay.MaMB)=3

--23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn 
--nhất của các loại máy bay mà phi công đó có thể lái.
SELECT        nhanvien.MaNV, MAX(maybay.TamBay) as TamBayLonNhat
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
group by  nhanvien.MaNV
HAVING COUNT(maybay.MaMB)>3 
--24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
SELECT        nhanvien.MaNV, COUNT(maybay.Loai) as TongLoaiSoMayBay
FROM            chungnhan INNER JOIN
                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV
group by nhanvien.MaNV
--25. Tìm các nhân viên không phải là phi công.
select * from [dbo].[nhanvien]
where MaNV not in (select MaNV from chungnhan)

--26. Cho biết mã số của các nhân viên có lương cao nhất.
select MaNV from [dbo].[nhanvien] where Luong=(select max(Luong) from [dbo].[nhanvien])

--27. Cho biết tổng số lương phải trả cho các phi công.
SELECT       sum(luong) as TongSoLuong
FROM            nhanvien
where MaNV  in (select MaNV from chungnhan)

--28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing

SELECT        MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi
FROM            chuyenbay
group by MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi
having DoDai<= all(select TamBay from [dbo].[maybay] where Loai like '%Boeing%')
