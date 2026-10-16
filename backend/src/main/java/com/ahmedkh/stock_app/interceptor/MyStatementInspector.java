package com.ahmedkh.stock_app.interceptor;

import org.hibernate.resource.jdbc.spi.StatementInspector;
import org.slf4j.MDC;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStatementInspector implements StatementInspector {

    private static final Pattern ALIAS_PATTERN = Pattern.compile("^\\s*select\\s+(?:distinct\\s+)?([\\w_$]+)\\.", Pattern.CASE_INSENSITIVE);

    @Override
    public String inspect(String sql) {
        if (sql == null || sql.isEmpty()) {
            return sql;
        }
        try {
            String lower = sql.toLowerCase();
            if (lower.startsWith("select")) {
                Matcher matcher = ALIAS_PATTERN.matcher(sql);
                if (!matcher.find()) {
                    return sql;
                }
                String entityName = matcher.group(1);
                if (entityName == null || entityName.isEmpty()) {
                    return sql;
                }
                String idEntreprise = MDC.get("idEntreprise");
                if (StringUtils.hasLength(idEntreprise) && idEntreprise.matches("\\d+")) {
                    String entityLower = entityName.toLowerCase();
                    if (!entityLower.contains("entreprise") && !entityLower.contains("roles")) {
                        if (lower.contains("where")) {
                            return sql + " and " + entityName + ".identreprise = " + idEntreprise;
                        } else {
                            return sql + " where " + entityName + ".identreprise = " + idEntreprise;
                        }
                    }
                }
            }
        } catch (Exception e) {
            // In case of unexpected parsing issues, return the original SQL unchanged
            return sql;
        }
        return sql;
    }
}