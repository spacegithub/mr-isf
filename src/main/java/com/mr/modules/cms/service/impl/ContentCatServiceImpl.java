package com.mr.modules.cms.service.impl;

import com.mr.common.base.service.impl.BaseServiceImpl;
import com.mr.modules.cms.mapper.ContentCatMapper;
import com.mr.modules.cms.model.ContentCat;
import com.mr.modules.cms.service.ContentCatService;
import com.mr.modules.sys.vo.TreeNode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cuiP
 * Created by mr on 2017/4/19.
 */
@Transactional
@Service
public class ContentCatServiceImpl extends BaseServiceImpl<ContentCat> implements ContentCatService {

    @Resource
    private ContentCatMapper contentCatMapper;

    @Transactional(readOnly = true)
    @Override
    public List<ContentCat> findListNewsCat() {
        ContentCat contentCat = new ContentCat();
        contentCat.setParentName("新闻中心");
        return super.findListByWhere(contentCat);
    }

    @Transactional(readOnly=true)
    @Override
    public List<TreeNode> findTreeList() {
        return contentCatMapper.findTreeList();
    }
}
