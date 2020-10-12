DROP TABLE `wb_weapp`;
DROP TABLE `wb_weapp_category`;
DROP TABLE `wb_weapp_resource`;

CREATE TABLE `wb_weapp` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`name` varchar(64) NOT NULL COMMENT '应用名',
`icon` varchar(255) NULL COMMENT '图标',
`category_id` int(11) UNSIGNED NOT NULL COMMENT '分类ID',
`description` varchar(255) NULL COMMENT '描述',
`global_config` varchar(255) NULL COMMENT 'weapp全局配置',
`enabled` tinyint(1) NOT NULL DEFAULT 1 COMMENT '0-disabled;1-enabled',
`create_time` datetime NOT NULL,
`creator_id` int(11) NOT NULL,
`update_time` datetime NOT NULL,
`updator_id` int(11) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `wb_weapp_category` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`name` varchar(64) NOT NULL COMMENT 'weapp种类名',
`description` varchar(255) NULL COMMENT '描述',
`enabled` tinyint(1) NOT NULL DEFAULT 1 COMMENT '0-disabled;1-enabled',
`create_time` datetime NOT NULL,
`creator_id` int(11) NOT NULL,
`update_time` datetime NOT NULL,
`updator_id` int(11) NOT NULL,
PRIMARY KEY (`id`) 
);
CREATE TABLE `wb_weapp_resource` (
`id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`weapp_id` int(11) UNSIGNED NOT NULL COMMENT '关联的WEAPP_ID',
`uri` varchar(255) NULL COMMENT 'weapp资源链接',
`title` varchar(64) NOT NULL COMMENT '作为版本区分的标题',
`explanation` varchar(255) NOT NULL COMMENT '必要的版本解释性说明',
`local_config` varchar(255) NULL COMMENT 'weapp局部配置',
`enabled` tinyint(1) NOT NULL DEFAULT 1 COMMENT '0-disabled;1-enabled',
`create_time` datetime NOT NULL,
`creator_id` int(11) NOT NULL,
`update_time` datetime NOT NULL,
`updator_id` int(11) NOT NULL,
PRIMARY KEY (`id`) 
);
