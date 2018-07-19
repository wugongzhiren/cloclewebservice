package com.huxiang.dynamic;

import com.huxiang.bean.Dynamic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Administrator on 2017/2/16.
 */
public interface DynamicRepository extends PagingAndSortingRepository<Dynamic,Long> {
    @Override
    Page<Dynamic> findAll(Pageable pageable);
}
