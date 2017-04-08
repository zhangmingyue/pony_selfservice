package com.pony_self_service.dao;

import com.pony_self_service.domain.RefundEntry;

import java.util.List;

/**
 * @author: qiaoyi
 * @edit:
 * @created:17/3/20
 */
public interface RefundDAO {

    List<RefundEntry> getAllRefund();
}
