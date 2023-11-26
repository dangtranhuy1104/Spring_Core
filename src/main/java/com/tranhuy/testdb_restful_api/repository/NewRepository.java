package com.tranhuy.testdb_restful_api.repository;

import com.tranhuy.testdb_restful_api.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository<NewEntity, Long>{

    // Trong ngoặc tham số đầu tiên là bảng data muốn thao tác
    // Tham số thứ 2 là kiểu dữ liệu của khóa chính

    

}
