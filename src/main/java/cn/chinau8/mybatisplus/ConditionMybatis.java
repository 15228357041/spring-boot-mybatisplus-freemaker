package cn.chinau8.mybatisplus;

/**
 * @Author:zxf
 * @Description
 * @Date: 2020/01/17 9:54
 */
/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR EntityWrapperS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.toolkit.StringUtils;

/**
 * <p>
 * 条件查询构造器
 * </p>
 *
 * @author hubin Caratacus
 * @date 2016-11-7
 */
@SuppressWarnings({ "rawtypes", "serial" })
public class ConditionMybatis<T> extends Wrapper {

    /**
     * 构建一个Empty条件构造 避免传递参数使用null
     */
    public static ConditionMybatis Empty() {
        return ConditionMybatis.instance();
    }

    /**
     * 获取实例
     */
    public static ConditionMybatis instance() {
        return new ConditionMybatis();
    }

    /**
     * SQL 片段
     */
    @Override
    public String getSqlSegment() {
		/*
		 * 无条件
		 */
        String sqlWhere = sql.toString();
        if (StringUtils.isEmpty(sqlWhere)) {
            return null;
        }

        return sqlWhere;
    }

    /**
     * <p>
     * 等同于SQL的"field=value"表达式
     * </p>
     *
     * @param column
     * @param params
     * @return
     */
    @Override
    public Wrapper<T> eq(String column, Object params) {
        if (params != null){
            sql.WHERE(formatSql(String.format("%s = {0}", column), params));
        }
        return this;
    }

}
