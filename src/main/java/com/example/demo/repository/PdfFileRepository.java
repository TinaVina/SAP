package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.PdfFile;


@Repository("pdfFileRepository")
public interface PdfFileRepository extends JpaRepository<PdfFile, Long> {
	List<PdfFile> findAll();
	  PdfFile findByFilename(String filename);
	

}


