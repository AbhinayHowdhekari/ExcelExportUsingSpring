package in.ExcelExport.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ExcelExport.entity.ExcelEntity;

public interface ExcelRepository extends JpaRepository<ExcelEntity, Integer> {

}
