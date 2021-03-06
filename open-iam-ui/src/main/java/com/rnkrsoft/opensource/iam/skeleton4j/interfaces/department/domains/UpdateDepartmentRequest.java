package com.rnkrsoft.opensource.iam.skeleton4j.interfaces.department.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/7/8.
 */
@Data
public class UpdateDepartmentRequest implements Serializable{
    @ApidocElement(value = "部门编号", maxLen = 36, unique = true)
    Integer departmentId;
    @ApidocElement(value = "部门名称", maxLen = 36)
    String departmentName;
    @ApidocElement(value = "分支机构", maxLen = 36)
    Integer branchId;
}
