/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.util;

import com.alibaba.druid.DbType;

public interface JdbcConstants {
    DbType JTDS = DbType.jtds;

    String MOCK = "mock";

    DbType HSQL = DbType.hsql;

    DbType DB2 = DbType.db2;

    String DB2_DRIVER = "com.ibm.db2.jcc.DB2Driver"; // Type4
    String DB2_DRIVER2 = "COM.ibm.db2.jdbc.app.DB2Driver"; // Type2
    String DB2_DRIVER3 = "COM.ibm.db2.jdbc.net.DB2Driver"; // Type3

    DbType POSTGRESQL = DbType.postgresql;
    String POSTGRESQL_DRIVER = "org.postgresql.Driver";

    DbType SYBASE = DbType.sybase;

    DbType SQL_SERVER = DbType.sqlserver;
    String SQL_SERVER_DRIVER = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
    String SQL_SERVER_DRIVER_SQLJDBC4 = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String SQL_SERVER_DRIVER_JTDS = "net.sourceforge.jtds.jdbc.Driver";

    DbType ORACLE = DbType.oracle;
    String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
    String ORACLE_DRIVER2 = "oracle.jdbc.driver.OracleDriver";

    DbType ALI_ORACLE = DbType.ali_oracle;
    String ALI_ORACLE_DRIVER = "com.alibaba.jdbc.AlibabaDriver";

    DbType MYSQL = DbType.mysql;
    String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    String MYSQL_DRIVER_6 = "com.mysql.cj.jdbc.Driver";
    String MYSQL_DRIVER_603 = "com.mysql.cj.api.MysqlConnection";
    String MYSQL_DRIVER_REPLICATE = "com.mysql.jdbc.";

    String MARIADB = "mariadb";
    String MARIADB_DRIVER = "org.mariadb.jdbc.Driver";

    DbType TIDB = DbType.tidb;
    String TIDB_DRIVER = "io.tidb.bigdata.jdbc.TiDBDriver";

    DbType DERBY = DbType.derby;

    String HBASE = "hbase";

    DbType HIVE = DbType.hive;
    String HIVE_DRIVER = "org.apache.hive.jdbc.HiveDriver";

    DbType H2 = DbType.h2;
    String H2_DRIVER = "org.h2.Driver";

    DbType LEALONE = DbType.lealone;
    String LEALONE_DRIVER = "org.lealone.client.jdbc.JdbcDriver";

    DbType DM = DbType.dm;
    String DM_DRIVER = "dm.jdbc.driver.DmDriver";

    DbType KINGBASE = DbType.kingbase;
    String KINGBASE_DRIVER = "com.kingbase.Driver";
    String KINGBASE8_DRIVER = "com.kingbase8.Driver";

    DbType GBASE = DbType.gbase;
    String GBASE_DRIVER = "com.gbase.jdbc.Driver";

    DbType XUGU = DbType.xugu;
    String XUGU_DRIVER = "com.xugu.cloudjdbc.Driver";

    DbType OCEANBASE = DbType.oceanbase;
    DbType OCEANBASE_ORACLE = DbType.oceanbase_oracle;
    String OCEANBASE_DRIVER = "com.alipay.oceanbase.jdbc.Driver";
    String OCEANBASE_DRIVER2 = "com.oceanbase.jdbc.Driver";

    DbType INFORMIX = DbType.informix;

    /**
     * 阿里云odps
     */
    DbType ODPS = DbType.odps;
    String ODPS_DRIVER = "com.aliyun.odps.jdbc.OdpsDriver";

    String TERADATA = "teradata";
    String TERADATA_DRIVER = "com.teradata.jdbc.TeraDriver";

    /**
     * Log4JDBC
     */
    String LOG4JDBC = "log4jdbc";
    String LOG4JDBC_DRIVER = "net.sf.log4jdbc.DriverSpy";

    String PHOENIX = "phoenix";
    String PHOENIX_DRIVER = "org.apache.phoenix.jdbc.PhoenixDriver";
    DbType ENTERPRISEDB = DbType.edb;
    String ENTERPRISEDB_DRIVER = "com.edb.Driver";

    String KYLIN = "kylin";
    String KYLIN_DRIVER = "org.apache.kylin.jdbc.Driver";

    String SQLITE = "sqlite";
    String SQLITE_DRIVER = "org.sqlite.JDBC";

    String ALIYUN_ADS = "aliyun_ads";
    DbType ALIYUN_DRDS = DbType.drds;

    String PRESTO = "presto";
    String PRESTO_DRIVER = "com.facebook.presto.jdbc.PrestoDriver";

    String TRINO = "trino";
    String TRINO_DRIVER = "io.trino.jdbc.TrinoDriver";

    String ELASTIC_SEARCH = "elastic_search";

    String ELASTIC_SEARCH_DRIVER = "com.alibaba.xdriver.elastic.jdbc.ElasticDriver";

    DbType CLICKHOUSE = DbType.clickhouse;
    String CLICKHOUSE_DRIVER = "ru.yandex.clickhouse.ClickHouseDriver";

    String CLICKHOUSE_DRIVER_NEW = "com.clickhouse.jdbc.ClickHouseDriver";

    String KDB = "kdb";
    String KDB_DRIVER = "com.inspur.jdbc.KdDriver";

    /**
     * Alibaba Cloud PolarDB-Oracle 1.0
     */
    DbType POLARDB = DbType.polardb;
    String POLARDB_DRIVER = "com.aliyun.polardb.Driver";
    /**
     * Alibaba Cloud PolarDB-Oracle 2.0
     */
    DbType POLARDB2 = DbType.polardb2;
    String POLARDB2_DRIVER = "com.aliyun.polardb2.Driver";
    /**
     * GreenPlum
     */
    DbType GREENPLUM = DbType.greenplum;
    String GREENPLUM_DRIVER = "com.pivotal.jdbc.GreenplumDriver";

    /**
     * oscar
     */
    DbType OSCAR = DbType.oscar;
    String OSCAR_DRIVER = "com.oscar.Driver";

    DbType TYDB = DbType.tydb;
    String TYDB_DRIVER = "com.dbcp.jdbc.Driver";

    String TAOS_DATA = "com.taosdata.jdbc.TSDBDriver";
    String TAOS_DATA_RS = "com.taosdata.jdbc.rs.RestfulDriver";

    String GOLDENDB_DRIVER = "com.goldendb.jdbc.Driver";

    String GBASE8S_DRIVER = "com.gbasedbt.jdbc.Driver";

    String OPENGAUSS_DRIVER = "org.opengauss.Driver";
    String SUNDB = "sundb"; //科蓝数s据
    String SUNDB_DRIVER = "csii.sundb.jdbc.SundbDriver";

    String POLARDBX_DRIVER = "com.alibaba.polardbx.Driver";
}
