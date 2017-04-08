package com.pony_self_service.service.Impl;

import com.pony_self_service.dao.RefundDAO;
import com.pony_self_service.domain.RefundEntry;
import com.pony_self_service.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: qiaoyi
 * @edit:
 * @created:17/3/20
 */
@Service
public class RefundServiceImpl implements RefundService {
    @Autowired
    private RefundDAO refundDAO;

    @Override
    public List<RefundEntry> getAllRefund() {
        return refundDAO.getAllRefund();
    }
}
