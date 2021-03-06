package org.wallet.common.entity.application;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;
import org.wallet.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * App
 * 
 * @author zengfucheng
 */
@Getter
@Setter
@Entity
@Table(name = "app_info", uniqueConstraints = @UniqueConstraint(name = "uk_app_name", columnNames = {"chainId", "typeId", "name"}))
public class AppInfoEntity extends BaseEntity {

    /**
     * 主链ID
     */
    @NotNull
    @Column(columnDefinition = "bigint(19) not null comment '主链ID'")
    private Long chainId;
    /**
     * 类型ID
     */
    @NotNull
    @Column(columnDefinition = "bigint(19) not null comment '类型ID'")
    private Long typeId;
    /**
     * 名称
     */
    @NotBlank
    @Column(columnDefinition = "varchar(20) not null comment '名称'")
    private String name;
    /**
     * 简介
     */
    @NotBlank
    @Column(columnDefinition = "varchar(100) not null comment '简介'")
    private String intro;
    /**
     * 图标
     */
    @NotBlank
    @Column(columnDefinition = "varchar(100) not null comment '图标'")
    private String icon;
    /**
     * url
     */
    @NotBlank
    @Column(columnDefinition = "varchar(100) not null comment 'url'")
    private String url;
	/**
	 * 排序
	 */
    @Column(columnDefinition = "int(4) not null default 0 comment '排序'")
	private Integer sort;
	/**
	 * 是否可用
	 */
    @Column(columnDefinition = "tinyint(1) not null default 1 comment '是否可用'")
	private Boolean enable;
    /**
     * 更新者
     */
    @Column(columnDefinition = "bigint(19) not null comment '更新者'")
    private Long updater;
    /**
     * 更新时间
     */
    @LastModifiedDate
    @Column(columnDefinition = "datetime not null default current_timestamp comment '更新时间'")
    private Date updateDate;

}