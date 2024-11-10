package com.senderThread.sender.repository;

import com.senderThread.sender.domain.LocalPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalPackageRepository extends JpaRepository<LocalPackage,Long> {
}
